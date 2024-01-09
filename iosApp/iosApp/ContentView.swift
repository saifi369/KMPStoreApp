import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel : ViewModel

	var body: some View {
        Text(viewModel.text)
	}
}

extension ContentView {
    class ViewModel : ObservableObject{
        @Published var text = "Loading..."
        init(){
            Greeting().greet {greeing,error in
                DispatchQueue.main.async {
                    if let greeing = greeing{
                        self.text = greeing
                    }else {
                        self.text = error?.localizedDescription ?? "Error"
                    }
                }
            }
        }
    }
}

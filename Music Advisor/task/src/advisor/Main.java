package advisor;

import advisor.controller.PlaylistControllerImpl;
import advisor.repository.ImMemoryRepository;
import advisor.view.console.OutputView;

public class Main {
    public static void main(String[] args) {
        new PlaylistControllerImpl(new ImMemoryRepository(), new OutputView()).readConsoleInput();
    }
}

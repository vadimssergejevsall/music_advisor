package advisor.controller;

import advisor.repository.Repository;
import advisor.view.console.OutputView;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@Component
@RestController
@AllArgsConstructor
public class PlaylistControllerImpl {
    private final Repository repository;
    private final OutputView outputView;

    public void readConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] inputResult = input.split(" ");

            if (inputResult.length == 1 && input.equals("auth") && !isAuthenticated) {
                isAuthenticated = true;
                System.out.println("https://accounts.spotify.com/authorize?client_id=%s&" +
                        "redirect_uri=https://www.example.com&response_type=code");
                outputView.showAuthMessage();
            } else if (inputResult.length == 1 && input.equals("featured") && isAuthenticated) {
                outputView.showFeaturedPlaylist(repository.returnFeatured());
            } else if (inputResult.length == 1 && input.equals("new") && isAuthenticated) {
                outputView.showNewReleases(repository.returnNewReleases());
            } else if (inputResult.length == 1 && input.equals("categories") && isAuthenticated) {
                outputView.showAvailableCategories(repository.returnCategory());
            } else if (inputResult.length == 2 && inputResult[0].equals("playlists") && isAuthenticated) {
                outputView.showPlaylistsOfCategory(repository.returnPlaylists(), inputResult[1]);
            } else if (input.equals("exit")) {
                outputView.showExitMessage();
                break;
            } else if (!isAuthenticated) {
                System.out.println("Please, provide access for application.");
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}

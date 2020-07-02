package advisor.controller;

import advisor.repository.ImMemoryRepository;
import advisor.repository.Repository;
import advisor.repository.groups.Categories;
import advisor.repository.groups.NewReleases;
import advisor.repository.groups.Playlists;
import advisor.view.console.OutputView;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@AllArgsConstructor
public class PlaylistControllerImpl implements PlaylistController {
    private final Repository repository;
    private final OutputView outputView;

    @Override
    public void readConsoleInput() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] inputResult = input.split(" ");

            if (inputResult.length == 1 && input.equals("featured")) {
                outputView.showFeaturedPlaylist(repository.returnFeatured());
            } else if (inputResult.length == 1 && input.equals("new")) {
                outputView.showNewReleases(repository.returnNewReleases());
            } else if (inputResult.length == 1 && input.equals("categories")) {
                outputView.showAvailableCategories(repository.returnCategory());
            } else if (inputResult.length == 2 && inputResult[0].equals("playlists")) {
                outputView.showPlaylistsOfCategory(repository.returnPlaylists(), inputResult[1]);
            } else if (input.equals("exit")) {
                outputView.showExitMessage();
                break;
            } else {
                System.out.println("Input error");
            }
        }
    }
}

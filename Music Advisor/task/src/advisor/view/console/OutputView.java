package advisor.view.console;

import java.util.List;

public class OutputView {
    public void showFeaturedPlaylist(List<String> featured) {
        System.out.println("---FEATURED---");
        featured.forEach(System.out::println);
    }

    public void showNewReleases(List<String> newReleases) {
        System.out.println("---NEW RELEASES---");
        newReleases.forEach(System.out::println);
    }

    public void showAuthMessage() {
        System.out.println("---SUCCESS---");
    }

    public void showAvailableCategories(List<String> availableCategories) {
        System.out.println("---CATEGORIES---");
        availableCategories.forEach(System.out::println);
    }

    public void showPlaylistsOfCategory(List<String> playlistsOfCategory, String genre) {
        System.out.println(String.format("---%s PLAYLISTS---", genre.toUpperCase()));
        playlistsOfCategory.forEach(System.out::println);
    }

    public void showExitMessage() {
        System.out.println("---GOODBYE!---");
    }
}

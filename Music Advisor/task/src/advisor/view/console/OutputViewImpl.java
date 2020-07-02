package advisor.view.console;

import java.util.List;

public class OutputViewImpl implements OutputView{
    @Override
    public void showFeaturedPlaylist(List<String> featured) {
        System.out.println("---FEATURED---");
        featured.forEach(System.out::println);
    }

    @Override
    public void showNewReleases(List<String> newReleases) {
        System.out.println("---NEW RELEASES---");
        newReleases.forEach(System.out::println);
    }

    @Override
    public void showAvailableCategories(List<String> availableCategories) {
        System.out.println("---CATEGORIES---");
        availableCategories.forEach(System.out::println);
    }

    @Override
    public void showPlaylistsOfCategory(List<String> playlistsOfCategory, String genre) {
        System.out.println(String.format("---%s PLAYLISTS---", genre.toUpperCase()));
        playlistsOfCategory.forEach(System.out::println);
    }

    @Override
    public void showExitMessage() {
        System.out.println("---GOODBYE!---");
    }
}

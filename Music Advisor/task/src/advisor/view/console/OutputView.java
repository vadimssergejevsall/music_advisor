package advisor.view.console;

import java.util.List;

public interface OutputView {
    void showFeaturedPlaylist(List<String> featured);
    void showNewReleases(List<String> newReleases);
    void showAvailableCategories(List<String> availableCategories);
    void showPlaylistsOfCategory(List<String> playlistsOfCategory, String genre);
    void showExitMessage();
}

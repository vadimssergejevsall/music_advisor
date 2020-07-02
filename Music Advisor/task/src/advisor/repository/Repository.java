package advisor.repository;

import java.util.List;

public interface Repository {
    List<String> returnCategory();
    List<String> returnFeatured();
    List<String> returnNewReleases();
    List<String> returnPlaylists();
}

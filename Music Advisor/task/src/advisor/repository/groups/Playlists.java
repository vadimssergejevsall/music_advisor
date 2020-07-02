package advisor.repository.groups;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Playlists {
    List<String> playlists = new LinkedList<>();

    public Playlists() {
        playlists.add("Walk Like A Badass");
        playlists.add("Rage Beats");
        playlists.add("Arab Mood Booster");
        playlists.add("Sunday Stroll");
    }
}

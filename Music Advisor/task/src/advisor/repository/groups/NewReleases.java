package advisor.repository.groups;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class NewReleases {
    List<String> newReleases = new LinkedList<>();

    public NewReleases() {
        newReleases.add("Mountains [Sia, Diplo, Labrinth]");
        newReleases.add("Runaway [Lil Peep]");
        newReleases.add("The Greatest Show [Panic! At The Disco]");
        newReleases.add("All Out Life [Slipknot]");
    }
}

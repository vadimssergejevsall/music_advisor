package advisor.repository;

import java.util.LinkedList;
import java.util.List;

public class ImMemoryRepository implements Repository {
    private final List<String> categories = new LinkedList<>();
    private final List<String> featured = new LinkedList<>();
    private final List<String> newReleases = new LinkedList<>();
    private final List<String> playlists = new LinkedList<>();

    public ImMemoryRepository() {
        categories.add("Top Lists");
        categories.add("Pop");
        categories.add("Mood");
        categories.add("Latin");

        featured.add("Mellow Morning");
        featured.add("Wake Up and Smell the Coffee");
        featured.add("Monday Motivation");
        featured.add("Songs to Sing in the Shower");

        newReleases.add("Mountains [Sia, Diplo, Labrinth]");
        newReleases.add("Runaway [Lil Peep]");
        newReleases.add("The Greatest Show [Panic! At The Disco]");
        newReleases.add("All Out Life [Slipknot]");

        playlists.add("Walk Like A Badass");
        playlists.add("Rage Beats");
        playlists.add("Arab Mood Booster");
        playlists.add("Sunday Stroll");
    }

    @Override
    public List<String> returnCategory() {
        return categories;
    }

    @Override
    public List<String> returnFeatured() {
        return featured;
    }

    @Override
    public List<String> returnNewReleases() {
        return newReleases;
    }

    @Override
    public List<String> returnPlaylists() {
        return playlists;
    }
}
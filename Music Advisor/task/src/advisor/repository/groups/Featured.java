package advisor.repository.groups;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Featured {
    List<String> featured = new LinkedList<>();

    public Featured() {
        featured.add("Mellow Morning");
        featured.add("Wake Up and Smell the Coffee");
        featured.add("Monday Motivation");
        featured.add("Songs to Sing in the Shower");
    }
}

package advisor.repository.groups;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Categories {
    List<String> categories = new LinkedList<>();

    public Categories() {
        categories.add("Top Lists");
        categories.add("Pop");
        categories.add("Mood");
        categories.add("Latin");
    }
}

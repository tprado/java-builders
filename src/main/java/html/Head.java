package html;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Head {

    private final List<Link> links = new ArrayList<>();

    public Head(List<Link> links) {
        this.links.addAll(links);
    }

    @Override
    public String toString() {
        return "<head>" + links.stream().map(Link::toString).collect(joining()) + "</head>";
    }

}

package html.builders.traditional;

import html.Head;
import html.Link;

import java.util.ArrayList;
import java.util.List;

public class HeadBuilder {

    private final List<Link> links = new ArrayList<>();

    public HeadBuilder link(Link link) {
        links.add(link);
        return this;
    }

    public Head build() {
        return new Head(links);
    }
}

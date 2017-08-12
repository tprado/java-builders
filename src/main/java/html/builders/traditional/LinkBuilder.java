package html.builders.traditional;

import html.Link;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(fluent = true)
public class LinkBuilder {

    private String rel;
    private String href;

    public Link build() {
        return new Link(rel, href);
    }
}

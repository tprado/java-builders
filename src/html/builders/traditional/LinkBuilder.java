package html.builders.traditional;

import html.Link;

public class LinkBuilder {
    private String rel;
    private String href;

    public LinkBuilder rel(String rel) {
        this.rel = rel;
        return this;
    }

    public LinkBuilder href(String href) {
        this.href = href;
        return this;
    }

    public Link build() {
        return new Link(rel, href);
    }
}

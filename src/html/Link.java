package html;

public class Link {
    private final String rel;
    private final String href;

    public Link(String rel, String href) {
        this.rel = rel;
        this.href = href;
    }

    @Override
    public String toString() {
        return "<link rel=\"" + rel + "\" href=\"" + href + "\"></link>";
    }
}

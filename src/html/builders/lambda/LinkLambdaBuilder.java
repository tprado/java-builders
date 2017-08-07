package html.builders.lambda;

import html.Link;

import java.util.function.Consumer;

public class LinkLambdaBuilder {

    private String rel;
    private String href;

    public LinkLambdaBuilder rel(String rel) {
        this.rel = rel;
        return this;
    }

    public LinkLambdaBuilder href(String href) {
        this.href = href;
        return this;
    }

    private Link build() {
        return new Link(rel, href);
    }

    static Link link(Consumer<LinkLambdaBuilder> callback) {
        LinkLambdaBuilder builder = new LinkLambdaBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

package html.builders.fluent;

import html.Link;

import java.util.function.Consumer;

public class LinkFluentBuilder<C> extends BaseFluentBuilder<C, Link> {

    private String rel;
    private String href;

    LinkFluentBuilder(C context, Consumer<Link> callback) {
        super(context, callback);
    }

    public LinkFluentBuilder<C> rel(String rel) {
        this.rel = rel;
        return this;
    }

    public LinkFluentBuilder<C> href(String href) {
        this.href = href;
        return this;
    }

    @Override
    Link build() {
        return new Link(rel, href);
    }
}

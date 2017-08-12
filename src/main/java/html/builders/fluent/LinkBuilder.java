package html.builders.fluent;

import html.Link;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

@Setter
@Accessors(fluent = true)
public class LinkBuilder<C> extends BaseBuilder<C, Link> {

    private String rel;
    private String href;

    LinkBuilder(C context, Consumer<Link> callback) {
        super(context, callback);
    }

    @Override
    Link build() {
        return new Link(rel, href);
    }
}

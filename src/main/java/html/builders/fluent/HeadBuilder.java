package html.builders.fluent;

import html.Head;
import html.Link;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HeadBuilder<C> extends BaseBuilder<C, Head> {

    private final List<Link> links = new ArrayList<>();

    HeadBuilder(C context, Consumer<Head> callback) {
        super(context, callback);
    }

    public LinkBuilder<HeadBuilder<C>> link() {
        return new LinkBuilder<>(this, links::add);
    }

    @Override
    Head build() {
        return new Head(links);
    }
}

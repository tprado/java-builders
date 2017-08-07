package html.builders.fluent;

import html.Head;
import html.Link;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HeadFluentBuilder<C> {

    private final C context;
    private final Consumer<Head> callback;

    private final List<Link> links = new ArrayList<>();

    HeadFluentBuilder(C context, Consumer<Head> callback) {
        this.context = context;
        this.callback = callback;
    }

    public LinkFluentBuilder<HeadFluentBuilder<C>> link() {
        return new LinkFluentBuilder<>(this, links::add);
    }

    public C $() {
        callback.accept(new Head(links));
        return context;
    }
}

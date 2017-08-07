package html.builders.lambda;

import html.Head;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class HeadLambdaBuilder {

    private final List<Consumer<LinkLambdaBuilder>> links = new ArrayList<>();

    public HeadLambdaBuilder link(Consumer<LinkLambdaBuilder> link) {
        this.links.add(link);
        return this;
    }

    private Head build() {
        return new Head(links.stream().map(LinkLambdaBuilder::link).collect(toList()));
    }

    static Head head(Consumer<HeadLambdaBuilder> callback) {
        HeadLambdaBuilder builder = new HeadLambdaBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

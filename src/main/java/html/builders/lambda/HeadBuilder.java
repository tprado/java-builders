package html.builders.lambda;

import html.Head;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HeadBuilder {

    private final List<Consumer<LinkBuilder>> links = new ArrayList<>();

    public HeadBuilder link(Consumer<LinkBuilder> link) {
        this.links.add(link);
        return this;
    }

    private Head build() {
        return new Head(links.stream().map(LinkBuilder::link).collect(toList()));
    }

    static Head head(Consumer<HeadBuilder> callback) {
        HeadBuilder builder = new HeadBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

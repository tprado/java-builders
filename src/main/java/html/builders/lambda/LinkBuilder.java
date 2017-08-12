package html.builders.lambda;

import html.Link;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Accessors(fluent = true)
public class LinkBuilder {

    private String rel;
    private String href;

    private Link build() {
        return new Link(rel, href);
    }

    static Link link(Consumer<LinkBuilder> callback) {
        LinkBuilder builder = new LinkBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

package html.builders.lambda;

import html.Body;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BodyBuilder {

    private final List<Consumer<ParagraphBuilder>> paragraphs = new ArrayList<>();

    public BodyBuilder p(Consumer<ParagraphBuilder> paragraph) {
        paragraphs.add(paragraph);
        return this;
    }

    private Body build() {
        return new Body(paragraphs.stream().map(ParagraphBuilder::p).collect(toList()));
    }

    static Body body(Consumer<BodyBuilder> callback) {
        BodyBuilder builder = new BodyBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

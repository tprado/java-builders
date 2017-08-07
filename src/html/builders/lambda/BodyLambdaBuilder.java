package html.builders.lambda;

import html.Body;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class BodyLambdaBuilder {

    private final List<Consumer<ParagraphLambdaBuilder>> paragraphs = new ArrayList<>();

    public BodyLambdaBuilder p(Consumer<ParagraphLambdaBuilder> paragraph) {
        paragraphs.add(paragraph);
        return this;
    }

    private Body build() {
        return new Body(paragraphs.stream().map(ParagraphLambdaBuilder::p).collect(toList()));
    }

    static Body body(Consumer<BodyLambdaBuilder> callback) {
        BodyLambdaBuilder builder = new BodyLambdaBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

package html.builders.lambda;

import html.Html;

import java.util.function.Consumer;

public class HtmlLambdaBuilder {

    private Consumer<HeadLambdaBuilder> head = ignored -> {};
    private Consumer<BodyLambdaBuilder> body = ignored -> {};

    public HtmlLambdaBuilder head(Consumer<HeadLambdaBuilder> head) {
        this.head = head;
        return this;
    }

    public HtmlLambdaBuilder body(Consumer<BodyLambdaBuilder> body) {
        this.body = body;
        return this;
    }

    private Html build() {
        return new Html(HeadLambdaBuilder.head(head), BodyLambdaBuilder.body(body));
    }

    public static Html html(Consumer<HtmlLambdaBuilder> callback) {
        HtmlLambdaBuilder builder = new HtmlLambdaBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

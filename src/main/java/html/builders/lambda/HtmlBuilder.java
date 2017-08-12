package html.builders.lambda;

import html.Html;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Accessors(fluent = true)
public class HtmlBuilder {

    private Consumer<HeadBuilder> head = ignored -> {};
    private Consumer<BodyBuilder> body = ignored -> {};

    private Html build() {
        return new Html(HeadBuilder.head(head), BodyBuilder.body(body));
    }

    public static Html html(Consumer<HtmlBuilder> callback) {
        HtmlBuilder builder = new HtmlBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

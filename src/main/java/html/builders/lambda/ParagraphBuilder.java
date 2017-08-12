package html.builders.lambda;

import html.Paragraph;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Setter
@Accessors(fluent = true)
public class ParagraphBuilder {

    private String text;

    private Paragraph build() {
        return new Paragraph(text);
    }

    static Paragraph p(Consumer<ParagraphBuilder> callback) {
        ParagraphBuilder builder = new ParagraphBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

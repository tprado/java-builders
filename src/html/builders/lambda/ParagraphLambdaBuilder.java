package html.builders.lambda;

import html.Paragraph;

import java.util.function.Consumer;

public class ParagraphLambdaBuilder {

    private String text;

    public ParagraphLambdaBuilder text(String text) {
        this.text = text;
        return this;
    }

    private Paragraph build() {
        return new Paragraph(text);
    }

    static Paragraph p(Consumer<ParagraphLambdaBuilder> callback) {
        ParagraphLambdaBuilder builder = new ParagraphLambdaBuilder();
        callback.accept(builder);
        return builder.build();
    }
}

package html.builders.fluent;

import html.Paragraph;

import java.util.function.Consumer;

public class ParagraphFluentBuilder<C> extends BaseFluentBuilder<C, Paragraph> {

    private String text = "";

    ParagraphFluentBuilder(C context, Consumer<Paragraph> callback) {
        super(context, callback);
    }

    public ParagraphFluentBuilder<C> text(String text) {
        this.text = text;
        return this;
    }

    @Override
    Paragraph build() {
        return new Paragraph(text);
    }
}

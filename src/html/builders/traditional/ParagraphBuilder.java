package html.builders.traditional;

import html.Paragraph;

public class ParagraphBuilder {

    private String text;

    public ParagraphBuilder text(String text) {
        this.text = text;
        return this;
    }

    public Paragraph build() {
        return new Paragraph(text);
    }
}

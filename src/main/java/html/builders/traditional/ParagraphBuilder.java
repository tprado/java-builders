package html.builders.traditional;

import html.Paragraph;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(fluent = true)
public class ParagraphBuilder {

    private String text;

    public Paragraph build() {
        return new Paragraph(text);
    }
}

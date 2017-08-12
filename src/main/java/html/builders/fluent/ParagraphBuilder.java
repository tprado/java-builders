package html.builders.fluent;

import html.Paragraph;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

@Setter
@Accessors(fluent = true)
public class ParagraphBuilder<C> extends BaseBuilder<C, Paragraph> {

    private String text = "";

    ParagraphBuilder(C context, Consumer<Paragraph> callback) {
        super(context, callback);
    }

    @Override
    Paragraph build() {
        return new Paragraph(text);
    }
}

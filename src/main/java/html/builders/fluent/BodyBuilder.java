package html.builders.fluent;

import html.Body;
import html.Paragraph;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BodyBuilder<C> extends BaseBuilder<C, Body> {

    private final List<Paragraph> paragraphs = new ArrayList<>();

    BodyBuilder(C context, Consumer<Body> callback) {
        super(context, callback);
    }

    public ParagraphBuilder<BodyBuilder<C>> p() {
        return new ParagraphBuilder<>(this, paragraphs::add);
    }

    @Override
    Body build() {
        return new Body(paragraphs);
    }
}

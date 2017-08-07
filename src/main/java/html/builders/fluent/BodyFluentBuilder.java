package html.builders.fluent;

import html.Body;
import html.Paragraph;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BodyFluentBuilder<C> extends BaseFluentBuilder<C, Body> {

    private final List<Paragraph> paragraphs = new ArrayList<>();

    BodyFluentBuilder(C context, Consumer<Body> callback) {
        super(context, callback);
    }

    public ParagraphFluentBuilder<BodyFluentBuilder<C>> p() {
        return new ParagraphFluentBuilder<>(this, paragraphs::add);
    }

    @Override
    Body build() {
        return new Body(paragraphs);
    }
}

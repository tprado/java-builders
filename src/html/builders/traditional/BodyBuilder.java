package html.builders.traditional;

import html.Body;
import html.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class BodyBuilder {

    private final List<Paragraph> paragraphs = new ArrayList<>();

    public BodyBuilder p(Paragraph paragraph) {
        paragraphs.add(paragraph);
        return this;
    }

    public Body build() {
        return new Body(paragraphs);
    }
}

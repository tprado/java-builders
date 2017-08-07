package html;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Body {

    private final List<Paragraph> paragraphs = new ArrayList<>();

    public Body(List<Paragraph> paragraphs) {
        this.paragraphs.addAll(paragraphs);
    }

    @Override
    public String toString() {
        return "<body>" + paragraphs.stream().map(Paragraph::toString).collect(joining()) + "</body>";
    }

}

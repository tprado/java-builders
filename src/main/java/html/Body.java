package html;

import lombok.Value;

import java.util.List;

import static java.util.Collections.unmodifiableList;

@Value
public class Body {

    List<Paragraph> paragraphs;

    public Body(List<Paragraph> paragraphs) {
        this.paragraphs = unmodifiableList(paragraphs);
    }

}

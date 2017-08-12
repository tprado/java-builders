package html.builders.traditional;

import html.Body;
import html.Head;
import html.Html;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(fluent = true)
public class HtmlBuilder {

    private Head head;
    private Body body;

    public Html build() {
        return new Html(head, body);
    }
}

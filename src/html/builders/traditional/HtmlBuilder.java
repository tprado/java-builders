package html.builders.traditional;

import html.Body;
import html.Head;
import html.Html;

public class HtmlBuilder {

    private Head head;
    private Body body;

    public HtmlBuilder head(Head head) {
        this.head = head;
        return this;
    }

    public HtmlBuilder body(Body body) {
        this.body = body;
        return this;
    }

    public Html build() {
        return new Html(head, body);
    }
}

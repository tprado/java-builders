package html.builders.fluent;

import html.Body;
import html.Head;
import html.Html;

public class HtmlBuilder {

    private Head head;
    private Body body;

    public HeadBuilder<HtmlBuilder> head() {
        return new HeadBuilder<>(this, head -> this.head = head);
    }

    public BodyBuilder<HtmlBuilder> body() {
        return new BodyBuilder<>(this, body -> this.body = body);
    }

    public Html $() {
        return new Html(head, body);
    }

    public static HtmlBuilder html() {
        return new HtmlBuilder();
    }

}

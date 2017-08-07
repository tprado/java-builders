package html.builders.fluent;

import html.Body;
import html.Head;
import html.Html;

public class HtmlFluentBuilder {

    private Head head;
    private Body body;

    public HeadFluentBuilder<HtmlFluentBuilder> head() {
        return new HeadFluentBuilder<>(this, head -> this.head = head);
    }

    public BodyFluentBuilder<HtmlFluentBuilder> body() {
        return new BodyFluentBuilder<>(this, body -> this.body = body);
    }

    public Html $() {
        return new Html(head, body);
    }

    public static HtmlFluentBuilder html() {
        return new HtmlFluentBuilder();
    }

}

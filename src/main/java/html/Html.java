package html;

public class Html {

    private final Head head;
    private final Body body;

    public Html(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String toString() {
        return "<html>" + head + body + "</html>";
    }

}

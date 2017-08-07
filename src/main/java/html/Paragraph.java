package html;

public class Paragraph {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "<p>" + text + "</p>";
    }
}

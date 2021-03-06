import html.Html;
import html.builders.fluent.HtmlFluentBuilder;
import html.builders.lambda.HtmlLambdaBuilder;
import html.builders.traditional.*;

public class Main {
    public static void main(String[] args) {

        Html doc1 = new HtmlBuilder()
            .head(
                new HeadBuilder()
                    .link(new LinkBuilder().rel("stylesheet").href("/css/main.css").build())
                    .link(new LinkBuilder().rel("script").href("/js/main.js").build())
                    .build()
            )
            .body(
                new BodyBuilder()
                    .p(new ParagraphBuilder().text("some text").build())
                    .p(new ParagraphBuilder().text("some more text").build())
                    .build()
            )
            .build();

        System.out.println(doc1);

        Html doc2 = HtmlLambdaBuilder.html(html -> html
            .head(head -> head
                .link(link -> link
                    .rel("stylesheet").href("/css/main.css")
                )
                .link(link -> link
                    .rel("script").href("/js/main.js")
                )
            )
            .body(body -> body
                .p(p -> p.text("some text"))
                .p(p -> p.text("some more text"))
            )
        );

        System.out.println(doc2);

        Html doc3 = HtmlFluentBuilder
            .html()
                .head()
                    .link()
                        .rel("stylesheet").href("/css/main.css")
                    .$()
                    .link()
                        .rel("script").href("/js/main.js")
                    .$()
                .$()
                .body()
                    .p()
                        .text("some text")
                    .$()
                    .p()
                        .text("some more text")
                    .$()
                .$()
            .$();

        System.out.println(doc3);
    }
}

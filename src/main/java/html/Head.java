package html;

import lombok.Value;

import java.util.List;

import static java.util.Collections.unmodifiableList;

@Value
public class Head {

    List<Link> links;

    public Head(List<Link> links) {
        this.links = unmodifiableList(links);
    }
}

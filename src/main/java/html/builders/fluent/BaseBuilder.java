package html.builders.fluent;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public abstract class BaseBuilder<C, T> {

    private final C context;
    private final Consumer<T> callback;

    public C $() {
        callback.accept(build());
        return context;
    }

    abstract T build();

}

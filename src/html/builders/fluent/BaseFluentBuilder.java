package html.builders.fluent;

import java.util.function.Consumer;

public abstract class BaseFluentBuilder<C, T> {

    private final C context;
    private final Consumer<T> callback;

    BaseFluentBuilder(C context, Consumer<T> callback) {
        this.context = context;
        this.callback = callback;
    }

    public C $() {
        callback.accept(build());
        return context;
    }

    abstract T build();

}

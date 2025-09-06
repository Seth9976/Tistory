package md;

import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

public abstract class d extends c {
    @NotNull
    public static Lazy lazyOf(Object object0) {
        return new InitializedLazyImpl(object0);
    }
}


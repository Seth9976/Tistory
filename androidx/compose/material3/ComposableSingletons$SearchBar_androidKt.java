package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.SearchBar_androidKt {
    @NotNull
    public static final ComposableSingletons.SearchBar_androidKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.SearchBar_androidKt.INSTANCE = new ComposableSingletons.SearchBar_androidKt();
        ComposableSingletons.SearchBar_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x986A05B, false, n4.W);
        ComposableSingletons.SearchBar_androidKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(-480309201, false, n4.X);
    }

    @NotNull
    public final Function2 getLambda-1$material3_release() {
        return ComposableSingletons.SearchBar_androidKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$material3_release() {
        return ComposableSingletons.SearchBar_androidKt.lambda-2;
    }
}


package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.SnackbarHostKt {
    @NotNull
    public static final ComposableSingletons.SnackbarHostKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;

    static {
        ComposableSingletons.SnackbarHostKt.INSTANCE = new ComposableSingletons.SnackbarHostKt();
        ComposableSingletons.SnackbarHostKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x30CCECFF, false, o4.G);
    }

    @NotNull
    public final Function3 getLambda-1$material3_release() {
        return ComposableSingletons.SnackbarHostKt.lambda-1;
    }
}


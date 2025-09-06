package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.SnackbarKt {
    @NotNull
    public static final ComposableSingletons.SnackbarKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.SnackbarKt.INSTANCE = new ComposableSingletons.SnackbarKt();
        ComposableSingletons.SnackbarKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-505750804, false, t4.w);
    }

    @NotNull
    public final Function2 getLambda-1$material3_release() {
        return ComposableSingletons.SnackbarKt.lambda-1;
    }
}


package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import y0.d;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.RecomposerKt {
    @NotNull
    public static final ComposableSingletons.RecomposerKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.RecomposerKt.INSTANCE = new ComposableSingletons.RecomposerKt();
        ComposableSingletons.RecomposerKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, d.z);
    }

    @NotNull
    public final Function2 getLambda-1$runtime_release() {
        return ComposableSingletons.RecomposerKt.lambda-1;
    }
}


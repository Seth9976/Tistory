package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import y0.d;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.CompositionKt {
    @NotNull
    public static final ComposableSingletons.CompositionKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.CompositionKt.INSTANCE = new ComposableSingletons.CompositionKt();
        ComposableSingletons.CompositionKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x38EA4DBA, false, d.x);
        ComposableSingletons.CompositionKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, d.y);
    }

    @NotNull
    public final Function2 getLambda-1$runtime_release() {
        return ComposableSingletons.CompositionKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$runtime_release() {
        return ComposableSingletons.CompositionKt.lambda-2;
    }
}


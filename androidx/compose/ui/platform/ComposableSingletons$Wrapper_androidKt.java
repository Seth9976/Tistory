package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.Wrapper_androidKt {
    @NotNull
    public static final ComposableSingletons.Wrapper_androidKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.Wrapper_androidKt.INSTANCE = new ComposableSingletons.Wrapper_androidKt();
        ComposableSingletons.Wrapper_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-1759434350, false, a0.y);
    }

    @NotNull
    public final Function2 getLambda-1$ui_release() {
        return ComposableSingletons.Wrapper_androidKt.lambda-1;
    }
}


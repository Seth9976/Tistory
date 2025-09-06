package androidx.compose.ui.window;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import v2.m;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.AndroidDialog_androidKt {
    @NotNull
    public static final ComposableSingletons.AndroidDialog_androidKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.AndroidDialog_androidKt.INSTANCE = new ComposableSingletons.AndroidDialog_androidKt();
        ComposableSingletons.AndroidDialog_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xC869E20, false, m.x);
    }

    @NotNull
    public final Function2 getLambda-1$ui_release() {
        return ComposableSingletons.AndroidDialog_androidKt.lambda-1;
    }
}


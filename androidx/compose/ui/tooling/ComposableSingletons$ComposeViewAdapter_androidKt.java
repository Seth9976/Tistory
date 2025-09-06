package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import o2.a;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.ComposeViewAdapter_androidKt {
    @NotNull
    public static final ComposableSingletons.ComposeViewAdapter_androidKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;
    @NotNull
    public static Function2 lambda-3;

    static {
        ComposableSingletons.ComposeViewAdapter_androidKt.INSTANCE = new ComposableSingletons.ComposeViewAdapter_androidKt();
        ComposableSingletons.ComposeViewAdapter_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xBAAB0D26, false, a.x);
        ComposableSingletons.ComposeViewAdapter_androidKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(2086912010, false, a.y);
        ComposableSingletons.ComposeViewAdapter_androidKt.lambda-3 = ComposableLambdaKt.composableLambdaInstance(0x115720BC, false, a.z);
    }

    @NotNull
    public final Function2 getLambda-1$ui_tooling_release() {
        return ComposableSingletons.ComposeViewAdapter_androidKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$ui_tooling_release() {
        return ComposableSingletons.ComposeViewAdapter_androidKt.lambda-2;
    }

    @NotNull
    public final Function2 getLambda-3$ui_tooling_release() {
        return ComposableSingletons.ComposeViewAdapter_androidKt.lambda-3;
    }
}


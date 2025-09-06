package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import z1.h;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.SubcomposeLayoutKt {
    @NotNull
    public static final ComposableSingletons.SubcomposeLayoutKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.SubcomposeLayoutKt.INSTANCE = new ComposableSingletons.SubcomposeLayoutKt();
        ComposableSingletons.SubcomposeLayoutKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x983222DA, false, h.x);
    }

    @NotNull
    public final Function2 getLambda-1$ui_release() {
        return ComposableSingletons.SubcomposeLayoutKt.lambda-1;
    }
}


package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.ScaffoldKt {
    @NotNull
    public static final ComposableSingletons.ScaffoldKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;
    @NotNull
    public static Function2 lambda-3;
    @NotNull
    public static Function2 lambda-4;

    static {
        ComposableSingletons.ScaffoldKt.INSTANCE = new ComposableSingletons.ScaffoldKt();
        ComposableSingletons.ScaffoldKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x5A95C31B, false, n4.S);
        ComposableSingletons.ScaffoldKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(836907051, false, n4.T);
        ComposableSingletons.ScaffoldKt.lambda-3 = ComposableLambdaKt.composableLambdaInstance(0xEE40E76A, false, n4.U);
        ComposableSingletons.ScaffoldKt.lambda-4 = ComposableLambdaKt.composableLambdaInstance(0x5C247E0B, false, n4.V);
    }

    @NotNull
    public final Function2 getLambda-1$material3_release() {
        return ComposableSingletons.ScaffoldKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$material3_release() {
        return ComposableSingletons.ScaffoldKt.lambda-2;
    }

    @NotNull
    public final Function2 getLambda-3$material3_release() {
        return ComposableSingletons.ScaffoldKt.lambda-3;
    }

    @NotNull
    public final Function2 getLambda-4$material3_release() {
        return ComposableSingletons.ScaffoldKt.lambda-4;
    }
}


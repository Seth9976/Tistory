package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p0.q2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.TabRowKt {
    @NotNull
    public static final ComposableSingletons.TabRowKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.TabRowKt.INSTANCE = new ComposableSingletons.TabRowKt();
        ComposableSingletons.TabRowKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xADBF494, false, q2.D);
        ComposableSingletons.TabRowKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, q2.E);
    }

    @NotNull
    public final Function2 getLambda-1$material_release() {
        return ComposableSingletons.TabRowKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$material_release() {
        return ComposableSingletons.TabRowKt.lambda-2;
    }
}


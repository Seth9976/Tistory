package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import p0.p2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.AppBarKt {
    @NotNull
    public static final ComposableSingletons.AppBarKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.AppBarKt.INSTANCE = new ComposableSingletons.AppBarKt();
        ComposableSingletons.AppBarKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xDA1027FC, false, p2.x);
        ComposableSingletons.AppBarKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xD1FD28AE, false, p2.y);
    }

    @NotNull
    public final Function3 getLambda-1$material_release() {
        return ComposableSingletons.AppBarKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$material_release() {
        return ComposableSingletons.AppBarKt.lambda-2;
    }
}


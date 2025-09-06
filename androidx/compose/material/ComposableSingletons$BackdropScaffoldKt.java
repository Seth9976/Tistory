package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import p0.p2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.BackdropScaffoldKt {
    @NotNull
    public static final ComposableSingletons.BackdropScaffoldKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;

    static {
        ComposableSingletons.BackdropScaffoldKt.INSTANCE = new ComposableSingletons.BackdropScaffoldKt();
        ComposableSingletons.BackdropScaffoldKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xDAD0F74, false, p2.z);
    }

    @NotNull
    public final Function3 getLambda-1$material_release() {
        return ComposableSingletons.BackdropScaffoldKt.lambda-1;
    }
}


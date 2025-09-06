package androidx.compose.material;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import p0.p2;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.BottomSheetScaffoldKt {
    @NotNull
    public static final ComposableSingletons.BottomSheetScaffoldKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.BottomSheetScaffoldKt.INSTANCE = new ComposableSingletons.BottomSheetScaffoldKt();
        ComposableSingletons.BottomSheetScaffoldKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(239945703, false, p2.A);
        ComposableSingletons.BottomSheetScaffoldKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0x355D064C, false, p2.B);
    }

    @NotNull
    public final Function3 getLambda-1$material_release() {
        return ComposableSingletons.BottomSheetScaffoldKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$material_release() {
        return ComposableSingletons.BottomSheetScaffoldKt.lambda-2;
    }
}


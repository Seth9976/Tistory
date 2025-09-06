package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.BottomSheetScaffoldKt {
    @NotNull
    public static final ComposableSingletons.BottomSheetScaffoldKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function3 lambda-2;
    @NotNull
    public static Function2 lambda-3;

    static {
        ComposableSingletons.BottomSheetScaffoldKt.INSTANCE = new ComposableSingletons.BottomSheetScaffoldKt();
        ComposableSingletons.BottomSheetScaffoldKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-927355320, false, n4.H);
        ComposableSingletons.BottomSheetScaffoldKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0x370C8B02, false, o4.F);
        ComposableSingletons.BottomSheetScaffoldKt.lambda-3 = ComposableLambdaKt.composableLambdaInstance(1800698411, false, n4.I);
    }

    @NotNull
    public final Function2 getLambda-1$material3_release() {
        return ComposableSingletons.BottomSheetScaffoldKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$material3_release() {
        return ComposableSingletons.BottomSheetScaffoldKt.lambda-2;
    }

    @NotNull
    public final Function2 getLambda-3$material3_release() {
        return ComposableSingletons.BottomSheetScaffoldKt.lambda-3;
    }
}


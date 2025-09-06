package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.ModalBottomSheetKt {
    @NotNull
    public static final ComposableSingletons.ModalBottomSheetKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.ModalBottomSheetKt.INSTANCE = new ComposableSingletons.ModalBottomSheetKt();
        ComposableSingletons.ModalBottomSheetKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xA51D72EF, false, n4.O);
        ComposableSingletons.ModalBottomSheetKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0x7B31DAF7, false, n4.P);
    }

    @NotNull
    public final Function2 getLambda-1$material3_release() {
        return ComposableSingletons.ModalBottomSheetKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$material3_release() {
        return ComposableSingletons.ModalBottomSheetKt.lambda-2;
    }
}


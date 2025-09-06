package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.ModalBottomSheet_androidKt {
    @NotNull
    public static final ComposableSingletons.ModalBottomSheet_androidKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;
    @NotNull
    public static Function2 lambda-2;

    static {
        ComposableSingletons.ModalBottomSheet_androidKt.INSTANCE = new ComposableSingletons.ModalBottomSheet_androidKt();
        ComposableSingletons.ModalBottomSheet_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xB9336FE8, false, n4.Q);
        ComposableSingletons.ModalBottomSheet_androidKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xFA8E6553, false, n4.R);
    }

    @NotNull
    public final Function2 getLambda-1$material3_release() {
        return ComposableSingletons.ModalBottomSheet_androidKt.lambda-1;
    }

    @NotNull
    public final Function2 getLambda-2$material3_release() {
        return ComposableSingletons.ModalBottomSheet_androidKt.lambda-2;
    }
}


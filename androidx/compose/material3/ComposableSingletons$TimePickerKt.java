package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.TimePickerKt {
    @NotNull
    public static final ComposableSingletons.TimePickerKt INSTANCE;
    @NotNull
    public static Function3 lambda-1;
    @NotNull
    public static Function3 lambda-2;

    static {
        ComposableSingletons.TimePickerKt.INSTANCE = new ComposableSingletons.TimePickerKt();
        ComposableSingletons.TimePickerKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0x54F53CE4, false, v4.w);
        ComposableSingletons.TimePickerKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, w4.w);
    }

    @NotNull
    public final Function3 getLambda-1$material3_release() {
        return ComposableSingletons.TimePickerKt.lambda-1;
    }

    @NotNull
    public final Function3 getLambda-2$material3_release() {
        return ComposableSingletons.TimePickerKt.lambda-2;
    }
}


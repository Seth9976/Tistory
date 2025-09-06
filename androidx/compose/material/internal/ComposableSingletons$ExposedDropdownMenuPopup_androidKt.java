package androidx.compose.material.internal;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import s0.a;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class ComposableSingletons.ExposedDropdownMenuPopup_androidKt {
    @NotNull
    public static final ComposableSingletons.ExposedDropdownMenuPopup_androidKt INSTANCE;
    @NotNull
    public static Function2 lambda-1;

    static {
        ComposableSingletons.ExposedDropdownMenuPopup_androidKt.INSTANCE = new ComposableSingletons.ExposedDropdownMenuPopup_androidKt();
        ComposableSingletons.ExposedDropdownMenuPopup_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xA1E7E873, false, a.x);
    }

    @NotNull
    public final Function2 getLambda-1$material_release() {
        return ComposableSingletons.ExposedDropdownMenuPopup_androidKt.lambda-1;
    }
}


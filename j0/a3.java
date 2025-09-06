package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.1.1.invoke..inlined.onDispose.1;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a3 extends Lambda implements Function1 {
    public final MutableState w;
    public final MutableInteractionSource x;

    public a3(MutableState mutableState0, MutableInteractionSource mutableInteractionSource0) {
        this.w = mutableState0;
        this.x = mutableInteractionSource0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        return new TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.1.1.invoke..inlined.onDispose.1(this.w, this.x);
    }
}


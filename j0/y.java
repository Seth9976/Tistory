package j0;

import androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.3.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final int w;
    public final TextFieldSelectionState x;

    public y(TextFieldSelectionState textFieldSelectionState0, int v) {
        this.w = v;
        this.x = textFieldSelectionState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            TextToolbarState textToolbarState0 = TextFieldSelectionState.access$getTextToolbarState(this.x);
            TextFieldSelectionState.access$setTextToolbarState(this.x, (textToolbarState0 == TextToolbarState.Cursor ? TextToolbarState.None : TextToolbarState.Cursor));
            return Unit.INSTANCE;
        }
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        return new BasicTextFieldKt.BasicTextField.3.1.invoke..inlined.onDispose.1(this.x);
    }
}


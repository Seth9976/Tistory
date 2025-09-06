package androidx.compose.foundation.text;

import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final LegacyTextFieldState w;
    public final TextInputService x;
    public final TextFieldValue y;
    public final ImeOptions z;

    public a(LegacyTextFieldState legacyTextFieldState0, TextInputService textInputService0, TextFieldValue textFieldValue0, ImeOptions imeOptions0) {
        this.w = legacyTextFieldState0;
        this.x = textInputService0;
        this.y = textFieldValue0;
        this.z = imeOptions0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        if(legacyTextFieldState0.getHasFocus()) {
            legacyTextFieldState0.setInputSession(TextFieldDelegate.Companion.restartInput$foundation_release(this.x, this.y, legacyTextFieldState0.getProcessor(), this.z, legacyTextFieldState0.getOnValueChange(), legacyTextFieldState0.getOnImeActionPerformed()));
        }
        return new CoreTextFieldKt.CoreTextField.4.1.invoke..inlined.onDispose.1();
    }
}


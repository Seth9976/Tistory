package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final Function1 A;
    public final TextFieldValue w;
    public final AndroidLegacyPlatformTextInputServiceAdapter x;
    public final ImeOptions y;
    public final Function1 z;

    public a(TextFieldValue textFieldValue0, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter0, ImeOptions imeOptions0, Function1 function10, Function1 function11) {
        this.w = textFieldValue0;
        this.x = androidLegacyPlatformTextInputServiceAdapter0;
        this.y = imeOptions0;
        this.z = function10;
        this.A = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((LegacyTextInputMethodRequest)object0).startInput(this.w, this.x.getTextInputModifierNode(), this.y, this.z, this.A);
        return Unit.INSTANCE;
    }
}


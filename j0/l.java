package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final InputTransformation A;
    public final SecureTextFieldController B;
    public final TextStyle C;
    public final KeyboardOptions D;
    public final KeyboardActionHandler E;
    public final Function2 F;
    public final MutableInteractionSource G;
    public final Brush H;
    public final CodepointTransformation I;
    public final TextFieldDecorator J;
    public final TextFieldState w;
    public final Modifier x;
    public final boolean y;
    public final boolean z;

    public l(TextFieldState textFieldState0, Modifier modifier0, boolean z, boolean z1, InputTransformation inputTransformation0, SecureTextFieldController secureTextFieldController0, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActionHandler keyboardActionHandler0, Function2 function20, MutableInteractionSource mutableInteractionSource0, Brush brush0, CodepointTransformation codepointTransformation0, TextFieldDecorator textFieldDecorator0) {
        this.w = textFieldState0;
        this.x = modifier0;
        this.y = z;
        this.z = z1;
        this.A = inputTransformation0;
        this.B = secureTextFieldController0;
        this.C = textStyle0;
        this.D = keyboardOptions0;
        this.E = keyboardActionHandler0;
        this.F = function20;
        this.G = mutableInteractionSource0;
        this.H = brush0;
        this.I = codepointTransformation0;
        this.J = textFieldDecorator0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2023988909, v, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
        }
        InputTransformation inputTransformation0 = this.z ? BasicSecureTextFieldKt.access$then(this.A, this.B.getPasswordInputTransformation()) : this.A;
        BasicTextFieldKt.BasicTextField(this.w, this.x, this.y, false, inputTransformation0, this.C, this.D, this.E, SingleLine.INSTANCE, this.F, this.G, this.H, this.I, null, this.J, null, true, ((Composer)object0), 0x6000C00, 0x180000, 0xA000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}


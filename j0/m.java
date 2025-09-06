package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final TextStyle A;
    public final KeyboardOptions B;
    public final KeyboardActionHandler C;
    public final Function2 D;
    public final MutableInteractionSource E;
    public final Brush F;
    public final TextFieldDecorator G;
    public final int H;
    public final char I;
    public final int J;
    public final int K;
    public final int L;
    public final TextFieldState w;
    public final Modifier x;
    public final boolean y;
    public final InputTransformation z;

    public m(TextFieldState textFieldState0, Modifier modifier0, boolean z, InputTransformation inputTransformation0, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActionHandler keyboardActionHandler0, Function2 function20, MutableInteractionSource mutableInteractionSource0, Brush brush0, TextFieldDecorator textFieldDecorator0, int v, char c, int v1, int v2, int v3) {
        this.w = textFieldState0;
        this.x = modifier0;
        this.y = z;
        this.z = inputTransformation0;
        this.A = textStyle0;
        this.B = keyboardOptions0;
        this.C = keyboardActionHandler0;
        this.D = function20;
        this.E = mutableInteractionSource0;
        this.F = brush0;
        this.G = textFieldDecorator0;
        this.H = v;
        this.I = c;
        this.J = v1;
        this.K = v2;
        this.L = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BasicSecureTextFieldKt.BasicSecureTextField-Jb9bMDk(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, ((Composer)object0), (this.J | 1) & -920350135 | ((0x24924924 & (this.J | 1)) >> 1 | 306783378 & (this.J | 1)) | (306783378 & (this.J | 1)) << 1 & (0x24924924 & (this.J | 1)), this.K & -920350135 | ((0x24924924 & this.K) >> 1 | 306783378 & this.K) | (306783378 & this.K) << 1 & (0x24924924 & this.K), this.L);
        return Unit.INSTANCE;
    }
}


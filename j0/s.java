package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final boolean A;
    public final TextStyle B;
    public final Object C;
    public final KeyboardActions D;
    public final boolean E;
    public final int F;
    public final int G;
    public final VisualTransformation H;
    public final Function1 I;
    public final MutableInteractionSource J;
    public final Brush K;
    public final Function3 L;
    public final int M;
    public final int N;
    public final int O;
    public final Object P;
    public final int w;
    public final Function1 x;
    public final Modifier y;
    public final boolean z;

    public s(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, TextStyle textStyle0, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, boolean z, int v, int v1, ImeOptions imeOptions0, KeyboardActions keyboardActions0, boolean z1, boolean z2, Function3 function30, int v2, int v3, int v4) {
        this.w = 2;
        this.P = textFieldValue0;
        this.x = function10;
        this.y = modifier0;
        this.B = textStyle0;
        this.H = visualTransformation0;
        this.I = function11;
        this.J = mutableInteractionSource0;
        this.K = brush0;
        this.z = z;
        this.F = v;
        this.G = v1;
        this.C = imeOptions0;
        this.D = keyboardActions0;
        this.A = z1;
        this.E = z2;
        this.L = function30;
        this.M = v2;
        this.N = v3;
        this.O = v4;
        super(2);
    }

    public s(Object object0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z2, int v, int v1, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, Function3 function30, int v2, int v3, int v4, int v5) {
        this.w = v5;
        this.P = object0;
        this.x = function10;
        this.y = modifier0;
        this.z = z;
        this.A = z1;
        this.B = textStyle0;
        this.C = keyboardOptions0;
        this.D = keyboardActions0;
        this.E = z2;
        this.F = v;
        this.G = v1;
        this.H = visualTransformation0;
        this.I = function11;
        this.J = mutableInteractionSource0;
        this.K = brush0;
        this.L = function30;
        this.M = v2;
        this.N = v3;
        this.O = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                BasicTextFieldKt.BasicTextField(((TextFieldValue)this.P), this.x, this.y, this.z, this.A, this.B, ((KeyboardOptions)this.C), this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, ((Composer)object0), (this.M | 1) & -920350135 | ((0x24924924 & (this.M | 1)) >> 1 | 306783378 & (this.M | 1)) | (306783378 & (this.M | 1)) << 1 & (0x24924924 & (this.M | 1)), this.N & -920350135 | ((0x24924924 & this.N) >> 1 | 306783378 & this.N) | (306783378 & this.N) << 1 & (0x24924924 & this.N), this.O);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                BasicTextFieldKt.BasicTextField(((String)this.P), this.x, this.y, this.z, this.A, this.B, ((KeyboardOptions)this.C), this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, ((Composer)object0), (this.M | 1) & -920350135 | ((0x24924924 & (this.M | 1)) >> 1 | 306783378 & (this.M | 1)) | (306783378 & (this.M | 1)) << 1 & (0x24924924 & (this.M | 1)), this.N & -920350135 | ((0x24924924 & this.N) >> 1 | 306783378 & this.N) | (306783378 & this.N) << 1 & (0x24924924 & this.N), this.O);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                CoreTextFieldKt.CoreTextField(((TextFieldValue)this.P), this.x, this.y, this.B, this.H, this.I, this.J, this.K, this.z, this.F, this.G, ((ImeOptions)this.C), this.D, this.A, this.E, this.L, ((Composer)object0), (this.M | 1) & -920350135 | ((0x24924924 & (this.M | 1)) >> 1 | 306783378 & (this.M | 1)) | (306783378 & (this.M | 1)) << 1 & (0x24924924 & (this.M | 1)), this.N & -920350135 | ((0x24924924 & this.N) >> 1 | 306783378 & this.N) | (306783378 & this.N) << 1 & (0x24924924 & this.N), this.O);
                return Unit.INSTANCE;
            }
        }
    }
}


package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final boolean A;
    public final TextStyle B;
    public final KeyboardOptions C;
    public final KeyboardActions D;
    public final boolean E;
    public final int F;
    public final VisualTransformation G;
    public final Function1 H;
    public final MutableInteractionSource I;
    public final Brush J;
    public final Function3 K;
    public final int L;
    public final int M;
    public final int N;
    public final Object O;
    public final int w;
    public final Function1 x;
    public final Modifier y;
    public final boolean z;

    public u(Object object0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z2, int v, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, Function3 function30, int v1, int v2, int v3, int v4) {
        this.w = v4;
        this.O = object0;
        this.x = function10;
        this.y = modifier0;
        this.z = z;
        this.A = z1;
        this.B = textStyle0;
        this.C = keyboardOptions0;
        this.D = keyboardActions0;
        this.E = z2;
        this.F = v;
        this.G = visualTransformation0;
        this.H = function11;
        this.I = mutableInteractionSource0;
        this.J = brush0;
        this.K = function30;
        this.L = v1;
        this.M = v2;
        this.N = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            BasicTextFieldKt.BasicTextField(((TextFieldValue)this.O), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M), this.N);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        BasicTextFieldKt.BasicTextField(((String)this.O), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M), this.N);
        return Unit.INSTANCE;
    }
}


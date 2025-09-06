package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c6 extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final TextStyle C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final Function2 G;
    public final boolean H;
    public final VisualTransformation I;
    public final KeyboardOptions J;
    public final KeyboardActions K;
    public final boolean L;
    public final int M;
    public final MutableInteractionSource N;
    public final Shape O;
    public final TextFieldColors P;
    public final int Q;
    public final int R;
    public final int S;
    public final int w;
    public final TextFieldValue x;
    public final Function1 y;
    public final Modifier z;

    public c6(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z2, VisualTransformation visualTransformation0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, MutableInteractionSource mutableInteractionSource0, Shape shape0, TextFieldColors textFieldColors0, int v1, int v2, int v3, int v4) {
        this.w = v4;
        this.x = textFieldValue0;
        this.y = function10;
        this.z = modifier0;
        this.A = z;
        this.B = z1;
        this.C = textStyle0;
        this.D = function20;
        this.E = function21;
        this.F = function22;
        this.G = function23;
        this.H = z2;
        this.I = visualTransformation0;
        this.J = keyboardOptions0;
        this.K = keyboardActions0;
        this.L = z3;
        this.M = v;
        this.N = mutableInteractionSource0;
        this.O = shape0;
        this.P = textFieldColors0;
        this.Q = v1;
        this.R = v2;
        this.S = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextFieldKt.TextField(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, ((Composer)object0), (this.Q | 1) & -920350135 | ((0x24924924 & (this.Q | 1)) >> 1 | 306783378 & (this.Q | 1)) | (306783378 & (this.Q | 1)) << 1 & (0x24924924 & (this.Q | 1)), this.R & -920350135 | ((0x24924924 & this.R) >> 1 | 306783378 & this.R) | (306783378 & this.R) << 1 & (0x24924924 & this.R), this.S);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        OutlinedTextFieldKt.OutlinedTextField(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, ((Composer)object0), (this.Q | 1) & -920350135 | ((0x24924924 & (this.Q | 1)) >> 1 | 306783378 & (this.Q | 1)) | (306783378 & (this.Q | 1)) << 1 & (0x24924924 & (this.Q | 1)), this.R & -920350135 | ((0x24924924 & this.R) >> 1 | 306783378 & this.R) | (306783378 & this.R) << 1 & (0x24924924 & this.R), this.S);
        return Unit.INSTANCE;
    }
}


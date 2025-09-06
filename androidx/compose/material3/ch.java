package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
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

public final class ch extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final TextStyle C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final Function2 G;
    public final Function2 H;
    public final Function2 I;
    public final Function2 J;
    public final boolean K;
    public final VisualTransformation L;
    public final KeyboardOptions M;
    public final KeyboardActions N;
    public final boolean O;
    public final int P;
    public final int Q;
    public final MutableInteractionSource R;
    public final Shape S;
    public final TextFieldColors T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int w;
    public final TextFieldValue x;
    public final Function1 y;
    public final Modifier z;

    public ch(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, VisualTransformation visualTransformation0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, int v1, MutableInteractionSource mutableInteractionSource0, Shape shape0, TextFieldColors textFieldColors0, int v2, int v3, int v4, int v5, int v6) {
        this.w = v6;
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
        this.H = function24;
        this.I = function25;
        this.J = function26;
        this.K = z2;
        this.L = visualTransformation0;
        this.M = keyboardOptions0;
        this.N = keyboardActions0;
        this.O = z3;
        this.P = v;
        this.Q = v1;
        this.R = mutableInteractionSource0;
        this.S = shape0;
        this.T = textFieldColors0;
        this.U = v2;
        this.V = v3;
        this.W = v4;
        this.X = v5;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextFieldKt.TextField(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, ((Composer)object0), (this.U | 1) & -920350135 | ((0x24924924 & (this.U | 1)) >> 1 | 306783378 & (this.U | 1)) | (306783378 & (this.U | 1)) << 1 & (0x24924924 & (this.U | 1)), this.V & -920350135 | ((0x24924924 & this.V) >> 1 | 306783378 & this.V) | (306783378 & this.V) << 1 & (0x24924924 & this.V), this.W & -920350135 | ((0x24924924 & this.W) >> 1 | 306783378 & this.W) | (306783378 & this.W) << 1 & (0x24924924 & this.W), this.X);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        OutlinedTextFieldKt.OutlinedTextField(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, ((Composer)object0), (this.U | 1) & -920350135 | ((0x24924924 & (this.U | 1)) >> 1 | 306783378 & (this.U | 1)) | (306783378 & (this.U | 1)) << 1 & (0x24924924 & (this.U | 1)), this.V & -920350135 | ((0x24924924 & this.V) >> 1 | 306783378 & this.V) | (306783378 & this.V) << 1 & (0x24924924 & this.V), this.W & -920350135 | ((0x24924924 & this.W) >> 1 | 306783378 & this.W) | (306783378 & this.W) << 1 & (0x24924924 & this.W), this.X);
        return Unit.INSTANCE;
    }
}


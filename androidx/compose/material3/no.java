package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class no extends Lambda implements Function2 {
    public final boolean A;
    public final VisualTransformation B;
    public final InteractionSource C;
    public final boolean D;
    public final Function2 E;
    public final Function2 F;
    public final Function2 G;
    public final Function2 H;
    public final Function2 I;
    public final Function2 J;
    public final Function2 K;
    public final Shape L;
    public final TextFieldColors M;
    public final PaddingValues N;
    public final Function2 O;
    public final int P;
    public final int Q;
    public final int R;
    public final TextFieldDefaults w;
    public final String x;
    public final Function2 y;
    public final boolean z;

    public no(TextFieldDefaults textFieldDefaults0, String s, Function2 function20, boolean z, boolean z1, VisualTransformation visualTransformation0, InteractionSource interactionSource0, boolean z2, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Shape shape0, TextFieldColors textFieldColors0, PaddingValues paddingValues0, Function2 function28, int v, int v1, int v2) {
        this.w = textFieldDefaults0;
        this.x = s;
        this.y = function20;
        this.z = z;
        this.A = z1;
        this.B = visualTransformation0;
        this.C = interactionSource0;
        this.D = z2;
        this.E = function21;
        this.F = function22;
        this.G = function23;
        this.H = function24;
        this.I = function25;
        this.J = function26;
        this.K = function27;
        this.L = shape0;
        this.M = textFieldColors0;
        this.N = paddingValues0;
        this.O = function28;
        this.P = v;
        this.Q = v1;
        this.R = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.DecorationBox(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, ((Composer)object0), (this.P | 1) & -920350135 | ((0x24924924 & (this.P | 1)) >> 1 | 306783378 & (this.P | 1)) | (306783378 & (this.P | 1)) << 1 & (0x24924924 & (this.P | 1)), this.Q & -920350135 | ((0x24924924 & this.Q) >> 1 | 306783378 & this.Q) | (306783378 & this.Q) << 1 & (0x24924924 & this.Q), this.R);
        return Unit.INSTANCE;
    }
}


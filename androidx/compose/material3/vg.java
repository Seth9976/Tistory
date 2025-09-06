package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class vg extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function2 C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final Function2 G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final InteractionSource K;
    public final PaddingValues L;
    public final TextFieldColors M;
    public final Function2 N;
    public final int O;
    public final int P;
    public final int Q;
    public final Object R;
    public final int w;
    public final String x;
    public final Function2 y;
    public final VisualTransformation z;

    public vg(OutlinedTextFieldDefaults outlinedTextFieldDefaults0, String s, Function2 function20, boolean z, boolean z1, VisualTransformation visualTransformation0, InteractionSource interactionSource0, boolean z2, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, TextFieldColors textFieldColors0, PaddingValues paddingValues0, Function2 function28, int v, int v1, int v2) {
        this.w = 0;
        this.R = outlinedTextFieldDefaults0;
        this.x = s;
        this.y = function20;
        this.H = z;
        this.I = z1;
        this.z = visualTransformation0;
        this.K = interactionSource0;
        this.J = z2;
        this.A = function21;
        this.B = function22;
        this.C = function23;
        this.D = function24;
        this.E = function25;
        this.F = function26;
        this.G = function27;
        this.M = textFieldColors0;
        this.L = paddingValues0;
        this.N = function28;
        this.O = v;
        this.P = v1;
        this.Q = v2;
        super(2);
    }

    public vg(TextFieldType textFieldType0, String s, Function2 function20, VisualTransformation visualTransformation0, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z, boolean z1, boolean z2, InteractionSource interactionSource0, PaddingValues paddingValues0, TextFieldColors textFieldColors0, Function2 function28, int v, int v1, int v2) {
        this.w = 1;
        this.R = textFieldType0;
        this.x = s;
        this.y = function20;
        this.z = visualTransformation0;
        this.A = function21;
        this.B = function22;
        this.C = function23;
        this.D = function24;
        this.E = function25;
        this.F = function26;
        this.G = function27;
        this.H = z;
        this.I = z1;
        this.J = z2;
        this.K = interactionSource0;
        this.L = paddingValues0;
        this.M = textFieldColors0;
        this.N = function28;
        this.O = v;
        this.P = v1;
        this.Q = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextFieldImplKt.CommonDecorationBox(((TextFieldType)this.R), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P), this.Q);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((OutlinedTextFieldDefaults)this.R).DecorationBox(this.x, this.y, this.H, this.I, this.z, this.K, this.J, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.M, this.L, this.N, ((Composer)object0), (this.O | 1) & -920350135 | ((0x24924924 & (this.O | 1)) >> 1 | 306783378 & (this.O | 1)) | (306783378 & (this.O | 1)) << 1 & (0x24924924 & (this.O | 1)), this.P & -920350135 | ((0x24924924 & this.P) >> 1 | 306783378 & this.P) | (306783378 & this.P) << 1 & (0x24924924 & this.P), this.Q);
        return Unit.INSTANCE;
    }
}


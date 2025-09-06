package p0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.material.TextFieldType;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class bb extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function2 C;
    public final Function2 D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final InteractionSource H;
    public final PaddingValues I;
    public final TextFieldColors J;
    public final Function2 K;
    public final int L;
    public final int M;
    public final int N;
    public final Object O;
    public final int w;
    public final String x;
    public final Function2 y;
    public final VisualTransformation z;

    public bb(TextFieldDefaults textFieldDefaults0, String s, Function2 function20, boolean z, boolean z1, VisualTransformation visualTransformation0, InteractionSource interactionSource0, boolean z2, Function2 function21, Function2 function22, Function2 function23, Function2 function24, TextFieldColors textFieldColors0, PaddingValues paddingValues0, Function2 function25, int v, int v1, int v2) {
        this.w = 0;
        this.O = textFieldDefaults0;
        this.x = s;
        this.y = function20;
        this.E = z;
        this.F = z1;
        this.z = visualTransformation0;
        this.H = interactionSource0;
        this.G = z2;
        this.A = function21;
        this.B = function22;
        this.C = function23;
        this.D = function24;
        this.J = textFieldColors0;
        this.I = paddingValues0;
        this.K = function25;
        this.L = v;
        this.M = v1;
        this.N = v2;
        super(2);
    }

    public bb(TextFieldType textFieldType0, String s, Function2 function20, VisualTransformation visualTransformation0, Function2 function21, Function2 function22, Function2 function23, Function2 function24, boolean z, boolean z1, boolean z2, InteractionSource interactionSource0, PaddingValues paddingValues0, TextFieldColors textFieldColors0, Function2 function25, int v, int v1, int v2) {
        this.w = 1;
        this.O = textFieldType0;
        this.x = s;
        this.y = function20;
        this.z = visualTransformation0;
        this.A = function21;
        this.B = function22;
        this.C = function23;
        this.D = function24;
        this.E = z;
        this.F = z1;
        this.G = z2;
        this.H = interactionSource0;
        this.I = paddingValues0;
        this.J = textFieldColors0;
        this.K = function25;
        this.L = v;
        this.M = v1;
        this.N = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TextFieldImplKt.CommonDecorationBox(((TextFieldType)this.O), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M), this.N);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((TextFieldDefaults)this.O).OutlinedTextFieldDecorationBox(this.x, this.y, this.E, this.F, this.z, this.H, this.G, this.A, this.B, this.C, this.D, this.J, this.I, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M), this.N);
        return Unit.INSTANCE;
    }
}


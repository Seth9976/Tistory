package p0;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class cb extends Lambda implements Function2 {
    public final boolean A;
    public final VisualTransformation B;
    public final InteractionSource C;
    public final boolean D;
    public final Function2 E;
    public final Function2 F;
    public final Function2 G;
    public final Function2 H;
    public final TextFieldColors I;
    public final PaddingValues J;
    public final int K;
    public final int L;
    public final int M;
    public final TextFieldDefaults w;
    public final String x;
    public final Function2 y;
    public final boolean z;

    public cb(TextFieldDefaults textFieldDefaults0, String s, Function2 function20, boolean z, boolean z1, VisualTransformation visualTransformation0, InteractionSource interactionSource0, boolean z2, Function2 function21, Function2 function22, Function2 function23, Function2 function24, TextFieldColors textFieldColors0, PaddingValues paddingValues0, int v, int v1, int v2) {
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
        this.I = textFieldColors0;
        this.J = paddingValues0;
        this.K = v;
        this.L = v1;
        this.M = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.TextFieldDecorationBox(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, ((Composer)object0), (this.K | 1) & -920350135 | ((0x24924924 & (this.K | 1)) >> 1 | 306783378 & (this.K | 1)) | (306783378 & (this.K | 1)) << 1 & (0x24924924 & (this.K | 1)), this.L & -920350135 | ((0x24924924 & this.L) >> 1 | 306783378 & this.L) | (306783378 & this.L) << 1 & (0x24924924 & this.L), this.M);
        return Unit.INSTANCE;
    }
}


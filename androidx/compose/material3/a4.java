package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a4 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final Function2 C;
    public final MutableInteractionSource D;
    public final int E;
    public final int F;
    public final int G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final int w;
    public final boolean x;
    public final Modifier y;
    public final boolean z;

    public a4(SearchBarDefaults searchBarDefaults0, String s, Function1 function10, Function1 function11, boolean z, Function1 function12, Modifier modifier0, boolean z1, Function2 function20, Function2 function21, Function2 function22, TextFieldColors textFieldColors0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2) {
        this.w = 1;
        this.H = searchBarDefaults0;
        this.I = s;
        this.J = function10;
        this.K = function11;
        this.x = z;
        this.L = function12;
        this.y = modifier0;
        this.z = z1;
        this.A = function20;
        this.B = function21;
        this.C = function22;
        this.M = textFieldColors0;
        this.D = mutableInteractionSource0;
        this.E = v;
        this.F = v1;
        this.G = v2;
        super(2);
    }

    public a4(boolean z, Function0 function00, Function2 function20, Modifier modifier0, boolean z1, Function2 function21, Function2 function22, Function2 function23, Shape shape0, SelectableChipColors selectableChipColors0, SelectableChipElevation selectableChipElevation0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2) {
        this.w = 0;
        this.x = z;
        this.H = function00;
        this.A = function20;
        this.y = modifier0;
        this.z = z1;
        this.B = function21;
        this.C = function22;
        this.I = function23;
        this.J = shape0;
        this.K = selectableChipColors0;
        this.L = selectableChipElevation0;
        this.M = borderStroke0;
        this.D = mutableInteractionSource0;
        this.E = v;
        this.F = v1;
        this.G = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((SearchBarDefaults)this.H).InputField(((String)this.I), ((Function1)this.J), ((Function1)this.K), this.x, ((Function1)this.L), this.y, this.z, this.A, this.B, this.C, ((TextFieldColors)this.M), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F & -920350135 | ((0x24924924 & this.F) >> 1 | 306783378 & this.F) | (306783378 & this.F) << 1 & (0x24924924 & this.F), this.G);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ChipKt.InputChip(this.x, ((Function0)this.H), this.A, this.y, this.z, this.B, this.C, ((Function2)this.I), ((Shape)this.J), ((SelectableChipColors)this.K), ((SelectableChipElevation)this.L), ((BorderStroke)this.M), this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)), this.F & -920350135 | ((0x24924924 & this.F) >> 1 | 306783378 & this.F) | (306783378 & this.F) << 1 & (0x24924924 & this.F), this.G);
        return Unit.INSTANCE;
    }
}


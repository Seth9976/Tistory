package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g6 extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final String D;
    public final DatePickerColors E;
    public final Function2 F;
    public final int G;
    public final Modifier w;
    public final boolean x;
    public final Function0 y;
    public final boolean z;

    public g6(Modifier modifier0, boolean z, Function0 function00, boolean z1, boolean z2, boolean z3, boolean z4, String s, DatePickerColors datePickerColors0, Function2 function20, int v) {
        this.w = modifier0;
        this.x = z;
        this.y = function00;
        this.z = z1;
        this.A = z2;
        this.B = z3;
        this.C = z4;
        this.D = s;
        this.E = datePickerColors0;
        this.F = function20;
        this.G = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), (this.G | 1) & -920350135 | ((0x24924924 & (this.G | 1)) >> 1 | 306783378 & (this.G | 1)) | (306783378 & (this.G | 1)) << 1 & (0x24924924 & (this.G | 1)));
        return Unit.INSTANCE;
    }
}


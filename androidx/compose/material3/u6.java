package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u6 extends Lambda implements Function2 {
    public final String A;
    public final Function0 B;
    public final Function0 C;
    public final Function0 D;
    public final DatePickerColors E;
    public final int F;
    public final Modifier w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public u6(Modifier modifier0, boolean z, boolean z1, boolean z2, String s, Function0 function00, Function0 function01, Function0 function02, DatePickerColors datePickerColors0, int v) {
        this.w = modifier0;
        this.x = z;
        this.y = z1;
        this.z = z2;
        this.A = s;
        this.B = function00;
        this.C = function01;
        this.D = function02;
        this.E = datePickerColors0;
        this.F = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerKt.c(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
        return Unit.INSTANCE;
    }
}


package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b7 extends Lambda implements Function2 {
    public final boolean A;
    public final String B;
    public final DatePickerColors C;
    public final Function2 D;
    public final int E;
    public final Modifier w;
    public final boolean x;
    public final boolean y;
    public final Function0 z;

    public b7(Modifier modifier0, boolean z, boolean z1, Function0 function00, boolean z2, String s, DatePickerColors datePickerColors0, Function2 function20, int v) {
        this.w = modifier0;
        this.x = z;
        this.y = z1;
        this.z = function00;
        this.A = z2;
        this.B = s;
        this.C = datePickerColors0;
        this.D = function20;
        this.E = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DatePickerKt.access$Year(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object0), (this.E | 1) & -920350135 | ((0x24924924 & (this.E | 1)) >> 1 | 306783378 & (this.E | 1)) | (306783378 & (this.E | 1)) << 1 & (0x24924924 & (this.E | 1)));
        return Unit.INSTANCE;
    }
}


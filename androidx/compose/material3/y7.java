package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y7 extends Lambda implements Function2 {
    public final DatePickerFormatter A;
    public final Modifier B;
    public final int C;
    public final int D;
    public final DateRangePickerDefaults w;
    public final Long x;
    public final Long y;
    public final int z;

    public y7(DateRangePickerDefaults dateRangePickerDefaults0, Long long0, Long long1, int v, DatePickerFormatter datePickerFormatter0, Modifier modifier0, int v1, int v2) {
        this.w = dateRangePickerDefaults0;
        this.x = long0;
        this.y = long1;
        this.z = v;
        this.A = datePickerFormatter0;
        this.B = modifier0;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.w.DateRangePickerHeadline-v84Udv0(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}


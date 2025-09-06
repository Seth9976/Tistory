package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h5 extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final int w;
    public final int x;
    public final Modifier y;
    public final int z;

    public h5(Object object0, int v, Modifier modifier0, int v1, int v2, int v3) {
        this.w = v3;
        this.B = object0;
        this.x = v;
        this.y = modifier0;
        this.z = v1;
        this.A = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((DateRangePickerDefaults)this.B).DateRangePickerTitle-hOD91z4(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((DatePickerDefaults)this.B).DatePickerTitle-hOD91z4(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
        return Unit.INSTANCE;
    }
}


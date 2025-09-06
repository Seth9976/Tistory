package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class np extends Lambda implements Function2 {
    public final int w;
    public final TimePickerState x;
    public final TimePickerColors y;
    public final int z;

    public np(TimePickerState timePickerState0, TimePickerColors timePickerColors0, int v, int v1) {
        this.w = v1;
        this.x = timePickerState0;
        this.y = timePickerColors0;
        this.z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                TimePickerKt.a(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                TimePickerKt.b(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            default: {
                TimePickerKt.h(this.x, this.y, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}


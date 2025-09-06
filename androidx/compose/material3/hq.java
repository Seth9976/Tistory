package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class hq extends Lambda implements Function2 {
    public final int A;
    public final TimePickerColors B;
    public final int C;
    public final int w;
    public final Modifier x;
    public final int y;
    public final TimePickerState z;

    public hq(TimePickerState timePickerState0, Modifier modifier0, TimePickerColors timePickerColors0, int v, int v1, int v2) {
        this.w = 0;
        this.z = timePickerState0;
        this.x = modifier0;
        this.B = timePickerColors0;
        this.y = v;
        this.A = v1;
        this.C = v2;
        super(2);
    }

    public hq(Modifier modifier0, int v, TimePickerState timePickerState0, int v1, TimePickerColors timePickerColors0, int v2) {
        this.w = 1;
        this.x = modifier0;
        this.y = v;
        this.z = timePickerState0;
        this.A = v1;
        this.B = timePickerColors0;
        this.C = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TimePickerKt.f(this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        TimePickerKt.TimePicker-mT9BvqQ(this.z, this.x, this.B, this.y, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.C);
        return Unit.INSTANCE;
    }
}


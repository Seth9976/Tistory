package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class yp extends Lambda implements Function2 {
    public final boolean A;
    public final int B;
    public final int C;
    public final int w;
    public final AnalogTimePickerState x;
    public final Modifier y;
    public final TimePickerColors z;

    public yp(AnalogTimePickerState analogTimePickerState0, Modifier modifier0, TimePickerColors timePickerColors0, boolean z, int v, int v1, int v2) {
        this.w = v2;
        this.x = analogTimePickerState0;
        this.y = modifier0;
        this.z = timePickerColors0;
        this.A = z;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            TimePickerKt.VerticalTimePicker(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        TimePickerKt.HorizontalTimePicker(this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}


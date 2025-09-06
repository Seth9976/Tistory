package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class wp extends Lambda implements Function2 {
    public final int A;
    public final int w;
    public final Modifier x;
    public final TimePickerColors y;
    public final TimePickerState z;

    public wp(Modifier modifier0, TimePickerColors timePickerColors0, TimePickerState timePickerState0, int v) {
        this.w = 1;
        this.x = modifier0;
        this.y = timePickerColors0;
        this.z = timePickerState0;
        this.A = v;
        super(2);
    }

    public wp(Modifier modifier0, TimePickerState timePickerState0, TimePickerColors timePickerColors0, int v, int v1) {
        this.w = v1;
        this.x = modifier0;
        this.z = timePickerState0;
        this.y = timePickerColors0;
        this.A = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.w) {
            case 0: {
                TimePickerKt.access$HorizontalPeriodToggle(this.x, this.z, this.y, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                TimePickerKt.e(this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
            default: {
                TimePickerKt.access$VerticalPeriodToggle(this.x, this.z, this.y, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}


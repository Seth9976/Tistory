package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o9 extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final int w;
    public final Object x;
    public final int y;
    public final boolean z;

    public o9(Modifier modifier0, AnalogTimePickerState analogTimePickerState0, int v, boolean z, int v1) {
        this.w = 1;
        this.x = modifier0;
        this.B = analogTimePickerState0;
        this.y = v;
        this.z = z;
        this.A = v1;
        super(2);
    }

    public o9(Modifier modifier0, String s, boolean z, int v, int v1) {
        this.w = 4;
        this.x = modifier0;
        this.B = s;
        this.z = z;
        this.y = v;
        this.A = v1;
        super(2);
    }

    public o9(Object object0, boolean z, Object object1, int v, int v1, int v2) {
        this.w = v2;
        this.B = object0;
        this.z = z;
        this.x = object1;
        this.y = v;
        this.A = v1;
        super(2);
    }

    public o9(String s, boolean z, Function0 function00, int v, int v1) {
        this.w = 2;
        this.y = v;
        this.B = s;
        this.z = z;
        this.x = function00;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ((ExposedDropdownMenuDefaults)this.B).TrailingIcon(this.z, ((Modifier)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.A);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                TimePickerKt.access$ClockText(((Modifier)this.x), ((AnalogTimePickerState)this.B), this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                MenuButtonKt.MenuIconTextToggleButton(this.y, ((String)this.B), this.z, ((Function0)this.x), ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ((androidx.compose.material.ExposedDropdownMenuDefaults)this.B).TrailingIcon(this.z, ((Function0)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.A);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                MultipleImageSelectorKt.access$ImageItem(((Modifier)this.x), ((String)this.B), this.z, ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.A);
                return Unit.INSTANCE;
            }
        }
    }
}


package androidx.compose.foundation.layout;

import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BasicTooltip_androidKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.textedit.contract.FontData;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final Function C;
    public final int w;
    public final boolean x;
    public final Object y;
    public final int z;

    public y(SegmentedButtonDefaults segmentedButtonDefaults0, boolean z, Function2 function20, Function2 function21, int v, int v1) {
        this.w = 2;
        this.y = segmentedButtonDefaults0;
        this.x = z;
        this.B = function20;
        this.C = function21;
        this.z = v;
        this.A = v1;
        super(2);
    }

    public y(Modifier modifier0, Object object0, boolean z, Function function0, int v, int v1, int v2) {
        this.w = v2;
        this.y = modifier0;
        this.B = object0;
        this.x = z;
        this.C = function0;
        this.z = v;
        this.A = v1;
        super(2);
    }

    public y(Function0 function00, boolean z, Modifier modifier0, Function2 function20, int v, int v1) {
        this.w = 1;
        this.B = function00;
        this.x = z;
        this.y = modifier0;
        this.C = function20;
        this.z = v;
        this.A = v1;
        super(2);
    }

    public y(boolean z, Object object0, Modifier modifier0, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.B = object0;
        this.y = modifier0;
        this.C = function20;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                BoxWithConstraintsKt.BoxWithConstraints(((Modifier)this.y), ((Alignment)this.B), this.x, ((Function3)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                DatePickerKt.access$YearPickerMenuButton(((Function0)this.B), this.x, ((Modifier)this.y), ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ((SegmentedButtonDefaults)this.y).Icon(this.x, ((Function2)this.B), ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                TextStyleAndFontPanelKt.c(((Modifier)this.y), ((FontData)this.B), this.x, ((Function0)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                BasicTooltip_androidKt.b(this.x, ((BasicTooltipState)this.B), ((Modifier)this.y), ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                androidx.compose.material3.internal.BasicTooltip_androidKt.b(this.x, ((TooltipState)this.B), ((Modifier)this.y), ((Function2)this.C), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)), this.A);
                return Unit.INSTANCE;
            }
        }
    }
}


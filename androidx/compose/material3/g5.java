package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g5 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public g5(DatePickerDefaults datePickerDefaults0, Long long0, int v, DatePickerFormatter datePickerFormatter0, Modifier modifier0, int v1, int v2) {
        this.w = 0;
        this.A = datePickerDefaults0;
        this.B = long0;
        this.x = v;
        this.C = datePickerFormatter0;
        this.D = modifier0;
        this.y = v1;
        this.z = v2;
        super(2);
    }

    public g5(List list0, int v, String s, Function1 function10, Function0 function00, int v1, int v2) {
        this.w = 1;
        this.A = list0;
        this.x = v;
        this.B = s;
        this.C = function10;
        this.D = function00;
        this.y = v1;
        this.z = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            MultipleImageSelectorKt.MultipleImageSelector(((List)this.A), this.x, ((String)this.B), ((Function1)this.C), ((Function0)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((DatePickerDefaults)this.A).DatePickerHeadline-3kbWawI(((Long)this.B), this.x, ((DatePickerFormatter)this.C), ((Modifier)this.D), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
        return Unit.INSTANCE;
    }
}


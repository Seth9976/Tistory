package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class w7 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public w7(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.C = object4;
        this.D = object5;
        this.E = object6;
        this.F = object7;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((ComposableLambdaImpl)this.y).invoke(this.z, this.A, this.B, this.C, this.D, this.E, this.F, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        DateRangeInputKt.DateRangeInputContent(((Long)this.y), ((Long)this.z), ((Function2)this.A), ((CalendarModel)this.B), ((IntRange)this.C), ((DatePickerFormatter)this.D), ((SelectableDates)this.E), ((DatePickerColors)this.F), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
        return Unit.INSTANCE;
    }
}


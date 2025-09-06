package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import p0.ac;
import p0.dc;

public final class c5 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public c5(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.C = object4;
        this.D = object5;
        this.E = object6;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                DateInputKt.DateInputContent(((Long)this.y), ((Function1)this.z), ((CalendarModel)this.A), ((IntRange)this.B), ((DatePickerFormatter)this.C), ((SelectableDates)this.D), ((DatePickerColors)this.E), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.y).invoke(this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ((ac)this.y).a(((Modifier)this.z), ((Function2)this.A), ((ComposableLambda)this.B), ((ComposableLambda)this.C), ((ComposableLambda)this.D), ((ComposableLambda)this.E), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ((dc)this.y).a(((Modifier)this.z), ((Function2)this.A), ((ComposableLambda)this.B), ((ComposableLambda)this.C), ((ComposableLambda)this.D), ((ComposableLambda)this.E), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}


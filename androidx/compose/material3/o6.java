package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class o6 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public o6(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.C = object4;
        this.D = object5;
        this.E = object6;
        this.F = object7;
        this.G = object8;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                DatePickerKt.b(((LazyListState)this.y), ((Long)this.z), ((Function1)this.A), ((Function1)this.B), ((CalendarModel)this.C), ((IntRange)this.D), ((DatePickerFormatter)this.E), ((SelectableDates)this.F), ((DatePickerColors)this.G), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                SearchBar_androidKt.a(((Animatable)this.y), ((MutableFloatState)this.z), ((MutableState)this.A), ((MutableState)this.B), ((Modifier)this.C), ((WindowInsets)this.D), ((Function2)this.E), ((Function2)this.F), ((Function2)this.G), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.y).invoke(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
                return Unit.INSTANCE;
            }
        }
    }
}


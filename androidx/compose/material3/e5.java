package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e5 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 B;
    public final int C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Serializable I;
    public final Object J;
    public final int w;
    public final Long x;
    public final int y;
    public final Modifier z;

    public e5(DateRangePickerDefaults dateRangePickerDefaults0, Long long0, Long long1, int v, DatePickerFormatter datePickerFormatter0, Modifier modifier0, String s, String s1, Function2 function20, Function2 function21, Function2 function22, int v1, int v2) {
        this.w = 1;
        this.E = dateRangePickerDefaults0;
        this.x = long0;
        this.F = long1;
        this.y = v;
        this.G = datePickerFormatter0;
        this.z = modifier0;
        this.H = s;
        this.I = s1;
        this.A = function20;
        this.B = function21;
        this.J = function22;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    public e5(Modifier modifier0, Long long0, Function1 function10, CalendarModel calendarModel0, Function2 function20, Function2 function21, int v, DateInputValidator dateInputValidator0, DateInputFormat dateInputFormat0, Locale locale0, DatePickerColors datePickerColors0, int v1, int v2) {
        this.w = 0;
        this.z = modifier0;
        this.x = long0;
        this.E = function10;
        this.F = calendarModel0;
        this.A = function20;
        this.B = function21;
        this.y = v;
        this.G = dateInputValidator0;
        this.H = dateInputFormat0;
        this.I = locale0;
        this.J = datePickerColors0;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((DateRangePickerDefaults)this.E).a(this.x, ((Long)this.F), this.y, ((DatePickerFormatter)this.G), this.z, ((String)this.H), ((String)this.I), this.A, this.B, ((Function2)this.J), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D & -920350135 | ((0x24924924 & this.D) >> 1 | 306783378 & this.D) | (306783378 & this.D) << 1 & (0x24924924 & this.D));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        DateInputKt.DateInputTextField-tQNruF0(this.z, this.x, ((Function1)this.E), ((CalendarModel)this.F), this.A, this.B, this.y, ((DateInputValidator)this.G), ((DateInputFormat)this.H), ((Locale)this.I), ((DatePickerColors)this.J), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D & -920350135 | ((0x24924924 & this.D) >> 1 | 306783378 & this.D) | (306783378 & this.D) << 1 & (0x24924924 & this.D));
        return Unit.INSTANCE;
    }
}


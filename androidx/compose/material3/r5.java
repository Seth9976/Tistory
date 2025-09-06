package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r5 extends Lambda implements Function1 {
    public final int w;
    public final DatePickerState x;

    public r5(DatePickerState datePickerState0, int v) {
        this.w = v;
        this.x = datePickerState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                int v = ((DisplayMode)object0).unbox-impl();
                this.x.setDisplayMode-vCnGnXg(v);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.setSelectedDateMillis(((Long)object0));
                return Unit.INSTANCE;
            }
            default: {
                this.x.setDisplayedMonthMillis(((Number)object0).longValue());
                return Unit.INSTANCE;
            }
        }
    }
}


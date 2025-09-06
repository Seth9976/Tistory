package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c8 extends Lambda implements Function1 {
    public final int w;
    public final DateRangePickerState x;

    public c8(DateRangePickerState dateRangePickerState0, int v) {
        this.w = v;
        this.x = dateRangePickerState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            this.x.setDisplayedMonthMillis(((Number)object0).longValue());
            return Unit.INSTANCE;
        }
        int v = ((DisplayMode)object0).unbox-impl();
        this.x.setDisplayMode-vCnGnXg(v);
        return Unit.INSTANCE;
    }
}


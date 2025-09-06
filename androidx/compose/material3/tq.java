package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class tq extends ContinuationImpl {
    public AnalogTimePickerState o;
    public boolean p;
    public Object q;
    public int r;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.r |= 0x80000000;
        return TimePickerKt.access$onTap-rOwcSBo(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}


package m9;

import com.kakao.editortracker.Tracker;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public Object o;
    public final Tracker p;
    public int q;

    public a(Tracker tracker0, Continuation continuation0) {
        this.p = tracker0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.doWork(this);
    }
}


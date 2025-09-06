package f;

import android.graphics.Canvas;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;

public final class c extends ContinuationImpl {
    public Object a;
    public Object b;
    public Canvas c;
    public Object d;
    public Function3 e;
    public Function3 f;
    public Function3 g;
    public int h;
    public float i;
    public float j;
    public float k;
    public Object l;
    public final l m;
    public int n;

    public c(l l0, Continuation continuation0) {
        this.m = l0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.l = object0;
        this.n |= 0x80000000;
        return this.m.a(null, null, this);
    }
}


package f;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class k extends ContinuationImpl {
    public Bitmap a;
    public Uri b;
    public Object c;
    public final l d;
    public int e;

    public k(l l0, Continuation continuation0) {
        this.d = l0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.c = object0;
        this.e |= 0x80000000;
        return this.d.a(null, null, this);
    }
}


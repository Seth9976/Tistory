package f;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class j extends ContinuationImpl {
    public l a;
    public KDPhoto b;
    public ObjectRef c;
    public ObjectRef d;
    public Object e;
    public final l f;
    public int g;

    public j(l l0, Continuation continuation0) {
        this.f = l0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.e = object0;
        this.g |= 0x80000000;
        return this.f.a(null, this);
    }
}


package u5;

import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class b extends ContinuationImpl {
    public EngineInterceptor o;
    public ImageRequest p;
    public Object q;
    public Object r;
    public ObjectRef s;
    public ObjectRef t;
    public ObjectRef u;
    public ObjectRef v;
    public Object w;
    public final EngineInterceptor x;
    public int y;

    public b(EngineInterceptor engineInterceptor0, Continuation continuation0) {
        this.x = engineInterceptor0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.w = object0;
        this.y |= 0x80000000;
        return EngineInterceptor.access$execute(this.x, null, null, null, null, this);
    }
}


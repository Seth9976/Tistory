package u5;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.fetch.Fetcher;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public EngineInterceptor o;
    public ComponentRegistry p;
    public ImageRequest q;
    public Object r;
    public Options s;
    public EventListener t;
    public Fetcher u;
    public int v;
    public Object w;
    public final EngineInterceptor x;
    public int y;

    public c(EngineInterceptor engineInterceptor0, Continuation continuation0) {
        this.x = engineInterceptor0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.w = object0;
        this.y |= 0x80000000;
        return this.x.a(null, null, null, null, null, this);
    }
}


package u5;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.decode.Decoder;
import coil.fetch.SourceResult;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public EngineInterceptor o;
    public SourceResult p;
    public ComponentRegistry q;
    public ImageRequest r;
    public Object s;
    public Options t;
    public EventListener u;
    public Decoder v;
    public int w;
    public Object x;
    public final EngineInterceptor y;
    public int z;

    public a(EngineInterceptor engineInterceptor0, Continuation continuation0) {
        this.y = engineInterceptor0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.x = object0;
        this.z |= 0x80000000;
        return EngineInterceptor.access$decode(this.y, null, null, null, null, null, null, this);
    }
}


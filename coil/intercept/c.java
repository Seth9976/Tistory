package coil.intercept;

import android.graphics.drawable.Drawable;
import coil.EventListener;
import coil.decode.DataSource;
import coil.memory.MemoryCache.Key;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.util.-Utils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public final EngineInterceptor p;
    public final ImageRequest q;
    public final Object r;
    public final Options s;
    public final EventListener t;
    public final Key u;
    public final Chain v;

    public c(EngineInterceptor engineInterceptor0, ImageRequest imageRequest0, Object object0, Options options0, EventListener eventListener0, Key memoryCache$Key0, Chain interceptor$Chain0, Continuation continuation0) {
        this.p = engineInterceptor0;
        this.q = imageRequest0;
        this.r = object0;
        this.s = options0;
        this.t = eventListener0;
        this.u = memoryCache$Key0;
        this.v = interceptor$Chain0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.p, this.q, this.r, this.s, this.t, this.u, this.v, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ImageRequest imageRequest0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = EngineInterceptor.access$execute(this.p, imageRequest0, this.r, this.s, this.t, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.p.b.registerMemoryPressureCallbacks();
        boolean z = this.p.e.setCacheValue(this.u, imageRequest0, ((ExecuteResult)object0));
        Drawable drawable0 = ((ExecuteResult)object0).getDrawable();
        DataSource dataSource0 = ((ExecuteResult)object0).getDataSource();
        return z ? new SuccessResult(drawable0, imageRequest0, dataSource0, this.u, ((ExecuteResult)object0).getDiskCacheKey(), ((ExecuteResult)object0).isSampled(), -Utils.isPlaceholderCached(this.v)) : new SuccessResult(drawable0, imageRequest0, dataSource0, null, ((ExecuteResult)object0).getDiskCacheKey(), ((ExecuteResult)object0).isSampled(), -Utils.isPlaceholderCached(this.v));
    }
}


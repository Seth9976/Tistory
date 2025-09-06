package coil.intercept;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.fetch.SourceResult;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public int o;
    public final EngineInterceptor p;
    public final ObjectRef q;
    public final ObjectRef r;
    public final ImageRequest s;
    public final Object t;
    public final ObjectRef u;
    public final EventListener v;

    public a(EngineInterceptor engineInterceptor0, ObjectRef ref$ObjectRef0, ObjectRef ref$ObjectRef1, ImageRequest imageRequest0, Object object0, ObjectRef ref$ObjectRef2, EventListener eventListener0, Continuation continuation0) {
        this.p = engineInterceptor0;
        this.q = ref$ObjectRef0;
        this.r = ref$ObjectRef1;
        this.s = imageRequest0;
        this.t = object0;
        this.u = ref$ObjectRef2;
        this.v = eventListener0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.p, this.q, this.r, this.s, this.t, this.u, this.v, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = EngineInterceptor.access$decode(this.p, ((SourceResult)this.q.element), ((ComponentRegistry)this.r.element), this.s, this.t, ((Options)this.u.element), this.v, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


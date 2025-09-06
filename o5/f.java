package o5;

import android.graphics.Bitmap;
import coil.EventListener;
import coil.RealImageLoader;
import coil.intercept.RealInterceptorChain;
import coil.request.ImageRequest;
import coil.size.Size;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public int o;
    public final ImageRequest p;
    public final RealImageLoader q;
    public final Size r;
    public final EventListener s;
    public final Bitmap t;

    public f(ImageRequest imageRequest0, RealImageLoader realImageLoader0, Size size0, EventListener eventListener0, Bitmap bitmap0, Continuation continuation0) {
        this.p = imageRequest0;
        this.q = realImageLoader0;
        this.r = size0;
        this.s = eventListener0;
        this.t = bitmap0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                RealInterceptorChain realInterceptorChain0 = new RealInterceptorChain(this.p, this.q.n, 0, this.p, this.r, this.s, this.t != null);
                this.o = 1;
                object0 = realInterceptorChain0.proceed(this.p, this);
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


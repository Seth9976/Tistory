package o5;

import coil.RealImageLoader;
import coil.request.ImageRequest;
import coil.target.ViewTarget;
import coil.util.-Utils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final ImageRequest q;
    public final RealImageLoader r;

    public d(RealImageLoader realImageLoader0, ImageRequest imageRequest0, Continuation continuation0) {
        this.q = imageRequest0;
        this.r = realImageLoader0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.r, this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
                ImageRequest imageRequest0 = this.q;
                Deferred deferred0 = BuildersKt.async$default(coroutineScope0, mainCoroutineDispatcher0, null, new c(this.r, imageRequest0, null), 2, null);
                if(imageRequest0.getTarget() instanceof ViewTarget) {
                    -Utils.getRequestManager(((ViewTarget)imageRequest0.getTarget()).getView()).getDisposable(deferred0);
                }
                this.o = 1;
                object0 = deferred0.await(this);
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


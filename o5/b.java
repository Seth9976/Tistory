package o5;

import coil.RealImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.util.-Logs;
import coil.util.Logger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int o;
    public final RealImageLoader p;
    public final ImageRequest q;

    public b(RealImageLoader realImageLoader0, ImageRequest imageRequest0, Continuation continuation0) {
        this.p = realImageLoader0;
        this.q = imageRequest0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        RealImageLoader realImageLoader0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = RealImageLoader.access$executeMain(realImageLoader0, this.q, 0, this);
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
        if(((ImageResult)object0) instanceof ErrorResult) {
            Logger logger0 = realImageLoader0.getLogger();
            if(logger0 != null) {
                -Logs.log(logger0, "RealImageLoader", ((ErrorResult)(((ImageResult)object0))).getThrowable());
            }
        }
        return object0;
    }
}


package coil.compose;

import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final AsyncImagePainter q;

    public c(AsyncImagePainter asyncImagePainter0, Continuation continuation0) {
        this.q = asyncImagePainter0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((ImageRequest)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ImageRequest imageRequest0 = (ImageRequest)this.p;
                AsyncImagePainter asyncImagePainter0 = this.q;
                ImageLoader imageLoader0 = asyncImagePainter0.getImageLoader();
                ImageRequest imageRequest1 = AsyncImagePainter.access$updateRequest(asyncImagePainter0, imageRequest0);
                this.p = asyncImagePainter0;
                this.o = 1;
                object0 = imageLoader0.execute(imageRequest1, this);
                return object0 == object1 ? object1 : AsyncImagePainter.access$toState(asyncImagePainter0, ((ImageResult)object0));
            }
            case 1: {
                AsyncImagePainter asyncImagePainter1 = (AsyncImagePainter)this.p;
                ResultKt.throwOnFailure(object0);
                return AsyncImagePainter.access$toState(asyncImagePainter1, ((ImageResult)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


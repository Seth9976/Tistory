package oa;

import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public int o;
    public final PreviewTextureLoader p;
    public final KDPhoto q;

    public f(PreviewTextureLoader previewTextureLoader0, KDPhoto kDPhoto0, Continuation continuation0) {
        this.p = previewTextureLoader0;
        this.q = kDPhoto0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.p, this.q, continuation0);
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
                ViewFilterEngine viewFilterEngine0 = PreviewTextureLoader.access$getFilterEngine(this.p);
                e e0 = new e(this.p, this.q, null);
                this.o = 1;
                return ViewFilterEngine.updateAndExecute$default(viewFilterEngine0, e0, null, this, 2, null) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


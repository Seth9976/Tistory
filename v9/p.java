package v9;

import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.io.SurfaceOutput;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p extends SuspendLambda implements Function2 {
    public int o;
    public final ViewFilterEngine p;

    public p(ViewFilterEngine viewFilterEngine0, Continuation continuation0) {
        this.p = viewFilterEngine0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ViewFilterEngine viewFilterEngine0 = this.p;
                SurfaceOutput surfaceOutput0 = viewFilterEngine0.l;
                if(surfaceOutput0 != null) {
                    surfaceOutput0.delete();
                }
                viewFilterEngine0.l = null;
                this.o = 1;
                return viewFilterEngine0.super.releaseResource(this) == object1 ? object1 : Unit.INSTANCE;
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


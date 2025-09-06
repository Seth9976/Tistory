package v9;

import android.graphics.SurfaceTexture;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.io.SurfaceOutput;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class t extends SuspendLambda implements Function2 {
    public int o;
    public final ViewFilterEngine p;
    public final SurfaceTexture q;

    public t(ViewFilterEngine viewFilterEngine0, SurfaceTexture surfaceTexture0, Continuation continuation0) {
        this.p = viewFilterEngine0;
        this.q = surfaceTexture0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ViewFilterEngine viewFilterEngine0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(viewFilterEngine0.releaseResource(this) == object1) {
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
        SurfaceTexture surfaceTexture0 = this.q;
        if(surfaceTexture0 == null) {
            viewFilterEngine0.getGlContext$filter_release().resetCurrentSurface();
            return Unit.INSTANCE;
        }
        viewFilterEngine0.getGlContext$filter_release().setCurrentSurface(surfaceTexture0);
        viewFilterEngine0.l = new SurfaceOutput(viewFilterEngine0.getGlResourcesProvider$filter_release());
        return Unit.INSTANCE;
    }
}


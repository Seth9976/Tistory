package v9;

import android.util.Size;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.io.SurfaceOutput;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class u extends SuspendLambda implements Function2 {
    public final ViewFilterEngine o;
    public final int p;
    public final int q;

    public u(ViewFilterEngine viewFilterEngine0, int v, int v1, Continuation continuation0) {
        this.o = viewFilterEngine0;
        this.p = v;
        this.q = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SurfaceOutput surfaceOutput0 = this.o.l;
        if(surfaceOutput0 != null) {
            surfaceOutput0.setOutputSize(new Size(this.p, this.q));
        }
        return Unit.INSTANCE;
    }
}


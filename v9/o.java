package v9;

import android.opengl.GLES20;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class o extends SuspendLambda implements Function2 {
    public final ViewFilterEngine o;

    public o(ViewFilterEngine viewFilterEngine0, Continuation continuation0) {
        this.o = viewFilterEngine0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new o(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClearDepthf(0.0f);
        GLES20.glClearStencil(0);
        GLES20.glClear(0x4500);
        this.o.getGlContext$filter_release().swapBuffer();
        return Unit.INSTANCE;
    }
}


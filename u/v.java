package u;

import android.view.Surface;
import androidx.compose.foundation.BaseAndroidExternalSurfaceState.dispatchSurfaceCreated.1.receiver.1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import qd.a;

public final class v extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final w q;
    public final Surface r;
    public final int s;
    public final int t;

    public v(w w0, Surface surface0, int v, int v1, Continuation continuation0) {
        this.q = w0;
        this.r = surface0;
        this.s = v;
        this.t = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new v(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        w w0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.p;
                Job job0 = w0.e;
                if(job0 != null) {
                    this.p = coroutineScope0;
                    this.o = 1;
                    if(JobKt.cancelAndJoin(job0, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                coroutineScope0 = (CoroutineScope)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        BaseAndroidExternalSurfaceState.dispatchSurfaceCreated.1.receiver.1 baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$10 = new BaseAndroidExternalSurfaceState.dispatchSurfaceCreated.1.receiver.1(w0, coroutineScope0);
        Function5 function50 = w0.b;
        if(function50 != null) {
            this.p = null;
            this.o = 2;
            if(function50.invoke(baseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$10, this.r, Boxing.boxInt(this.s), Boxing.boxInt(this.t), this) == object1) {
                return object1;
            }
        }
        return Unit.INSTANCE;
    }
}


package androidx.compose.ui.platform;

import a2.b;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class u0 extends SuspendLambda implements Function2 {
    public int o;
    public final w0 p;
    public final PlatformTextInputMethodRequest q;
    public final PlatformTextInputSessionScope r;

    public u0(w0 w00, PlatformTextInputMethodRequest platformTextInputMethodRequest0, PlatformTextInputSessionScope platformTextInputSessionScope0, Continuation continuation0) {
        this.p = w00;
        this.q = platformTextInputMethodRequest0;
        this.r = platformTextInputSessionScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u0(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u0)this.create(((Unit)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = SnapshotStateKt.snapshotFlow(new b(this.p, 16));
                t0 t00 = new t0(this.q, this.r, null);
                this.o = 1;
                if(FlowKt.collectLatest(flow0, t00, this) == object1) {
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
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}


package androidx.compose.material3;

import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class vl extends SuspendLambda implements Function2 {
    public int o;
    public final SnackbarData p;
    public final AccessibilityManager q;

    public vl(SnackbarData snackbarData0, AccessibilityManager accessibilityManager0, Continuation continuation0) {
        this.p = snackbarData0;
        this.q = accessibilityManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new vl(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((vl)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SnackbarData snackbarData0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(snackbarData0 != null) {
                    long v = SnackbarHostKt.toMillis(snackbarData0.getVisuals().getDuration(), snackbarData0.getVisuals().getActionLabel() != null, this.q);
                    this.o = 1;
                    if(DelayKt.delay(v, this) == object1) {
                        return object1;
                    }
                    snackbarData0.dismiss();
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                snackbarData0.dismiss();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}


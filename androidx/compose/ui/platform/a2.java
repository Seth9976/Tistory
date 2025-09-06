package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class a2 extends SuspendLambda implements Function2 {
    public int o;
    public final Recomposer p;
    public final View q;

    public a2(Recomposer recomposer0, View view0, Continuation continuation0) {
        this.p = recomposer0;
        this.q = view0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a2(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Recomposer recomposer0 = this.p;
        View view0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    this.o = 1;
                    if(recomposer0.join(this) == object1) {
                        return object1;
                    label_9:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_12;
                }
            }
            case 1: {
                goto label_9;
            label_12:
                if(WindowRecomposer_androidKt.getCompositionContext(view0) == recomposer0) {
                    WindowRecomposer_androidKt.setCompositionContext(view0, null);
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(WindowRecomposer_androidKt.getCompositionContext(view0) == recomposer0) {
            WindowRecomposer_androidKt.setCompositionContext(view0, null);
        }
        return Unit.INSTANCE;
    }
}


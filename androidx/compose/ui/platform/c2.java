package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import qd.a;

public final class c2 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final ObjectRef q;
    public final Recomposer r;
    public final LifecycleOwner s;
    public final androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2 t;
    public final View u;

    public c2(ObjectRef ref$ObjectRef0, Recomposer recomposer0, LifecycleOwner lifecycleOwner0, androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$20, View view0, Continuation continuation0) {
        this.q = ref$ObjectRef0;
        this.r = recomposer0;
        this.s = lifecycleOwner0;
        this.t = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$20;
        this.u = view0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c2(this.q, this.r, this.s, this.t, this.u, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Job job1;
        Job job0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$20 = this.t;
        LifecycleOwner lifecycleOwner0 = this.s;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                try {
                    d1 d10 = (d1)this.q.element;
                    if(d10 == null) {
                        job0 = null;
                    }
                    else {
                        StateFlow stateFlow0 = WindowRecomposer_androidKt.access$getAnimationScaleFlowFor(this.u.getContext().getApplicationContext());
                        float f = ((Number)stateFlow0.getValue()).floatValue();
                        d10.a.setFloatValue(f);
                        job0 = BuildersKt.launch$default(coroutineScope0, null, null, new b2(stateFlow0, d10, null), 3, null);
                    }
                }
                catch(Throwable throwable0) {
                    job1 = null;
                    goto label_34;
                }
                try {
                    this.p = job0;
                    this.o = 1;
                    if(this.r.runRecomposeAndApplyChanges(this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    job1 = job0;
                    throwable0 = throwable1;
                    goto label_34;
                }
                job1 = job0;
                break;
            }
            case 1: {
                job1 = (Job)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_34:
                if(job1 != null) {
                    DefaultImpls.cancel$default(job1, null, 1, null);
                }
                lifecycleOwner0.getLifecycle().removeObserver(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$20);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(job1 != null) {
            DefaultImpls.cancel$default(job1, null, 1, null);
        }
        lifecycleOwner0.getLifecycle().removeObserver(windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$20);
        return Unit.INSTANCE;
    }
}


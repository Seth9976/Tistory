package androidx.activity;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import qd.a;

public final class h0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final View q;

    public h0(View view0, Continuation continuation0) {
        this.q = view0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new h0(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h0)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.p;
                e0 e00 = new e0(producerScope0, 0);
                View view0 = this.q;
                f0 f00 = new f0(producerScope0, view0);
                PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10 = new PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1(producerScope0, view0, f00, e00);
                if(view0.isAttachedToWindow()) {
                    producerScope0.trySend-JP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view0));
                    view0.getViewTreeObserver().addOnScrollChangedListener(f00);
                    view0.addOnLayoutChangeListener(e00);
                }
                view0.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10);
                g0 g00 = new g0(0, view0, f00, e00, pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10);
                this.o = 1;
                return ProduceKt.awaitClose(producerScope0, g00, this) == object1 ? object1 : Unit.INSTANCE;
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


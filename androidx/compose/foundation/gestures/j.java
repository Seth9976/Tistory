package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import w1.a;

public final class j extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final DragGestureNode q;
    public final PointerInputScope r;
    public final n s;
    public final m t;
    public final l u;
    public final a v;
    public final k w;

    public j(DragGestureNode dragGestureNode0, PointerInputScope pointerInputScope0, n n0, m m0, l l0, a a0, k k0, Continuation continuation0) {
        this.q = dragGestureNode0;
        this.r = pointerInputScope0;
        this.s = n0;
        this.t = m0;
        this.u = l0;
        this.v = a0;
        this.w = k0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope0;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        DragGestureNode dragGestureNode0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope1 = (CoroutineScope)this.p;
                try {
                    this.p = coroutineScope1;
                    this.o = 1;
                    return DragGestureDetectorKt.detectDragGestures(this.r, this.s, this.t, this.u, this.v, dragGestureNode0.p, this.w, this) == object1 ? object1 : Unit.INSTANCE;
                }
                catch(CancellationException cancellationException1) {
                    coroutineScope0 = coroutineScope1;
                    cancellationException0 = cancellationException1;
                }
            label_18:
                Channel channel0 = dragGestureNode0.t;
                if(channel0 != null) {
                    ChannelResult.box-impl(channel0.trySend-JP2dKIU(DragCancelled.INSTANCE));
                }
                if(!CoroutineScopeKt.isActive(coroutineScope0)) {
                    throw cancellationException0;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                coroutineScope0 = (CoroutineScope)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                    return Unit.INSTANCE;
                }
                catch(CancellationException cancellationException0) {
                    goto label_18;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


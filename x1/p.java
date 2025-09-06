package x1;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import qd.a;

public final class p implements AwaitPointerEventScope, Density, Continuation {
    public final CancellableContinuationImpl a;
    public final SuspendingPointerInputModifierNodeImpl b;
    public CancellableContinuationImpl c;
    public PointerEventPass d;
    public final EmptyCoroutineContext e;
    public final SuspendingPointerInputModifierNodeImpl f;

    public p(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl0, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.f = suspendingPointerInputModifierNodeImpl0;
        this.a = cancellableContinuationImpl0;
        this.b = suspendingPointerInputModifierNodeImpl0;
        this.d = PointerEventPass.Main;
        this.e = EmptyCoroutineContext.INSTANCE;
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final Object awaitPointerEvent(PointerEventPass pointerEventPass0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        this.d = pointerEventPass0;
        this.c = cancellableContinuationImpl0;
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final PointerEvent getCurrentEvent() {
        return this.f.s;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final long getExtendedTouchPadding-NH-jbRc() {
        return this.f.getExtendedTouchPadding-NH-jbRc();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.b.getFontScale();
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final long getSize-YbymL2g() {
        return this.f.w;
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final ViewConfiguration getViewConfiguration() {
        return this.f.getViewConfiguration();
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
        synchronized(this.f.t) {
            this.f.t.remove(this);
        }
        this.a.resumeWith(object0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int roundToPx--R2X_6o(long v) {
        return this.b.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int roundToPx-0680j_4(float f) {
        return this.b.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float toDp-GaN1DYA(long v) {
        return this.b.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toDp-u2uoSUM(float f) {
        return this.b.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toDp-u2uoSUM(int v) {
        return this.b.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toDpSize-k-rfVVM(long v) {
        return this.b.toDpSize-k-rfVVM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toPx--R2X_6o(long v) {
        return this.b.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float toPx-0680j_4(float f) {
        return this.b.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect0) {
        return this.b.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toSize-XkaWNTQ(long v) {
        return this.b.toSize-XkaWNTQ(v);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final long toSp-0xMU5do(float f) {
        return this.b.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toSp-kPz2Gy4(float f) {
        return this.b.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long toSp-kPz2Gy4(int v) {
        return this.b.toSp-kPz2Gy4(v);
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final Object withTimeout(long v, Function2 function20, Continuation continuation0) {
        Job job0;
        m m0;
        if(continuation0 instanceof m) {
            m0 = (m)continuation0;
            int v1 = m0.r;
            if((v1 & 0x80000000) == 0) {
                m0 = new m(this, continuation0);
            }
            else {
                m0.r = v1 ^ 0x80000000;
            }
        }
        else {
            m0 = new m(this, continuation0);
        }
        Object object0 = m0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(v <= 0L) {
                    CancellableContinuationImpl cancellableContinuationImpl0 = this.c;
                    if(cancellableContinuationImpl0 != null) {
                        cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(v))));
                    }
                }
                job0 = BuildersKt.launch$default(this.f.getCoroutineScope(), null, null, new n(v, this, null), 3, null);
                try {
                    m0.o = job0;
                    m0.r = 1;
                    object0 = function20.invoke(this, m0);
                    if(object0 == object1) {
                        return object1;
                    label_24:
                        job0 = m0.o;
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    job0.cancel(x1.a.a);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_24;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        job0.cancel(x1.a.a);
        return object0;
    }

    @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
    public final Object withTimeoutOrNull(long v, Function2 function20, Continuation continuation0) {
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v1 = o0.q;
            if((v1 & 0x80000000) == 0) {
                o0 = new o(this, continuation0);
            }
            else {
                o0.q = v1 ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, continuation0);
        }
        Object object0 = o0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    o0.q = 1;
                    object0 = this.withTimeout(v, function20, o0);
                    return object0 == object1 ? object1 : object0;
                label_19:
                    ResultKt.throwOnFailure(object0);
                    return object0;
                }
                catch(PointerEventTimeoutCancellationException unused_ex) {
                    return null;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


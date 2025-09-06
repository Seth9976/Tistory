package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public boolean o;
    public int p;
    public float q;
    public final ComposeScrollCaptureCallback r;

    public b(ComposeScrollCaptureCallback composeScrollCaptureCallback0, Continuation continuation0) {
        this.r = composeScrollCaptureCallback0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.r, continuation0);
        continuation1.q = ((Number)object0).floatValue();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((Number)object0).floatValue(), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        boolean z1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = this.q;
                ComposeScrollCaptureCallback composeScrollCaptureCallback0 = this.r;
                Function2 function20 = ScrollCapture_androidKt.getScrollCaptureScrollByAction(composeScrollCaptureCallback0.a);
                if(function20 == null) {
                    throw l1.a.b("Required value was null.");
                }
                boolean z = ((ScrollAxisRange)composeScrollCaptureCallback0.a.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
                if(z) {
                    f = -f;
                }
                Offset offset0 = Offset.box-impl(OffsetKt.Offset(0.0f, f));
                this.o = z;
                this.p = 1;
                object0 = function20.invoke(offset0, this);
                if(object0 == object1) {
                    return object1;
                }
                z1 = z;
                break;
            }
            case 1: {
                z1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f1 = Offset.getY-impl(((Offset)object0).unbox-impl());
        if(z1) {
            f1 = -f1;
        }
        return Boxing.boxFloat(f1);
    }
}


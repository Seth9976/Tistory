package f2;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.unit.IntRect;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public int o;
    public final ComposeScrollCaptureCallback p;
    public final ScrollCaptureSession q;
    public final Rect r;
    public final Consumer s;

    public a(ComposeScrollCaptureCallback composeScrollCaptureCallback0, ScrollCaptureSession scrollCaptureSession0, Rect rect0, Consumer consumer0, Continuation continuation0) {
        this.p = composeScrollCaptureCallback0;
        this.q = scrollCaptureSession0;
        this.r = rect0;
        this.s = consumer0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.p, this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntRect intRect0 = RectHelper_androidKt.toComposeIntRect(this.r);
                this.o = 1;
                object0 = ComposeScrollCaptureCallback.access$onScrollCaptureImageRequest(this.p, this.q, intRect0, this);
                if(object0 == object1) {
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
        Rect rect0 = RectHelper_androidKt.toAndroidRect(((IntRect)object0));
        this.s.accept(rect0);
        return Unit.INSTANCE;
    }
}


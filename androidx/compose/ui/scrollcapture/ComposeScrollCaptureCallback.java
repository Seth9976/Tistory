package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;
import androidx.webkit.internal.k;
import f2.c;
import f2.e;
import f2.g;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import org.jetbrains.annotations.NotNull;
import qd.a;

@RequiresApi(0x1F)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001FB\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ%\u0010\u0012\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\'\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u000F2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001D\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u001D\u0010\u001E¨\u0006 "}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/compose/ui/unit/IntRect;", "viewportBoundsInWindow", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "listener", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/unit/IntRect;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;)V", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Landroid/view/ScrollCaptureSession;", "session", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "captureArea", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "ScrollCaptureSessionListener", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\b\u0010\u0004\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "", "onSessionEnded", "", "onSessionStarted", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface ScrollCaptureSessionListener {
        void onSessionEnded();

        void onSessionStarted();
    }

    public static final int $stable = 8;
    public final SemanticsNode a;
    public final IntRect b;
    public final ScrollCaptureSessionListener c;
    public final CoroutineScope d;
    public final g e;

    public ComposeScrollCaptureCallback(@NotNull SemanticsNode semanticsNode0, @NotNull IntRect intRect0, @NotNull CoroutineScope coroutineScope0, @NotNull ScrollCaptureSessionListener composeScrollCaptureCallback$ScrollCaptureSessionListener0) {
        this.a = semanticsNode0;
        this.b = intRect0;
        this.c = composeScrollCaptureCallback$ScrollCaptureSessionListener0;
        this.d = CoroutineScopeKt.plus(coroutineScope0, e.a);
        this.e = new g(intRect0.getHeight(), new b(this, null));
    }

    public static final Object access$onScrollCaptureImageRequest(ComposeScrollCaptureCallback composeScrollCaptureCallback0, ScrollCaptureSession scrollCaptureSession0, IntRect intRect0, Continuation continuation0) {
        int v8;
        ScrollCaptureSession scrollCaptureSession2;
        int v7;
        ComposeScrollCaptureCallback composeScrollCaptureCallback2;
        IntRect intRect2;
        Unit unit0;
        int v2;
        int v1;
        f2.b b0;
        composeScrollCaptureCallback0.getClass();
        if(continuation0 instanceof f2.b) {
            b0 = (f2.b)continuation0;
            int v = b0.v;
            if((v & 0x80000000) == 0) {
                b0 = new f2.b(composeScrollCaptureCallback0, continuation0);
            }
            else {
                b0.v = v ^ 0x80000000;
            }
        }
        else {
            b0 = new f2.b(composeScrollCaptureCallback0, continuation0);
        }
        Object object0 = b0.t;
        IntRect intRect1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                v1 = intRect0.getTop();
                v2 = intRect0.getBottom();
                g g0 = composeScrollCaptureCallback0.e;
                b0.o = composeScrollCaptureCallback0;
                b0.p = scrollCaptureSession0;
                b0.q = intRect0;
                b0.r = v1;
                b0.s = v2;
                b0.v = 1;
                if(v1 > v2) {
                    g0.getClass();
                    throw new IllegalArgumentException(("Expected min=" + v1 + " ≤ max=" + v2).toString());
                }
                int v3 = v2 - v1;
                int v4 = g0.a;
                if(v3 > v4) {
                    throw new IllegalArgumentException(("Expected range (" + v3 + ") to be ≤ viewportSize=" + v4).toString());
                }
                float f = g0.c;
                if(((float)v1) < f || ((float)v2) > ((float)v4) + f) {
                    unit0 = g0.a(((float)(((float)v1) < f ? v1 : v2 - v4)) - f, b0);
                    if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                        unit0 = Unit.INSTANCE;
                    }
                    if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                        unit0 = Unit.INSTANCE;
                    }
                }
                else {
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 != intRect1) {
                    goto label_52;
                }
                return intRect1;
            }
            case 1: {
                int v5 = b0.s;
                int v6 = b0.r;
                intRect0 = b0.q;
                ScrollCaptureSession scrollCaptureSession1 = (ScrollCaptureSession)b0.p;
                ComposeScrollCaptureCallback composeScrollCaptureCallback1 = b0.o;
                ResultKt.throwOnFailure(object0);
                v1 = v6;
                scrollCaptureSession0 = scrollCaptureSession1;
                v2 = v5;
                composeScrollCaptureCallback0 = composeScrollCaptureCallback1;
            label_52:
                b0.o = composeScrollCaptureCallback0;
                b0.p = scrollCaptureSession0;
                b0.q = intRect0;
                b0.r = v1;
                b0.s = v2;
                b0.v = 2;
                if(MonotonicFrameClockKt.withFrameNanos(c.x, b0) != intRect1) {
                    intRect2 = intRect0;
                    composeScrollCaptureCallback2 = composeScrollCaptureCallback0;
                    v7 = v2;
                    scrollCaptureSession2 = scrollCaptureSession0;
                    v8 = v1;
                    break;
                }
                return intRect1;
            }
            case 2: {
                v7 = b0.s;
                v8 = b0.r;
                IntRect intRect3 = b0.q;
                ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession)b0.p;
                ComposeScrollCaptureCallback composeScrollCaptureCallback3 = b0.o;
                ResultKt.throwOnFailure(object0);
                scrollCaptureSession2 = scrollCaptureSession3;
                intRect2 = intRect3;
                composeScrollCaptureCallback2 = composeScrollCaptureCallback3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v9 = kotlin.ranges.c.coerceIn(v8 - zd.c.roundToInt(composeScrollCaptureCallback2.e.c), 0, composeScrollCaptureCallback2.e.a);
        int v10 = kotlin.ranges.c.coerceIn(v7 - zd.c.roundToInt(composeScrollCaptureCallback2.e.c), 0, composeScrollCaptureCallback2.e.a);
        IntRect intRect4 = IntRect.copy$default(intRect2, 0, v9, 0, v10, 5, null);
        if(v9 == v10) {
            return IntRect.Companion.getZero();
        }
        NodeCoordinator nodeCoordinator0 = composeScrollCaptureCallback2.a.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 == null) {
            throw new IllegalStateException("Could not find coordinator for semantics node.");
        }
        Canvas canvas0 = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            k.t(canvas0, p1.a.B());
            androidx.compose.ui.graphics.Canvas canvas1 = AndroidCanvas_androidKt.Canvas(canvas0);
            canvas1.translate(-((float)intRect4.getLeft()), -((float)intRect4.getTop()));
            nodeCoordinator0.draw(canvas1, null);
        }
        finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvas0);
        }
        return intRect4.translate(0, zd.c.roundToInt(composeScrollCaptureCallback2.e.c));
    }

    @Override  // android.view.ScrollCaptureCallback
    public void onScrollCaptureEnd(@NotNull Runnable runnable0) {
        androidx.compose.ui.scrollcapture.a a0 = new androidx.compose.ui.scrollcapture.a(this, runnable0, null);
        BuildersKt.launch$default(this.d, NonCancellable.INSTANCE, null, a0, 2, null);
    }

    @Override  // android.view.ScrollCaptureCallback
    public void onScrollCaptureImageRequest(@NotNull ScrollCaptureSession scrollCaptureSession0, @NotNull CancellationSignal cancellationSignal0, @NotNull Rect rect0, @NotNull Consumer consumer0) {
        f2.a a0 = new f2.a(this, scrollCaptureSession0, rect0, consumer0, null);
        ComposeScrollCaptureCallback_androidKt.access$launchWithCancellationSignal(this.d, cancellationSignal0, a0);
    }

    @Override  // android.view.ScrollCaptureCallback
    public void onScrollCaptureSearch(@NotNull CancellationSignal cancellationSignal0, @NotNull Consumer consumer0) {
        consumer0.accept(RectHelper_androidKt.toAndroidRect(this.b));
    }

    @Override  // android.view.ScrollCaptureCallback
    public void onScrollCaptureStart(@NotNull ScrollCaptureSession scrollCaptureSession0, @NotNull CancellationSignal cancellationSignal0, @NotNull Runnable runnable0) {
        this.e.c = 0.0f;
        this.c.onSessionStarted();
        runnable0.run();
    }
}


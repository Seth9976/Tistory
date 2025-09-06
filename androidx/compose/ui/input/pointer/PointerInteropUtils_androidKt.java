package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u001A2\u0010\t\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A2\u0010\u000B\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u001A-\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\f2\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "block", "toMotionEventScope-d-4ec7I", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;)V", "toMotionEventScope", "toCancelMotionEventScope-d-4ec7I", "toCancelMotionEventScope", "", "nowMillis", "emptyCancelMotionEventScope", "(JLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PointerInteropUtils_androidKt {
    public static final void a(PointerEvent pointerEvent0, long v, Function1 function10, boolean z) {
        MotionEvent motionEvent0 = pointerEvent0.getMotionEvent$ui_release();
        if(motionEvent0 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int v1 = motionEvent0.getAction();
        if(z) {
            motionEvent0.setAction(3);
        }
        motionEvent0.offsetLocation(-Offset.getX-impl(v), -Offset.getY-impl(v));
        function10.invoke(motionEvent0);
        motionEvent0.offsetLocation(Offset.getX-impl(v), Offset.getY-impl(v));
        motionEvent0.setAction(v1);
    }

    public static final void emptyCancelMotionEventScope(long v, @NotNull Function1 function10) {
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
        motionEvent0.setSource(0);
        function10.invoke(motionEvent0);
        motionEvent0.recycle();
    }

    public static void emptyCancelMotionEventScope$default(long v, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = SystemClock.uptimeMillis();
        }
        PointerInteropUtils_androidKt.emptyCancelMotionEventScope(v, function10);
    }

    public static final void toCancelMotionEventScope-d-4ec7I(@NotNull PointerEvent pointerEvent0, long v, @NotNull Function1 function10) {
        PointerInteropUtils_androidKt.a(pointerEvent0, v, function10, true);
    }

    public static final void toMotionEventScope-d-4ec7I(@NotNull PointerEvent pointerEvent0, long v, @NotNull Function1 function10) {
        PointerInteropUtils_androidKt.a(pointerEvent0, v, function10, false);
    }
}


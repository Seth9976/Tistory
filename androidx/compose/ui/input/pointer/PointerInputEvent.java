package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "", "uptime", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "a", "J", "getUptime", "()J", "b", "Ljava/util/List;", "getPointers", "()Ljava/util/List;", "c", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerInputEvent {
    public static final int $stable = 8;
    public final long a;
    public final List b;
    public final MotionEvent c;

    public PointerInputEvent(long v, @NotNull List list0, @NotNull MotionEvent motionEvent0) {
        this.a = v;
        this.b = list0;
        this.c = motionEvent0;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.c;
    }

    @NotNull
    public final List getPointers() {
        return this.b;
    }

    public final long getUptime() {
        return this.a;
    }
}


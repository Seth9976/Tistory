package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\"\u0010\u001D\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u0011\u0010!\u001A\u00020\u001E8F¢\u0006\u0006\u001A\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "<init>", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/input/pointer/PointerInputEvent;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "activeHoverEvent-0FcD4WY", "(J)Z", "activeHoverEvent", "a", "Landroidx/collection/LongSparseArray;", "getChanges", "()Landroidx/collection/LongSparseArray;", "b", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "getPointerInputEvent", "()Landroidx/compose/ui/input/pointer/PointerInputEvent;", "c", "Z", "getSuppressMovementConsumption", "()Z", "setSuppressMovementConsumption", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "getMotionEvent", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,39:1\n116#2,2:40\n33#2,6:42\n118#2:48\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n33#1:40,2\n33#1:42,6\n33#1:48\n*E\n"})
public final class InternalPointerEvent {
    public static final int $stable = 8;
    public final LongSparseArray a;
    public final PointerInputEvent b;
    public boolean c;

    public InternalPointerEvent(@NotNull LongSparseArray longSparseArray0, @NotNull PointerInputEvent pointerInputEvent0) {
        this.a = longSparseArray0;
        this.b = pointerInputEvent0;
    }

    public final boolean activeHoverEvent-0FcD4WY(long v) {
        List list0 = this.b.getPointers();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(PointerId.equals-impl0(((PointerInputEventData)object0).getId-J3iCeTQ(), v)) {
                return ((PointerInputEventData)object0) == null ? false : ((PointerInputEventData)object0).getActiveHover();
            }
        }
        return false;
    }

    @NotNull
    public final LongSparseArray getChanges() {
        return this.a;
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        return this.b.getMotionEvent();
    }

    @NotNull
    public final PointerInputEvent getPointerInputEvent() {
        return this.b;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.c;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.c = z;
    }
}


package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\n\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J\"\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\"\u0010\u0011\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000EJ\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u001B\u001A\u00020\u00028\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"androidx/compose/foundation/text/modifiers/SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Landroidx/compose/ui/geometry/Offset;", "downPosition", "", "onExtend-k-4lQ0M", "(J)Z", "onExtend", "dragPosition", "onExtendDrag-k-4lQ0M", "onExtendDrag", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "onStart-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onStart", "onDrag-3MmeM6k", "onDrag", "", "onDragDone", "()V", "a", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionControllerKt.makeSelectionModifier.mouseSelectionObserver.1 implements MouseSelectionObserver {
    public long a;
    public final Function0 b;
    public final SelectionRegistrar c;
    public final long d;

    public SelectionControllerKt.makeSelectionModifier.mouseSelectionObserver.1(SelectionRegistrar selectionRegistrar0, long v, Function0 function00) {
        this.b = function00;
        this.c = selectionRegistrar0;
        this.d = v;
        this.a = 0L;
    }

    public final long getLastPosition() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public boolean onDrag-3MmeM6k(long v, @NotNull SelectionAdjustment selectionAdjustment0) {
        Object object0 = this.b.invoke();
        if(((LayoutCoordinates)object0) != null) {
            if(!((LayoutCoordinates)object0).isAttached()) {
                return false;
            }
            SelectionRegistrar selectionRegistrar0 = this.c;
            if(!SelectionRegistrarKt.hasSelection(selectionRegistrar0, this.d)) {
                return false;
            }
            if(selectionRegistrar0.notifySelectionUpdate-njBpvok(((LayoutCoordinates)object0), v, this.a, false, selectionAdjustment0, false)) {
                this.a = v;
            }
        }
        return true;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public void onDragDone() {
        this.c.notifySelectionUpdateEnd();
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public boolean onExtend-k-4lQ0M(long v) {
        Object object0 = this.b.invoke();
        if(((LayoutCoordinates)object0) == null || !((LayoutCoordinates)object0).isAttached()) {
            return false;
        }
        SelectionRegistrar selectionRegistrar0 = this.c;
        if(selectionRegistrar0.notifySelectionUpdate-njBpvok(((LayoutCoordinates)object0), v, this.a, false, SelectionAdjustment.Companion.getNone(), false)) {
            this.a = v;
        }
        return SelectionRegistrarKt.hasSelection(selectionRegistrar0, this.d);
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public boolean onExtendDrag-k-4lQ0M(long v) {
        Object object0 = this.b.invoke();
        if(((LayoutCoordinates)object0) != null) {
            if(!((LayoutCoordinates)object0).isAttached()) {
                return false;
            }
            SelectionRegistrar selectionRegistrar0 = this.c;
            if(!SelectionRegistrarKt.hasSelection(selectionRegistrar0, this.d)) {
                return false;
            }
            if(selectionRegistrar0.notifySelectionUpdate-njBpvok(((LayoutCoordinates)object0), v, this.a, false, SelectionAdjustment.Companion.getNone(), false)) {
                this.a = v;
            }
        }
        return true;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public boolean onStart-3MmeM6k(long v, @NotNull SelectionAdjustment selectionAdjustment0) {
        Object object0 = this.b.invoke();
        if(((LayoutCoordinates)object0) == null || !((LayoutCoordinates)object0).isAttached()) {
            return false;
        }
        this.c.notifySelectionUpdateStart-ubNVwUQ(((LayoutCoordinates)object0), v, selectionAdjustment0, false);
        this.a = v;
        return SelectionRegistrarKt.hasSelection(this.c, this.d);
    }

    public final void setLastPosition(long v) {
        this.a = v;
    }
}


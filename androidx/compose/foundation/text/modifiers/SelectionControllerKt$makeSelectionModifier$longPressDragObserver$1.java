package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\u0006J\u001A\u0010\u000F\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u0006J\u000F\u0010\u0010\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u000F\u0010\u0011\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\tR(\u0010\u0017\u001A\u00020\u00028\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006R(\u0010\u001B\u001A\u00020\u00028\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001A\u0004\b\u0019\u0010\u0015\"\u0004\b\u001A\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"androidx/compose/foundation/text/modifiers/SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1", "Landroidx/compose/foundation/text/TextDragObserver;", "Landroidx/compose/ui/geometry/Offset;", "point", "", "onDown-k-4lQ0M", "(J)V", "onDown", "onUp", "()V", "startPoint", "onStart-k-4lQ0M", "onStart", "delta", "onDrag-k-4lQ0M", "onDrag", "onStop", "onCancel", "a", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "b", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionControllerKt.makeSelectionModifier.longPressDragObserver.1 implements TextDragObserver {
    public long a;
    public long b;
    public final Function0 c;
    public final SelectionRegistrar d;
    public final long e;

    public SelectionControllerKt.makeSelectionModifier.longPressDragObserver.1(SelectionRegistrar selectionRegistrar0, long v, Function0 function00) {
        this.c = function00;
        this.d = selectionRegistrar0;
        this.e = v;
        this.a = 0L;
        this.b = 0L;
    }

    public final long getDragTotalDistance() {
        return this.b;
    }

    public final long getLastPosition() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public void onCancel() {
        SelectionRegistrar selectionRegistrar0 = this.d;
        if(SelectionRegistrarKt.hasSelection(selectionRegistrar0, this.e)) {
            selectionRegistrar0.notifySelectionUpdateEnd();
        }
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public void onDown-k-4lQ0M(long v) {
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public void onDrag-k-4lQ0M(long v) {
        Object object0 = this.c.invoke();
        if(((LayoutCoordinates)object0) == null || !((LayoutCoordinates)object0).isAttached()) {
            return;
        }
        SelectionRegistrar selectionRegistrar0 = this.d;
        if(!SelectionRegistrarKt.hasSelection(selectionRegistrar0, this.e)) {
            return;
        }
        long v1 = Offset.plus-MK-Hz9U(this.b, v);
        this.b = v1;
        long v2 = Offset.plus-MK-Hz9U(this.a, v1);
        if(selectionRegistrar0.notifySelectionUpdate-njBpvok(((LayoutCoordinates)object0), v2, this.a, false, SelectionAdjustment.Companion.getWord(), true)) {
            this.a = v2;
            this.b = 0L;
        }
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public void onStart-k-4lQ0M(long v) {
        Object object0 = this.c.invoke();
        if(((LayoutCoordinates)object0) != null) {
            if(!((LayoutCoordinates)object0).isAttached()) {
                return;
            }
            this.d.notifySelectionUpdateStart-ubNVwUQ(((LayoutCoordinates)object0), v, SelectionAdjustment.Companion.getWord(), true);
            this.a = v;
        }
        if(!SelectionRegistrarKt.hasSelection(this.d, this.e)) {
            return;
        }
        this.b = 0L;
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public void onStop() {
        SelectionRegistrar selectionRegistrar0 = this.d;
        if(SelectionRegistrarKt.hasSelection(selectionRegistrar0, this.e)) {
            selectionRegistrar0.notifySelectionUpdateEnd();
        }
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public void onUp() {
    }

    public final void setDragTotalDistance(long v) {
        this.b = v;
    }

    public final void setLastPosition(long v) {
        this.a = v;
    }
}


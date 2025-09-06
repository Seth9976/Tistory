package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import x1.h;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000F\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "process", "", "processCancel", "()V", "clearPreviouslyHitModifierNodes", "a", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    public final LayoutNode a;
    public final HitPathTracker b;
    public final h c;
    public final HitTestResult d;
    public boolean e;

    public PointerInputEventProcessor(@NotNull LayoutNode layoutNode0) {
        this.a = layoutNode0;
        this.b = new HitPathTracker(layoutNode0.getCoordinates());
        this.c = new h();
        this.d = new HitTestResult();
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.b.clearPreviouslyHitModifierNodeCache();
    }

    @NotNull
    public final LayoutNode getRoot() {
        return this.a;
    }

    public final int process-BIzXfog(@NotNull PointerInputEvent pointerInputEvent0, @NotNull PositionCalculator positionCalculator0, boolean z) {
        boolean z3;
        boolean z2;
        HitPathTracker hitPathTracker0;
        HitTestResult hitTestResult0 = this.d;
        if(this.e) {
            return 0;
        }
        boolean z1 = true;
        try {
            z2 = true;
            this.e = true;
            InternalPointerEvent internalPointerEvent0 = this.c.a(pointerInputEvent0, positionCalculator0);
            int v1 = internalPointerEvent0.getChanges().size();
            for(int v2 = 0; v2 < v1; ++v2) {
                PointerInputChange pointerInputChange0 = (PointerInputChange)internalPointerEvent0.getChanges().valueAt(v2);
                if(pointerInputChange0.getPressed() || pointerInputChange0.getPreviousPressed()) {
                    z1 = false;
                    break;
                }
            }
            int v3 = internalPointerEvent0.getChanges().size();
            for(int v4 = 0; true; ++v4) {
                hitPathTracker0 = this.b;
                if(v4 >= v3) {
                    break;
                }
                PointerInputChange pointerInputChange1 = (PointerInputChange)internalPointerEvent0.getChanges().valueAt(v4);
                if(z1 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange1)) {
                    LayoutNode.hitTest-M_7yMNQ$ui_release$default(this.a, pointerInputChange1.getPosition-F1C5BW0(), this.d, PointerType.equals-impl0(pointerInputChange1.getType-T8wyACA(), 1), false, 8, null);
                    if(!hitTestResult0.isEmpty()) {
                        hitPathTracker0.addHitPath-QJqDSyo(pointerInputChange1.getId-J3iCeTQ(), hitTestResult0, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange1));
                        hitTestResult0.clear();
                    }
                }
            }
            hitPathTracker0.removeDetachedPointerInputNodes();
            z3 = hitPathTracker0.dispatchChanges(internalPointerEvent0, z);
            if(!internalPointerEvent0.getSuppressMovementConsumption()) {
                int v5 = internalPointerEvent0.getChanges().size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    PointerInputChange pointerInputChange2 = (PointerInputChange)internalPointerEvent0.getChanges().valueAt(v6);
                    if(PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange2) && pointerInputChange2.isConsumed()) {
                        return PointerInputEventProcessorKt.ProcessResult(z3, z2);
                    }
                }
            }
            z2 = false;
        }
        finally {
            this.e = false;
        }
        return PointerInputEventProcessorKt.ProcessResult(z3, z2);
    }

    public static int process-BIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor0, PointerInputEvent pointerInputEvent0, PositionCalculator positionCalculator0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor0.process-BIzXfog(pointerInputEvent0, positionCalculator0, z);
    }

    public final void processCancel() {
        if(!this.e) {
            ((LongSparseArray)this.c.a).clear();
            this.b.processCancel();
        }
    }
}


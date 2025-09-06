package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001A\u00020\u000B2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ5\u0010\u000F\u001A\u00020\u000B2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000F\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001A\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u001A\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u00152\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u0012¢\u0006\u0004\b\u001C\u0010\u0003J\u0017\u0010\u001D\u001A\u00020\u00122\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u001D\u0010\u001ER\u001D\u0010$\u001A\b\u0012\u0004\u0012\u00020\u00180\u001F8\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "<init>", "()V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "buildCache", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchMainEventPass", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "", "dispatchCancel", "clear", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/input/pointer/Node;", "hitNodes", "removeInvalidPointerIdsAndChanges", "(JLandroidx/collection/MutableObjectList;)V", "removeDetachedPointerInputModifierNodes", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "Landroidx/compose/runtime/collection/MutableVector;", "a", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,647:1\n1208#2:648\n1187#2,2:649\n460#3,11:651\n460#3,11:662\n460#3,11:673\n460#3,11:684\n460#3,11:695\n523#3:706\n48#3:707\n523#3:708\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n189#1:648\n189#1:649,2\n198#1:651,11\n228#1:662,11\n247#1:673,11\n258#1:684,11\n272#1:695,11\n283#1:706\n296#1:707\n297#1:708\n*E\n"})
public class NodeParent {
    public static final int $stable;
    public final MutableVector a;

    static {
        NodeParent.$stable = MutableVector.$stable;
    }

    public NodeParent() {
        this.a = new MutableVector(new Node[16], 0);
    }

    public boolean buildCache(@NotNull LongSparseArray longSparseArray0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull InternalPointerEvent internalPointerEvent0, boolean z) {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((Node)arr_object[v1]).buildCache(longSparseArray0, layoutCoordinates0, internalPointerEvent0, z) || z1;
                ++v1;
            }
            while(v1 < v);
            return z1;
        }
        return false;
    }

    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent0) {
        MutableVector mutableVector0 = this.a;
        for(int v = mutableVector0.getSize() - 1; -1 < v; --v) {
            if(((Node)mutableVector0.getContent()[v]).getPointerIds().isEmpty()) {
                mutableVector0.removeAt(v);
            }
        }
    }

    public final void clear() {
        this.a.clear();
    }

    public void dispatchCancel() {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((Node)arr_object[v1]).dispatchCancel();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent0) {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        boolean z = false;
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((Node)arr_object[v1]).dispatchFinalEventPass(internalPointerEvent0) || z1;
                ++v1;
            }
            while(v1 < v);
            z = z1;
        }
        this.cleanUpHits(internalPointerEvent0);
        return z;
    }

    public boolean dispatchMainEventPass(@NotNull LongSparseArray longSparseArray0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull InternalPointerEvent internalPointerEvent0, boolean z) {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((Node)arr_object[v1]).dispatchMainEventPass(longSparseArray0, layoutCoordinates0, internalPointerEvent0, z) || z1;
                ++v1;
            }
            while(v1 < v);
            return z1;
        }
        return false;
    }

    @NotNull
    public final MutableVector getChildren() {
        return this.a;
    }

    public final void removeDetachedPointerInputModifierNodes() {
        int v = 0;
        while(true) {
            MutableVector mutableVector0 = this.a;
            if(v >= mutableVector0.getSize()) {
                break;
            }
            Node node0 = (Node)mutableVector0.getContent()[v];
            if(node0.getModifierNode().isAttached()) {
                ++v;
                node0.removeDetachedPointerInputModifierNodes();
            }
            else {
                node0.dispatchCancel();
                mutableVector0.removeAt(v);
            }
        }
    }

    public void removeInvalidPointerIdsAndChanges(long v, @NotNull MutableObjectList mutableObjectList0) {
        MutableVector mutableVector0 = this.a;
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                ((Node)arr_object[v2]).removeInvalidPointerIdsAndChanges(v, mutableObjectList0);
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
    }
}


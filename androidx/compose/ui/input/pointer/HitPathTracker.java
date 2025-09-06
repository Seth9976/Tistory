package androidx.compose.ui.input.pointer;

import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0014\u001A\u00020\u000B2\u0006\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u000B¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\r¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001A\u00020\r¢\u0006\u0004\b\u0019\u0010\u0017R\u001A\u0010\u001F\u001A\u00020\u001A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "", "Landroidx/compose/ui/Modifier$Node;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "", "addHitPath-QJqDSyo", "(JLjava/util/List;Z)V", "addHitPath", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "isInBounds", "dispatchChanges", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "clearPreviouslyHitModifierNodeCache", "()V", "processCancel", "removeDetachedPointerInputNodes", "Landroidx/compose/ui/input/pointer/NodeParent;", "b", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "root", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,647:1\n366#2,12:648\n728#3:660\n728#3:663\n1580#4:661\n1580#4:664\n1#5:662\n1#5:665\n382#6,4:666\n354#6,6:670\n364#6,3:677\n367#6,2:681\n387#6,2:683\n370#6,6:685\n389#6:691\n1810#7:676\n1672#7:680\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n77#1:648,12\n86#1:660\n101#1:663\n86#1:661\n101#1:664\n86#1:662\n101#1:665\n110#1:666,4\n110#1:670,6\n110#1:677,3\n110#1:681,2\n110#1:683,2\n110#1:685,6\n110#1:691\n110#1:676\n110#1:680\n*E\n"})
public final class HitPathTracker {
    public static final int $stable = 8;
    public final LayoutCoordinates a;
    public final NodeParent b;
    public final MutableLongObjectMap c;

    public HitPathTracker(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.a = layoutCoordinates0;
        this.b = new NodeParent();
        this.c = new MutableLongObjectMap(10);
    }

    public final void addHitPath-QJqDSyo(long v, @NotNull List list0, boolean z) {
        Object object1;
        NodeParent nodeParent0 = this.b;
        MutableLongObjectMap mutableLongObjectMap0 = this.c;
        mutableLongObjectMap0.clear();
        int v1 = list0.size();
        NodeParent nodeParent1 = nodeParent0;
        int v2 = 0;
        boolean z1 = true;
        while(v2 < v1) {
            Node modifier$Node0 = (Node)list0.get(v2);
            if(z1) {
                MutableVector mutableVector0 = nodeParent1.getChildren();
                int v3 = mutableVector0.getSize();
                if(v3 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v4 = 0;
                    while(true) {
                        Object object0 = arr_object[v4];
                        if(Intrinsics.areEqual(((androidx.compose.ui.input.pointer.Node)object0).getModifierNode(), modifier$Node0)) {
                            object1 = object0;
                            goto label_23;
                        }
                        if(v4 + 1 >= v3) {
                            break;
                        }
                        ++v4;
                    }
                }
                object1 = null;
            label_23:
                if(((androidx.compose.ui.input.pointer.Node)object1) == null) {
                    z1 = false;
                }
                else {
                    ((androidx.compose.ui.input.pointer.Node)object1).markIsIn();
                    ((androidx.compose.ui.input.pointer.Node)object1).getPointerIds().add-0FcD4WY(v);
                    MutableObjectList mutableObjectList0 = mutableLongObjectMap0.get(v);
                    if(mutableObjectList0 == null) {
                        mutableObjectList0 = new MutableObjectList(0, 1, null);
                        mutableLongObjectMap0.set(v, mutableObjectList0);
                    }
                    mutableObjectList0.add(((androidx.compose.ui.input.pointer.Node)object1));
                    nodeParent1 = (androidx.compose.ui.input.pointer.Node)object1;
                    goto label_43;
                }
            }
            androidx.compose.ui.input.pointer.Node node0 = new androidx.compose.ui.input.pointer.Node(modifier$Node0);
            node0.getPointerIds().add-0FcD4WY(v);
            MutableObjectList mutableObjectList1 = mutableLongObjectMap0.get(v);
            if(mutableObjectList1 == null) {
                mutableObjectList1 = new MutableObjectList(0, 1, null);
                mutableLongObjectMap0.set(v, mutableObjectList1);
            }
            mutableObjectList1.add(node0);
            nodeParent1.getChildren().add(node0);
            nodeParent1 = node0;
        label_43:
            ++v2;
        }
        if(z) {
            long[] arr_v = mutableLongObjectMap0.keys;
            Object[] arr_object1 = mutableLongObjectMap0.values;
            long[] arr_v1 = mutableLongObjectMap0.metadata;
            int v5 = arr_v1.length - 2;
            if(v5 >= 0) {
                int v6 = 0;
                while(true) {
                    long v7 = arr_v1[v6];
                    if((~v7 << 7 & v7 & 0x8080808080808080L) != 0x8080808080808080L) {
                        int v8 = 8 - (~(v6 - v5) >>> 0x1F);
                        for(int v9 = 0; v9 < v8; ++v9) {
                            if((0xFFL & v7) < 0x80L) {
                                int v10 = (v6 << 3) + v9;
                                nodeParent0.removeInvalidPointerIdsAndChanges(arr_v[v10], ((MutableObjectList)arr_object1[v10]));
                            }
                            v7 >>= 8;
                        }
                        if(v8 == 8) {
                            goto label_64;
                        }
                        break;
                    }
                label_64:
                    if(v6 == v5) {
                        break;
                    }
                    ++v6;
                }
            }
        }
    }

    public static void addHitPath-QJqDSyo$default(HitPathTracker hitPathTracker0, long v, List list0, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        hitPathTracker0.addHitPath-QJqDSyo(v, list0, z);
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        this.b.clear();
    }

    public final boolean dispatchChanges(@NotNull InternalPointerEvent internalPointerEvent0, boolean z) {
        NodeParent nodeParent0 = this.b;
        LayoutCoordinates layoutCoordinates0 = this.a;
        if(!nodeParent0.buildCache(internalPointerEvent0.getChanges(), layoutCoordinates0, internalPointerEvent0, z)) {
            return false;
        }
        boolean z1 = nodeParent0.dispatchMainEventPass(internalPointerEvent0.getChanges(), layoutCoordinates0, internalPointerEvent0, z);
        return nodeParent0.dispatchFinalEventPass(internalPointerEvent0) || z1;
    }

    public static boolean dispatchChanges$default(HitPathTracker hitPathTracker0, InternalPointerEvent internalPointerEvent0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return hitPathTracker0.dispatchChanges(internalPointerEvent0, z);
    }

    @NotNull
    public final NodeParent getRoot$ui_release() {
        return this.b;
    }

    public final void processCancel() {
        this.b.dispatchCancel();
        this.clearPreviouslyHitModifierNodeCache();
    }

    public final void removeDetachedPointerInputNodes() {
        this.b.removeDetachedPointerInputModifierNodes();
    }
}


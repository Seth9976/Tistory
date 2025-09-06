package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.util.PointerIdArray;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00000\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ5\u0010\u0016\u001A\u00020\u00142\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001A\u001A\u00020\u00142\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u001A\u0010\u0017J\u000F\u0010\u001B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\r\u0010\u001D\u001A\u00020\n¢\u0006\u0004\b\u001D\u0010\u001CJ\u0017\u0010\u001E\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010!\u001A\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0017\u0010,\u001A\u00020\'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "Landroidx/compose/ui/Modifier$Node;", "modifierNode", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "", "pointerIdValue", "Landroidx/collection/MutableObjectList;", "hitNodes", "", "removeInvalidPointerIdsAndChanges", "(JLandroidx/collection/MutableObjectList;)V", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchMainEventPass", "(Landroidx/collection/LongSparseArray;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "buildCache", "dispatchCancel", "()V", "markIsIn", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "", "toString", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "c", "Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "getPointerIds", "()Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "pointerIds", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 PointerIdArray.kt\nandroidx/compose/ui/input/pointer/util/PointerIdArray\n*L\n1#1,647:1\n587#1,5:659\n594#1:763\n587#1,5:764\n594#1:824\n460#2,11:648\n460#2,11:708\n460#2,11:813\n460#2,11:885\n82#3:664\n82#3:719\n82#3:769\n82#3:825\n82#3:896\n432#4,6:665\n442#4,2:672\n444#4,8:677\n452#4,9:688\n461#4,8:700\n432#4,6:720\n442#4,2:727\n444#4,8:732\n452#4,9:743\n461#4,8:755\n432#4,6:770\n442#4,2:777\n444#4,8:782\n452#4,9:793\n461#4,8:805\n432#4,6:826\n442#4,2:833\n444#4,8:838\n452#4,9:849\n461#4,8:861\n432#4,6:897\n442#4,2:904\n444#4,8:909\n452#4,9:920\n461#4,8:932\n264#5:671\n264#5:726\n264#5:776\n264#5:832\n264#5:903\n245#6,3:674\n248#6,3:697\n245#6,3:729\n248#6,3:752\n245#6,3:779\n248#6,3:802\n245#6,3:835\n248#6,3:858\n245#6,3:906\n248#6,3:929\n1208#7:685\n1187#7,2:686\n1208#7:740\n1187#7,2:741\n1208#7:790\n1187#7,2:791\n1208#7:846\n1187#7,2:847\n1208#7:917\n1187#7,2:918\n33#8,6:869\n116#8,2:876\n33#8,6:878\n118#8:884\n33#8,6:940\n178#9:875\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n361#1:659,5\n361#1:763\n400#1:764,5\n400#1:824\n344#1:648,11\n372#1:708,11\n410#1:813,11\n605#1:885,11\n366#1:664\n386#1:719\n404#1:769\n443#1:825\n606#1:896\n366#1:665,6\n366#1:672,2\n366#1:677,8\n366#1:688,9\n366#1:700,8\n386#1:720,6\n386#1:727,2\n386#1:732,8\n386#1:743,9\n386#1:755,8\n404#1:770,6\n404#1:777,2\n404#1:782,8\n404#1:793,9\n404#1:805,8\n443#1:826,6\n443#1:833,2\n443#1:838,8\n443#1:849,9\n443#1:861,8\n606#1:897,6\n606#1:904,2\n606#1:909,8\n606#1:920,9\n606#1:932,8\n366#1:671\n386#1:726\n404#1:776\n443#1:832\n606#1:903\n366#1:674,3\n366#1:697,3\n386#1:729,3\n386#1:752,3\n404#1:779,3\n404#1:802,3\n443#1:835,3\n443#1:858,3\n606#1:906,3\n606#1:929,3\n366#1:685\n366#1:686,2\n386#1:740\n386#1:741,2\n404#1:790\n404#1:791,2\n443#1:846\n443#1:847,2\n606#1:917\n606#1:918,2\n461#1:869,6\n515#1:876,2\n515#1:878,6\n515#1:884\n622#1:940,6\n502#1:875\n*E\n"})
public final class Node extends NodeParent {
    public static final int $stable = 8;
    public final androidx.compose.ui.Modifier.Node b;
    public final PointerIdArray c;
    public final LongSparseArray d;
    public LayoutCoordinates e;
    public PointerEvent f;
    public boolean g;
    public boolean h;
    public boolean i;

    public Node(@NotNull androidx.compose.ui.Modifier.Node modifier$Node0) {
        this.b = modifier$Node0;
        this.c = new PointerIdArray();
        this.d = new LongSparseArray(2);
        this.h = true;
        this.i = true;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(@NotNull LongSparseArray longSparseArray0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull InternalPointerEvent internalPointerEvent0, boolean z) {
        boolean z3;
        Object object0;
        PointerIdArray pointerIdArray0;
        LongSparseArray longSparseArray1;
        boolean z1 = super.buildCache(longSparseArray0, layoutCoordinates0, internalPointerEvent0, z);
        androidx.compose.ui.Modifier.Node modifier$Node0 = this.b;
        if(!modifier$Node0.isAttached()) {
            return true;
        }
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof PointerInputModifierNode) {
                this.e = PointerInputModifierNodeKt.getLayoutCoordinates(((PointerInputModifierNode)modifier$Node0));
            }
            else if((modifier$Node0.getKindSet$ui_release() & 16) != 0 && modifier$Node0 instanceof DelegatingNode) {
                androidx.compose.ui.Modifier.Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                int v = 0;
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 16) != 0) {
                        ++v;
                        if(v == 1) {
                            modifier$Node0 = modifier$Node1;
                        }
                        else {
                            if(mutableVector0 == null) {
                                mutableVector0 = new MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if(modifier$Node0 != null) {
                                mutableVector0.add(modifier$Node0);
                                modifier$Node0 = null;
                            }
                            mutableVector0.add(modifier$Node1);
                        }
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
                if(v != 1) {
                    goto label_27;
                }
                continue;
            }
        label_27:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        int v1 = longSparseArray0.size();
        for(int v2 = 0; true; ++v2) {
            longSparseArray1 = this.d;
            pointerIdArray0 = this.c;
            if(v2 >= v1) {
                break;
            }
            long v3 = longSparseArray0.keyAt(v2);
            PointerInputChange pointerInputChange0 = (PointerInputChange)longSparseArray0.valueAt(v2);
            boolean z2 = !pointerIdArray0.contains(v3);
        }
        if(longSparseArray1.isEmpty()) {
            pointerIdArray0.clear();
            this.getChildren().clear();
            return true;
        }
        for(int v4 = pointerIdArray0.getSize() - 1; -1 < v4; --v4) {
            if(!longSparseArray0.containsKey(pointerIdArray0.get-_I2yYro(v4))) {
                pointerIdArray0.removeAt(v4);
            }
        }
        ArrayList arrayList0 = new ArrayList(longSparseArray1.size());
        int v5 = longSparseArray1.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            arrayList0.add(longSparseArray1.valueAt(v6));
        }
        PointerEvent pointerEvent0 = new PointerEvent(arrayList0, internalPointerEvent0);
        List list0 = pointerEvent0.getChanges();
        int v7 = list0.size();
        for(int v8 = 0; true; ++v8) {
            object0 = null;
            if(v8 >= v7) {
                break;
            }
            Object object1 = list0.get(v8);
            if(internalPointerEvent0.activeHoverEvent-0FcD4WY(((PointerInputChange)object1).getId-J3iCeTQ())) {
                object0 = object1;
                break;
            }
        }
        if(((PointerInputChange)object0) != null) {
            if(!z) {
                this.h = false;
            }
            else if(!this.h && (((PointerInputChange)object0).getPressed() || ((PointerInputChange)object0).getPreviousPressed())) {
                LayoutCoordinates layoutCoordinates1 = this.e;
                Intrinsics.checkNotNull(layoutCoordinates1);
                this.h = !PointerEventKt.isOutOfBounds-O0kMr_c(((PointerInputChange)object0), layoutCoordinates1.getSize-YbymL2g());
            }
            if(this.h != this.g && (PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 3) || PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 4) || PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 5))) {
                pointerEvent0.setType-EhbLWgg$ui_release((this.h ? 4 : 5));
            }
            else if(PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 4) && this.g && !this.i) {
                pointerEvent0.setType-EhbLWgg$ui_release(3);
            }
            else if(PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 5) && this.h && ((PointerInputChange)object0).getPressed()) {
                pointerEvent0.setType-EhbLWgg$ui_release(3);
            }
        }
        if(!z1 && PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 3)) {
            PointerEvent pointerEvent1 = this.f;
            if(pointerEvent1 != null && pointerEvent1.getChanges().size() == pointerEvent0.getChanges().size()) {
                z3 = false;
                int v9 = pointerEvent0.getChanges().size();
                for(int v10 = 0; true; ++v10) {
                    if(v10 >= v9) {
                        this.f = pointerEvent0;
                        return z3;
                    }
                    if(!Offset.equals-impl0(((PointerInputChange)pointerEvent1.getChanges().get(v10)).getPosition-F1C5BW0(), ((PointerInputChange)pointerEvent0.getChanges().get(v10)).getPosition-F1C5BW0())) {
                        break;
                    }
                }
            }
        }
        this.f = pointerEvent0;
        return true;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent0) {
        super.cleanUpHits(internalPointerEvent0);
        PointerEvent pointerEvent0 = this.f;
        if(pointerEvent0 == null) {
            return;
        }
        this.g = this.h;
        List list0 = pointerEvent0.getChanges();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
            boolean z = pointerInputChange0.getPressed();
            if(!z && !internalPointerEvent0.activeHoverEvent-0FcD4WY(pointerInputChange0.getId-J3iCeTQ()) || !z && !this.h) {
                this.c.remove-0FcD4WY(pointerInputChange0.getId-J3iCeTQ());
            }
        }
        this.h = false;
        this.i = PointerEventType.equals-impl0(pointerEvent0.getType-7fucELk(), 5);
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector mutableVector0 = this.getChildren();
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
        androidx.compose.ui.Modifier.Node modifier$Node0 = this.b;
        MutableVector mutableVector1 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof PointerInputModifierNode) {
                ((PointerInputModifierNode)modifier$Node0).onCancelPointerInput();
            }
            else if((modifier$Node0.getKindSet$ui_release() & 16) != 0 && modifier$Node0 instanceof DelegatingNode) {
                androidx.compose.ui.Modifier.Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                int v2 = 0;
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 16) != 0) {
                        ++v2;
                        if(v2 == 1) {
                            modifier$Node0 = modifier$Node1;
                        }
                        else {
                            if(mutableVector1 == null) {
                                mutableVector1 = new MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if(modifier$Node0 != null) {
                                mutableVector1.add(modifier$Node0);
                                modifier$Node0 = null;
                            }
                            mutableVector1.add(modifier$Node1);
                        }
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
                if(v2 != 1) {
                    goto label_32;
                }
                continue;
            }
        label_32:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector1);
        }
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@NotNull InternalPointerEvent internalPointerEvent0) {
        LongSparseArray longSparseArray0 = this.d;
        int v = 0;
        if(!longSparseArray0.isEmpty()) {
            androidx.compose.ui.Modifier.Node modifier$Node0 = this.b;
            if(modifier$Node0.isAttached()) {
                PointerEvent pointerEvent0 = this.f;
                Intrinsics.checkNotNull(pointerEvent0);
                LayoutCoordinates layoutCoordinates0 = this.e;
                Intrinsics.checkNotNull(layoutCoordinates0);
                long v1 = layoutCoordinates0.getSize-YbymL2g();
                androidx.compose.ui.Modifier.Node modifier$Node1 = modifier$Node0;
                MutableVector mutableVector0 = null;
                while(modifier$Node1 != null) {
                    if(modifier$Node1 instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode)modifier$Node1).onPointerEvent-H0pRuoY(pointerEvent0, PointerEventPass.Final, v1);
                    }
                    else if((modifier$Node1.getKindSet$ui_release() & 16) != 0 && modifier$Node1 instanceof DelegatingNode) {
                        androidx.compose.ui.Modifier.Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                        int v2 = 0;
                        while(modifier$Node2 != null) {
                            if((modifier$Node2.getKindSet$ui_release() & 16) != 0) {
                                ++v2;
                                if(v2 == 1) {
                                    modifier$Node1 = modifier$Node2;
                                }
                                else {
                                    if(mutableVector0 == null) {
                                        mutableVector0 = new MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if(modifier$Node1 != null) {
                                        mutableVector0.add(modifier$Node1);
                                        modifier$Node1 = null;
                                    }
                                    mutableVector0.add(modifier$Node2);
                                }
                            }
                            modifier$Node2 = modifier$Node2.getChild$ui_release();
                        }
                        if(v2 != 1) {
                            goto label_34;
                        }
                        continue;
                    }
                label_34:
                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                }
                if(modifier$Node0.isAttached()) {
                    MutableVector mutableVector1 = this.getChildren();
                    int v3 = mutableVector1.getSize();
                    if(v3 > 0) {
                        Object[] arr_object = mutableVector1.getContent();
                        while(true) {
                            ((Node)arr_object[v]).dispatchFinalEventPass(internalPointerEvent0);
                            ++v;
                            if(v >= v3) {
                                break;
                            }
                        }
                    }
                }
                v = 1;
            }
        }
        this.cleanUpHits(internalPointerEvent0);
        longSparseArray0.clear();
        this.e = null;
        return v != 0;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@NotNull LongSparseArray longSparseArray0, @NotNull LayoutCoordinates layoutCoordinates0, @NotNull InternalPointerEvent internalPointerEvent0, boolean z) {
        LongSparseArray longSparseArray1 = this.d;
        if(!longSparseArray1.isEmpty()) {
            androidx.compose.ui.Modifier.Node modifier$Node0 = this.b;
            if(modifier$Node0.isAttached()) {
                PointerEvent pointerEvent0 = this.f;
                Intrinsics.checkNotNull(pointerEvent0);
                LayoutCoordinates layoutCoordinates1 = this.e;
                Intrinsics.checkNotNull(layoutCoordinates1);
                long v = layoutCoordinates1.getSize-YbymL2g();
                androidx.compose.ui.Modifier.Node modifier$Node1 = modifier$Node0;
                MutableVector mutableVector0 = null;
                while(modifier$Node1 != null) {
                    if(modifier$Node1 instanceof PointerInputModifierNode) {
                        ((PointerInputModifierNode)modifier$Node1).onPointerEvent-H0pRuoY(pointerEvent0, PointerEventPass.Initial, v);
                    }
                    else if((modifier$Node1.getKindSet$ui_release() & 16) != 0 && modifier$Node1 instanceof DelegatingNode) {
                        androidx.compose.ui.Modifier.Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                        int v1 = 0;
                        while(modifier$Node2 != null) {
                            if((modifier$Node2.getKindSet$ui_release() & 16) != 0) {
                                ++v1;
                                if(v1 == 1) {
                                    modifier$Node1 = modifier$Node2;
                                }
                                else {
                                    if(mutableVector0 == null) {
                                        mutableVector0 = new MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if(modifier$Node1 != null) {
                                        mutableVector0.add(modifier$Node1);
                                        modifier$Node1 = null;
                                    }
                                    mutableVector0.add(modifier$Node2);
                                }
                            }
                            modifier$Node2 = modifier$Node2.getChild$ui_release();
                        }
                        if(v1 != 1) {
                            goto label_33;
                        }
                        continue;
                    }
                label_33:
                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                }
                if(modifier$Node0.isAttached()) {
                    MutableVector mutableVector1 = this.getChildren();
                    int v2 = mutableVector1.getSize();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector1.getContent();
                        int v3 = 0;
                        while(true) {
                            Node node0 = (Node)arr_object[v3];
                            LayoutCoordinates layoutCoordinates2 = this.e;
                            Intrinsics.checkNotNull(layoutCoordinates2);
                            node0.dispatchMainEventPass(longSparseArray1, layoutCoordinates2, internalPointerEvent0, z);
                            ++v3;
                            if(v3 >= v2) {
                                break;
                            }
                        }
                    }
                }
                if(modifier$Node0.isAttached()) {
                    MutableVector mutableVector2 = null;
                    while(modifier$Node0 != null) {
                        if(modifier$Node0 instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode)modifier$Node0).onPointerEvent-H0pRuoY(pointerEvent0, PointerEventPass.Main, v);
                        }
                        else if((modifier$Node0.getKindSet$ui_release() & 16) != 0 && modifier$Node0 instanceof DelegatingNode) {
                            androidx.compose.ui.Modifier.Node modifier$Node3 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                            int v4 = 0;
                            while(modifier$Node3 != null) {
                                if((modifier$Node3.getKindSet$ui_release() & 16) != 0) {
                                    ++v4;
                                    if(v4 == 1) {
                                        modifier$Node0 = modifier$Node3;
                                    }
                                    else {
                                        if(mutableVector2 == null) {
                                            mutableVector2 = new MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if(modifier$Node0 != null) {
                                            mutableVector2.add(modifier$Node0);
                                            modifier$Node0 = null;
                                        }
                                        mutableVector2.add(modifier$Node3);
                                    }
                                }
                                modifier$Node3 = modifier$Node3.getChild$ui_release();
                            }
                            if(v4 != 1) {
                                goto label_71;
                            }
                            continue;
                        }
                    label_71:
                        modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final androidx.compose.ui.Modifier.Node getModifierNode() {
        return this.b;
    }

    @NotNull
    public final PointerIdArray getPointerIds() {
        return this.c;
    }

    public final void markIsIn() {
        this.h = true;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public void removeInvalidPointerIdsAndChanges(long v, @NotNull MutableObjectList mutableObjectList0) {
        PointerIdArray pointerIdArray0 = this.c;
        if(pointerIdArray0.contains(v) && !mutableObjectList0.contains(this)) {
            pointerIdArray0.remove(v);
            this.d.remove(v);
        }
        MutableVector mutableVector0 = this.getChildren();
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

    @Override
    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + this.getChildren() + ", pointerIds=" + this.c + ')';
    }
}


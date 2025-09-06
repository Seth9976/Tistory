package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import o1.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\b\u001A>\u0010\n\u001A\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A2\u0010\r\u001A\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "findChildCorrespondingToFocusEnter", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,401:1\n1187#2,2:402\n1187#2,2:407\n1208#2:414\n1187#2,2:415\n1208#2:485\n1187#2,2:486\n359#3:404\n523#3:405\n48#3:424\n48#3:495\n460#3,11:551\n1#4:406\n1#4:412\n1#4:483\n94#5:409\n94#5:480\n297#6:410\n137#6:411\n138#6:413\n139#6,7:417\n146#6,9:425\n432#6,6:434\n442#6,2:441\n444#6,17:446\n461#6,8:466\n155#6,6:474\n297#6:481\n137#6:482\n138#6:484\n139#6,7:488\n146#6,9:496\n432#6,6:505\n442#6,2:512\n444#6,17:517\n461#6,8:537\n155#6,6:545\n264#7:440\n264#7:511\n245#8,3:443\n248#8,3:463\n245#8,3:514\n248#8,3:534\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n118#1:402,2\n174#1:407,2\n175#1:414\n175#1:415,2\n205#1:485\n205#1:486,2\n123#1:404\n123#1:405\n175#1:424\n205#1:495\n236#1:551,11\n175#1:412\n205#1:483\n175#1:409\n205#1:480\n175#1:410\n175#1:411\n175#1:413\n175#1:417,7\n175#1:425,9\n175#1:434,6\n175#1:441,2\n175#1:446,17\n175#1:466,8\n175#1:474,6\n205#1:481\n205#1:482\n205#1:484\n205#1:488,7\n205#1:496,9\n205#1:505,6\n205#1:512,2\n205#1:517,17\n205#1:537,8\n205#1:545,6\n175#1:440\n205#1:511\n175#1:443,3\n175#1:463,3\n205#1:514,3\n205#1:534,3\n*E\n"})
public final class TwoDimensionalFocusSearchKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            try {
                arr_v[FocusStateImpl.ActiveParent.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.Active.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.Captured.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.Inactive.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final boolean a(Rect rect0, Rect rect1, Rect rect2, int v) {
        float f4;
        float f3;
        float f2;
        float f1;
        float f;
        if(!TwoDimensionalFocusSearchKt.b(rect2, rect0, v) && TwoDimensionalFocusSearchKt.b(rect1, rect0, v)) {
            if(FocusDirection.equals-impl0(v, 3)) {
                if(rect0.getLeft() < rect2.getRight()) {
                    return true;
                }
                goto label_12;
            }
            if(FocusDirection.equals-impl0(v, 4)) {
                if(rect0.getRight() > rect2.getLeft()) {
                    return true;
                }
                goto label_12;
            }
            if(FocusDirection.equals-impl0(v, 5)) {
                if(rect0.getTop() < rect2.getBottom()) {
                    return true;
                }
                goto label_12;
            }
            if(!FocusDirection.equals-impl0(v, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if(rect0.getBottom() <= rect2.getTop()) {
            label_12:
                if(!FocusDirection.equals-impl0(v, 3) && !FocusDirection.equals-impl0(v, 4)) {
                    if(FocusDirection.equals-impl0(v, 3)) {
                        f = rect0.getLeft();
                        f1 = rect1.getRight();
                        goto label_24;
                    }
                    if(FocusDirection.equals-impl0(v, 4)) {
                        f2 = rect1.getLeft();
                        f3 = rect0.getRight();
                        goto label_29;
                    }
                    if(FocusDirection.equals-impl0(v, 5)) {
                        f = rect0.getTop();
                        f1 = rect1.getBottom();
                    label_24:
                        f4 = f - f1;
                    }
                    else if(FocusDirection.equals-impl0(v, 6)) {
                        f2 = rect1.getTop();
                        f3 = rect0.getBottom();
                    label_29:
                        f4 = f2 - f3;
                    }
                    else {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    float f5 = Math.max(0.0f, f4);
                    if(FocusDirection.equals-impl0(v, 3)) {
                        return f5 < Math.max(1.0f, rect0.getLeft() - rect2.getLeft());
                    }
                    if(FocusDirection.equals-impl0(v, 4)) {
                        return f5 < Math.max(1.0f, rect2.getRight() - rect0.getRight());
                    }
                    if(FocusDirection.equals-impl0(v, 5)) {
                        return f5 < Math.max(1.0f, rect0.getTop() - rect2.getTop());
                    }
                    if(!FocusDirection.equals-impl0(v, 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    return f5 < Math.max(1.0f, rect2.getBottom() - rect0.getBottom());
                }
            }
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(28)
    public static final boolean b(Rect rect0, Rect rect1, int v) {
        if((FocusDirection.equals-impl0(v, 3) ? true : FocusDirection.equals-impl0(v, 4))) {
            return rect0.getBottom() > rect1.getTop() && rect0.getTop() < rect1.getBottom();
        }
        if(!(FocusDirection.equals-impl0(v, 5) ? true : FocusDirection.equals-impl0(v, 6))) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect0.getRight() > rect1.getLeft() && rect0.getLeft() < rect1.getRight();
    }

    public static final void c(FocusTargetNode focusTargetNode0, MutableVector mutableVector0) {
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusTargetNode0.getNode());
        }
        else {
            mutableVector1.add(modifier$Node0);
        }
        while(mutableVector1.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector1, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                        MutableVector mutableVector2 = null;
                        while(modifier$Node1 != null) {
                            if(!(modifier$Node1 instanceof FocusTargetNode)) {
                                if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                    Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node2 != null) {
                                        if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                modifier$Node1 = modifier$Node2;
                                            }
                                            else {
                                                if(mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node1 != null) {
                                                    mutableVector2.add(modifier$Node1);
                                                    modifier$Node1 = null;
                                                }
                                                mutableVector2.add(modifier$Node2);
                                            }
                                        }
                                        modifier$Node2 = modifier$Node2.getChild$ui_release();
                                    }
                                    if(v != 1) {
                                        goto label_43;
                                    }
                                    continue;
                                }
                            }
                            else if(((FocusTargetNode)modifier$Node1).isAttached() && !DelegatableNodeKt.requireLayoutNode(((FocusTargetNode)modifier$Node1)).isDeactivated()) {
                                if(((FocusTargetNode)modifier$Node1).fetchFocusProperties$ui_release().getCanFocus()) {
                                    mutableVector0.add(((FocusTargetNode)modifier$Node1));
                                }
                                else {
                                    TwoDimensionalFocusSearchKt.c(((FocusTargetNode)modifier$Node1), mutableVector0);
                                }
                            }
                        label_43:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
    }

    public static final FocusTargetNode d(MutableVector mutableVector0, Rect rect0, int v) {
        Rect rect1;
        if(FocusDirection.equals-impl0(v, 3)) {
            rect1 = rect0.translate(rect0.getWidth() + 1.0f, 0.0f);
        }
        else {
            if(FocusDirection.equals-impl0(v, 4)) {
                rect1 = rect0.translate(-(rect0.getWidth() + 1.0f), 0.0f);
                goto label_11;
            }
            if(FocusDirection.equals-impl0(v, 5)) {
                rect1 = rect0.translate(0.0f, rect0.getHeight() + 1.0f);
            }
            else if(FocusDirection.equals-impl0(v, 6)) {
                rect1 = rect0.translate(0.0f, -(rect0.getHeight() + 1.0f));
            }
            else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
    label_11:
        int v1 = mutableVector0.getSize();
        FocusTargetNode focusTargetNode0 = null;
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                FocusTargetNode focusTargetNode1 = (FocusTargetNode)arr_object[v2];
                if(FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode1)) {
                    Rect rect2 = FocusTraversalKt.focusRect(focusTargetNode1);
                    if(TwoDimensionalFocusSearchKt.f(rect2, rect0, v) && (!TwoDimensionalFocusSearchKt.f(rect1, rect0, v) || TwoDimensionalFocusSearchKt.a(rect0, rect2, rect1, v) || !TwoDimensionalFocusSearchKt.a(rect0, rect1, rect2, v) && TwoDimensionalFocusSearchKt.g(rect0, rect2, v) < TwoDimensionalFocusSearchKt.g(rect0, rect1, v))) {
                        focusTargetNode0 = focusTargetNode1;
                        rect1 = rect2;
                    }
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        return focusTargetNode0;
    }

    public static final boolean e(FocusTargetNode focusTargetNode0, Rect rect0, int v, Function1 function10) {
        if(TwoDimensionalFocusSearchKt.h(focusTargetNode0, rect0, v, function10)) {
            return true;
        }
        Boolean boolean0 = (Boolean)BeyondBoundsLayoutKt.searchBeyondBounds--OM-vw8(focusTargetNode0, v, new p(focusTargetNode0, rect0, v, function10));
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final boolean f(Rect rect0, Rect rect1, int v) {
        if(FocusDirection.equals-impl0(v, 3)) {
            return (rect1.getRight() > rect0.getRight() || rect1.getLeft() >= rect0.getRight()) && rect1.getLeft() > rect0.getLeft();
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return (rect1.getLeft() < rect0.getLeft() || rect1.getRight() <= rect0.getLeft()) && rect1.getRight() < rect0.getRight();
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return (rect1.getBottom() > rect0.getBottom() || rect1.getTop() >= rect0.getBottom()) && rect1.getTop() > rect0.getTop();
        }
        if(!FocusDirection.equals-impl0(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return (rect1.getTop() < rect0.getTop() || rect1.getBottom() <= rect0.getTop()) && rect1.getBottom() < rect0.getBottom();
    }

    public static final boolean findChildCorrespondingToFocusEnter--OM-vw8(@NotNull FocusTargetNode focusTargetNode0, int v, @NotNull Function1 function10) {
        Rect rect1;
        MutableVector mutableVector0 = new MutableVector(new FocusTargetNode[16], 0);
        TwoDimensionalFocusSearchKt.c(focusTargetNode0, mutableVector0);
        boolean z = true;
        if(mutableVector0.getSize() <= 1) {
            Object object0 = mutableVector0.isEmpty() ? null : mutableVector0.getContent()[0];
            return ((FocusTargetNode)object0) == null ? false : ((Boolean)function10.invoke(((FocusTargetNode)object0))).booleanValue();
        }
        if(FocusDirection.equals-impl0(v, 7)) {
            v = 4;
        }
        if((FocusDirection.equals-impl0(v, 4) ? true : FocusDirection.equals-impl0(v, 6))) {
            Rect rect0 = FocusTraversalKt.focusRect(focusTargetNode0);
            rect1 = new Rect(rect0.getLeft(), rect0.getTop(), rect0.getLeft(), rect0.getTop());
        }
        else {
            if(!FocusDirection.equals-impl0(v, 3)) {
                z = FocusDirection.equals-impl0(v, 5);
            }
            if(!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            Rect rect2 = FocusTraversalKt.focusRect(focusTargetNode0);
            rect1 = new Rect(rect2.getRight(), rect2.getBottom(), rect2.getRight(), rect2.getBottom());
        }
        FocusTargetNode focusTargetNode1 = TwoDimensionalFocusSearchKt.d(mutableVector0, rect1, v);
        return focusTargetNode1 == null ? false : ((Boolean)function10.invoke(focusTargetNode1)).booleanValue();
    }

    public static final long g(Rect rect0, Rect rect1, int v) {
        float f4;
        float f3;
        float f2;
        float f1;
        float f;
        if(FocusDirection.equals-impl0(v, 3)) {
            f = rect0.getLeft();
            f1 = rect1.getRight();
        }
        else {
            if(FocusDirection.equals-impl0(v, 4)) {
                f = rect1.getLeft();
                f1 = rect0.getRight();
                goto label_15;
            }
            if(FocusDirection.equals-impl0(v, 5)) {
                f = rect0.getTop();
                f1 = rect1.getBottom();
            }
            else if(FocusDirection.equals-impl0(v, 6)) {
                f = rect1.getTop();
                f1 = rect0.getBottom();
            }
            else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
    label_15:
        long v1 = (long)Math.abs(Math.max(0.0f, f - f1));
        boolean z = true;
        if((FocusDirection.equals-impl0(v, 3) ? true : FocusDirection.equals-impl0(v, 4))) {
            f2 = rect0.getHeight() / 2.0f + rect0.getTop();
            f3 = rect1.getTop();
            f4 = rect1.getHeight();
        }
        else {
            if(!FocusDirection.equals-impl0(v, 5)) {
                z = FocusDirection.equals-impl0(v, 6);
            }
            if(!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = rect0.getWidth() / 2.0f + rect0.getLeft();
            f3 = rect1.getLeft();
            f4 = rect1.getWidth();
        }
        long v2 = (long)Math.abs(f2 - (f4 / 2.0f + f3));
        return v2 * v2 + 13L * v1 * v1;
    }

    public static final boolean h(FocusTargetNode focusTargetNode0, Rect rect0, int v, Function1 function10) {
        MutableVector mutableVector0 = new MutableVector(new FocusTargetNode[16], 0);
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusTargetNode0.getNode());
        }
        else {
            mutableVector1.add(modifier$Node0);
        }
        while(mutableVector1.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector1, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                        MutableVector mutableVector2 = null;
                        while(modifier$Node1 != null) {
                            if(!(modifier$Node1 instanceof FocusTargetNode)) {
                                if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                    Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                    int v1 = 0;
                                    while(modifier$Node2 != null) {
                                        if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
                                                modifier$Node1 = modifier$Node2;
                                            }
                                            else {
                                                if(mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node1 != null) {
                                                    mutableVector2.add(modifier$Node1);
                                                    modifier$Node1 = null;
                                                }
                                                mutableVector2.add(modifier$Node2);
                                            }
                                        }
                                        modifier$Node2 = modifier$Node2.getChild$ui_release();
                                    }
                                    if(v1 != 1) {
                                        goto label_41;
                                    }
                                    continue;
                                }
                            }
                            else if(((FocusTargetNode)modifier$Node1).isAttached()) {
                                mutableVector0.add(((FocusTargetNode)modifier$Node1));
                            }
                        label_41:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        while(mutableVector0.isNotEmpty()) {
            FocusTargetNode focusTargetNode1 = TwoDimensionalFocusSearchKt.d(mutableVector0, rect0, v);
            if(focusTargetNode1 == null) {
                return false;
            }
            if(focusTargetNode1.fetchFocusProperties$ui_release().getCanFocus()) {
                return ((Boolean)function10.invoke(focusTargetNode1)).booleanValue();
            }
            if(TwoDimensionalFocusSearchKt.e(focusTargetNode1, rect0, v, function10)) {
                return true;
            }
            mutableVector0.remove(focusTargetNode1);
        }
        return false;
    }

    @Nullable
    public static final Boolean twoDimensionalFocusSearch-sMXa3k8(@NotNull FocusTargetNode focusTargetNode0, int v, @Nullable Rect rect0, @NotNull Function1 function10) {
        FocusStateImpl focusStateImpl0 = focusTargetNode0.getFocusState();
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        switch(arr_v[focusStateImpl0.ordinal()]) {
            case 1: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if(focusTargetNode1 != null) {
                    switch(arr_v[focusTargetNode1.getFocusState().ordinal()]) {
                        case 1: {
                            Boolean boolean0 = TwoDimensionalFocusSearchKt.twoDimensionalFocusSearch-sMXa3k8(focusTargetNode1, v, rect0, function10);
                            if(!Intrinsics.areEqual(boolean0, Boolean.FALSE)) {
                                return boolean0;
                            }
                            if(rect0 == null) {
                                if(focusTargetNode1.getFocusState() != FocusStateImpl.ActiveParent) {
                                    throw new IllegalStateException("Searching for active node in inactive hierarchy");
                                }
                                FocusTargetNode focusTargetNode2 = FocusTraversalKt.findActiveFocusNode(focusTargetNode1);
                                if(focusTargetNode2 == null) {
                                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                                }
                                return Boolean.valueOf(TwoDimensionalFocusSearchKt.e(focusTargetNode0, FocusTraversalKt.focusRect(focusTargetNode2), v, function10));
                            }
                            return Boolean.valueOf(TwoDimensionalFocusSearchKt.e(focusTargetNode0, rect0, v, function10));
                        }
                        case 2: 
                        case 3: {
                            if(rect0 == null) {
                                rect0 = FocusTraversalKt.focusRect(focusTargetNode1);
                            }
                            return Boolean.valueOf(TwoDimensionalFocusSearchKt.e(focusTargetNode0, rect0, v, function10));
                        }
                        case 4: {
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            case 2: 
            case 3: {
                return Boolean.valueOf(TwoDimensionalFocusSearchKt.findChildCorrespondingToFocusEnter--OM-vw8(focusTargetNode0, v, function10));
            }
            case 4: {
                if(focusTargetNode0.fetchFocusProperties$ui_release().getCanFocus()) {
                    return (Boolean)function10.invoke(focusTargetNode0);
                }
                return rect0 == null ? Boolean.valueOf(TwoDimensionalFocusSearchKt.findChildCorrespondingToFocusEnter--OM-vw8(focusTargetNode0, v, function10)) : Boolean.valueOf(TwoDimensionalFocusSearchKt.h(focusTargetNode0, rect0, v, function10));
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}


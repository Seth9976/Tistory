package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\r\u001A&\u0010\b\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001AF\u0010\u0010\u001A\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\u0010\n\u001A\u0004\u0018\u00010\t2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u000BH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0013\u0010\u0011\u001A\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0015\u0010\u0013\u001A\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0015\u001A\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016\"\u001A\u0010\u0018\u001A\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "focusSearch-0X8WOeE", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "focusRect", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;", "findActiveFocusNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "getActiveChild", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,173:1\n1#2:174\n1#2:178\n1#2:249\n1#2:324\n94#3:175\n94#3:246\n94#3:317\n297#4:176\n137#4:177\n138#4:179\n139#4,7:183\n146#4,9:191\n432#4,6:200\n442#4,2:207\n444#4,17:212\n461#4,8:232\n155#4,6:240\n297#4:247\n137#4:248\n138#4:250\n139#4,7:254\n146#4,9:262\n432#4,6:271\n442#4,2:278\n444#4,17:283\n461#4,8:303\n155#4,6:311\n251#4,5:318\n62#4:323\n63#4,8:325\n432#4,6:333\n442#4,2:340\n444#4,8:345\n452#4,9:356\n461#4,8:368\n72#4,7:376\n1208#5:180\n1187#5,2:181\n1208#5:251\n1187#5,2:252\n1208#5:353\n1187#5,2:354\n48#6:190\n48#6:261\n264#7:206\n264#7:277\n264#7:339\n245#8,3:209\n248#8,3:229\n245#8,3:280\n248#8,3:300\n245#8,3:342\n248#8,3:365\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n143#1:178\n157#1:249\n168#1:324\n143#1:175\n157#1:246\n168#1:317\n143#1:176\n143#1:177\n143#1:179\n143#1:183,7\n143#1:191,9\n143#1:200,6\n143#1:207,2\n143#1:212,17\n143#1:232,8\n143#1:240,6\n157#1:247\n157#1:248\n157#1:250\n157#1:254,7\n157#1:262,9\n157#1:271,6\n157#1:278,2\n157#1:283,17\n157#1:303,8\n157#1:311,6\n168#1:318,5\n168#1:323\n168#1:325,8\n168#1:333,6\n168#1:340,2\n168#1:345,8\n168#1:356,9\n168#1:368,8\n168#1:376,7\n143#1:180\n143#1:181,2\n157#1:251\n157#1:252,2\n168#1:353\n168#1:354,2\n143#1:190\n157#1:261\n143#1:206\n157#1:277\n168#1:339\n143#1:209,3\n143#1:229,3\n157#1:280,3\n157#1:300,3\n168#1:342,3\n168#1:365,3\n*E\n"})
public final class FocusTraversalKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            try {
                arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[FocusStateImpl.values().length];
            try {
                arr_v1[FocusStateImpl.Active.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.ActiveParent.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.Captured.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.Inactive.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @NotNull
    public static final FocusRequester customFocusSearch--OM-vw8(@NotNull FocusTargetNode focusTargetNode0, int v, @NotNull LayoutDirection layoutDirection0) {
        FocusRequester focusRequester0;
        FocusProperties focusProperties0 = focusTargetNode0.fetchFocusProperties$ui_release();
        if(FocusDirection.equals-impl0(v, 1)) {
            return focusProperties0.getNext();
        }
        if(FocusDirection.equals-impl0(v, 2)) {
            return focusProperties0.getPrevious();
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return focusProperties0.getUp();
        }
        if(FocusDirection.equals-impl0(v, 6)) {
            return focusProperties0.getDown();
        }
        if(FocusDirection.equals-impl0(v, 3)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    focusRequester0 = focusProperties0.getStart();
                    break;
                }
                case 2: {
                    focusRequester0 = focusProperties0.getEnd();
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(focusRequester0 == FocusRequester.Companion.getDefault()) {
                focusRequester0 = null;
            }
            return focusRequester0 == null ? focusProperties0.getLeft() : focusRequester0;
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    focusRequester0 = focusProperties0.getEnd();
                    break;
                }
                case 2: {
                    focusRequester0 = focusProperties0.getStart();
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(focusRequester0 == FocusRequester.Companion.getDefault()) {
                focusRequester0 = null;
            }
            return focusRequester0 == null ? focusProperties0.getRight() : focusRequester0;
        }
        if(FocusDirection.equals-impl0(v, 7)) {
            return (FocusRequester)focusProperties0.getEnter().invoke(FocusDirection.box-impl(v));
        }
        if(!FocusDirection.equals-impl0(v, 8)) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        return (FocusRequester)focusProperties0.getExit().invoke(FocusDirection.box-impl(v));
    }

    @Nullable
    public static final FocusTargetNode findActiveFocusNode(@NotNull FocusTargetNode focusTargetNode0) {
        switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
            case 2: {
                if(!focusTargetNode0.getNode().isAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
                Node modifier$Node0 = focusTargetNode0.getNode().getChild$ui_release();
                if(modifier$Node0 == null) {
                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, focusTargetNode0.getNode());
                }
                else {
                    mutableVector0.add(modifier$Node0);
                }
                while(mutableVector0.isNotEmpty()) {
                    Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
                    if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                        DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
                    }
                    else {
                        while(modifier$Node1 != null) {
                            if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                                MutableVector mutableVector1 = null;
                                while(modifier$Node1 != null) {
                                    if(modifier$Node1 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode1 = FocusTraversalKt.findActiveFocusNode(((FocusTargetNode)modifier$Node1));
                                        if(focusTargetNode1 != null) {
                                            return focusTargetNode1;
                                        }
                                    }
                                    else if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                        Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                        int v = 0;
                                        while(modifier$Node2 != null) {
                                            if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                                ++v;
                                                if(v == 1) {
                                                    modifier$Node1 = modifier$Node2;
                                                }
                                                else {
                                                    if(mutableVector1 == null) {
                                                        mutableVector1 = new MutableVector(new Node[16], 0);
                                                    }
                                                    if(modifier$Node1 != null) {
                                                        mutableVector1.add(modifier$Node1);
                                                        modifier$Node1 = null;
                                                    }
                                                    mutableVector1.add(modifier$Node2);
                                                }
                                            }
                                            modifier$Node2 = modifier$Node2.getChild$ui_release();
                                        }
                                        if(v != 1) {
                                            goto label_43;
                                        }
                                        continue;
                                    }
                                label_43:
                                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector1);
                                }
                                break;
                            }
                            modifier$Node1 = modifier$Node1.getChild$ui_release();
                        }
                    }
                }
                return null;
            }
            case 1: 
            case 3: {
                return focusTargetNode0;
            }
            case 4: {
                return null;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final Rect focusRect(@NotNull FocusTargetNode focusTargetNode0) {
        NodeCoordinator nodeCoordinator0 = focusTargetNode0.getCoordinator$ui_release();
        if(nodeCoordinator0 != null) {
            Rect rect0 = LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator0).localBoundingBoxOf(nodeCoordinator0, false);
            return rect0 == null ? Rect.Companion.getZero() : rect0;
        }
        return Rect.Companion.getZero();
    }

    @Nullable
    public static final Boolean focusSearch-0X8WOeE(@NotNull FocusTargetNode focusTargetNode0, int v, @NotNull LayoutDirection layoutDirection0, @Nullable Rect rect0, @NotNull Function1 function10) {
        int v1;
        FocusTargetNode focusTargetNode1 = null;
        if((FocusDirection.equals-impl0(v, 1) ? true : FocusDirection.equals-impl0(v, 2))) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.oneDimensionalFocusSearch--OM-vw8(focusTargetNode0, v, function10));
        }
        if((((FocusDirection.equals-impl0(v, 3) ? true : FocusDirection.equals-impl0(v, 4)) ? true : FocusDirection.equals-impl0(v, 5)) ? true : FocusDirection.equals-impl0(v, 6))) {
            return TwoDimensionalFocusSearchKt.twoDimensionalFocusSearch-sMXa3k8(focusTargetNode0, v, rect0, function10);
        }
        if(FocusDirection.equals-impl0(v, 7)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    v1 = 4;
                    break;
                }
                case 2: {
                    v1 = 3;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            FocusTargetNode focusTargetNode2 = FocusTraversalKt.findActiveFocusNode(focusTargetNode0);
            return focusTargetNode2 == null ? null : TwoDimensionalFocusSearchKt.twoDimensionalFocusSearch-sMXa3k8(focusTargetNode2, v1, rect0, function10);
        }
        if(!FocusDirection.equals-impl0(v, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + FocusDirection.toString-impl(v)).toString());
        }
        FocusTargetNode focusTargetNode3 = FocusTraversalKt.findActiveFocusNode(focusTargetNode0);
        boolean z = false;
        if(focusTargetNode3 != null) {
            if(!focusTargetNode3.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node0 = focusTargetNode3.getNode().getParent$ui_release();
            LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
        label_20:
            while(layoutNode0 != null) {
                if((q.e(layoutNode0) & 0x400) != 0) {
                    while(modifier$Node0 != null) {
                        if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0) {
                            Node modifier$Node1 = modifier$Node0;
                            MutableVector mutableVector0 = null;
                            while(modifier$Node1 != null) {
                                if(!(modifier$Node1 instanceof FocusTargetNode)) {
                                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                        Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                        int v2 = 0;
                                        while(modifier$Node2 != null) {
                                            if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                                ++v2;
                                                if(v2 == 1) {
                                                    modifier$Node1 = modifier$Node2;
                                                }
                                                else {
                                                    if(mutableVector0 == null) {
                                                        mutableVector0 = new MutableVector(new Node[16], 0);
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
                                            goto label_49;
                                        }
                                        continue;
                                    }
                                }
                                else if(((FocusTargetNode)modifier$Node1).fetchFocusProperties$ui_release().getCanFocus()) {
                                    focusTargetNode1 = (FocusTargetNode)modifier$Node1;
                                    break label_20;
                                }
                            label_49:
                                modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                            }
                        }
                        modifier$Node0 = modifier$Node0.getParent$ui_release();
                    }
                }
                layoutNode0 = layoutNode0.getParent$ui_release();
                if(layoutNode0 != null) {
                    NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                    if(nodeChain0 != null) {
                        modifier$Node0 = nodeChain0.getTail$ui_release();
                        continue;
                    }
                }
                modifier$Node0 = null;
            }
        }
        if(focusTargetNode1 != null && !Intrinsics.areEqual(focusTargetNode1, focusTargetNode0)) {
            z = ((Boolean)function10.invoke(focusTargetNode1)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    @Nullable
    public static final FocusTargetNode getActiveChild(@NotNull FocusTargetNode focusTargetNode0) {
        if(!focusTargetNode0.getNode().isAttached()) {
            return null;
        }
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, focusTargetNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                        MutableVector mutableVector1 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                if(((FocusTargetNode)modifier$Node1).getNode().isAttached()) {
                                    switch(WhenMappings.$EnumSwitchMapping$1[((FocusTargetNode)modifier$Node1).getFocusState().ordinal()]) {
                                        case 1: 
                                        case 2: 
                                        case 3: {
                                            return (FocusTargetNode)modifier$Node1;
                                        }
                                    }
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            modifier$Node1 = modifier$Node2;
                                        }
                                        else {
                                            if(mutableVector1 == null) {
                                                mutableVector1 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node1 != null) {
                                                mutableVector1.add(modifier$Node1);
                                                modifier$Node1 = null;
                                            }
                                            mutableVector1.add(modifier$Node2);
                                        }
                                    }
                                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                                }
                                if(v != 1) {
                                    goto label_43;
                                }
                                continue;
                            }
                        label_43:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        return null;
    }

    public static final boolean isEligibleForFocusSearch(@NotNull FocusTargetNode focusTargetNode0) {
        NodeCoordinator nodeCoordinator0 = focusTargetNode0.getCoordinator$ui_release();
        if(nodeCoordinator0 != null) {
            LayoutNode layoutNode0 = nodeCoordinator0.getLayoutNode();
            if(layoutNode0 != null && layoutNode0.isPlaced()) {
                NodeCoordinator nodeCoordinator1 = focusTargetNode0.getCoordinator$ui_release();
                if(nodeCoordinator1 != null) {
                    LayoutNode layoutNode1 = nodeCoordinator1.getLayoutNode();
                    return layoutNode1 != null && layoutNode1.isAttached();
                }
            }
        }
        return false;
    }
}


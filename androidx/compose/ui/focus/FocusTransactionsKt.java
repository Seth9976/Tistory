package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import o1.k;
import o1.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A \u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0013\u0010\b\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001A\u0013\u0010\t\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0003\u001A\u0013\u0010\n\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0003\u001A%\u0010\r\u001A\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u000B\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u001E\u0010\u0012\u001A\u00020\u000F*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u001E\u0010\u0014\u001A\u00020\u000F*\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "requestFocus", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "requestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;", "performRequestFocus", "captureFocus", "freeFocus", "forced", "refreshFocusEvents", "clearFocus", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus", "performCustomClearFocus-Mxy_nc0", "performCustomClearFocus", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,312:1\n43#2,4:313\n47#2,4:320\n40#2,7:393\n47#2,4:403\n40#2,7:407\n47#2,4:417\n1#3:317\n1#3:332\n1#3:400\n1#3:414\n1#3:429\n1#3:498\n1#3:559\n1#3:568\n1#3:629\n728#4,2:318\n728#4,2:401\n728#4,2:415\n94#5:324\n94#5:421\n94#5:490\n94#5:560\n283#6:325\n251#6,5:326\n62#6:331\n63#6,8:333\n432#6,5:341\n284#6:346\n437#6:347\n442#6,2:349\n444#6,8:354\n452#6,9:365\n461#6,8:377\n72#6,7:385\n286#6:392\n283#6:422\n251#6,5:423\n62#6:428\n63#6,8:430\n432#6,5:438\n284#6:443\n437#6:444\n442#6,2:446\n444#6,8:451\n452#6,9:462\n461#6,8:474\n72#6,7:482\n286#6:489\n283#6:491\n251#6,5:492\n62#6:497\n63#6,8:499\n432#6,5:507\n284#6:512\n437#6:513\n442#6,2:515\n444#6,8:520\n452#6,9:531\n461#6,8:543\n72#6,7:551\n286#6:558\n283#6:561\n251#6,5:562\n62#6:567\n63#6,8:569\n432#6,5:577\n284#6:582\n437#6:583\n442#6,2:585\n444#6,8:590\n452#6,9:601\n461#6,8:613\n72#6,7:621\n286#6:628\n264#7:348\n264#7:445\n264#7:514\n264#7:584\n245#8,3:351\n248#8,3:374\n245#8,3:448\n248#8,3:471\n245#8,3:517\n248#8,3:540\n245#8,3:587\n248#8,3:610\n1208#9:362\n1187#9,2:363\n1208#9:459\n1187#9,2:460\n1208#9:528\n1187#9,2:529\n1208#9:598\n1187#9,2:599\n139#10,12:630\n166#10,12:642\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n46#1:313,4\n46#1:320,4\n94#1:393,7\n94#1:403,4\n113#1:407,7\n113#1:417,4\n46#1:317\n69#1:332\n94#1:400\n113#1:414\n202#1:429\n220#1:498\n268#1:568\n46#1:318,2\n94#1:401,2\n113#1:415,2\n69#1:324\n202#1:421\n220#1:490\n268#1:560\n69#1:325\n69#1:326,5\n69#1:331\n69#1:333,8\n69#1:341,5\n69#1:346\n69#1:347\n69#1:349,2\n69#1:354,8\n69#1:365,9\n69#1:377,8\n69#1:385,7\n69#1:392\n202#1:422\n202#1:423,5\n202#1:428\n202#1:430,8\n202#1:438,5\n202#1:443\n202#1:444\n202#1:446,2\n202#1:451,8\n202#1:462,9\n202#1:474,8\n202#1:482,7\n202#1:489\n220#1:491\n220#1:492,5\n220#1:497\n220#1:499,8\n220#1:507,5\n220#1:512\n220#1:513\n220#1:515,2\n220#1:520,8\n220#1:531,9\n220#1:543,8\n220#1:551,7\n220#1:558\n268#1:561\n268#1:562,5\n268#1:567\n268#1:569,8\n268#1:577,5\n268#1:582\n268#1:583\n268#1:585,2\n268#1:590,8\n268#1:601,9\n268#1:613,8\n268#1:621,7\n268#1:628\n69#1:348\n202#1:445\n220#1:514\n268#1:584\n69#1:351,3\n69#1:374,3\n202#1:448,3\n202#1:471,3\n220#1:517,3\n220#1:540,3\n268#1:587,3\n268#1:610,3\n69#1:362\n69#1:363,2\n202#1:459\n202#1:460,2\n220#1:528\n220#1:529,2\n268#1:598\n268#1:599,2\n295#1:630,12\n306#1:642,12\n*E\n"})
public final class FocusTransactionsKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[CustomDestinationResult.values().length];
            try {
                arr_v[CustomDestinationResult.None.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CustomDestinationResult.Redirected.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CustomDestinationResult.Cancelled.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
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
                arr_v1[FocusStateImpl.Captured.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[FocusStateImpl.ActiveParent.ordinal()] = 3;
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

    public static final void a(FocusTargetNode focusTargetNode0) {
        ObserverModifierNodeKt.observeReads(focusTargetNode0, new k(focusTargetNode0, 1));
        switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
            case 3: 
            case 4: {
                focusTargetNode0.setFocusState(FocusStateImpl.Active);
            }
        }
    }

    public static final CustomDestinationResult b(FocusTargetNode focusTargetNode0, int v) {
        if(!focusTargetNode0.o) {
            focusTargetNode0.o = true;
            try {
                FocusRequester focusRequester0 = (FocusRequester)focusTargetNode0.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.box-impl(v));
                Companion focusRequester$Companion0 = FocusRequester.Companion;
                if(focusRequester0 != focusRequester$Companion0.getDefault()) {
                    if(focusRequester0 == focusRequester$Companion0.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequester0.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            }
            finally {
                focusTargetNode0.o = false;
            }
        }
        return CustomDestinationResult.None;
    }

    public static final boolean c(FocusTargetNode focusTargetNode0, FocusTargetNode focusTargetNode1) {
        Node modifier$Node4;
        if(!focusTargetNode1.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = focusTargetNode1.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode1);
    alab1:
        while(true) {
            Node modifier$Node1 = null;
            if(layoutNode0 == null) {
                break;
            }
            if((q.e(layoutNode0) & 0x400) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0) {
                        modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                break alab1;
                            }
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
                                if(v != 1) {
                                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                }
                            }
                            else {
                                modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                            }
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
        if(Intrinsics.areEqual(modifier$Node1, focusTargetNode0)) {
            switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
                case 1: {
                    FocusTransactionsKt.a(focusTargetNode1);
                    focusTargetNode0.setFocusState(FocusStateImpl.ActiveParent);
                    return true;
                }
                case 2: {
                    return false;
                }
                case 3: {
                    if(FocusTraversalKt.getActiveChild(focusTargetNode0) == null) {
                        throw new IllegalArgumentException("ActiveParent with no focused child");
                    }
                    FocusTargetNode focusTargetNode2 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                    if(!(focusTargetNode2 == null ? true : FocusTransactionsKt.clearFocus(focusTargetNode2, false, true))) {
                        return false;
                    }
                    FocusTransactionsKt.a(focusTargetNode1);
                    return true;
                }
                case 4: {
                    if(!focusTargetNode0.getNode().isAttached()) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    Node modifier$Node3 = focusTargetNode0.getNode().getParent$ui_release();
                    LayoutNode layoutNode1 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
                alab2:
                    while(true) {
                        modifier$Node4 = null;
                        if(layoutNode1 == null) {
                            break;
                        }
                        if((q.e(layoutNode1) & 0x400) != 0) {
                            while(modifier$Node3 != null) {
                                if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0) {
                                    modifier$Node4 = modifier$Node3;
                                    MutableVector mutableVector1 = null;
                                    while(modifier$Node4 != null) {
                                        if(modifier$Node4 instanceof FocusTargetNode) {
                                            break alab2;
                                        }
                                        if((modifier$Node4.getKindSet$ui_release() & 0x400) != 0 && modifier$Node4 instanceof DelegatingNode) {
                                            Node modifier$Node5 = ((DelegatingNode)modifier$Node4).getDelegate$ui_release();
                                            int v1 = 0;
                                            while(modifier$Node5 != null) {
                                                if((modifier$Node5.getKindSet$ui_release() & 0x400) != 0) {
                                                    ++v1;
                                                    if(v1 == 1) {
                                                        modifier$Node4 = modifier$Node5;
                                                    }
                                                    else {
                                                        if(mutableVector1 == null) {
                                                            mutableVector1 = new MutableVector(new Node[16], 0);
                                                        }
                                                        if(modifier$Node4 != null) {
                                                            mutableVector1.add(modifier$Node4);
                                                            modifier$Node4 = null;
                                                        }
                                                        mutableVector1.add(modifier$Node5);
                                                    }
                                                }
                                                modifier$Node5 = modifier$Node5.getChild$ui_release();
                                            }
                                            if(v1 != 1) {
                                                modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector1);
                                            }
                                        }
                                        else {
                                            modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector1);
                                        }
                                    }
                                }
                                modifier$Node3 = modifier$Node3.getParent$ui_release();
                            }
                        }
                        layoutNode1 = layoutNode1.getParent$ui_release();
                        if(layoutNode1 != null) {
                            NodeChain nodeChain1 = layoutNode1.getNodes$ui_release();
                            if(nodeChain1 != null) {
                                modifier$Node3 = nodeChain1.getTail$ui_release();
                                continue;
                            }
                        }
                        modifier$Node3 = null;
                    }
                    if(((FocusTargetNode)modifier$Node4) == null && DelegatableNodeKt.requireOwner(focusTargetNode0).getFocusOwner().requestFocusForOwner-7o62pno(null, null)) {
                        FocusTransactionsKt.a(focusTargetNode1);
                        focusTargetNode0.setFocusState(FocusStateImpl.ActiveParent);
                        return true;
                    }
                    if(((FocusTargetNode)modifier$Node4) != null && FocusTransactionsKt.c(((FocusTargetNode)modifier$Node4), focusTargetNode0)) {
                        boolean z = FocusTransactionsKt.c(focusTargetNode0, focusTargetNode1);
                        if(focusTargetNode0.getFocusState() != FocusStateImpl.ActiveParent) {
                            throw new IllegalStateException("Deactivated node is focused");
                        }
                        if(z) {
                            FocusEventModifierNodeKt.refreshFocusEventNodes(((FocusTargetNode)modifier$Node4));
                            return true;
                        }
                    }
                    return false;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.");
    }

    public static final boolean captureFocus(@NotNull FocusTargetNode focusTargetNode0) {
        FocusTransactionManager focusTransactionManager0 = FocusTargetNodeKt.requireTransactionManager(focusTargetNode0);
        try {
            if(focusTransactionManager0.c) {
                FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
            }
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            boolean z = true;
            switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
                case 1: {
                    focusTargetNode0.setFocusState(FocusStateImpl.Captured);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
                    break;
                }
                case 2: {
                    break;
                }
                case 3: 
                case 4: {
                    z = false;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return z;
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
    }

    public static final boolean clearFocus(@NotNull FocusTargetNode focusTargetNode0, boolean z, boolean z1) {
        switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
            case 1: {
                focusTargetNode0.setFocusState(FocusStateImpl.Inactive);
                if(!z1) {
                    return true;
                }
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
                return true;
            }
            case 2: {
                if(z) {
                    focusTargetNode0.setFocusState(FocusStateImpl.Inactive);
                    if(z1) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
                        return true;
                    }
                }
                return z;
            }
            case 3: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if((focusTargetNode1 == null ? true : FocusTransactionsKt.clearFocus(focusTargetNode1, z, z1))) {
                    focusTargetNode0.setFocusState(FocusStateImpl.Inactive);
                    if(z1) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            case 4: {
                return true;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static boolean clearFocus$default(FocusTargetNode focusTargetNode0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return FocusTransactionsKt.clearFocus(focusTargetNode0, z, z1);
    }

    public static final boolean freeFocus(@NotNull FocusTargetNode focusTargetNode0) {
        FocusTransactionManager focusTransactionManager0 = FocusTargetNodeKt.requireTransactionManager(focusTargetNode0);
        try {
            if(focusTransactionManager0.c) {
                FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
            }
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            boolean z = true;
            switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
                case 1: {
                    break;
                }
                case 2: {
                    focusTargetNode0.setFocusState(FocusStateImpl.Active);
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
                    break;
                }
                case 3: 
                case 4: {
                    z = false;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return z;
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
    }

    @NotNull
    public static final CustomDestinationResult performCustomClearFocus-Mxy_nc0(@NotNull FocusTargetNode focusTargetNode0, int v) {
        switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
            case 2: {
                return CustomDestinationResult.Cancelled;
            }
            case 3: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if(focusTargetNode1 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CustomDestinationResult customDestinationResult0 = FocusTransactionsKt.performCustomClearFocus-Mxy_nc0(focusTargetNode1, v);
                CustomDestinationResult customDestinationResult1 = CustomDestinationResult.None;
                if(customDestinationResult0 == customDestinationResult1) {
                    customDestinationResult0 = null;
                }
                if(customDestinationResult0 == null) {
                    if(!focusTargetNode0.n) {
                        focusTargetNode0.n = true;
                        try {
                            FocusRequester focusRequester0 = (FocusRequester)focusTargetNode0.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.box-impl(v));
                            Companion focusRequester$Companion0 = FocusRequester.Companion;
                            if(focusRequester0 != focusRequester$Companion0.getDefault()) {
                                if(focusRequester0 == focusRequester$Companion0.getCancel()) {
                                    customDestinationResult1 = CustomDestinationResult.Cancelled;
                                }
                                else {
                                    customDestinationResult1 = focusRequester0.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                                }
                            }
                            return customDestinationResult1;
                        }
                        finally {
                            focusTargetNode0.n = false;
                        }
                    }
                    return customDestinationResult1;
                }
                return customDestinationResult0;
            }
            case 1: 
            case 4: {
                return CustomDestinationResult.None;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final CustomDestinationResult performCustomRequestFocus-Mxy_nc0(@NotNull FocusTargetNode focusTargetNode0, int v) {
        CustomDestinationResult customDestinationResult0;
        Node modifier$Node1;
        switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
            case 1: 
            case 2: {
                return CustomDestinationResult.None;
            }
            case 3: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if(focusTargetNode1 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                return FocusTransactionsKt.performCustomClearFocus-Mxy_nc0(focusTargetNode1, v);
            }
            case 4: {
                if(focusTargetNode0.getNode().isAttached()) {
                    Node modifier$Node0 = focusTargetNode0.getNode().getParent$ui_release();
                    LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
                alab1:
                    while(true) {
                        modifier$Node1 = null;
                        customDestinationResult0 = null;
                        if(layoutNode0 == null) {
                            break;
                        }
                        if((q.e(layoutNode0) & 0x400) != 0) {
                            while(modifier$Node0 != null) {
                                if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0) {
                                    modifier$Node1 = modifier$Node0;
                                    MutableVector mutableVector0 = null;
                                    while(modifier$Node1 != null) {
                                        if(modifier$Node1 instanceof FocusTargetNode) {
                                            break alab1;
                                        }
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
                                            if(v1 != 1) {
                                                modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                            }
                                        }
                                        else {
                                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                        }
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
                    if(((FocusTargetNode)modifier$Node1) == null) {
                        return CustomDestinationResult.None;
                    }
                    switch(WhenMappings.$EnumSwitchMapping$1[((FocusTargetNode)modifier$Node1).getFocusState().ordinal()]) {
                        case 1: {
                            return FocusTransactionsKt.b(((FocusTargetNode)modifier$Node1), v);
                        }
                        case 2: {
                            return CustomDestinationResult.Cancelled;
                        }
                        case 3: {
                            return FocusTransactionsKt.performCustomRequestFocus-Mxy_nc0(((FocusTargetNode)modifier$Node1), v);
                        }
                        case 4: {
                            CustomDestinationResult customDestinationResult1 = FocusTransactionsKt.performCustomRequestFocus-Mxy_nc0(((FocusTargetNode)modifier$Node1), v);
                            if(customDestinationResult1 != CustomDestinationResult.None) {
                                customDestinationResult0 = customDestinationResult1;
                            }
                            return customDestinationResult0 == null ? FocusTransactionsKt.b(((FocusTargetNode)modifier$Node1), v) : customDestinationResult0;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean performRequestFocus(@NotNull FocusTargetNode focusTargetNode0) {
        Node modifier$Node1;
        boolean z = true;
        switch(WhenMappings.$EnumSwitchMapping$1[focusTargetNode0.getFocusState().ordinal()]) {
            case 1: 
            case 2: {
            label_62:
                if(z) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode0);
                }
                return z;
            }
            case 3: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if((focusTargetNode1 == null ? true : FocusTransactionsKt.clearFocus(focusTargetNode1, false, true))) {
                    FocusTransactionsKt.a(focusTargetNode0);
                    goto label_62;
                }
                z = false;
                goto label_62;
            }
            case 4: {
                if(!focusTargetNode0.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                Node modifier$Node0 = focusTargetNode0.getNode().getParent$ui_release();
                LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
            alab1:
                while(true) {
                    modifier$Node1 = null;
                    if(layoutNode0 == null) {
                        break;
                    }
                    if((q.e(layoutNode0) & 0x400) != 0) {
                        while(modifier$Node0 != null) {
                            if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0) {
                                modifier$Node1 = modifier$Node0;
                                MutableVector mutableVector0 = null;
                                while(modifier$Node1 != null) {
                                    if(modifier$Node1 instanceof FocusTargetNode) {
                                        break alab1;
                                    }
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
                                        if(v != 1) {
                                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                        }
                                    }
                                    else {
                                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                                    }
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
                if(((FocusTargetNode)modifier$Node1) != null) {
                    FocusStateImpl focusStateImpl0 = ((FocusTargetNode)modifier$Node1).getFocusState();
                    z = FocusTransactionsKt.c(((FocusTargetNode)modifier$Node1), focusTargetNode0);
                    if(z && focusStateImpl0 != ((FocusTargetNode)modifier$Node1).getFocusState()) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(((FocusTargetNode)modifier$Node1));
                    }
                }
                else if(DelegatableNodeKt.requireOwner(focusTargetNode0).getFocusOwner().requestFocusForOwner-7o62pno(null, null)) {
                    FocusTransactionsKt.a(focusTargetNode0);
                }
                else {
                    z = false;
                }
                goto label_62;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean requestFocus(@NotNull FocusTargetNode focusTargetNode0) {
        Boolean boolean0 = FocusTransactionsKt.requestFocus-Mxy_nc0(focusTargetNode0, 7);
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Nullable
    public static final Boolean requestFocus-Mxy_nc0(@NotNull FocusTargetNode focusTargetNode0, int v) {
        Boolean boolean0;
        FocusTransactionManager focusTransactionManager0 = FocusTargetNodeKt.requireTransactionManager(focusTargetNode0);
        m m0 = new m(focusTargetNode0);
        try {
            if(focusTransactionManager0.c) {
                FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
            }
            FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
            focusTransactionManager0.b.add(m0);
            switch(WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.performCustomRequestFocus-Mxy_nc0(focusTargetNode0, v).ordinal()]) {
                case 1: {
                    boolean0 = Boolean.valueOf(FocusTransactionsKt.performRequestFocus(focusTargetNode0));
                    break;
                }
                case 2: {
                    boolean0 = Boolean.TRUE;
                    break;
                }
                case 3: 
                case 4: {
                    boolean0 = null;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return boolean0;
        }
        finally {
            FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
        }
    }
}


package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.q;
import o1.n;
import o1.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A2\u0010\b\u001A\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "oneDimensionalFocusSearch", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,266:1\n181#1,3:340\n184#1,2:344\n187#1,5:347\n196#1,3:352\n199#1,2:356\n202#1,5:359\n1187#2,2:267\n1208#2:274\n1187#2,2:275\n1187#2,2:364\n1208#2:371\n1187#2,2:372\n1187#2,2:448\n1208#2:455\n1187#2,2:456\n1208#2:570\n1187#2,2:571\n94#3:269\n94#3:366\n94#3:450\n94#3:532\n297#4:270\n137#4:271\n138#4:273\n139#4,7:277\n146#4,9:285\n432#4,6:294\n442#4,2:301\n444#4,17:306\n461#4,8:326\n155#4,6:334\n297#4:367\n137#4:368\n138#4:370\n139#4,7:374\n146#4,9:382\n432#4,6:391\n442#4,2:398\n444#4,17:403\n461#4,8:423\n155#4,6:431\n297#4:451\n137#4:452\n138#4:454\n139#4,7:458\n146#4,9:466\n432#4,6:475\n442#4,2:482\n444#4,17:487\n461#4,8:507\n155#4,6:515\n283#4:533\n251#4,5:534\n62#4:539\n63#4,8:541\n432#4,5:549\n284#4:554\n437#4:555\n442#4,2:557\n444#4,8:562\n452#4,9:573\n461#4,8:585\n72#4,7:593\n286#4:600\n1#5:272\n1#5:369\n1#5:453\n1#5:540\n48#6:284\n53#6:343\n523#6:346\n53#6:355\n523#6:358\n48#6:381\n204#6,11:437\n48#6:465\n492#6,11:521\n53#6:601\n523#6:602\n523#6:603\n53#6:604\n523#6:605\n523#6:606\n264#7:300\n264#7:397\n264#7:481\n264#7:556\n245#8,3:303\n248#8,3:323\n245#8,3:400\n248#8,3:420\n245#8,3:484\n248#8,3:504\n245#8,3:559\n248#8,3:582\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n133#1:340,3\n133#1:344,2\n133#1:347,5\n136#1:352,3\n136#1:356,2\n136#1:359,5\n128#1:267,2\n129#1:274\n129#1:275,2\n154#1:364,2\n155#1:371\n155#1:372,2\n164#1:448,2\n165#1:455\n165#1:456,2\n176#1:570\n176#1:571,2\n129#1:269\n155#1:366\n165#1:450\n176#1:532\n129#1:270\n129#1:271\n129#1:273\n129#1:277,7\n129#1:285,9\n129#1:294,6\n129#1:301,2\n129#1:306,17\n129#1:326,8\n129#1:334,6\n155#1:367\n155#1:368\n155#1:370\n155#1:374,7\n155#1:382,9\n155#1:391,6\n155#1:398,2\n155#1:403,17\n155#1:423,8\n155#1:431,6\n165#1:451\n165#1:452\n165#1:454\n165#1:458,7\n165#1:466,9\n165#1:475,6\n165#1:482,2\n165#1:487,17\n165#1:507,8\n165#1:515,6\n176#1:533\n176#1:534,5\n176#1:539\n176#1:541,8\n176#1:549,5\n176#1:554\n176#1:555\n176#1:557,2\n176#1:562,8\n176#1:573,9\n176#1:585,8\n176#1:593,7\n176#1:600\n129#1:272\n155#1:369\n165#1:453\n176#1:540\n129#1:284\n133#1:343\n133#1:346\n136#1:355\n136#1:358\n155#1:381\n158#1:437,11\n165#1:465\n168#1:521,11\n183#1:601\n185#1:602\n187#1:603\n198#1:604\n200#1:605\n202#1:606\n129#1:300\n155#1:397\n165#1:481\n176#1:556\n129#1:303,3\n129#1:323,3\n155#1:400,3\n155#1:420,3\n165#1:484,3\n165#1:504,3\n176#1:559,3\n176#1:582,3\n*E\n"})
public final class OneDimensionalFocusSearchKt {
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

    public static final boolean a(FocusTargetNode focusTargetNode0, Function1 function10) {
        FocusStateImpl focusStateImpl0 = focusTargetNode0.getFocusState();
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        switch(arr_v[focusStateImpl0.ordinal()]) {
            case 1: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if(focusTargetNode1 != null) {
                    switch(arr_v[focusTargetNode1.getFocusState().ordinal()]) {
                        case 1: {
                            return OneDimensionalFocusSearchKt.a(focusTargetNode1, function10) || OneDimensionalFocusSearchKt.c(focusTargetNode0, focusTargetNode1, 2, function10) || focusTargetNode1.fetchFocusProperties$ui_release().getCanFocus() && ((Boolean)function10.invoke(focusTargetNode1)).booleanValue();
                        }
                        case 2: 
                        case 3: {
                            return OneDimensionalFocusSearchKt.c(focusTargetNode0, focusTargetNode1, 2, function10);
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
                return OneDimensionalFocusSearchKt.d(focusTargetNode0, function10);
            }
            case 4: {
                if(!OneDimensionalFocusSearchKt.d(focusTargetNode0, function10)) {
                    return focusTargetNode0.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean)function10.invoke(focusTargetNode0)).booleanValue() : false;
                }
                return true;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean b(FocusTargetNode focusTargetNode0, Function1 function10) {
        switch(WhenMappings.$EnumSwitchMapping$0[focusTargetNode0.getFocusState().ordinal()]) {
            case 1: {
                FocusTargetNode focusTargetNode1 = FocusTraversalKt.getActiveChild(focusTargetNode0);
                if(focusTargetNode1 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                return OneDimensionalFocusSearchKt.b(focusTargetNode1, function10) || OneDimensionalFocusSearchKt.c(focusTargetNode0, focusTargetNode1, 1, function10);
            }
            case 2: 
            case 3: {
                return OneDimensionalFocusSearchKt.e(focusTargetNode0, function10);
            }
            case 4: {
                return focusTargetNode0.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean)function10.invoke(focusTargetNode0)).booleanValue() : OneDimensionalFocusSearchKt.e(focusTargetNode0, function10);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean c(FocusTargetNode focusTargetNode0, FocusTargetNode focusTargetNode1, int v, Function1 function10) {
        if(OneDimensionalFocusSearchKt.f(focusTargetNode0, focusTargetNode1, v, function10)) {
            return true;
        }
        Boolean boolean0 = (Boolean)BeyondBoundsLayoutKt.searchBeyondBounds--OM-vw8(focusTargetNode0, v, new o(focusTargetNode0, focusTargetNode1, v, function10));
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final boolean d(FocusTargetNode focusTargetNode0, Function1 function10) {
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
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                mutableVector0.add(((FocusTargetNode)modifier$Node1));
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
                                    goto label_40;
                                }
                                continue;
                            }
                        label_40:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        mutableVector0.sortWith(n.a);
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            int v2 = v1 - 1;
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                FocusTargetNode focusTargetNode1 = (FocusTargetNode)arr_object[v2];
                if(FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode1) && OneDimensionalFocusSearchKt.a(focusTargetNode1, function10)) {
                    return true;
                }
                --v2;
                if(v2 < 0) {
                    break;
                }
            }
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode0, Function1 function10) {
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
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                mutableVector0.add(((FocusTargetNode)modifier$Node1));
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
                                    goto label_40;
                                }
                                continue;
                            }
                        label_40:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        mutableVector0.sortWith(n.a);
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                FocusTargetNode focusTargetNode1 = (FocusTargetNode)arr_object[v2];
                if(FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode1) && OneDimensionalFocusSearchKt.b(focusTargetNode1, function10)) {
                    return true;
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        return false;
    }

    public static final boolean f(FocusTargetNode focusTargetNode0, FocusTargetNode focusTargetNode1, int v, Function1 function10) {
        if(focusTargetNode0.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
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
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                mutableVector0.add(((FocusTargetNode)modifier$Node1));
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
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
                        label_41:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        mutableVector0.sortWith(n.a);
        if(FocusDirection.equals-impl0(v, 1)) {
            IntRange intRange0 = new IntRange(0, mutableVector0.getSize() - 1);
            int v2 = intRange0.getFirst();
            int v3 = intRange0.getLast();
            if(v2 > v3) {
                goto label_76;
            }
            boolean z = false;
            while(true) {
                if(z) {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode)mutableVector0.getContent()[v2];
                    if(FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && OneDimensionalFocusSearchKt.b(focusTargetNode2, function10)) {
                        return true;
                    }
                }
                if(Intrinsics.areEqual(mutableVector0.getContent()[v2], focusTargetNode1)) {
                    z = true;
                }
                if(v2 == v3) {
                    goto label_76;
                }
                ++v2;
            }
        }
        if(!FocusDirection.equals-impl0(v, 2)) {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        IntRange intRange1 = new IntRange(0, mutableVector0.getSize() - 1);
        int v4 = intRange1.getFirst();
        int v5 = intRange1.getLast();
        if(v4 <= v5) {
            boolean z1 = false;
            while(true) {
                if(z1) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode)mutableVector0.getContent()[v5];
                    if(FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && OneDimensionalFocusSearchKt.a(focusTargetNode3, function10)) {
                        return true;
                    }
                }
                if(Intrinsics.areEqual(mutableVector0.getContent()[v5], focusTargetNode1)) {
                    z1 = true;
                }
                if(v5 == v4) {
                    break;
                }
                --v5;
            }
        }
    label_76:
        if(!FocusDirection.equals-impl0(v, 1) && focusTargetNode0.fetchFocusProperties$ui_release().getCanFocus()) {
            if(!focusTargetNode0.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            Node modifier$Node3 = focusTargetNode0.getNode().getParent$ui_release();
            LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
            while(layoutNode0 != null) {
                if((q.e(layoutNode0) & 0x400) != 0) {
                    while(modifier$Node3 != null) {
                        if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0) {
                            Node modifier$Node4 = modifier$Node3;
                            MutableVector mutableVector3 = null;
                            while(modifier$Node4 != null) {
                                if(modifier$Node4 instanceof FocusTargetNode) {
                                    return modifier$Node4 == null ? false : ((Boolean)function10.invoke(focusTargetNode0)).booleanValue();
                                }
                                if((modifier$Node4.getKindSet$ui_release() & 0x400) != 0 && modifier$Node4 instanceof DelegatingNode) {
                                    Node modifier$Node5 = ((DelegatingNode)modifier$Node4).getDelegate$ui_release();
                                    int v6 = 0;
                                    while(modifier$Node5 != null) {
                                        if((modifier$Node5.getKindSet$ui_release() & 0x400) != 0) {
                                            ++v6;
                                            if(v6 == 1) {
                                                modifier$Node4 = modifier$Node5;
                                            }
                                            else {
                                                if(mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node4 != null) {
                                                    mutableVector3.add(modifier$Node4);
                                                    modifier$Node4 = null;
                                                }
                                                mutableVector3.add(modifier$Node5);
                                            }
                                        }
                                        modifier$Node5 = modifier$Node5.getChild$ui_release();
                                    }
                                    if(v6 != 1) {
                                        modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector3);
                                    }
                                }
                                else {
                                    modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector3);
                                }
                            }
                        }
                        modifier$Node3 = modifier$Node3.getParent$ui_release();
                    }
                }
                layoutNode0 = layoutNode0.getParent$ui_release();
                if(layoutNode0 != null) {
                    NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                    if(nodeChain0 != null) {
                        modifier$Node3 = nodeChain0.getTail$ui_release();
                        continue;
                    }
                }
                modifier$Node3 = null;
            }
            return false;
        }
        return false;
    }

    public static final boolean oneDimensionalFocusSearch--OM-vw8(@NotNull FocusTargetNode focusTargetNode0, int v, @NotNull Function1 function10) {
        if(FocusDirection.equals-impl0(v, 1)) {
            return OneDimensionalFocusSearchKt.b(focusTargetNode0, function10);
        }
        if(!FocusDirection.equals-impl0(v, 2)) {
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        return OneDimensionalFocusSearchKt.a(focusTargetNode0, function10);
    }
}


package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import l1.a;
import o1.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00016B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000F\u0010\n\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000F\u0010\u000E\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000F\u0010\u001A\u001A\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u0007J\u000F\u0010\u001C\u001A\u00020\bH\u0000¢\u0006\u0004\b\u001B\u0010\u0007R\"\u0010$\u001A\u00020\u001D8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010,\u001A\u00020%2\u0006\u0010&\u001A\u00020%8V@VX\u0096\u000E¢\u0006\u0012\u0012\u0004\b+\u0010\u0007\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001A\u0010.\u001A\u00020-8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u0013\u00105\u001A\u0004\u0018\u0001028F¢\u0006\u0006\u001A\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "onObservedReadsChanged", "onDetach", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "()Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusRequester;", "block", "fetchCustomEnter-aToIllA$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomEnter", "fetchCustomExit-aToIllA$ui_release", "fetchCustomExit", "commitFocusState$ui_release", "commitFocusState", "invalidateFocus$ui_release", "invalidateFocus", "", "q", "I", "getPreviouslyFocusedChildHash", "()I", "setPreviouslyFocusedChildHash", "(I)V", "previouslyFocusedChildHash", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "getFocusState$annotations", "focusState", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,268:1\n1#2:269\n1#2:277\n1#2:289\n1#2:373\n1#2:387\n40#3,7:270\n47#3,4:280\n40#3,7:366\n47#3,4:376\n728#4,2:278\n728#4,2:374\n96#5:284\n94#5:285\n94#5:380\n94#5:446\n262#6,2:286\n62#6:288\n63#6,8:290\n264#6:298\n265#6,2:300\n432#6,12:302\n444#6,8:317\n452#6,9:328\n461#6,8:340\n268#6:348\n72#6,7:349\n269#6:356\n251#6,5:381\n62#6:386\n63#6,8:388\n432#6,6:396\n442#6,2:403\n444#6,8:408\n452#6,9:419\n461#6,8:431\n72#6,7:439\n310#6:447\n167#6:448\n168#6:456\n169#6,12:460\n311#6:472\n432#6,5:473\n312#6,2:478\n437#6:480\n442#6,2:482\n444#6,17:487\n461#6,8:507\n314#6:515\n181#6,8:516\n315#6:524\n264#7:299\n264#7:402\n264#7:481\n245#8,3:314\n248#8,3:337\n245#8,3:405\n248#8,3:428\n245#8,3:484\n248#8,3:504\n1208#9:325\n1187#9,2:326\n1208#9:416\n1187#9,2:417\n1208#9:457\n1187#9,2:458\n66#10,9:357\n42#10,7:449\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n105#1:277\n119#1:289\n250#1:373\n225#1:387\n105#1:270,7\n105#1:280,4\n250#1:366,7\n250#1:376,4\n105#1:278,2\n250#1:374,2\n119#1:284\n119#1:285\n225#1:380\n237#1:446\n119#1:286,2\n119#1:288\n119#1:290,8\n119#1:298\n119#1:300,2\n119#1:302,12\n119#1:317,8\n119#1:328,9\n119#1:340,8\n119#1:348\n119#1:349,7\n119#1:356\n225#1:381,5\n225#1:386\n225#1:388,8\n225#1:396,6\n225#1:403,2\n225#1:408,8\n225#1:419,9\n225#1:431,8\n225#1:439,7\n237#1:447\n237#1:448\n237#1:456\n237#1:460,12\n237#1:472\n237#1:473,5\n237#1:478,2\n237#1:480\n237#1:482,2\n237#1:487,17\n237#1:507,8\n237#1:515\n237#1:516,8\n237#1:524\n119#1:299\n225#1:402\n237#1:481\n119#1:314,3\n119#1:337,3\n225#1:405,3\n225#1:428,3\n237#1:484,3\n237#1:504,3\n119#1:325\n119#1:326,2\n225#1:416\n225#1:417,2\n237#1:457\n237#1:458,2\n181#1:357,9\n237#1:449,7\n*E\n"})
public final class FocusTargetNode extends Node implements FocusTargetModifierNode, ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001A\u00020\u0002H\u0016J\u0013\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u0002H\u0016J\f\u0010\u000E\u001A\u00020\f*\u00020\u000FH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class FocusTargetElement extends ModifierNodeElement {
        public static final int $stable;
        @NotNull
        public static final FocusTargetElement INSTANCE;

        static {
            FocusTargetElement.INSTANCE = new FocusTargetElement();
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public Node create() {
            return this.create();
        }

        @NotNull
        public FocusTargetNode create() {
            return new FocusTargetNode();
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@Nullable Object object0) {
            return object0 == this;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 0x67A7B089;
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
            inspectorInfo0.setName("focusTarget");
        }

        @Override  // androidx.compose.ui.node.ModifierNodeElement
        public void update(Node modifier$Node0) {
        }

        public void update(@NotNull FocusTargetNode focusTargetNode0) {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            try {
                arr_v[FocusStateImpl.Active.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.Captured.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.ActiveParent.ordinal()] = 3;
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

    public static final int $stable = 8;
    public boolean n;
    public boolean o;
    public FocusStateImpl p;
    public int q;

    public static final boolean b(FocusTargetNode focusTargetNode0) {
        if(!focusTargetNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
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
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                        Node modifier$Node3 = modifier$Node2;
                        MutableVector mutableVector1 = null;
                        while(modifier$Node3 != null) {
                            if(modifier$Node3 instanceof FocusTargetNode) {
                                if(((FocusTargetNode)modifier$Node3).p != null) {
                                    switch(WhenMappings.$EnumSwitchMapping$0[((FocusTargetNode)modifier$Node3).getFocusState().ordinal()]) {
                                        case 1: 
                                        case 2: 
                                        case 3: {
                                            return true;
                                        }
                                        case 4: {
                                            return false;
                                        }
                                        default: {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                            }
                            else if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0 && modifier$Node3 instanceof DelegatingNode) {
                                Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node4 != null) {
                                    if((modifier$Node4.getKindSet$ui_release() & 0x400) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            modifier$Node3 = modifier$Node4;
                                        }
                                        else {
                                            if(mutableVector1 == null) {
                                                mutableVector1 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node3 != null) {
                                                mutableVector1.add(modifier$Node3);
                                                modifier$Node3 = null;
                                            }
                                            mutableVector1.add(modifier$Node4);
                                        }
                                    }
                                    modifier$Node4 = modifier$Node4.getChild$ui_release();
                                }
                                if(v != 1) {
                                    goto label_41;
                                }
                                continue;
                            }
                        label_41:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                    }
                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                }
            }
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
        }
        return false;
    }

    public static final boolean c(FocusTargetNode focusTargetNode0) {
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = focusTargetNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x400) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                if(((FocusTargetNode)modifier$Node1).p != null) {
                                    switch(WhenMappings.$EnumSwitchMapping$0[((FocusTargetNode)modifier$Node1).getFocusState().ordinal()]) {
                                        case 3: {
                                            return true;
                                        }
                                        case 1: 
                                        case 2: 
                                        case 4: {
                                            return false;
                                        }
                                        default: {
                                            throw new NoWhenBranchMatchedException();
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
                                    goto label_34;
                                }
                                continue;
                            }
                        label_34:
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
        return false;
    }

    public final void commitFocusState$ui_release() {
        FocusStateImpl focusStateImpl0 = FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if(focusStateImpl0 == null) {
            throw a.b("committing a node that was not updated in the current transaction");
        }
        this.p = focusStateImpl0;
    }

    public final void fetchCustomEnter-aToIllA$ui_release(int v, @NotNull Function1 function10) {
        if(!this.o) {
            this.o = true;
            try {
                FocusRequester focusRequester0 = (FocusRequester)this.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.box-impl(v));
                if(focusRequester0 != FocusRequester.Companion.getDefault()) {
                    function10.invoke(focusRequester0);
                }
            }
            finally {
                this.o = false;
            }
        }
    }

    public final void fetchCustomExit-aToIllA$ui_release(int v, @NotNull Function1 function10) {
        if(!this.n) {
            this.n = true;
            try {
                FocusRequester focusRequester0 = (FocusRequester)this.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.box-impl(v));
                if(focusRequester0 != FocusRequester.Companion.getDefault()) {
                    function10.invoke(focusRequester0);
                }
            }
            finally {
                this.n = false;
            }
        }
    }

    @NotNull
    public final FocusProperties fetchFocusProperties$ui_release() {
        FocusProperties focusProperties0 = new FocusPropertiesImpl();
        Node modifier$Node0 = this.getNode();
        if(!this.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node1 = this.getNode();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(this);
    label_5:
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0xC00) != 0) {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0xC00) != 0) {
                        if(modifier$Node1 != modifier$Node0 && (modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                            break label_5;
                        }
                        if((modifier$Node1.getKindSet$ui_release() & 0x800) != 0) {
                            Node modifier$Node2 = modifier$Node1;
                            MutableVector mutableVector0 = null;
                            while(modifier$Node2 != null) {
                                if(modifier$Node2 instanceof FocusPropertiesModifierNode) {
                                    ((FocusPropertiesModifierNode)modifier$Node2).applyFocusProperties(focusProperties0);
                                }
                                else if((modifier$Node2.getKindSet$ui_release() & 0x800) != 0 && modifier$Node2 instanceof DelegatingNode) {
                                    Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node3 != null) {
                                        if((modifier$Node3.getKindSet$ui_release() & 0x800) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                modifier$Node2 = modifier$Node3;
                                            }
                                            else {
                                                if(mutableVector0 == null) {
                                                    mutableVector0 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node2 != null) {
                                                    mutableVector0.add(modifier$Node2);
                                                    modifier$Node2 = null;
                                                }
                                                mutableVector0.add(modifier$Node3);
                                            }
                                        }
                                        modifier$Node3 = modifier$Node3.getChild$ui_release();
                                    }
                                    if(v != 1) {
                                        goto label_35;
                                    }
                                    continue;
                                }
                            label_35:
                                modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                            }
                        }
                    }
                    modifier$Node1 = modifier$Node1.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node1 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node1 = null;
        }
        return focusProperties0;
    }

    @Nullable
    public final BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (BeyondBoundsLayout)this.getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override  // androidx.compose.ui.focus.FocusTargetModifierNode
    public FocusState getFocusState() {
        return this.getFocusState();
    }

    @NotNull
    public FocusStateImpl getFocusState() {
        FocusTransactionManager focusTransactionManager0 = FocusTargetNodeKt.access$getFocusTransactionManager(this);
        if(focusTransactionManager0 != null) {
            FocusStateImpl focusStateImpl0 = focusTransactionManager0.getUncommittedFocusState(this);
            if(focusStateImpl0 != null) {
                return focusStateImpl0;
            }
        }
        return this.p == null ? FocusStateImpl.Inactive : this.p;
    }

    @Override  // androidx.compose.ui.focus.FocusTargetModifierNode
    public static void getFocusState$annotations() {
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.q;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties0;
        if(this.p == null) {
            FocusTransactionManager focusTransactionManager0 = FocusTargetNodeKt.requireTransactionManager(this);
            try {
                if(focusTransactionManager0.c) {
                    FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
                }
                FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
                this.setFocusState((!FocusTargetNode.c(this) || !FocusTargetNode.b(this) ? FocusStateImpl.Inactive : FocusStateImpl.ActiveParent));
            }
            finally {
                FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
            }
        }
        switch(WhenMappings.$EnumSwitchMapping$0[this.getFocusState().ordinal()]) {
            case 1: 
            case 2: {
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ObserverModifierNodeKt.observeReads(this, new l(ref$ObjectRef0, this));
                Object object0 = ref$ObjectRef0.element;
                if(object0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                    focusProperties0 = null;
                }
                else {
                    focusProperties0 = (FocusProperties)object0;
                }
                if(!focusProperties0.getCanFocus()) {
                    DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
                }
            }
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.getFocusState().ordinal()]) {
            case 1: 
            case 2: {
                DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus-I7lrPNg(true, true, false, 8);
                FocusTargetNodeKt.invalidateFocusTarget(this);
                break;
            }
            case 3: {
                FocusTransactionManager focusTransactionManager0 = FocusTargetNodeKt.requireTransactionManager(this);
                try {
                    if(FocusTransactionManager.access$getOngoingTransaction$p(focusTransactionManager0)) {
                        FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
                    }
                    FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
                    this.setFocusState(FocusStateImpl.Inactive);
                }
                finally {
                    FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
                }
            }
        }
        this.p = null;
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        FocusStateImpl focusStateImpl0 = this.getFocusState();
        this.invalidateFocus$ui_release();
        if(focusStateImpl0 != this.getFocusState()) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    public void setFocusState(@NotNull FocusStateImpl focusStateImpl0) {
        FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl0);
    }

    public final void setPreviouslyFocusedChildHash(int v) {
        this.q = v;
    }
}


package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\f\u0010\u0003\u001A\u00020\u0004*\u00020\u0002H\u0000\u001A\f\u0010\u0005\u001A\u00020\u0004*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "invalidateFocusEvent", "", "refreshFocusEventNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,71:1\n94#2:72\n98#2:182\n94#2:183\n303#3:73\n432#3,6:74\n442#3,2:81\n444#3,8:86\n452#3,9:97\n461#3,8:109\n304#3:117\n137#3:118\n138#3,8:120\n146#3,9:129\n432#3,37:138\n155#3,6:175\n305#3:181\n262#3,2:184\n62#3:186\n63#3,8:188\n264#3:196\n265#3,2:198\n432#3,12:200\n444#3,8:215\n452#3,9:226\n461#3,8:238\n268#3:246\n72#3,7:247\n269#3:254\n264#4:80\n264#4:197\n245#5,3:83\n248#5,3:106\n245#5,3:212\n248#5,3:235\n1208#6:94\n1187#6,2:95\n1208#6:223\n1187#6,2:224\n1#7:119\n1#7:187\n48#8:128\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n47#1:72\n66#1:182\n66#1:183\n47#1:73\n47#1:74,6\n47#1:81,2\n47#1:86,8\n47#1:97,9\n47#1:109,8\n47#1:117\n47#1:118\n47#1:120,8\n47#1:129,9\n47#1:138,37\n47#1:175,6\n47#1:181\n66#1:184,2\n66#1:186\n66#1:188,8\n66#1:196\n66#1:198,2\n66#1:200,12\n66#1:215,8\n66#1:226,9\n66#1:238,8\n66#1:246\n66#1:247,7\n66#1:254\n47#1:80\n66#1:197\n47#1:83,3\n47#1:106,3\n66#1:212,3\n66#1:235,3\n47#1:94\n47#1:95,2\n66#1:223\n66#1:224,2\n47#1:119\n66#1:187\n47#1:128\n*E\n"})
public final class FocusEventModifierNodeKt {
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
                arr_v[FocusStateImpl.ActiveParent.ordinal()] = 2;
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

    @NotNull
    public static final FocusState getFocusState(@NotNull FocusEventModifierNode focusEventModifierNode0) {
        Node modifier$Node0 = focusEventModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof FocusTargetNode) {
                FocusState focusState0 = ((FocusTargetNode)modifier$Node0).getFocusState();
                switch(WhenMappings.$EnumSwitchMapping$0[((Enum)focusState0).ordinal()]) {
                    case 1: 
                    case 2: 
                    case 3: {
                        return focusState0;
                    }
                }
            }
            else if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0 && modifier$Node0 instanceof DelegatingNode) {
                Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                int v = 0;
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                        ++v;
                        if(v == 1) {
                            modifier$Node0 = modifier$Node1;
                        }
                        else {
                            if(mutableVector0 == null) {
                                mutableVector0 = new MutableVector(new Node[16], 0);
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
                    goto label_26;
                }
                continue;
            }
        label_26:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        if(!focusEventModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusEventModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusEventModifierNode0.getNode());
        }
        else {
            mutableVector1.add(modifier$Node2);
        }
        while(mutableVector1.isNotEmpty()) {
            Node modifier$Node3 = (Node)q.j(mutableVector1, 1);
            if((modifier$Node3.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, modifier$Node3);
            }
            else {
                while(modifier$Node3 != null) {
                    if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0) {
                        MutableVector mutableVector2 = null;
                        while(modifier$Node3 != null) {
                            if(modifier$Node3 instanceof FocusTargetNode) {
                                FocusState focusState1 = ((FocusTargetNode)modifier$Node3).getFocusState();
                                switch(WhenMappings.$EnumSwitchMapping$0[((Enum)focusState1).ordinal()]) {
                                    case 1: 
                                    case 2: 
                                    case 3: {
                                        return focusState1;
                                    }
                                }
                            }
                            else if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0 && modifier$Node3 instanceof DelegatingNode) {
                                Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                int v1 = 0;
                                while(modifier$Node4 != null) {
                                    if((modifier$Node4.getKindSet$ui_release() & 0x400) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            modifier$Node3 = modifier$Node4;
                                        }
                                        else {
                                            if(mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node3 != null) {
                                                mutableVector2.add(modifier$Node3);
                                                modifier$Node3 = null;
                                            }
                                            mutableVector2.add(modifier$Node4);
                                        }
                                    }
                                    modifier$Node4 = modifier$Node4.getChild$ui_release();
                                }
                                if(v1 != 1) {
                                    goto label_69;
                                }
                                continue;
                            }
                        label_69:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return FocusStateImpl.Inactive;
    }

    public static final void invalidateFocusEvent(@NotNull FocusEventModifierNode focusEventModifierNode0) {
        DelegatableNodeKt.requireOwner(focusEventModifierNode0).getFocusOwner().scheduleInvalidation(focusEventModifierNode0);
    }

    public static final void refreshFocusEventNodes(@NotNull FocusTargetNode focusTargetNode0) {
        Node modifier$Node0 = focusTargetNode0.getNode();
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node1 = focusTargetNode0.getNode();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
    label_4:
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x1400) != 0) {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x1400) != 0) {
                        if(modifier$Node1 != modifier$Node0 && (modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                            break label_4;
                        }
                        if((modifier$Node1.getKindSet$ui_release() & 0x1000) != 0) {
                            Node modifier$Node2 = modifier$Node1;
                            MutableVector mutableVector0 = null;
                            while(modifier$Node2 != null) {
                                if(modifier$Node2 instanceof FocusEventModifierNode) {
                                    ((FocusEventModifierNode)modifier$Node2).onFocusEvent(FocusEventModifierNodeKt.getFocusState(((FocusEventModifierNode)modifier$Node2)));
                                }
                                else if((modifier$Node2.getKindSet$ui_release() & 0x1000) != 0 && modifier$Node2 instanceof DelegatingNode) {
                                    Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node3 != null) {
                                        if((modifier$Node3.getKindSet$ui_release() & 0x1000) != 0) {
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
                                        goto label_34;
                                    }
                                    continue;
                                }
                            label_34:
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
    }
}


package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import b2.e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u001A#\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0001H\u0080\fø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A#\u0010\n\u001A\u00020\u0007*\u00020\u00002\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0001H\u0080\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A\u0017\u0010\r\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u0017\u0010\r\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\r\u0010\u0011\u001A\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001A\u0017\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001A\u0017\u0010\u0016\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001A\'\u0010\u0019\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u001A\u0017\u0010\u001B\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u001B\u0010\u0011\"\u001C\u0010\u001E\u001A\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "other", "or-64DMado", "(II)I", "or", "value", "", "contains-64DMado", "(II)Z", "contains", "Landroidx/compose/ui/Modifier$Element;", "element", "calculateNodeKindSetFrom", "(Landroidx/compose/ui/Modifier$Element;)I", "Landroidx/compose/ui/Modifier$Node;", "node", "(Landroidx/compose/ui/Modifier$Node;)I", "", "autoInvalidateRemovedNode", "(Landroidx/compose/ui/Modifier$Node;)V", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", "remainingSet", "phase", "autoInvalidateNodeIncludingDelegates", "(Landroidx/compose/ui/Modifier$Node;II)V", "calculateNodeKindSetFromIncludingDelegates", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,357:1\n56#1:361\n56#1:363\n56#1:365\n56#1:367\n56#1:369\n56#1:371\n56#1:373\n56#1:375\n56#1:377\n56#1:379\n56#1:387\n56#1:389\n56#1:391\n56#1:393\n56#1:395\n56#1:397\n56#1:399\n56#1:401\n56#1:403\n56#1:405\n56#1:407\n56#1:409\n56#1:411\n56#1:413\n56#1:415\n56#1:417\n56#1:419\n59#1:450\n59#1:453\n59#1:455\n59#1:457\n59#1:459\n59#1:461\n59#1:463\n59#1:465\n59#1:467\n88#2:358\n74#2:359\n76#2:360\n78#2:362\n80#2:364\n82#2:366\n84#2:368\n98#2:370\n96#2:372\n90#2:374\n86#2:376\n88#2:378\n74#2:385\n76#2:386\n78#2:388\n80#2:390\n82#2:392\n84#2:394\n86#2:396\n88#2:398\n90#2:400\n92#2:402\n94#2:404\n96#2:406\n98#2:408\n100#2:410\n102#2:412\n105#2:414\n108#2:416\n110#2:418\n76#2:449\n76#2:451\n88#2:452\n90#2:454\n78#2:456\n80#2:458\n86#2:460\n94#2:462\n96#2:464\n98#2:466\n94#2:468\n743#3,5:380\n748#3,2:420\n42#4,7:422\n42#4,7:429\n42#4,7:436\n245#5,6:443\n245#5,3:502\n248#5,3:522\n245#5,6:539\n297#6:469\n137#6:470\n138#6:472\n139#6,7:476\n146#6,9:484\n432#6,6:493\n442#6,2:500\n444#6,17:505\n461#6,8:525\n155#6,6:533\n1#7:471\n1208#8:473\n1187#8,2:474\n48#9:483\n264#10:499\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n117#1:361\n120#1:363\n123#1:365\n126#1:367\n132#1:369\n136#1:371\n140#1:373\n143#1:375\n146#1:377\n152#1:379\n167#1:387\n170#1:389\n173#1:391\n176#1:393\n179#1:395\n182#1:397\n185#1:399\n188#1:401\n191#1:403\n194#1:405\n197#1:407\n200#1:409\n203#1:411\n206#1:413\n209#1:415\n212#1:417\n215#1:419\n264#1:450\n271#1:453\n278#1:455\n285#1:457\n288#1:459\n291#1:461\n294#1:463\n300#1:465\n309#1:467\n66#1:358\n115#1:359\n117#1:360\n120#1:362\n123#1:364\n126#1:366\n132#1:368\n136#1:370\n140#1:372\n143#1:374\n146#1:376\n152#1:378\n165#1:385\n167#1:386\n170#1:388\n173#1:390\n176#1:392\n179#1:394\n182#1:396\n185#1:398\n188#1:400\n191#1:402\n194#1:404\n197#1:406\n200#1:408\n203#1:410\n206#1:412\n209#1:414\n212#1:416\n215#1:418\n264#1:449\n267#1:451\n271#1:452\n278#1:454\n285#1:456\n288#1:458\n291#1:460\n294#1:462\n300#1:464\n309#1:466\n315#1:468\n164#1:380,5\n164#1:420,2\n229#1:422,7\n234#1:429,7\n239#1:436,7\n251#1:443,6\n315#1:502,3\n315#1:522,3\n349#1:539,6\n315#1:469\n315#1:470\n315#1:472\n315#1:476,7\n315#1:484,9\n315#1:493,6\n315#1:500,2\n315#1:505,17\n315#1:525,8\n315#1:533,6\n315#1:471\n315#1:473\n315#1:474,2\n315#1:483\n315#1:499\n*E\n"})
public final class NodeKindKt {
    public static final MutableObjectIntMap a;

    static {
        NodeKindKt.a = ObjectIntMapKt.mutableObjectIntMapOf();
    }

    public static final void a(Node modifier$Node0, int v, int v1) {
        if(v1 == 0 && !modifier$Node0.getShouldAutoInvalidate()) {
            return;
        }
        if((2 & v) != 0 && modifier$Node0 instanceof LayoutModifierNode) {
            LayoutModifierNodeKt.invalidateMeasurement(((LayoutModifierNode)modifier$Node0));
            if(v1 == 2) {
                DelegatableNodeKt.requireCoordinator-64DMado(modifier$Node0, 2).onRelease();
            }
        }
        if((0x80 & v) != 0 && modifier$Node0 instanceof LayoutAwareModifierNode && v1 != 2) {
            DelegatableNodeKt.requireLayoutNode(modifier$Node0).invalidateMeasurements$ui_release();
        }
        if((0x100 & v) != 0 && modifier$Node0 instanceof GlobalPositionAwareModifierNode && v1 != 2) {
            DelegatableNodeKt.requireLayoutNode(modifier$Node0).invalidateOnPositioned$ui_release();
        }
        if((4 & v) != 0 && modifier$Node0 instanceof DrawModifierNode) {
            DrawModifierNodeKt.invalidateDraw(((DrawModifierNode)modifier$Node0));
        }
        if((8 & v) != 0 && modifier$Node0 instanceof SemanticsModifierNode) {
            SemanticsModifierNodeKt.invalidateSemantics(((SemanticsModifierNode)modifier$Node0));
        }
        if((0x40 & v) != 0 && modifier$Node0 instanceof ParentDataModifierNode) {
            ParentDataModifierNodeKt.invalidateParentData(((ParentDataModifierNode)modifier$Node0));
        }
        if((0x400 & v) != 0 && modifier$Node0 instanceof FocusTargetNode && v1 != 2) {
            FocusTargetNodeKt.invalidateFocusTarget(((FocusTargetNode)modifier$Node0));
        }
        if((0x800 & v) != 0 && modifier$Node0 instanceof FocusPropertiesModifierNode) {
            e.b = null;
            ((FocusPropertiesModifierNode)modifier$Node0).applyFocusProperties(e.a);
            if(e.b != null) {
                if(v1 == 2) {
                    if(((FocusPropertiesModifierNode)modifier$Node0).getNode().isAttached()) {
                        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
                        Node modifier$Node1 = ((FocusPropertiesModifierNode)modifier$Node0).getNode().getChild$ui_release();
                        if(modifier$Node1 == null) {
                            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, ((FocusPropertiesModifierNode)modifier$Node0).getNode());
                        }
                        else {
                            mutableVector0.add(modifier$Node1);
                        }
                        while(true) {
                            if(!mutableVector0.isNotEmpty()) {
                                goto label_68;
                            }
                            Node modifier$Node2 = (Node)q.j(mutableVector0, 1);
                            if((modifier$Node2.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node2);
                            }
                            else {
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                        MutableVector mutableVector1 = null;
                                        while(modifier$Node2 != null) {
                                            if(modifier$Node2 instanceof FocusTargetNode) {
                                                FocusTargetNodeKt.invalidateFocusTarget(((FocusTargetNode)modifier$Node2));
                                            }
                                            else if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0 && modifier$Node2 instanceof DelegatingNode) {
                                                Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                                                int v2 = 0;
                                                while(modifier$Node3 != null) {
                                                    if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0) {
                                                        ++v2;
                                                        if(v2 == 1) {
                                                            modifier$Node2 = modifier$Node3;
                                                        }
                                                        else {
                                                            if(mutableVector1 == null) {
                                                                mutableVector1 = new MutableVector(new Node[16], 0);
                                                            }
                                                            if(modifier$Node2 != null) {
                                                                mutableVector1.add(modifier$Node2);
                                                                modifier$Node2 = null;
                                                            }
                                                            mutableVector1.add(modifier$Node3);
                                                        }
                                                    }
                                                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                                                }
                                                if(v2 != 1) {
                                                    goto label_62;
                                                }
                                                continue;
                                            }
                                        label_62:
                                            modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector1);
                                        }
                                        break;
                                    }
                                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                                }
                            }
                        }
                    }
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                else {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(((FocusPropertiesModifierNode)modifier$Node0));
                }
            }
        }
    label_68:
        if((v & 0x1000) != 0 && modifier$Node0 instanceof FocusEventModifierNode) {
            FocusEventModifierNodeKt.invalidateFocusEvent(((FocusEventModifierNode)modifier$Node0));
        }
    }

    public static final void autoInvalidateInsertedNode(@NotNull Node modifier$Node0) {
        if(!modifier$Node0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        NodeKindKt.autoInvalidateNodeIncludingDelegates(modifier$Node0, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(@NotNull Node modifier$Node0, int v, int v1) {
        if(modifier$Node0 instanceof DelegatingNode) {
            NodeKindKt.a(modifier$Node0, ((DelegatingNode)modifier$Node0).getSelfKindSet$ui_release() & v, v1);
            int v2 = ((DelegatingNode)modifier$Node0).getSelfKindSet$ui_release();
            for(Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.getChild$ui_release()) {
                NodeKindKt.autoInvalidateNodeIncludingDelegates(modifier$Node1, ~v2 & v, v1);
            }
            return;
        }
        NodeKindKt.a(modifier$Node0, v & modifier$Node0.getKindSet$ui_release(), v1);
    }

    public static final void autoInvalidateRemovedNode(@NotNull Node modifier$Node0) {
        if(!modifier$Node0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        NodeKindKt.autoInvalidateNodeIncludingDelegates(modifier$Node0, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(@NotNull Node modifier$Node0) {
        if(!modifier$Node0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        NodeKindKt.autoInvalidateNodeIncludingDelegates(modifier$Node0, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(@NotNull Element modifier$Element0) {
        int v = modifier$Element0 instanceof LayoutModifier ? 3 : 1;
        if(modifier$Element0 instanceof DrawModifier) {
            v |= 4;
        }
        if(modifier$Element0 instanceof SemanticsModifier) {
            v |= 8;
        }
        if(modifier$Element0 instanceof PointerInputModifier) {
            v |= 16;
        }
        if(modifier$Element0 instanceof ModifierLocalConsumer || modifier$Element0 instanceof ModifierLocalProvider) {
            v |= 0x20;
        }
        if(modifier$Element0 instanceof FocusEventModifier) {
            v |= 0x1000;
        }
        if(modifier$Element0 instanceof FocusOrderModifier) {
            v |= 0x800;
        }
        if(modifier$Element0 instanceof OnGloballyPositionedModifier) {
            v |= 0x100;
        }
        if(modifier$Element0 instanceof ParentDataModifier) {
            v |= 0x40;
        }
        return !(modifier$Element0 instanceof OnPlacedModifier) && !(modifier$Element0 instanceof OnRemeasuredModifier) ? v : v | 0x80;
    }

    public static final int calculateNodeKindSetFrom(@NotNull Node modifier$Node0) {
        if(modifier$Node0.getKindSet$ui_release() != 0) {
            return modifier$Node0.getKindSet$ui_release();
        }
        int v = 1;
        Object object0 = Actual_jvmKt.classKeyForObject(modifier$Node0);
        MutableObjectIntMap mutableObjectIntMap0 = NodeKindKt.a;
        int v1 = mutableObjectIntMap0.findKeyIndex(object0);
        if(v1 >= 0) {
            return mutableObjectIntMap0.values[v1];
        }
        if(modifier$Node0 instanceof LayoutModifierNode) {
            v = 3;
        }
        if(modifier$Node0 instanceof DrawModifierNode) {
            v |= 4;
        }
        if(modifier$Node0 instanceof SemanticsModifierNode) {
            v |= 8;
        }
        if(modifier$Node0 instanceof PointerInputModifierNode) {
            v |= 16;
        }
        if(modifier$Node0 instanceof ModifierLocalModifierNode) {
            v |= 0x20;
        }
        if(modifier$Node0 instanceof ParentDataModifierNode) {
            v |= 0x40;
        }
        if(modifier$Node0 instanceof LayoutAwareModifierNode) {
            v |= 0x80;
        }
        if(modifier$Node0 instanceof GlobalPositionAwareModifierNode) {
            v |= 0x100;
        }
        if(modifier$Node0 instanceof ApproachLayoutModifierNode) {
            v |= 0x200;
        }
        if(modifier$Node0 instanceof FocusTargetNode) {
            v |= 0x400;
        }
        if(modifier$Node0 instanceof FocusPropertiesModifierNode) {
            v |= 0x800;
        }
        if(modifier$Node0 instanceof FocusEventModifierNode) {
            v |= 0x1000;
        }
        if(modifier$Node0 instanceof KeyInputModifierNode) {
            v |= 0x2000;
        }
        if(modifier$Node0 instanceof RotaryInputModifierNode) {
            v |= 0x4000;
        }
        if(modifier$Node0 instanceof CompositionLocalConsumerModifierNode) {
            v |= 0x8000;
        }
        if(modifier$Node0 instanceof SoftKeyboardInterceptionModifierNode) {
            v |= 0x20000;
        }
        int v2 = modifier$Node0 instanceof TraversableNode ? 0x40000 | v : v;
        mutableObjectIntMap0.set(object0, v2);
        return v2;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@NotNull Node modifier$Node0) {
        if(modifier$Node0 instanceof DelegatingNode) {
            int v = ((DelegatingNode)modifier$Node0).getSelfKindSet$ui_release();
            for(Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.getChild$ui_release()) {
                v |= NodeKindKt.calculateNodeKindSetFromIncludingDelegates(modifier$Node1);
            }
            return v;
        }
        return NodeKindKt.calculateNodeKindSetFrom(modifier$Node0);
    }

    public static final boolean contains-64DMado(int v, int v1) {
        return (v & v1) != 0;
    }

    public static final boolean getIncludeSelfInTraversal-H91voCI(int v) [...] // 潜在的解密器

    public static final int or-64DMado(int v, int v1) {
        return v | v1;
    }
}


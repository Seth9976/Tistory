package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import o1.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002\u001A\u000E\u0010\u0004\u001A\u0004\u0018\u00010\u0005*\u00020\u0002H\u0000\u001A\n\u0010\u0006\u001A\u00020\u0001*\u00020\u0002\u001A\f\u0010\u0007\u001A\u00020\u0001*\u00020\u0002H\u0007\u001A\f\u0010\b\u001A\u00020\u0001*\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "freeFocus", "pinFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "requestFocus", "restoreFocusedChild", "saveFocusedChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,139:1\n94#2:140\n94#2:250\n94#2:360\n94#2:470\n94#2:580\n94#2:690\n303#3:141\n432#3,6:142\n442#3,2:149\n444#3,8:154\n452#3,9:165\n461#3,8:177\n304#3:185\n137#3:186\n138#3,8:188\n146#3,9:197\n432#3,37:206\n155#3,6:243\n305#3:249\n303#3:251\n432#3,6:252\n442#3,2:259\n444#3,8:264\n452#3,9:275\n461#3,8:287\n304#3:295\n137#3:296\n138#3,8:298\n146#3,9:307\n432#3,37:316\n155#3,6:353\n305#3:359\n303#3:361\n432#3,6:362\n442#3,2:369\n444#3,8:374\n452#3,9:385\n461#3,8:397\n304#3:405\n137#3:406\n138#3,8:408\n146#3,9:417\n432#3,37:426\n155#3,6:463\n305#3:469\n303#3:471\n432#3,6:472\n442#3,2:479\n444#3,8:484\n452#3,9:495\n461#3,8:507\n304#3:515\n137#3:516\n138#3,8:518\n146#3,9:527\n432#3,37:536\n155#3,6:573\n305#3:579\n303#3:581\n432#3,6:582\n442#3,2:589\n444#3,8:594\n452#3,9:605\n461#3,8:617\n304#3:625\n137#3:626\n138#3,8:628\n146#3,9:637\n432#3,37:646\n155#3,6:683\n305#3:689\n303#3:691\n432#3,5:692\n437#3:698\n442#3,2:700\n444#3,8:705\n452#3,9:716\n461#3,8:728\n304#3:736\n137#3:737\n138#3,8:739\n146#3,9:748\n432#3,37:757\n155#3,6:794\n305#3:800\n264#4:148\n264#4:258\n264#4:368\n264#4:478\n264#4:588\n264#4:699\n245#5,3:151\n248#5,3:174\n245#5,3:261\n248#5,3:284\n245#5,3:371\n248#5,3:394\n245#5,3:481\n248#5,3:504\n245#5,3:591\n248#5,3:614\n245#5,3:702\n248#5,3:725\n1208#6:162\n1187#6,2:163\n1208#6:272\n1187#6,2:273\n1208#6:382\n1187#6,2:383\n1208#6:492\n1187#6,2:493\n1208#6:602\n1187#6,2:603\n1208#6:713\n1187#6,2:714\n1#7:187\n1#7:297\n1#7:407\n1#7:517\n1#7:627\n1#7:697\n1#7:738\n48#8:196\n48#8:306\n48#8:416\n48#8:526\n48#8:636\n48#8:747\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n41#1:140\n69#1:250\n92#1:360\n108#1:470\n126#1:580\n134#1:690\n41#1:141\n41#1:142,6\n41#1:149,2\n41#1:154,8\n41#1:165,9\n41#1:177,8\n41#1:185\n41#1:186\n41#1:188,8\n41#1:197,9\n41#1:206,37\n41#1:243,6\n41#1:249\n69#1:251\n69#1:252,6\n69#1:259,2\n69#1:264,8\n69#1:275,9\n69#1:287,8\n69#1:295\n69#1:296\n69#1:298,8\n69#1:307,9\n69#1:316,37\n69#1:353,6\n69#1:359\n92#1:361\n92#1:362,6\n92#1:369,2\n92#1:374,8\n92#1:385,9\n92#1:397,8\n92#1:405\n92#1:406\n92#1:408,8\n92#1:417,9\n92#1:426,37\n92#1:463,6\n92#1:469\n108#1:471\n108#1:472,6\n108#1:479,2\n108#1:484,8\n108#1:495,9\n108#1:507,8\n108#1:515\n108#1:516\n108#1:518,8\n108#1:527,9\n108#1:536,37\n108#1:573,6\n108#1:579\n126#1:581\n126#1:582,6\n126#1:589,2\n126#1:594,8\n126#1:605,9\n126#1:617,8\n126#1:625\n126#1:626\n126#1:628,8\n126#1:637,9\n126#1:646,37\n126#1:683,6\n126#1:689\n134#1:691\n134#1:692,5\n134#1:698\n134#1:700,2\n134#1:705,8\n134#1:716,9\n134#1:728,8\n134#1:736\n134#1:737\n134#1:739,8\n134#1:748,9\n134#1:757,37\n134#1:794,6\n134#1:800\n41#1:148\n69#1:258\n92#1:368\n108#1:478\n126#1:588\n134#1:699\n41#1:151,3\n41#1:174,3\n69#1:261,3\n69#1:284,3\n92#1:371,3\n92#1:394,3\n108#1:481,3\n108#1:504,3\n126#1:591,3\n126#1:614,3\n134#1:702,3\n134#1:725,3\n41#1:162\n41#1:163,2\n69#1:272\n69#1:273,2\n92#1:382\n92#1:383,2\n108#1:492\n108#1:493,2\n126#1:602\n126#1:603,2\n134#1:713\n134#1:714,2\n41#1:187\n69#1:297\n92#1:407\n108#1:517\n126#1:627\n134#1:738\n41#1:196\n69#1:306\n92#1:416\n108#1:526\n126#1:636\n134#1:747\n*E\n"})
public final class FocusRequesterModifierNodeKt {
    public static final boolean captureFocus(@NotNull FocusRequesterModifierNode focusRequesterModifierNode0) {
        Node modifier$Node0 = focusRequesterModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof FocusTargetNode) {
                if(FocusTransactionsKt.captureFocus(((FocusTargetNode)modifier$Node0))) {
                    return true;
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
                    goto label_24;
                }
                continue;
            }
        label_24:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        if(!focusRequesterModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusRequesterModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
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
                                if(FocusTransactionsKt.captureFocus(((FocusTargetNode)modifier$Node3))) {
                                    return true;
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
                                    goto label_65;
                                }
                                continue;
                            }
                        label_65:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return false;
    }

    public static final boolean freeFocus(@NotNull FocusRequesterModifierNode focusRequesterModifierNode0) {
        Node modifier$Node0 = focusRequesterModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof FocusTargetNode) {
                if(FocusTransactionsKt.freeFocus(((FocusTargetNode)modifier$Node0))) {
                    return true;
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
                    goto label_24;
                }
                continue;
            }
        label_24:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        if(!focusRequesterModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusRequesterModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
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
                                if(FocusTransactionsKt.freeFocus(((FocusTargetNode)modifier$Node3))) {
                                    return true;
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
                                    goto label_65;
                                }
                                continue;
                            }
                        label_65:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return false;
    }

    @Nullable
    public static final PinnedHandle pinFocusedChild(@NotNull FocusRequesterModifierNode focusRequesterModifierNode0) {
        Node modifier$Node0 = focusRequesterModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof FocusTargetNode) {
                PinnedHandle pinnableContainer$PinnedHandle0 = FocusRestorerKt.pinFocusedChild(((FocusTargetNode)modifier$Node0));
                if(pinnableContainer$PinnedHandle0 != null) {
                    return pinnableContainer$PinnedHandle0;
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
                    goto label_25;
                }
                continue;
            }
        label_25:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        if(!focusRequesterModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusRequesterModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
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
                                PinnedHandle pinnableContainer$PinnedHandle1 = FocusRestorerKt.pinFocusedChild(((FocusTargetNode)modifier$Node3));
                                if(pinnableContainer$PinnedHandle1 != null) {
                                    return pinnableContainer$PinnedHandle1;
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
                                    goto label_67;
                                }
                                continue;
                            }
                        label_67:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return null;
    }

    public static final boolean requestFocus(@NotNull FocusRequesterModifierNode focusRequesterModifierNode0) {
        f f0;
        Node modifier$Node0 = focusRequesterModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(true) {
            f0 = f.z;
            if(modifier$Node0 == null) {
                break;
            }
            if(modifier$Node0 instanceof FocusTargetNode) {
                return ((FocusTargetNode)modifier$Node0).fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(((FocusTargetNode)modifier$Node0)) : TwoDimensionalFocusSearchKt.findChildCorrespondingToFocusEnter--OM-vw8(((FocusTargetNode)modifier$Node0), 7, f0);
            }
            if((modifier$Node0.getKindSet$ui_release() & 0x400) != 0 && modifier$Node0 instanceof DelegatingNode) {
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
                    modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
                }
            }
            else {
                modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
            }
        }
        if(!focusRequesterModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusRequesterModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
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
                                return ((FocusTargetNode)modifier$Node3).fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(((FocusTargetNode)modifier$Node3)) : TwoDimensionalFocusSearchKt.findChildCorrespondingToFocusEnter--OM-vw8(((FocusTargetNode)modifier$Node3), 7, f0);
                            }
                            if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0 && modifier$Node3 instanceof DelegatingNode) {
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
                                    modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                                }
                            }
                            else {
                                modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                            }
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final boolean restoreFocusedChild(@NotNull FocusRequesterModifierNode focusRequesterModifierNode0) {
        Node modifier$Node0 = focusRequesterModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof FocusTargetNode) {
                if(FocusRestorerKt.restoreFocusedChild(((FocusTargetNode)modifier$Node0))) {
                    return true;
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
                    goto label_24;
                }
                continue;
            }
        label_24:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        if(!focusRequesterModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusRequesterModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
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
                                if(FocusRestorerKt.restoreFocusedChild(((FocusTargetNode)modifier$Node3))) {
                                    return true;
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
                                    goto label_65;
                                }
                                continue;
                            }
                        label_65:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final boolean saveFocusedChild(@NotNull FocusRequesterModifierNode focusRequesterModifierNode0) {
        Node modifier$Node0 = focusRequesterModifierNode0.getNode();
        MutableVector mutableVector0 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 instanceof FocusTargetNode) {
                if(FocusRestorerKt.saveFocusedChild(((FocusTargetNode)modifier$Node0))) {
                    return true;
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
                    goto label_24;
                }
                continue;
            }
        label_24:
            modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
        }
        if(!focusRequesterModifierNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
        Node modifier$Node2 = focusRequesterModifierNode0.getNode().getChild$ui_release();
        if(modifier$Node2 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
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
                                if(FocusRestorerKt.saveFocusedChild(((FocusTargetNode)modifier$Node3))) {
                                    return true;
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
                                    goto label_65;
                                }
                                continue;
                            }
                        label_65:
                            modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                        }
                        break;
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
        }
        return false;
    }
}


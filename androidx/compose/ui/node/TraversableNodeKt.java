package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u001B\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001A\u0016\u0010\u0000\u001A\u0004\u0018\u00010\u0002*\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u001A-\u0010\u0007\u001A\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0002\u0010\f\u001A(\u0010\u0007\u001A\u00020\b*\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000B0\n\u001A-\u0010\r\u001A\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0002\u0010\f\u001A(\u0010\r\u001A\u00020\b*\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000B0\n\u001A-\u0010\u000E\u001A\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u00012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u000F0\n¢\u0006\u0002\u0010\f\u001A(\u0010\u000E\u001A\u00020\b*\u00020\u00042\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000F0\n¨\u0006\u0010"}, d2 = {"findNearestAncestor", "T", "Landroidx/compose/ui/node/TraversableNode;", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "key", "", "traverseAncestors", "", "block", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)V", "traverseChildren", "traverseDescendants", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,230:1\n110#2:231\n110#2:297\n110#2:363\n110#2:429\n110#2:495\n110#2:566\n110#2:637\n110#2:716\n251#3,5:232\n62#3:237\n63#3,8:239\n432#3,6:247\n442#3,2:254\n444#3,8:259\n452#3,9:270\n461#3,8:282\n72#3,7:290\n251#3,5:298\n62#3:303\n63#3,8:305\n432#3,6:313\n442#3,2:320\n444#3,8:325\n452#3,9:336\n461#3,8:348\n72#3,7:356\n251#3,5:364\n62#3:369\n63#3,8:371\n432#3,6:379\n442#3,2:386\n444#3,8:391\n452#3,9:402\n461#3,8:414\n72#3,7:422\n251#3,5:430\n62#3:435\n63#3,8:437\n432#3,6:445\n442#3,2:452\n444#3,8:457\n452#3,9:468\n461#3,8:480\n72#3,7:488\n297#3:496\n137#3:497\n138#3:499\n139#3,7:503\n146#3,9:511\n432#3,6:520\n442#3,2:527\n444#3,17:532\n461#3,8:552\n155#3,6:560\n297#3:567\n137#3:568\n138#3:570\n139#3,7:574\n146#3,9:582\n432#3,6:591\n442#3,2:598\n444#3,17:603\n461#3,8:623\n155#3,6:631\n310#3:638\n167#3:639\n168#3:647\n169#3,12:651\n311#3:663\n432#3,5:664\n312#3,2:669\n437#3:671\n442#3,2:673\n444#3,17:678\n461#3,8:698\n314#3:706\n181#3,8:707\n315#3:715\n310#3:717\n167#3:718\n168#3:726\n169#3,12:730\n311#3:742\n432#3,5:743\n312#3,2:748\n437#3:750\n442#3,2:752\n444#3,17:757\n461#3,8:777\n314#3:785\n181#3,8:786\n315#3:794\n1#4:238\n1#4:304\n1#4:370\n1#4:436\n1#4:498\n1#4:569\n264#5:253\n264#5:319\n264#5:385\n264#5:451\n264#5:526\n264#5:597\n264#5:672\n264#5:751\n245#6,3:256\n248#6,3:279\n245#6,3:322\n248#6,3:345\n245#6,3:388\n248#6,3:411\n245#6,3:454\n248#6,3:477\n245#6,3:529\n248#6,3:549\n245#6,3:600\n248#6,3:620\n245#6,3:675\n248#6,3:695\n245#6,3:754\n248#6,3:774\n1208#7:267\n1187#7,2:268\n1208#7:333\n1187#7,2:334\n1208#7:399\n1187#7,2:400\n1208#7:465\n1187#7,2:466\n1208#7:500\n1187#7,2:501\n1208#7:571\n1187#7,2:572\n1208#7:648\n1187#7,2:649\n1208#7:727\n1187#7,2:728\n48#8:510\n48#8:581\n42#9,7:640\n42#9,7:719\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n58#1:231\n70#1:297\n92#1:363\n111#1:429\n138#1:495\n159#1:566\n187#1:637\n214#1:716\n58#1:232,5\n58#1:237\n58#1:239,8\n58#1:247,6\n58#1:254,2\n58#1:259,8\n58#1:270,9\n58#1:282,8\n58#1:290,7\n70#1:298,5\n70#1:303\n70#1:305,8\n70#1:313,6\n70#1:320,2\n70#1:325,8\n70#1:336,9\n70#1:348,8\n70#1:356,7\n92#1:364,5\n92#1:369\n92#1:371,8\n92#1:379,6\n92#1:386,2\n92#1:391,8\n92#1:402,9\n92#1:414,8\n92#1:422,7\n111#1:430,5\n111#1:435\n111#1:437,8\n111#1:445,6\n111#1:452,2\n111#1:457,8\n111#1:468,9\n111#1:480,8\n111#1:488,7\n138#1:496\n138#1:497\n138#1:499\n138#1:503,7\n138#1:511,9\n138#1:520,6\n138#1:527,2\n138#1:532,17\n138#1:552,8\n138#1:560,6\n159#1:567\n159#1:568\n159#1:570\n159#1:574,7\n159#1:582,9\n159#1:591,6\n159#1:598,2\n159#1:603,17\n159#1:623,8\n159#1:631,6\n187#1:638\n187#1:639\n187#1:647\n187#1:651,12\n187#1:663\n187#1:664,5\n187#1:669,2\n187#1:671\n187#1:673,2\n187#1:678,17\n187#1:698,8\n187#1:706\n187#1:707,8\n187#1:715\n214#1:717\n214#1:718\n214#1:726\n214#1:730,12\n214#1:742\n214#1:743,5\n214#1:748,2\n214#1:750\n214#1:752,2\n214#1:757,17\n214#1:777,8\n214#1:785\n214#1:786,8\n214#1:794\n58#1:238\n70#1:304\n92#1:370\n111#1:436\n138#1:498\n159#1:569\n58#1:253\n70#1:319\n92#1:385\n111#1:451\n138#1:526\n159#1:597\n187#1:672\n214#1:751\n58#1:256,3\n58#1:279,3\n70#1:322,3\n70#1:345,3\n92#1:388,3\n92#1:411,3\n111#1:454,3\n111#1:477,3\n138#1:529,3\n138#1:549,3\n159#1:600,3\n159#1:620,3\n187#1:675,3\n187#1:695,3\n214#1:754,3\n214#1:774,3\n58#1:267\n58#1:268,2\n70#1:333\n70#1:334,2\n92#1:399\n92#1:400,2\n111#1:465\n111#1:466,2\n138#1:500\n138#1:501,2\n159#1:571\n159#1:572,2\n187#1:648\n187#1:649,2\n214#1:727\n214#1:728,2\n138#1:510\n159#1:581\n187#1:640,7\n214#1:719,7\n*E\n"})
public final class TraversableNodeKt {
    @Nullable
    public static final TraversableNode findNearestAncestor(@NotNull DelegatableNode delegatableNode0, @Nullable Object object0) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x40000) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x40000) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof TraversableNode) {
                                if(Intrinsics.areEqual(object0, ((TraversableNode)modifier$Node1).getTraverseKey())) {
                                    return (TraversableNode)modifier$Node1;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
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
                                    goto label_31;
                                }
                                continue;
                            }
                        label_31:
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
        return null;
    }

    @Nullable
    public static final TraversableNode findNearestAncestor(@NotNull TraversableNode traversableNode0) {
        if(!traversableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = traversableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(traversableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x40000) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x40000) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof TraversableNode) {
                                if(Intrinsics.areEqual(traversableNode0.getTraverseKey(), ((TraversableNode)modifier$Node1).getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(traversableNode0, ((TraversableNode)modifier$Node1))) {
                                    return (TraversableNode)modifier$Node1;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
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
                                    goto label_31;
                                }
                                continue;
                            }
                        label_31:
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
        return null;
    }

    public static final void traverseAncestors(@NotNull DelegatableNode delegatableNode0, @Nullable Object object0, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = delegatableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(delegatableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x40000) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x40000) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(true) {
                            boolean z = true;
                            if(modifier$Node1 == null) {
                                break;
                            }
                            if(modifier$Node1 instanceof TraversableNode) {
                                if(Intrinsics.areEqual(object0, ((TraversableNode)modifier$Node1).getTraverseKey())) {
                                    z = ((Boolean)function10.invoke(((TraversableNode)modifier$Node1))).booleanValue();
                                }
                                if(!z) {
                                    return;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
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
    }

    public static final void traverseAncestors(@NotNull TraversableNode traversableNode0, @NotNull Function1 function10) {
        if(!traversableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = traversableNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(traversableNode0);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x40000) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x40000) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(true) {
                            boolean z = true;
                            if(modifier$Node1 == null) {
                                break;
                            }
                            if(modifier$Node1 instanceof TraversableNode) {
                                if(Intrinsics.areEqual(traversableNode0.getTraverseKey(), ((TraversableNode)modifier$Node1).getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(traversableNode0, ((TraversableNode)modifier$Node1))) {
                                    z = ((Boolean)function10.invoke(((TraversableNode)modifier$Node1))).booleanValue();
                                }
                                if(!z) {
                                    return;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
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
    }

    public static final void traverseChildren(@NotNull DelegatableNode delegatableNode0, @Nullable Object object0, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x40000) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0) {
                        MutableVector mutableVector1 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof TraversableNode) {
                                if(!(Intrinsics.areEqual(object0, ((TraversableNode)modifier$Node1).getTraverseKey()) ? ((Boolean)function10.invoke(((TraversableNode)modifier$Node1))).booleanValue() : true)) {
                                    return;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
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
                                    goto label_39;
                                }
                                continue;
                            }
                        label_39:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
    }

    public static final void traverseChildren(@NotNull TraversableNode traversableNode0, @NotNull Function1 function10) {
        if(!traversableNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = traversableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, traversableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x40000) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0) {
                        MutableVector mutableVector1 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof TraversableNode) {
                                if(!(!Intrinsics.areEqual(traversableNode0.getTraverseKey(), ((TraversableNode)modifier$Node1).getTraverseKey()) || !Actual_jvmKt.areObjectsOfSameType(traversableNode0, ((TraversableNode)modifier$Node1)) ? true : ((Boolean)function10.invoke(((TraversableNode)modifier$Node1))).booleanValue())) {
                                    return;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
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
                                    goto label_39;
                                }
                                continue;
                            }
                        label_39:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
    }

    public static final void traverseDescendants(@NotNull DelegatableNode delegatableNode0, @Nullable Object object0, @NotNull Function1 function10) {
        if(!delegatableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = delegatableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, delegatableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
    label_8:
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x40000) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
                        Node modifier$Node3 = modifier$Node2;
                        MutableVector mutableVector1 = null;
                        while(modifier$Node3 != null) {
                            if(modifier$Node3 instanceof TraversableNode) {
                                TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction0 = Intrinsics.areEqual(object0, ((TraversableNode)modifier$Node3).getTraverseKey()) ? ((TraverseDescendantsAction)function10.invoke(((TraversableNode)modifier$Node3))) : TraverseDescendantsAction.ContinueTraversal;
                                if(traversableNode$Companion$TraverseDescendantsAction0 == TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if(traversableNode$Companion$TraverseDescendantsAction0 == TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    continue label_8;
                                }
                            }
                            else if((modifier$Node3.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node3 instanceof DelegatingNode) {
                                Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node4 != null) {
                                    if((modifier$Node4.getKindSet$ui_release() & 0x40000) != 0) {
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
    }

    public static final void traverseDescendants(@NotNull TraversableNode traversableNode0, @NotNull Function1 function10) {
        if(!traversableNode0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = traversableNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, traversableNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
    label_8:
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x40000) != 0) {
                Node modifier$Node2 = modifier$Node1;
                while(modifier$Node2 != null) {
                    if((modifier$Node2.getKindSet$ui_release() & 0x40000) != 0) {
                        Node modifier$Node3 = modifier$Node2;
                        MutableVector mutableVector1 = null;
                        while(modifier$Node3 != null) {
                            if(modifier$Node3 instanceof TraversableNode) {
                                TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction0 = !Intrinsics.areEqual(traversableNode0.getTraverseKey(), ((TraversableNode)modifier$Node3).getTraverseKey()) || !Actual_jvmKt.areObjectsOfSameType(traversableNode0, ((TraversableNode)modifier$Node3)) ? TraverseDescendantsAction.ContinueTraversal : ((TraverseDescendantsAction)function10.invoke(((TraversableNode)modifier$Node3)));
                                if(traversableNode$Companion$TraverseDescendantsAction0 == TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if(traversableNode$Companion$TraverseDescendantsAction0 == TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    continue label_8;
                                }
                            }
                            else if((modifier$Node3.getKindSet$ui_release() & 0x40000) != 0 && modifier$Node3 instanceof DelegatingNode) {
                                Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node4 != null) {
                                    if((modifier$Node4.getKindSet$ui_release() & 0x40000) != 0) {
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
    }
}


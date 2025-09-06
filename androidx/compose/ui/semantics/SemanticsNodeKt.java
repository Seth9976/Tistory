package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A)\u0010\u0005\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001A)\u0010\f\u001A\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001A\u0010\u0010\u001A\u0004\u0018\u00010\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", "SemanticsNode", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "outerSemanticsNode", "(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function1;", "selector", "findClosestParentNode", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "outerMergingSemantics", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,486:1\n80#2:487\n80#2:564\n766#3:488\n697#3,8:489\n720#3,3:497\n705#3,2:500\n698#3:502\n767#3:508\n699#3,11:547\n723#3,3:558\n710#3:561\n700#3:562\n769#3:563\n690#3,15:565\n720#3,3:580\n705#3,2:583\n698#3:585\n691#3,2:591\n699#3,11:631\n723#3,3:642\n710#3:645\n700#3:646\n693#3:647\n432#4,5:503\n437#4:509\n442#4,2:511\n444#4,8:516\n452#4,9:527\n461#4,8:539\n432#4,5:586\n437#4:593\n442#4,2:595\n444#4,8:600\n452#4,9:611\n461#4,8:623\n264#5:510\n264#5:594\n245#6,3:513\n248#6,3:536\n245#6,3:597\n248#6,3:620\n1208#7:524\n1187#7,2:525\n1208#7:608\n1187#7,2:609\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n46#1:487\n461#1:564\n46#1:488\n46#1:489,8\n46#1:497,3\n46#1:500,2\n46#1:502\n46#1:508\n46#1:547,11\n46#1:558,3\n46#1:561\n46#1:562\n46#1:563\n461#1:565,15\n461#1:580,3\n461#1:583,2\n461#1:585\n461#1:591,2\n461#1:631,11\n461#1:642,3\n461#1:645\n461#1:646\n461#1:647\n46#1:503,5\n46#1:509\n46#1:511,2\n46#1:516,8\n46#1:527,9\n46#1:539,8\n461#1:586,5\n461#1:593\n461#1:595,2\n461#1:600,8\n461#1:611,9\n461#1:623,8\n46#1:510\n461#1:594\n46#1:513,3\n46#1:536,3\n461#1:597,3\n461#1:620,3\n46#1:524\n46#1:525,2\n461#1:608\n461#1:609,2\n*E\n"})
public final class SemanticsNodeKt {
    @NotNull
    public static final SemanticsNode SemanticsNode(@NotNull LayoutNode layoutNode0, boolean z) {
        NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
        Node modifier$Node0 = null;
        if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 8) != 0) {
            Node modifier$Node1 = nodeChain0.getHead$ui_release();
        alab1:
            while(modifier$Node1 != null) {
                if((modifier$Node1.getKindSet$ui_release() & 8) != 0) {
                    Node modifier$Node2 = modifier$Node1;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node2 != null) {
                        if(modifier$Node2 instanceof SemanticsModifierNode) {
                            modifier$Node0 = modifier$Node2;
                            break alab1;
                        }
                        if((modifier$Node2.getKindSet$ui_release() & 8) != 0 && modifier$Node2 instanceof DelegatingNode) {
                            Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node3 != null) {
                                if((modifier$Node3.getKindSet$ui_release() & 8) != 0) {
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
                                modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                            }
                        }
                        else {
                            modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                }
                if((modifier$Node1.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
                modifier$Node1 = modifier$Node1.getChild$ui_release();
            }
        }
        Intrinsics.checkNotNull(modifier$Node0);
        Node modifier$Node4 = ((SemanticsModifierNode)modifier$Node0).getNode();
        SemanticsConfiguration semanticsConfiguration0 = layoutNode0.getCollapsedSemantics$ui_release();
        Intrinsics.checkNotNull(semanticsConfiguration0);
        return new SemanticsNode(modifier$Node4, z, layoutNode0, semanticsConfiguration0);
    }

    @NotNull
    public static final SemanticsNode SemanticsNode(@NotNull SemanticsModifierNode semanticsModifierNode0, boolean z, @NotNull LayoutNode layoutNode0) {
        Node modifier$Node0 = semanticsModifierNode0.getNode();
        SemanticsConfiguration semanticsConfiguration0 = layoutNode0.getCollapsedSemantics$ui_release();
        if(semanticsConfiguration0 == null) {
            semanticsConfiguration0 = new SemanticsConfiguration();
        }
        return new SemanticsNode(modifier$Node0, z, layoutNode0, semanticsConfiguration0);
    }

    public static SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode0, boolean z, LayoutNode layoutNode0, int v, Object object0) {
        if((v & 4) != 0) {
            layoutNode0 = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode0);
        }
        return SemanticsNodeKt.SemanticsNode(semanticsModifierNode0, z, layoutNode0);
    }

    public static final int access$contentDescriptionFakeNodeId(SemanticsNode semanticsNode0) {
        return semanticsNode0.getId() + 2000000000;
    }

    public static final Role access$getRole(SemanticsNode semanticsNode0) {
        return (Role)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    public static final int access$roleFakeNodeId(SemanticsNode semanticsNode0) {
        return semanticsNode0.getId() + 1000000000;
    }

    @Nullable
    public static final LayoutNode findClosestParentNode(@NotNull LayoutNode layoutNode0, @NotNull Function1 function10) {
        for(LayoutNode layoutNode1 = layoutNode0.getParent$ui_release(); layoutNode1 != null; layoutNode1 = layoutNode1.getParent$ui_release()) {
            if(((Boolean)function10.invoke(layoutNode1)).booleanValue()) {
                return layoutNode1;
            }
        }
        return null;
    }

    @Nullable
    public static final SemanticsModifierNode getOuterMergingSemantics(@NotNull LayoutNode layoutNode0) {
        NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
        if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 8) != 0) {
            Node modifier$Node0 = nodeChain0.getHead$ui_release();
            while(modifier$Node0 != null) {
                if((modifier$Node0.getKindSet$ui_release() & 8) != 0) {
                    Node modifier$Node1 = modifier$Node0;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node1 != null) {
                        if(modifier$Node1 instanceof SemanticsModifierNode) {
                            if(((SemanticsModifierNode)modifier$Node1).getShouldMergeDescendantSemantics()) {
                                return (SemanticsModifierNode)modifier$Node1;
                            }
                        }
                        else if((modifier$Node1.getKindSet$ui_release() & 8) != 0 && modifier$Node1 instanceof DelegatingNode) {
                            Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node2 != null) {
                                if((modifier$Node2.getKindSet$ui_release() & 8) != 0) {
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
                                goto label_29;
                            }
                            continue;
                        }
                    label_29:
                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                if((modifier$Node0.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
                modifier$Node0 = modifier$Node0.getChild$ui_release();
            }
        }
        return null;
    }
}


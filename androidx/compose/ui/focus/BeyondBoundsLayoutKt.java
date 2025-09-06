package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AA\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0019\u0010\u0005\u001A\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,58:1\n94#2:59\n283#3:60\n251#3,5:61\n62#3:66\n63#3,8:68\n432#3,5:76\n284#3:81\n437#3:82\n442#3,2:84\n444#3,8:89\n452#3,9:100\n461#3,8:112\n72#3,7:120\n286#3:127\n1#4:67\n264#5:83\n245#6,3:86\n248#6,3:109\n1208#7:97\n1187#7,2:98\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:59\n39#1:60\n39#1:61,5\n39#1:66\n39#1:68,8\n39#1:76,5\n39#1:81\n39#1:82\n39#1:84,2\n39#1:89,8\n39#1:100,9\n39#1:112,8\n39#1:120,7\n39#1:127\n39#1:67\n39#1:83\n39#1:86,3\n39#1:109,3\n39#1:97\n39#1:98,2\n*E\n"})
public final class BeyondBoundsLayoutKt {
    @Nullable
    public static final Object searchBeyondBounds--OM-vw8(@NotNull FocusTargetNode focusTargetNode0, int v, @NotNull Function1 function10) {
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = focusTargetNode0.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(focusTargetNode0);
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
        if(((FocusTargetNode)modifier$Node1) != null && Intrinsics.areEqual(((FocusTargetNode)modifier$Node1).getBeyondBoundsLayoutParent(), focusTargetNode0.getBeyondBoundsLayoutParent())) {
            return null;
        }
        BeyondBoundsLayout beyondBoundsLayout0 = focusTargetNode0.getBeyondBoundsLayoutParent();
        if(beyondBoundsLayout0 != null) {
            if(FocusDirection.equals-impl0(v, 5)) {
                return beyondBoundsLayout0.layout-o7g1Pn8(5, function10);
            }
            if(FocusDirection.equals-impl0(v, 6)) {
                return beyondBoundsLayout0.layout-o7g1Pn8(6, function10);
            }
            if(FocusDirection.equals-impl0(v, 3)) {
                return beyondBoundsLayout0.layout-o7g1Pn8(3, function10);
            }
            if(FocusDirection.equals-impl0(v, 4)) {
                return beyondBoundsLayout0.layout-o7g1Pn8(4, function10);
            }
            if(FocusDirection.equals-impl0(v, 1)) {
                return beyondBoundsLayout0.layout-o7g1Pn8(2, function10);
            }
            if(!FocusDirection.equals-impl0(v, 2)) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            return beyondBoundsLayout0.layout-o7g1Pn8(1, function10);
        }
        return null;
    }
}


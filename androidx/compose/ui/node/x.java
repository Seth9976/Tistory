package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.internal.Intrinsics;

public final class x implements DiffCallback {
    public Node a;
    public int b;
    public MutableVector c;
    public MutableVector d;
    public boolean e;
    public final NodeChain f;

    public x(NodeChain nodeChain0, Node modifier$Node0, int v, MutableVector mutableVector0, MutableVector mutableVector1, boolean z) {
        this.f = nodeChain0;
        this.a = modifier$Node0;
        this.b = v;
        this.c = mutableVector0;
        this.d = mutableVector1;
        this.e = z;
    }

    @Override  // androidx.compose.ui.node.DiffCallback
    public final boolean areItemsTheSame(int v, int v1) {
        return NodeChainKt.actionForModifiers(((Element)this.c.getContent()[this.b + v]), ((Element)this.d.getContent()[this.b + v1])) != 0;
    }

    @Override  // androidx.compose.ui.node.DiffCallback
    public final void insert(int v) {
        int v1 = this.b + v;
        Node modifier$Node0 = this.a;
        NodeChain nodeChain0 = this.f;
        this.a = NodeChain.access$createAndInsertNodeAsChild(nodeChain0, ((Element)this.d.getContent()[v1]), modifier$Node0);
        Logger nodeChain$Logger0 = nodeChain0.i;
        if(nodeChain$Logger0 != null) {
            nodeChain$Logger0.nodeInserted(v1, v1, ((Element)this.d.getContent()[v1]), modifier$Node0, this.a);
        }
        if(this.e) {
            Node modifier$Node1 = this.a.getChild$ui_release();
            Intrinsics.checkNotNull(modifier$Node1);
            NodeCoordinator nodeCoordinator0 = modifier$Node1.getCoordinator$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
            LayoutModifierNode layoutModifierNode0 = DelegatableNodeKt.asLayoutModifierNode(this.a);
            if(layoutModifierNode0 == null) {
                this.a.updateCoordinator$ui_release(nodeCoordinator0);
            }
            else {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator0 = new LayoutModifierNodeCoordinator(nodeChain0.getLayoutNode(), layoutModifierNode0);
                this.a.updateCoordinator$ui_release(layoutModifierNodeCoordinator0);
                NodeChain.access$propagateCoordinator(nodeChain0, this.a, layoutModifierNodeCoordinator0);
                layoutModifierNodeCoordinator0.setWrappedBy$ui_release(nodeCoordinator0.getWrappedBy$ui_release());
                layoutModifierNodeCoordinator0.setWrapped$ui_release(nodeCoordinator0);
                nodeCoordinator0.setWrappedBy$ui_release(layoutModifierNodeCoordinator0);
            }
            this.a.markAsAttached$ui_release();
            this.a.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(this.a);
            return;
        }
        this.a.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
    }

    @Override  // androidx.compose.ui.node.DiffCallback
    public final void remove(int v, int v1) {
        Node modifier$Node0 = this.a.getChild$ui_release();
        Intrinsics.checkNotNull(modifier$Node0);
        NodeChain nodeChain0 = this.f;
        Logger nodeChain$Logger0 = nodeChain0.i;
        if(nodeChain$Logger0 != null) {
            nodeChain$Logger0.nodeRemoved(v1, ((Element)this.c.getContent()[this.b + v1]), modifier$Node0);
        }
        if((2 & modifier$Node0.getKindSet$ui_release()) != 0) {
            NodeCoordinator nodeCoordinator0 = modifier$Node0.getCoordinator$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator0);
            NodeCoordinator nodeCoordinator1 = nodeCoordinator0.getWrappedBy$ui_release();
            NodeCoordinator nodeCoordinator2 = nodeCoordinator0.getWrapped$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator2);
            if(nodeCoordinator1 != null) {
                nodeCoordinator1.setWrapped$ui_release(nodeCoordinator2);
            }
            nodeCoordinator2.setWrappedBy$ui_release(nodeCoordinator1);
            NodeChain.access$propagateCoordinator(nodeChain0, this.a, nodeCoordinator2);
        }
        this.a = NodeChain.access$detachAndRemoveNode(nodeChain0, modifier$Node0);
    }

    @Override  // androidx.compose.ui.node.DiffCallback
    public final void same(int v, int v1) {
        Node modifier$Node0 = this.a.getChild$ui_release();
        Intrinsics.checkNotNull(modifier$Node0);
        this.a = modifier$Node0;
        Element modifier$Element0 = (Element)this.c.getContent()[this.b + v];
        Element modifier$Element1 = (Element)this.d.getContent()[this.b + v1];
        boolean z = Intrinsics.areEqual(modifier$Element0, modifier$Element1);
        NodeChain nodeChain0 = this.f;
        if(z) {
            Logger nodeChain$Logger1 = nodeChain0.i;
            if(nodeChain$Logger1 != null) {
                nodeChain$Logger1.nodeReused(this.b + v, this.b + v1, modifier$Element0, modifier$Element1, this.a);
            }
        }
        else {
            NodeChain.access$updateNode(nodeChain0, modifier$Element0, modifier$Element1, this.a);
            Logger nodeChain$Logger0 = nodeChain0.i;
            if(nodeChain$Logger0 != null) {
                nodeChain$Logger0.nodeUpdated(this.b + v, this.b + v1, modifier$Element0, modifier$Element1, this.a);
            }
        }
    }
}


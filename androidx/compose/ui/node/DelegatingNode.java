package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\f\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000F\u001A\u00028\u0000\"\b\b\u0000\u0010\u000B*\u00020\n2\u0006\u0010\f\u001A\u00028\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\nH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001A\u00028\u0000\"\b\b\u0000\u0010\u000B*\u00020\n2\u0006\u0010\f\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u000EJ\u0017\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\nH\u0004¢\u0006\u0004\b\u0019\u0010\u0012J$\u0010\u001E\u001A\u00020\u00062\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u001AH\u0080\b¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010 \u001A\u00020\u0006H\u0010¢\u0006\u0004\b\u001F\u0010\u0003J\u000F\u0010\"\u001A\u00020\u0006H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000F\u0010$\u001A\u00020\u0006H\u0010¢\u0006\u0004\b#\u0010\u0003J\u000F\u0010&\u001A\u00020\u0006H\u0010¢\u0006\u0004\b%\u0010\u0003J\u000F\u0010(\u001A\u00020\u0006H\u0010¢\u0006\u0004\b\'\u0010\u0003R \u0010/\u001A\u00020)8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0003\u001A\u0004\b,\u0010-R$\u0010\u0018\u001A\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u0010\u0016¨\u00065"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/DelegatableNode;", "T", "delegatableNode", "delegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "delegateUnprotected", "instance", "undelegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)V", "undelegateUnprotected", "owner", "setAsDelegateTo$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "setAsDelegateTo", "delegate", "undelegate", "Lkotlin/Function1;", "block", "forEachImmediateDelegate$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "forEachImmediateDelegate", "markAsAttached$ui_release", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "", "n", "I", "getSelfKindSet$ui_release", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "o", "Landroidx/compose/ui/Modifier$Node;", "getDelegate$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,288:1\n245#1,6:289\n245#1,6:295\n245#1,6:321\n245#1,6:327\n245#1,6:333\n245#1,6:339\n245#1,6:345\n42#2,7:301\n42#2,7:314\n76#3:308\n76#3:310\n76#3:312\n59#4:309\n59#4:311\n59#4:313\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n46#1:289,6\n64#1:295,6\n254#1:321,6\n265#1:327,6\n273#1:333,6\n279#1:339,6\n285#1:345,6\n95#1:301,7\n192#1:314,7\n117#1:308\n173#1:310\n187#1:312\n117#1:309\n173#1:311\n187#1:313\n*E\n"})
public abstract class DelegatingNode extends Node {
    public static final int $stable = 8;
    public final int n;
    public Node o;

    public DelegatingNode() {
        this.n = NodeKindKt.calculateNodeKindSetFrom(this);
    }

    public final void b(int v, boolean z) {
        int v1;
        this.setKindSet$ui_release(v);
        if(this.getKindSet$ui_release() != v) {
            if(DelegatableNodeKt.isDelegationRoot(this)) {
                this.setAggregateChildKindSet$ui_release(v);
            }
            if(this.isAttached()) {
                Node modifier$Node0 = this.getNode();
                Node modifier$Node1;
                for(modifier$Node1 = this; modifier$Node1 != null; modifier$Node1 = modifier$Node1.getParent$ui_release()) {
                    v |= modifier$Node1.getKindSet$ui_release();
                    modifier$Node1.setKindSet$ui_release(v);
                    if(modifier$Node1 == modifier$Node0) {
                        break;
                    }
                }
                if(z && modifier$Node1 == modifier$Node0) {
                    v = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(modifier$Node0);
                    modifier$Node0.setKindSet$ui_release(v);
                }
                if(modifier$Node1 == null) {
                    v1 = 0;
                }
                else {
                    Node modifier$Node2 = modifier$Node1.getChild$ui_release();
                    v1 = modifier$Node2 == null ? 0 : modifier$Node2.getAggregateChildKindSet$ui_release();
                }
                int v2 = v | v1;
                while(modifier$Node1 != null) {
                    v2 |= modifier$Node1.getKindSet$ui_release();
                    modifier$Node1.setAggregateChildKindSet$ui_release(v2);
                    modifier$Node1 = modifier$Node1.getParent$ui_release();
                }
            }
        }
    }

    @NotNull
    public final DelegatableNode delegate(@NotNull DelegatableNode delegatableNode0) {
        Node modifier$Node0 = delegatableNode0.getNode();
        Node modifier$Node1 = null;
        if(modifier$Node0 != delegatableNode0) {
            Node modifier$Node2 = delegatableNode0 instanceof Node ? ((Node)delegatableNode0) : null;
            if(modifier$Node2 != null) {
                modifier$Node1 = modifier$Node2.getParent$ui_release();
            }
            if(modifier$Node0 != this.getNode() || !Intrinsics.areEqual(modifier$Node1, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return delegatableNode0;
        }
        if(modifier$Node0.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        modifier$Node0.setAsDelegateTo$ui_release(this.getNode());
        int v = this.getKindSet$ui_release();
        int v1 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(modifier$Node0);
        modifier$Node0.setKindSet$ui_release(v1);
        if((2 & v1) != 0 && (this.getKindSet$ui_release() & 2) != 0 && !(this instanceof LayoutModifierNode)) {
            InlineClassHelperKt.throwIllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + modifier$Node0));
        }
        modifier$Node0.setChild$ui_release(this.o);
        this.o = modifier$Node0;
        modifier$Node0.setParent$ui_release(this);
        this.b(this.getKindSet$ui_release() | v1, false);
        if(this.isAttached()) {
            if((v1 & 2) == 0 || (v & 2) != 0) {
                this.updateCoordinator$ui_release(this.getCoordinator$ui_release());
            }
            else {
                NodeChain nodeChain0 = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                this.getNode().updateCoordinator$ui_release(null);
                nodeChain0.syncCoordinators();
            }
            modifier$Node0.markAsAttached$ui_release();
            modifier$Node0.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(modifier$Node0);
        }
        return delegatableNode0;
    }

    @NotNull
    @TestOnly
    public final DelegatableNode delegateUnprotected$ui_release(@NotNull DelegatableNode delegatableNode0) {
        return this.delegate(delegatableNode0);
    }

    public final void forEachImmediateDelegate$ui_release(@NotNull Function1 function10) {
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            function10.invoke(modifier$Node0);
        }
    }

    @Nullable
    public final Node getDelegate$ui_release() {
        return this.o;
    }

    public final int getSelfKindSet$ui_release() {
        return this.n;
    }

    public static void getSelfKindSet$ui_release$annotations() {
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.updateCoordinator$ui_release(this.getCoordinator$ui_release());
            if(!modifier$Node0.isAttached()) {
                modifier$Node0.markAsAttached$ui_release();
            }
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void markAsDetached$ui_release() {
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.reset$ui_release();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void runAttachLifecycle$ui_release() {
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.runDetachLifecycle$ui_release();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void setAsDelegateTo$ui_release(@NotNull Node modifier$Node0) {
        super.setAsDelegateTo$ui_release(modifier$Node0);
        for(Node modifier$Node1 = this.getDelegate$ui_release(); modifier$Node1 != null; modifier$Node1 = modifier$Node1.getChild$ui_release()) {
            modifier$Node1.setAsDelegateTo$ui_release(modifier$Node0);
        }
    }

    public final void setDelegate$ui_release(@Nullable Node modifier$Node0) {
        this.o = modifier$Node0;
    }

    public final void undelegate(@NotNull DelegatableNode delegatableNode0) {
        Node modifier$Node0 = this.o;
        Node modifier$Node1 = null;
        while(modifier$Node0 != null) {
            if(modifier$Node0 == delegatableNode0) {
                if(modifier$Node0.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(modifier$Node0);
                    modifier$Node0.runDetachLifecycle$ui_release();
                    modifier$Node0.markAsDetached$ui_release();
                }
                modifier$Node0.setAsDelegateTo$ui_release(modifier$Node0);
                modifier$Node0.setAggregateChildKindSet$ui_release(0);
                if(modifier$Node1 == null) {
                    this.o = modifier$Node0.getChild$ui_release();
                }
                else {
                    modifier$Node1.setChild$ui_release(modifier$Node0.getChild$ui_release());
                }
                modifier$Node0.setChild$ui_release(null);
                modifier$Node0.setParent$ui_release(null);
                int v = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                this.b(v, true);
                if(this.isAttached() && (this.getKindSet$ui_release() & 2) != 0 && (2 & v) == 0) {
                    NodeChain nodeChain0 = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    this.getNode().updateCoordinator$ui_release(null);
                    nodeChain0.syncCoordinators();
                }
                return;
            }
            modifier$Node1 = modifier$Node0;
            modifier$Node0 = modifier$Node0.getChild$ui_release();
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode0).toString());
    }

    @TestOnly
    public final void undelegateUnprotected$ui_release(@NotNull DelegatableNode delegatableNode0) {
        this.undelegate(delegatableNode0);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void updateCoordinator$ui_release(@Nullable NodeCoordinator nodeCoordinator0) {
        super.updateCoordinator$ui_release(nodeCoordinator0);
        for(Node modifier$Node0 = this.getDelegate$ui_release(); modifier$Node0 != null; modifier$Node0 = modifier$Node0.getChild$ui_release()) {
            modifier$Node0.updateCoordinator$ui_release(nodeCoordinator0);
        }
    }
}


package b2;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class m extends Lambda implements Function0 {
    public final LayoutNode w;
    public final ObjectRef x;

    public m(LayoutNode layoutNode0, ObjectRef ref$ObjectRef0) {
        this.w = layoutNode0;
        this.x = ref$ObjectRef0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NodeChain nodeChain0 = this.w.getNodes$ui_release();
        if((NodeChain.access$getAggregateChildKindSet(nodeChain0) & 8) != 0) {
            Node modifier$Node0 = nodeChain0.getTail$ui_release();
            while(modifier$Node0 != null) {
                if((modifier$Node0.getKindSet$ui_release() & 8) != 0) {
                    Node modifier$Node1 = modifier$Node0;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node1 != null) {
                        if(modifier$Node1 instanceof SemanticsModifierNode) {
                            ObjectRef ref$ObjectRef0 = this.x;
                            if(((SemanticsModifierNode)modifier$Node1).getShouldClearDescendantSemantics()) {
                                SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
                                ref$ObjectRef0.element = semanticsConfiguration0;
                                semanticsConfiguration0.setClearingSemantics(true);
                            }
                            if(((SemanticsModifierNode)modifier$Node1).getShouldMergeDescendantSemantics()) {
                                ((SemanticsConfiguration)ref$ObjectRef0.element).setMergingSemanticsOfDescendants(true);
                            }
                            ((SemanticsModifierNode)modifier$Node1).applySemantics(((SemanticsConfiguration)ref$ObjectRef0.element));
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
                                goto label_36;
                            }
                            continue;
                        }
                    label_36:
                        modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                    }
                }
                modifier$Node0 = modifier$Node0.getParent$ui_release();
            }
        }
        return Unit.INSTANCE;
    }
}


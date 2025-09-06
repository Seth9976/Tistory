package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J)\u0010\f\u001A\u00020\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\b0\t2\u0006\u0010\u000F\u001A\u0002H\bH\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0003\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000Bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "current", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "provide", "", "key", "value", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,253:1\n96#2,7:254\n96#2,7:261\n96#2,7:268\n84#3:275\n251#4,5:276\n62#4:281\n63#4,8:283\n432#4,6:291\n442#4,2:298\n444#4,8:303\n452#4,9:314\n461#4,8:326\n72#4,7:334\n1#5:282\n264#6:297\n245#7,3:300\n248#7,3:323\n1208#8:311\n1187#8,2:312\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n*L\n151#1:254,7\n154#1:261,7\n167#1:268,7\n171#1:275\n171#1:276,5\n171#1:281\n171#1:283,8\n171#1:291,6\n171#1:298,2\n171#1:303,8\n171#1:314,9\n171#1:326,8\n171#1:334,7\n171#1:282\n171#1:297\n171#1:300,3\n171#1:323,3\n171#1:311\n171#1:312,2\n*E\n"})
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    @Override  // androidx.compose.ui.modifier.ModifierLocalReadScope
    default Object getCurrent(@NotNull ModifierLocal modifierLocal0) {
        if(!this.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("ModifierLocal accessed from an unattached node");
        }
        if(!this.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = this.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(this);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x20) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x20) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof ModifierLocalModifierNode) {
                                if(((ModifierLocalModifierNode)modifier$Node1).getProvidedValues().contains$ui_release(modifierLocal0)) {
                                    return ((ModifierLocalModifierNode)modifier$Node1).getProvidedValues().get$ui_release(modifierLocal0);
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x20) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x20) != 0) {
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
                                    goto label_33;
                                }
                                continue;
                            }
                        label_33:
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
        return modifierLocal0.getDefaultFactory$ui_release().invoke();
    }

    @NotNull
    default ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    default void provide(@NotNull ModifierLocal modifierLocal0, Object object0) {
        if(this.getProvidedValues() == EmptyMap.INSTANCE) {
            InlineClassHelperKt.throwIllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if(!this.getProvidedValues().contains$ui_release(modifierLocal0)) {
            InlineClassHelperKt.throwIllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal0 + " was not found."));
        }
        this.getProvidedValues().set$ui_release(modifierLocal0, object0);
    }
}


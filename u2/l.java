package u2;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.viewinterop.FocusGroupNode_androidKt;
import kotlin.jvm.internal.Intrinsics;

public final class l extends Node implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener, FocusPropertiesModifierNode {
    public View n;

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(FocusProperties focusProperties0) {
        focusProperties0.setCanFocus(false);
        focusProperties0.setEnter(new h(1, this, l.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 9));
        focusProperties0.setExit(new h(1, this, l.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0, 10));
    }

    public final FocusTargetNode b() {
        if(!this.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Node modifier$Node0 = this.getNode();
        if((modifier$Node0.getAggregateChildKindSet$ui_release() & 0x400) != 0) {
            Node modifier$Node1 = modifier$Node0.getChild$ui_release();
            boolean z = false;
            while(modifier$Node1 != null) {
                if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                    Node modifier$Node2 = modifier$Node1;
                    MutableVector mutableVector0 = null;
                    while(modifier$Node2 != null) {
                        if(modifier$Node2 instanceof FocusTargetNode) {
                            if(z) {
                                return (FocusTargetNode)modifier$Node2;
                            }
                            z = true;
                        }
                        else if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0 && modifier$Node2 instanceof DelegatingNode) {
                            Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                            int v = 0;
                            while(modifier$Node3 != null) {
                                if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0) {
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
                modifier$Node1 = modifier$Node1.getChild$ui_release();
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        super.onAttach();
        FocusGroupNode_androidKt.access$getView(this).addOnAttachStateChangeListener(this);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        FocusGroupNode_androidKt.access$getView(this).removeOnAttachStateChangeListener(this);
        this.n = null;
        super.onDetach();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view0, View view1) {
        if(DelegatableNodeKt.requireLayoutNode(this).getOwner$ui_release() == null) {
            return;
        }
        View view2 = FocusGroupNode_androidKt.access$getView(this);
        FocusOwner focusOwner0 = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        Owner owner0 = DelegatableNodeKt.requireOwner(this);
        boolean z = view0 != null && !Intrinsics.areEqual(view0, owner0) && FocusGroupNode_androidKt.access$containsDescendant(view2, view0);
        boolean z1 = view1 != null && !Intrinsics.areEqual(view1, owner0) && FocusGroupNode_androidKt.access$containsDescendant(view2, view1);
        if(z && z1) {
            this.n = view1;
            return;
        }
        if(z1) {
            this.n = view1;
            FocusTargetNode focusTargetNode0 = this.b();
            if(!focusTargetNode0.getFocusState().getHasFocus()) {
                FocusTransactionManager focusTransactionManager0 = focusOwner0.getFocusTransactionManager();
                try {
                    if(focusTransactionManager0.c) {
                        FocusTransactionManager.access$cancelTransaction(focusTransactionManager0);
                    }
                    FocusTransactionManager.access$beginTransaction(focusTransactionManager0);
                    FocusTransactionsKt.performRequestFocus(focusTargetNode0);
                }
                finally {
                    FocusTransactionManager.access$commitTransaction(focusTransactionManager0);
                }
            }
        }
        else if(z) {
            this.n = null;
            if(this.b().getFocusState().isFocused()) {
                focusOwner0.clearFocus-I7lrPNg(false, true, false, 8);
            }
        }
        else {
            this.n = null;
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        view0.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        view0.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}


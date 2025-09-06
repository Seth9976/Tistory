package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import o1.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0013\u0010\u0004\u001A\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001A\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A%\u0010\f\u001A\u00020\b*\u00020\b2\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "saveFocusedChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "restoreFocusedChild", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinFocusedChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "onRestoreFailed", "focusRestorer", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusRestorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,145:1\n94#2:146\n94#2:217\n297#3:147\n137#3:148\n138#3:150\n139#3,7:154\n146#3,9:162\n432#3,6:171\n442#3,2:178\n444#3,17:183\n461#3,8:203\n155#3,6:211\n297#3:218\n137#3:219\n138#3:221\n139#3,7:225\n146#3,9:233\n432#3,6:242\n442#3,2:249\n444#3,17:254\n461#3,8:274\n155#3,6:282\n1#4:149\n1#4:220\n1208#5:151\n1187#5,2:152\n1208#5:222\n1187#5,2:223\n48#6:161\n48#6:232\n264#7:177\n264#7:248\n245#8,3:180\n248#8,3:200\n245#8,3:251\n248#8,3:271\n*S KotlinDebug\n*F\n+ 1 FocusRestorer.kt\nandroidx/compose/ui/focus/FocusRestorerKt\n*L\n39#1:146\n59#1:217\n39#1:147\n39#1:148\n39#1:150\n39#1:154,7\n39#1:162,9\n39#1:171,6\n39#1:178,2\n39#1:183,17\n39#1:203,8\n39#1:211,6\n59#1:218\n59#1:219\n59#1:221\n59#1:225,7\n59#1:233,9\n59#1:242,6\n59#1:249,2\n59#1:254,17\n59#1:274,8\n59#1:282,6\n39#1:149\n59#1:220\n39#1:151\n39#1:152,2\n59#1:222\n59#1:223,2\n39#1:161\n59#1:232\n39#1:177\n59#1:248\n39#1:180,3\n39#1:200,3\n59#1:251,3\n59#1:271,3\n*E\n"})
public final class FocusRestorerKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier focusRestorer(@NotNull Modifier modifier0, @Nullable Function0 function00) {
        return modifier0.then(new FocusRestorerElement(function00));
    }

    public static Modifier focusRestorer$default(Modifier modifier0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        return FocusRestorerKt.focusRestorer(modifier0, function00);
    }

    @Nullable
    public static final PinnedHandle pinFocusedChild(@NotNull FocusTargetNode focusTargetNode0) {
        FocusTargetNode focusTargetNode1 = FocusTraversalKt.findActiveFocusNode(focusTargetNode0);
        if(focusTargetNode1 != null) {
            PinnableContainer pinnableContainer0 = (PinnableContainer)CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode1, PinnableContainerKt.getLocalPinnableContainer());
            return pinnableContainer0 == null ? null : pinnableContainer0.pin();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final boolean restoreFocusedChild(@NotNull FocusTargetNode focusTargetNode0) {
        if(focusTargetNode0.getPreviouslyFocusedChildHash() == 0) {
            SaveableStateRegistry saveableStateRegistry0 = (SaveableStateRegistry)CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode0, SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            if(saveableStateRegistry0 != null) {
                Object object0 = saveableStateRegistry0.consumeRestored("previouslyFocusedChildHash");
                if(object0 != null) {
                    focusTargetNode0.setPreviouslyFocusedChildHash(((int)(((Integer)object0))));
                }
            }
        }
        if(focusTargetNode0.getPreviouslyFocusedChildHash() == 0) {
            return false;
        }
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, focusTargetNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                        MutableVector mutableVector1 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                if(((FocusTargetNode)modifier$Node1).isAttached() && DelegatableNodeKt.requireLayoutNode(((FocusTargetNode)modifier$Node1)).getCompositeKeyHash() == focusTargetNode0.getPreviouslyFocusedChildHash()) {
                                    return FocusRestorerKt.restoreFocusedChild(((FocusTargetNode)modifier$Node1)) || FocusTransactionsKt.requestFocus(((FocusTargetNode)modifier$Node1));
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
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
                                    goto label_47;
                                }
                                continue;
                            }
                        label_47:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static final boolean saveFocusedChild(@NotNull FocusTargetNode focusTargetNode0) {
        if(!focusTargetNode0.getFocusState().getHasFocus()) {
            return false;
        }
        if(!focusTargetNode0.getNode().isAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node0 = focusTargetNode0.getNode().getChild$ui_release();
        if(modifier$Node0 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, focusTargetNode0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node0);
        }
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node1 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node1);
            }
            else {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                        MutableVector mutableVector1 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof FocusTargetNode) {
                                if(((FocusTargetNode)modifier$Node1).getFocusState().getHasFocus()) {
                                    focusTargetNode0.setPreviouslyFocusedChildHash(DelegatableNodeKt.requireLayoutNode(((FocusTargetNode)modifier$Node1)).getCompositeKeyHash());
                                    SaveableStateRegistry saveableStateRegistry0 = (SaveableStateRegistry)CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode0, SaveableStateRegistryKt.getLocalSaveableStateRegistry());
                                    if(saveableStateRegistry0 != null) {
                                        saveableStateRegistry0.registerProvider("previouslyFocusedChildHash", new k(focusTargetNode0, 0));
                                    }
                                    return true;
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
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
                                    goto label_45;
                                }
                                continue;
                            }
                        label_45:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                        break;
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
        }
        return false;
    }
}


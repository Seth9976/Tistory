package androidx.compose.ui.modifier;

import a2.b;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\n2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000E\u0010\u000FJ!\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\n2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0010\u0010\u000FJ!\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\n2\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u0011\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "", "invalidate", "()V", "triggerUpdates", "Landroidx/compose/ui/node/BackwardsCompatNode;", "node", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "updatedProvider", "(Landroidx/compose/ui/node/BackwardsCompatNode;Landroidx/compose/ui/modifier/ModifierLocal;)V", "insertedProvider", "removedProvider", "a", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,122:1\n1208#2:123\n1187#2,2:124\n1208#2:126\n1187#2,2:127\n1208#2:129\n1187#2,2:130\n1208#2:132\n1187#2,2:133\n1208#2:172\n1187#2,2:173\n476#3,7:135\n523#3:142\n483#3,4:143\n476#3,7:147\n523#3:154\n483#3,4:155\n728#3,2:240\n728#3,2:242\n728#3,2:244\n728#3,2:246\n728#3,2:248\n728#3,2:250\n1855#4,2:159\n84#5:161\n310#6:162\n167#6:163\n168#6:171\n169#6,12:175\n311#6:187\n432#6,5:188\n312#6,2:193\n437#6:195\n442#6,2:197\n444#6,17:202\n461#6,8:222\n314#6:230\n181#6,8:231\n315#6:239\n42#7,7:164\n264#8:196\n245#9,3:199\n248#9,3:219\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:123\n44#1:124,2\n45#1:126\n45#1:127,2\n46#1:129\n46#1:130,2\n47#1:132\n47#1:133,2\n93#1:172\n93#1:173,2\n64#1:135,7\n65#1:142\n64#1:143,4\n77#1:147,7\n78#1:154\n77#1:155,4\n105#1:240,2\n106#1:242,2\n111#1:244,2\n112#1:246,2\n117#1:248,2\n118#1:250,2\n85#1:159,2\n93#1:161\n93#1:162\n93#1:163\n93#1:171\n93#1:175,12\n93#1:187\n93#1:188,5\n93#1:193,2\n93#1:195\n93#1:197,2\n93#1:202,17\n93#1:222,8\n93#1:230\n93#1:231,8\n93#1:239\n93#1:164,7\n93#1:196\n93#1:199,3\n93#1:219,3\n*E\n"})
public final class ModifierLocalManager {
    public static final int $stable = 8;
    public final Owner a;
    public final MutableVector b;
    public final MutableVector c;
    public final MutableVector d;
    public final MutableVector e;
    public boolean f;

    public ModifierLocalManager(@NotNull Owner owner0) {
        this.a = owner0;
        this.b = new MutableVector(new BackwardsCompatNode[16], 0);
        this.c = new MutableVector(new ModifierLocal[16], 0);
        this.d = new MutableVector(new LayoutNode[16], 0);
        this.e = new MutableVector(new ModifierLocal[16], 0);
    }

    public static void a(Node modifier$Node0, ModifierLocal modifierLocal0, HashSet hashSet0) {
        if(!modifier$Node0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector0 = new MutableVector(new Node[16], 0);
        Node modifier$Node1 = modifier$Node0.getNode().getChild$ui_release();
        if(modifier$Node1 == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node0.getNode());
        }
        else {
            mutableVector0.add(modifier$Node1);
        }
    label_8:
        while(mutableVector0.isNotEmpty()) {
            Node modifier$Node2 = (Node)q.j(mutableVector0, 1);
            if((modifier$Node2.getAggregateChildKindSet$ui_release() & 0x20) != 0) {
                Node modifier$Node3 = modifier$Node2;
                while(modifier$Node3 != null) {
                    if((modifier$Node3.getKindSet$ui_release() & 0x20) != 0) {
                        Node modifier$Node4 = modifier$Node3;
                        MutableVector mutableVector1 = null;
                        while(modifier$Node4 != null) {
                            if(modifier$Node4 instanceof ModifierLocalModifierNode) {
                                if(((ModifierLocalModifierNode)modifier$Node4) instanceof BackwardsCompatNode && ((BackwardsCompatNode)(((ModifierLocalModifierNode)modifier$Node4))).getElement() instanceof ModifierLocalConsumer && ((BackwardsCompatNode)(((ModifierLocalModifierNode)modifier$Node4))).getReadValues().contains(modifierLocal0)) {
                                    hashSet0.add(((ModifierLocalModifierNode)modifier$Node4));
                                }
                                if(((ModifierLocalModifierNode)modifier$Node4).getProvidedValues().contains$ui_release(modifierLocal0)) {
                                    continue label_8;
                                }
                            }
                            else if((modifier$Node4.getKindSet$ui_release() & 0x20) != 0 && modifier$Node4 instanceof DelegatingNode) {
                                Node modifier$Node5 = ((DelegatingNode)modifier$Node4).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node5 != null) {
                                    if((modifier$Node5.getKindSet$ui_release() & 0x20) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            modifier$Node4 = modifier$Node5;
                                        }
                                        else {
                                            if(mutableVector1 == null) {
                                                mutableVector1 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node4 != null) {
                                                mutableVector1.add(modifier$Node4);
                                                modifier$Node4 = null;
                                            }
                                            mutableVector1.add(modifier$Node5);
                                        }
                                    }
                                    modifier$Node5 = modifier$Node5.getChild$ui_release();
                                }
                                if(v != 1) {
                                    goto label_40;
                                }
                                continue;
                            }
                        label_40:
                            modifier$Node4 = DelegatableNodeKt.access$pop(mutableVector1);
                        }
                    }
                    modifier$Node3 = modifier$Node3.getChild$ui_release();
                }
            }
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector0, modifier$Node2);
        }
    }

    @NotNull
    public final Owner getOwner() {
        return this.a;
    }

    public final void insertedProvider(@NotNull BackwardsCompatNode backwardsCompatNode0, @NotNull ModifierLocal modifierLocal0) {
        this.b.add(backwardsCompatNode0);
        this.c.add(modifierLocal0);
        this.invalidate();
    }

    public final void invalidate() {
        if(!this.f) {
            this.f = true;
            b b0 = new b(this, 0);
            this.a.registerOnEndApplyChangesListener(b0);
        }
    }

    public final void removedProvider(@NotNull BackwardsCompatNode backwardsCompatNode0, @NotNull ModifierLocal modifierLocal0) {
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode0);
        this.d.add(layoutNode0);
        this.e.add(modifierLocal0);
        this.invalidate();
    }

    public final void triggerUpdates() {
        int v = 0;
        this.f = false;
        HashSet hashSet0 = new HashSet();
        MutableVector mutableVector0 = this.d;
        int v1 = mutableVector0.getSize();
        MutableVector mutableVector1 = this.e;
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v2 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v2];
                ModifierLocal modifierLocal0 = (ModifierLocal)mutableVector1.getContent()[v2];
                if(layoutNode0.getNodes$ui_release().getHead$ui_release().isAttached()) {
                    ModifierLocalManager.a(layoutNode0.getNodes$ui_release().getHead$ui_release(), modifierLocal0, hashSet0);
                }
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        mutableVector0.clear();
        mutableVector1.clear();
        MutableVector mutableVector2 = this.b;
        int v3 = mutableVector2.getSize();
        MutableVector mutableVector3 = this.c;
        if(v3 > 0) {
            Object[] arr_object1 = mutableVector2.getContent();
            while(true) {
                BackwardsCompatNode backwardsCompatNode0 = (BackwardsCompatNode)arr_object1[v];
                ModifierLocal modifierLocal1 = (ModifierLocal)mutableVector3.getContent()[v];
                if(backwardsCompatNode0.isAttached()) {
                    ModifierLocalManager.a(backwardsCompatNode0, modifierLocal1, hashSet0);
                }
                ++v;
                if(v >= v3) {
                    break;
                }
            }
        }
        mutableVector2.clear();
        mutableVector3.clear();
        for(Object object0: hashSet0) {
            ((BackwardsCompatNode)object0).updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(@NotNull BackwardsCompatNode backwardsCompatNode0, @NotNull ModifierLocal modifierLocal0) {
        this.b.add(backwardsCompatNode0);
        this.c.add(modifierLocal0);
        this.invalidate();
    }
}


package androidx.compose.ui.focus;

import androidx.activity.c0;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\r¢\u0006\u0004\b\u000B\u0010\u000EJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u000F¢\u0006\u0004\b\u000B\u0010\u0010J\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "", "hasPendingInvalidation", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,154:1\n267#2,4:155\n237#2,7:159\n248#2,3:167\n251#2,2:171\n272#2:173\n273#2:284\n254#2,6:285\n274#2:291\n267#2,4:292\n237#2,7:296\n248#2,3:304\n251#2,2:308\n272#2:310\n273#2:421\n254#2,6:422\n274#2:428\n267#2,4:429\n237#2,7:433\n248#2,3:441\n251#2,2:445\n272#2,2:447\n254#2,6:449\n274#2:455\n1810#3:166\n1672#3:170\n1810#3:303\n1672#3:307\n1810#3:440\n1672#3:444\n94#4:174\n94#4:311\n303#5:175\n432#5,6:176\n442#5,2:183\n444#5,8:188\n452#5,9:199\n461#5,8:211\n304#5:219\n137#5:220\n138#5,8:222\n146#5,9:231\n432#5,37:240\n155#5,6:277\n305#5:283\n303#5:312\n432#5,6:313\n442#5,2:320\n444#5,8:325\n452#5,9:336\n461#5,8:348\n304#5:356\n137#5:357\n138#5,8:359\n146#5,9:368\n432#5,37:377\n155#5,6:414\n305#5:420\n264#6:182\n264#6:319\n245#7,3:185\n248#7,3:208\n245#7,3:322\n248#7,3:345\n1208#8:196\n1187#8,2:197\n1208#8:333\n1187#8,2:334\n1#9:221\n1#9:358\n48#10:230\n48#10:367\n42#11,7:456\n42#11,7:463\n42#11,7:470\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n70#1:155,4\n70#1:159,7\n70#1:167,3\n70#1:171,2\n70#1:173\n70#1:284\n70#1:285,6\n70#1:291\n82#1:292,4\n82#1:296,7\n82#1:304,3\n82#1:308,2\n82#1:310\n82#1:421\n82#1:422,6\n82#1:428\n130#1:429,4\n130#1:433,7\n130#1:441,3\n130#1:445,2\n130#1:447,2\n130#1:449,6\n130#1:455\n70#1:166\n70#1:170\n82#1:303\n82#1:307\n130#1:440\n130#1:444\n75#1:174\n96#1:311\n75#1:175\n75#1:176,6\n75#1:183,2\n75#1:188,8\n75#1:199,9\n75#1:211,8\n75#1:219\n75#1:220\n75#1:222,8\n75#1:231,9\n75#1:240,37\n75#1:277,6\n75#1:283\n96#1:312\n96#1:313,6\n96#1:320,2\n96#1:325,8\n96#1:336,9\n96#1:348,8\n96#1:356\n96#1:357\n96#1:359,8\n96#1:368,9\n96#1:377,37\n96#1:414,6\n96#1:420\n75#1:182\n96#1:319\n75#1:185,3\n75#1:208,3\n96#1:322,3\n96#1:345,3\n75#1:196\n75#1:197,2\n96#1:333\n96#1:334,2\n75#1:221\n96#1:358\n75#1:230\n96#1:367\n149#1:456,7\n150#1:463,7\n151#1:470,7\n*E\n"})
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    public final Function1 a;
    public final Function0 b;
    public final MutableScatterSet c;
    public final MutableScatterSet d;
    public final MutableScatterSet e;
    public final MutableScatterSet f;

    public FocusInvalidationManager(@NotNull Function1 function10, @NotNull Function0 function00) {
        this.a = function10;
        this.b = function00;
        this.c = ScatterSetKt.mutableScatterSetOf();
        this.d = ScatterSetKt.mutableScatterSetOf();
        this.e = ScatterSetKt.mutableScatterSetOf();
        this.f = ScatterSetKt.mutableScatterSetOf();
    }

    public final void a(MutableScatterSet mutableScatterSet0, DelegatableNode delegatableNode0) {
        if(mutableScatterSet0.add(delegatableNode0) && this.e.getSize() + (this.d.getSize() + this.c.getSize()) == 1) {
            c0 c00 = new c0(0, this, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0, 10);
            this.a.invoke(c00);
        }
    }

    public static final void access$invalidateNodes(FocusInvalidationManager focusInvalidationManager0) {
        MutableScatterSet mutableScatterSet7;
        FocusState focusState0;
        int v16;
        MutableVector mutableVector10;
        MutableVector mutableVector9;
        long[] arr_v7;
        Object[] arr_object6;
        MutableScatterSet mutableScatterSet6;
        MutableVector mutableVector6;
        int v14;
        MutableScatterSet mutableScatterSet5;
        long[] arr_v6;
        MutableScatterSet mutableScatterSet4;
        MutableScatterSet mutableScatterSet3;
        MutableScatterSet mutableScatterSet2;
        MutableVector mutableVector4;
        MutableVector mutableVector3;
        long[] arr_v3;
        Object[] arr_object3;
        long[] arr_v2;
        Object[] arr_object2;
        long[] arr_v1;
        Object[] arr_object1;
        MutableScatterSet mutableScatterSet0 = focusInvalidationManager0.e;
        Object[] arr_object = mutableScatterSet0.elements;
        long[] arr_v = mutableScatterSet0.metadata;
        int v = arr_v.length - 2;
        MutableScatterSet mutableScatterSet1 = focusInvalidationManager0.c;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_131;
                }
                int v3 = 8 - (~(v1 - v) >>> 0x1F);
                int v4 = 0;
                while(v4 < v3) {
                    if((v2 & 0xFFL) < 0x80L) {
                        FocusPropertiesModifierNode focusPropertiesModifierNode0 = (FocusPropertiesModifierNode)arr_object[(v1 << 3) + v4];
                        if(focusPropertiesModifierNode0.getNode().isAttached()) {
                            MutableVector mutableVector0 = null;
                            Node modifier$Node0 = focusPropertiesModifierNode0.getNode();
                            while(modifier$Node0 != null) {
                                if(modifier$Node0 instanceof FocusTargetNode) {
                                    mutableScatterSet1.add(((FocusTargetNode)modifier$Node0));
                                    modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
                                }
                                else {
                                    if((modifier$Node0.getKindSet$ui_release() & 0x400) == 0 || !(modifier$Node0 instanceof DelegatingNode)) {
                                        arr_object2 = arr_object;
                                        arr_v2 = arr_v;
                                    }
                                    else {
                                        Node modifier$Node1 = ((DelegatingNode)modifier$Node0).getDelegate$ui_release();
                                        int v5 = 0;
                                        while(modifier$Node1 != null) {
                                            if((modifier$Node1.getKindSet$ui_release() & 0x400) == 0) {
                                                arr_object1 = arr_object;
                                                arr_v1 = arr_v;
                                            }
                                            else {
                                                ++v5;
                                                arr_object1 = arr_object;
                                                if(v5 == 1) {
                                                    arr_v1 = arr_v;
                                                    modifier$Node0 = modifier$Node1;
                                                }
                                                else {
                                                    if(mutableVector0 == null) {
                                                        arr_v1 = arr_v;
                                                        mutableVector0 = new MutableVector(new Node[16], 0);
                                                    }
                                                    else {
                                                        arr_v1 = arr_v;
                                                    }
                                                    if(modifier$Node0 != null) {
                                                        mutableVector0.add(modifier$Node0);
                                                        modifier$Node0 = null;
                                                    }
                                                    mutableVector0.add(modifier$Node1);
                                                }
                                            }
                                            modifier$Node1 = modifier$Node1.getChild$ui_release();
                                            arr_object = arr_object1;
                                            arr_v = arr_v1;
                                        }
                                        arr_object2 = arr_object;
                                        arr_v2 = arr_v;
                                        if(v5 == 1) {
                                            goto label_56;
                                        }
                                    }
                                    modifier$Node0 = DelegatableNodeKt.access$pop(mutableVector0);
                                label_56:
                                    arr_object = arr_object2;
                                    arr_v = arr_v2;
                                }
                            }
                            arr_object3 = arr_object;
                            arr_v3 = arr_v;
                            if(focusPropertiesModifierNode0.getNode().isAttached()) {
                                MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
                                Node modifier$Node2 = focusPropertiesModifierNode0.getNode().getChild$ui_release();
                                if(modifier$Node2 == null) {
                                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusPropertiesModifierNode0.getNode());
                                }
                                else {
                                    mutableVector1.add(modifier$Node2);
                                }
                                while(true) {
                                    if(!mutableVector1.isNotEmpty()) {
                                        goto label_122;
                                    }
                                    Node modifier$Node3 = (Node)q.j(mutableVector1, 1);
                                    if((modifier$Node3.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                                        DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, modifier$Node3);
                                    }
                                    else {
                                        while(modifier$Node3 != null) {
                                            if((modifier$Node3.getKindSet$ui_release() & 0x400) != 0) {
                                                MutableVector mutableVector2 = null;
                                                while(modifier$Node3 != null) {
                                                    if(modifier$Node3 instanceof FocusTargetNode) {
                                                        mutableScatterSet1.add(((FocusTargetNode)modifier$Node3));
                                                        mutableVector3 = mutableVector1;
                                                    }
                                                    else if((modifier$Node3.getKindSet$ui_release() & 0x400) == 0 || !(modifier$Node3 instanceof DelegatingNode)) {
                                                        mutableVector3 = mutableVector1;
                                                    }
                                                    else {
                                                        Node modifier$Node4 = ((DelegatingNode)modifier$Node3).getDelegate$ui_release();
                                                        int v6 = 0;
                                                        while(modifier$Node4 != null) {
                                                            if((modifier$Node4.getKindSet$ui_release() & 0x400) == 0) {
                                                                mutableVector4 = mutableVector1;
                                                            }
                                                            else {
                                                                ++v6;
                                                                if(v6 == 1) {
                                                                    mutableVector4 = mutableVector1;
                                                                    modifier$Node3 = modifier$Node4;
                                                                }
                                                                else {
                                                                    if(mutableVector2 == null) {
                                                                        mutableVector4 = mutableVector1;
                                                                        mutableVector2 = new MutableVector(new Node[16], 0);
                                                                    }
                                                                    else {
                                                                        mutableVector4 = mutableVector1;
                                                                    }
                                                                    if(modifier$Node3 != null) {
                                                                        mutableVector2.add(modifier$Node3);
                                                                        modifier$Node3 = null;
                                                                    }
                                                                    mutableVector2.add(modifier$Node4);
                                                                }
                                                            }
                                                            modifier$Node4 = modifier$Node4.getChild$ui_release();
                                                            mutableVector1 = mutableVector4;
                                                        }
                                                        mutableVector3 = mutableVector1;
                                                        if(v6 == 1) {
                                                            goto label_112;
                                                        }
                                                    }
                                                    modifier$Node3 = DelegatableNodeKt.access$pop(mutableVector2);
                                                label_112:
                                                    mutableVector1 = mutableVector3;
                                                }
                                                break;
                                            }
                                            modifier$Node3 = modifier$Node3.getChild$ui_release();
                                        }
                                    }
                                }
                            }
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        else {
                            arr_object3 = arr_object;
                            arr_v3 = arr_v;
                            goto label_122;
                        }
                        goto label_120;
                    }
                    else {
                    label_120:
                        arr_object3 = arr_object;
                        arr_v3 = arr_v;
                    }
                label_122:
                    v2 >>= 8;
                    ++v4;
                    arr_object = arr_object3;
                    arr_v = arr_v3;
                }
                Object[] arr_object4 = arr_object;
                long[] arr_v4 = arr_v;
                if(v3 == 8) {
                    goto label_133;
                label_131:
                    arr_object4 = arr_object;
                    arr_v4 = arr_v;
                label_133:
                    if(v1 != v) {
                        ++v1;
                        arr_object = arr_object4;
                        arr_v = arr_v4;
                        continue;
                    }
                }
                goto label_138;
            }
        }
        else {
        label_138:
            mutableScatterSet0.clear();
            mutableScatterSet2 = focusInvalidationManager0.d;
            Object[] arr_object5 = mutableScatterSet2.elements;
            long[] arr_v5 = mutableScatterSet2.metadata;
            int v7 = arr_v5.length - 2;
            mutableScatterSet3 = focusInvalidationManager0.f;
            if(v7 >= 0) {
                int v8 = 0;
                while(true) {
                    long v9 = arr_v5[v8];
                    if((~v9 << 7 & v9 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_303;
                    }
                    int v10 = 8 - (~(v8 - v7) >>> 0x1F);
                    long v11 = v9;
                    int v12 = 0;
                    while(v12 < v10) {
                        if((v11 & 0xFFL) < 0x80L) {
                            FocusEventModifierNode focusEventModifierNode0 = (FocusEventModifierNode)arr_object5[(v8 << 3) + v12];
                            if(focusEventModifierNode0.getNode().isAttached()) {
                                FocusTargetNode focusTargetNode0 = null;
                                MutableVector mutableVector5 = null;
                                Node modifier$Node5 = focusEventModifierNode0.getNode();
                                boolean z = false;
                                boolean z1 = true;
                                while(modifier$Node5 != null) {
                                    if(modifier$Node5 instanceof FocusTargetNode) {
                                        if(focusTargetNode0 != null) {
                                            z = true;
                                        }
                                        if(mutableScatterSet1.contains(((FocusTargetNode)modifier$Node5))) {
                                            mutableScatterSet3.add(((FocusTargetNode)modifier$Node5));
                                            z1 = false;
                                        }
                                        mutableScatterSet4 = mutableScatterSet0;
                                        arr_v6 = arr_v5;
                                        focusTargetNode0 = (FocusTargetNode)modifier$Node5;
                                    }
                                    else if((modifier$Node5.getKindSet$ui_release() & 0x400) == 0 || !(modifier$Node5 instanceof DelegatingNode)) {
                                        mutableScatterSet4 = mutableScatterSet0;
                                        arr_v6 = arr_v5;
                                    }
                                    else {
                                        Node modifier$Node6 = ((DelegatingNode)modifier$Node5).getDelegate$ui_release();
                                        arr_v6 = arr_v5;
                                        int v13 = 0;
                                        while(modifier$Node6 != null) {
                                            if((modifier$Node6.getKindSet$ui_release() & 0x400) == 0) {
                                                mutableScatterSet5 = mutableScatterSet0;
                                            }
                                            else {
                                                ++v13;
                                                mutableScatterSet5 = mutableScatterSet0;
                                                if(v13 == 1) {
                                                    modifier$Node5 = modifier$Node6;
                                                }
                                                else {
                                                    if(mutableVector5 == null) {
                                                        v14 = v13;
                                                        mutableVector6 = new MutableVector(new Node[16], 0);
                                                    }
                                                    else {
                                                        v14 = v13;
                                                        mutableVector6 = mutableVector5;
                                                    }
                                                    if(modifier$Node5 != null) {
                                                        mutableVector6.add(modifier$Node5);
                                                        modifier$Node5 = null;
                                                    }
                                                    mutableVector6.add(modifier$Node6);
                                                    mutableVector5 = mutableVector6;
                                                    v13 = v14;
                                                }
                                            }
                                            modifier$Node6 = modifier$Node6.getChild$ui_release();
                                            mutableScatterSet0 = mutableScatterSet5;
                                        }
                                        mutableScatterSet4 = mutableScatterSet0;
                                        if(v13 == 1) {
                                            goto label_207;
                                        }
                                    }
                                    modifier$Node5 = DelegatableNodeKt.access$pop(mutableVector5);
                                label_207:
                                    arr_v5 = arr_v6;
                                    mutableScatterSet0 = mutableScatterSet4;
                                }
                                mutableScatterSet6 = mutableScatterSet0;
                                arr_object6 = arr_object5;
                                arr_v7 = arr_v5;
                                if(!focusEventModifierNode0.getNode().isAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                MutableVector mutableVector7 = new MutableVector(new Node[16], 0);
                                Node modifier$Node7 = focusEventModifierNode0.getNode().getChild$ui_release();
                                if(modifier$Node7 == null) {
                                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector7, focusEventModifierNode0.getNode());
                                }
                                else {
                                    mutableVector7.add(modifier$Node7);
                                }
                                while(mutableVector7.isNotEmpty()) {
                                    Node modifier$Node8 = (Node)q.j(mutableVector7, 1);
                                    if((modifier$Node8.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                                        DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector7, modifier$Node8);
                                    }
                                    else {
                                        while(modifier$Node8 != null) {
                                            if((modifier$Node8.getKindSet$ui_release() & 0x400) != 0) {
                                                MutableVector mutableVector8 = null;
                                                while(modifier$Node8 != null) {
                                                    if(modifier$Node8 instanceof FocusTargetNode) {
                                                        if(focusTargetNode0 != null) {
                                                            z = true;
                                                        }
                                                        if(mutableScatterSet1.contains(((FocusTargetNode)modifier$Node8))) {
                                                            mutableScatterSet3.add(((FocusTargetNode)modifier$Node8));
                                                            z1 = false;
                                                        }
                                                        mutableVector9 = mutableVector7;
                                                        focusTargetNode0 = (FocusTargetNode)modifier$Node8;
                                                    }
                                                    else if((modifier$Node8.getKindSet$ui_release() & 0x400) == 0 || !(modifier$Node8 instanceof DelegatingNode)) {
                                                        mutableVector9 = mutableVector7;
                                                    }
                                                    else {
                                                        Node modifier$Node9 = ((DelegatingNode)modifier$Node8).getDelegate$ui_release();
                                                        Node modifier$Node10 = modifier$Node8;
                                                        int v15 = 0;
                                                        while(modifier$Node9 != null) {
                                                            if((modifier$Node9.getKindSet$ui_release() & 0x400) == 0) {
                                                                mutableVector10 = mutableVector7;
                                                            }
                                                            else {
                                                                ++v15;
                                                                mutableVector10 = mutableVector7;
                                                                if(v15 == 1) {
                                                                    modifier$Node10 = modifier$Node9;
                                                                }
                                                                else {
                                                                    if(mutableVector8 == null) {
                                                                        v16 = v15;
                                                                        mutableVector8 = new MutableVector(new Node[16], 0);
                                                                    }
                                                                    else {
                                                                        v16 = v15;
                                                                    }
                                                                    if(modifier$Node10 != null) {
                                                                        mutableVector8.add(modifier$Node10);
                                                                        modifier$Node10 = null;
                                                                    }
                                                                    mutableVector8.add(modifier$Node9);
                                                                    v15 = v16;
                                                                }
                                                            }
                                                            modifier$Node9 = modifier$Node9.getChild$ui_release();
                                                            mutableVector7 = mutableVector10;
                                                        }
                                                        mutableVector9 = mutableVector7;
                                                        if(v15 == 1) {
                                                            modifier$Node8 = modifier$Node10;
                                                            goto label_272;
                                                        }
                                                    }
                                                    modifier$Node8 = DelegatableNodeKt.access$pop(mutableVector8);
                                                label_272:
                                                    mutableVector7 = mutableVector9;
                                                }
                                                break;
                                            }
                                            modifier$Node8 = modifier$Node8.getChild$ui_release();
                                        }
                                    }
                                }
                                if(z1) {
                                    if(z) {
                                        focusState0 = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode0);
                                    }
                                    else {
                                        if(focusTargetNode0 != null) {
                                            FocusState focusState1 = focusTargetNode0.getFocusState();
                                            if(focusState1 != null) {
                                                focusState0 = focusState1;
                                                goto label_286;
                                            }
                                        }
                                        focusState0 = FocusStateImpl.Inactive;
                                    }
                                label_286:
                                    focusEventModifierNode0.onFocusEvent(focusState0);
                                }
                            }
                            else {
                                focusEventModifierNode0.onFocusEvent(FocusStateImpl.Inactive);
                                goto label_289;
                            }
                        }
                        else {
                        label_289:
                            mutableScatterSet6 = mutableScatterSet0;
                            arr_object6 = arr_object5;
                            arr_v7 = arr_v5;
                        }
                        v11 >>= 8;
                        ++v12;
                        arr_object5 = arr_object6;
                        arr_v5 = arr_v7;
                        mutableScatterSet0 = mutableScatterSet6;
                    }
                    mutableScatterSet7 = mutableScatterSet0;
                    Object[] arr_object7 = arr_object5;
                    long[] arr_v8 = arr_v5;
                    if(v10 == 8) {
                        goto label_306;
                    label_303:
                        mutableScatterSet7 = mutableScatterSet0;
                        arr_object7 = arr_object5;
                        arr_v8 = arr_v5;
                    label_306:
                        if(v8 != v7) {
                            ++v8;
                            arr_object5 = arr_object7;
                            arr_v5 = arr_v8;
                            mutableScatterSet0 = mutableScatterSet7;
                            continue;
                        }
                    }
                    break;
                }
            }
            else {
                mutableScatterSet7 = mutableScatterSet0;
            }
        }
        mutableScatterSet2.clear();
        Object[] arr_object8 = mutableScatterSet1.elements;
        long[] arr_v9 = mutableScatterSet1.metadata;
        int v17 = arr_v9.length - 2;
        if(v17 >= 0) {
            int v18 = 0;
            while(true) {
                long v19 = arr_v9[v18];
                if((~v19 << 7 & v19 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_336;
                }
                int v20 = 8 - (~(v18 - v17) >>> 0x1F);
                long v21 = v19;
                for(int v22 = 0; v22 < v20; ++v22) {
                    if((v21 & 0xFFL) < 0x80L) {
                        FocusTargetNode focusTargetNode1 = (FocusTargetNode)arr_object8[(v18 << 3) + v22];
                        if(focusTargetNode1.isAttached()) {
                            FocusStateImpl focusStateImpl0 = focusTargetNode1.getFocusState();
                            focusTargetNode1.invalidateFocus$ui_release();
                            if(focusStateImpl0 != focusTargetNode1.getFocusState() || mutableScatterSet3.contains(focusTargetNode1)) {
                                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode1);
                            }
                        }
                    }
                    v21 >>= 8;
                }
                if(v20 == 8) {
                label_336:
                    if(v18 != v17) {
                        ++v18;
                        continue;
                    }
                }
                goto label_339;
            }
        }
        else {
        label_339:
            mutableScatterSet1.clear();
            mutableScatterSet3.clear();
            focusInvalidationManager0.b.invoke();
            if(!mutableScatterSet7.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
            }
        }
        if(!mutableScatterSet2.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if(!mutableScatterSet1.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
        }
    }

    // 去混淆评级： 低(30)
    public final boolean hasPendingInvalidation() {
        return this.c.isNotEmpty() || this.e.isNotEmpty() || this.d.isNotEmpty();
    }

    public final void scheduleInvalidation(@NotNull FocusEventModifierNode focusEventModifierNode0) {
        this.a(this.d, focusEventModifierNode0);
    }

    public final void scheduleInvalidation(@NotNull FocusPropertiesModifierNode focusPropertiesModifierNode0) {
        this.a(this.e, focusPropertiesModifierNode0);
    }

    public final void scheduleInvalidation(@NotNull FocusTargetNode focusTargetNode0) {
        this.a(this.c, focusTargetNode0);
    }
}


package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import o1.f;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001B2\u00020\u0001:\u0001\u001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000F\u0010\t\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000F\u001A\u00020\u00062\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\bJ\r\u0010\u0011\u001A\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u000F\u0010\u0012\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u000F\u0010\u0013\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\bR \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "<init>", "()V", "", "requestFocus", "", "focus$ui_release", "()Z", "focus", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "findFocusTargetNode$ui_release", "(Lkotlin/jvm/functions/Function1;)Z", "findFocusTargetNode", "captureFocus", "freeFocus", "saveFocusedChild", "restoreFocusedChild", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "a", "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "focusRequesterNodes", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,247:1\n232#1:251\n233#1,4:253\n237#1:264\n238#1,5:294\n243#1:340\n244#1:345\n1208#2:248\n1187#2,2:249\n1208#2:269\n1187#2,2:270\n1208#2:403\n1187#2,2:404\n1#3:252\n1#3:346\n1#3:401\n460#4,7:257\n48#4:279\n467#4,4:341\n460#4,11:347\n460#4,11:358\n460#4,11:369\n460#4,11:380\n460#4,7:391\n48#4:413\n467#4,4:469\n94#5:265\n94#5:398\n297#6:266\n137#6,2:267\n139#6,7:272\n146#6,9:280\n432#6,5:289\n437#6:299\n442#6,2:301\n444#6,17:306\n461#6,8:326\n155#6,6:334\n297#6:399\n137#6:400\n138#6:402\n139#6,7:406\n146#6,9:414\n432#6,6:423\n442#6,2:430\n444#6,17:435\n461#6,8:455\n155#6,6:463\n264#7:300\n264#7:429\n245#8,3:303\n248#8,3:323\n245#8,3:432\n248#8,3:452\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n71#1:251\n71#1:253,4\n71#1:264\n71#1:294,5\n71#1:340\n71#1:345\n53#1:248\n53#1:249,2\n71#1:269\n71#1:270,2\n237#1:403\n237#1:404,2\n71#1:252\n237#1:401\n71#1:257,7\n71#1:279\n71#1:341,4\n97#1:347,11\n121#1:358,11\n142#1:369,11\n162#1:380,11\n236#1:391,7\n237#1:413\n236#1:469,4\n71#1:265\n237#1:398\n71#1:266\n71#1:267,2\n71#1:272,7\n71#1:280,9\n71#1:289,5\n71#1:299\n71#1:301,2\n71#1:306,17\n71#1:326,8\n71#1:334,6\n237#1:399\n237#1:400\n237#1:402\n237#1:406,7\n237#1:414,9\n237#1:423,6\n237#1:430,2\n237#1:435,17\n237#1:455,8\n237#1:463,6\n71#1:300\n237#1:429\n71#1:303,3\n71#1:323,3\n237#1:432,3\n237#1:452,3\n*E\n"})
public final class FocusRequester {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000EJ\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001A\u00020\u00058GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\b\u0010\tR\u0017\u0010\f\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001A\u0004\b\r\u0010\t¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "createRefs", "()Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "Landroidx/compose/ui/focus/FocusRequester;", "Cancel", "Landroidx/compose/ui/focus/FocusRequester;", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "()V", "Default", "getDefault", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000B\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\u0004J\u0010\u0010\f\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\r\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000E\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000E\u0010\u0004J\u0010\u0010\u000F\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0004J\u0010\u0010\u0010\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0011\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0012\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0013\u001A\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0004¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "Landroidx/compose/ui/focus/FocusRequester;", "component1", "()Landroidx/compose/ui/focus/FocusRequester;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class FocusRequesterFactory {
            public static final int $stable;
            @NotNull
            public static final FocusRequesterFactory INSTANCE;

            static {
                FocusRequesterFactory.INSTANCE = new FocusRequesterFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            @NotNull
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequester getCancel() {
            return FocusRequester.c;
        }

        @ExperimentalComposeUiApi
        public static void getCancel$annotations() {
        }

        @NotNull
        public final FocusRequester getDefault() {
            return FocusRequester.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableVector a;
    public static final FocusRequester b;
    public static final FocusRequester c;

    static {
        FocusRequester.Companion = new Companion(null);
        FocusRequester.b = new FocusRequester();
        FocusRequester.c = new FocusRequester();
    }

    public FocusRequester() {
        this.a = new MutableVector(new FocusRequesterModifierNode[16], 0);
    }

    public final boolean captureFocus() {
        MutableVector mutableVector0 = this.a;
        if(!mutableVector0.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                if(FocusRequesterModifierNodeKt.captureFocus(((FocusRequesterModifierNode)arr_object[v1]))) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean findFocusTargetNode$ui_release(@NotNull Function1 function10) {
        if(this == FocusRequester.Companion.getDefault() || this == FocusRequester.Companion.getCancel()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        MutableVector mutableVector0 = this.a;
        if(!mutableVector0.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z = false;
            while(true) {
                FocusRequesterModifierNode focusRequesterModifierNode0 = (FocusRequesterModifierNode)arr_object[v1];
                if(!focusRequesterModifierNode0.getNode().isAttached()) {
                    break;
                }
                MutableVector mutableVector1 = new MutableVector(new Node[16], 0);
                Node modifier$Node0 = focusRequesterModifierNode0.getNode().getChild$ui_release();
                if(modifier$Node0 == null) {
                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, focusRequesterModifierNode0.getNode());
                }
                else {
                    mutableVector1.add(modifier$Node0);
                }
            label_16:
                while(mutableVector1.isNotEmpty()) {
                    Node modifier$Node1 = (Node)q.j(mutableVector1, 1);
                    if((modifier$Node1.getAggregateChildKindSet$ui_release() & 0x400) == 0) {
                        DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector1, modifier$Node1);
                    }
                    else {
                        while(modifier$Node1 != null) {
                            if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0) {
                                MutableVector mutableVector2 = null;
                                while(modifier$Node1 != null) {
                                    if(!(modifier$Node1 instanceof FocusTargetNode)) {
                                        if((modifier$Node1.getKindSet$ui_release() & 0x400) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                            Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                            int v2 = 0;
                                            while(modifier$Node2 != null) {
                                                if((modifier$Node2.getKindSet$ui_release() & 0x400) != 0) {
                                                    ++v2;
                                                    if(v2 == 1) {
                                                        modifier$Node1 = modifier$Node2;
                                                    }
                                                    else {
                                                        if(mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Node[16], 0);
                                                        }
                                                        if(modifier$Node1 != null) {
                                                            mutableVector2.add(modifier$Node1);
                                                            modifier$Node1 = null;
                                                        }
                                                        mutableVector2.add(modifier$Node2);
                                                    }
                                                }
                                                modifier$Node2 = modifier$Node2.getChild$ui_release();
                                            }
                                            if(v2 != 1) {
                                                goto label_49;
                                            }
                                            continue;
                                        }
                                    }
                                    else if((((FocusTargetNode)modifier$Node1).fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean)function10.invoke(((FocusTargetNode)modifier$Node1))).booleanValue() : TwoDimensionalFocusSearchKt.findChildCorrespondingToFocusEnter--OM-vw8(((FocusTargetNode)modifier$Node1), 7, function10))) {
                                        z = true;
                                        break label_16;
                                    }
                                label_49:
                                    modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector2);
                                }
                                break;
                            }
                            modifier$Node1 = modifier$Node1.getChild$ui_release();
                        }
                    }
                }
                ++v1;
                if(v1 >= v) {
                    return z;
                }
            }
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        return false;
    }

    public final boolean focus$ui_release() {
        return this.findFocusTargetNode$ui_release(f.y);
    }

    public final boolean freeFocus() {
        MutableVector mutableVector0 = this.a;
        if(!mutableVector0.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                if(FocusRequesterModifierNodeKt.freeFocus(((FocusRequesterModifierNode)arr_object[v1]))) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    @NotNull
    public final MutableVector getFocusRequesterNodes$ui_release() {
        return this.a;
    }

    public final void requestFocus() {
        this.focus$ui_release();
    }

    @ExperimentalComposeUiApi
    public final boolean restoreFocusedChild() {
        MutableVector mutableVector0 = this.a;
        if(!mutableVector0.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z = false;
            do {
                z = FocusRequesterModifierNodeKt.restoreFocusedChild(((FocusRequesterModifierNode)arr_object[v1])) || z;
                ++v1;
            }
            while(v1 < v);
            return z;
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public final boolean saveFocusedChild() {
        MutableVector mutableVector0 = this.a;
        if(!mutableVector0.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                if(FocusRequesterModifierNodeKt.saveFocusedChild(((FocusRequesterModifierNode)arr_object[v1]))) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }
}


package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Node;
import b2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BackwardsCompatNodeKt {
    public static final BackwardsCompatNodeKt.DetachedModifierLocalReadScope.1 a;
    public static final d b;
    public static final d c;

    static {
        BackwardsCompatNodeKt.a = new BackwardsCompatNodeKt.DetachedModifierLocalReadScope.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        BackwardsCompatNodeKt.b = d.x;
        BackwardsCompatNodeKt.c = d.y;
    }

    public static final BackwardsCompatNodeKt.DetachedModifierLocalReadScope.1 access$getDetachedModifierLocalReadScope$p() {
        return BackwardsCompatNodeKt.a;
    }

    public static final Function1 access$getOnDrawCacheReadsChanged$p() {
        return BackwardsCompatNodeKt.b;
    }

    public static final boolean access$isChainUpdate(BackwardsCompatNode backwardsCompatNode0) {
        Node modifier$Node0 = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode0).getNodes$ui_release().getTail$ui_release();
        Intrinsics.checkNotNull(modifier$Node0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode)modifier$Node0).getAttachHasBeenRun();
    }
}


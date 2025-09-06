package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "isOutMostLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1962:1\n205#2:1963\n476#3,11:1964\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1857#1:1963\n1857#1:1964,11\n*E\n"})
public final class LayoutNodeLayoutDelegateKt {
    public static final boolean isOutMostLookaheadRoot(@NotNull LayoutNode layoutNode0) {
        if(layoutNode0.getLookaheadRoot$ui_release() != null) {
            LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
            return (layoutNode1 == null ? null : layoutNode1.getLookaheadRoot$ui_release()) == null || layoutNode0.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release();
        }
        return false;
    }
}


package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import androidx.compose.ui.node.DelegatableNode;
import g0.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultBringIntoViewParent", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/foundation/relocation/BringIntoViewParent;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BringIntoViewResponder_androidKt {
    public static final Rect access$toRect(androidx.compose.ui.geometry.Rect rect0) {
        return new Rect(((int)rect0.getLeft()), ((int)rect0.getTop()), ((int)rect0.getRight()), ((int)rect0.getBottom()));
    }

    @NotNull
    public static final BringIntoViewParent defaultBringIntoViewParent(@NotNull DelegatableNode delegatableNode0) {
        return new g(delegatableNode0);
    }
}


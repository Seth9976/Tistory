package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import g0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class BringIntoViewRequesterKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new b();
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier bringIntoViewRequester(@NotNull Modifier modifier0, @NotNull BringIntoViewRequester bringIntoViewRequester0) {
        return modifier0.then(new BringIntoViewRequesterElement(bringIntoViewRequester0));
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier bringIntoViewResponder(@NotNull Modifier modifier0, @NotNull BringIntoViewResponder bringIntoViewResponder0) {
        return modifier0.then(new BringIntoViewResponderElement(bringIntoViewResponder0));
    }

    @Nullable
    public static final BringIntoViewParent findBringIntoViewParent(@NotNull DelegatableNode delegatableNode0) {
        if(!delegatableNode0.getNode().isAttached()) {
            return null;
        }
        BringIntoViewParent bringIntoViewParent0 = (BringIntoViewParent)TraversableNodeKt.findNearestAncestor(delegatableNode0, BringIntoViewResponderNode.TraverseKey);
        return bringIntoViewParent0 == null ? BringIntoViewResponder_androidKt.defaultBringIntoViewParent(delegatableNode0) : bringIntoViewParent0;
    }
}


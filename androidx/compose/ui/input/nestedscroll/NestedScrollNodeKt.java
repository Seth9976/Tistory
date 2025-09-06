package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"nestedScrollModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NestedScrollNodeKt {
    @NotNull
    public static final DelegatableNode nestedScrollModifierNode(@NotNull NestedScrollConnection nestedScrollConnection0, @Nullable NestedScrollDispatcher nestedScrollDispatcher0) {
        return new NestedScrollNode(nestedScrollConnection0, nestedScrollDispatcher0);
    }
}


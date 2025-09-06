package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"nestedScroll", "Landroidx/compose/ui/Modifier;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NestedScrollModifierKt {
    @NotNull
    public static final Modifier nestedScroll(@NotNull Modifier modifier0, @NotNull NestedScrollConnection nestedScrollConnection0, @Nullable NestedScrollDispatcher nestedScrollDispatcher0) {
        return modifier0.then(new NestedScrollElement(nestedScrollConnection0, nestedScrollDispatcher0));
    }

    public static Modifier nestedScroll$default(Modifier modifier0, NestedScrollConnection nestedScrollConnection0, NestedScrollDispatcher nestedScrollDispatcher0, int v, Object object0) {
        if((v & 2) != 0) {
            nestedScrollDispatcher0 = null;
        }
        return NestedScrollModifierKt.nestedScroll(modifier0, nestedScrollConnection0, nestedScrollDispatcher0);
    }
}


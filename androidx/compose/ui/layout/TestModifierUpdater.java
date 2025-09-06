package androidx.compose.ui.layout;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY})
@StabilityInferred(parameters = 0)
@Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "updateModifier", "(Landroidx/compose/ui/Modifier;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TestModifierUpdater {
    public static final int $stable = 8;
    public final LayoutNode a;

    public TestModifierUpdater(@NotNull LayoutNode layoutNode0) {
        this.a = layoutNode0;
    }

    public final void updateModifier(@NotNull Modifier modifier0) {
        this.a.setModifier(modifier0);
    }
}


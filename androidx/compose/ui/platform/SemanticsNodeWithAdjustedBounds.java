package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;)V", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "b", "Landroid/graphics/Rect;", "getAdjustedBounds", "()Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsNodeWithAdjustedBounds {
    public static final int $stable = 8;
    public final SemanticsNode a;
    public final Rect b;

    public SemanticsNodeWithAdjustedBounds(@NotNull SemanticsNode semanticsNode0, @NotNull Rect rect0) {
        this.a = semanticsNode0;
        this.b = rect0;
    }

    @NotNull
    public final Rect getAdjustedBounds() {
        return this.b;
    }

    @NotNull
    public final SemanticsNode getSemanticsNode() {
        return this.a;
    }
}


package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0004\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0005H\u0017¢\u0006\u0004\b\u0004\u0010\u0007J\u001B\u0010\n\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u000E\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001A\u00020\fH\u0017¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0010\u001A\u00020\u0002*\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u000E\u001A\u00020\u0002*\u00020\u00022\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0016¢\u0006\u0004\b\u000E\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "alignBy", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
public final class RowScopeInstance implements RowScope {
    public static final int $stable;
    @NotNull
    public static final RowScopeInstance INSTANCE;

    static {
        RowScopeInstance.INSTANCE = new RowScopeInstance();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier0, @NotNull Vertical alignment$Vertical0) {
        return modifier0.then(new VerticalAlignElement(alignment$Vertical0));
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull HorizontalAlignmentLine horizontalAlignmentLine0) {
        return modifier0.then(new WithAlignmentLineElement(horizontalAlignmentLine0));
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new WithAlignmentLineBlockElement(function10));
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier0) {
        return this.alignBy(modifier0, AlignmentLineKt.getFirstBaseline());
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier0, float f, boolean z) {
        if(((double)f) <= 0.0) {
            throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
        }
        return modifier0.then(new LayoutWeightElement(c.coerceAtMost(f, 3.402823E+38f), z));
    }
}


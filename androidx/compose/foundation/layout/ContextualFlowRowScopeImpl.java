package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001C\u0010\u000E\u001A\u00020\u000B*\u00020\u000B2\u0006\u0010\r\u001A\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ(\u0010\u0013\u001A\u00020\u000B*\u00020\u000B2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001C\u0010\u0013\u001A\u00020\u000B*\u00020\u000B2\u0006\u0010\u0016\u001A\u00020\u0015H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0017J\u0014\u0010\u0018\u001A\u00020\u000B*\u00020\u000BH\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001E\u0010\u001C\u001A\u00020\u000B*\u00020\u000B2\b\b\u0003\u0010\u001B\u001A\u00020\u001AH\u0097\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ&\u0010\u001E\u001A\u00020\u000B*\u00020\u000B2\b\b\u0001\u0010\u001E\u001A\u00020\u001A2\u0006\u0010 \u001A\u00020\u001FH\u0097\u0001¢\u0006\u0004\b\u001E\u0010!R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001A\u0010\u0005\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010#\u001A\u0004\b\'\u0010%R \u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R \u0010\b\u001A\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010)\u001A\u0004\b-\u0010+\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "", "lineIndex", "indexInLine", "Landroidx/compose/ui/unit/Dp;", "maxWidthInLine", "maxHeight", "<init>", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLineBlock", "alignBy", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;", "alignByBaseline", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "a", "I", "getLineIndex", "()I", "b", "getIndexInLine", "c", "F", "getMaxWidthInLine-D9Ej5fM", "()F", "d", "getMaxHeight-D9Ej5fM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContextualFlowRowScopeImpl implements ContextualFlowRowScope, FlowRowScope {
    public static final int $stable;
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final FlowRowScopeInstance e;

    public ContextualFlowRowScopeImpl(int v, int v1, float f, float f1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = f1;
        this.e = FlowRowScopeInstance.INSTANCE;
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier0, @NotNull Vertical alignment$Vertical0) {
        return this.e.align(modifier0, alignment$Vertical0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull HorizontalAlignmentLine horizontalAlignmentLine0) {
        return this.e.alignBy(modifier0, horizontalAlignmentLine0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return this.e.alignBy(modifier0, function10);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier alignByBaseline(@NotNull Modifier modifier0) {
        return this.e.alignByBaseline(modifier0);
    }

    @Override  // androidx.compose.foundation.layout.FlowRowScope
    @ExperimentalLayoutApi
    @NotNull
    public Modifier fillMaxRowHeight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, to = 1.0) float f) {
        return this.e.fillMaxRowHeight(modifier0, f);
    }

    @Override  // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getIndexInLine() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getLineIndex() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.layout.ContextualFlowRowScope
    public float getMaxHeight-D9Ej5fM() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.layout.ContextualFlowRowScope
    public float getMaxWidthInLine-D9Ej5fM() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, fromInclusive = false) float f, boolean z) {
        return this.e.weight(modifier0, f, z);
    }
}


package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u001C\u0010\u0006\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001A\u00020\u0003*\u00020\u00032\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u001C\u0010\f\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u000EH\u0097\u0001¢\u0006\u0004\b\f\u0010\u0010J(\u0010\u0012\u001A\u00020\u0003*\u00020\u00032\b\b\u0001\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u001B\u0010\u0017\u001A\u00020\u0003*\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/FlowColumnScopeInstance;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "align", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLineBlock", "alignBy", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "alignmentLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "fraction", "fillMaxColumnWidth", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1544:1\n1#2:1545\n*E\n"})
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {
    public static final int $stable;
    @NotNull
    public static final FlowColumnScopeInstance INSTANCE;
    public final ColumnScopeInstance a;

    static {
        FlowColumnScopeInstance.INSTANCE = new FlowColumnScopeInstance();
    }

    public FlowColumnScopeInstance() {
        this.a = ColumnScopeInstance.INSTANCE;
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier align(@NotNull Modifier modifier0, @NotNull Horizontal alignment$Horizontal0) {
        return this.a.align(modifier0, alignment$Horizontal0);
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull VerticalAlignmentLine verticalAlignmentLine0) {
        return this.a.alignBy(modifier0, verticalAlignmentLine0);
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier alignBy(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return this.a.alignBy(modifier0, function10);
    }

    @Override  // androidx.compose.foundation.layout.FlowColumnScope
    @NotNull
    public Modifier fillMaxColumnWidth(@NotNull Modifier modifier0, float f) {
        if(Double.compare(f, 0.0) < 0) {
            throw new IllegalArgumentException(("invalid fraction " + f + "; must be greater than or equal to zero").toString());
        }
        if(((double)f) > 1.0) {
            throw new IllegalArgumentException(("invalid fraction " + f + "; must not be greater than 1.0").toString());
        }
        return modifier0.then(new FillCrossAxisSizeElement(f));
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @NotNull
    public Modifier weight(@NotNull Modifier modifier0, @FloatRange(from = 0.0, fromInclusive = false) float f, boolean z) {
        return this.a.weight(modifier0, f, z);
    }
}


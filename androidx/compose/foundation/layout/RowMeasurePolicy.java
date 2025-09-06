package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000B\u001A\u00020\n*\u00020\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\r\u001A\u00020\n*\u00020\tH\u0016\u00A2\u0006\u0004\b\r\u0010\fJ,\u0010\u0017\u001A\u00020\u0014*\u00020\u000E2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0018\u001A\u00020\n2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJi\u0010(\u001A\u00020\u00142\u000E\u0010!\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\n2\u0006\u0010#\u001A\u00020\n2\b\u0010$\u001A\u0004\u0018\u00010\u00192\u0006\u0010%\u001A\u00020\n2\u0006\u0010&\u001A\u00020\n2\u0006\u0010\'\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b(\u0010)J=\u00102\u001A\u00020\u00122\u0006\u0010*\u001A\u00020\n2\u0006\u0010+\u001A\u00020\n2\u0006\u0010,\u001A\u00020\n2\u0006\u0010-\u001A\u00020\n2\u0006\u0010/\u001A\u00020.H\u0016\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101J)\u00106\u001A\u00020\n*\u0002032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002040\u000F2\u0006\u00105\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b6\u00107J)\u00109\u001A\u00020\n*\u0002032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002040\u000F2\u0006\u00108\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b9\u00107J)\u0010:\u001A\u00020\n*\u0002032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002040\u000F2\u0006\u00105\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b:\u00107J)\u0010;\u001A\u00020\n*\u0002032\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002040\u000F2\u0006\u00108\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b;\u00107J$\u0010<\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b<\u0010=J\u0010\u0010?\u001A\u00020>H\u00D6\u0001\u00A2\u0006\u0004\b?\u0010@J\u0010\u0010A\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\bA\u0010BJ\u001A\u0010E\u001A\u00020.2\b\u0010D\u001A\u0004\u0018\u00010CH\u00D6\u0003\u00A2\u0006\u0004\bE\u0010F\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006G"}, d2 = {"Landroidx/compose/foundation/layout/RowMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "<init>", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V", "Landroidx/compose/ui/layout/Placeable;", "", "mainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "crossAxisSize", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "measureScope", "", "populateMainAxisPositions", "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)V", "", "placeables", "beforeCrossAxisAlignmentLine", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "placeHelper", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "createConstraints", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "copy", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/RowMeasurePolicy;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RowMeasurePolicy implements RowColumnMeasurePolicy, MeasurePolicy {
    public static final int $stable;
    public final Horizontal a;
    public final Vertical b;

    public RowMeasurePolicy(@NotNull Horizontal arrangement$Horizontal0, @NotNull Vertical alignment$Vertical0) {
        this.a = arrangement$Horizontal0;
        this.b = alignment$Vertical0;
    }

    public static final int access$getCrossAxisPosition(RowMeasurePolicy rowMeasurePolicy0, Placeable placeable0, RowColumnParentData rowColumnParentData0, int v, int v1) {
        rowMeasurePolicy0.getClass();
        CrossAxisAlignment crossAxisAlignment0 = rowColumnParentData0 == null ? null : rowColumnParentData0.getCrossAxisAlignment();
        return crossAxisAlignment0 == null ? rowMeasurePolicy0.b.align(0, v - placeable0.getHeight()) : crossAxisAlignment0.align$foundation_layout_release(v - placeable0.getHeight(), LayoutDirection.Ltr, placeable0, v1);
    }

    @NotNull
    public final RowMeasurePolicy copy(@NotNull Horizontal arrangement$Horizontal0, @NotNull Vertical alignment$Vertical0) {
        return new RowMeasurePolicy(arrangement$Horizontal0, alignment$Vertical0);
    }

    public static RowMeasurePolicy copy$default(RowMeasurePolicy rowMeasurePolicy0, Horizontal arrangement$Horizontal0, Vertical alignment$Vertical0, int v, Object object0) {
        if((v & 1) != 0) {
            arrangement$Horizontal0 = rowMeasurePolicy0.a;
        }
        if((v & 2) != 0) {
            alignment$Vertical0 = rowMeasurePolicy0.b;
        }
        return rowMeasurePolicy0.copy(arrangement$Horizontal0, alignment$Vertical0);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public long createConstraints-xF2OJ5Q(int v, int v1, int v2, int v3, boolean z) {
        return RowKt.createRowConstraints(z, v, v1, v2, v3);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(@NotNull Placeable placeable0) {
        return placeable0.getHeight();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RowMeasurePolicy)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((RowMeasurePolicy)object0).a) ? Intrinsics.areEqual(this.b, ((RowMeasurePolicy)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(@NotNull Placeable placeable0) {
        return placeable0.getWidth();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(list0, v, v1);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(list0, v, v1);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        return RowColumnMeasurePolicyKt.measure$default(this, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), Constraints.getMaxWidth-impl(v), Constraints.getMaxHeight-impl(v), measureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM()), measureScope0, list0, new Placeable[list0.size()], 0, list0.size(), null, 0, 0xC00, null);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(list0, v, v1);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(list0, v, v1);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @NotNull
    public MeasureResult placeHelper(@NotNull Placeable[] arr_placeable, @NotNull MeasureScope measureScope0, int v, @NotNull int[] arr_v, int v1, int v2, @Nullable int[] arr_v1, int v3, int v4, int v5) {
        return MeasureScope.layout$default(measureScope0, v1, v2, null, new s3(arr_placeable, this, v2, v, arr_v), 4, null);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, @NotNull MeasureScope measureScope0) {
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        this.a.arrange(measureScope0, v, arr_v, layoutDirection0, arr_v1);
    }

    @Override
    @NotNull
    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}


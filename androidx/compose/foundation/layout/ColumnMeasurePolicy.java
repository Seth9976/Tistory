package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
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
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000B\u001A\u00020\n*\u00020\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\r\u001A\u00020\n*\u00020\tH\u0016\u00A2\u0006\u0004\b\r\u0010\fJ/\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u000E\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016Ji\u0010 \u001A\u00020\u001F2\u000E\u0010\u0018\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00172\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\n2\u0006\u0010\u001A\u001A\u00020\n2\b\u0010\u001B\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u001C\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\n2\u0006\u0010\u001E\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b \u0010!J=\u0010+\u001A\u00020(2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020\n2\u0006\u0010$\u001A\u00020\n2\u0006\u0010%\u001A\u00020\n2\u0006\u0010\'\u001A\u00020&H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*J,\u00102\u001A\u00020\u001F*\u00020\u00122\f\u0010.\u001A\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010/\u001A\u00020(H\u0016\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u00101J)\u00106\u001A\u00020\n*\u0002032\f\u0010.\u001A\b\u0012\u0004\u0012\u0002040,2\u0006\u00105\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b6\u00107J)\u00109\u001A\u00020\n*\u0002032\f\u0010.\u001A\b\u0012\u0004\u0012\u0002040,2\u0006\u00108\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b9\u00107J)\u0010:\u001A\u00020\n*\u0002032\f\u0010.\u001A\b\u0012\u0004\u0012\u0002040,2\u0006\u00105\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b:\u00107J)\u0010;\u001A\u00020\n*\u0002032\f\u0010.\u001A\b\u0012\u0004\u0012\u0002040,2\u0006\u00108\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b;\u00107J$\u0010<\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b<\u0010=J\u0010\u0010?\u001A\u00020>H\u00D6\u0001\u00A2\u0006\u0004\b?\u0010@J\u0010\u0010A\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\bA\u0010BJ\u001A\u0010E\u001A\u00020&2\b\u0010D\u001A\u0004\u0018\u00010CH\u00D6\u0003\u00A2\u0006\u0004\bE\u0010F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006G"}, d2 = {"Landroidx/compose/foundation/layout/ColumnMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "<init>", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;)V", "Landroidx/compose/ui/layout/Placeable;", "", "mainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "crossAxisSize", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "", "populateMainAxisPositions", "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)V", "", "placeables", "beforeCrossAxisAlignmentLine", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Landroidx/compose/ui/unit/Constraints;", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "createConstraints", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "copy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/ColumnMeasurePolicy;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ColumnMeasurePolicy implements RowColumnMeasurePolicy, MeasurePolicy {
    public static final int $stable;
    public final Vertical a;
    public final Horizontal b;

    public ColumnMeasurePolicy(@NotNull Vertical arrangement$Vertical0, @NotNull Horizontal alignment$Horizontal0) {
        this.a = arrangement$Vertical0;
        this.b = alignment$Horizontal0;
    }

    public static final int access$getCrossAxisPosition(ColumnMeasurePolicy columnMeasurePolicy0, Placeable placeable0, RowColumnParentData rowColumnParentData0, int v, int v1, LayoutDirection layoutDirection0) {
        columnMeasurePolicy0.getClass();
        CrossAxisAlignment crossAxisAlignment0 = rowColumnParentData0 == null ? null : rowColumnParentData0.getCrossAxisAlignment();
        return crossAxisAlignment0 == null ? columnMeasurePolicy0.b.align(0, v - placeable0.getWidth(), layoutDirection0) : crossAxisAlignment0.align$foundation_layout_release(v - placeable0.getWidth(), layoutDirection0, placeable0, v1);
    }

    @NotNull
    public final ColumnMeasurePolicy copy(@NotNull Vertical arrangement$Vertical0, @NotNull Horizontal alignment$Horizontal0) {
        return new ColumnMeasurePolicy(arrangement$Vertical0, alignment$Horizontal0);
    }

    public static ColumnMeasurePolicy copy$default(ColumnMeasurePolicy columnMeasurePolicy0, Vertical arrangement$Vertical0, Horizontal alignment$Horizontal0, int v, Object object0) {
        if((v & 1) != 0) {
            arrangement$Vertical0 = columnMeasurePolicy0.a;
        }
        if((v & 2) != 0) {
            alignment$Horizontal0 = columnMeasurePolicy0.b;
        }
        return columnMeasurePolicy0.copy(arrangement$Vertical0, alignment$Horizontal0);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public long createConstraints-xF2OJ5Q(int v, int v1, int v2, int v3, boolean z) {
        return ColumnKt.createColumnConstraints(z, v, v1, v2, v3);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int crossAxisSize(@NotNull Placeable placeable0) {
        return placeable0.getWidth();
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ColumnMeasurePolicy)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ColumnMeasurePolicy)object0).a) ? Intrinsics.areEqual(this.b, ((ColumnMeasurePolicy)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public int mainAxisSize(@NotNull Placeable placeable0) {
        return placeable0.getHeight();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxHeight(list0, v, v1);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMaxWidth(list0, v, v1);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        return RowColumnMeasurePolicyKt.measure$default(this, Constraints.getMinHeight-impl(v), Constraints.getMinWidth-impl(v), Constraints.getMaxHeight-impl(v), Constraints.getMaxWidth-impl(v), measureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM()), measureScope0, list0, new Placeable[list0.size()], 0, list0.size(), null, 0, 0xC00, null);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinHeight(list0, v, v1);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        int v1 = intrinsicMeasureScope0.roundToPx-0680j_4(this.a.getSpacing-D9Ej5fM());
        return IntrinsicMeasureBlocks.INSTANCE.VerticalMinWidth(list0, v, v1);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @NotNull
    public MeasureResult placeHelper(@NotNull Placeable[] arr_placeable, @NotNull MeasureScope measureScope0, int v, @NotNull int[] arr_v, int v1, int v2, @Nullable int[] arr_v1, int v3, int v4, int v5) {
        return MeasureScope.layout$default(measureScope0, v2, v1, null, new a0(arr_placeable, this, v2, v, measureScope0, arr_v), 4, null);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public void populateMainAxisPositions(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, @NotNull MeasureScope measureScope0) {
        this.a.arrange(measureScope0, v, arr_v, arr_v1);
    }

    @Override
    @NotNull
    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}


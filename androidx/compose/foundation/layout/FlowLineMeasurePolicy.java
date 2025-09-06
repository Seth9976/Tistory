package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J=\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u000BH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ2\u0010\u001B\u001A\u00020\u00142\u0006\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001F2\u0006\u0010 \u001A\u00020\u00142\u0006\u0010!\u001A\u00020\"2\u0006\u0010#\u001A\u00020\u0014H\u0016Jg\u0010$\u001A\u00020%2\u000E\u0010&\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\'2\u0006\u0010(\u001A\u00020)2\u0006\u0010#\u001A\u00020\u00142\u0006\u0010*\u001A\u00020+2\u0006\u0010,\u001A\u00020\u00142\u0006\u0010 \u001A\u00020\u00142\b\u0010-\u001A\u0004\u0018\u00010+2\u0006\u0010.\u001A\u00020\u00142\u0006\u0010/\u001A\u00020\u00142\u0006\u00100\u001A\u00020\u0014H\u0016\u00A2\u0006\u0002\u00101J(\u00102\u001A\u0002032\u0006\u0010,\u001A\u00020\u00142\u0006\u00104\u001A\u00020+2\u0006\u0010*\u001A\u00020+2\u0006\u0010(\u001A\u00020)H\u0016J\f\u00105\u001A\u00020\u0014*\u00020\u001DH\u0016J\f\u00106\u001A\u00020\u0014*\u00020\u001DH\u0016R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\fR\u0012\u0010\r\u001A\u00020\u000EX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\n\u0004\b!0\u0001\u00A8\u00067\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "isHorizontal", "", "()Z", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "isPrioritizing", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "getCrossAxisPosition", "placeable", "Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "crossAxisLayoutSize", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeCrossAxisAlignmentLine", "placeHelper", "Landroidx/compose/ui/layout/MeasureResult;", "placeables", "", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "mainAxisPositions", "", "mainAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "populateMainAxisPositions", "", "childrenMainAxisSize", "crossAxisSize", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default long createConstraints-xF2OJ5Q(int v, int v1, int v2, int v3, boolean z) {
        return this.isHorizontal() ? RowKt.createRowConstraints(z, v, v1, v2, v3) : ColumnKt.createColumnConstraints(z, v, v1, v2, v3);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int crossAxisSize(@NotNull Placeable placeable0) {
        return this.isHorizontal() ? placeable0.getMeasuredHeight() : placeable0.getMeasuredWidth();
    }

    @NotNull
    CrossAxisAlignment getCrossAxisAlignment();

    default int getCrossAxisPosition(@NotNull Placeable placeable0, @Nullable RowColumnParentData rowColumnParentData0, int v, @NotNull LayoutDirection layoutDirection0, int v1) {
        CrossAxisAlignment crossAxisAlignment0;
        if(rowColumnParentData0 == null) {
            crossAxisAlignment0 = this.getCrossAxisAlignment();
        }
        else {
            crossAxisAlignment0 = rowColumnParentData0.getCrossAxisAlignment();
            if(crossAxisAlignment0 == null) {
                crossAxisAlignment0 = this.getCrossAxisAlignment();
            }
        }
        int v2 = this.crossAxisSize(placeable0);
        if(this.isHorizontal()) {
            layoutDirection0 = LayoutDirection.Ltr;
        }
        return crossAxisAlignment0.align$foundation_layout_release(v - v2, layoutDirection0, placeable0, v1);
    }

    @NotNull
    Horizontal getHorizontalArrangement();

    @NotNull
    Vertical getVerticalArrangement();

    boolean isHorizontal();

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int mainAxisSize(@NotNull Placeable placeable0) {
        return this.isHorizontal() ? placeable0.getMeasuredWidth() : placeable0.getMeasuredHeight();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @NotNull
    default MeasureResult placeHelper(@NotNull Placeable[] arr_placeable, @NotNull MeasureScope measureScope0, int v, @NotNull int[] arr_v, int v1, int v2, @Nullable int[] arr_v1, int v3, int v4, int v5) {
        return this.isHorizontal() ? MeasureScope.layout$default(measureScope0, v1, v2, null, new c2(arr_v1, v3, v4, v5, arr_placeable, this, v2, measureScope0, v, arr_v), 4, null) : MeasureScope.layout$default(measureScope0, v2, v1, null, new c2(arr_v1, v3, v4, v5, arr_placeable, this, v2, measureScope0, v, arr_v), 4, null);
    }

    @Override  // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void populateMainAxisPositions(int v, @NotNull int[] arr_v, @NotNull int[] arr_v1, @NotNull MeasureScope measureScope0) {
        if(this.isHorizontal()) {
            this.getHorizontalArrangement().arrange(measureScope0, v, arr_v, measureScope0.getLayoutDirection(), arr_v1);
            return;
        }
        this.getVerticalArrangement().arrange(measureScope0, v, arr_v, arr_v1);
    }
}


package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J?\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJg\u0010\r\u001A\u00020\u000E2\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00052\u0006\u0010\u0018\u001A\u00020\u00052\b\u0010\u0019\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u001A\u001A\u00020\u00052\u0006\u0010\u001B\u001A\u00020\u00052\u0006\u0010\u001C\u001A\u00020\u0005H&¢\u0006\u0002\u0010\u001DJ(\u0010\u001E\u001A\u00020\u001F2\u0006\u0010\u0017\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0012\u001A\u00020\u0013H&J\f\u0010!\u001A\u00020\u0005*\u00020\u0011H&J\f\u0010\"\u001A\u00020\u0005*\u00020\u0011H&ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "isPrioritizing", "", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "placeHelper", "Landroidx/compose/ui/layout/MeasureResult;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "populateMainAxisPositions", "", "childrenMainAxisSize", "crossAxisSize", "mainAxisSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface RowColumnMeasurePolicy {
    long createConstraints-xF2OJ5Q(int arg1, int arg2, int arg3, int arg4, boolean arg5);

    static long createConstraints-xF2OJ5Q$default(RowColumnMeasurePolicy rowColumnMeasurePolicy0, int v, int v1, int v2, int v3, boolean z, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if((v4 & 16) != 0) {
            z = false;
        }
        return rowColumnMeasurePolicy0.createConstraints-xF2OJ5Q(v, v1, v2, v3, z);
    }

    int crossAxisSize(@NotNull Placeable arg1);

    int mainAxisSize(@NotNull Placeable arg1);

    @NotNull
    MeasureResult placeHelper(@NotNull Placeable[] arg1, @NotNull MeasureScope arg2, int arg3, @NotNull int[] arg4, int arg5, int arg6, @Nullable int[] arg7, int arg8, int arg9, int arg10);

    void populateMainAxisPositions(int arg1, @NotNull int[] arg2, @NotNull int[] arg3, @NotNull MeasureScope arg4);
}


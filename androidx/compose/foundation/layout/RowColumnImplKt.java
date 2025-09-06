package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001A\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003\"\u001A\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0006\"\u001A\u0010\n\u001A\u00020\u0007*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t\"\u001A\u0010\u000E\u001A\u00020\u000B*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r\"\u001C\u0010\u0012\u001A\u0004\u0018\u00010\u000F*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011\"\u001A\u0010\u0013\u001A\u00020\u000B*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,722:1\n33#2,4:723\n38#2:728\n33#2,6:730\n33#2,4:737\n38#2:742\n26#3:727\n26#3:729\n26#3:736\n26#3:741\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n431#1:723,4\n431#1:728\n456#1:730,6\n484#1:737,4\n484#1:742\n438#1:727\n441#1:729\n481#1:736\n492#1:741\n*E\n"})
public final class RowColumnImplKt {
    @Nullable
    public static final CrossAxisAlignment getCrossAxisAlignment(@Nullable RowColumnParentData rowColumnParentData0) {
        return rowColumnParentData0 == null ? null : rowColumnParentData0.getCrossAxisAlignment();
    }

    public static final boolean getFill(@Nullable RowColumnParentData rowColumnParentData0) {
        return rowColumnParentData0 == null ? true : rowColumnParentData0.getFill();
    }

    @Nullable
    public static final RowColumnParentData getRowColumnParentData(@NotNull IntrinsicMeasurable intrinsicMeasurable0) {
        Object object0 = intrinsicMeasurable0.getParentData();
        return object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
    }

    @Nullable
    public static final RowColumnParentData getRowColumnParentData(@NotNull Placeable placeable0) {
        Object object0 = placeable0.getParentData();
        return object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
    }

    public static final float getWeight(@Nullable RowColumnParentData rowColumnParentData0) {
        return rowColumnParentData0 == null ? 0.0f : rowColumnParentData0.getWeight();
    }

    public static final boolean isRelative(@Nullable RowColumnParentData rowColumnParentData0) {
        CrossAxisAlignment crossAxisAlignment0 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentData0);
        return crossAxisAlignment0 == null ? false : crossAxisAlignment0.isRelative$foundation_layout_release();
    }
}


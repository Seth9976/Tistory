package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.ConstraintsKt;
import b2.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u001C\u0010\b\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0003H\u0016J&\u0010\n\u001A\u00020\u000B*\u00020\f2\u0006\u0010\u0005\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001C\u0010\u0012\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0003H\u0016J\u001C\u0010\u0013\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/Modifier$Element;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LayoutModifier extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull LayoutModifier layoutModifier0, @NotNull Function1 function10) {
            return layoutModifier0.super.all(function10);
        }

        @Deprecated
        public static boolean any(@NotNull LayoutModifier layoutModifier0, @NotNull Function1 function10) {
            return layoutModifier0.super.any(function10);
        }

        @Deprecated
        public static Object foldIn(@NotNull LayoutModifier layoutModifier0, Object object0, @NotNull Function2 function20) {
            return layoutModifier0.super.foldIn(object0, function20);
        }

        @Deprecated
        public static Object foldOut(@NotNull LayoutModifier layoutModifier0, Object object0, @NotNull Function2 function20) {
            return layoutModifier0.super.foldOut(object0, function20);
        }

        @Deprecated
        public static int maxIntrinsicHeight(@NotNull LayoutModifier layoutModifier0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
            return layoutModifier0.super.maxIntrinsicHeight(intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@NotNull LayoutModifier layoutModifier0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
            return layoutModifier0.super.maxIntrinsicWidth(intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        public static int minIntrinsicHeight(@NotNull LayoutModifier layoutModifier0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
            return layoutModifier0.super.minIntrinsicHeight(intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        public static int minIntrinsicWidth(@NotNull LayoutModifier layoutModifier0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
            return layoutModifier0.super.minIntrinsicWidth(intrinsicMeasureScope0, intrinsicMeasurable0, v);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull LayoutModifier layoutModifier0, @NotNull Modifier modifier0) {
            return layoutModifier0.super.then(modifier0);
        }
    }

    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 2, 2, 1);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getHeight();
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 2, 1, 1);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getWidth();
    }

    @NotNull
    MeasureResult measure-3p2s80s(@NotNull MeasureScope arg1, @NotNull Measurable arg2, long arg3);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 1, 2, 1);
        long v1 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getHeight();
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        o o0 = new o(intrinsicMeasurable0, 1, 1, 1);
        long v1 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), o0, v1).getWidth();
    }
}


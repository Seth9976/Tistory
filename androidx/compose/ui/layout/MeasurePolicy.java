package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001A\u00020\u0003H\u0016J\"\u0010\t\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\u0003H\u0016J%\u0010\u000B\u001A\u00020\f*\u00020\r2\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00062\u0006\u0010\u000F\u001A\u00020\u0010H&ø\u0001\u0000J\"\u0010\u0011\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001A\u00020\u0003H\u0016J\"\u0010\u0012\u001A\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,167:1\n151#2,3:168\n33#2,4:171\n154#2,2:175\n38#2:177\n156#2:178\n151#2,3:179\n33#2,4:182\n154#2,2:186\n38#2:188\n156#2:189\n151#2,3:190\n33#2,4:193\n154#2,2:197\n38#2:199\n156#2:200\n151#2,3:201\n33#2,4:204\n154#2,2:208\n38#2:210\n156#2:211\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n106#1:168,3\n106#1:171,4\n106#1:175,2\n106#1:177\n106#1:178\n124#1:179,3\n124#1:182,4\n124#1:186,2\n124#1:188\n124#1:189\n141#1:190,3\n141#1:193,4\n141#1:197,2\n141#1:199\n141#1:200\n158#1:201,3\n158#1:204,4\n158#1:208,2\n158#1:210\n158#1:211\n*E\n"})
public interface MeasurePolicy {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(@NotNull MeasurePolicy measurePolicy0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            return measurePolicy0.super.maxIntrinsicHeight(intrinsicMeasureScope0, list0, v);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@NotNull MeasurePolicy measurePolicy0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            return measurePolicy0.super.maxIntrinsicWidth(intrinsicMeasureScope0, list0, v);
        }

        @Deprecated
        public static int minIntrinsicHeight(@NotNull MeasurePolicy measurePolicy0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            return measurePolicy0.super.minIntrinsicHeight(intrinsicMeasureScope0, list0, v);
        }

        @Deprecated
        public static int minIntrinsicWidth(@NotNull MeasurePolicy measurePolicy0, @NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
            return measurePolicy0.super.minIntrinsicWidth(intrinsicMeasureScope0, list0, v);
        }
    }

    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        long v3 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getHeight();
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        long v3 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getWidth();
    }

    @NotNull
    MeasureResult measure-3p2s80s(@NotNull MeasureScope arg1, @NotNull List arg2, long arg3);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        long v3 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getHeight();
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList0.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list0.get(v2)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        long v3 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v3).getWidth();
    }
}


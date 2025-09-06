package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\b\u001A\u00020\u0003H\u0016J(\u0010\t\u001A\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\n\u001A\u00020\u0003H\u0016J2\u0010\u000B\u001A\u00020\f*\u00020\r2\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\u00060\u00062\u0006\u0010\u000F\u001A\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001A\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\b\u001A\u00020\u0003H\u0016J(\u0010\u0014\u001A\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u0006\u0010\n\u001A\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiContentMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,240:1\n151#2,3:241\n33#2,4:244\n154#2:248\n151#2,3:249\n33#2,4:252\n154#2,2:256\n38#2:258\n156#2:259\n155#2:260\n38#2:261\n156#2:262\n151#2,3:263\n33#2,4:266\n154#2:270\n151#2,3:271\n33#2,4:274\n154#2,2:278\n38#2:280\n156#2:281\n155#2:282\n38#2:283\n156#2:284\n151#2,3:285\n33#2,4:288\n154#2:292\n151#2,3:293\n33#2,4:296\n154#2,2:300\n38#2:302\n156#2:303\n155#2:304\n38#2:305\n156#2:306\n151#2,3:307\n33#2,4:310\n154#2:314\n151#2,3:315\n33#2,4:318\n154#2,2:322\n38#2:324\n156#2:325\n155#2:326\n38#2:327\n156#2:328\n*S KotlinDebug\n*F\n+ 1 MultiContentMeasurePolicy.kt\nandroidx/compose/ui/layout/MultiContentMeasurePolicy\n*L\n112#1:241,3\n112#1:244,4\n112#1:248\n113#1:249,3\n113#1:252,4\n113#1:256,2\n113#1:258\n113#1:259\n112#1:260\n112#1:261\n112#1:262\n137#1:263,3\n137#1:266,4\n137#1:270\n138#1:271,3\n138#1:274,4\n138#1:278,2\n138#1:280\n138#1:281\n137#1:282\n137#1:283\n137#1:284\n161#1:285,3\n161#1:288,4\n161#1:292\n162#1:293,3\n162#1:296,4\n162#1:300,2\n162#1:302\n162#1:303\n161#1:304\n161#1:305\n161#1:306\n185#1:307,3\n185#1:310,4\n185#1:314\n186#1:315,3\n186#1:318,4\n186#1:322,2\n186#1:324\n186#1:325\n185#1:326\n185#1:327\n185#1:328\n*E\n"})
public interface MultiContentMeasurePolicy {
    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getHeight();
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getWidth();
    }

    @NotNull
    MeasureResult measure-3p2s80s(@NotNull MeasureScope arg1, @NotNull List arg2, long arg3);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getHeight();
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            List list1 = (List)list0.get(v2);
            ArrayList arrayList1 = new ArrayList(list1.size());
            int v3 = list1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList1.add(new DefaultIntrinsicMeasurable(((IntrinsicMeasurable)list1.get(v4)), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList0.add(arrayList1);
        }
        long v5 = ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null);
        return this.measure-3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope0, intrinsicMeasureScope0.getLayoutDirection()), arrayList0, v5).getWidth();
    }
}


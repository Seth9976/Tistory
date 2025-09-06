package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;

public final class mc implements MultiContentMeasurePolicy {
    public static int a(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
        int v4;
        int v3;
        int v1 = 0;
        List list1 = (List)list0.get(0);
        boolean z = true;
        List list2 = (List)list0.get(1);
        List list3 = (List)list0.get(2);
        List list4 = (List)list0.get(3);
        List list5 = (List)list0.get(4);
        int v2 = ListItemKt.access$subtractConstraintSafely(v, intrinsicMeasureScope0.roundToPx-0680j_4(32.0f));
        IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list4);
        if(intrinsicMeasurable0 == null) {
            v3 = 0;
        }
        else {
            v3 = ((Number)function20.invoke(intrinsicMeasurable0, v2)).intValue();
            v2 = ListItemKt.access$subtractConstraintSafely(v2, intrinsicMeasurable0.maxIntrinsicWidth(0x7FFFFFFF));
        }
        IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list5);
        if(intrinsicMeasurable1 == null) {
            v4 = 0;
        }
        else {
            v4 = ((Number)function20.invoke(intrinsicMeasurable1, v2)).intValue();
            v2 = ListItemKt.access$subtractConstraintSafely(v2, intrinsicMeasurable1.maxIntrinsicWidth(0x7FFFFFFF));
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        int v5 = intrinsicMeasurable2 == null ? 0 : ((Number)function20.invoke(intrinsicMeasurable2, v2)).intValue();
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list3);
        int v6 = intrinsicMeasurable3 == null ? 0 : ((Number)function20.invoke(intrinsicMeasurable3, v2)).intValue();
        boolean z1 = ListItemKt.access$isSupportingMultilineHeuristic(intrinsicMeasureScope0, v6);
        ListItemType.Companion listItemType$Companion0 = nc.a;
        if(v6 <= 0) {
            z = false;
        }
        int v7 = listItemType$Companion0.invoke-Z-LSjz4$material3_release(v5 > 0, z, z1);
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list1);
        if(intrinsicMeasurable4 != null) {
            v1 = ((Number)function20.invoke(intrinsicMeasurable4, v)).intValue();
        }
        return ListItemKt.access$calculateHeight-N4Jib3Y(intrinsicMeasureScope0, v3, v4, v1, v5, v6, v7, intrinsicMeasureScope0.roundToPx-0680j_4(Dp.constructor-impl(ListItemKt.access$verticalPadding-yh95HIg(v7) * 2.0f)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    public static int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v, Function2 function20) {
        int v1 = 0;
        List list1 = (List)list0.get(0);
        List list2 = (List)list0.get(1);
        List list3 = (List)list0.get(2);
        List list4 = (List)list0.get(3);
        List list5 = (List)list0.get(4);
        IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list4);
        int v2 = intrinsicMeasurable0 == null ? 0 : ((Number)function20.invoke(intrinsicMeasurable0, v)).intValue();
        IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list5);
        int v3 = intrinsicMeasurable1 == null ? 0 : ((Number)function20.invoke(intrinsicMeasurable1, v)).intValue();
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list1);
        int v4 = intrinsicMeasurable2 == null ? 0 : ((Number)function20.invoke(intrinsicMeasurable2, v)).intValue();
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        int v5 = intrinsicMeasurable3 == null ? 0 : ((Number)function20.invoke(intrinsicMeasurable3, v)).intValue();
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable)CollectionsKt___CollectionsKt.firstOrNull(list3);
        if(intrinsicMeasurable4 != null) {
            v1 = ((Number)function20.invoke(intrinsicMeasurable4, v)).intValue();
        }
        return ListItemKt.access$calculateWidth-yeHjK3Y(intrinsicMeasureScope0, v2, v3, v4, v5, v1, intrinsicMeasureScope0.roundToPx-0680j_4(32.0f), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return mc.a(intrinsicMeasureScope0, list0, v, ic.a);
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return mc.b(intrinsicMeasureScope0, list0, v, jc.a);
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
        List list1 = (List)list0.get(0);
        boolean z = true;
        List list2 = (List)list0.get(1);
        List list3 = (List)list0.get(2);
        List list4 = (List)list0.get(3);
        List list5 = (List)list0.get(4);
        long v1 = Constraints.copy-Zbe2FdA$default(v, 0, 0, 0, 0, 10, null);
        int v2 = measureScope0.roundToPx-0680j_4(32.0f);
        Measurable measurable0 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list4);
        int v3 = measurable0 == null ? 0 : measurable0.minIntrinsicWidth(Constraints.getMaxHeight-impl(v));
        Measurable measurable1 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list5);
        int v4 = ListItemKt.access$subtractConstraintSafely(Constraints.getMaxWidth-impl(v1), v3 + (measurable1 == null ? 0 : measurable1.minIntrinsicWidth(Constraints.getMaxHeight-impl(v))) + v2);
        Measurable measurable2 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list3);
        boolean z1 = ListItemKt.access$isSupportingMultilineHeuristic(measureScope0, (measurable2 == null ? 0 : measurable2.minIntrinsicHeight(v4)));
        ListItemType.Companion listItemType$Companion0 = nc.a;
        boolean z2 = CollectionsKt___CollectionsKt.firstOrNull(list2) != null;
        if(CollectionsKt___CollectionsKt.firstOrNull(list3) == null) {
            z = false;
        }
        long v5 = ConstraintsKt.offset-NN6Ew-U(v1, -v2, -measureScope0.roundToPx-0680j_4(Dp.constructor-impl(ListItemKt.access$verticalPadding-yh95HIg(listItemType$Companion0.invoke-Z-LSjz4$material3_release(z2, z, z1)) * 2.0f)));
        Measurable measurable3 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list4);
        Placeable placeable0 = measurable3 == null ? null : measurable3.measure-BRTryo0(v5);
        int v6 = TextFieldImplKt.widthOrZero(placeable0);
        Measurable measurable4 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list5);
        Placeable placeable1 = measurable4 == null ? null : measurable4.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v5, -v6, 0, 2, null));
        int v7 = TextFieldImplKt.widthOrZero(placeable1) + v6;
        Measurable measurable5 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list1);
        Placeable placeable2 = measurable5 == null ? null : measurable5.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U$default(v5, -v7, 0, 2, null));
        int v8 = TextFieldImplKt.heightOrZero(placeable2);
        Measurable measurable6 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list3);
        Placeable placeable3 = measurable6 == null ? null : measurable6.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v5, -v7, -v8));
        int v9 = TextFieldImplKt.heightOrZero(placeable3);
        boolean z3 = placeable3 != null && placeable3.get(AlignmentLineKt.getFirstBaseline()) != placeable3.get(AlignmentLineKt.getLastBaseline());
        Measurable measurable7 = (Measurable)CollectionsKt___CollectionsKt.firstOrNull(list2);
        Placeable placeable4 = measurable7 == null ? null : measurable7.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v5, -v7, -(v9 + v8)));
        int v10 = listItemType$Companion0.invoke-Z-LSjz4$material3_release(placeable4 != null, placeable3 != null, z3);
        float f = ListItemKt.access$verticalPadding-yh95HIg(v10);
        int v11 = ListItemKt.access$calculateWidth-yeHjK3Y(measureScope0, TextFieldImplKt.widthOrZero(placeable0), TextFieldImplKt.widthOrZero(placeable1), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable3), v2, v);
        int v12 = ListItemKt.access$calculateHeight-N4Jib3Y(measureScope0, TextFieldImplKt.heightOrZero(placeable0), TextFieldImplKt.heightOrZero(placeable1), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable3), v10, measureScope0.roundToPx-0680j_4(2.0f * f), v);
        return v10 == 3 ? ListItemKt.access$place(measureScope0, v11, v12, placeable0, placeable1, placeable2, placeable4, placeable3, true, measureScope0.roundToPx-0680j_4(16.0f), measureScope0.roundToPx-0680j_4(16.0f), measureScope0.roundToPx-0680j_4(f)) : ListItemKt.access$place(measureScope0, v11, v12, placeable0, placeable1, placeable2, placeable4, placeable3, false, measureScope0.roundToPx-0680j_4(16.0f), measureScope0.roundToPx-0680j_4(16.0f), measureScope0.roundToPx-0680j_4(f));
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return mc.a(intrinsicMeasureScope0, list0, v, kc.a);
    }

    @Override  // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
        return mc.b(intrinsicMeasureScope0, list0, v, lc.a);
    }
}


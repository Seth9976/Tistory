package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J,\u0010\u000B\u001A\u00020\b*\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,68:1\n151#2,3:69\n33#2,4:72\n154#2,2:76\n38#2:78\n156#2:79\n33#2,6:80\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:69,3\n47#1:72,4\n47#1:76,2\n47#1:78\n47#1:79\n52#1:80,6\n*E\n"})
public final class RootMeasurePolicy extends NoIntrinsicsMeasurePolicy {
    public static final int $stable;
    @NotNull
    public static final RootMeasurePolicy INSTANCE;

    static {
        RootMeasurePolicy.INSTANCE = new RootMeasurePolicy("Undefined intrinsics block and it is required");  // 初始化器: Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;-><init>(Ljava/lang/String;)V
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        if(list0.isEmpty()) {
            return MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, k.w, 4, null);
        }
        if(list0.size() == 1) {
            Placeable placeable0 = ((Measurable)list0.get(0)).measure-BRTryo0(v);
            return MeasureScope.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth()), ConstraintsKt.constrainHeight-K40F9xA(v, placeable0.getHeight()), null, new l(placeable0), 4, null);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; v3 = a.f(((Measurable)list0.get(v3)), v, arrayList0, v3, 1)) {
        }
        int v4 = arrayList0.size();
        int v5 = 0;
        int v6 = 0;
        for(int v1 = 0; v1 < v4; ++v1) {
            Placeable placeable1 = (Placeable)arrayList0.get(v1);
            v5 = Math.max(placeable1.getWidth(), v5);
            v6 = Math.max(placeable1.getHeight(), v6);
        }
        return MeasureScope.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, v5), ConstraintsKt.constrainHeight-K40F9xA(v, v6), null, new m(arrayList0), 4, null);
    }
}


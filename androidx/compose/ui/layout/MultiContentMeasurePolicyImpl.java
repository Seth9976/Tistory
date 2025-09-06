package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000F\u001A\u00020\f*\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ)\u0010\u0014\u001A\u00020\u0012*\u00020\u00102\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001A\u00020\u0012*\u00020\u00102\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001A\u00020\u0012*\u00020\u00102\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u0019\u001A\u00020\u0012*\u00020\u00102\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001A\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u001EHÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001A\u0010&\u001A\u00020%2\b\u0010$\u001A\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010\'R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/MultiContentMeasurePolicyImpl;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "measurePolicy", "<init>", "(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "component1", "()Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "copy", "(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MultiContentMeasurePolicyImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "getMeasurePolicy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MultiContentMeasurePolicyImpl implements MeasurePolicy {
    public static final int $stable;
    public final MultiContentMeasurePolicy a;

    public MultiContentMeasurePolicyImpl(@NotNull MultiContentMeasurePolicy multiContentMeasurePolicy0) {
        this.a = multiContentMeasurePolicy0;
    }

    @NotNull
    public final MultiContentMeasurePolicy component1() {
        return this.a;
    }

    @NotNull
    public final MultiContentMeasurePolicyImpl copy(@NotNull MultiContentMeasurePolicy multiContentMeasurePolicy0) {
        return new MultiContentMeasurePolicyImpl(multiContentMeasurePolicy0);
    }

    public static MultiContentMeasurePolicyImpl copy$default(MultiContentMeasurePolicyImpl multiContentMeasurePolicyImpl0, MultiContentMeasurePolicy multiContentMeasurePolicy0, int v, Object object0) {
        if((v & 1) != 0) {
            multiContentMeasurePolicy0 = multiContentMeasurePolicyImpl0.a;
        }
        return multiContentMeasurePolicyImpl0.copy(multiContentMeasurePolicy0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MultiContentMeasurePolicyImpl ? Intrinsics.areEqual(this.a, ((MultiContentMeasurePolicyImpl)object0).a) : false;
    }

    @NotNull
    public final MultiContentMeasurePolicy getMeasurePolicy() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        List list1 = MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope0);
        return this.a.maxIntrinsicHeight(intrinsicMeasureScope0, list1, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        List list1 = MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope0);
        return this.a.maxIntrinsicWidth(intrinsicMeasureScope0, list1, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        List list1 = MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(measureScope0);
        return this.a.measure-3p2s80s(measureScope0, list1, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        List list1 = MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope0);
        return this.a.minIntrinsicHeight(intrinsicMeasureScope0, list1, v);
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull List list0, int v) {
        List list1 = MeasureScopeWithLayoutNodeKt.getChildrenOfVirtualChildren(intrinsicMeasureScope0);
        return this.a.minIntrinsicWidth(intrinsicMeasureScope0, list1, v);
    }

    @Override
    @NotNull
    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}


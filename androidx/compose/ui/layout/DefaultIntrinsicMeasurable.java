package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import b2.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\u000F\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0016\u0010\u001F\u001A\u0004\u0018\u00010\u001C8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "a", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getParentData", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultIntrinsicMeasurable implements Measurable {
    public static final int $stable = 8;
    public final IntrinsicMeasurable a;
    public final IntrinsicMinMax b;
    public final IntrinsicWidthHeight c;

    public DefaultIntrinsicMeasurable(@NotNull IntrinsicMeasurable intrinsicMeasurable0, @NotNull IntrinsicMinMax intrinsicMinMax0, @NotNull IntrinsicWidthHeight intrinsicWidthHeight0) {
        this.a = intrinsicMeasurable0;
        this.b = intrinsicMinMax0;
        this.c = intrinsicWidthHeight0;
    }

    @NotNull
    public final IntrinsicMeasurable getMeasurable() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.a.getParentData();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        return this.a.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        return this.a.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    @NotNull
    public Placeable measure-BRTryo0(long v) {
        int v1 = 0x7FFF;
        IntrinsicMinMax intrinsicMinMax0 = this.b;
        IntrinsicMeasurable intrinsicMeasurable0 = this.a;
        if(this.c == IntrinsicWidthHeight.Width) {
            int v2 = intrinsicMinMax0 == IntrinsicMinMax.Max ? intrinsicMeasurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(v)) : intrinsicMeasurable0.minIntrinsicWidth(Constraints.getMaxHeight-impl(v));
            if(Constraints.getHasBoundedHeight-impl(v)) {
                v1 = Constraints.getMaxHeight-impl(v);
            }
            return new p(v2, v1, 1);
        }
        int v3 = intrinsicMinMax0 == IntrinsicMinMax.Max ? intrinsicMeasurable0.maxIntrinsicHeight(Constraints.getMaxWidth-impl(v)) : intrinsicMeasurable0.minIntrinsicHeight(Constraints.getMaxWidth-impl(v));
        if(Constraints.getHasBoundedWidth-impl(v)) {
            v1 = Constraints.getMaxWidth-impl(v);
        }
        return new p(v1, v3, 1);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        return this.a.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        return this.a.minIntrinsicWidth(v);
    }
}


package androidx.compose.foundation.layout;

import a5.b;
import androidx.collection.IntIntPair;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u001A\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001A\u0004\u0018\u00010\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJ)\u0010\u0014\u001A\u0004\u0018\u00010\u00112\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001E\u001A\u00020\u001B2\b\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\u0010\u0017\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\u0019H\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ6\u0010\u001E\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001F2\b\u0010\u0016\u001A\u0004\u0018\u00010!2\b\u0010\u0017\u001A\u0004\u0018\u00010!2\u0006\u0010\u001A\u001A\u00020\u0019H\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001C\u0010\"J\\\u0010\u001E\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010\u001A\u001A\u00020\u001928\u0010(\u001A4\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\'\u0012\u0006\u0012\u0004\u0018\u00010!0#H\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*J\u0010\u0010-\u001A\u00020\u0002H\u00C0\u0003\u00A2\u0006\u0004\b+\u0010,J\u0010\u00100\u001A\u00020\u0004H\u00C0\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00102\u001A\u00020\u0004H\u00C0\u0003\u00A2\u0006\u0004\b1\u0010/J.\u00103\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b3\u00104J\u0010\u00106\u001A\u000205H\u00D6\u0001\u00A2\u0006\u0004\b6\u00107J\u0010\u00108\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b8\u0010/J\u001A\u0010:\u001A\u00020\t2\b\u00109\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b:\u0010;R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010,R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010/R\u001A\u0010\u0006\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bB\u0010@\u001A\u0004\bC\u0010/R\"\u0010H\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010@\u001A\u0004\bE\u0010/\"\u0004\bF\u0010GR\"\u0010L\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010@\u001A\u0004\bJ\u0010/\"\u0004\bK\u0010GR\u0014\u0010N\u001A\u00020\u00048@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010/\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006O"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Landroidx/collection/IntIntPair;", "ellipsisSize-F35zm-w$foundation_layout_release", "(ZII)Landroidx/collection/IntIntPair;", "ellipsisSize", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo$foundation_layout_release", "(ZII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "setOverflowMeasurables--hBUhpc$foundation_layout_release", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "setOverflowMeasurables", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/Measurable;", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isExpandable", "numberOfItemsShown", "getOverflowMeasurable", "setOverflowMeasurables-VKLhPVY$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V", "component1$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "component1", "component2$foundation_layout_release", "()I", "component2", "component3$foundation_layout_release", "component3", "copy", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release", "b", "I", "getMinLinesToShowCollapse$foundation_layout_release", "c", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "d", "getItemShown$foundation_layout_release", "setItemShown$foundation_layout_release", "(I)V", "itemShown", "e", "getItemCount$foundation_layout_release", "setItemCount$foundation_layout_release", "itemCount", "getNoOfItemsShown$foundation_layout_release", "noOfItemsShown", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,906:1\n231#2:907\n231#2:908\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n*L\n813#1:907\n825#1:908\n*E\n"})
public final class FlowLayoutOverflowState {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[OverflowType.values().length];
            try {
                arr_v[OverflowType.Visible.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[OverflowType.Clip.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[OverflowType.ExpandIndicator.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final OverflowType a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public Measurable f;
    public Placeable g;
    public Measurable h;
    public Placeable i;
    public IntIntPair j;
    public IntIntPair k;
    public Function2 l;

    public FlowLayoutOverflowState(@NotNull OverflowType flowLayoutOverflow$OverflowType0, int v, int v1) {
        this.a = flowLayoutOverflow$OverflowType0;
        this.b = v;
        this.c = v1;
        this.d = -1;
    }

    @NotNull
    public final OverflowType component1$foundation_layout_release() {
        return this.a;
    }

    public final int component2$foundation_layout_release() {
        return this.b;
    }

    public final int component3$foundation_layout_release() {
        return this.c;
    }

    @NotNull
    public final FlowLayoutOverflowState copy(@NotNull OverflowType flowLayoutOverflow$OverflowType0, int v, int v1) {
        return new FlowLayoutOverflowState(flowLayoutOverflow$OverflowType0, v, v1);
    }

    public static FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState0, OverflowType flowLayoutOverflow$OverflowType0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            flowLayoutOverflow$OverflowType0 = flowLayoutOverflowState0.a;
        }
        if((v2 & 2) != 0) {
            v = flowLayoutOverflowState0.b;
        }
        if((v2 & 4) != 0) {
            v1 = flowLayoutOverflowState0.c;
        }
        return flowLayoutOverflowState0.copy(flowLayoutOverflow$OverflowType0, v, v1);
    }

    @Nullable
    public final WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean z, int v, int v1) {
        Placeable placeable0;
        Measurable measurable1;
        IntIntPair intIntPair0;
        Measurable measurable0;
        switch(this.a) {
            case 1: 
            case 2: {
                return null;
            }
            case 3: 
            case 4: {
                if(z) {
                    Function2 function20 = this.l;
                    if(function20 == null) {
                        measurable0 = this.f;
                    }
                    else {
                        Integer integer0 = this.getNoOfItemsShown$foundation_layout_release();
                        measurable0 = (Measurable)function20.invoke(Boolean.TRUE, integer0);
                        if(measurable0 == null) {
                            measurable0 = this.f;
                        }
                    }
                    intIntPair0 = this.j;
                    if(this.l == null) {
                        measurable1 = measurable0;
                        placeable0 = this.g;
                    }
                    else {
                        measurable1 = measurable0;
                        placeable0 = null;
                    }
                }
                else {
                    if(v < this.b - 1 || v1 < this.c) {
                        measurable0 = null;
                    }
                    else {
                        Function2 function21 = this.l;
                        if(function21 == null) {
                            measurable0 = this.h;
                        }
                        else {
                            Integer integer1 = this.getNoOfItemsShown$foundation_layout_release();
                            measurable0 = (Measurable)function21.invoke(Boolean.FALSE, integer1);
                            if(measurable0 == null) {
                                measurable0 = this.h;
                            }
                        }
                    }
                    intIntPair0 = this.k;
                    if(this.l == null) {
                        measurable1 = measurable0;
                        placeable0 = this.i;
                    }
                    else {
                        measurable1 = measurable0;
                        placeable0 = null;
                    }
                }
                if(measurable1 == null) {
                    return null;
                }
                Intrinsics.checkNotNull(intIntPair0);
                return new WrapEllipsisInfo(measurable1, placeable0, intIntPair0.unbox-impl(), false, 8, null);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Nullable
    public final IntIntPair ellipsisSize-F35zm-w$foundation_layout_release(boolean z, int v, int v1) {
        switch(this.a) {
            case 1: 
            case 2: {
                return null;
            }
            case 3: {
                return z ? this.j : null;
            }
            case 4: {
                if(z) {
                    return this.j;
                }
                return v + 1 < this.b || v1 < this.c ? null : this.k;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FlowLayoutOverflowState)) {
            return false;
        }
        if(this.a != ((FlowLayoutOverflowState)object0).a) {
            return false;
        }
        return this.b == ((FlowLayoutOverflowState)object0).b ? this.c == ((FlowLayoutOverflowState)object0).c : false;
    }

    public final int getItemCount$foundation_layout_release() {
        return this.e;
    }

    public final int getItemShown$foundation_layout_release() {
        return this.d;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.c;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.b;
    }

    public final int getNoOfItemsShown$foundation_layout_release() {
        int v = this.d;
        if(v == -1) {
            throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
        }
        return v;
    }

    @NotNull
    public final OverflowType getType$foundation_layout_release() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c + a.c(this.b, this.a.hashCode() * 0x1F, 0x1F);
    }

    public final void setItemCount$foundation_layout_release(int v) {
        this.e = v;
    }

    public final void setItemShown$foundation_layout_release(int v) {
        this.d = v;
    }

    public final void setOverflowMeasurables--hBUhpc$foundation_layout_release(@NotNull FlowLineMeasurePolicy flowLineMeasurePolicy0, @Nullable Measurable measurable0, @Nullable Measurable measurable1, long v) {
        LayoutOrientation layoutOrientation0 = flowLineMeasurePolicy0.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long v1 = OrientationIndependentConstraints.toBoxConstraints-OenEA2s(OrientationIndependentConstraints.copy-yUG9Ft0$default(OrientationIndependentConstraints.constructor-impl(v, layoutOrientation0), 0, 0, 0, 0, 10, null), layoutOrientation0);
        if(measurable0 != null) {
            FlowLayoutKt.measureAndCache-rqJ1uqs(measurable0, flowLineMeasurePolicy0, v1, new a2(this, flowLineMeasurePolicy0));
            this.f = measurable0;
        }
        if(measurable1 != null) {
            FlowLayoutKt.measureAndCache-rqJ1uqs(measurable1, flowLineMeasurePolicy0, v1, new b2(this, flowLineMeasurePolicy0));
            this.h = measurable1;
        }
    }

    public final void setOverflowMeasurables--hBUhpc$foundation_layout_release(@Nullable IntrinsicMeasurable intrinsicMeasurable0, @Nullable IntrinsicMeasurable intrinsicMeasurable1, boolean z, long v) {
        long v1 = OrientationIndependentConstraints.constructor-impl(v, (z ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical));
        if(intrinsicMeasurable0 != null) {
            int v2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable0, z, Constraints.getMaxHeight-impl(v1));
            this.j = IntIntPair.box-impl(IntIntPair.constructor-impl(v2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable0, z, v2)));
            this.f = intrinsicMeasurable0 instanceof Measurable ? ((Measurable)intrinsicMeasurable0) : null;
            this.g = null;
        }
        if(intrinsicMeasurable1 != null) {
            int v3 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable1, z, Constraints.getMaxHeight-impl(v1));
            this.k = IntIntPair.box-impl(IntIntPair.constructor-impl(v3, FlowLayoutKt.crossAxisMin(intrinsicMeasurable1, z, v3)));
            this.h = intrinsicMeasurable1 instanceof Measurable ? ((Measurable)intrinsicMeasurable1) : null;
            this.i = null;
        }
    }

    public final void setOverflowMeasurables-VKLhPVY$foundation_layout_release(@NotNull FlowLineMeasurePolicy flowLineMeasurePolicy0, long v, @NotNull Function2 function20) {
        this.d = 0;
        this.l = function20;
        this.setOverflowMeasurables--hBUhpc$foundation_layout_release(flowLineMeasurePolicy0, ((Measurable)function20.invoke(Boolean.TRUE, 0)), ((Measurable)function20.invoke(Boolean.FALSE, 0)), v);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FlowLayoutOverflowState(type=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", minLinesToShowCollapse=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", minCrossAxisSizeToShowCollapse=");
        return b.p(stringBuilder0, this.c, ')');
    }
}


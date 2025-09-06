package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0002#$B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ?\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\"\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00192\b\u0010\u001B\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u001E\u001A\u00020\u000F2\u0006\u0010\u001F\u001A\u00020\u000Fø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflow", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "getWrapEllipsisInfo", "(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "nextItemHasNext", "Landroidx/collection/IntIntPair;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "getWrapInfo-OpUlnko", "(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "getWrapInfo", "WrapEllipsisInfo", "WrapInfo", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,197:1\n229#2:198\n229#2:199\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n119#1:198\n173#1:199\n*E\n"})
public final class FlowLayoutBuildingBlocks {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001D\u0010\u0007\u001A\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001D\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "Landroidx/compose/ui/layout/Measurable;", "ellipsis", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/collection/IntIntPair;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Placeable;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Landroidx/compose/ui/layout/Measurable;", "getEllipsis", "()Landroidx/compose/ui/layout/Measurable;", "b", "Landroidx/compose/ui/layout/Placeable;", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "c", "J", "getEllipsisSize-OO21N7I", "()J", "d", "Z", "getPlaceEllipsisOnLastContentLine", "()Z", "setPlaceEllipsisOnLastContentLine", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;
        public final Measurable a;
        public final Placeable b;
        public final long c;
        public boolean d;

        public WrapEllipsisInfo(Measurable measurable0, Placeable placeable0, long v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 8) != 0) {
                z = true;
            }
            this(measurable0, placeable0, v, z, null);
        }

        public WrapEllipsisInfo(Measurable measurable0, Placeable placeable0, long v, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = measurable0;
            this.b = placeable0;
            this.c = v;
            this.d = z;
        }

        @NotNull
        public final Measurable getEllipsis() {
            return this.a;
        }

        public final long getEllipsisSize-OO21N7I() {
            return this.c;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.d;
        }

        @Nullable
        public final Placeable getPlaceable() {
            return this.b;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z) {
            this.d = z;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\u0003\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001A\u0004\b\u0004\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "a", "Z", "()Z", "b", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WrapInfo {
        public static final int $stable;
        public final boolean a;
        public final boolean b;

        public WrapInfo() {
            this(false, false, 3, null);
        }

        public WrapInfo(boolean z, boolean z1) {
            this.a = z;
            this.b = z1;
        }

        public WrapInfo(boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                z = false;
            }
            if((v & 2) != 0) {
                z1 = false;
            }
            this(z, z1);
        }

        public final boolean isLastItemInContainer() {
            return this.b;
        }

        public final boolean isLastItemInLine() {
            return this.a;
        }
    }

    public static final int $stable = 8;
    public final int a;
    public final FlowLayoutOverflowState b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;

    public FlowLayoutBuildingBlocks(int v, FlowLayoutOverflowState flowLayoutOverflowState0, long v1, int v2, int v3, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = flowLayoutOverflowState0;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
    }

    @Nullable
    public final WrapEllipsisInfo getWrapEllipsisInfo(@NotNull WrapInfo flowLayoutBuildingBlocks$WrapInfo0, boolean z, int v, int v1, int v2, int v3) {
        if(!flowLayoutBuildingBlocks$WrapInfo0.isLastItemInContainer()) {
            return null;
        }
        WrapEllipsisInfo flowLayoutBuildingBlocks$WrapEllipsisInfo0 = this.b.ellipsisInfo$foundation_layout_release(z, v, v1);
        if(flowLayoutBuildingBlocks$WrapEllipsisInfo0 == null) {
            return null;
        }
        flowLayoutBuildingBlocks$WrapEllipsisInfo0.setPlaceEllipsisOnLastContentLine(v >= 0 && (v3 == 0 || v2 - IntIntPair.getFirst-impl(flowLayoutBuildingBlocks$WrapEllipsisInfo0.getEllipsisSize-OO21N7I()) >= 0 && v3 < this.a));
        return flowLayoutBuildingBlocks$WrapEllipsisInfo0;
    }

    @NotNull
    public final WrapInfo getWrapInfo-OpUlnko(boolean z, int v, long v1, @Nullable IntIntPair intIntPair0, int v2, int v3, int v4, boolean z1, boolean z2) {
        if(intIntPair0 == null) {
            return new WrapInfo(true, true);
        }
        FlowLayoutOverflowState flowLayoutOverflowState0 = this.b;
        if(flowLayoutOverflowState0.getType$foundation_layout_release() != OverflowType.Visible && (v2 >= this.d || IntIntPair.getSecond-impl(v1) - IntIntPair.getSecond-impl(intIntPair0.unbox-impl()) < 0)) {
            return new WrapInfo(true, true);
        }
        int v5 = this.e;
        int v6 = this.f;
        long v7 = this.c;
        int v8 = this.a;
        if(v != 0 && (v >= v8 || IntIntPair.getFirst-impl(v1) - IntIntPair.getFirst-impl(intIntPair0.unbox-impl()) < 0)) {
            return z1 ? new WrapInfo(true, true) : new WrapInfo(true, this.getWrapInfo-OpUlnko(z, 0, IntIntPair.constructor-impl(Constraints.getMaxWidth-impl(v7), IntIntPair.getSecond-impl(v1) - v6 - v4), IntIntPair.box-impl(IntIntPair.constructor-impl(IntIntPair.getFirst-impl(intIntPair0.unbox-impl()) - v5, IntIntPair.getSecond-impl(intIntPair0.unbox-impl()))), v2 + 1, v3 + v4, 0, true, false).isLastItemInContainer());
        }
        int v9 = Math.max(v4, IntIntPair.getSecond-impl(intIntPair0.unbox-impl())) + v3;
        IntIntPair intIntPair1 = z2 ? null : flowLayoutOverflowState0.ellipsisSize-F35zm-w$foundation_layout_release(z, v2, v9);
        if(intIntPair1 != null && (v + 1 >= v8 || IntIntPair.getFirst-impl(v1) - IntIntPair.getFirst-impl(intIntPair0.unbox-impl()) - v5 - IntIntPair.getFirst-impl(intIntPair1.unbox-impl()) < 0)) {
            if(z2) {
                return new WrapInfo(true, true);
            }
            WrapInfo flowLayoutBuildingBlocks$WrapInfo0 = this.getWrapInfo-OpUlnko(false, 0, IntIntPair.constructor-impl(Constraints.getMaxWidth-impl(v7), IntIntPair.getSecond-impl(v1) - v6 - Math.max(v4, IntIntPair.getSecond-impl(intIntPair0.unbox-impl()))), intIntPair1, v2 + 1, v9, 0, true, true);
            return new WrapInfo(flowLayoutBuildingBlocks$WrapInfo0.isLastItemInContainer(), flowLayoutBuildingBlocks$WrapInfo0.isLastItemInContainer());
        }
        return new WrapInfo(false, false);
    }
}


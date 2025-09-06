package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n\u001A\u001F\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001A\u0014\u0010\u000E\u001A\u00020\u0001*\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0011H\u0000\u001A\u0014\u0010\u0012\u001A\u00020\u0001*\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0011H\u0000\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0013"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,145:1\n1223#2,6:146\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n*L\n119#1:146,6\n*E\n"})
public final class LazyGridSnapLayoutInfoProviderKt {
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull LazyGridState lazyGridState0, @NotNull SnapPosition snapPosition0) {
        return new SnapLayoutInfoProvider() {
            public final LazyGridState a;
            public final SnapPosition b;

            {
                LazyGridState lazyGridState0 = lazyGridState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                SnapPosition snapPosition0 = snapPosition0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = lazyGridState0;
                this.b = snapPosition0;
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f, float f1) {
                float f2 = Math.abs(f1);
                LazyGridLayoutInfo lazyGridLayoutInfo0 = this.a.getLayoutInfo();
                int v = 0;
                if(!lazyGridLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
                    int v1 = lazyGridLayoutInfo0.getVisibleItemsInfo().size();
                    for(Object object0: lazyGridLayoutInfo0.getVisibleItemsInfo()) {
                        v += LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(((LazyGridItemInfo)object0), lazyGridLayoutInfo0.getOrientation());
                    }
                    v /= v1;
                }
                return Math.signum(f1) * c.coerceAtLeast(f2 - ((float)v), 0.0f);
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                LazyGridState lazyGridState0 = this.a;
                List list0 = lazyGridState0.getLayoutInfo().getVisibleItemsInfo();
                int v = list0.size();
                float f1 = -Infinityf;
                float f2 = Infinityf;
                for(int v1 = 0; v1 < v; ++v1) {
                    LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)list0.get(v1);
                    int v2 = LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(lazyGridState0.getLayoutInfo());
                    int v3 = lazyGridState0.getLayoutInfo().getBeforeContentPadding();
                    int v4 = lazyGridState0.getLayoutInfo().getAfterContentPadding();
                    int v5 = LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo0, lazyGridState0.getLayoutInfo().getOrientation());
                    int v6 = LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo0, lazyGridState0.getLayoutInfo().getOrientation());
                    int v7 = lazyGridItemInfo0.getIndex();
                    int v8 = lazyGridState0.getLayoutInfo().getTotalItemsCount();
                    float f3 = SnapPositionKt.calculateDistanceToDesiredSnapPosition(v2, v3, v4, v5, v6, v7, this.b, v8);
                    if(f3 <= 0.0f && f3 > f1) {
                        f1 = f3;
                    }
                    if(f3 >= 0.0f && f3 < f2) {
                        f2 = f3;
                    }
                }
                return SnapFlingBehaviorKt.calculateFinalOffset-Fhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyGridState0.getDensity$foundation_release(), f), f1, f2);
            }
        };
    }

    public static SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState0, SnapPosition snapPosition0, int v, Object object0) {
        if((v & 2) != 0) {
            snapPosition0 = (int v, int v1, int v2, int v3, int v4, int v5) -> (v - v2 - v3) / 2 - v1 / 2;
        }
        return LazyGridSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(lazyGridState0, snapPosition0);
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyGridLayoutInfo lazyGridLayoutInfo0) {
        return lazyGridLayoutInfo0.getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(lazyGridLayoutInfo0.getViewportSize-YbymL2g()) : IntSize.getWidth-impl(lazyGridLayoutInfo0.getViewportSize-YbymL2g());
    }

    public static final int offsetOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo0, @NotNull Orientation orientation0) {
        return orientation0 == Orientation.Vertical ? IntOffset.getY-impl(lazyGridItemInfo0.getOffset-nOcc-ac()) : IntOffset.getX-impl(lazyGridItemInfo0.getOffset-nOcc-ac());
    }

    @Composable
    @NotNull
    public static final FlingBehavior rememberSnapFlingBehavior(@NotNull LazyGridState lazyGridState0, @Nullable SnapPosition snapPosition0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            snapPosition0 = (int v, int v1, int v2, int v3, int v4, int v5) -> (v - v2 - v3) / 2 - v1 / 2;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF206D146, v, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:116)");
        }
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(lazyGridState0) || (v & 6) == 4;
        SnapLayoutInfoProvider snapLayoutInfoProvider0 = composer0.rememberedValue();
        if(z || snapLayoutInfoProvider0 == Composer.Companion.getEmpty()) {
            snapLayoutInfoProvider0 = LazyGridSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(lazyGridState0, snapPosition0);
            composer0.updateRememberedValue(snapLayoutInfoProvider0);
        }
        FlingBehavior flingBehavior0 = SnapFlingBehaviorKt.rememberSnapFlingBehavior(snapLayoutInfoProvider0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flingBehavior0;
    }

    public static final int sizeOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo0, @NotNull Orientation orientation0) {
        return orientation0 == Orientation.Vertical ? IntSize.getHeight-impl(lazyGridItemInfo0.getSize-YbymL2g()) : IntSize.getWidth-impl(lazyGridItemInfo0.getSize-YbymL2g());
    }
}


package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n\u001A\u001F\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001A\u0019\u0010\u000E\u001A\u00020\u000F*\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\"\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "calculateFinalSnappingItem", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "Landroidx/compose/ui/unit/Density;", "velocity", "", "(Landroidx/compose/ui/unit/Density;F)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,146:1\n1223#2,6:147\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n118#1:147,6\n*E\n"})
public final class LazyListSnapLayoutInfoProviderKt {
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull LazyListState lazyListState0, @NotNull SnapPosition snapPosition0) {
        return new SnapLayoutInfoProvider() {
            public final LazyListState a;
            public final SnapPosition b;

            {
                LazyListState lazyListState0 = lazyListState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                SnapPosition snapPosition0 = snapPosition0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = lazyListState0;
                this.b = snapPosition0;
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f, float f1) {
                float f2 = Math.abs(f1);
                LazyListLayoutInfo lazyListLayoutInfo0 = this.a.getLayoutInfo();
                int v = 0;
                if(!lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
                    int v1 = lazyListLayoutInfo0.getVisibleItemsInfo().size();
                    for(Object object0: lazyListLayoutInfo0.getVisibleItemsInfo()) {
                        v += ((LazyListItemInfo)object0).getSize();
                    }
                    v /= v1;
                }
                return Math.signum(f1) * c.coerceAtLeast(f2 - ((float)v), 0.0f);
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                LazyListState lazyListState0 = this.a;
                List list0 = lazyListState0.getLayoutInfo().getVisibleItemsInfo();
                int v = list0.size();
                float f1 = -Infinityf;
                float f2 = Infinityf;
                for(int v1 = 0; v1 < v; ++v1) {
                    LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)list0.get(v1);
                    int v2 = LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(lazyListState0.getLayoutInfo());
                    int v3 = lazyListState0.getLayoutInfo().getBeforeContentPadding();
                    int v4 = lazyListState0.getLayoutInfo().getAfterContentPadding();
                    int v5 = lazyListItemInfo0.getSize();
                    int v6 = lazyListItemInfo0.getOffset();
                    int v7 = lazyListItemInfo0.getIndex();
                    int v8 = lazyListState0.getLayoutInfo().getTotalItemsCount();
                    float f3 = SnapPositionKt.calculateDistanceToDesiredSnapPosition(v2, v3, v4, v5, v6, v7, this.b, v8);
                    if(f3 <= 0.0f && f3 > f1) {
                        f1 = f3;
                    }
                    if(f3 >= 0.0f && f3 < f2) {
                        f2 = f3;
                    }
                }
                return SnapFlingBehaviorKt.calculateFinalOffset-Fhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyListState0.getDensity$foundation_release(), f), f1, f2);
            }
        };
    }

    public static SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState0, SnapPosition snapPosition0, int v, Object object0) {
        if((v & 2) != 0) {
            snapPosition0 = (int v, int v1, int v2, int v3, int v4, int v5) -> (v - v2 - v3) / 2 - v1 / 2;
        }
        return LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(lazyListState0, snapPosition0);
    }

    // 去混淆评级： 低(30)
    public static final int calculateFinalSnappingItem(@NotNull Density density0, float f) {
        if(Math.abs(f) < density0.toPx-0680j_4(400.0f)) {
            return 0;
        }
        return f > 0.0f ? 1 : 2;
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyListLayoutInfo lazyListLayoutInfo0) {
        return lazyListLayoutInfo0.getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(lazyListLayoutInfo0.getViewportSize-YbymL2g()) : IntSize.getWidth-impl(lazyListLayoutInfo0.getViewportSize-YbymL2g());
    }

    @Composable
    @NotNull
    public static final FlingBehavior rememberSnapFlingBehavior(@NotNull LazyListState lazyListState0, @Nullable SnapPosition snapPosition0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            snapPosition0 = (int v, int v1, int v2, int v3, int v4, int v5) -> (v - v2 - v3) / 2 - v1 / 2;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEBD10C96, v, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = (v & 14 ^ 6) > 4 && composer0.changed(lazyListState0) || (v & 6) == 4;
        SnapLayoutInfoProvider snapLayoutInfoProvider0 = composer0.rememberedValue();
        if(z || snapLayoutInfoProvider0 == Composer.Companion.getEmpty()) {
            snapLayoutInfoProvider0 = LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(lazyListState0, snapPosition0);
            composer0.updateRememberedValue(snapLayoutInfoProvider0);
        }
        FlingBehavior flingBehavior0 = SnapFlingBehaviorKt.rememberSnapFlingBehavior(snapLayoutInfoProvider0, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flingBehavior0;
    }
}


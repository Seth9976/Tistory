package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A?\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u001E\u0010\u0006\u001A\u001A\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001A?\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "pagerState", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "pagerSnapDistance", "Lkotlin/Function3;", "", "calculateFinalSnappingBound", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/unit/LayoutDirection;FFFF)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n218#1,4:307\n218#1,4:312\n218#1,4:316\n218#1,4:320\n218#1,4:324\n1#2:311\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n*L\n246#1:307,4\n269#1:312,4\n279#1:316,4\n287#1:320,4\n291#1:324,4\n*E\n"})
public final class PagerSnapLayoutInfoProviderKt {
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull PagerState pagerState0, @NotNull PagerSnapDistance pagerSnapDistance0, @NotNull Function3 function30) {
        return new SnapLayoutInfoProvider() {
            public final PagerState a;
            public final Function3 b;
            public final PagerSnapDistance c;

            {
                PagerState pagerState0 = pagerState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                PagerSnapDistance pagerSnapDistance0 = pagerSnapDistance0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function3 function30 = function30;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = pagerState0;
                this.b = function30;
                this.c = pagerSnapDistance0;
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f, float f1) {
                PagerState pagerState0 = this.a;
                int v = pagerState0.getPageSize$foundation_release();
                int v1 = pagerState0.getPageSpacing$foundation_release() + v;
                if(v1 == 0) {
                    return 0.0f;
                }
                int v2 = f < 0.0f ? pagerState0.getFirstVisiblePage$foundation_release() + 1 : pagerState0.getFirstVisiblePage$foundation_release();
                int v3 = c.coerceIn(((int)(f1 / ((float)v1))) + v2, 0, pagerState0.getPageCount());
                int v4 = pagerState0.getPageSize$foundation_release();
                int v5 = pagerState0.getPageSpacing$foundation_release();
                int v6 = c.coerceAtLeast(Math.abs((c.coerceIn(this.c.calculateTargetPage(v2, v3, f, v4, v5), 0, pagerState0.getPageCount()) - v2) * v1) - v1, 0);
                return v6 == 0 ? 0.0f : Math.signum(f) * ((float)v6);
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                PagerState pagerState0 = this.a;
                SnapPosition snapPosition0 = pagerState0.getLayoutInfo().getSnapPosition();
                List list0 = this.getLayoutInfo().getVisiblePagesInfo();
                int v = list0.size();
                boolean z = false;
                float f1 = -Infinityf;
                float f2 = Infinityf;
                for(int v1 = 0; v1 < v; ++v1) {
                    PageInfo pageInfo0 = (PageInfo)list0.get(v1);
                    float f3 = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(this.getLayoutInfo()), this.getLayoutInfo().getBeforeContentPadding(), this.getLayoutInfo().getAfterContentPadding(), this.getLayoutInfo().getPageSize(), pageInfo0.getOffset(), pageInfo0.getIndex(), snapPosition0, pagerState0.getPageCount());
                    if(f3 <= 0.0f && f3 > f1) {
                        f1 = f3;
                    }
                    if(f3 >= 0.0f && f3 < f2) {
                        f2 = f3;
                    }
                }
                if(f1 == -Infinityf) {
                    f1 = f2;
                }
                if(f2 == Infinityf) {
                    f2 = f1;
                }
                if(PagerSnapLayoutInfoProviderKt.a(pagerState0) == 0.0f) {
                    z = true;
                }
                if(!pagerState0.getCanScrollForward()) {
                    if(!z && PagerSnapLayoutInfoProviderKt.b(pagerState0)) {
                        f1 = 0.0f;
                    }
                    f2 = 0.0f;
                }
                if(!pagerState0.getCanScrollBackward()) {
                    if(z || PagerSnapLayoutInfoProviderKt.b(pagerState0)) {
                        f1 = 0.0f;
                    }
                    else {
                        f1 = 0.0f;
                        f2 = 0.0f;
                    }
                }
                Pair pair0 = TuplesKt.to(f1, f2);
                float f4 = ((Number)pair0.component1()).floatValue();
                float f5 = ((Number)pair0.component2()).floatValue();
                float f6 = ((Number)this.b.invoke(f, f4, f5)).floatValue();
                if(f6 != f4 && f6 != f5 && f6 != 0.0f) {
                    throw new IllegalStateException(("Final Snapping Offset Should Be one of " + f4 + ", " + f5 + " or 0.0").toString());
                }
                return this.isValidDistance(f6) ? f6 : 0.0f;
            }

            @NotNull
            public final PagerLayoutInfo getLayoutInfo() {
                return this.a.getLayoutInfo();
            }

            public final boolean isValidDistance(float f) {
                return f != Infinityf && f != -Infinityf;
            }
        };
    }

    public static final float a(PagerState pagerState0) {
        return pagerState0.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Offset.getX-impl(pagerState0.getUpDownDifference-F1C5BW0$foundation_release()) : Offset.getY-impl(pagerState0.getUpDownDifference-F1C5BW0$foundation_release());
    }

    public static final boolean b(PagerState pagerState0) {
        boolean z = pagerState0.getLayoutInfo().getReverseLayout();
        return PagerSnapLayoutInfoProviderKt.a(pagerState0) > 0.0f && z || PagerSnapLayoutInfoProviderKt.a(pagerState0) <= 0.0f && !z;
    }

    public static final float calculateFinalSnappingBound(@NotNull PagerState pagerState0, @NotNull LayoutDirection layoutDirection0, float f, float f1, float f2, float f3) {
        boolean z;
        if(pagerState0.getLayoutInfo().getOrientation() == Orientation.Vertical) {
            z = PagerSnapLayoutInfoProviderKt.b(pagerState0);
        }
        else {
            z = layoutDirection0 == LayoutDirection.Ltr ? PagerSnapLayoutInfoProviderKt.b(pagerState0) : !PagerSnapLayoutInfoProviderKt.b(pagerState0);
        }
        int v = pagerState0.getLayoutInfo().getPageSize();
        float f4 = v == 0 ? 0.0f : PagerSnapLayoutInfoProviderKt.a(pagerState0) / ((float)v);
        int v1 = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(pagerState0.getDensity$foundation_release(), f1);
        if(FinalSnappingItem.equals-impl0(v1, 0)) {
            if(Math.abs(f4 - ((float)(((int)f4)))) > f) {
                return z ? f3 : f2;
            }
            if(Math.abs(f4) >= Math.abs(pagerState0.getPositionThresholdFraction$foundation_release())) {
                return z ? f2 : f3;
            }
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        if(FinalSnappingItem.equals-impl0(v1, 1)) {
            return f3;
        }
        return FinalSnappingItem.equals-impl0(v1, 2) ? f2 : 0.0f;
    }
}


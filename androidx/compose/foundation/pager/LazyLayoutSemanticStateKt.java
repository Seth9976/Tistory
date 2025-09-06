package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "isVertical", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutSemanticStateKt {
    @NotNull
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(@NotNull PagerState pagerState0, boolean z) {
        return new LazyLayoutSemanticState() {
            public final PagerState a;
            public final boolean b;

            {
                PagerState pagerState0 = pagerState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                boolean z = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = pagerState0;
                this.b = z;
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @NotNull
            public CollectionInfo collectionInfo() {
                return this.b ? new CollectionInfo(this.a.getPageCount(), 1) : new CollectionInfo(1, this.a.getPageCount());
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                int v = this.a.getLayoutInfo().getBeforeContentPadding();
                return this.a.getLayoutInfo().getAfterContentPadding() + v;
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return (float)PagerStateKt.calculateNewMaxScrollOffset(this.a.getLayoutInfo(), this.a.getPageCount());
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return (float)PagerScrollPositionKt.currentAbsoluteScrollOffset(this.a);
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                return this.a.getLayoutInfo().getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(this.a.getLayoutInfo().getViewportSize-YbymL2g()) : IntSize.getWidth-impl(this.a.getLayoutInfo().getViewportSize-YbymL2g());
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @Nullable
            public Object scrollToItem(int v, @NotNull Continuation continuation0) {
                Object object0 = PagerState.scrollToPage$default(this.a, v, 0.0f, continuation0, 2, null);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }
}


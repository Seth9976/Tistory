package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"LazyLayoutSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "isVertical", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyLayoutSemanticStateKt {
    @NotNull
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(@NotNull LazyListState lazyListState0, boolean z) {
        return new LazyLayoutSemanticState() {
            public final LazyListState a;
            public final boolean b;

            {
                LazyListState lazyListState0 = lazyListState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                boolean z = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = lazyListState0;
                this.b = z;
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @NotNull
            public CollectionInfo collectionInfo() {
                return this.b ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                int v = this.a.getLayoutInfo().getBeforeContentPadding();
                return this.a.getLayoutInfo().getAfterContentPadding() + v;
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(this.a.getFirstVisibleItemIndex(), this.a.getFirstVisibleItemScrollOffset(), this.a.getCanScrollForward());
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(this.a.getFirstVisibleItemIndex(), this.a.getFirstVisibleItemScrollOffset());
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                return this.a.getLayoutInfo().getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(this.a.getLayoutInfo().getViewportSize-YbymL2g()) : IntSize.getWidth-impl(this.a.getLayoutInfo().getViewportSize-YbymL2g());
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @Nullable
            public Object scrollToItem(int v, @NotNull Continuation continuation0) {
                Object object0 = LazyListState.scrollToItem$default(this.a, v, 0, continuation0, 2, null);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }
}


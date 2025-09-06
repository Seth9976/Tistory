package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"PagerLazyAnimateScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "state", "Landroidx/compose/foundation/pager/PagerState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PagerLazyAnimateScrollScopeKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final LazyLayoutAnimateScrollScope PagerLazyAnimateScrollScope(@NotNull PagerState pagerState0) {
        return new LazyLayoutAnimateScrollScope() {
            public final PagerState a;

            {
                PagerState pagerState0 = pagerState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = pagerState0;
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public float calculateDistanceTo(int v) {
                Object object0;
                PagerState pagerState0 = this.a;
                List list0 = pagerState0.getLayoutInfo().getVisiblePagesInfo();
                int v1 = list0.size();
                for(int v2 = 0; true; ++v2) {
                    object0 = null;
                    if(v2 >= v1) {
                        break;
                    }
                    Object object1 = list0.get(v2);
                    if(((PageInfo)object1).getIndex() == v) {
                        object0 = object1;
                        break;
                    }
                }
                if(((PageInfo)object0) == null) {
                    int v3 = pagerState0.getCurrentPage();
                    int v4 = pagerState0.getPageSize$foundation_release();
                    return ((float)(v - v3)) * ((float)(pagerState0.getPageSpacing$foundation_release() + v4)) - pagerState0.getCurrentPageOffsetFraction() * ((float)pagerState0.getPageSizeWithSpacing$foundation_release());
                }
                return (float)((PageInfo)object0).getOffset();
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemIndex() {
                return this.a.getFirstVisiblePage$foundation_release();
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemScrollOffset() {
                return this.a.getFirstVisiblePageOffset$foundation_release();
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getItemCount() {
                return this.a.getPageCount();
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getLastVisibleItemIndex() {
                return ((PageInfo)CollectionsKt___CollectionsKt.last(this.a.getLayoutInfo().getVisiblePagesInfo())).getIndex();
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            @Nullable
            public Object scroll(@NotNull Function2 function20, @NotNull Continuation continuation0) {
                Object object0 = ScrollableState.scroll$default(this.a, null, function20, continuation0, 1, null);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public void snapToItem(@NotNull ScrollScope scrollScope0, int v, int v1) {
                float f = ((float)v1) / ((float)this.a.getPageSizeWithSpacing$foundation_release());
                this.a.snapToItem$foundation_release(v, f, true);
            }
        };
    }
}


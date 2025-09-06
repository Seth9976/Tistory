package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\n*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J9\u0010\u0016\u001A\u00020\n2\'\u0010\u0015\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001C\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0019R\u0014\u0010\u001E\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0019R\u0014\u0010 \u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "index", "scrollOffset", "", "snapToItem", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "targetIndex", "", "calculateDistanceTo", "(I)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,81:1\n116#2,2:82\n33#2,6:84\n118#2:90\n132#2,3:91\n33#2,4:94\n135#2,2:98\n38#2:100\n137#2:101\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n49#1:82,2\n49#1:84,6\n49#1:90\n71#1:91,3\n71#1:94,4\n71#1:98,2\n71#1:100\n71#1:101\n*E\n"})
public final class LazyStaggeredGridAnimateScrollScope implements LazyLayoutAnimateScrollScope {
    public static final int $stable = 8;
    public final LazyStaggeredGridState a;

    public LazyStaggeredGridAnimateScrollScope(@NotNull LazyStaggeredGridState lazyStaggeredGridState0) {
        this.a = lazyStaggeredGridState0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int v) {
        Object object0;
        LazyStaggeredGridState lazyStaggeredGridState0 = this.a;
        LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo0 = lazyStaggeredGridState0.getLayoutInfo();
        if(lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            return 0.0f;
        }
        List list0 = lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo();
        int v1 = list0.size();
        for(int v3 = 0; true; ++v3) {
            object0 = null;
            if(v3 >= v1) {
                break;
            }
            Object object1 = list0.get(v3);
            if(((LazyStaggeredGridItemInfo)object1).getIndex() == v) {
                object0 = object1;
                break;
            }
        }
        if(((LazyStaggeredGridItemInfo)object0) == null) {
            List list1 = lazyStaggeredGridLayoutInfo0.getVisibleItemsInfo();
            int v4 = list1.size();
            int v5 = 0;
            for(int v2 = 0; v2 < v4; ++v2) {
                LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = (LazyStaggeredGridItemInfo)list1.get(v2);
                v5 += (lazyStaggeredGridLayoutInfo0.getOrientation() == Orientation.Vertical ? IntSize.getHeight-impl(lazyStaggeredGridItemInfo0.getSize-YbymL2g()) : IntSize.getWidth-impl(lazyStaggeredGridItemInfo0.getSize-YbymL2g()));
            }
            int v6 = lazyStaggeredGridLayoutInfo0.getMainAxisItemSpacing();
            int v7 = lazyStaggeredGridState0.getLaneCount$foundation_release();
            return ((float)(v6 + v5 / list1.size())) * ((float)(v / v7 - this.getFirstVisibleItemIndex() / v7)) - ((float)this.getFirstVisibleItemScrollOffset());
        }
        return lazyStaggeredGridLayoutInfo0.getOrientation() == Orientation.Vertical ? ((float)IntOffset.getY-impl(((LazyStaggeredGridItemInfo)object0).getOffset-nOcc-ac())) : ((float)IntOffset.getX-impl(((LazyStaggeredGridItemInfo)object0).getOffset-nOcc-ac()));
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.a.getFirstVisibleItemIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.a.getFirstVisibleItemScrollOffset();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getItemCount() {
        return this.a.getLayoutInfo().getTotalItemsCount();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = (LazyStaggeredGridItemInfo)CollectionsKt___CollectionsKt.lastOrNull(this.a.getLayoutInfo().getVisibleItemsInfo());
        return lazyStaggeredGridItemInfo0 == null ? 0 : lazyStaggeredGridItemInfo0.getIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    @Nullable
    public Object scroll(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = ScrollableState.scroll$default(this.a, null, function20, continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public void snapToItem(@NotNull ScrollScope scrollScope0, int v, int v1) {
        this.a.snapToItemInternal$foundation_release(v, v1, true);
    }
}


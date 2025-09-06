package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.internal.StabilityInferred;
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

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\n*\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J9\u0010\u0016\u001A\u00020\n2\'\u0010\u0015\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001C\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0019R\u0014\u0010\u001E\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0019R\u0014\u0010 \u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "index", "scrollOffset", "", "snapToItem", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "targetIndex", "", "calculateDistanceTo", "(I)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n116#2,2:68\n33#2,6:70\n118#2:76\n132#2,3:77\n33#2,4:80\n135#2,2:84\n38#2:86\n137#2:87\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n47#1:68,2\n47#1:70,6\n47#1:76\n63#1:77,3\n63#1:80,4\n63#1:84,2\n63#1:86\n63#1:87\n*E\n"})
public final class LazyListAnimateScrollScope implements LazyLayoutAnimateScrollScope {
    public static final int $stable;
    public final LazyListState a;

    public LazyListAnimateScrollScope(@NotNull LazyListState lazyListState0) {
        this.a = lazyListState0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public float calculateDistanceTo(int v) {
        Object object0;
        LazyListLayoutInfo lazyListLayoutInfo0 = this.a.getLayoutInfo();
        if(lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            return 0.0f;
        }
        List list0 = lazyListLayoutInfo0.getVisibleItemsInfo();
        int v1 = list0.size();
        for(int v3 = 0; true; ++v3) {
            object0 = null;
            if(v3 >= v1) {
                break;
            }
            Object object1 = list0.get(v3);
            if(((LazyListItemInfo)object1).getIndex() == v) {
                object0 = object1;
                break;
            }
        }
        if(((LazyListItemInfo)object0) == null) {
            List list1 = lazyListLayoutInfo0.getVisibleItemsInfo();
            int v4 = list1.size();
            int v5 = 0;
            for(int v2 = 0; v2 < v4; ++v2) {
                v5 += ((LazyListItemInfo)list1.get(v2)).getSize();
            }
            return ((float)((v - this.getFirstVisibleItemIndex()) * (lazyListLayoutInfo0.getMainAxisItemSpacing() + v5 / list1.size()))) - ((float)this.getFirstVisibleItemScrollOffset());
        }
        return (float)((LazyListItemInfo)object0).getOffset();
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
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.lastOrNull(this.a.getLayoutInfo().getVisibleItemsInfo());
        return lazyListItemInfo0 == null ? 0 : lazyListItemInfo0.getIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    @Nullable
    public Object scroll(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = ScrollableState.scroll$default(this.a, null, function20, continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public void snapToItem(@NotNull ScrollScope scrollScope0, int v, int v1) {
        this.a.snapToItemIndexInternal$foundation_release(v, v1, true);
    }
}


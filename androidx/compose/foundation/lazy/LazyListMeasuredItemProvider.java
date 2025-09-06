package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ2\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0004\u001A\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0004\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001E\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0017\u001A\u00020\u00162\b\u0010\u0018\u001A\u0004\u0018\u00010\u00162\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\u0006\u0010\u0004\u001A\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u001C\u0010\u001DR\u001D\u0010#\u001A\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0011\u0010\'\u001A\u00020$8F¢\u0006\u0006\u001A\u0004\b%\u0010&\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "<init>", "(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "lane", "span", "getAndMeasure--hBUhpc", "(IIIJ)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getAndMeasure", "getAndMeasure-0kLqBqw", "(IJ)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "", "key", "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem-X9ElhV4", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "createItem", "c", "J", "getChildConstraints-msEJaDk", "()J", "childConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider {
    public static final int $stable;
    public final LazyListItemProvider a;
    public final LazyLayoutMeasureScope b;
    public final long c;

    @ExperimentalFoundationApi
    public LazyListMeasuredItemProvider(long v, boolean z, LazyListItemProvider lazyListItemProvider0, LazyLayoutMeasureScope lazyLayoutMeasureScope0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = lazyListItemProvider0;
        this.b = lazyLayoutMeasureScope0;
        int v1 = 0x7FFFFFFF;
        int v2 = z ? Constraints.getMaxWidth-impl(v) : 0x7FFFFFFF;
        if(!z) {
            v1 = Constraints.getMaxHeight-impl(v);
        }
        this.c = ConstraintsKt.Constraints$default(0, v2, 0, v1, 5, null);
    }

    @NotNull
    public abstract LazyListMeasuredItem createItem-X9ElhV4(int arg1, @NotNull Object arg2, @Nullable Object arg3, @NotNull List arg4, long arg5);

    @NotNull
    public LazyListMeasuredItem getAndMeasure--hBUhpc(int v, int v1, int v2, long v3) {
        return this.getAndMeasure-0kLqBqw(v, v3);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public LazyLayoutMeasuredItem getAndMeasure--hBUhpc(int v, int v1, int v2, long v3) {
        return this.getAndMeasure--hBUhpc(v, v1, v2, v3);
    }

    @NotNull
    public final LazyListMeasuredItem getAndMeasure-0kLqBqw(int v, long v1) {
        Object object0 = this.a.getKey(v);
        List list0 = this.b.measure-0kLqBqw(v, v1);
        return this.createItem-X9ElhV4(v, object0, this.a.getContentType(v), list0, v1);
    }

    public static LazyListMeasuredItem getAndMeasure-0kLqBqw$default(LazyListMeasuredItemProvider lazyListMeasuredItemProvider0, int v, long v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if((v2 & 2) != 0) {
            v1 = lazyListMeasuredItemProvider0.c;
        }
        return lazyListMeasuredItemProvider0.getAndMeasure-0kLqBqw(v, v1);
    }

    public final long getChildConstraints-msEJaDk() {
        return this.c;
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.a.getKeyIndexMap();
    }
}


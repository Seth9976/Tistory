package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ2\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000EH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015Jb\u0010\u001F\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00072\u0006\u0010\u0017\u001A\u00020\u00162\b\u0010\u0018\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u00072\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001A2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001ER\u0011\u0010#\u001A\u00020 8F¢\u0006\u0006\u001A\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "", "defaultMainAxisSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)V", "index", "lane", "span", "Landroidx/compose/ui/unit/Constraints;", "constraints", "getAndMeasure--hBUhpc", "(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getAndMeasure", "mainAxisSpacing", "getAndMeasure-m8Kt_7k", "(IJIII)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "", "key", "contentType", "crossAxisSize", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem-O3s9Psw", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "createItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider {
    public static final int $stable;
    public final LazyGridItemProvider a;
    public final LazyLayoutMeasureScope b;
    public final int c;

    @ExperimentalFoundationApi
    public LazyGridMeasuredItemProvider(@NotNull LazyGridItemProvider lazyGridItemProvider0, @NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v) {
        this.a = lazyGridItemProvider0;
        this.b = lazyLayoutMeasureScope0;
        this.c = v;
    }

    @NotNull
    public abstract LazyGridMeasuredItem createItem-O3s9Psw(int arg1, @NotNull Object arg2, @Nullable Object arg3, int arg4, int arg5, @NotNull List arg6, long arg7, int arg8, int arg9);

    @NotNull
    public LazyGridMeasuredItem getAndMeasure--hBUhpc(int v, int v1, int v2, long v3) {
        return this.getAndMeasure-m8Kt_7k(v, v3, v1, v2, this.c);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public LazyLayoutMeasuredItem getAndMeasure--hBUhpc(int v, int v1, int v2, long v3) {
        return this.getAndMeasure--hBUhpc(v, v1, v2, v3);
    }

    @NotNull
    public final LazyGridMeasuredItem getAndMeasure-m8Kt_7k(int v, long v1, int v2, int v3, int v4) {
        Object object0 = this.a.getKey(v);
        Object object1 = this.a.getContentType(v);
        List list0 = this.b.measure-0kLqBqw(v, v1);
        if(Constraints.getHasFixedWidth-impl(v1)) {
            return this.createItem-O3s9Psw(v, object0, object1, Constraints.getMinWidth-impl(v1), v4, list0, v1, v2, v3);
        }
        if(!Constraints.getHasFixedHeight-impl(v1)) {
            throw new IllegalArgumentException("does not have fixed height");
        }
        return this.createItem-O3s9Psw(v, object0, object1, Constraints.getMinHeight-impl(v1), v4, list0, v1, v2, v3);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.a.getKeyIndexMap();
    }
}


package androidx.compose.foundation.lazy.staggeredgrid;

import e0.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LazyStaggeredGridScopeMarker
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JO\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\u001C\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\b\u000B¢\u0006\u0002\b\fH&¢\u0006\u0002\u0010\rJ½\u0001\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102%\b\u0002\u0010\u0004\u001A\u001F\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2%\b\u0002\u0010\u0005\u001A\u001F\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2%\b\u0002\u0010\u0006\u001A\u001F\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t21\u0010\u0014\u001A-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0002\b\u000B¢\u0006\u0002\b\fH&¢\u0006\u0002\u0010\u0016\u0082\u0001\u0001\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "item", "", "key", "contentType", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", "name", "index", "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyStaggeredGridScope {
    void item(@Nullable Object arg1, @Nullable Object arg2, @Nullable StaggeredGridItemSpan arg3, @NotNull Function3 arg4);

    static void item$default(LazyStaggeredGridScope lazyStaggeredGridScope0, Object object0, Object object1, StaggeredGridItemSpan staggeredGridItemSpan0, Function3 function30, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        if((v & 4) != 0) {
            staggeredGridItemSpan0 = null;
        }
        lazyStaggeredGridScope0.item(object0, object1, staggeredGridItemSpan0, function30);
    }

    void items(int arg1, @Nullable Function1 arg2, @NotNull Function1 arg3, @Nullable Function1 arg4, @NotNull Function4 arg5);

    static void items$default(LazyStaggeredGridScope lazyStaggeredGridScope0, int v, Function1 function10, Function1 function11, Function1 function12, Function4 function40, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 4) != 0) {
            function11 = k.x;
        }
        lazyStaggeredGridScope0.items(v, ((v1 & 2) == 0 ? function10 : null), function11, ((v1 & 8) == 0 ? function12 : null), function40);
    }
}


package androidx.compose.foundation.lazy.grid;

import c0.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LazyGridScopeMarker
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J`\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00012\u001B\b\u0002\u0010\u0005\u001A\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00012\u001C\u0010\u000B\u001A\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\r¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\u000EJÈ\u0001\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u00112%\b\u0002\u0010\u0004\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000620\b\u0002\u0010\u0005\u001A*\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015¢\u0006\u0002\b\t2%\b\u0002\u0010\n\u001A\u001F\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000621\u0010\u0016\u001A-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0002\b\r¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\u0017\u0082\u0001\u0001\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "item", "", "key", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "contentType", "content", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/Function2;", "itemContent", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyGridScope {
    void item(@Nullable Object arg1, @Nullable Function1 arg2, @Nullable Object arg3, @NotNull Function3 arg4);

    static void item$default(LazyGridScope lazyGridScope0, Object object0, Function1 function10, Object object1, Function3 function30, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            object1 = null;
        }
        lazyGridScope0.item(object0, function10, object1, function30);
    }

    void items(int arg1, @Nullable Function1 arg2, @Nullable Function2 arg3, @NotNull Function1 arg4, @NotNull Function4 arg5);

    static void items$default(LazyGridScope lazyGridScope0, int v, Function1 function10, Function2 function20, Function1 function11, Function4 function40, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 8) != 0) {
            function11 = n.x;
        }
        lazyGridScope0.items(v, ((v1 & 2) == 0 ? function10 : null), ((v1 & 4) == 0 ? function20 : null), function11, function40);
    }
}


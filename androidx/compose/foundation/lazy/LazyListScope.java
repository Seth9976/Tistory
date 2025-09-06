package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import b0.n;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LazyScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J7\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00012\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b\tH\u0017\u00A2\u0006\u0002\u0010\nJC\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00012\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b\tH\u0016\u00A2\u0006\u0002\u0010\fJ\u0096\u0001\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000F2%\b\u0002\u0010\u0004\u001A\u001F\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062%\b\u0002\u0010\u000B\u001A\u001F\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000621\u0010\u0013\u001A-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0014\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b\tH\u0016\u00A2\u0006\u0002\u0010\u0015Jo\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000F2%\b\u0002\u0010\u0004\u001A\u001F\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000621\u0010\u0013\u001A-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0014\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b\tH\u0017\u00A2\u0006\u0002\u0010\u0016JC\u0010\u0017\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00012\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b\tH\'\u00A2\u0006\u0002\u0010\f\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u0006\u0018\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "item", "", "key", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "contentType", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", "name", "index", "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface LazyListScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@NotNull LazyListScope lazyListScope0, @Nullable Object object0, @Nullable Object object1, @NotNull Function3 function30) {
            lazyListScope0.super.item(object0, object1, function30);
        }

        @Deprecated
        @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        public static void item(LazyListScope lazyListScope0, Object object0, Function3 function30) {
            lazyListScope0.super.item(object0, function30);
        }

        public static void item$default(LazyListScope lazyListScope0, Object object0, Object object1, Function3 function30, int v, Object object2) {
            LazyListScope.item$default(lazyListScope0, object0, object1, function30, v, object2);
        }

        public static void item$default(LazyListScope lazyListScope0, Object object0, Function3 function30, int v, Object object1) {
            LazyListScope.item$default(lazyListScope0, object0, function30, v, object1);
        }

        @Deprecated
        public static void items(@NotNull LazyListScope lazyListScope0, int v, @Nullable Function1 function10, @NotNull Function1 function11, @NotNull Function4 function40) {
            lazyListScope0.super.items(v, function10, function11, function40);
        }

        @Deprecated
        @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        public static void items(LazyListScope lazyListScope0, int v, Function1 function10, Function4 function40) {
            lazyListScope0.super.items(v, function10, function40);
        }

        public static void items$default(LazyListScope lazyListScope0, int v, Function1 function10, Function1 function11, Function4 function40, int v1, Object object0) {
            LazyListScope.items$default(lazyListScope0, v, function10, function11, function40, v1, object0);
        }

        public static void items$default(LazyListScope lazyListScope0, int v, Function1 function10, Function4 function40, int v1, Object object0) {
            LazyListScope.items$default(lazyListScope0, v, function10, function40, v1, object0);
        }

        public static void stickyHeader$default(LazyListScope lazyListScope0, Object object0, Object object1, Function3 function30, int v, Object object2) {
            LazyListScope.stickyHeader$default(lazyListScope0, object0, object1, function30, v, object2);
        }
    }

    default void item(@Nullable Object object0, @Nullable Object object1, @NotNull Function3 function30) {
        throw new IllegalStateException("The method is not implemented");
    }

    @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    default void item(Object object0, Function3 function30) {
        this.item(object0, null, function30);
    }

    static void item$default(LazyListScope lazyListScope0, Object object0, Object object1, Function3 function30, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        lazyListScope0.item(object0, object1, function30);
    }

    static void item$default(LazyListScope lazyListScope0, Object object0, Function3 function30, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        lazyListScope0.item(object0, function30);
    }

    default void items(int v, @Nullable Function1 function10, @NotNull Function1 function11, @NotNull Function4 function40) {
        throw new IllegalStateException("The method is not implemented");
    }

    @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    default void items(int v, Function1 function10, Function4 function40) {
        this.items(v, function10, n.y, function40);
    }

    static void items$default(LazyListScope lazyListScope0, int v, Function1 function10, Function1 function11, Function4 function40, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 2) != 0) {
            function10 = null;
        }
        if((v1 & 4) != 0) {
            function11 = n.x;
        }
        lazyListScope0.items(v, function10, function11, function40);
    }

    static void items$default(LazyListScope lazyListScope0, int v, Function1 function10, Function4 function40, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 2) != 0) {
            function10 = null;
        }
        lazyListScope0.items(v, function10, function40);
    }

    @ExperimentalFoundationApi
    void stickyHeader(@Nullable Object arg1, @Nullable Object arg2, @NotNull Function3 arg3);

    static void stickyHeader$default(LazyListScope lazyListScope0, Object object0, Object object1, Function3 function30, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        lazyListScope0.stickyHeader(object0, object1, function30);
    }
}


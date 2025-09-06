package androidx.paging.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t4.a;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ae\u0010\u0000\u001A\u001F\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00070\b2,\b\u0002\u0010\t\u001A&\u0012\u0018\u0012\u0016H\u0007¢\u0006\u0002\b\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000B\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0001\u001Aa\u0010\f\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00070\b2*\b\u0002\u0010\r\u001A$\u0012\u0018\u0012\u0016H\u0007¢\u0006\u0002\b\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001¨\u0006\u000E"}, d2 = {"itemContentType", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "T", "Landroidx/paging/compose/LazyPagingItems;", "contentType", "Lkotlin/jvm/JvmSuppressWildcards;", "item", "itemKey", "key", "paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LazyFoundationExtensionsKt {
    @NotNull
    public static final Function1 itemContentType(@NotNull LazyPagingItems lazyPagingItems0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "<this>");
        return new a(function10, lazyPagingItems0, 0);
    }

    public static Function1 itemContentType$default(LazyPagingItems lazyPagingItems0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = null;
        }
        return LazyFoundationExtensionsKt.itemContentType(lazyPagingItems0, function10);
    }

    @NotNull
    public static final Function1 itemKey(@NotNull LazyPagingItems lazyPagingItems0, @Nullable Function1 function10) {
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "<this>");
        return new a(function10, lazyPagingItems0, 1);
    }

    public static Function1 itemKey$default(LazyPagingItems lazyPagingItems0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = null;
        }
        return LazyFoundationExtensionsKt.itemKey(lazyPagingItems0, function10);
    }
}


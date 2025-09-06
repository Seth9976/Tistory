package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A+\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001A\u0018\u0010\u0006\u001A\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class CoroutineContextImplKt {
    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final Element getPolymorphicElement(@NotNull Element coroutineContext$Element0, @NotNull Key coroutineContext$Key0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Element0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        if(coroutineContext$Key0 instanceof AbstractCoroutineContextKey) {
            if(((AbstractCoroutineContextKey)coroutineContext$Key0).isSubKey$kotlin_stdlib(coroutineContext$Element0.getKey())) {
                Element coroutineContext$Element1 = ((AbstractCoroutineContextKey)coroutineContext$Key0).tryCast$kotlin_stdlib(coroutineContext$Element0);
                return coroutineContext$Element1 == null ? null : coroutineContext$Element1;
            }
            return null;
        }
        return coroutineContext$Element0.getKey() == coroutineContext$Key0 ? coroutineContext$Element0 : null;
    }

    @ExperimentalStdlibApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final CoroutineContext minusPolymorphicKey(@NotNull Element coroutineContext$Element0, @NotNull Key coroutineContext$Key0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Element0, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        if(coroutineContext$Key0 instanceof AbstractCoroutineContextKey) {
            return ((AbstractCoroutineContextKey)coroutineContext$Key0).isSubKey$kotlin_stdlib(coroutineContext$Element0.getKey()) && ((AbstractCoroutineContextKey)coroutineContext$Key0).tryCast$kotlin_stdlib(coroutineContext$Element0) != null ? EmptyCoroutineContext.INSTANCE : coroutineContext$Element0;
        }
        return coroutineContext$Element0.getKey() == coroutineContext$Key0 ? EmptyCoroutineContext.INSTANCE : coroutineContext$Element0;
    }
}


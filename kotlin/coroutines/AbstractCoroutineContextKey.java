package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalStdlibApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\n\u001A\u001F\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u000F\u001A\u0004\u0018\u00018\u00012\u0006\u0010\t\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0014\u001A\u00020\u00112\n\u0010\u0010\u001A\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "safeCast", "<init>", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "tryCast", "key", "", "isSubKey$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Key;)Z", "isSubKey", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
public abstract class AbstractCoroutineContextKey implements Key {
    public final Function1 a;
    public final Key b;

    public AbstractCoroutineContextKey(@NotNull Key coroutineContext$Key0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "baseKey");
        Intrinsics.checkNotNullParameter(function10, "safeCast");
        super();
        this.a = function10;
        if(coroutineContext$Key0 instanceof AbstractCoroutineContextKey) {
            coroutineContext$Key0 = ((AbstractCoroutineContextKey)coroutineContext$Key0).b;
        }
        this.b = coroutineContext$Key0;
    }

    public final boolean isSubKey$kotlin_stdlib(@NotNull Key coroutineContext$Key0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        return coroutineContext$Key0 == this || this.b == coroutineContext$Key0;
    }

    @Nullable
    public final Element tryCast$kotlin_stdlib(@NotNull Element coroutineContext$Element0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Element0, "element");
        return (Element)this.a.invoke(coroutineContext$Element0);
    }
}


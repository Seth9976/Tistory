package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J*\u0010\b\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000E\u001A\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000B\u001A\u00028\u00002\u0018\u0010\r\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0018\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0010\u001A\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0013\u001A\u00020\u00012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.3")
public final class EmptyCoroutineContext implements Serializable, CoroutineContext {
    @NotNull
    public static final EmptyCoroutineContext INSTANCE;

    static {
        EmptyCoroutineContext.INSTANCE = new EmptyCoroutineContext();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public Object fold(Object object0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        return object0;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @Nullable
    public Element get(@NotNull Key coroutineContext$Key0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull Key coroutineContext$Key0) {
        Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
        return this;
    }

    @Override  // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "context");
        return coroutineContext0;
    }

    @Override
    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}


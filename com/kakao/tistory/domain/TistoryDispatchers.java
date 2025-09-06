package com.kakao.tistory.domain;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u000B\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0011\u0010\r\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\f\u0010\b¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/TistoryDispatchers;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "setTestDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Default", "getMain", "Main", "getIO", "IO", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryDispatchers {
    @NotNull
    public static final TistoryDispatchers INSTANCE;
    public static CoroutineDispatcher a;

    static {
        TistoryDispatchers.INSTANCE = new TistoryDispatchers();
    }

    @NotNull
    public final CoroutineDispatcher getDefault() {
        return TistoryDispatchers.a == null ? Dispatchers.getDefault() : TistoryDispatchers.a;
    }

    @NotNull
    public final CoroutineDispatcher getIO() {
        return TistoryDispatchers.a == null ? Dispatchers.getIO() : TistoryDispatchers.a;
    }

    @NotNull
    public final CoroutineDispatcher getMain() {
        CoroutineDispatcher coroutineDispatcher0 = TistoryDispatchers.a;
        return coroutineDispatcher0 == null ? Dispatchers.getMain() : coroutineDispatcher0;
    }

    @TestOnly
    public final void setTestDispatcher(@Nullable CoroutineDispatcher coroutineDispatcher0) {
        TistoryDispatchers.a = coroutineDispatcher0;
    }
}


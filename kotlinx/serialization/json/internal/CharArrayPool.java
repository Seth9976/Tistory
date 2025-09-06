package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPool;", "Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "", "take", "()[C", "array", "", "release", "([C)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CharArrayPool extends CharArrayPoolBase {
    @NotNull
    public static final CharArrayPool INSTANCE;

    static {
        CharArrayPool.INSTANCE = new CharArrayPool();  // 初始化器: Lkotlinx/serialization/json/internal/CharArrayPoolBase;-><init>()V
    }

    public final void release(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "array");
        this.releaseImpl(arr_c);
    }

    @NotNull
    public final char[] take() {
        return this.take(0x80);
    }
}


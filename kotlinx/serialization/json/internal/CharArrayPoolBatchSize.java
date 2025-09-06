package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPoolBatchSize;", "Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "", "take", "()[C", "array", "", "release", "([C)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBatchSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class CharArrayPoolBatchSize extends CharArrayPoolBase {
    @NotNull
    public static final CharArrayPoolBatchSize INSTANCE;

    static {
        CharArrayPoolBatchSize.INSTANCE = new CharArrayPoolBatchSize();  // 初始化器: Lkotlinx/serialization/json/internal/CharArrayPoolBase;-><init>()V
    }

    public final void release(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "array");
        if(arr_c.length != 0x4000) {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + arr_c.length).toString());
        }
        this.releaseImpl(arr_c);
    }

    @NotNull
    public final char[] take() {
        return this.take(0x4000);
    }
}


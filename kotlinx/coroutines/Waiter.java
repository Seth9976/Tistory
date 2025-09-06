package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b`\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/Waiter;", "", "invokeOnCancellation", "", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Waiter {
    void invokeOnCancellation(@NotNull Segment arg1, int arg2);
}


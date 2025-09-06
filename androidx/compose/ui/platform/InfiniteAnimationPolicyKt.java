package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A7\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012!\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u0002H\u00010\u0003H\u0080@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"withInfiniteAnimationFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InfiniteAnimationPolicyKt {
    @Nullable
    public static final Object withInfiniteAnimationFrameNanos(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        InfiniteAnimationPolicy infiniteAnimationPolicy0 = (InfiniteAnimationPolicy)continuation0.getContext().get(InfiniteAnimationPolicy.Key);
        return infiniteAnimationPolicy0 == null ? MonotonicFrameClockKt.withFrameNanos(function10, continuation0) : infiniteAnimationPolicy0.onInfiniteOperation(new b1(function10, null), continuation0);
    }
}


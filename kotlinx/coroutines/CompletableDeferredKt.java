package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.j;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001A\u001E\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u001A,\u0010\u0007\u001A\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"CompletableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "parent", "Lkotlinx/coroutines/Job;", "completeWith", "", "result", "Lkotlin/Result;", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class CompletableDeferredKt {
    @NotNull
    public static final CompletableDeferred CompletableDeferred(Object object0) {
        CompletableDeferred completableDeferred0 = new j(null);
        ((JobSupport)completableDeferred0).makeCompleting$kotlinx_coroutines_core(object0);
        return completableDeferred0;
    }

    @NotNull
    public static final CompletableDeferred CompletableDeferred(@Nullable Job job0) {
        return new j(job0);
    }

    public static CompletableDeferred CompletableDeferred$default(Job job0, int v, Object object0) {
        if((v & 1) != 0) {
            job0 = null;
        }
        return CompletableDeferredKt.CompletableDeferred(job0);
    }

    public static final boolean completeWith(@NotNull CompletableDeferred completableDeferred0, @NotNull Object object0) {
        Throwable throwable0 = Result.exceptionOrNull-impl(object0);
        return throwable0 == null ? completableDeferred0.complete(object0) : completableDeferred0.completeExceptionally(throwable0);
    }
}


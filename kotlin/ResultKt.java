package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0007\u001A\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "exception", "", "createFailure", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlin/Result;", "", "throwOnFailure", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
public final class ResultKt {
    @PublishedApi
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Object createFailure(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "exception");
        return new Failure(throwable0);
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    public static final void throwOnFailure(@NotNull Object object0) {
        if(object0 instanceof Failure) {
            throw ((Failure)object0).exception;
        }
    }
}


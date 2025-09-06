package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd.b;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A+\u0010\u0000\u001A\u00020\u00012\u001C\u0010\u0002\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"runSuspend", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class RunSuspendKt {
    @SinceKotlin(version = "1.3")
    public static final void runSuspend(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        ContinuationKt.startCoroutine(function10, b0);
        synchronized(b0) {
            Result result0;
            while((result0 = b0.a) == null) {
                Intrinsics.checkNotNull(b0, "null cannot be cast to non-null type java.lang.Object");
                b0.wait();
            }
            ResultKt.throwOnFailure(result0.unbox-impl());
        }
    }
}


package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.a;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AC\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A\\\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000B\u001A\u00028\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\f\u001A=\u0010\r\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000E\u001AV\u0010\r\u001A\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000B\u001A\u00028\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000F\"\u001B\u0010\u0015\u001A\u00020\u00108Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "createCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "coroutineContext", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ContinuationKt {
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Continuation createCoroutine(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function10, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        return new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function10, continuation0)), a.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final Continuation createCoroutine(@NotNull Function2 function20, Object object0, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function20, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        return new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function20, object0, continuation0)), a.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static void getCoroutineContext$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static final void startCoroutine(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function10, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function10, continuation0)).resumeWith(Unit.INSTANCE);
    }

    @SinceKotlin(version = "1.3")
    public static final void startCoroutine(@NotNull Function2 function20, Object object0, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function20, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function20, object0, continuation0)).resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}


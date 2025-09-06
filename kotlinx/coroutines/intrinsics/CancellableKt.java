package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A@\u0010\u0006\u001A\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A{\u0010\u0006\u001A\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001E\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001A\u00028\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000F\u001A\u001F\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0010\u001A%\u0010\u0006\u001A\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "", "startCoroutineCancellable", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lkotlin/ParameterName;", "name", "cause", "onCancellation", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "fatalCompletion", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,68:1\n49#1,6:69\n49#1,6:75\n49#1,6:81\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n17#1:69,6\n29#1:75,6\n38#1:81,6\n*E\n"})
public final class CancellableKt {
    public static final void startCoroutineCancellable(@NotNull Continuation continuation0, @NotNull Continuation continuation1) {
        try {
            DispatchedContinuationKt.resumeCancellableWith$default(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), Unit.INSTANCE, null, 2, null);
        }
        catch(Throwable throwable0) {
            continuation1.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
            throw throwable0;
        }
    }

    @InternalCoroutinesApi
    public static final void startCoroutineCancellable(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        try {
            DispatchedContinuationKt.resumeCancellableWith$default(IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function10, continuation0)), Unit.INSTANCE, null, 2, null);
        }
        catch(Throwable throwable0) {
            continuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
            throw throwable0;
        }
    }

    public static final void startCoroutineCancellable(@NotNull Function2 function20, Object object0, @NotNull Continuation continuation0, @Nullable Function1 function10) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function20, object0, continuation0)), Unit.INSTANCE, function10);
        }
        catch(Throwable throwable0) {
            continuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
            throw throwable0;
        }
    }

    public static void startCoroutineCancellable$default(Function2 function20, Object object0, Continuation continuation0, Function1 function10, int v, Object object1) {
        if((v & 4) != 0) {
            function10 = null;
        }
        CancellableKt.startCoroutineCancellable(function20, object0, continuation0, function10);
    }
}


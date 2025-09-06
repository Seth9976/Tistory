package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A:\u0010\u0006\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001F\b\u0004\u0010\u0005\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A:\u0010\b\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001F\b\u0004\u0010\u0005\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0081Hø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "selectOld", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectUnbiasedOld", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectOldKt {
    public static final void access$resumeUndispatched(CancellableContinuation cancellableContinuation0, Object object0) {
        CoroutineDispatcher coroutineDispatcher0 = (CoroutineDispatcher)cancellableContinuation0.getContext().get(CoroutineDispatcher.Key);
        if(coroutineDispatcher0 != null) {
            cancellableContinuation0.resumeUndispatched(coroutineDispatcher0, object0);
            return;
        }
        cancellableContinuation0.resumeWith(object0);
    }

    public static final void access$resumeUndispatchedWithException(CancellableContinuation cancellableContinuation0, Throwable throwable0) {
        CoroutineDispatcher coroutineDispatcher0 = (CoroutineDispatcher)cancellableContinuation0.getContext().get(CoroutineDispatcher.Key);
        if(coroutineDispatcher0 != null) {
            cancellableContinuation0.resumeUndispatchedWithException(coroutineDispatcher0, throwable0);
            return;
        }
        cancellableContinuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
    }

    @PublishedApi
    @Nullable
    public static final Object selectOld(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        SelectBuilderImpl selectBuilderImpl0 = new SelectBuilderImpl(continuation0);
        try {
            function10.invoke(selectBuilderImpl0);
        }
        catch(Throwable throwable0) {
            selectBuilderImpl0.handleBuilderException(throwable0);
        }
        Object object0 = selectBuilderImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @PublishedApi
    @Nullable
    public static final Object selectUnbiasedOld(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl0 = new UnbiasedSelectBuilderImpl(continuation0);
        try {
            function10.invoke(unbiasedSelectBuilderImpl0);
        }
        catch(Throwable throwable0) {
            unbiasedSelectBuilderImpl0.handleBuilderException(throwable0);
        }
        Object object0 = unbiasedSelectBuilderImpl0.initSelectResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}


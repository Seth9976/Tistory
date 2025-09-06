package kotlinx.coroutines.selects;

import bg.c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "getResult", "()Ljava/lang/Object;", "", "e", "", "handleBuilderException", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class SelectBuilderImpl extends SelectImplementation {
    public final CancellableContinuationImpl g;

    public SelectBuilderImpl(@NotNull Continuation continuation0) {
        super(continuation0.getContext());
        this.g = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
    }

    public static final CancellableContinuationImpl access$getCont$p(SelectBuilderImpl selectBuilderImpl0) {
        return selectBuilderImpl0.g;
    }

    @PublishedApi
    @Nullable
    public final Object getResult() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.g;
        if(cancellableContinuationImpl0.isCompleted()) {
            return cancellableContinuationImpl0.getResult();
        }
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(this.getContext());
        c c0 = new c(this, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, c0, 1, null);
        return cancellableContinuationImpl0.getResult();
    }

    @PublishedApi
    public final void handleBuilderException(@NotNull Throwable throwable0) {
        Object object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        this.g.resumeWith(object0);
    }
}


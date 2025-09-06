package yf;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

public final class b implements BiFunction {
    @JvmField
    @Nullable
    public volatile Continuation cont;

    @Override
    public final Object apply(Object object0, Object object1) {
        Throwable throwable0 = (Throwable)object1;
        Continuation continuation0 = this.cont;
        if(continuation0 != null) {
            if(throwable0 == null) {
                continuation0.resumeWith(object0);
                return Unit.INSTANCE;
            }
            CompletionException completionException0 = throwable0 instanceof CompletionException ? ((CompletionException)throwable0) : null;
            if(completionException0 != null) {
                Throwable throwable1 = completionException0.getCause();
                if(throwable1 != null) {
                    throwable0 = throwable1;
                }
            }
            continuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
        }
        return Unit.INSTANCE;
    }
}


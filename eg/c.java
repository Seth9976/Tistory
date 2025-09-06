package eg;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation.DefaultImpls;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class c implements OnCompleteListener {
    public final CancellableContinuationImpl a;

    public c(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        Exception exception0 = task0.getException();
        CancellableContinuationImpl cancellableContinuationImpl0 = this.a;
        if(exception0 == null) {
            if(task0.isCanceled()) {
                DefaultImpls.cancel$default(cancellableContinuationImpl0, null, 1, null);
                return;
            }
            cancellableContinuationImpl0.resumeWith(Result.constructor-impl(task0.getResult()));
            return;
        }
        cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(exception0)));
    }
}


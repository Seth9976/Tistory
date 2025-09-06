package k8;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class e implements OnFailureListener, OnSuccessListener {
    public final CancellableContinuationImpl a;

    public e(CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = cancellableContinuationImpl0;
        super();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        Intrinsics.checkNotNullParameter(exception0, "exception");
        Object object0 = Result.constructor-impl(ResultKt.createFailure(exception0));
        this.a.resumeWith(object0);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        this.a.resumeWith(object0);
    }
}


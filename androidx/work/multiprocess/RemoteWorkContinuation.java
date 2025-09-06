package androidx.work.multiprocess;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public abstract class RemoteWorkContinuation {
    @NonNull
    public static RemoteWorkContinuation combine(@NonNull List list0) {
        return ((RemoteWorkContinuation)list0.get(0)).combineInternal(list0);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract RemoteWorkContinuation combineInternal(@NonNull List arg1);

    @NonNull
    public abstract ListenableFuture enqueue();

    @NonNull
    public final RemoteWorkContinuation then(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.then(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract RemoteWorkContinuation then(@NonNull List arg1);
}


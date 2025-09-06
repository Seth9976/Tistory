package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public abstract class WorkContinuation {
    @NonNull
    public static WorkContinuation combine(@NonNull List list0) {
        return ((WorkContinuation)list0.get(0)).combineInternal(list0);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public abstract WorkContinuation combineInternal(@NonNull List arg1);

    @NonNull
    public abstract Operation enqueue();

    @NonNull
    public abstract ListenableFuture getWorkInfos();

    @NonNull
    public abstract LiveData getWorkInfosLiveData();

    @NonNull
    public final WorkContinuation then(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.then(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract WorkContinuation then(@NonNull List arg1);
}


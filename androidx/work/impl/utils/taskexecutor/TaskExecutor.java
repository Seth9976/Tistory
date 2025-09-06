package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface TaskExecutor {
    default void executeOnTaskThread(@NonNull Runnable runnable0) {
        this.getSerialTaskExecutor().execute(runnable0);
    }

    @NonNull
    Executor getMainThreadExecutor();

    @NonNull
    SerialExecutor getSerialTaskExecutor();

    @NonNull
    default CoroutineDispatcher getTaskCoroutineDispatcher() {
        return ExecutorsKt.from(this.getSerialTaskExecutor());
    }
}


package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import g3.r;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkManagerTaskExecutor implements TaskExecutor {
    public final SerialExecutorImpl a;
    public final CoroutineDispatcher b;
    public final Handler c;
    public final r d;

    public WorkManagerTaskExecutor(@NonNull Executor executor0) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new r(this);
        SerialExecutorImpl serialExecutorImpl0 = new SerialExecutorImpl(executor0);
        this.a = serialExecutorImpl0;
        this.b = ExecutorsKt.from(serialExecutorImpl0);
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public Executor getMainThreadExecutor() {
        return this.d;
    }

    @NonNull
    public SerialExecutorImpl getSerialTaskExecutor() {
        return this.a;
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public SerialExecutor getSerialTaskExecutor() {
        return this.getSerialTaskExecutor();
    }

    @Override  // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public CoroutineDispatcher getTaskCoroutineDispatcher() {
        return this.b;
    }
}


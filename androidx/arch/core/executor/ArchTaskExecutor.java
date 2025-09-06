package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import n.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ArchTaskExecutor extends TaskExecutor {
    public TaskExecutor a;
    public final DefaultTaskExecutor b;
    public static volatile ArchTaskExecutor c;
    public static final a d;
    public static final a e;

    static {
        ArchTaskExecutor.d = new a(0);
        ArchTaskExecutor.e = new a(1);
    }

    public ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor0 = new DefaultTaskExecutor();
        this.b = defaultTaskExecutor0;
        this.a = defaultTaskExecutor0;
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(@NonNull Runnable runnable0) {
        this.a.executeOnDiskIO(runnable0);
    }

    @NonNull
    public static Executor getIOThreadExecutor() {
        return ArchTaskExecutor.e;
    }

    @NonNull
    public static ArchTaskExecutor getInstance() {
        if(ArchTaskExecutor.c != null) {
            return ArchTaskExecutor.c;
        }
        synchronized(ArchTaskExecutor.class) {
            if(ArchTaskExecutor.c == null) {
                ArchTaskExecutor.c = new ArchTaskExecutor();
            }
            return ArchTaskExecutor.c;
        }
    }

    @NonNull
    public static Executor getMainThreadExecutor() {
        return ArchTaskExecutor.d;
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.a.isMainThread();
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(@NonNull Runnable runnable0) {
        this.a.postToMainThread(runnable0);
    }

    public void setDelegate(@Nullable TaskExecutor taskExecutor0) {
        if(taskExecutor0 == null) {
            taskExecutor0 = this.b;
        }
        this.a = taskExecutor0;
    }
}


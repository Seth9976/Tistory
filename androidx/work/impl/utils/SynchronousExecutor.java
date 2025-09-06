package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SynchronousExecutor implements Executor {
    @Override
    public void execute(@NonNull Runnable runnable0) {
        runnable0.run();
    }
}


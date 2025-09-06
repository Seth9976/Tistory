package androidx.concurrent.futures;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({Scope.LIBRARY_GROUP})
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override
    public void execute(Runnable runnable0) {
        runnable0.run();
    }

    @Override
    public String toString() {
        return "DirectExecutor";
    }
}


package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h5.c;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public abstract class TracingController {
    @NonNull
    public static TracingController getInstance() {
        return c.a;
    }

    public abstract boolean isTracing();

    public abstract void start(@NonNull TracingConfig arg1);

    public abstract boolean stop(@Nullable OutputStream arg1, @NonNull Executor arg2);
}


package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class ExecutorCompat {
    @NonNull
    public static Executor create(@NonNull Handler handler0) {
        return new g(handler0);
    }
}


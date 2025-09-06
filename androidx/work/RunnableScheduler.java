package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public interface RunnableScheduler {
    void cancel(@NonNull Runnable arg1);

    void scheduleWithDelay(@IntRange(from = 0L) long arg1, @NonNull Runnable arg2);
}


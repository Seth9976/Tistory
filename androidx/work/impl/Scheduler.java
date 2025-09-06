package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface Scheduler {
    public static final int MAX_GREEDY_SCHEDULER_LIMIT = 200;
    public static final int MAX_SCHEDULER_LIMIT = 50;

    void cancel(@NonNull String arg1);

    boolean hasLimitedSchedulingSlots();

    void schedule(@NonNull WorkSpec[] arg1);
}


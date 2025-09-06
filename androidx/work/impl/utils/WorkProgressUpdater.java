package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ProgressUpdater;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkProgressUpdater implements ProgressUpdater {
    public final WorkDatabase a;
    public final TaskExecutor b;
    public static final String c;

    static {
        WorkProgressUpdater.c = "WM-WorkProgressUpdater";
    }

    public WorkProgressUpdater(@NonNull WorkDatabase workDatabase0, @NonNull TaskExecutor taskExecutor0) {
        this.a = workDatabase0;
        this.b = taskExecutor0;
    }

    @Override  // androidx.work.ProgressUpdater
    @NonNull
    public ListenableFuture updateProgress(@NonNull Context context0, @NonNull UUID uUID0, @NonNull Data data0) {
        ListenableFuture listenableFuture0 = SettableFuture.create();
        o o0 = new o(this, uUID0, data0, ((SettableFuture)listenableFuture0));
        this.b.executeOnTaskThread(o0);
        return listenableFuture0;
    }
}


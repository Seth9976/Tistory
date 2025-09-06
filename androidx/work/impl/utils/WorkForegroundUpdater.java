package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkForegroundUpdater implements ForegroundUpdater {
    public final TaskExecutor a;
    public final ForegroundProcessor b;
    public final WorkSpecDao c;

    static {
        new String("WM-WMFgUpdater");
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundUpdater(@NonNull WorkDatabase workDatabase0, @NonNull ForegroundProcessor foregroundProcessor0, @NonNull TaskExecutor taskExecutor0) {
        this.b = foregroundProcessor0;
        this.a = taskExecutor0;
        this.c = workDatabase0.workSpecDao();
    }

    @Override  // androidx.work.ForegroundUpdater
    @NonNull
    public ListenableFuture setForegroundAsync(@NonNull Context context0, @NonNull UUID uUID0, @NonNull ForegroundInfo foregroundInfo0) {
        ListenableFuture listenableFuture0 = SettableFuture.create();
        n n0 = new n(this, ((SettableFuture)listenableFuture0), uUID0, foregroundInfo0, context0);
        this.a.executeOnTaskThread(n0);
        return listenableFuture0;
    }
}


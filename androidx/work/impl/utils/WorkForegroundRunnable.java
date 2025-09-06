package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.activity.m;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.o;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkForegroundRunnable implements Runnable {
    public final SettableFuture a;
    public final Context b;
    public final WorkSpec c;
    public final ListenableWorker d;
    public final ForegroundUpdater e;
    public final TaskExecutor f;
    public static final String g;

    static {
        WorkForegroundRunnable.g = "WM-WorkForegroundRunnab";
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@NonNull Context context0, @NonNull WorkSpec workSpec0, @NonNull ListenableWorker listenableWorker0, @NonNull ForegroundUpdater foregroundUpdater0, @NonNull TaskExecutor taskExecutor0) {
        this.a = SettableFuture.create();
        this.b = context0;
        this.c = workSpec0;
        this.d = listenableWorker0;
        this.e = foregroundUpdater0;
        this.f = taskExecutor0;
    }

    @NonNull
    public ListenableFuture getFuture() {
        return this.a;
    }

    @Override
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if(this.c.expedited && Build.VERSION.SDK_INT < 0x1F) {
            SettableFuture settableFuture0 = SettableFuture.create();
            this.f.getMainThreadExecutor().execute(new m(10, this, settableFuture0));
            settableFuture0.addListener(new o(this, settableFuture0, false, 10), this.f.getMainThreadExecutor());
            return;
        }
        this.a.set(null);
    }
}


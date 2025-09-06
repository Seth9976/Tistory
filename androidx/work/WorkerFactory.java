package androidx.work;

import a5.b;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import k5.c;

public abstract class WorkerFactory {
    public static final String a;

    static {
        WorkerFactory.a = "WM-WorkerFactory";
    }

    @Nullable
    public abstract ListenableWorker createWorker(@NonNull Context arg1, @NonNull String arg2, @NonNull WorkerParameters arg3);

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public final ListenableWorker createWorkerWithDefaultFallback(@NonNull Context context0, @NonNull String s, @NonNull WorkerParameters workerParameters0) {
        Class class0;
        ListenableWorker listenableWorker0 = this.createWorker(context0, s, workerParameters0);
        if(listenableWorker0 == null) {
            try {
                class0 = Class.forName(s).asSubclass(ListenableWorker.class);
            }
            catch(Throwable throwable0) {
                Logger.get().error("WM-WorkerFactory", "Invalid class: " + s, throwable0);
                class0 = null;
            }
            if(class0 != null) {
                try {
                    listenableWorker0 = (ListenableWorker)class0.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context0, workerParameters0);
                }
                catch(Throwable throwable1) {
                    Logger.get().error("WM-WorkerFactory", "Could not instantiate " + s, throwable1);
                }
            }
        }
        if(listenableWorker0 != null && listenableWorker0.isUsed()) {
            throw new IllegalStateException(b.o("WorkerFactory (", this.getClass().getName(), ") returned an instance of a ListenableWorker (", s, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
        }
        return listenableWorker0;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static WorkerFactory getDefaultWorkerFactory() {
        return new c();  // 初始化器: Landroidx/work/WorkerFactory;-><init>()V
    }
}


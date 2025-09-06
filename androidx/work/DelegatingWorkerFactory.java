package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

public class DelegatingWorkerFactory extends WorkerFactory {
    public final CopyOnWriteArrayList b;
    public static final String c;

    static {
        DelegatingWorkerFactory.c = "WM-DelegatingWkrFctry";
    }

    public DelegatingWorkerFactory() {
        this.b = new CopyOnWriteArrayList();
    }

    public final void addFactory(@NonNull WorkerFactory workerFactory0) {
        this.b.add(workerFactory0);
    }

    @Override  // androidx.work.WorkerFactory
    @Nullable
    public final ListenableWorker createWorker(@NonNull Context context0, @NonNull String s, @NonNull WorkerParameters workerParameters0) {
        for(Object object0: this.b) {
            WorkerFactory workerFactory0 = (WorkerFactory)object0;
            try {
                ListenableWorker listenableWorker0 = workerFactory0.createWorker(context0, s, workerParameters0);
                if(listenableWorker0 != null) {
                    return listenableWorker0;
                }
            }
            catch(Throwable throwable0) {
                Logger.get().error("WM-DelegatingWkrFctry", "Unable to instantiate a ListenableWorker (" + s + ")", throwable0);
                throw throwable0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}


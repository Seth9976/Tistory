package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.activity.m;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.emoji2.text.k;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({Scope.LIBRARY_GROUP})
public class Processor implements ForegroundProcessor {
    public PowerManager.WakeLock a;
    public final Context b;
    public final Configuration c;
    public final TaskExecutor d;
    public final WorkDatabase e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashSet i;
    public final ArrayList j;
    public final Object k;
    public static final String l;

    static {
        Processor.l = "WM-Processor";
    }

    public Processor(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull TaskExecutor taskExecutor0, @NonNull WorkDatabase workDatabase0) {
        this.b = context0;
        this.c = configuration0;
        this.d = taskExecutor0;
        this.e = workDatabase0;
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.a = null;
        this.k = new Object();
        this.h = new HashMap();
    }

    public final WorkerWrapper a(String s) {
        WorkerWrapper workerWrapper0 = (WorkerWrapper)this.f.remove(s);
        boolean z = workerWrapper0 != null;
        if(!z) {
            workerWrapper0 = (WorkerWrapper)this.g.remove(s);
        }
        this.h.remove(s);
        if(z) {
            synchronized(this.k) {
                if(this.f.isEmpty()) {
                    Intent intent0 = SystemForegroundDispatcher.createStopForegroundIntent(this.b);
                    try {
                        this.b.startService(intent0);
                    }
                    catch(Throwable throwable0) {
                        Logger.get().error("WM-Processor", "Unable to stop foreground service", throwable0);
                    }
                    PowerManager.WakeLock powerManager$WakeLock0 = this.a;
                    if(powerManager$WakeLock0 != null) {
                        powerManager$WakeLock0.release();
                        this.a = null;
                    }
                }
            }
        }
        return workerWrapper0;
    }

    public void addExecutionListener(@NonNull ExecutionListener executionListener0) {
        synchronized(this.k) {
            this.j.add(executionListener0);
        }
    }

    public final WorkerWrapper b(String s) {
        WorkerWrapper workerWrapper0 = (WorkerWrapper)this.f.get(s);
        return workerWrapper0 == null ? ((WorkerWrapper)this.g.get(s)) : workerWrapper0;
    }

    public static boolean c(String s, WorkerWrapper workerWrapper0, int v) {
        if(workerWrapper0 != null) {
            workerWrapper0.interrupt(v);
            Logger.get().debug("WM-Processor", "WorkerWrapper interrupted for " + s);
            return true;
        }
        Logger.get().debug("WM-Processor", "WorkerWrapper could not be found for " + s);
        return false;
    }

    @Nullable
    public WorkSpec getRunningWorkSpec(@NonNull String s) {
        synchronized(this.k) {
            WorkerWrapper workerWrapper0 = this.b(s);
            return workerWrapper0 != null ? workerWrapper0.getWorkSpec() : null;
        }
    }

    public boolean hasWork() {
        synchronized(this.k) {
        }
        return !this.g.isEmpty() || !this.f.isEmpty();
    }

    public boolean isCancelled(@NonNull String s) {
        synchronized(this.k) {
        }
        return this.i.contains(s);
    }

    public boolean isEnqueued(@NonNull String s) {
        synchronized(this.k) {
            return this.b(s) != null;
        }
    }

    public void removeExecutionListener(@NonNull ExecutionListener executionListener0) {
        synchronized(this.k) {
            this.j.remove(executionListener0);
        }
    }

    @Override  // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(@NonNull String s, @NonNull ForegroundInfo foregroundInfo0) {
        synchronized(this.k) {
            Logger.get().info("WM-Processor", "Moving WorkSpec (" + s + ") to the foreground");
            WorkerWrapper workerWrapper0 = (WorkerWrapper)this.g.remove(s);
            if(workerWrapper0 != null) {
                if(this.a == null) {
                    PowerManager.WakeLock powerManager$WakeLock0 = WakeLocks.newWakeLock(this.b, "ProcessorForegroundLck");
                    this.a = powerManager$WakeLock0;
                    powerManager$WakeLock0.acquire();
                }
                this.f.put(s, workerWrapper0);
                WorkGenerationalId workGenerationalId0 = workerWrapper0.getWorkGenerationalId();
                Intent intent0 = SystemForegroundDispatcher.createStartForegroundIntent(this.b, workGenerationalId0, foregroundInfo0);
                ContextCompat.startForegroundService(this.b, intent0);
            }
        }
    }

    public boolean startWork(@NonNull StartStopToken startStopToken0) {
        return this.startWork(startStopToken0, null);
    }

    public boolean startWork(@NonNull StartStopToken startStopToken0, @Nullable RuntimeExtras workerParameters$RuntimeExtras0) {
        WorkerWrapper workerWrapper0;
        WorkGenerationalId workGenerationalId0 = startStopToken0.getId();
        String s = workGenerationalId0.getWorkSpecId();
        ArrayList arrayList0 = new ArrayList();
        a a0 = new a(this, arrayList0, s);
        WorkSpec workSpec0 = (WorkSpec)this.e.runInTransaction(a0);
        if(workSpec0 == null) {
            Logger.get().warning("WM-Processor", "Didn\'t find WorkSpec for id " + workGenerationalId0);
            this.d.getMainThreadExecutor().execute(new m(7, this, workGenerationalId0));
            return false;
        }
        synchronized(this.k) {
            if(this.isEnqueued(s)) {
                Set set0 = (Set)this.h.get(s);
                Object object1 = set0.iterator().next();
                if(((StartStopToken)object1).getId().getGeneration() == workGenerationalId0.getGeneration()) {
                    set0.add(startStopToken0);
                    Logger.get().debug("WM-Processor", "Work " + workGenerationalId0 + " is already enqueued for processing");
                }
                else {
                    this.d.getMainThreadExecutor().execute(new m(7, this, workGenerationalId0));
                }
                return false;
            }
            if(workSpec0.getGeneration() != workGenerationalId0.getGeneration()) {
                this.d.getMainThreadExecutor().execute(new m(7, this, workGenerationalId0));
                return false;
            }
            workerWrapper0 = new Builder(this.b, this.c, this.d, this, this.e, workSpec0, arrayList0).withRuntimeExtras(workerParameters$RuntimeExtras0).build();
            ListenableFuture listenableFuture0 = workerWrapper0.getFuture();
            listenableFuture0.addListener(new k(this, listenableFuture0, 3, workerWrapper0), this.d.getMainThreadExecutor());
            this.g.put(s, workerWrapper0);
            HashSet hashSet0 = new HashSet();
            hashSet0.add(startStopToken0);
            this.h.put(s, hashSet0);
        }
        this.d.getSerialTaskExecutor().execute(workerWrapper0);
        Logger.get().debug("WM-Processor", this.getClass().getSimpleName() + ": processing " + workGenerationalId0);
        return true;
    }

    public boolean stopAndCancelWork(@NonNull String s, int v) {
        WorkerWrapper workerWrapper0;
        synchronized(this.k) {
            Logger.get().debug("WM-Processor", "Processor cancelling " + s);
            this.i.add(s);
            workerWrapper0 = this.a(s);
        }
        return Processor.c(s, workerWrapper0, v);
    }

    public boolean stopForegroundWork(@NonNull StartStopToken startStopToken0, int v) {
        WorkerWrapper workerWrapper0;
        String s = startStopToken0.getId().getWorkSpecId();
        synchronized(this.k) {
            workerWrapper0 = this.a(s);
        }
        return Processor.c(s, workerWrapper0, v);
    }

    public boolean stopWork(@NonNull StartStopToken startStopToken0, int v) {
        String s = startStopToken0.getId().getWorkSpecId();
        synchronized(this.k) {
            if(this.f.get(s) != null) {
                Logger.get().debug("WM-Processor", "Ignored stopWork. WorkerWrapper " + s + " is in foreground");
                return false;
            }
            Set set0 = (Set)this.h.get(s);
            if(set0 != null && set0.contains(startStopToken0)) {
                WorkerWrapper workerWrapper0 = this.a(s);
                return Processor.c(s, workerWrapper0, v);
            }
            return false;
        }
    }
}


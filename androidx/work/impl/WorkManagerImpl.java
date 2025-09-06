package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.o;
import androidx.lifecycle.LiveData;
import androidx.work.Configuration.Provider;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger.LogcatLogger;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.RawWorkInfoDaoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDaoKt;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.PruneWorkRunnable;
import androidx.work.impl.utils.RawQueries;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.Flow;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkManagerImpl extends WorkManager {
    public static final int CONTENT_URI_TRIGGER_API_LEVEL = 24;
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    public static final String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";
    public final Context a;
    public final Configuration b;
    public final WorkDatabase c;
    public final TaskExecutor d;
    public final List e;
    public final Processor f;
    public final PreferenceUtils g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public volatile RemoteWorkManager j;
    public final Trackers k;
    public static final String l;
    public static WorkManagerImpl m;
    public static WorkManagerImpl n;
    public static final Object o;

    static {
        WorkManagerImpl.l = "WM-WorkManagerImpl";
        WorkManagerImpl.m = null;
        WorkManagerImpl.n = null;
        WorkManagerImpl.o = new Object();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull TaskExecutor taskExecutor0, @NonNull WorkDatabase workDatabase0, @NonNull List list0, @NonNull Processor processor0, @NonNull Trackers trackers0) {
        this.h = false;
        Context context1 = context0.getApplicationContext();
        if(h.a(context1)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        Logger.setLogger(new LogcatLogger(configuration0.getMinimumLoggingLevel()));
        this.a = context1;
        this.d = taskExecutor0;
        this.c = workDatabase0;
        this.f = processor0;
        this.k = trackers0;
        this.b = configuration0;
        this.e = list0;
        this.g = new PreferenceUtils(workDatabase0);
        Schedulers.registerRescheduling(list0, processor0, taskExecutor0.getSerialTaskExecutor(), workDatabase0, configuration0);
        taskExecutor0.executeOnTaskThread(new ForceStopRunnable(context1, this));
    }

    public final void a() {
        try {
            this.j = (RemoteWorkManager)Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, WorkManagerImpl.class).newInstance(this.a, this);
        }
        catch(Throwable throwable0) {
            Logger.get().debug("WM-WorkManagerImpl", "Unable to initialize multi-process support", throwable0);
        }
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public WorkContinuation beginUniqueWork(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0) {
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, s, existingWorkPolicy0, list0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public WorkContinuation beginWith(@NonNull List list0) {
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, list0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation cancelAllWork() {
        CancelWorkRunnable cancelWorkRunnable0 = CancelWorkRunnable.forAll(this);
        this.d.executeOnTaskThread(cancelWorkRunnable0);
        return cancelWorkRunnable0.getOperation();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation cancelAllWorkByTag(@NonNull String s) {
        CancelWorkRunnable cancelWorkRunnable0 = CancelWorkRunnable.forTag(s, this);
        this.d.executeOnTaskThread(cancelWorkRunnable0);
        return cancelWorkRunnable0.getOperation();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation cancelUniqueWork(@NonNull String s) {
        CancelWorkRunnable cancelWorkRunnable0 = CancelWorkRunnable.forName(s, this, true);
        this.d.executeOnTaskThread(cancelWorkRunnable0);
        return cancelWorkRunnable0.getOperation();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation cancelWorkById(@NonNull UUID uUID0) {
        CancelWorkRunnable cancelWorkRunnable0 = CancelWorkRunnable.forId(uUID0, this);
        this.d.executeOnTaskThread(cancelWorkRunnable0);
        return cancelWorkRunnable0.getOperation();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public PendingIntent createCancelPendingIntent(@NonNull UUID uUID0) {
        Intent intent0 = SystemForegroundDispatcher.createCancelWorkIntent(this.a, uUID0.toString());
        return Build.VERSION.SDK_INT < 0x1F ? PendingIntent.getService(this.a, 0, intent0, 0x8000000) : PendingIntent.getService(this.a, 0, intent0, 0xA000000);
    }

    @NonNull
    public WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(@NonNull String s, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy0, @NonNull PeriodicWorkRequest periodicWorkRequest0) {
        return existingPeriodicWorkPolicy0 == ExistingPeriodicWorkPolicy.KEEP ? new WorkContinuationImpl(this, s, ExistingWorkPolicy.KEEP, Collections.singletonList(periodicWorkRequest0)) : new WorkContinuationImpl(this, s, ExistingWorkPolicy.REPLACE, Collections.singletonList(periodicWorkRequest0));
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation enqueue(@NonNull List list0) {
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new WorkContinuationImpl(this, list0).enqueue();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation enqueueUniquePeriodicWork(@NonNull String s, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy0, @NonNull PeriodicWorkRequest periodicWorkRequest0) {
        return existingPeriodicWorkPolicy0 == ExistingPeriodicWorkPolicy.UPDATE ? WorkerUpdater.enqueueUniquelyNamedPeriodic(this, s, periodicWorkRequest0) : this.createWorkContinuationForUniquePeriodicWork(s, existingPeriodicWorkPolicy0, periodicWorkRequest0).enqueue();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation enqueueUniqueWork(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0) {
        return new WorkContinuationImpl(this, s, existingWorkPolicy0, list0).enqueue();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Context getApplicationContext() {
        return this.a;
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Configuration getConfiguration() {
        return this.b;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Deprecated
    public static WorkManagerImpl getInstance() {
        synchronized(WorkManagerImpl.o) {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.m;
            if(workManagerImpl0 != null) {
                return workManagerImpl0;
            }
        }
        return WorkManagerImpl.n;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static WorkManagerImpl getInstance(@NonNull Context context0) {
        synchronized(WorkManagerImpl.o) {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.getInstance();
            if(workManagerImpl0 == null) {
                Context context1 = context0.getApplicationContext();
                if(!(context1 instanceof Provider)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                WorkManagerImpl.initialize(context1, ((Provider)context1).getWorkManagerConfiguration());
                return WorkManagerImpl.getInstance(context1);
            }
            return workManagerImpl0;
        }
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public ListenableFuture getLastCancelAllTimeMillis() {
        ListenableFuture listenableFuture0 = SettableFuture.create();
        o o0 = new o(5, listenableFuture0, this.g);
        this.d.executeOnTaskThread(o0);
        return listenableFuture0;
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData getLastCancelAllTimeMillisLiveData() {
        return this.g.getLastCancelAllTimeMillisLiveData();
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public PreferenceUtils getPreferenceUtils() {
        return this.g;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Processor getProcessor() {
        return this.f;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public RemoteWorkManager getRemoteWorkManager() {
        if(this.j == null) {
            Object object0 = WorkManagerImpl.o;
            synchronized(object0) {
                if(this.j == null) {
                    this.a();
                    if(this.j == null && !TextUtils.isEmpty(this.b.getDefaultProcessName())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.j;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public List getSchedulers() {
        return this.e;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Trackers getTrackers() {
        return this.k;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public WorkDatabase getWorkDatabase() {
        return this.c;
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public ListenableFuture getWorkInfoById(@NonNull UUID uUID0) {
        StatusRunnable statusRunnable0 = StatusRunnable.forUUID(this, uUID0);
        this.d.getSerialTaskExecutor().execute(statusRunnable0);
        return statusRunnable0.getFuture();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Flow getWorkInfoByIdFlow(@NonNull UUID uUID0) {
        return WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds(this.getWorkDatabase().workSpecDao(), uUID0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData getWorkInfoByIdLiveData(@NonNull UUID uUID0) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.c.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uUID0.toString())), new g(), this.d);  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public ListenableFuture getWorkInfos(@NonNull WorkQuery workQuery0) {
        StatusRunnable statusRunnable0 = StatusRunnable.forWorkQuerySpec(this, workQuery0);
        this.d.getSerialTaskExecutor().execute(statusRunnable0);
        return statusRunnable0.getFuture();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public ListenableFuture getWorkInfosByTag(@NonNull String s) {
        StatusRunnable statusRunnable0 = StatusRunnable.forTag(this, s);
        this.d.getSerialTaskExecutor().execute(statusRunnable0);
        return statusRunnable0.getFuture();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Flow getWorkInfosByTagFlow(@NonNull String s) {
        return WorkSpecDaoKt.getWorkStatusPojoFlowForTag(this.c.workSpecDao(), this.d.getTaskCoroutineDispatcher(), s);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData getWorkInfosByTagLiveData(@NonNull String s) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.c.workSpecDao().getWorkStatusPojoLiveDataForTag(s), WorkSpec.WORK_INFO_MAPPER, this.d);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Flow getWorkInfosFlow(@NonNull WorkQuery workQuery0) {
        return RawWorkInfoDaoKt.getWorkInfoPojosFlow(this.c.rawWorkInfoDao(), this.d.getTaskCoroutineDispatcher(), RawQueries.toRawQuery(workQuery0));
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public ListenableFuture getWorkInfosForUniqueWork(@NonNull String s) {
        StatusRunnable statusRunnable0 = StatusRunnable.forUniqueWork(this, s);
        this.d.getSerialTaskExecutor().execute(statusRunnable0);
        return statusRunnable0.getFuture();
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Flow getWorkInfosForUniqueWorkFlow(@NonNull String s) {
        return WorkSpecDaoKt.getWorkStatusPojoFlowForName(this.c.workSpecDao(), this.d.getTaskCoroutineDispatcher(), s);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData getWorkInfosForUniqueWorkLiveData(@NonNull String s) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.c.workSpecDao().getWorkStatusPojoLiveDataForName(s), WorkSpec.WORK_INFO_MAPPER, this.d);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public LiveData getWorkInfosLiveData(@NonNull WorkQuery workQuery0) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.c.rawWorkInfoDao().getWorkInfoPojosLiveData(RawQueries.toRawQuery(workQuery0)), WorkSpec.WORK_INFO_MAPPER, this.d);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public TaskExecutor getWorkTaskExecutor() {
        return this.d;
    }

    @Override  // androidx.work.WorkManager
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static void initialize(@NonNull Context context0, @NonNull Configuration configuration0) {
        synchronized(WorkManagerImpl.o) {
            WorkManagerImpl workManagerImpl0 = WorkManagerImpl.m;
            if(workManagerImpl0 != null && WorkManagerImpl.n != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if(workManagerImpl0 == null) {
                Context context1 = context0.getApplicationContext();
                if(WorkManagerImpl.n == null) {
                    WorkManagerImpl.n = WorkManagerImplExtKt.createWorkManager(context1, configuration0);
                }
                WorkManagerImpl.m = WorkManagerImpl.n;
            }
        }
    }

    @Override  // androidx.work.WorkManager
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static boolean isInitialized() {
        return WorkManagerImpl.getInstance() != null;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void onForceStopRunnableCompleted() {
        synchronized(WorkManagerImpl.o) {
            this.h = true;
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.i;
            if(broadcastReceiver$PendingResult0 != null) {
                broadcastReceiver$PendingResult0.finish();
                this.i = null;
            }
        }
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public Operation pruneWork() {
        PruneWorkRunnable pruneWorkRunnable0 = new PruneWorkRunnable(this);
        this.d.executeOnTaskThread(pruneWorkRunnable0);
        return pruneWorkRunnable0.getOperation();
    }

    public void rescheduleEligibleWork() {
        SystemJobScheduler.cancelAll(this.getApplicationContext());
        this.getWorkDatabase().workSpecDao().resetScheduledState();
        Schedulers.schedule(this.getConfiguration(), this.getWorkDatabase(), this.getSchedulers());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static void setDelegate(@Nullable WorkManagerImpl workManagerImpl0) {
        synchronized(WorkManagerImpl.o) {
            WorkManagerImpl.m = workManagerImpl0;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setReschedulePendingResult(@NonNull BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        synchronized(WorkManagerImpl.o) {
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult1 = this.i;
            if(broadcastReceiver$PendingResult1 != null) {
                broadcastReceiver$PendingResult1.finish();
            }
            this.i = broadcastReceiver$PendingResult0;
            if(this.h) {
                broadcastReceiver$PendingResult0.finish();
                this.i = null;
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void stopForegroundWork(@NonNull WorkGenerationalId workGenerationalId0) {
        StartStopToken startStopToken0 = new StartStopToken(workGenerationalId0);
        StopWorkRunnable stopWorkRunnable0 = new StopWorkRunnable(this.f, startStopToken0, true);
        this.d.executeOnTaskThread(stopWorkRunnable0);
    }

    @Override  // androidx.work.WorkManager
    @NonNull
    public ListenableFuture updateWork(@NonNull WorkRequest workRequest0) {
        return WorkerUpdater.updateWorkImpl(this, workRequest0);
    }
}


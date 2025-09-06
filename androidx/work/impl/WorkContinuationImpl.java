package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest.Builder;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestrictTo({Scope.LIBRARY_GROUP})
public class WorkContinuationImpl extends WorkContinuation {
    public final WorkManagerImpl a;
    public final String b;
    public final ExistingWorkPolicy c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final List g;
    public boolean h;
    public Operation i;
    public static final String j;

    static {
        WorkContinuationImpl.j = "WM-WorkContinuationImpl";
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl0, @Nullable String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0) {
        this(workManagerImpl0, s, existingWorkPolicy0, list0, null);
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl0, @Nullable String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull List list0, @Nullable List list1) {
        this.a = workManagerImpl0;
        this.b = s;
        this.c = existingWorkPolicy0;
        this.d = list0;
        this.g = list1;
        this.e = new ArrayList(list0.size());
        this.f = new ArrayList();
        if(list1 != null) {
            for(Object object0: list1) {
                this.f.addAll(((WorkContinuationImpl)object0).f);
            }
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(existingWorkPolicy0 == ExistingWorkPolicy.REPLACE && ((WorkRequest)list0.get(v)).getWorkSpec().getNextScheduleTimeOverride() != 0x7FFFFFFFFFFFFFFFL) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String s1 = ((WorkRequest)list0.get(v)).getStringId();
            this.e.add(s1);
            this.f.add(s1);
        }
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl0, @NonNull List list0) {
        this(workManagerImpl0, null, ExistingWorkPolicy.KEEP, list0, null);
    }

    public static boolean a(WorkContinuationImpl workContinuationImpl0, HashSet hashSet0) {
        hashSet0.addAll(workContinuationImpl0.getIds());
        Set set0 = WorkContinuationImpl.prerequisitesFor(workContinuationImpl0);
        for(Object object0: hashSet0) {
            if(set0.contains(((String)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        List list0 = workContinuationImpl0.getParents();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object1: list0) {
                if(WorkContinuationImpl.a(((WorkContinuationImpl)object1), hashSet0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        hashSet0.removeAll(workContinuationImpl0.getIds());
        return false;
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation combineInternal(@NonNull List list0) {
        OneTimeWorkRequest oneTimeWorkRequest0 = (OneTimeWorkRequest)new Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList0 = new ArrayList(list0.size());
        for(Object object0: list0) {
            arrayList0.add(((WorkContinuationImpl)(((WorkContinuation)object0))));
        }
        List list1 = Collections.singletonList(oneTimeWorkRequest0);
        return new WorkContinuationImpl(this.a, null, ExistingWorkPolicy.KEEP, list1, arrayList0);
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public Operation enqueue() {
        if(!this.h) {
            EnqueueRunnable enqueueRunnable0 = new EnqueueRunnable(this);
            this.a.getWorkTaskExecutor().executeOnTaskThread(enqueueRunnable0);
            this.i = enqueueRunnable0.getOperation();
            return this.i;
        }
        Logger.get().warning("WM-WorkContinuationImpl", "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        return this.i;
    }

    @NonNull
    public List getAllIds() {
        return this.f;
    }

    @NonNull
    public ExistingWorkPolicy getExistingWorkPolicy() {
        return this.c;
    }

    @NonNull
    public List getIds() {
        return this.e;
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    @Nullable
    public List getParents() {
        return this.g;
    }

    @NonNull
    public List getWork() {
        return this.d;
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public ListenableFuture getWorkInfos() {
        StatusRunnable statusRunnable0 = StatusRunnable.forStringIds(this.a, this.f);
        this.a.getWorkTaskExecutor().executeOnTaskThread(statusRunnable0);
        return statusRunnable0.getFuture();
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public LiveData getWorkInfosLiveData() {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.a.c.workSpecDao().getWorkStatusPojoLiveDataForIds(this.f), WorkSpec.WORK_INFO_MAPPER, this.a.d);
    }

    @NonNull
    public WorkManagerImpl getWorkManagerImpl() {
        return this.a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean hasCycles() {
        return WorkContinuationImpl.a(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.h;
    }

    public void markEnqueued() {
        this.h = true;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Set prerequisitesFor(@NonNull WorkContinuationImpl workContinuationImpl0) {
        Set set0 = new HashSet();
        List list0 = workContinuationImpl0.getParents();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                set0.addAll(((WorkContinuationImpl)object0).getIds());
            }
        }
        return set0;
    }

    @Override  // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation then(@NonNull List list0) {
        if(list0.isEmpty()) {
            return this;
        }
        List list1 = Collections.singletonList(this);
        return new WorkContinuationImpl(this.a, this.b, ExistingWorkPolicy.KEEP, list0, list1);
    }
}


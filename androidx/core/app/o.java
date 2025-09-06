package androidx.core.app;

import android.app.Application;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.provider.k;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.e;
import com.google.android.gms.tasks.g;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.flowable.c1;
import io.reactivex.internal.operators.flowable.t6;
import io.reactivex.internal.operators.maybe.y;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.f;
import io.reactivex.internal.schedulers.z;
import io.reactivex.processors.UnicastProcessor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;

public final class o implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public o(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    public o(Object object0, Object object1, boolean z, int v) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    private final void a() {
        synchronized(((g)this.c).c) {
            OnCompleteListener onCompleteListener0 = (OnCompleteListener)((g)this.c).d;
            if(onCompleteListener0 != null) {
                onCompleteListener0.onComplete(((Task)this.b));
            }
        }
    }

    private final void b() {
        synchronized(((g)this.c).c) {
            OnFailureListener onFailureListener0 = (OnFailureListener)((g)this.c).d;
            if(onFailureListener0 != null) {
                onFailureListener0.onFailure(((Exception)Preconditions.checkNotNull(((Task)this.b).getException())));
            }
        }
    }

    private final void c() {
        synchronized(((g)this.c).c) {
            OnSuccessListener onSuccessListener0 = (OnSuccessListener)((g)this.c).d;
            if(onSuccessListener0 != null) {
                onSuccessListener0.onSuccess(((Task)this.b).getResult());
            }
        }
    }

    @Override
    public final void run() {
        Task task2;
        Task task1;
        Object object6;
        DefaultItemAnimator defaultItemAnimator0;
        switch(this.a) {
            case 0: {
                ((p)this.b).a = this.c;
                return;
            }
            case 1: {
                ((Application)this.c).unregisterActivityLifecycleCallbacks(((p)this.b));
                return;
            }
            case 2: {
                try {
                    Method method0 = q.d;
                    Object object0 = this.b;
                    Object object1 = this.c;
                    if(method0 != null) {
                        method0.invoke(object1, object0, Boolean.FALSE, "AppCompat recreation");
                        return;
                    }
                    q.e.invoke(object1, object0, Boolean.FALSE);
                    return;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(Throwable throwable0) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", throwable0);
                    return;
                }
                if(runtimeException0.getClass() == RuntimeException.class && runtimeException0.getMessage() != null && runtimeException0.getMessage().startsWith("Unable to stop")) {
                    throw runtimeException0;
                }
                return;
            }
            case 3: {
                ((k)this.b).accept(this.c);
                return;
            }
            case 4: {
                ArrayList arrayList0 = (ArrayList)this.b;
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    boolean z = iterator0.hasNext();
                    defaultItemAnimator0 = (DefaultItemAnimator)this.c;
                    if(!z) {
                        break;
                    }
                    Object object2 = iterator0.next();
                    t t0 = (t)object2;
                    defaultItemAnimator0.getClass();
                    View view0 = null;
                    View view1 = t0.a == null ? null : t0.a.itemView;
                    ViewHolder recyclerView$ViewHolder0 = t0.b;
                    if(recyclerView$ViewHolder0 != null) {
                        view0 = recyclerView$ViewHolder0.itemView;
                    }
                    ArrayList arrayList1 = defaultItemAnimator0.r;
                    if(view1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator0 = view1.animate().setDuration(defaultItemAnimator0.getChangeDuration());
                        arrayList1.add(t0.a);
                        viewPropertyAnimator0.translationX(((float)(t0.e - t0.c)));
                        viewPropertyAnimator0.translationY(((float)(t0.f - t0.d)));
                        viewPropertyAnimator0.alpha(0.0f).setListener(new r(defaultItemAnimator0, t0, viewPropertyAnimator0, view1)).start();
                    }
                    if(view0 != null) {
                        ViewPropertyAnimator viewPropertyAnimator1 = view0.animate();
                        arrayList1.add(t0.b);
                        viewPropertyAnimator1.translationX(0.0f).translationY(0.0f).setDuration(defaultItemAnimator0.getChangeDuration()).alpha(1.0f).setListener(new s(defaultItemAnimator0, t0, viewPropertyAnimator1, view0)).start();
                    }
                }
                arrayList0.clear();
                defaultItemAnimator0.n.remove(arrayList0);
                return;
            }
            case 5: {
                SettableFuture settableFuture0 = (SettableFuture)this.b;
                try {
                    settableFuture0.set(((PreferenceUtils)this.c).getLastCancelAllTimeMillis());
                }
                catch(Throwable throwable1) {
                    settableFuture0.setException(throwable1);
                }
                return;
            }
            case 6: {
                WorkerWrapper workerWrapper0 = (WorkerWrapper)this.c;
                if(!workerWrapper0.q.isCancelled()) {
                    try {
                        ((ListenableFuture)this.b).get();
                        Logger.get().debug("WM-WorkerWrapper", "Starting work for " + workerWrapper0.d.workerClassName);
                        ListenableFuture listenableFuture0 = workerWrapper0.e.startWork();
                        workerWrapper0.q.setFuture(listenableFuture0);
                        return;
                    }
                    catch(Throwable throwable2) {
                        workerWrapper0.q.setException(throwable2);
                    }
                }
                return;
            }
            case 7: {
                WorkSpec workSpec0 = ((SystemForegroundDispatcher)this.c).a.getProcessor().getRunningWorkSpec(((String)this.b));
                if(workSpec0 != null && workSpec0.hasConstraints()) {
                    synchronized(((SystemForegroundDispatcher)this.c).c) {
                        WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(workSpec0);
                        ((SystemForegroundDispatcher)this.c).f.put(workGenerationalId0, workSpec0);
                        CoroutineDispatcher coroutineDispatcher0 = ((SystemForegroundDispatcher)this.c).b.getTaskCoroutineDispatcher();
                        Job job0 = WorkConstraintsTrackerKt.listen(((SystemForegroundDispatcher)this.c).h, workSpec0, coroutineDispatcher0, ((SystemForegroundDispatcher)this.c));
                        WorkGenerationalId workGenerationalId1 = WorkSpecKt.generationalId(workSpec0);
                        ((SystemForegroundDispatcher)this.c).g.put(workGenerationalId1, job0);
                    }
                    return;
                }
                return;
            }
            case 8: {
                synchronized(((androidx.work.impl.utils.g)this.b).c) {
                    Object object4 = ((androidx.work.impl.utils.g)this.b).d.apply(this.c);
                    androidx.work.impl.utils.g g0 = (androidx.work.impl.utils.g)this.b;
                    Object object5 = g0.a;
                    if(object5 == null && object4 != null) {
                        g0.a = object4;
                        g0.e.postValue(object4);
                    }
                    else if(object5 != null && !object5.equals(object4)) {
                        ((androidx.work.impl.utils.g)this.b).a = object4;
                        ((androidx.work.impl.utils.g)this.b).e.postValue(object4);
                    }
                }
                return;
            }
            case 9: {
                try {
                    ((Runnable)this.c).run();
                }
                finally {
                    synchronized(((SerialExecutorImpl)this.b).d) {
                        ((SerialExecutorImpl)this.b).a();
                    }
                }
                return;
            }
            case 10: {
                WorkForegroundRunnable workForegroundRunnable0 = (WorkForegroundRunnable)this.c;
                if(!workForegroundRunnable0.a.isCancelled()) {
                    try {
                        ForegroundInfo foregroundInfo0 = (ForegroundInfo)((SettableFuture)this.b).get();
                        if(foregroundInfo0 == null) {
                            throw new IllegalStateException("Worker was marked important (" + workForegroundRunnable0.c.workerClassName + ") but did not provide ForegroundInfo");
                        }
                        Logger.get().debug("WM-WorkForegroundRunnab", "Updating notification for " + workForegroundRunnable0.c.workerClassName);
                        UUID uUID0 = workForegroundRunnable0.d.getId();
                        ListenableFuture listenableFuture1 = workForegroundRunnable0.e.setForegroundAsync(workForegroundRunnable0.b, uUID0, foregroundInfo0);
                        workForegroundRunnable0.a.setFuture(listenableFuture1);
                        return;
                    }
                    catch(Throwable throwable3) {
                    }
                    workForegroundRunnable0.a.setException(throwable3);
                }
                return;
            }
            case 11: {
                Task task0 = (Task)this.b;
                boolean z1 = task0.isCanceled();
                e e0 = (e)this.c;
                if(z1) {
                    e0.d.c();
                    return;
                }
                try {
                    object6 = e0.c.then(task0);
                }
                catch(RuntimeExecutionException runtimeExecutionException0) {
                    if(runtimeExecutionException0.getCause() instanceof Exception) {
                        e0.d.a(((Exception)runtimeExecutionException0.getCause()));
                        return;
                    }
                    e0.d.a(runtimeExecutionException0);
                    return;
                }
                catch(Exception exception0) {
                    e0.d.a(exception0);
                    return;
                }
                e0.d.b(object6);
                return;
            }
            case 12: {
                e e1 = (e)this.c;
                try {
                    task1 = (Task)e1.c.then(((Task)this.b));
                }
                catch(RuntimeExecutionException runtimeExecutionException1) {
                    if(runtimeExecutionException1.getCause() instanceof Exception) {
                        e1.d.a(((Exception)runtimeExecutionException1.getCause()));
                        return;
                    }
                    e1.d.a(runtimeExecutionException1);
                    return;
                }
                catch(Exception exception1) {
                    e1.d.a(exception1);
                    return;
                }
                if(task1 == null) {
                    e1.onFailure(new NullPointerException("Continuation returned null"));
                    return;
                }
                task1.addOnSuccessListener(TaskExecutors.a, e1);
                task1.addOnFailureListener(TaskExecutors.a, e1);
                task1.addOnCanceledListener(TaskExecutors.a, e1);
                return;
            }
            case 13: {
                this.a();
                return;
            }
            case 14: {
                this.b();
                return;
            }
            case 15: {
                this.c();
                return;
            }
            case 16: {
                g g1 = (g)this.c;
                try {
                    Object object7 = ((Task)this.b).getResult();
                    task2 = ((SuccessContinuation)g1.c).then(object7);
                }
                catch(RuntimeExecutionException runtimeExecutionException2) {
                    if(runtimeExecutionException2.getCause() instanceof Exception) {
                        g1.onFailure(((Exception)runtimeExecutionException2.getCause()));
                        return;
                    }
                    g1.onFailure(runtimeExecutionException2);
                    return;
                }
                catch(CancellationException unused_ex) {
                    g1.onCanceled();
                    return;
                }
                catch(Exception exception2) {
                    g1.onFailure(exception2);
                    return;
                }
                if(task2 == null) {
                    g1.onFailure(new NullPointerException("Continuation returned null"));
                    return;
                }
                task2.addOnSuccessListener(TaskExecutors.a, g1);
                task2.addOnFailureListener(TaskExecutors.a, g1);
                task2.addOnCanceledListener(TaskExecutors.a, g1);
                return;
            }
            case 17: {
                com.google.android.gms.tasks.k k0 = (com.google.android.gms.tasks.k)this.b;
                try {
                    k0.b(((Callable)this.c).call());
                }
                catch(Exception exception3) {
                    k0.a(exception3);
                }
                catch(Throwable throwable4) {
                    k0.a(new RuntimeException(throwable4));
                }
                return;
            }
            case 18: {
                CrashlyticsCore.a(((CrashlyticsCore)this.c), ((SettingsProvider)this.b));
                return;
            }
            case 19: {
                try {
                    ((Task)((Callable)this.b).call()).continueWith(new com.google.firebase.crashlytics.internal.common.g(this, 3));
                }
                catch(Exception exception4) {
                    ((TaskCompletionSource)this.c).setException(exception4);
                }
                return;
            }
            case 20: {
                ((gd.e)this.c).b.onError(((Throwable)this.b));
                return;
            }
            case 21: {
                ((gd.e)this.b).b.onSuccess(this.c);
                return;
            }
            case 22: {
                ((c1)this.b).a.onNext(this.c);
                return;
            }
            case 23: {
                ((t6)this.c).d0(((UnicastProcessor)this.b));
                return;
            }
            case 24: {
                ((MaybeSource)this.c).subscribe(((y)this.b));
                return;
            }
            case 25: {
                Disposable disposable0 = ((ExecutorScheduler)this.c).scheduleDirect(((f)this.b));
                ((f)this.b).b.replace(disposable0);
                return;
            }
            case 26: {
                try {
                    ((Runnable)this.c).run();
                }
                finally {
                    ((CompletableObserver)this.b).onComplete();
                }
                return;
            }
            case 27: {
                ((io.reactivex.internal.schedulers.y)this.b).d = true;
                ((z)this.c).a.remove(((io.reactivex.internal.schedulers.y)this.b));
                return;
            }
            case 28: {
                SettableFuture settableFuture1 = (SettableFuture)this.b;
                try {
                    settableFuture1.set(((Worker)this.c).getForegroundInfo());
                }
                catch(Throwable throwable5) {
                    settableFuture1.setException(throwable5);
                }
                return;
            }
            default: {
                ((kd.e)this.c).b.c.remove(((kd.f)this.b));
            }
        }
    }
}


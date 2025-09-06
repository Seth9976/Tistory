package androidx.emoji2.text;

import a7.b;
import android.content.Intent;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.d;
import androidx.room.QueryInterceptorDatabase;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkRequest;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerUpdater;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.EnhancedIntentService;
import g3.q;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.h;

public final class k implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public k(Object object0, Object object1, int v, Object object2) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        this.d = object2;
        super();
    }

    @Override
    public final void run() {
        boolean z;
        switch(this.a) {
            case 0: {
                MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0 = (MetadataRepoLoaderCallback)this.c;
                ThreadPoolExecutor threadPoolExecutor0 = (ThreadPoolExecutor)this.d;
                m m0 = (m)this.b;
                m0.getClass();
                try {
                    FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig0 = DefaultEmojiCompatConfig.create(m0.a);
                    if(fontRequestEmojiCompatConfig0 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    fontRequestEmojiCompatConfig0.setLoadingExecutor(threadPoolExecutor0);
                    fontRequestEmojiCompatConfig0.getMetadataRepoLoader().load(new l(emojiCompat$MetadataRepoLoaderCallback0, threadPoolExecutor0));
                    return;
                }
                catch(Throwable throwable0) {
                }
                emojiCompat$MetadataRepoLoaderCallback0.onFailed(throwable0);
                threadPoolExecutor0.shutdown();
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((QueryInterceptorDatabase)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((String)this.c), "$query");
                Intrinsics.checkNotNullParameter(((Object[])this.d), "$bindArgs");
                List list0 = ArraysKt___ArraysKt.toList(((Object[])this.d));
                ((QueryInterceptorDatabase)this.b).c.onQuery(((String)this.c), list0);
                return;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((QueryInterceptorDatabase)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((String)this.c), "$sql");
                Intrinsics.checkNotNullParameter(((List)this.d), "$inputArguments");
                ((QueryInterceptorDatabase)this.b).c.onQuery(((String)this.c), ((List)this.d));
                return;
            }
            case 3: {
                Processor processor0 = (Processor)this.b;
                ListenableFuture listenableFuture0 = (ListenableFuture)this.c;
                WorkerWrapper workerWrapper0 = (WorkerWrapper)this.d;
                processor0.getClass();
                try {
                    z = ((Boolean)listenableFuture0.get()).booleanValue();
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                    z = true;
                }
                synchronized(processor0.k) {
                    WorkGenerationalId workGenerationalId0 = workerWrapper0.getWorkGenerationalId();
                    String s = workGenerationalId0.getWorkSpecId();
                    if(processor0.b(s) == workerWrapper0) {
                        processor0.a(s);
                    }
                    Logger.get().debug("WM-Processor", processor0.getClass().getSimpleName() + " " + s + " executed; reschedule = " + z);
                    for(Object object1: processor0.j) {
                        ((ExecutionListener)object1).onExecuted(workGenerationalId0, z);
                    }
                }
                return;
            }
            case 4: {
                WorkManagerImpl workManagerImpl0 = (WorkManagerImpl)this.c;
                Intrinsics.checkNotNullParameter(workManagerImpl0, "$this_updateWorkImpl");
                WorkRequest workRequest0 = (WorkRequest)this.d;
                Intrinsics.checkNotNullParameter(workRequest0, "$workRequest");
                SettableFuture settableFuture0 = (SettableFuture)this.b;
                if(!settableFuture0.isCancelled()) {
                    try {
                        Processor processor1 = workManagerImpl0.getProcessor();
                        Intrinsics.checkNotNullExpressionValue(processor1, "processor");
                        WorkDatabase workDatabase0 = workManagerImpl0.getWorkDatabase();
                        Intrinsics.checkNotNullExpressionValue(workDatabase0, "workDatabase");
                        Configuration configuration0 = workManagerImpl0.getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration0, "configuration");
                        List list1 = workManagerImpl0.getSchedulers();
                        Intrinsics.checkNotNullExpressionValue(list1, "schedulers");
                        settableFuture0.set(WorkerUpdater.a(processor1, workDatabase0, configuration0, list1, workRequest0.getWorkSpec(), workRequest0.getTags()));
                        return;
                    }
                    catch(Throwable throwable1) {
                        settableFuture0.setException(throwable1);
                    }
                }
                return;
            }
            case 5: {
                ((EnhancedIntentService)this.b).getClass();
                try {
                    ((EnhancedIntentService)this.b).handleIntent(((Intent)this.c));
                }
                finally {
                    ((TaskCompletionSource)this.d).setResult(null);
                }
                return;
            }
            case 6: {
                q q0 = (q)this.b;
                GnssMeasurementsEvent gnssMeasurementsEvent0 = (GnssMeasurementsEvent)this.d;
                if(q0.b == ((Executor)this.c)) {
                    q0.a.onGnssMeasurementsReceived(gnssMeasurementsEvent0);
                }
                return;
            }
            case 7: {
                GnssStatus gnssStatus0 = (GnssStatus)this.d;
                if(((d)this.b).b == ((Executor)this.c)) {
                    GnssStatusCompat.wrap(gnssStatus0);
                }
                return;
            }
            case 8: {
                h h0 = (h)((b)this.b).c;
                boolean z1 = h0.b.isCanceled();
                Callback callback0 = (Callback)this.c;
                if(z1) {
                    callback0.onFailure(h0, new IOException("Canceled"));
                    return;
                }
                callback0.onResponse(h0, ((Response)this.d));
                return;
            }
            default: {
                ((Callback)this.c).onFailure(((h)((b)this.b).c), ((Throwable)this.d));
            }
        }
    }
}


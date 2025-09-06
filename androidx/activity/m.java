package androidx.activity;

import android.content.Context;
import android.graphics.Typeface;
import android.location.Location;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.m0;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.splashscreen.SplashScreen.OnExitAnimationListener;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.fragment.app.strictmode.FragmentStrictMode.Policy;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.TransactionExecutor;
import androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper;
import androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper;
import androidx.window.layout.WindowLayoutInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.R.string;
import com.google.android.material.datepicker.h;
import com.google.android.material.datepicker.i0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.i;
import com.google.firebase.components.k;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.ImageDownload;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridAdapter.ImageGridCell;
import com.kakao.keditor.widget.extention.ItemTouchHelperCallback;
import com.kakao.tistory.presentation.view.editor.EditorFragment;
import g3.s;
import g3.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import l1.c;

public final class m implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public m(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override
    public final void run() {
        DeferredHandler deferred$DeferredHandler0;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((ComponentActivity)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((OnBackPressedDispatcher)this.c), "$dispatcher");
                ComponentActivity.access$addObserverForBackInvoker(((ComponentActivity)this.b), ((OnBackPressedDispatcher)this.c));
                return;
            }
            case 1: {
                ((m0)this.b).getClass();
                try {
                    ((Runnable)this.c).run();
                }
                finally {
                    ((m0)this.b).a();
                }
                return;
            }
            case 2: {
                ViewTransition viewTransition0 = (ViewTransition)this.b;
                int v2 = viewTransition0.p;
                View[] arr_view = (View[])this.c;
                if(v2 != -1) {
                    for(int v3 = 0; v3 < arr_view.length; ++v3) {
                        arr_view[v3].setTag(viewTransition0.p, System.nanoTime());
                    }
                }
                if(viewTransition0.q != -1) {
                    for(int v = 0; v < arr_view.length; ++v) {
                        arr_view[v].setTag(viewTransition0.q, null);
                    }
                }
                return;
            }
            case 3: {
                DispatchQueue dispatchQueue0 = (DispatchQueue)this.b;
                Intrinsics.checkNotNullParameter(dispatchQueue0, "this$0");
                Intrinsics.checkNotNullParameter(((Runnable)this.c), "$runnable");
                if(!dispatchQueue0.d.offer(((Runnable)this.c))) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                dispatchQueue0.drainQueue();
                return;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((MultiInstanceInvalidationClient)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((String[])this.c), "$tables");
                ((MultiInstanceInvalidationClient)this.b).getInvalidationTracker().notifyObserversByTableNames(((String[])Arrays.copyOf(((String[])this.c), ((String[])this.c).length)));
                return;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((Runnable)this.b), "$command");
                Intrinsics.checkNotNullParameter(((TransactionExecutor)this.c), "this$0");
                try {
                    ((Runnable)this.b).run();
                }
                finally {
                    ((TransactionExecutor)this.c).scheduleNext();
                }
                return;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((WindowLayoutChangeCallbackWrapper)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((WindowLayoutInfo)this.c), "$newLayoutInfo");
                ((WindowLayoutChangeCallbackWrapper)this.b).c.accept(((WindowLayoutInfo)this.c));
                return;
            }
            case 7: {
                WorkGenerationalId workGenerationalId0 = (WorkGenerationalId)this.c;
                synchronized(((Processor)this.b).k) {
                    for(Object object1: ((Processor)this.b).j) {
                        ((ExecutionListener)object1).onExecuted(workGenerationalId0, false);
                    }
                }
                return;
            }
            case 8: {
                if(((WorkerWrapper)this.b).q.isCancelled()) {
                    ((ListenableFuture)this.c).cancel(true);
                }
                return;
            }
            case 9: {
                Intrinsics.checkNotNullParameter(((List)this.b), "$listenersList");
                ConstraintTracker constraintTracker0 = (ConstraintTracker)this.c;
                Intrinsics.checkNotNullParameter(constraintTracker0, "this$0");
                for(Object object2: ((List)this.b)) {
                    ((ConstraintListener)object2).onConstraintChanged(constraintTracker0.e);
                }
                return;
            }
            case 10: {
                WorkForegroundRunnable workForegroundRunnable0 = (WorkForegroundRunnable)this.b;
                SettableFuture settableFuture0 = (SettableFuture)this.c;
                if(!workForegroundRunnable0.a.isCancelled()) {
                    settableFuture0.setFuture(workForegroundRunnable0.d.getForegroundInfoAsync());
                    return;
                }
                settableFuture0.cancel(true);
                return;
            }
            case 11: {
                ((FontCallback)this.b).onFontRetrieved(((Typeface)this.c));
                return;
            }
            case 12: {
                Context context0 = ((h)this.b).a.getContext();
                String s = context0.getString(string.mtrl_picker_invalid_format);
                String s1 = context0.getString(string.mtrl_picker_invalid_format_use);
                String s2 = context0.getString(string.mtrl_picker_invalid_format_example);
                Date date0 = new Date(i0.f().getTimeInMillis());
                String s3 = String.format(s2, ((h)this.b).c.format(date0).replace(' ', ' '));
                ((h)this.b).a.setError(s + "\n" + String.format(s1, ((String)this.c).replace(' ', ' ')) + "\n" + s3);
                ((h)this.b).a();
                return;
            }
            case 13: {
                k k0 = (k)this.b;
                Provider provider0 = (Provider)this.c;
                if(k0.b != k.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized(k0) {
                    deferred$DeferredHandler0 = k0.a;
                    k0.a = null;
                    k0.b = provider0;
                }
                deferred$DeferredHandler0.handle(provider0);
                return;
            }
            case 14: {
                i i0 = (i)this.b;
                Provider provider1 = (Provider)this.c;
                synchronized(i0) {
                    if(i0.b == null) {
                        i0.a.add(provider1);
                    }
                    else {
                        i0.b.add(provider1.get());
                    }
                }
                return;
            }
            case 15: {
                ((EventHandler)((Map.Entry)this.b).getKey()).handle(((Event)this.c));
                return;
            }
            case 16: {
                TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)this.c;
                ImageDownload imageDownload0 = (ImageDownload)this.b;
                imageDownload0.getClass();
                try {
                    taskCompletionSource0.setResult(imageDownload0.blockingDownload());
                }
                catch(Exception exception0) {
                    taskCompletionSource0.setException(exception0);
                }
                return;
            }
            case 17: {
                ImageGridCell.bind$lambda$0(((ImageGridCell)this.b), ((ImageGridCellItem)this.c));
                return;
            }
            case 18: {
                com.kakao.keditor.toolbar.KeditorToolbar.windowInsetsAnimationCallback.1.onStart$lambda$2$lambda$1(((EditText)this.b), ((KeditorView)this.c));
                return;
            }
            case 19: {
                ItemTouchHelperCallback.onFinishDrag$lambda$2(((ItemTouchHelperCallback)this.b), ((ViewHolder)this.c));
                return;
            }
            case 20: {
                Intrinsics.checkNotNullParameter(((Policy)this.b), "$policy");
                Intrinsics.checkNotNullParameter(((Violation)this.c), "$violation");
                ((Policy)this.b).getListener$fragment_release().onViolation(((Violation)this.c));
                return;
            }
            case 21: {
                Intrinsics.checkNotNullParameter(((Violation)this.c), "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String)this.b), ((Violation)this.c));
                throw (Violation)this.c;
            }
            case 22: {
                List list0 = (List)this.c;
                s s4 = ((v)this.b).a;
                if(s4 != null) {
                    s4.b.onLocationChanged(list0);
                }
                return;
            }
            case 23: {
                Location location0 = (Location)this.c;
                s s5 = ((v)this.b).a;
                if(s5 != null) {
                    s5.b.onLocationChanged(location0);
                }
                return;
            }
            case 24: {
                Intrinsics.checkNotNullParameter(((SplashScreenViewProvider)this.b), "$splashScreenViewProvider");
                Intrinsics.checkNotNullParameter(((OnExitAnimationListener)this.c), "$finalListener");
                ((SplashScreenViewProvider)this.b).getView().bringToFront();
                ((OnExitAnimationListener)this.c).onSplashScreenExit(((SplashScreenViewProvider)this.b));
                return;
            }
            case 25: {
                Intrinsics.checkNotNullParameter(((SplitListenerWrapper)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((ArrayList)this.c), "$splitsWithActivity");
                ((SplitListenerWrapper)this.b).c.accept(((ArrayList)this.c));
                return;
            }
            case 26: {
                c.a(((AndroidContentCaptureManager)this.b), ((LongSparseArray)this.c));
                return;
            }
            case 27: {
                Intrinsics.checkNotNullParameter(((TimeLimiter)this.b), "this$0");
                Intrinsics.checkNotNullParameter(((StartStopToken)this.c), "$token");
                ((TimeLimiter)this.b).b.stopWork(((StartStopToken)this.c), 3);
                return;
            }
            case 28: {
                ConstraintTrackingWorker constraintTrackingWorker0 = (ConstraintTrackingWorker)this.b;
                ListenableFuture listenableFuture0 = (ListenableFuture)this.c;
                Intrinsics.checkNotNullParameter(constraintTrackingWorker0, "this$0");
                Intrinsics.checkNotNullParameter(listenableFuture0, "$innerFuture");
                synchronized(constraintTrackingWorker0.f) {
                    if(constraintTrackingWorker0.g) {
                        Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                        ConstraintTrackingWorkerKt.access$setRetry(constraintTrackingWorker0.h);
                    }
                    else {
                        constraintTrackingWorker0.h.setFuture(listenableFuture0);
                    }
                }
                return;
            }
            default: {
                EditorFragment.a(((EditText)this.b), ((EditorFragment)this.c));
            }
        }
    }
}


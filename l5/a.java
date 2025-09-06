package l5;

import android.os.Bundle;
import androidx.work.Logger;
import androidx.work.impl.background.greedy.DelayedWorkTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.internal.LimitedDispatcher;
import q.d;
import retrofit2.o;

public final class a implements Runnable {
    public final int a;
    public Object b;
    public final Object c;

    public a(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    public a(Object object0, Object object1, boolean z, int v) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.c;
        switch(this.a) {
            case 0: {
                Logger logger0 = Logger.get();
                WorkSpec workSpec0 = (WorkSpec)this.b;
                logger0.debug("WM-DelayedWorkTracker", "Scheduling work " + workSpec0.id);
                ((DelayedWorkTracker)object0).a.schedule(new WorkSpec[]{workSpec0});
                return;
            }
            case 1: {
                ((d)object0).b.onMessageChannelReady(((Bundle)this.b));
                return;
            }
            case 2: {
                IntrinsicsKt__IntrinsicsJvmKt.intercepted(((o)this.b)).resumeWith(Result.constructor-impl(ResultKt.createFailure(((Throwable)object0))));
                return;
            }
            case 3: {
                ((CancellableContinuation)object0).resumeUndispatched(((ExecutorCoroutineDispatcherImpl)this.b), Unit.INSTANCE);
                return;
            }
            default: {
                int v = 0;
                while(true) {
                    try {
                        ((Runnable)this.b).run();
                    }
                    catch(Throwable throwable0) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, throwable0);
                    }
                    Runnable runnable0 = ((LimitedDispatcher)object0).a();
                    if(runnable0 == null) {
                        break;
                    }
                    this.b = runnable0;
                    ++v;
                    if(v >= 16 && ((LimitedDispatcher)object0).b.isDispatchNeeded(((LimitedDispatcher)object0))) {
                        ((LimitedDispatcher)object0).b.dispatch(((LimitedDispatcher)object0), this);
                        return;
                    }
                }
            }
        }
    }
}


package k5;

import androidx.work.CoroutineWorker;
import androidx.work.JobListenableFuture;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public JobListenableFuture o;
    public int p;
    public final JobListenableFuture q;
    public final CoroutineWorker r;

    public a(JobListenableFuture jobListenableFuture0, CoroutineWorker coroutineWorker0, Continuation continuation0) {
        this.q = jobListenableFuture0;
        this.r = coroutineWorker0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        JobListenableFuture jobListenableFuture1;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                JobListenableFuture jobListenableFuture0 = this.q;
                this.o = jobListenableFuture0;
                this.p = 1;
                Object object2 = this.r.getForegroundInfo(this);
                if(object2 == object1) {
                    return object1;
                }
                jobListenableFuture1 = jobListenableFuture0;
                object0 = object2;
                break;
            }
            case 1: {
                jobListenableFuture1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        jobListenableFuture1.complete(object0);
        return Unit.INSTANCE;
    }
}


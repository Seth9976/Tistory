package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause2;

public class a extends AbstractCoroutine implements BroadcastChannel, ProducerScope {
    public final BroadcastChannel d;

    public a(CoroutineContext coroutineContext0, BroadcastChannel broadcastChannel0, boolean z) {
        super(coroutineContext0, false, z);
        this.d = broadcastChannel0;
        this.initParentJob(((Job)coroutineContext0.get(Job.Key)));
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException0) {
        if(cancellationException0 == null) {
            cancellationException0 = new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this);
        }
        this.cancelInternal(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final boolean cancel(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new JobCancellationException(JobSupport.access$cancellationExceptionMessage(this), null, this);
        }
        this.cancelInternal(throwable0);
        return true;
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final void cancelInternal(Throwable throwable0) {
        CancellationException cancellationException0 = JobSupport.toCancellationException$default(this, throwable0, null, 1, null);
        this.d.cancel(cancellationException0);
        this.cancelCoroutine(cancellationException0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final boolean close(Throwable throwable0) {
        boolean z = this.d.close(throwable0);
        this.start();
        return z;
    }

    @Override  // kotlinx.coroutines.channels.ProducerScope
    public final SendChannel getChannel() {
        return this;
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final SelectClause2 getOnSend() {
        return this.d.getOnSend();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(Function1 function10) {
        this.d.invokeOnClose(function10);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return this.d.isClosedForSend();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object object0) {
        return this.d.offer(object0);
    }

    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(Throwable throwable0, boolean z) {
        if(!this.d.close(throwable0) && !z) {
            CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), throwable0);
        }
    }

    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final void onCompleted(Object object0) {
        Unit unit0 = (Unit)object0;
        DefaultImpls.close$default(this.d, null, 1, null);
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel openSubscription() {
        return this.d.openSubscription();
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final Object send(Object object0, Continuation continuation0) {
        return this.d.send(object0, continuation0);
    }

    @Override  // kotlinx.coroutines.channels.SendChannel
    public final Object trySend-JP2dKIU(Object object0) {
        return this.d.trySend-JP2dKIU(object0);
    }
}


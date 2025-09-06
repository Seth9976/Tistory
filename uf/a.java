package uf;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ActorScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelCoroutine;

public class a extends ChannelCoroutine implements ActorScope {
    public a(CoroutineContext coroutineContext0, Channel channel0, boolean z) {
        super(coroutineContext0, channel0, false, z);
        this.initParentJob(((Job)coroutineContext0.get(Job.Key)));
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final boolean handleJobException(Throwable throwable0) {
        CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), throwable0);
        return true;
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final void onCancelling(Throwable throwable0) {
        Channel channel0 = this.get_channel();
        CancellationException cancellationException0 = null;
        if(throwable0 != null) {
            if(throwable0 instanceof CancellationException) {
                cancellationException0 = (CancellationException)throwable0;
            }
            if(cancellationException0 == null) {
                cancellationException0 = ExceptionsKt.CancellationException((DebugStringsKt.getClassSimpleName(this) + " was cancelled"), throwable0);
            }
        }
        channel0.cancel(cancellationException0);
    }
}


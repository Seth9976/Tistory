package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

public final class f extends ChannelCoroutine implements ProducerScope {
    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(Throwable throwable0, boolean z) {
        if(!this.get_channel().close(throwable0) && !z) {
            CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), throwable0);
        }
    }

    @Override  // kotlinx.coroutines.AbstractCoroutine
    public final void onCompleted(Object object0) {
        Unit unit0 = (Unit)object0;
        DefaultImpls.close$default(this.get_channel(), null, 1, null);
    }
}


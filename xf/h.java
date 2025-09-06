package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import qd.a;

public class h extends ChannelFlow {
    public final Function2 a;

    public h(Function2 function20, CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        super(coroutineContext0, v, bufferOverflow0);
        this.a = function20;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope producerScope0, Continuation continuation0) {
        Unit unit0 = this.a.invoke(producerScope0, continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow create(CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return new h(this.a, coroutineContext0, v, bufferOverflow0);
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return "block[" + this.a + "] -> " + super.toString();
    }
}


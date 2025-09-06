package xf;

import g.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import qd.a;

public final class g extends ChannelFlow {
    public final ReceiveChannel a;
    public final boolean b;
    public static final AtomicIntegerFieldUpdater c;
    @Volatile
    private volatile int consumed;

    static {
        g.c = AtomicIntegerFieldUpdater.newUpdater(g.class, "consumed");
    }

    public g(ReceiveChannel receiveChannel0, boolean z) {
        this(receiveChannel0, z, EmptyCoroutineContext.INSTANCE, -3, BufferOverflow.SUSPEND);
    }

    public g(ReceiveChannel receiveChannel0, boolean z, CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        super(coroutineContext0, v, bufferOverflow0);
        this.a = receiveChannel0;
        this.b = z;
        this.consumed = 0;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String additionalToStringProps() {
        return "channel=" + this.a;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        if(this.capacity == -3) {
            boolean z = this.b;
            if(z && g.c.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object object0 = b.i(flowCollector0, this.a, z, continuation0);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        Object object1 = super.collect(flowCollector0, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(ProducerScope producerScope0, Continuation continuation0) {
        Object object0 = b.i(new SendingCollector(producerScope0), this.a, this.b, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow create(CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return new g(this.a, this.b, coroutineContext0, v, bufferOverflow0);
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow dropChannelOperators() {
        return new g(this.a, this.b);
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ReceiveChannel produceImpl(CoroutineScope coroutineScope0) {
        if(this.b && g.c.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.capacity == -3 ? this.a : super.produceImpl(coroutineScope0);
    }
}


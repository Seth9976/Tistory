package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import qd.a;

public final class a1 extends SuspendLambda implements Function2 {
    public ReceiveChannel o;
    public ChannelIterator p;
    public int q;
    public final Channel r;

    public a1(Channel channel0, Continuation continuation0) {
        this.r = channel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a1(this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ReceiveChannel receiveChannel0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                receiveChannel0 = this.r;
                try {
                    ChannelIterator channelIterator0 = receiveChannel0.iterator();
                    goto label_14;
                label_7:
                    channelIterator0 = this.p;
                    receiveChannel0 = this.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_23;
                        }
                        Unit unit0 = (Unit)channelIterator0.next();
                        GlobalSnapshotManager.b.set(false);
                        Snapshot.Companion.sendApplyNotifications();
                    label_14:
                        this.o = receiveChannel0;
                        this.p = channelIterator0;
                        this.q = 1;
                        object0 = channelIterator0.hasNext(this);
                        if(object0 != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_7;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
        throw throwable0;
    label_23:
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return Unit.INSTANCE;
    }
}


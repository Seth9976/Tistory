package uf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import qd.a;

public final class q extends ContinuationImpl {
    public Object o;
    public final BufferedChannel p;
    public int q;

    public q(BufferedChannel bufferedChannel0, Continuation continuation0) {
        this.p = bufferedChannel0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        Object object1 = BufferedChannel.l(this.p, this);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : ChannelResult.box-impl(object1);
    }
}


package uf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;

public final class j1 extends a {
    public Continuation e;

    @Override  // kotlinx.coroutines.channels.ChannelCoroutine
    public final boolean close(Throwable throwable0) {
        boolean z = super.close(throwable0);
        this.start();
        return z;
    }

    @Override  // kotlinx.coroutines.channels.ChannelCoroutine
    public final SelectClause2 getOnSend() {
        Intrinsics.checkNotNull(i1.a, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \'clauseObject\')] kotlin.Any, @[ParameterName(name = \'select\')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \'param\')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new SelectClause2Impl(this, ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(i1.a, 3)), super.getOnSend().getProcessResFunc(), null, 8, null);
    }

    public static final void n(j1 j10, SelectInstance selectInstance0, Object object0) {
        j10.onStart();
        j10.super.getOnSend().getRegFunc().invoke(j10, selectInstance0, object0);
    }

    @Override  // kotlinx.coroutines.channels.ChannelCoroutine
    public final boolean offer(Object object0) {
        this.start();
        return super.offer(object0);
    }

    @Override  // kotlinx.coroutines.JobSupport
    public final void onStart() {
        CancellableKt.startCoroutineCancellable(this.e, this);
    }

    @Override  // kotlinx.coroutines.channels.ChannelCoroutine
    public final Object send(Object object0, Continuation continuation0) {
        this.start();
        Object object1 = super.send(object0, continuation0);
        return object1 == qd.a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.channels.ChannelCoroutine
    public final Object trySend-JP2dKIU(Object object0) {
        this.start();
        return super.trySend-JP2dKIU(object0);
    }
}


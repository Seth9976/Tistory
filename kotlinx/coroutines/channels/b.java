package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import qd.a;

public final class b implements Waiter, ChannelIterator {
    public Object a;
    public CancellableContinuationImpl b;
    public final BufferedChannel c;

    public b(BufferedChannel bufferedChannel0) {
        this.c = bufferedChannel0;
        this.a = BufferedChannelKt.n;
    }

    public static final void a(b b0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = b0.b;
        Intrinsics.checkNotNull(cancellableContinuationImpl0);
        b0.b = null;
        b0.a = BufferedChannelKt.getCHANNEL_CLOSED();
        Throwable throwable0 = b0.c.getCloseCause();
        if(throwable0 == null) {
            cancellableContinuationImpl0.resumeWith(Boolean.FALSE);
            return;
        }
        cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
    }

    @Override  // kotlinx.coroutines.channels.ChannelIterator
    public final Object hasNext(Continuation continuation0) {
        Boolean boolean0;
        BufferedChannel bufferedChannel0 = this.c;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.h.get(bufferedChannel0);
        while(true) {
            if(bufferedChannel0.isClosedForReceive()) {
                this.a = BufferedChannelKt.getCHANNEL_CLOSED();
                Throwable throwable0 = bufferedChannel0.getCloseCause();
                if(throwable0 != null) {
                    throw throwable0;
                }
                return Boxing.boxBoolean(false);
            }
            long v = BufferedChannel.d.getAndIncrement(bufferedChannel0);
            long v1 = v / ((long)BufferedChannelKt.SEGMENT_SIZE);
            int v2 = (int)(v % ((long)BufferedChannelKt.SEGMENT_SIZE));
            if(channelSegment0.id != v1) {
                ChannelSegment channelSegment1 = bufferedChannel0.d(v1, channelSegment0);
                if(channelSegment1 == null) {
                    continue;
                }
                channelSegment0 = channelSegment1;
            }
            Object object0 = BufferedChannel.access$updateCellReceive(bufferedChannel0, channelSegment0, v2, v, null);
            if(object0 == BufferedChannelKt.k) {
                break;
            }
            if(object0 == BufferedChannelKt.m) {
                if(v >= bufferedChannel0.getSendersCounter$kotlinx_coroutines_core()) {
                    continue;
                }
                channelSegment0.cleanPrev();
                continue;
            }
            if(object0 == BufferedChannelKt.l) {
                BufferedChannel bufferedChannel1 = this.c;
                CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0));
                try {
                    Function1 function10 = null;
                    this.b = cancellableContinuationImpl0;
                    Object object1 = BufferedChannel.access$updateCellReceive(bufferedChannel1, channelSegment0, v2, v, this);
                    if(object1 == BufferedChannelKt.k) {
                        BufferedChannel.access$prepareReceiverForSuspension(bufferedChannel1, this, channelSegment0, v2);
                    }
                    else {
                        if(object1 == BufferedChannelKt.m) {
                            if(v < bufferedChannel1.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment0.cleanPrev();
                            }
                            ChannelSegment channelSegment2 = (ChannelSegment)BufferedChannel.h.get(bufferedChannel1);
                            while(!bufferedChannel1.isClosedForReceive()) {
                                long v3 = BufferedChannel.d.getAndIncrement(bufferedChannel1);
                                long v4 = v3 / ((long)BufferedChannelKt.SEGMENT_SIZE);
                                int v5 = (int)(v3 % ((long)BufferedChannelKt.SEGMENT_SIZE));
                                if(channelSegment2.id != v4) {
                                    ChannelSegment channelSegment3 = bufferedChannel1.d(v4, channelSegment2);
                                    if(channelSegment3 == null) {
                                        continue;
                                    }
                                    channelSegment2 = channelSegment3;
                                }
                                Object object2 = BufferedChannel.access$updateCellReceive(bufferedChannel1, channelSegment2, v5, v3, this);
                                if(object2 == BufferedChannelKt.k) {
                                    BufferedChannel.access$prepareReceiverForSuspension(bufferedChannel1, this, channelSegment2, v5);
                                    goto label_74;
                                }
                                if(object2 == BufferedChannelKt.m) {
                                    if(v3 >= bufferedChannel1.getSendersCounter$kotlinx_coroutines_core()) {
                                        continue;
                                    }
                                    channelSegment2.cleanPrev();
                                    continue;
                                }
                                if(object2 == BufferedChannelKt.l) {
                                    throw new IllegalStateException("unexpected");
                                }
                                channelSegment2.cleanPrev();
                                this.a = object2;
                                this.b = null;
                                boolean0 = Boxing.boxBoolean(true);
                                Function1 function11 = bufferedChannel1.onUndeliveredElement;
                                if(function11 != null) {
                                    function10 = OnUndeliveredElementKt.bindCancellationFun(function11, object2, cancellableContinuationImpl0.getContext());
                                }
                                goto label_67;
                            }
                            b.a(this);
                            goto label_74;
                        }
                        else {
                            channelSegment0.cleanPrev();
                            this.a = object1;
                            this.b = null;
                            boolean0 = Boxing.boxBoolean(true);
                            Function1 function12 = bufferedChannel1.onUndeliveredElement;
                            if(function12 != null) {
                                function10 = OnUndeliveredElementKt.bindCancellationFun(function12, object1, cancellableContinuationImpl0.getContext());
                            }
                        }
                    label_67:
                        cancellableContinuationImpl0.resume(boolean0, function10);
                    }
                }
                catch(Throwable throwable1) {
                    cancellableContinuationImpl0.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw throwable1;
                }
            label_74:
                Object object3 = cancellableContinuationImpl0.getResult();
                if(object3 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation0);
                }
                return object3;
            }
            channelSegment0.cleanPrev();
            this.a = object0;
            return Boxing.boxBoolean(true);
        }
        throw new IllegalStateException("unreachable");
    }

    @Override  // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(Segment segment0, int v) {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.b;
        if(cancellableContinuationImpl0 != null) {
            cancellableContinuationImpl0.invokeOnCancellation(segment0, v);
        }
    }

    @Override  // kotlinx.coroutines.channels.ChannelIterator
    public final Object next() {
        Object object0 = this.a;
        if(object0 == BufferedChannelKt.n) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = BufferedChannelKt.n;
        if(object0 == BufferedChannelKt.getCHANNEL_CLOSED()) {
            throw StackTraceRecoveryKt.recoverStackTrace(this.c.e());
        }
        return object0;
    }

    @Override  // kotlinx.coroutines.channels.ChannelIterator
    public final Object next(Continuation continuation0) {
        return DefaultImpls.next(this, continuation0);
    }
}


package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.EventLoop_commonKt;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import qd.a;
import uf.o1;
import uf.p1;
import uf.q1;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A;\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/channels/TickerMode;", "mode", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "ticker", "(JJLkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/TickerMode;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class TickerChannelsKt {
    public static final Object access$fixedDelayTicker(long v, long v1, SendChannel sendChannel0, Continuation continuation0) {
        SendChannel sendChannel1;
        o1 o10;
        if(continuation0 instanceof o1) {
            o10 = (o1)continuation0;
            int v2 = o10.r;
            if((v2 & 0x80000000) == 0) {
                o10 = new o1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o10.r = v2 ^ 0x80000000;
            }
        }
        else {
            o10 = new o1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = o10.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(o10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o10.p = sendChannel0;
                o10.o = v;
                o10.r = 1;
                if(DelayKt.delay(v1, o10) != object1) {
                    goto label_31;
                }
                break;
            }
            case 1: {
                v = o10.o;
                sendChannel0 = o10.p;
                ResultKt.throwOnFailure(object0);
                goto label_31;
            }
            case 2: {
                v = o10.o;
                sendChannel1 = o10.p;
                ResultKt.throwOnFailure(object0);
                goto label_36;
            }
            case 3: {
                v = o10.o;
                sendChannel1 = o10.p;
                ResultKt.throwOnFailure(object0);
                while(true) {
                    sendChannel0 = sendChannel1;
                label_31:
                    o10.p = sendChannel0;
                    o10.o = v;
                    o10.r = 2;
                    if(sendChannel0.send(Unit.INSTANCE, o10) == object1) {
                        break alab1;
                    }
                    sendChannel1 = sendChannel0;
                label_36:
                    o10.p = sendChannel1;
                    o10.o = v;
                    o10.r = 3;
                    if(DelayKt.delay(v, o10) != object1) {
                        continue;
                    }
                    break alab1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public static final Object access$fixedPeriodTicker(long v, long v1, SendChannel sendChannel0, Continuation continuation0) {
        SendChannel sendChannel1;
        long v4;
        long v3;
        long v5;
        long v8;
        SendChannel sendChannel3;
        long v6;
        p1 p10;
        if(continuation0 instanceof p1) {
            p10 = (p1)continuation0;
            int v2 = p10.s;
            if((v2 & 0x80000000) == 0) {
                p10 = new p1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p10.s = v2 ^ 0x80000000;
            }
        }
        else {
            p10 = new p1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = p10.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
                long v9 = (abstractTimeSource0 == null ? System.nanoTime() : abstractTimeSource0.nanoTime()) + EventLoop_commonKt.delayToNanos(v1);
                sendChannel3 = sendChannel0;
                p10.q = sendChannel3;
                p10.o = v;
                p10.p = v9;
                p10.s = 1;
                if(DelayKt.delay(v1, p10) != object1) {
                    v6 = v9;
                    v8 = EventLoop_commonKt.delayToNanos(v);
                    while(true) {
                    label_46:
                        long v10 = v6 + v8;
                        p10.q = sendChannel3;
                        p10.o = v10;
                        p10.p = v8;
                        p10.s = 2;
                        if(sendChannel3.send(Unit.INSTANCE, p10) == object1) {
                            break;
                        }
                        sendChannel1 = sendChannel3;
                        v3 = v8;
                        v4 = v10;
                    label_55:
                        AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
                        long v11 = abstractTimeSource1 == null ? System.nanoTime() : abstractTimeSource1.nanoTime();
                        long v12 = c.coerceAtLeast(v4 - v11, 0L);
                        if(v12 == 0L && v3 != 0L) {
                            long v13 = v3 - (v11 - v4) % v3;
                            v5 = v11 + v13;
                            p10.q = sendChannel1;
                            p10.o = v5;
                            p10.p = v3;
                            p10.s = 3;
                            if(DelayKt.delay(v13 / 1000000L, p10) == object1) {
                                return object1;
                            }
                        label_67:
                            v6 = v5;
                        }
                        else {
                            p10.q = sendChannel1;
                            p10.o = v4;
                            p10.p = v3;
                            p10.s = 4;
                            if(DelayKt.delay(v12 / 1000000L, p10) == object1) {
                                break;
                            }
                        label_76:
                            v6 = v4;
                        }
                        v8 = v3;
                        sendChannel3 = sendChannel1;
                    }
                }
                break;
            }
            case 1: {
                v6 = p10.p;
                long v7 = p10.o;
                SendChannel sendChannel2 = p10.q;
                ResultKt.throwOnFailure(object0);
                sendChannel3 = sendChannel2;
                v8 = EventLoop_commonKt.delayToNanos(v7);
                goto label_46;
            }
            case 2: {
                v3 = p10.p;
                v4 = p10.o;
                sendChannel1 = p10.q;
                ResultKt.throwOnFailure(object0);
                goto label_55;
            }
            case 3: {
                v3 = p10.p;
                v5 = p10.o;
                sendChannel1 = p10.q;
                ResultKt.throwOnFailure(object0);
                goto label_67;
            }
            case 4: {
                v3 = p10.p;
                v4 = p10.o;
                sendChannel1 = p10.q;
                ResultKt.throwOnFailure(object0);
                goto label_76;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    @ObsoleteCoroutinesApi
    @NotNull
    public static final ReceiveChannel ticker(long v, long v1, @NotNull CoroutineContext coroutineContext0, @NotNull TickerMode tickerMode0) {
        if(Long.compare(v, 0L) < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + v + " ms").toString());
        }
        if(v1 < 0L) {
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + v1 + " ms").toString());
        }
        CoroutineContext coroutineContext1 = Dispatchers.getUnconfined().plus(coroutineContext0);
        q1 q10 = new q1(tickerMode0, v, v1, null);
        return ProduceKt.produce(() -> EmptyCoroutineContext.INSTANCE, coroutineContext1, 0, q10);
    }

    public static ReceiveChannel ticker$default(long v, long v1, CoroutineContext coroutineContext0, TickerMode tickerMode0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = v;
        }
        if((v2 & 4) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v2 & 8) != 0) {
            tickerMode0 = TickerMode.FIXED_PERIOD;
        }
        return TickerChannelsKt.ticker(v, v1, coroutineContext0, tickerMode0);
    }
}


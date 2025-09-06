package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import uf.a0;
import uf.a1;
import uf.b0;
import uf.b1;
import uf.c0;
import uf.c1;
import uf.d0;
import uf.d1;
import uf.e0;
import uf.e1;
import uf.f0;
import uf.f1;
import uf.f;
import uf.g0;
import uf.g1;
import uf.h0;
import uf.i0;
import uf.j0;
import uf.k0;
import uf.l0;
import uf.m0;
import uf.n0;
import uf.o0;
import uf.p0;
import uf.q0;
import uf.r0;
import uf.s0;
import uf.t0;
import uf.t;
import uf.u0;
import uf.v0;
import uf.w0;
import uf.w;
import uf.x0;
import uf.x;
import uf.y0;
import uf.y;
import uf.z0;
import uf.z;

@Metadata(d1 = {"kotlinx/coroutines/channels/e"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class ChannelsKt {
    @NotNull
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object any(ReceiveChannel receiveChannel0, Continuation continuation0) {
        x x0;
        if(continuation0 instanceof x) {
            x0 = (x)continuation0;
            int v = x0.q;
            if((v & 0x80000000) == 0) {
                x0 = new x(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                x0.q = v ^ 0x80000000;
            }
        }
        else {
            x0 = new x(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = x0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    ChannelIterator channelIterator0 = receiveChannel0.iterator();
                    x0.o = receiveChannel0;
                    x0.q = 1;
                    object0 = channelIterator0.hasNext(x0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        receiveChannel0 = x0.o;
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return object0;
    }

    @PublishedApi
    public static final void cancelConsumed(@NotNull ReceiveChannel receiveChannel0, @Nullable Throwable throwable0) {
        CancellationException cancellationException0 = null;
        if(throwable0 != null) {
            if(throwable0 instanceof CancellationException) {
                cancellationException0 = (CancellationException)throwable0;
            }
            if(cancellationException0 == null) {
                cancellationException0 = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", throwable0);
            }
        }
        receiveChannel0.cancel(cancellationException0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @ObsoleteCoroutinesApi
    public static final Object consume(@NotNull BroadcastChannel broadcastChannel0, @NotNull Function1 function10) {
        ReceiveChannel receiveChannel0 = broadcastChannel0.openSubscription();
        try {
            return function10.invoke(receiveChannel0);
        }
        finally {
            DefaultImpls.cancel$default(receiveChannel0, null, 1, null);
        }
    }

    public static final Object consume(@NotNull ReceiveChannel receiveChannel0, @NotNull Function1 function10) {
        Object object0;
        try {
            object0 = function10.invoke(receiveChannel0);
        }
        catch(Throwable throwable0) {
            ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
            throw throwable0;
        }
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return object0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Nullable
    public static final Object consumeEach(@NotNull BroadcastChannel broadcastChannel0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        return e.a(broadcastChannel0, function10, continuation0);
    }

    @Nullable
    public static final Object consumeEach(@NotNull ReceiveChannel receiveChannel0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        return e.b(receiveChannel0, function10, continuation0);
    }

    @PublishedApi
    @NotNull
    public static final Function1 consumes(@NotNull ReceiveChannel receiveChannel0) {
        return new f(receiveChannel0, 1);
    }

    @PublishedApi
    @NotNull
    public static final Function1 consumesAll(@NotNull ReceiveChannel[] arr_receiveChannel) {
        return new h1(arr_receiveChannel, 15);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object count(ReceiveChannel receiveChannel0, Continuation continuation0) {
        Object object1;
        Throwable throwable1;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        IntRef ref$IntRef1;
        y y0;
        if(continuation0 instanceof y) {
            y0 = (y)continuation0;
            int v = y0.s;
            if((v & 0x80000000) == 0) {
                y0 = new y(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                y0.s = v ^ 0x80000000;
            }
        }
        else {
            y0 = new y(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = y0.r;
        Integer integer0 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(y0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                IntRef ref$IntRef0 = new IntRef();
                try {
                    ref$IntRef1 = ref$IntRef0;
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    goto label_31;
                }
                catch(Throwable throwable0) {
                    receiveChannel2 = receiveChannel0;
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = y0.q;
                    receiveChannel2 = y0.p;
                    ref$IntRef1 = y0.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_50;
                        }
                        channelIterator0.next();
                        ++ref$IntRef1.element;
                        receiveChannel1 = receiveChannel2;
                        try {
                        label_31:
                            y0.o = ref$IntRef1;
                            y0.p = receiveChannel1;
                            y0.q = channelIterator0;
                            y0.s = 1;
                            object1 = channelIterator0.hasNext(y0);
                        }
                        catch(Throwable throwable1) {
                            receiveChannel2 = receiveChannel1;
                            break alab1;
                        }
                        if(object1 == integer0) {
                            return integer0;
                        }
                        receiveChannel2 = receiveChannel1;
                        object0 = object1;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel2, throwable1);
            throw throwable2;
        }
    label_50:
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return Boxing.boxInt(ref$IntRef1.element);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel distinct(ReceiveChannel receiveChannel0) {
        return ChannelsKt.distinctBy$default(receiveChannel0, null, new z(2, null), 1, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    @PublishedApi
    @NotNull
    public static final ReceiveChannel distinctBy(@NotNull ReceiveChannel receiveChannel0, @NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        a0 a00 = new a0(receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, a00, 6, null);
    }

    public static ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel0, coroutineContext0, function20);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel drop(ReceiveChannel receiveChannel0, int v, CoroutineContext coroutineContext0) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        b0 b00 = new b0(receiveChannel0, v, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, b00, 6, null);
    }

    public static ReceiveChannel drop$default(ReceiveChannel receiveChannel0, int v, CoroutineContext coroutineContext0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.drop(receiveChannel0, v, coroutineContext0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel dropWhile(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        c0 c00 = new c0(receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, c00, 6, null);
    }

    public static ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.dropWhile(receiveChannel0, coroutineContext0, function20);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object elementAt(ReceiveChannel receiveChannel0, int v, Continuation continuation0) {
        Object object3;
        Object object2;
        ReceiveChannel receiveChannel1;
        ChannelIterator channelIterator1;
        int v3;
        int v2;
        ChannelIterator channelIterator0;
        d0 d00;
        if(continuation0 instanceof d0) {
            d00 = (d0)continuation0;
            int v1 = d00.t;
            if((v1 & 0x80000000) == 0) {
                d00 = new d0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                d00.t = v1 ^ 0x80000000;
            }
        }
        else {
            d00 = new d0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = d00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(d00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    if(v < 0) {
                        throw new IndexOutOfBoundsException("ReceiveChannel doesn\'t contain element at index " + v + '.');
                    }
                    channelIterator0 = receiveChannel0.iterator();
                    v2 = 0;
                    goto label_33;
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
            }
            case 1: {
                v3 = d00.p;
                v = d00.o;
                channelIterator1 = d00.r;
                receiveChannel1 = d00.q;
                ResultKt.throwOnFailure(object0);
                while(true) {
                label_24:
                    if(!((Boolean)object0).booleanValue()) {
                        throw new IndexOutOfBoundsException("ReceiveChannel doesn\'t contain element at index " + v + '.');
                    }
                    object2 = channelIterator1.next();
                    if(v == v3) {
                        break alab1;
                    }
                    goto label_30;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return object2;
    label_30:
        channelIterator0 = channelIterator1;
        receiveChannel0 = receiveChannel1;
        v2 = v3 + 1;
        try {
        label_33:
            d00.q = receiveChannel0;
            d00.r = channelIterator0;
            d00.o = v;
            d00.p = v2;
            d00.t = 1;
            object3 = channelIterator0.hasNext(d00);
        }
        catch(Throwable throwable0) {
            receiveChannel1 = receiveChannel0;
            throwable1 = throwable0;
            throw throwable1;
        }
        if(object3 != object1) {
            try {
                receiveChannel1 = receiveChannel0;
                v3 = v2;
                channelIterator1 = channelIterator0;
                object0 = object3;
                goto label_24;
            }
            catch(Throwable throwable1) {
            }
            try {
                throw throwable1;
            }
            catch(Throwable throwable2) {
                ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                throw throwable2;
            }
        }
        return object1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object elementAtOrNull(ReceiveChannel receiveChannel0, int v, Continuation continuation0) {
        Object object2;
        ChannelIterator channelIterator2;
        e0 e01;
        ReceiveChannel receiveChannel1;
        int v2;
        ChannelIterator channelIterator0;
        e0 e00;
        if(continuation0 instanceof e0) {
            e00 = (e0)continuation0;
            int v1 = e00.t;
            if((v1 & 0x80000000) == 0) {
                e00 = new e0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                e00.t = v1 ^ 0x80000000;
            }
        }
        else {
            e00 = new e0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = e00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(e00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(v >= 0) {
                    try {
                        channelIterator0 = receiveChannel0.iterator();
                        v2 = 0;
                        goto label_38;
                    }
                    catch(Throwable throwable0) {
                        goto label_51;
                    }
                }
                break;
            }
            case 1: {
                int v3 = e00.p;
                v = e00.o;
                ChannelIterator channelIterator1 = e00.r;
                receiveChannel1 = e00.q;
                ResultKt.throwOnFailure(object0);
                v2 = v3;
                receiveChannel0 = receiveChannel1;
                e01 = e00;
                channelIterator2 = channelIterator1;
                try {
                    while(true) {
                    label_30:
                        if(!((Boolean)object0).booleanValue()) {
                            break alab1;
                        }
                        object2 = channelIterator2.next();
                        if(v == v2) {
                            break;
                        }
                        goto label_35;
                    }
                }
                catch(Throwable throwable0) {
                    goto label_51;
                }
                ChannelsKt.cancelConsumed(receiveChannel0, null);
                return object2;
            label_35:
                channelIterator0 = channelIterator2;
                e00 = e01;
                ++v2;
                try {
                label_38:
                    e00.q = receiveChannel0;
                    e00.r = channelIterator0;
                    e00.o = v;
                    e00.p = v2;
                    e00.t = 1;
                    Object object3 = channelIterator0.hasNext(e00);
                    if(object3 == object1) {
                        return object1;
                    }
                    channelIterator2 = channelIterator0;
                    object0 = object3;
                    e01 = e00;
                    goto label_30;
                }
                catch(Throwable throwable0) {
                label_51:
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                    throw throwable2;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return null;
    }

    @PublishedApi
    @NotNull
    public static final ReceiveChannel filter(@NotNull ReceiveChannel receiveChannel0, @NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        f0 f00 = new f0(receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, f00, 6, null);
    }

    public static ReceiveChannel filter$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel0, coroutineContext0, function20);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel filterIndexed(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function3 function30) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        g0 g00 = new g0(receiveChannel0, function30, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, g00, 6, null);
    }

    public static ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filterIndexed(receiveChannel0, coroutineContext0, function30);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel filterNot(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20) {
        return ChannelsKt.filter(receiveChannel0, coroutineContext0, new h0(function20, null));
    }

    public static ReceiveChannel filterNot$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filterNot(receiveChannel0, coroutineContext0, function20);
    }

    @PublishedApi
    @NotNull
    public static final ReceiveChannel filterNotNull(@NotNull ReceiveChannel receiveChannel0) {
        ReceiveChannel receiveChannel1 = ChannelsKt.filter$default(receiveChannel0, null, new i0(2, null), 1, null);  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        Intrinsics.checkNotNull(receiveChannel1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return receiveChannel1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object filterNotNullTo(ReceiveChannel receiveChannel0, Collection collection0, Continuation continuation0) {
        Collection collection3;
        Throwable throwable1;
        Collection collection2;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        j0 j00;
        if(continuation0 instanceof j0) {
            j00 = (j0)continuation0;
            int v = j00.s;
            if((v & 0x80000000) == 0) {
                j00 = new j0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                j00.s = v ^ 0x80000000;
            }
        }
        else {
            j00 = new j0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = j00.r;
        Collection collection1 = a.getCOROUTINE_SUSPENDED();
        switch(j00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    collection2 = collection0;
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = j00.q;
                    receiveChannel1 = j00.p;
                    collection3 = j00.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_45;
                        }
                        Object object1 = channelIterator0.next();
                        if(object1 != null) {
                            collection3.add(object1);
                        }
                        collection2 = collection3;
                    label_30:
                        j00.o = collection2;
                        j00.p = receiveChannel1;
                        j00.q = channelIterator0;
                        j00.s = 1;
                        Object object2 = channelIterator0.hasNext(j00);
                        if(object2 == collection1) {
                            return collection1;
                        }
                        collection3 = collection2;
                        object0 = object2;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_45:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return collection3;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object filterNotNullTo(ReceiveChannel receiveChannel0, SendChannel sendChannel0, Continuation continuation0) {
        Object object1;
        SendChannel sendChannel2;
        ReceiveChannel receiveChannel1;
        ChannelIterator channelIterator1;
        ChannelIterator channelIterator0;
        SendChannel sendChannel1;
        Object object0;
        k0 k00;
        if(continuation0 instanceof k0) {
            k00 = (k0)continuation0;
            int v = k00.s;
            if((v & 0x80000000) == 0) {
                k00 = new k0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                k00.s = v ^ 0x80000000;
            }
        }
        else {
            k00 = new k0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        object0 = k00.r;
        sendChannel1 = a.getCOROUTINE_SUSPENDED();
        switch(k00.s) {
            case 0: {
                goto label_13;
            }
            case 1: {
                goto label_16;
            }
            case 2: {
                goto label_21;
            }
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            channelIterator0 = receiveChannel0.iterator();
            goto label_28;
        }
        catch(Throwable throwable1) {
            receiveChannel1 = receiveChannel0;
            throwable0 = throwable1;
            break;
        }
    label_16:
        channelIterator1 = k00.q;
        receiveChannel1 = k00.p;
        sendChannel2 = k00.o;
        ResultKt.throwOnFailure(object0);
        goto label_43;
    label_21:
        channelIterator1 = k00.q;
        receiveChannel1 = k00.p;
        sendChannel2 = k00.o;
        ResultKt.throwOnFailure(object0);
        while(true) {
            channelIterator0 = channelIterator1;
            receiveChannel0 = receiveChannel1;
            sendChannel0 = sendChannel2;
            try {
            label_28:
                k00.o = sendChannel0;
                k00.p = receiveChannel0;
                k00.q = channelIterator0;
                k00.s = 1;
                object1 = channelIterator0.hasNext(k00);
            }
            catch(Throwable throwable1) {
                receiveChannel1 = receiveChannel0;
                throwable0 = throwable1;
                break;
            }
            if(object1 == sendChannel1) {
                return sendChannel1;
            }
            receiveChannel1 = receiveChannel0;
            channelIterator1 = channelIterator0;
            object0 = object1;
            sendChannel2 = sendChannel0;
            try {
            label_43:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_57;
                }
                Object object2 = channelIterator1.next();
                if(object2 == null) {
                    continue;
                }
                k00.o = sendChannel2;
                k00.p = receiveChannel1;
                k00.q = channelIterator1;
                k00.s = 2;
                if(sendChannel2.send(object2, k00) == sendChannel1) {
                    return sendChannel1;
                }
            }
            catch(Throwable throwable0) {
                break;
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable0);
            throw throwable2;
        }
    label_57:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return sendChannel2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object first(ReceiveChannel receiveChannel0, Continuation continuation0) {
        ChannelIterator channelIterator1;
        Throwable throwable1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        l0 l00;
        if(continuation0 instanceof l0) {
            l00 = (l0)continuation0;
            int v = l00.r;
            if((v & 0x80000000) == 0) {
                l00 = new l0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l00.r = v ^ 0x80000000;
            }
        }
        else {
            l00 = new l0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    l00.o = receiveChannel0;
                    l00.p = channelIterator0;
                    l00.r = 1;
                    object2 = channelIterator0.hasNext(l00);
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                if(object2 != object1) {
                    receiveChannel1 = receiveChannel0;
                    channelIterator1 = channelIterator0;
                    object0 = object2;
                    goto label_32;
                }
                break;
            }
            case 1: {
                try {
                    channelIterator1 = l00.p;
                    receiveChannel1 = l00.o;
                    ResultKt.throwOnFailure(object0);
                label_32:
                    if(!((Boolean)object0).booleanValue()) {
                        throw new NoSuchElementException("ReceiveChannel is empty.");
                    }
                    object1 = channelIterator1.next();
                    goto label_41;
                }
                catch(Throwable throwable1) {
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                    throw throwable2;
                }
            label_41:
                ChannelsKt.cancelConsumed(receiveChannel1, null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object firstOrNull(ReceiveChannel receiveChannel0, Continuation continuation0) {
        Object object3;
        ChannelIterator channelIterator1;
        Throwable throwable1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        m0 m00;
        if(continuation0 instanceof m0) {
            m00 = (m0)continuation0;
            int v = m00.r;
            if((v & 0x80000000) == 0) {
                m00 = new m0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                m00.r = v ^ 0x80000000;
            }
        }
        else {
            m00 = new m0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = m00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    m00.o = receiveChannel0;
                    m00.p = channelIterator0;
                    m00.r = 1;
                    object2 = channelIterator0.hasNext(m00);
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    break;
                }
                if(object2 != object1) {
                    receiveChannel1 = receiveChannel0;
                    channelIterator1 = channelIterator0;
                    object0 = object2;
                    goto label_33;
                }
                return object1;
            }
            case 1: {
                try {
                    channelIterator1 = m00.p;
                    receiveChannel1 = m00.o;
                    ResultKt.throwOnFailure(object0);
                label_33:
                    if(((Boolean)object0).booleanValue()) {
                        object3 = channelIterator1.next();
                        goto label_41;
                    }
                    goto label_43;
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_41:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return object3;
    label_43:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return null;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel flatMap(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        n0 n00 = new n0(receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, n00, 6, null);
    }

    public static ReceiveChannel flatMap$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.flatMap(receiveChannel0, coroutineContext0, function20);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object indexOf(ReceiveChannel receiveChannel0, Object object0, Continuation continuation0) {
        Throwable throwable1;
        Object object2;
        IntRef ref$IntRef1;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        o0 o00;
        if(continuation0 instanceof o0) {
            o00 = (o0)continuation0;
            int v = o00.t;
            if((v & 0x80000000) == 0) {
                o00 = new o0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o00.t = v ^ 0x80000000;
            }
        }
        else {
            o00 = new o0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object1 = o00.s;
        Integer integer0 = a.getCOROUTINE_SUSPENDED();
        switch(o00.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                IntRef ref$IntRef0 = new IntRef();
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    ref$IntRef1 = ref$IntRef0;
                    object2 = object0;
                    goto label_32;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = o00.r;
                    receiveChannel1 = o00.q;
                    ref$IntRef1 = o00.p;
                    Object object3 = o00.o;
                    ResultKt.throwOnFailure(object1);
                    while(true) {
                        if(!((Boolean)object1).booleanValue()) {
                            goto label_52;
                        }
                        if(!Intrinsics.areEqual(object3, channelIterator0.next())) {
                            ++ref$IntRef1.element;
                            object2 = object3;
                        label_32:
                            o00.o = object2;
                            o00.p = ref$IntRef1;
                            o00.q = receiveChannel1;
                            o00.r = channelIterator0;
                            o00.t = 1;
                            Object object4 = channelIterator0.hasNext(o00);
                            if(object4 == integer0) {
                                return integer0;
                            }
                            object3 = object2;
                            object1 = object4;
                            continue;
                        }
                        integer0 = Boxing.boxInt(ref$IntRef1.element);
                        goto label_50;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_50:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return integer0;
    label_52:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return Boxing.boxInt(-1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object last(ReceiveChannel receiveChannel0, Continuation continuation0) {
        Object object5;
        ReceiveChannel receiveChannel2;
        Object object4;
        ChannelIterator channelIterator2;
        Object object3;
        ChannelIterator channelIterator1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        p0 p00;
        if(continuation0 instanceof p0) {
            p00 = (p0)continuation0;
            int v = p00.s;
            if((v & 0x80000000) == 0) {
                p00 = new p0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p00.s = v ^ 0x80000000;
            }
        }
        else {
            p00 = new p0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = p00.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(p00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    p00.o = receiveChannel0;
                    p00.p = channelIterator0;
                    p00.s = 1;
                    object2 = channelIterator0.hasNext(p00);
                    if(object2 != object1) {
                        receiveChannel1 = receiveChannel0;
                        channelIterator1 = channelIterator0;
                        object0 = object2;
                        goto label_27;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                receiveChannel1 = receiveChannel0;
                channelIterator1 = channelIterator0;
                object0 = object2;
                goto label_27;
            }
            case 1: {
                channelIterator1 = p00.p;
                receiveChannel1 = p00.o;
                ResultKt.throwOnFailure(object0);
            label_27:
                if(!((Boolean)object0).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                object3 = channelIterator1.next();
                channelIterator2 = channelIterator1;
                receiveChannel0 = receiveChannel1;
                goto label_42;
            }
            case 2: {
                try {
                    object4 = p00.q;
                    channelIterator2 = p00.p;
                    receiveChannel2 = p00.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                    label_39:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_64;
                        }
                        object3 = channelIterator2.next();
                        receiveChannel0 = receiveChannel2;
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_58;
                }
                try {
                label_42:
                    p00.o = receiveChannel0;
                    p00.p = channelIterator2;
                    p00.q = object3;
                    p00.s = 2;
                    object5 = channelIterator2.hasNext(p00);
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                if(object5 == object1) {
                    break;
                }
                try {
                    receiveChannel2 = receiveChannel0;
                    object4 = object3;
                    object0 = object5;
                    goto label_39;
                }
                catch(Throwable throwable1) {
                label_58:
                    receiveChannel1 = receiveChannel2;
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                    throw throwable2;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    label_64:
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return object4;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object lastIndexOf(ReceiveChannel receiveChannel0, Object object0, Continuation continuation0) {
        Throwable throwable1;
        Object object2;
        IntRef ref$IntRef2;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        IntRef ref$IntRef1;
        q0 q00;
        if(continuation0 instanceof q0) {
            q00 = (q0)continuation0;
            int v = q00.u;
            if((v & 0x80000000) == 0) {
                q00 = new q0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                q00.u = v ^ 0x80000000;
            }
        }
        else {
            q00 = new q0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object1 = q00.t;
        Integer integer0 = a.getCOROUTINE_SUSPENDED();
        switch(q00.u) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                IntRef ref$IntRef0 = new IntRef();
                ref$IntRef0.element = -1;
                ref$IntRef1 = new IntRef();
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    ref$IntRef2 = ref$IntRef0;
                    object2 = object0;
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = q00.s;
                    receiveChannel1 = q00.r;
                    ref$IntRef1 = q00.q;
                    ref$IntRef2 = q00.p;
                    Object object3 = q00.o;
                    ResultKt.throwOnFailure(object1);
                    while(true) {
                        if(!((Boolean)object1).booleanValue()) {
                            goto label_53;
                        }
                        if(Intrinsics.areEqual(object3, channelIterator0.next())) {
                            ref$IntRef2.element = ref$IntRef1.element;
                        }
                        ++ref$IntRef1.element;
                        object2 = object3;
                    label_36:
                        q00.o = object2;
                        q00.p = ref$IntRef2;
                        q00.q = ref$IntRef1;
                        q00.r = receiveChannel1;
                        q00.s = channelIterator0;
                        q00.u = 1;
                        Object object4 = channelIterator0.hasNext(q00);
                        if(object4 == integer0) {
                            return integer0;
                        }
                        object3 = object2;
                        object1 = object4;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_53:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return Boxing.boxInt(ref$IntRef2.element);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object lastOrNull(ReceiveChannel receiveChannel0, Continuation continuation0) {
        Object object5;
        ReceiveChannel receiveChannel2;
        Object object4;
        ChannelIterator channelIterator2;
        Object object3;
        ChannelIterator channelIterator1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        r0 r00;
        if(continuation0 instanceof r0) {
            r00 = (r0)continuation0;
            int v = r00.s;
            if((v & 0x80000000) == 0) {
                r00 = new r0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r00.s = v ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r00.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r00.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    r00.o = receiveChannel0;
                    r00.p = channelIterator0;
                    r00.s = 1;
                    object2 = channelIterator0.hasNext(r00);
                    if(object2 != object1) {
                        receiveChannel1 = receiveChannel0;
                        channelIterator1 = channelIterator0;
                        object0 = object2;
                        goto label_27;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                receiveChannel1 = receiveChannel0;
                channelIterator1 = channelIterator0;
                object0 = object2;
                goto label_27;
            }
            case 1: {
                channelIterator1 = r00.p;
                receiveChannel1 = r00.o;
                ResultKt.throwOnFailure(object0);
            label_27:
                if(((Boolean)object0).booleanValue()) {
                    object3 = channelIterator1.next();
                    channelIterator2 = channelIterator1;
                    receiveChannel0 = receiveChannel1;
                    goto label_43;
                }
                ChannelsKt.cancelConsumed(receiveChannel1, null);
                return null;
            }
            case 2: {
                try {
                    object4 = r00.q;
                    channelIterator2 = r00.p;
                    receiveChannel2 = r00.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                    label_40:
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_65;
                        }
                        object3 = channelIterator2.next();
                        receiveChannel0 = receiveChannel2;
                        break;
                    }
                }
                catch(Throwable throwable1) {
                    goto label_59;
                }
                try {
                label_43:
                    r00.o = receiveChannel0;
                    r00.p = channelIterator2;
                    r00.q = object3;
                    r00.s = 2;
                    object5 = channelIterator2.hasNext(r00);
                }
                catch(Throwable throwable0) {
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                    throw throwable1;
                }
                if(object5 == object1) {
                    break;
                }
                try {
                    receiveChannel2 = receiveChannel0;
                    object4 = object3;
                    object0 = object5;
                    goto label_40;
                }
                catch(Throwable throwable1) {
                label_59:
                    receiveChannel1 = receiveChannel2;
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                    throw throwable2;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    label_65:
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return object4;
    }

    @PublishedApi
    @NotNull
    public static final ReceiveChannel map(@NotNull ReceiveChannel receiveChannel0, @NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        s0 s00 = new s0(receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, s00, 6, null);
    }

    public static ReceiveChannel map$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel0, coroutineContext0, function20);
    }

    @PublishedApi
    @NotNull
    public static final ReceiveChannel mapIndexed(@NotNull ReceiveChannel receiveChannel0, @NotNull CoroutineContext coroutineContext0, @NotNull Function3 function30) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        t0 t00 = new t0(receiveChannel0, function30, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, t00, 6, null);
    }

    public static ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel0, coroutineContext0, function30);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function3 function30) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel0, coroutineContext0, function30));
    }

    public static ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexedNotNull(receiveChannel0, coroutineContext0, function30);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel mapNotNull(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel0, coroutineContext0, function20));
    }

    public static ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapNotNull(receiveChannel0, coroutineContext0, function20);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object maxWith(ReceiveChannel receiveChannel0, Comparator comparator0, Continuation continuation0) {
        Object object5;
        u0 u01;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator2;
        Comparator comparator2;
        Object object3;
        Comparator comparator1;
        ChannelIterator channelIterator1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        u0 u00;
        if(continuation0 instanceof u0) {
            u00 = (u0)continuation0;
            int v = u00.t;
            if((v & 0x80000000) == 0) {
                u00 = new u0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                u00.t = v ^ 0x80000000;
            }
        }
        else {
            u00 = new u0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = u00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(u00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    u00.o = comparator0;
                    u00.p = receiveChannel0;
                    u00.q = channelIterator0;
                    u00.t = 1;
                    object2 = channelIterator0.hasNext(u00);
                    if(object2 != object1) {
                        goto label_21;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    goto label_70;
                }
            label_21:
                receiveChannel1 = receiveChannel0;
                channelIterator1 = channelIterator0;
                object0 = object2;
                comparator1 = comparator0;
                goto label_30;
            }
            case 1: {
                channelIterator1 = u00.q;
                receiveChannel1 = u00.p;
                comparator1 = u00.o;
                ResultKt.throwOnFailure(object0);
            label_30:
                if(((Boolean)object0).booleanValue()) {
                    object3 = channelIterator1.next();
                    comparator2 = comparator1;
                    channelIterator2 = channelIterator1;
                    receiveChannel0 = receiveChannel1;
                    goto label_57;
                }
                ChannelsKt.cancelConsumed(receiveChannel1, null);
                return null;
            }
            case 2: {
                try {
                    Object object4 = u00.r;
                    channelIterator2 = u00.q;
                    receiveChannel2 = u00.p;
                    comparator2 = u00.o;
                    ResultKt.throwOnFailure(object0);
                    u01 = u00;
                    object5 = object4;
                    receiveChannel0 = receiveChannel2;
                    break;
                }
                catch(Throwable throwable1) {
                    receiveChannel1 = receiveChannel2;
                    throw throwable1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            while(true) {
                if(!((Boolean)object0).booleanValue()) {
                    goto label_76;
                }
                object3 = channelIterator2.next();
                if(comparator2.compare(object5, object3) >= 0) {
                    object3 = object5;
                }
                u00 = u01;
            label_57:
                u00.o = comparator2;
                u00.p = receiveChannel0;
                u00.q = channelIterator2;
                u00.r = object3;
                u00.t = 2;
                Object object6 = channelIterator2.hasNext(u00);
                if(object6 == object1) {
                    return object1;
                }
                u01 = u00;
                object5 = object3;
                object0 = object6;
            }
        }
        catch(Throwable throwable0) {
        label_70:
            receiveChannel1 = receiveChannel0;
            throwable1 = throwable0;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_76:
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return object5;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object minWith(ReceiveChannel receiveChannel0, Comparator comparator0, Continuation continuation0) {
        Object object5;
        v0 v01;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator2;
        Comparator comparator2;
        Object object3;
        Comparator comparator1;
        ChannelIterator channelIterator1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        v0 v00;
        if(continuation0 instanceof v0) {
            v00 = (v0)continuation0;
            int v = v00.t;
            if((v & 0x80000000) == 0) {
                v00 = new v0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                v00.t = v ^ 0x80000000;
            }
        }
        else {
            v00 = new v0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = v00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(v00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    v00.o = comparator0;
                    v00.p = receiveChannel0;
                    v00.q = channelIterator0;
                    v00.t = 1;
                    object2 = channelIterator0.hasNext(v00);
                    if(object2 != object1) {
                        goto label_21;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    goto label_70;
                }
            label_21:
                receiveChannel1 = receiveChannel0;
                channelIterator1 = channelIterator0;
                object0 = object2;
                comparator1 = comparator0;
                goto label_30;
            }
            case 1: {
                channelIterator1 = v00.q;
                receiveChannel1 = v00.p;
                comparator1 = v00.o;
                ResultKt.throwOnFailure(object0);
            label_30:
                if(((Boolean)object0).booleanValue()) {
                    object3 = channelIterator1.next();
                    comparator2 = comparator1;
                    channelIterator2 = channelIterator1;
                    receiveChannel0 = receiveChannel1;
                    goto label_57;
                }
                ChannelsKt.cancelConsumed(receiveChannel1, null);
                return null;
            }
            case 2: {
                try {
                    Object object4 = v00.r;
                    channelIterator2 = v00.q;
                    receiveChannel2 = v00.p;
                    comparator2 = v00.o;
                    ResultKt.throwOnFailure(object0);
                    v01 = v00;
                    object5 = object4;
                    receiveChannel0 = receiveChannel2;
                    break;
                }
                catch(Throwable throwable1) {
                    receiveChannel1 = receiveChannel2;
                    throw throwable1;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            while(true) {
                if(!((Boolean)object0).booleanValue()) {
                    goto label_76;
                }
                object3 = channelIterator2.next();
                if(comparator2.compare(object5, object3) <= 0) {
                    object3 = object5;
                }
                v00 = v01;
            label_57:
                v00.o = comparator2;
                v00.p = receiveChannel0;
                v00.q = channelIterator2;
                v00.r = object3;
                v00.t = 2;
                Object object6 = channelIterator2.hasNext(v00);
                if(object6 == object1) {
                    return object1;
                }
                v01 = v00;
                object5 = object3;
                object0 = object6;
            }
        }
        catch(Throwable throwable0) {
        label_70:
            receiveChannel1 = receiveChannel0;
            throwable1 = throwable0;
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_76:
        ChannelsKt.cancelConsumed(receiveChannel0, null);
        return object5;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object none(ReceiveChannel receiveChannel0, Continuation continuation0) {
        w0 w00;
        if(continuation0 instanceof w0) {
            w00 = (w0)continuation0;
            int v = w00.q;
            if((v & 0x80000000) == 0) {
                w00 = new w0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                w00.q = v ^ 0x80000000;
            }
        }
        else {
            w00 = new w0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = w00.p;
        Boolean boolean0 = a.getCOROUTINE_SUSPENDED();
        switch(w00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    ChannelIterator channelIterator0 = receiveChannel0.iterator();
                    w00.o = receiveChannel0;
                    w00.q = 1;
                    object0 = channelIterator0.hasNext(w00);
                    if(object0 != boolean0) {
                        boolean0 = Boxing.boxBoolean(!((Boolean)object0).booleanValue());
                        goto label_20;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
                    throw throwable0;
                }
            label_20:
                ChannelsKt.cancelConsumed(receiveChannel0, null);
                return boolean0;
            }
            case 1: {
                try {
                    receiveChannel0 = w00.o;
                    ResultKt.throwOnFailure(object0);
                    boolean0 = Boxing.boxBoolean(!((Boolean)object0).booleanValue());
                }
                catch(Throwable throwable0) {
                    ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
                    throw throwable0;
                }
                ChannelsKt.cancelConsumed(receiveChannel0, null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return boolean0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of \'onReceiveCatching\'")
    public static final SelectClause1 onReceiveOrNull(ReceiveChannel receiveChannel0) {
        Intrinsics.checkNotNull(receiveChannel0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return receiveChannel0.getOnReceiveOrNull();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of \'receiveCatching\'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final Object receiveOrNull(ReceiveChannel receiveChannel0, Continuation continuation0) {
        Intrinsics.checkNotNull(receiveChannel0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return receiveChannel0.receiveOrNull(continuation0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel0) {
        return ChannelsKt.map$default(receiveChannel0, null, new x0(receiveChannel0, null), 1, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of \'trySendBlocking\'. Consider handling the result of \'trySendBlocking\' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final void sendBlocking(SendChannel sendChannel0, Object object0) {
        if(!ChannelResult.isSuccess-impl(sendChannel0.trySend-JP2dKIU(object0))) {
            BuildersKt.runBlocking$default(null, new t(sendChannel0, object0, null), 1, null);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object single(ReceiveChannel receiveChannel0, Continuation continuation0) {
        ReceiveChannel receiveChannel2;
        Object object4;
        Object object3;
        ChannelIterator channelIterator1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        y0 y00;
        if(continuation0 instanceof y0) {
            y00 = (y0)continuation0;
            int v = y00.r;
            if((v & 0x80000000) == 0) {
                y00 = new y0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                y00.r = v ^ 0x80000000;
            }
        }
        else {
            y00 = new y0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = y00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(y00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    y00.o = receiveChannel0;
                    y00.p = channelIterator0;
                    y00.r = 1;
                    object2 = channelIterator0.hasNext(y00);
                    if(object2 != object1) {
                        receiveChannel1 = receiveChannel0;
                        channelIterator1 = channelIterator0;
                        object0 = object2;
                        goto label_27;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_54;
                }
                receiveChannel1 = receiveChannel0;
                channelIterator1 = channelIterator0;
                object0 = object2;
                goto label_27;
            }
            case 1: {
                channelIterator1 = (ChannelIterator)y00.p;
                receiveChannel1 = y00.o;
                ResultKt.throwOnFailure(object0);
            label_27:
                if(!((Boolean)object0).booleanValue()) {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
                object3 = channelIterator1.next();
                y00.o = receiveChannel1;
                y00.p = object3;
                y00.r = 2;
                object4 = channelIterator1.hasNext(y00);
                if(object4 != object1) {
                    object1 = object3;
                    object0 = object4;
                    receiveChannel0 = receiveChannel1;
                    goto label_51;
                }
                break;
            }
            case 2: {
                try {
                    Object object5 = y00.p;
                    receiveChannel2 = y00.o;
                    ResultKt.throwOnFailure(object0);
                    object1 = object5;
                    receiveChannel0 = receiveChannel2;
                }
                catch(Throwable throwable1) {
                    receiveChannel1 = receiveChannel2;
                    throw throwable1;
                }
                try {
                label_51:
                    if(((Boolean)object0).booleanValue()) {
                        throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                    }
                    goto label_60;
                }
                catch(Throwable throwable0) {
                label_54:
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                    throw throwable2;
                }
            label_60:
                ChannelsKt.cancelConsumed(receiveChannel0, null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object singleOrNull(ReceiveChannel receiveChannel0, Continuation continuation0) {
        ReceiveChannel receiveChannel2;
        Object object4;
        Object object3;
        ChannelIterator channelIterator1;
        ReceiveChannel receiveChannel1;
        Object object2;
        ChannelIterator channelIterator0;
        z0 z00;
        if(continuation0 instanceof z0) {
            z00 = (z0)continuation0;
            int v = z00.r;
            if((v & 0x80000000) == 0) {
                z00 = new z0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                z00.r = v ^ 0x80000000;
            }
        }
        else {
            z00 = new z0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = z00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(z00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    channelIterator0 = receiveChannel0.iterator();
                    z00.o = receiveChannel0;
                    z00.p = channelIterator0;
                    z00.r = 1;
                    object2 = channelIterator0.hasNext(z00);
                    if(object2 != object1) {
                        receiveChannel1 = receiveChannel0;
                        channelIterator1 = channelIterator0;
                        object0 = object2;
                        goto label_27;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_55;
                }
                receiveChannel1 = receiveChannel0;
                channelIterator1 = channelIterator0;
                object0 = object2;
                goto label_27;
            }
            case 1: {
                channelIterator1 = (ChannelIterator)z00.p;
                receiveChannel1 = z00.o;
                ResultKt.throwOnFailure(object0);
            label_27:
                if(!((Boolean)object0).booleanValue()) {
                    ChannelsKt.cancelConsumed(receiveChannel1, null);
                    return null;
                }
                object3 = channelIterator1.next();
                z00.o = receiveChannel1;
                z00.p = object3;
                z00.r = 2;
                object4 = channelIterator1.hasNext(z00);
                if(object4 != object1) {
                    object1 = object3;
                    object0 = object4;
                    receiveChannel0 = receiveChannel1;
                    goto label_52;
                }
                break;
            }
            case 2: {
                try {
                    Object object5 = z00.p;
                    receiveChannel2 = z00.o;
                    ResultKt.throwOnFailure(object0);
                    object1 = object5;
                    receiveChannel0 = receiveChannel2;
                }
                catch(Throwable throwable1) {
                    receiveChannel1 = receiveChannel2;
                    throw throwable1;
                }
                try {
                label_52:
                    if(((Boolean)object0).booleanValue()) {
                        goto label_61;
                    }
                    goto label_63;
                }
                catch(Throwable throwable0) {
                label_55:
                    receiveChannel1 = receiveChannel0;
                    throwable1 = throwable0;
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                    ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
                    throw throwable2;
                }
            label_61:
                ChannelsKt.cancelConsumed(receiveChannel0, null);
                return null;
            label_63:
                ChannelsKt.cancelConsumed(receiveChannel0, null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel take(ReceiveChannel receiveChannel0, int v, CoroutineContext coroutineContext0) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        a1 a10 = new a1(receiveChannel0, v, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, a10, 6, null);
    }

    public static ReceiveChannel take$default(ReceiveChannel receiveChannel0, int v, CoroutineContext coroutineContext0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.take(receiveChannel0, v, coroutineContext0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel takeWhile(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        b1 b10 = new b1(receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, b10, 6, null);
    }

    public static ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.takeWhile(receiveChannel0, coroutineContext0, function20);
    }

    @PublishedApi
    @Nullable
    public static final Object toChannel(@NotNull ReceiveChannel receiveChannel0, @NotNull SendChannel sendChannel0, @NotNull Continuation continuation0) {
        Object object1;
        SendChannel sendChannel2;
        ReceiveChannel receiveChannel1;
        ChannelIterator channelIterator1;
        ChannelIterator channelIterator0;
        SendChannel sendChannel1;
        Object object0;
        c1 c10;
        if(continuation0 instanceof c1) {
            c10 = (c1)continuation0;
            int v = c10.s;
            if((v & 0x80000000) == 0) {
                c10 = new c1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                c10.s = v ^ 0x80000000;
            }
        }
        else {
            c10 = new c1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        object0 = c10.r;
        sendChannel1 = a.getCOROUTINE_SUSPENDED();
        switch(c10.s) {
            case 0: {
                goto label_13;
            }
            case 1: {
                goto label_16;
            }
            case 2: {
                goto label_21;
            }
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            channelIterator0 = receiveChannel0.iterator();
            goto label_28;
        }
        catch(Throwable throwable1) {
            receiveChannel1 = receiveChannel0;
            throwable0 = throwable1;
            break;
        }
    label_16:
        channelIterator1 = c10.q;
        receiveChannel1 = c10.p;
        sendChannel2 = c10.o;
        ResultKt.throwOnFailure(object0);
        goto label_43;
    label_21:
        channelIterator1 = c10.q;
        receiveChannel1 = c10.p;
        sendChannel2 = c10.o;
        ResultKt.throwOnFailure(object0);
        while(true) {
            channelIterator0 = channelIterator1;
            receiveChannel0 = receiveChannel1;
            sendChannel0 = sendChannel2;
            try {
            label_28:
                c10.o = sendChannel0;
                c10.p = receiveChannel0;
                c10.q = channelIterator0;
                c10.s = 1;
                object1 = channelIterator0.hasNext(c10);
            }
            catch(Throwable throwable1) {
                receiveChannel1 = receiveChannel0;
                throwable0 = throwable1;
                break;
            }
            if(object1 == sendChannel1) {
                return sendChannel1;
            }
            receiveChannel1 = receiveChannel0;
            channelIterator1 = channelIterator0;
            object0 = object1;
            sendChannel2 = sendChannel0;
            try {
            label_43:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_57;
                }
                Object object2 = channelIterator1.next();
                c10.o = sendChannel2;
                c10.p = receiveChannel1;
                c10.q = channelIterator1;
                c10.s = 2;
                if(sendChannel2.send(object2, c10) != sendChannel1) {
                    continue;
                }
                return sendChannel1;
            }
            catch(Throwable throwable0) {
                break;
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable0);
            throw throwable2;
        }
    label_57:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return sendChannel2;
    }

    @PublishedApi
    @Nullable
    public static final Object toCollection(@NotNull ReceiveChannel receiveChannel0, @NotNull Collection collection0, @NotNull Continuation continuation0) {
        Collection collection3;
        Throwable throwable1;
        Collection collection2;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        d1 d10;
        if(continuation0 instanceof d1) {
            d10 = (d1)continuation0;
            int v = d10.s;
            if((v & 0x80000000) == 0) {
                d10 = new d1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                d10.s = v ^ 0x80000000;
            }
        }
        else {
            d10 = new d1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = d10.r;
        Collection collection1 = a.getCOROUTINE_SUSPENDED();
        switch(d10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    collection2 = collection0;
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = d10.q;
                    receiveChannel1 = d10.p;
                    collection3 = d10.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_43;
                        }
                        collection3.add(channelIterator0.next());
                        collection2 = collection3;
                    label_28:
                        d10.o = collection2;
                        d10.p = receiveChannel1;
                        d10.q = channelIterator0;
                        d10.s = 1;
                        Object object1 = channelIterator0.hasNext(d10);
                        if(object1 == collection1) {
                            return collection1;
                        }
                        collection3 = collection2;
                        object0 = object1;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_43:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return collection3;
    }

    @Nullable
    public static final Object toList(@NotNull ReceiveChannel receiveChannel0, @NotNull Continuation continuation0) {
        Object object1;
        ReceiveChannel receiveChannel2;
        Throwable throwable1;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        List list3;
        List list2;
        w w0;
        if(continuation0 instanceof w) {
            w0 = (w)continuation0;
            int v = w0.t;
            if((v & 0x80000000) == 0) {
                w0 = new w(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                w0.t = v ^ 0x80000000;
            }
        }
        else {
            w0 = new w(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = w0.s;
        List list0 = a.getCOROUTINE_SUSPENDED();
        switch(w0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                List list1 = k.createListBuilder();
                try {
                    list2 = list1;
                    list3 = list2;
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    goto label_31;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    throw throwable1;
                }
            }
            case 1: {
                try {
                    channelIterator0 = w0.r;
                    receiveChannel2 = w0.q;
                    list2 = w0.p;
                    list3 = w0.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_51;
                        }
                        list2.add(channelIterator0.next());
                        receiveChannel1 = receiveChannel2;
                    label_31:
                        w0.o = list3;
                        w0.p = list2;
                        w0.q = receiveChannel1;
                        w0.r = channelIterator0;
                        w0.t = 1;
                        object1 = channelIterator0.hasNext(w0);
                        if(object1 == list0) {
                            return list0;
                        }
                        receiveChannel2 = receiveChannel1;
                        object0 = object1;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        receiveChannel1 = receiveChannel2;
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_51:
        ChannelsKt.cancelConsumed(receiveChannel2, null);
        return k.build(list3);
    }

    @PublishedApi
    @Nullable
    public static final Object toMap(@NotNull ReceiveChannel receiveChannel0, @NotNull Map map0, @NotNull Continuation continuation0) {
        Map map3;
        Throwable throwable1;
        Map map2;
        ChannelIterator channelIterator0;
        ReceiveChannel receiveChannel1;
        e1 e10;
        if(continuation0 instanceof e1) {
            e10 = (e1)continuation0;
            int v = e10.s;
            if((v & 0x80000000) == 0) {
                e10 = new e1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                e10.s = v ^ 0x80000000;
            }
        }
        else {
            e10 = new e1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = e10.r;
        Map map1 = a.getCOROUTINE_SUSPENDED();
        switch(e10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    receiveChannel1 = receiveChannel0;
                    channelIterator0 = receiveChannel0.iterator();
                    map2 = map0;
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    break;
                }
            }
            case 1: {
                try {
                    channelIterator0 = e10.q;
                    receiveChannel1 = e10.p;
                    map3 = e10.o;
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_44;
                        }
                        Pair pair0 = (Pair)channelIterator0.next();
                        map3.put(pair0.getFirst(), pair0.getSecond());
                        map2 = map3;
                    label_29:
                        e10.o = map2;
                        e10.p = receiveChannel1;
                        e10.q = channelIterator0;
                        e10.s = 1;
                        Object object1 = channelIterator0.hasNext(e10);
                        if(object1 == map1) {
                            return map1;
                        }
                        map3 = map2;
                        object0 = object1;
                    }
                }
                catch(Throwable throwable1) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            ChannelsKt.cancelConsumed(receiveChannel1, throwable1);
            throw throwable2;
        }
    label_44:
        ChannelsKt.cancelConsumed(receiveChannel1, null);
        return map3;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object toMap(ReceiveChannel receiveChannel0, Continuation continuation0) {
        return ChannelsKt.toMap(receiveChannel0, new LinkedHashMap(), continuation0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object toMutableList(ReceiveChannel receiveChannel0, Continuation continuation0) {
        return ChannelsKt.toCollection(receiveChannel0, new ArrayList(), continuation0);
    }

    @PublishedApi
    @Nullable
    public static final Object toMutableSet(@NotNull ReceiveChannel receiveChannel0, @NotNull Continuation continuation0) {
        return ChannelsKt.toCollection(receiveChannel0, new LinkedHashSet(), continuation0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object toSet(ReceiveChannel receiveChannel0, Continuation continuation0) {
        return ChannelsKt.toMutableSet(receiveChannel0, continuation0);
    }

    @NotNull
    public static final Object trySendBlocking(@NotNull SendChannel sendChannel0, Object object0) {
        Object object1 = sendChannel0.trySend-JP2dKIU(object0);
        if(!(object1 instanceof Failed)) {
            Unit unit0 = (Unit)object1;
            return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
        }
        return ((ChannelResult)BuildersKt.runBlocking$default(null, new d(sendChannel0, object0, null), 1, null)).unbox-impl();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel withIndex(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0) {
        Function1 function10 = ChannelsKt.consumes(receiveChannel0);
        f1 f10 = new f1(receiveChannel0, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, f10, 6, null);
    }

    public static ReceiveChannel withIndex$default(ReceiveChannel receiveChannel0, CoroutineContext coroutineContext0, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.withIndex(receiveChannel0, coroutineContext0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final ReceiveChannel zip(ReceiveChannel receiveChannel0, ReceiveChannel receiveChannel1) {
        return ChannelsKt.zip$default(receiveChannel0, receiveChannel1, null, g1.w, 2, null);
    }

    @PublishedApi
    @NotNull
    public static final ReceiveChannel zip(@NotNull ReceiveChannel receiveChannel0, @NotNull ReceiveChannel receiveChannel1, @NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) {
        Function1 function10 = ChannelsKt.consumesAll(new ReceiveChannel[]{receiveChannel0, receiveChannel1});
        uf.h1 h10 = new uf.h1(receiveChannel1, receiveChannel0, function20, null);
        return ProduceKt.produce$default(() -> EmptyCoroutineContext.INSTANCE, coroutineContext0, 0, null, function10, h10, 6, null);
    }

    public static ReceiveChannel zip$default(ReceiveChannel receiveChannel0, ReceiveChannel receiveChannel1, CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) {
        if((v & 2) != 0) {
            coroutineContext0 = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel0, receiveChannel1, coroutineContext0, function20);
    }
}


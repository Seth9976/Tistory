package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import uf.b;
import uf.c;
import uf.d;
import uf.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u000201B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ&\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\f0\u000F2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001A\u00020\f2\n\u0010\u0014\u001A\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000B\u001A\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u0019\u0010\u001E\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u001D\u0010\u001CJ\u000F\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0017\u0010*\u001A\u00028\u00008F¢\u0006\f\u0012\u0004\b(\u0010)\u001A\u0004\b&\u0010\'R\u0019\u0010-\u001A\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b,\u0010)\u001A\u0004\b+\u0010\'R\u0014\u0010.\u001A\u00020\u001A8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b.\u0010/\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00062"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "capacity", "<init>", "(I)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "cancelImpl$kotlinx_coroutines_core", "cancelImpl", "", "toString", "()Ljava/lang/String;", "l", "I", "getCapacity", "()I", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "getValueOrNull", "getValueOrNull$annotations", "valueOrNull", "isClosedForSend", "()Z", "uf/b", "uf/c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n15#2:415\n15#2:416\n15#2:420\n15#2:423\n15#2:429\n15#2:430\n15#2:436\n15#2:439\n15#2:440\n15#2:441\n766#3:417\n857#3,2:418\n1855#3,2:421\n1747#3,3:424\n1855#3,2:427\n1855#3,2:431\n766#3:433\n857#3,2:434\n1855#3,2:437\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n166#1:415\n188#1:416\n213#1:420\n237#1:423\n279#1:429\n331#1:430\n343#1:436\n355#1:439\n382#1:440\n394#1:441\n189#1:417\n189#1:418,2\n226#1:421,2\n242#1:424,3\n251#1:427,2\n333#1:431,2\n338#1:433\n338#1:434,2\n346#1:437,2\n*E\n"})
public final class BroadcastChannelImpl extends BufferedChannel implements BroadcastChannel {
    public final int l;
    public final ReentrantLock m;
    public List n;
    public Object o;
    public final HashMap p;

    public BroadcastChannelImpl(int v) {
        super(0, null);
        this.l = v;
        if(v < 1 && v != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + v + " was specified").toString());
        }
        this.m = new ReentrantLock();
        this.n = CollectionsKt__CollectionsKt.emptyList();
        this.o = BroadcastChannelKt.a;
        this.p = new HashMap();
    }

    public static final void access$removeSubscriber(BroadcastChannelImpl broadcastChannelImpl0, ReceiveChannel receiveChannel0) {
        ReentrantLock reentrantLock0 = broadcastChannelImpl0.m;
        reentrantLock0.lock();
        try {
            Iterable iterable0 = broadcastChannelImpl0.n;
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(((BufferedChannel)object0) != receiveChannel0) {
                    arrayList0.add(object0);
                }
            }
            broadcastChannelImpl0.n = arrayList0;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(@Nullable Throwable throwable0) {
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            for(Object object0: this.n) {
                ((BufferedChannel)object0).cancelImpl$kotlinx_coroutines_core(throwable0);
            }
            this.o = BroadcastChannelKt.a;
            return super.cancelImpl$kotlinx_coroutines_core(throwable0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable throwable0) {
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            for(Object object0: this.n) {
                ((BufferedChannel)object0).close(throwable0);
            }
            Iterable iterable0 = this.n;
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: iterable0) {
                if(((BufferedChannel)object1).hasElements$kotlinx_coroutines_core()) {
                    arrayList0.add(object1);
                }
            }
            this.n = arrayList0;
            return super.close(throwable0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public final int getCapacity() {
        return this.l;
    }

    public final Object getValue() {
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            if(this.isClosedForSend()) {
                Throwable throwable0 = this.getCloseCause();
                if(throwable0 == null) {
                    throwable0 = new IllegalStateException("This broadcast channel is closed");
                }
                throw throwable0;
            }
            if(this.o != BroadcastChannelKt.a) {
                return this.o;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("No value");
    }

    public static void getValue$annotations() {
    }

    @Nullable
    public final Object getValueOrNull() {
        Object object0 = null;
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            if(!this.isClosedForReceive() && this.o != BroadcastChannelKt.a) {
                object0 = this.o;
            }
            return object0;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public static void getValueOrNull$annotations() {
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        this.m.lock();
        try {
            return super.isClosedForSend();
        }
        finally {
            this.m.unlock();
        }
    }

    @Override  // kotlinx.coroutines.channels.BroadcastChannel
    @NotNull
    public ReceiveChannel openSubscription() {
        ReceiveChannel receiveChannel0;
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            receiveChannel0 = this.l == -1 ? new c(this) : new b(this);
            if(!this.isClosedForSend() || this.o != BroadcastChannelKt.a) {
                if(this.o != BroadcastChannelKt.a) {
                    ((BufferedChannel)receiveChannel0).trySend-JP2dKIU(this.getValue());
                }
                this.n = CollectionsKt___CollectionsKt.plus(this.n, receiveChannel0);
                goto label_10;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            reentrantLock0.unlock();
            throw throwable0;
        }
    label_10:
        reentrantLock0.unlock();
        return receiveChannel0;
        try {
        label_12:
            ((BufferedChannel)receiveChannel0).close(this.getCloseCause());
        }
        catch(Throwable throwable0) {
            reentrantLock0.unlock();
            throw throwable0;
        }
        reentrantLock0.unlock();
        return receiveChannel0;
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(@NotNull SelectInstance selectInstance0, @Nullable Object object0) {
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            Object object1 = this.p.remove(selectInstance0);
            if(object1 != null) {
                selectInstance0.selectInRegistrationPhase(object1);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(selectInstance0.getContext());
        d d0 = new d(this, object0, selectInstance0, null);
        BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, d0, 1, null);
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(Object object0, @NotNull Continuation continuation0) {
        Object object4;
        Iterator iterator0;
        Object object3;
        BroadcastChannelImpl broadcastChannelImpl0;
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.t;
            if((v & 0x80000000) == 0) {
                e0 = new e(this, continuation0);
            }
            else {
                e0.t = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(this, continuation0);
        }
        Object object1 = e0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(e0.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ReentrantLock reentrantLock0 = this.m;
                reentrantLock0.lock();
                try {
                    if(!this.isClosedForSend()) {
                        if(this.l == -1) {
                            this.o = object0;
                        }
                        List list0 = this.n;
                        broadcastChannelImpl0 = this;
                        object3 = object0;
                        iterator0 = list0.iterator();
                        goto label_37;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                throw this.getSendException();
            }
            case 1: {
                iterator0 = e0.q;
                object4 = e0.p;
                broadcastChannelImpl0 = e0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(!((Boolean)object1).booleanValue() && broadcastChannelImpl0.isClosedForSend()) {
                throw broadcastChannelImpl0.getSendException();
            }
            object3 = object4;
        label_37:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object5 = iterator0.next();
            e0.o = broadcastChannelImpl0;
            e0.p = object3;
            e0.q = iterator0;
            e0.t = 1;
            Object object6 = ((BufferedChannel)object5).sendBroadcast$kotlinx_coroutines_core(object3, e0);
            if(object6 == object2) {
                return object2;
            }
            object4 = object3;
            object1 = object6;
        }
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    @NotNull
    public String toString() {
        return (this.o == BroadcastChannelKt.a ? "" : "CONFLATED_ELEMENT=" + this.o + "; ") + "BROADCAST=<" + super.toString() + ">; SUBSCRIBERS=" + CollectionsKt___CollectionsKt.joinToString$default(this.n, ";", "<", ">", 0, null, null, 56, null);
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    @NotNull
    public Object trySend-JP2dKIU(Object object0) {
        ReentrantLock reentrantLock0 = this.m;
        reentrantLock0.lock();
        try {
            if(this.isClosedForSend()) {
                return super.trySend-JP2dKIU(object0);
            }
            Iterable iterable0 = this.n;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object2: iterable0) {
                    if(((BufferedChannel)object2).shouldSendSuspend$kotlinx_coroutines_core()) {
                        return ChannelResult.Companion.failure-PtdJZtk();
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(this.l == -1) {
                this.o = object0;
            }
            for(Object object4: this.n) {
                ((BufferedChannel)object4).trySend-JP2dKIU(object0);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
    }
}


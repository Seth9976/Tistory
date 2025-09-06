package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;
import md.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\"\b\u0002\u0010\n\u001A\u001C\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000B\u0010\fJ\u001B\u0010\u000E\u001A\u00020\b2\u0006\u0010\r\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u001B\u0010\u0012\u001A\u00020\u00102\u0006\u0010\r\u001A\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000FJ&\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\r\u001A\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001A\u001A\u00020\b2\n\u0010\u0018\u001A\u0006\u0012\u0002\b\u00030\u00172\b\u0010\r\u001A\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001E\u001A\u00020\u0010H\u0010¢\u0006\u0004\b\u001C\u0010\u001DR\u0014\u0010\u001F\u001A\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u001D\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "shouldSendSuspend", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
public class ConflatedBufferedChannel extends BufferedChannel {
    public final BufferOverflow l;

    public ConflatedBufferedChannel(int v, @NotNull BufferOverflow bufferOverflow0, @Nullable Function1 function10) {
        super(v, function10);
        this.l = bufferOverflow0;
        if(bufferOverflow0 == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if(v < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + v + " was specified").toString());
        }
    }

    public ConflatedBufferedChannel(int v, BufferOverflow bufferOverflow0, Function1 function10, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            function10 = null;
        }
        this(v, bufferOverflow0, function10);
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.l == BufferOverflow.DROP_OLDEST;
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(@NotNull SelectInstance selectInstance0, @Nullable Object object0) {
        Object object1 = this.trySend-JP2dKIU(object0);
        if(!(object1 instanceof Failed)) {
            Unit unit0 = (Unit)object1;
            selectInstance0.selectInRegistrationPhase(Unit.INSTANCE);
            return;
        }
        if(!(object1 instanceof Closed)) {
            throw new IllegalStateException("unreachable");
        }
        selectInstance0.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    @Nullable
    public Object send(Object object0, @NotNull Continuation continuation0) {
        if(this.u(object0, true) instanceof Closed) {
            Function1 function10 = this.onUndeliveredElement;
            if(function10 != null) {
                UndeliveredElementException undeliveredElementException0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function10, object0, null, 2, null);
                if(undeliveredElementException0 != null) {
                    b.addSuppressed(undeliveredElementException0, this.getSendException());
                    throw undeliveredElementException0;
                }
            }
            throw this.getSendException();
        }
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    @Nullable
    public Object sendBroadcast$kotlinx_coroutines_core(Object object0, @NotNull Continuation continuation0) {
        Object object1 = this.u(object0, true);
        if(!(object1 instanceof Failed)) {
            Unit unit0 = (Unit)object1;
            return Boxing.boxBoolean(true);
        }
        return Boxing.boxBoolean(false);
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override  // kotlinx.coroutines.channels.BufferedChannel
    @NotNull
    public Object trySend-JP2dKIU(Object object0) {
        return this.u(object0, false);
    }

    public final Object u(Object object0, boolean z) {
        ChannelSegment channelSegment2;
        int v4;
        long v2;
        if(this.l == BufferOverflow.DROP_LATEST) {
            Object object1 = super.trySend-JP2dKIU(object0);
            if(!ChannelResult.isSuccess-impl(object1) && !ChannelResult.isClosed-impl(object1)) {
                if(z) {
                    Function1 function10 = this.onUndeliveredElement;
                    if(function10 != null) {
                        UndeliveredElementException undeliveredElementException0 = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function10, object0, null, 2, null);
                        if(undeliveredElementException0 != null) {
                            throw undeliveredElementException0;
                        }
                    }
                }
                return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
            }
            return object1;
        }
        Symbol symbol0 = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment0 = (ChannelSegment)BufferedChannel.g.get(this);
    alab1:
        while(true) {
            long v = BufferedChannel.c.getAndIncrement(this);
            long v1 = v & 0xFFFFFFFFFFFFFFFL;
            boolean z1 = BufferedChannel.access$isClosedForSend0(this, v);
            v2 = (long)BufferedChannelKt.SEGMENT_SIZE;
            long v3 = v1 / v2;
            v4 = (int)(v1 % v2);
            if(channelSegment0.id == v3) {
            label_26:
                channelSegment2 = channelSegment0;
            }
            else {
                ChannelSegment channelSegment1 = BufferedChannel.access$findSegmentSend(this, v3, channelSegment0);
                if(channelSegment1 == null) {
                    if(!z1) {
                        continue;
                    }
                    goto label_41;
                }
                else {
                    channelSegment2 = channelSegment1;
                    goto label_27;
                }
                goto label_26;
            }
        label_27:
            switch(BufferedChannel.access$updateCellSend(this, channelSegment2, v4, object0, v1, symbol0, z1)) {
                case 0: {
                    channelSegment2.cleanPrev();
                    return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
                }
                case 1: {
                    return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
                }
                case 2: {
                    goto label_39;
                }
                case 3: {
                    throw new IllegalStateException("unexpected");
                }
                case 4: {
                    break alab1;
                }
                case 5: {
                    channelSegment2.cleanPrev();
                    channelSegment0 = channelSegment2;
                    break;
                }
                default: {
                    channelSegment0 = channelSegment2;
                    break;
                }
            }
        }
        if(v1 >= this.getReceiversCounter$kotlinx_coroutines_core()) {
            goto label_41;
        }
        channelSegment2.cleanPrev();
        goto label_41;
    label_39:
        if(z1) {
            channelSegment2.onSlotCleaned();
        label_41:
            Throwable throwable0 = this.getSendException();
            return ChannelResult.Companion.closed-JP2dKIU(throwable0);
        }
        Waiter waiter0 = symbol0 instanceof Waiter ? ((Waiter)symbol0) : null;
        if(waiter0 != null) {
            BufferedChannel.access$prepareSenderForSuspension(this, waiter0, channelSegment2, v4);
        }
        this.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(channelSegment2.id * v2 + ((long)v4));
        return ChannelResult.Companion.success-JP2dKIU(Unit.INSTANCE);
    }
}


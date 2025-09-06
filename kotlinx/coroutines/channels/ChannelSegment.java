package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.r1;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u000E\u0010\u0005\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0014\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001A\u00028\u00002\u0006\u0010\f\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u001A2\u0006\u0010\f\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0013J!\u0010\u001F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\b2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001AH\u0000\u00A2\u0006\u0004\b\u001E\u0010\u0010J+\u0010%\u001A\u00020\"2\u0006\u0010\f\u001A\u00020\b2\b\u0010 \u001A\u0004\u0018\u00010\u001A2\b\u0010!\u001A\u0004\u0018\u00010\u001AH\u0000\u00A2\u0006\u0004\b#\u0010$J#\u0010)\u001A\u0004\u0018\u00010\u001A2\u0006\u0010\f\u001A\u00020\b2\b\u0010&\u001A\u0004\u0018\u00010\u001AH\u0000\u00A2\u0006\u0004\b\'\u0010(J)\u0010.\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\b2\b\u0010+\u001A\u0004\u0018\u00010*2\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b.\u0010/J\u001D\u00101\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\b2\u0006\u00100\u001A\u00020\"\u00A2\u0006\u0004\b1\u00102R\u0017\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00068F\u00A2\u0006\u0006\u001A\u0004\b3\u00104R\u0014\u00107\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u00106R\u0013\u00109\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A088\u0002X\u0082\u0004\u00A8\u0006:"}, d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", "E", "Lkotlinx/coroutines/internal/Segment;", "", "id", "prev", "Lkotlinx/coroutines/channels/BufferedChannel;", "channel", "", "pointers", "<init>", "(JLkotlinx/coroutines/channels/ChannelSegment;Lkotlinx/coroutines/channels/BufferedChannel;I)V", "index", "element", "", "storeElement$kotlinx_coroutines_core", "(ILjava/lang/Object;)V", "storeElement", "getElement$kotlinx_coroutines_core", "(I)Ljava/lang/Object;", "getElement", "retrieveElement$kotlinx_coroutines_core", "retrieveElement", "cleanElement$kotlinx_coroutines_core", "(I)V", "cleanElement", "", "getState$kotlinx_coroutines_core", "getState", "value", "setState$kotlinx_coroutines_core", "setState", "from", "to", "", "casState$kotlinx_coroutines_core", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "casState", "update", "getAndSetState$kotlinx_coroutines_core", "(ILjava/lang/Object;)Ljava/lang/Object;", "getAndSetState", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "receiver", "onCancelledRequest", "(IZ)V", "getChannel", "()Lkotlinx/coroutines/channels/BufferedChannel;", "getNumberOfSlots", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
public final class ChannelSegment extends Segment {
    public final BufferedChannel d;
    public final AtomicReferenceArray e;

    public ChannelSegment(long v, @Nullable ChannelSegment channelSegment0, @Nullable BufferedChannel bufferedChannel0, int v1) {
        super(v, channelSegment0, v1);
        this.d = bufferedChannel0;
        this.e = new AtomicReferenceArray(BufferedChannelKt.SEGMENT_SIZE * 2);
    }

    public final boolean casState$kotlinx_coroutines_core(int v, @Nullable Object object0, @Nullable Object object1) {
        AtomicReferenceArray atomicReferenceArray0 = this.e;
        int v1 = v * 2 + 1;
        while(!atomicReferenceArray0.compareAndSet(v1, object0, object1)) {
            if(atomicReferenceArray0.get(v1) != object0) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final void cleanElement$kotlinx_coroutines_core(int v) {
        this.e.lazySet(v * 2, null);
    }

    @Nullable
    public final Object getAndSetState$kotlinx_coroutines_core(int v, @Nullable Object object0) {
        return this.e.getAndSet(v * 2 + 1, object0);
    }

    @NotNull
    public final BufferedChannel getChannel() {
        Intrinsics.checkNotNull(this.d);
        return this.d;
    }

    public final Object getElement$kotlinx_coroutines_core(int v) {
        return this.e.get(v * 2);
    }

    @Override  // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return BufferedChannelKt.SEGMENT_SIZE;
    }

    @Nullable
    public final Object getState$kotlinx_coroutines_core(int v) {
        return this.e.get(v * 2 + 1);
    }

    @Override  // kotlinx.coroutines.internal.Segment
    public void onCancellation(int v, @Nullable Throwable throwable0, @NotNull CoroutineContext coroutineContext0) {
        Object object1;
        int v1 = BufferedChannelKt.SEGMENT_SIZE;
        int v2 = v < v1 ? 0 : 1;
        if(v2 != 0) {
            v -= v1;
        }
        Object object0 = this.getElement$kotlinx_coroutines_core(v);
    alab1:
        do {
            do {
                object1 = this.getState$kotlinx_coroutines_core(v);
                if(object1 instanceof Waiter || object1 instanceof r1) {
                    continue alab1;
                }
                if(object1 == BufferedChannelKt.h || object1 == BufferedChannelKt.i) {
                    goto label_12;
                }
            }
            while(object1 == BufferedChannelKt.e || object1 == BufferedChannelKt.d);
            if(object1 != BufferedChannelKt.g && object1 != BufferedChannelKt.BUFFERED && object1 != BufferedChannelKt.getCHANNEL_CLOSED()) {
                throw new IllegalStateException(("unexpected state: " + object1).toString());
            }
            return;
        label_12:
            this.cleanElement$kotlinx_coroutines_core(v);
            if(v2 != 0) {
                Function1 function10 = this.getChannel().onUndeliveredElement;
                if(function10 != null) {
                    OnUndeliveredElementKt.callUndeliveredElement(function10, object0, coroutineContext0);
                }
            }
            return;
        }
        while(!this.casState$kotlinx_coroutines_core(v, object1, (v2 == 0 ? BufferedChannelKt.i : BufferedChannelKt.h)));
        this.cleanElement$kotlinx_coroutines_core(v);
        this.onCancelledRequest(v, ((boolean)(v2 ^ 1)));
        if(v2 != 0) {
            Function1 function11 = this.getChannel().onUndeliveredElement;
            if(function11 != null) {
                OnUndeliveredElementKt.callUndeliveredElement(function11, object0, coroutineContext0);
            }
        }
    }

    public final void onCancelledRequest(int v, boolean z) {
        if(z) {
            this.getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core(this.id * ((long)BufferedChannelKt.SEGMENT_SIZE) + ((long)v));
        }
        this.onSlotCleaned();
    }

    public final Object retrieveElement$kotlinx_coroutines_core(int v) {
        Object object0 = this.getElement$kotlinx_coroutines_core(v);
        this.cleanElement$kotlinx_coroutines_core(v);
        return object0;
    }

    public final void setState$kotlinx_coroutines_core(int v, @Nullable Object object0) {
        this.e.set(v * 2 + 1, object0);
    }

    public final void storeElement$kotlinx_coroutines_core(int v, Object object0) {
        this.e.lazySet(v * 2, object0);
    }
}


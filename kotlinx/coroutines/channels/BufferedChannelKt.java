package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;
import uf.s;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A3\u0010\u0004\u001A \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001A\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001A\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000B\"\u001A\u0010\u000F\u001A\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000B\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/ChannelSegment;", "createSegmentFunction", "()Lkotlin/reflect/KFunction;", "", "SEGMENT_SIZE", "I", "Lkotlinx/coroutines/internal/Symbol;", "BUFFERED", "Lkotlinx/coroutines/internal/Symbol;", "j", "getCHANNEL_CLOSED", "()Lkotlinx/coroutines/internal/Symbol;", "CHANNEL_CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BufferedChannelKt {
    @JvmField
    @NotNull
    public static final Symbol BUFFERED;
    @JvmField
    public static final int SEGMENT_SIZE;
    public static final ChannelSegment a;
    public static final int b;
    public static final Symbol c;
    public static final Symbol d;
    public static final Symbol e;
    public static final Symbol f;
    public static final Symbol g;
    public static final Symbol h;
    public static final Symbol i;
    public static final Symbol j;
    public static final Symbol k;
    public static final Symbol l;
    public static final Symbol m;
    public static final Symbol n;
    public static final Symbol o;
    public static final Symbol p;
    public static final Symbol q;

    static {
        BufferedChannelKt.a = new ChannelSegment(-1L, null, null, 0);
        BufferedChannelKt.SEGMENT_SIZE = SystemPropsKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 0x20, 0, 0, 12, null);
        BufferedChannelKt.b = SystemPropsKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        BufferedChannelKt.BUFFERED = new Symbol("BUFFERED");
        BufferedChannelKt.c = new Symbol("SHOULD_BUFFER");
        BufferedChannelKt.d = new Symbol("S_RESUMING_BY_RCV");
        BufferedChannelKt.e = new Symbol("RESUMING_BY_EB");
        BufferedChannelKt.f = new Symbol("POISONED");
        BufferedChannelKt.g = new Symbol("DONE_RCV");
        BufferedChannelKt.h = new Symbol("INTERRUPTED_SEND");
        BufferedChannelKt.i = new Symbol("INTERRUPTED_RCV");
        BufferedChannelKt.j = new Symbol("CHANNEL_CLOSED");
        BufferedChannelKt.k = new Symbol("SUSPEND");
        BufferedChannelKt.l = new Symbol("SUSPEND_NO_WAITER");
        BufferedChannelKt.m = new Symbol("FAILED");
        BufferedChannelKt.n = new Symbol("NO_RECEIVE_RESULT");
        BufferedChannelKt.o = new Symbol("CLOSE_HANDLER_CLOSED");
        BufferedChannelKt.p = new Symbol("CLOSE_HANDLER_INVOKED");
        BufferedChannelKt.q = new Symbol("NO_CLOSE_CAUSE");
    }

    // 去混淆评级： 低(20)
    public static final long access$constructEBCompletedAndPauseFlag(long v, boolean z) {
        return z ? v + 0x4000000000000000L : v;
    }

    public static final long access$constructSendersAndCloseStatus(long v, int v1) [...] // Inlined contents

    public static final ChannelSegment access$createSegment(long v, ChannelSegment channelSegment0) {
        return new ChannelSegment(v, channelSegment0, channelSegment0.getChannel(), 0);
    }

    public static final int access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p() [...] // 潜在的解密器

    public static final long access$initialBufferEnd(int v) {
        switch(v) {
            case 0: {
                return 0L;
            }
            case 0x7FFFFFFF: {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            default: {
                return (long)v;
            }
        }
    }

    public static final boolean access$tryResume0(CancellableContinuation cancellableContinuation0, Object object0, Function1 function10) {
        Object object1 = cancellableContinuation0.tryResume(object0, null, function10);
        if(object1 != null) {
            cancellableContinuation0.completeResume(object1);
            return true;
        }
        return false;
    }

    @NotNull
    public static final KFunction createSegmentFunction() {
        return s.a;
    }

    @NotNull
    public static final Symbol getCHANNEL_CLOSED() {
        return BufferedChannelKt.j;
    }
}


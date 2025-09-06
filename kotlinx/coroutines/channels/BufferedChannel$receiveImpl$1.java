package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "R", "E", "<anonymous parameter 0>", "Lkotlinx/coroutines/channels/ChannelSegment;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n*L\n1#1,3055:1\n*E\n"})
public final class BufferedChannel.receiveImpl.1 extends Lambda implements Function3 {
    public static final BufferedChannel.receiveImpl.1 INSTANCE;

    static {
        BufferedChannel.receiveImpl.1.INSTANCE = new BufferedChannel.receiveImpl.1();
    }

    public BufferedChannel.receiveImpl.1() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.invoke(((ChannelSegment)object0), ((Number)object1).intValue(), ((Number)object2).longValue());
    }

    @NotNull
    public final Void invoke(@NotNull ChannelSegment channelSegment0, int v, long v1) {
        throw new IllegalStateException("unexpected");
    }
}


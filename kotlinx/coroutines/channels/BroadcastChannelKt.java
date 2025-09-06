package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A#\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"E", "", "capacity", "Lkotlinx/coroutines/channels/BroadcastChannel;", "BroadcastChannel", "(I)Lkotlinx/coroutines/channels/BroadcastChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BroadcastChannelKt {
    public static final Symbol a;

    static {
        BroadcastChannelKt.a = new Symbol("NO_ELEMENT");
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @ObsoleteCoroutinesApi
    @NotNull
    public static final BroadcastChannel BroadcastChannel(int v) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new ConflatedBroadcastChannel();
                }
                case 0: {
                    throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
                }
                default: {
                    if(v == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                    }
                    return new BroadcastChannelImpl(v);
                }
            }
        }
        return new BroadcastChannelImpl(0x40);
    }
}


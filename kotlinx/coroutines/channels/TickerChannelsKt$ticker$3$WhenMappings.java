package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class TickerChannelsKt.ticker.3.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[TickerMode.values().length];
        try {
            arr_v[TickerMode.FIXED_PERIOD.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TickerMode.FIXED_DELAY.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        TickerChannelsKt.ticker.3.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


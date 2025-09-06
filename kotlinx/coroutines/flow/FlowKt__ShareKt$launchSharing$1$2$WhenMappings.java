package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class FlowKt__ShareKt.launchSharing.1.2.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[SharingCommand.values().length];
        try {
            arr_v[SharingCommand.START.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[SharingCommand.STOP.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        FlowKt__ShareKt.launchSharing.1.2.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


package androidx.paging;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class SeparatorState.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[TerminalSeparatorType.values().length];
        try {
            arr_v[TerminalSeparatorType.FULLY_COMPLETE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[TerminalSeparatorType.SOURCE_COMPLETE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        SeparatorState.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


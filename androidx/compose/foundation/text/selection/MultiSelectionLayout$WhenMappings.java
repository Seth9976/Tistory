package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class MultiSelectionLayout.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[CrossStatus.values().length];
        try {
            arr_v[CrossStatus.COLLAPSED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[CrossStatus.NOT_CROSSED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[CrossStatus.CROSSED.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        MultiSelectionLayout.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


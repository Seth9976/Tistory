package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class DialogWrapper.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[LayoutDirection.values().length];
        try {
            arr_v[LayoutDirection.Ltr.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[LayoutDirection.Rtl.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        DialogWrapper.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


package androidx.compose.material;

import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultCheckboxColors.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[ToggleableState.values().length];
        try {
            arr_v[ToggleableState.On.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ToggleableState.Indeterminate.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[ToggleableState.Off.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        DefaultCheckboxColors.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


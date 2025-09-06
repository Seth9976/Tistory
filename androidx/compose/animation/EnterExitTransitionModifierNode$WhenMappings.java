package androidx.compose.animation;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
public final class EnterExitTransitionModifierNode.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[EnterExitState.values().length];
        try {
            arr_v[EnterExitState.Visible.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[EnterExitState.PreEnter.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            arr_v[EnterExitState.PostExit.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        EnterExitTransitionModifierNode.WhenMappings.$EnumSwitchMapping$0 = arr_v;
    }
}


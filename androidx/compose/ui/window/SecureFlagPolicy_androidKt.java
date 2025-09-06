package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"shouldApplySecureFlag", "", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SecureFlagPolicy_androidKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SecureFlagPolicy.values().length];
            try {
                arr_v[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SecureFlagPolicy.Inherit.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final boolean shouldApplySecureFlag(@NotNull SecureFlagPolicy secureFlagPolicy0, boolean z) {
        switch(WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy0.ordinal()]) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            case 3: {
                return z;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}


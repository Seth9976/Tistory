package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J-\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDefaults;", "", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "", "isFocusable", "shouldDismissOnBackPress", "Landroidx/compose/material3/ModalBottomSheetProperties;", "properties", "(Landroidx/compose/ui/window/SecureFlagPolicy;ZZ)Landroidx/compose/material3/ModalBottomSheetProperties;", "a", "Landroidx/compose/material3/ModalBottomSheetProperties;", "getProperties", "()Landroidx/compose/material3/ModalBottomSheetProperties;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ModalBottomSheetDefaults {
    public static final int $stable;
    @NotNull
    public static final ModalBottomSheetDefaults INSTANCE;
    public static final ModalBottomSheetProperties a;

    static {
        ModalBottomSheetDefaults.INSTANCE = new ModalBottomSheetDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ModalBottomSheetDefaults.a = new ModalBottomSheetProperties(false, 1, null);
    }

    @NotNull
    public final ModalBottomSheetProperties getProperties() {
        return ModalBottomSheetDefaults.a;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\'isFocusable\' param is no longer used. Use value without this parameter.", replaceWith = @ReplaceWith(expression = "properties", imports = {}))
    @NotNull
    public final ModalBottomSheetProperties properties(@NotNull SecureFlagPolicy secureFlagPolicy0, boolean z, boolean z1) {
        return new ModalBottomSheetProperties(secureFlagPolicy0, z1);
    }

    public static ModalBottomSheetProperties properties$default(ModalBottomSheetDefaults modalBottomSheetDefaults0, SecureFlagPolicy secureFlagPolicy0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        return modalBottomSheetDefaults0.properties(secureFlagPolicy0, z, z1);
    }
}


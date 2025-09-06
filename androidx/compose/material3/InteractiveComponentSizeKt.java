package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0013\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u0007\u0010\b\"\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001A\u0004\b\u000E\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/ui/unit/Dp;", "b", "getLocalMinimumInteractiveComponentSize", "LocalMinimumInteractiveComponentSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InteractiveComponentSizeKt {
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;

    static {
        InteractiveComponentSizeKt.a = CompositionLocalKt.staticCompositionLocalOf(m4.H);
        InteractiveComponentSizeKt.b = CompositionLocalKt.staticCompositionLocalOf(m4.I);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final ProvidableCompositionLocal getLocalMinimumInteractiveComponentEnforcement() {
        return InteractiveComponentSizeKt.a;
    }

    @ExperimentalMaterial3Api
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentSize with Dp.Unspecified to turn off enforcement instead.", replaceWith = @ReplaceWith(expression = "LocalMinimumInteractiveComponentSize", imports = {}))
    public static void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalMinimumInteractiveComponentSize() {
        return InteractiveComponentSizeKt.b;
    }

    @Stable
    @NotNull
    public static final Modifier minimumInteractiveComponentSize(@NotNull Modifier modifier0) {
        return modifier0.then(MinimumInteractiveModifier.INSTANCE);
    }
}


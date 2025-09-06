package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.DpKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p0.o2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\f\u001A\u0011\u0010\u0001\u001A\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u0007\u0010\b\"&\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u000E\u0010\n\u001A\u0004\b\r\u0010\b¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/Modifier;", "minimumInteractiveComponentSize", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "LocalMinimumInteractiveComponentEnforcement", "b", "getLocalMinimumTouchTargetEnforcement", "getLocalMinimumTouchTargetEnforcement$annotations", "LocalMinimumTouchTargetEnforcement", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n154#2:170\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n168#1:170\n*E\n"})
public final class InteractiveComponentSizeKt {
    public static final ProvidableCompositionLocal a;
    public static final ProvidableCompositionLocal b;
    public static final long c;

    static {
        ProvidableCompositionLocal providableCompositionLocal0 = CompositionLocalKt.staticCompositionLocalOf(o2.B);
        InteractiveComponentSizeKt.a = providableCompositionLocal0;
        InteractiveComponentSizeKt.b = providableCompositionLocal0;
        InteractiveComponentSizeKt.c = DpKt.DpSize-YgX7TsA(48.0f, 48.0f);
    }

    public static final long access$getMinimumInteractiveComponentSize$p() [...] // 潜在的解密器

    @ExperimentalMaterialApi
    @NotNull
    public static final ProvidableCompositionLocal getLocalMinimumInteractiveComponentEnforcement() {
        return InteractiveComponentSizeKt.a;
    }

    @ExperimentalMaterialApi
    public static void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final ProvidableCompositionLocal getLocalMinimumTouchTargetEnforcement() {
        return InteractiveComponentSizeKt.b;
    }

    @ExperimentalMaterialApi
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @ReplaceWith(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    public static void getLocalMinimumTouchTargetEnforcement$annotations() {
    }

    @NotNull
    public static final Modifier minimumInteractiveComponentSize(@NotNull Modifier modifier0) {
        return modifier0.then(MinimumInteractiveModifier.INSTANCE);
    }
}


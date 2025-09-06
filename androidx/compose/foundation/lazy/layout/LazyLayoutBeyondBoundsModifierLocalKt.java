package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001AC\u0010\f\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "lazyLayoutBeyondBoundsModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsModifierLocal.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n1223#2,6:177\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsModifierLocal.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt\n*L\n55#1:177,6\n*E\n"})
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    public static final Void access$unsupportedDirection() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    @Composable
    @NotNull
    public static final Modifier lazyLayoutBeyondBoundsModifier(@NotNull Modifier modifier0, @NotNull LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState0, @NotNull LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo0, boolean z, @NotNull LayoutDirection layoutDirection0, @NotNull Orientation orientation0, boolean z1, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4F5D0C29, v, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if(z1) {
            composer0.startReplaceGroup(0x8F4F3D25);
            int v1 = 0;
            int v2 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(lazyLayoutBeyondBoundsState0)) && (v & 0x30) != 0x20 ? 0 : 1;
            int v3 = ((v & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(lazyLayoutBeyondBoundsInfo0)) && (v & 0x180) != 0x100 ? 0 : 1;
            int v4 = ((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(z)) && (v & 0xC00) != 0x800 ? 0 : 1;
            int v5 = ((0xE000 & v ^ 0x6000) <= 0x4000 || !composer0.changed(layoutDirection0)) && (v & 0x6000) != 0x4000 ? 0 : 1;
            if((0x70000 & v ^ 0x30000) > 0x20000 && composer0.changed(orientation0) || (v & 0x30000) == 0x20000) {
                v1 = 1;
            }
            LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal0 = composer0.rememberedValue();
            if((v2 | v3 | v4 | v5 | v1) != 0 || lazyLayoutBeyondBoundsModifierLocal0 == Composer.Companion.getEmpty()) {
                lazyLayoutBeyondBoundsModifierLocal0 = new LazyLayoutBeyondBoundsModifierLocal(lazyLayoutBeyondBoundsState0, lazyLayoutBeyondBoundsInfo0, z, layoutDirection0, orientation0);
                composer0.updateRememberedValue(lazyLayoutBeyondBoundsModifierLocal0);
            }
            modifier0 = modifier0.then(lazyLayoutBeyondBoundsModifierLocal0);
        }
        else {
            composer0.startReplaceGroup(0x8F4ED5F9);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifier0;
    }
}


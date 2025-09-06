package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import ca.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A9\u0010\f\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001A9\u0010\u000E\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\u000E\u0010\r¨\u0006\u000F"}, d2 = {"", "initial", "Landroidx/compose/foundation/ScrollState;", "rememberScrollState", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "reverseScrolling", "verticalScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;Z)Landroidx/compose/ui/Modifier;", "horizontalScroll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,487:1\n1223#2,6:488\n135#3:494\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n71#1:488,6\n297#1:494\n*E\n"})
public final class ScrollKt {
    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier horizontalScroll(@NotNull Modifier modifier0, @NotNull ScrollState scrollState0, boolean z, @Nullable FlingBehavior flingBehavior0, boolean z1) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new c(scrollState0, z1, flingBehavior0, z, false));
    }

    public static Modifier horizontalScroll$default(Modifier modifier0, ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            flingBehavior0 = null;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        return ScrollKt.horizontalScroll(modifier0, scrollState0, z, flingBehavior0, z1);
    }

    @Composable
    @NotNull
    public static final ScrollState rememberScrollState(int v, @Nullable Composer composer0, int v1, int v2) {
        boolean z = true;
        if((v2 & 1) != 0) {
            v = 0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA8B93939, v1, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Saver saver0 = ScrollState.Companion.getSaver();
        if(((v1 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v1 & 6) != 4) {
            z = false;
        }
        x0 x00 = composer0.rememberedValue();
        if(z || x00 == Composer.Companion.getEmpty()) {
            x00 = new x0(v, 2);
            composer0.updateRememberedValue(x00);
        }
        ScrollState scrollState0 = (ScrollState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, x00, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollState0;
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier verticalScroll(@NotNull Modifier modifier0, @NotNull ScrollState scrollState0, boolean z, @Nullable FlingBehavior flingBehavior0, boolean z1) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new c(scrollState0, z1, flingBehavior0, z, true));
    }

    public static Modifier verticalScroll$default(Modifier modifier0, ScrollState scrollState0, boolean z, FlingBehavior flingBehavior0, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            flingBehavior0 = null;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        return ScrollKt.verticalScroll(modifier0, scrollState0, z, flingBehavior0, z1);
    }
}


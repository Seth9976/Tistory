package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A)\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0013\u0010\u0007\u001A\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A%\u0010\t\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "focusGroup", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "focusableInNonTouchMode", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,355:1\n135#2:356\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n111#1:356\n*E\n"})
public final class FocusableKt {
    public static final InspectableModifier a;
    public static final FocusableKt.FocusableInNonTouchModeElement.1 b;

    static {
        FocusableKt.a = new InspectableModifier(InspectableValueKt.getNoInspectorInfo());
        FocusableKt.b = new FocusableKt.FocusableInNonTouchModeElement.1();
    }

    @Stable
    @NotNull
    public static final Modifier focusGroup(@NotNull Modifier modifier0) {
        return FocusModifierKt.focusTarget(FocusPropertiesKt.focusProperties(modifier0.then(FocusableKt.a), o.A));
    }

    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static final Modifier focusable(@NotNull Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0) {
        return z ? modifier0.then(new FocusableElement(mutableInteractionSource0)) : modifier0.then(Modifier.Companion);
    }

    public static Modifier focusable$default(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            mutableInteractionSource0 = null;
        }
        return FocusableKt.focusable(modifier0, z, mutableInteractionSource0);
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final Modifier focusableInNonTouchMode(@NotNull Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0) {
        return z ? FocusableKt.focusable(modifier0.then(FocusableKt.b), true, mutableInteractionSource0) : FocusableKt.focusable(modifier0.then(Modifier.Companion), false, mutableInteractionSource0);
    }
}


package androidx.compose.ui.layout;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001F\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBeyondBoundsLayout", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalBeyondBoundsLayout", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BeyondBoundsLayoutKt {
    public static final ProvidableModifierLocal a;

    static {
        BeyondBoundsLayoutKt.a = ModifierLocalKt.modifierLocalOf(g.x);
    }

    @NotNull
    public static final ProvidableModifierLocal getModifierLocalBeyondBoundsLayout() {
        return BeyondBoundsLayoutKt.a;
    }
}


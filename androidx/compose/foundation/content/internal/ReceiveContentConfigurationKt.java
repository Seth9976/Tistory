package androidx.compose.foundation.content.internal;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\"\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getReceiveContentConfiguration", "(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "a", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalReceiveContent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalReceiveContent", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ReceiveContentConfigurationKt {
    public static final ProvidableModifierLocal a;

    static {
        ReceiveContentConfigurationKt.a = ModifierLocalKt.modifierLocalOf(b.w);
    }

    @NotNull
    public static final ProvidableModifierLocal getModifierLocalReceiveContent() {
        return ReceiveContentConfigurationKt.a;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static final ReceiveContentConfiguration getReceiveContentConfiguration(@NotNull ModifierLocalModifierNode modifierLocalModifierNode0) {
        return modifierLocalModifierNode0.getNode().isAttached() ? ((ReceiveContentConfiguration)modifierLocalModifierNode0.getCurrent(ReceiveContentConfigurationKt.a)) : null;
    }
}


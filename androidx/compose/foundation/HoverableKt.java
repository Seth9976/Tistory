package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"hoverable", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class HoverableKt {
    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static final Modifier hoverable(@NotNull Modifier modifier0, @NotNull MutableInteractionSource mutableInteractionSource0, boolean z) {
        return z ? modifier0.then(new HoverableElement(mutableInteractionSource0)) : modifier0.then(Modifier.Companion);
    }

    public static Modifier hoverable$default(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return HoverableKt.hoverable(modifier0, mutableInteractionSource0, z);
    }
}


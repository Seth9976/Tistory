package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import j0.f3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001A4\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¨\u0006\n"}, d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldPressGestureFilterKt {
    // 去混淆评级： 低(20)
    @NotNull
    public static final Modifier tapPressTextFieldModifier(@NotNull Modifier modifier0, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z, @NotNull Function1 function10) {
        return z ? ComposedModifierKt.composed$default(modifier0, null, new f3(function10, mutableInteractionSource0), 1, null) : modifier0;
    }

    public static Modifier tapPressTextFieldModifier$default(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return TextFieldPressGestureFilterKt.tapPressTextFieldModifier(modifier0, mutableInteractionSource0, z, function10);
    }
}


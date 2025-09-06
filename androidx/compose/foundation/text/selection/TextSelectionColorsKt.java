package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextSelectionColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTextSelectionColors", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextSelectionColorsKt {
    public static final ProvidableCompositionLocal a;
    public static final TextSelectionColors b;

    static {
        TextSelectionColorsKt.a = CompositionLocalKt.compositionLocalOf$default(null, c0.z, 1, null);
        long v = ColorKt.Color(0xFF4286F4L);
        TextSelectionColorsKt.b = new TextSelectionColors(v, Color.copy-wmQWz5c$default(v, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalTextSelectionColors() {
        return TextSelectionColorsKt.a;
    }
}


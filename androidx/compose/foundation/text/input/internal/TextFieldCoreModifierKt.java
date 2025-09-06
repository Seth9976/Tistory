package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,627:1\n702#2:628\n148#3:629\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierKt\n*L\n587#1:628\n581#1:629\n*E\n"})
public final class TextFieldCoreModifierKt {
    public static final float a;

    static {
        TextFieldCoreModifierKt.a = 2.0f;
    }

    public static final Rect access$getCursorRectInScroller(Density density0, Rect rect0, boolean z, int v) {
        int v1 = density0.roundToPx-0680j_4(TextFieldCoreModifierKt.a);
        float f = z ? ((float)v) - rect0.getRight() : rect0.getLeft();
        return z ? Rect.copy$default(rect0, f, 0.0f, ((float)v) - rect0.getRight() + ((float)v1), 0.0f, 10, null) : Rect.copy$default(rect0, f, 0.0f, rect0.getLeft() + ((float)v1), 0.0f, 10, null);
    }

    public static final boolean access$isSpecified(Brush brush0) {
        return !(brush0 instanceof SolidColor) || ((SolidColor)brush0).getValue-0d7_KjU() != 16L;
    }

    public static final float access$roundToNext(float f) {
        if(!Float.isNaN(f) && !Float.isInfinite(f)) {
            return f > 0.0f ? ((float)Math.ceil(f)) : ((float)Math.floor(f));
        }
        return f;
    }
}


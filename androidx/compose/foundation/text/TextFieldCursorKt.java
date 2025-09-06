package androidx.compose.foundation.text;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import j0.v2;
import j0.w2;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A;\u0010\u000B\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u000B\u0010\f\"\u001A\u0010\u0012\u001A\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "enabled", "cursor", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/graphics/Brush;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getDefaultCursorThickness", "()F", "DefaultCursorThickness", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n148#2:103\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n96#1:103\n*E\n"})
public final class TextFieldCursorKt {
    public static final float a;

    static {
        AnimationSpecKt.infiniteRepeatable-9IiC70o$default(AnimationSpecKt.keyframes(w2.w), null, 0L, 6, null);
        TextFieldCursorKt.a = 2.0f;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier0, @NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull Brush brush0, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier0, null, new v2(brush0, legacyTextFieldState0, textFieldValue0, offsetMapping0), 1, null) : modifier0;
    }

    public static final float getDefaultCursorThickness() [...] // 潜在的解密器
}


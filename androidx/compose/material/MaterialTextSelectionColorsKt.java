package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A*\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A\"\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", "backgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "calculateSelectionBackgroundColor", "foreground", "background", "", "calculateContrastRatio--OWjLjI", "(JJ)F", "calculateContrastRatio", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n74#3:245\n67#4,3:246\n66#4:249\n1116#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
public final class MaterialTextSelectionColorsKt {
    public static final float a(long v, float f, long v1, long v2) {
        long v3 = ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(v, f, 0.0f, 0.0f, 0.0f, 14, null), v2);
        return MaterialTextSelectionColorsKt.calculateContrastRatio--OWjLjI(ColorKt.compositeOver--OWjLjI(v1, v3), v3);
    }

    public static final float calculateContrastRatio--OWjLjI(long v, long v1) {
        float f = ColorKt.luminance-8_81llA(v);
        float f1 = ColorKt.luminance-8_81llA(v1);
        return Math.max(f + 0.05f, f1 + 0.05f) / Math.min(f + 0.05f, f1 + 0.05f);
    }

    public static final long calculateSelectionBackgroundColor-ysEtTa8(long v, long v1, long v2) {
        float f = 0.2f;
        float f1 = MaterialTextSelectionColorsKt.a(v, 0.4f, v1, v2);
        float f2 = MaterialTextSelectionColorsKt.a(v, 0.2f, v1, v2);
        if(Float.compare(f1, 4.5f) >= 0) {
            return Color.copy-wmQWz5c$default(v, 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if(Float.compare(f2, 4.5f) < 0) {
            return Color.copy-wmQWz5c$default(v, 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        float f3 = 0.4f;
        float f4 = 0.4f;
        for(int v3 = 0; v3 < 7; ++v3) {
            float f5 = MaterialTextSelectionColorsKt.a(v, f3, v1, v2) / 4.5f - 1.0f;
            if(0.0f <= f5 && f5 <= 0.01f) {
                break;
            }
            if(f5 < 0.0f) {
                f4 = f3;
            }
            else {
                f = f3;
            }
            f3 = (f4 + f) / 2.0f;
        }
        return Color.copy-wmQWz5c$default(v, f3, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final TextSelectionColors rememberTextSelectionColors(@NotNull Colors colors0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0xD4FBC853);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD4FBC853, v, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long v1 = colors0.getPrimary-0d7_KjU();
        long v2 = colors0.getBackground-0d7_KjU();
        composer0.startReplaceableGroup(35572910);
        long v3 = ColorsKt.contentColorFor-4WTKRHQ(colors0, v2);
        if(v3 == 0L) {
            v3 = ((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
        }
        composer0.endReplaceableGroup();
        long v4 = Color.copy-wmQWz5c$default(v3, ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color color0 = Color.box-impl(v1);
        Color color1 = Color.box-impl(v2);
        Color color2 = Color.box-impl(v4);
        composer0.startReplaceableGroup(0x607FB4C4);
        boolean z = composer0.changed(color0);
        boolean z1 = composer0.changed(color1);
        boolean z2 = composer0.changed(color2);
        TextSelectionColors textSelectionColors0 = composer0.rememberedValue();
        if((z | z1 | z2) != 0 || textSelectionColors0 == Composer.Companion.getEmpty()) {
            textSelectionColors0 = new TextSelectionColors(colors0.getPrimary-0d7_KjU(), MaterialTextSelectionColorsKt.calculateSelectionBackgroundColor-ysEtTa8(v1, v4, v2), null);
            composer0.updateRememberedValue(textSelectionColors0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return textSelectionColors0;
    }
}


package androidx.compose.material;

import aa.x;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.c5;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A>\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n25#2:140\n1116#3,6:141\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:140\n65#1:141,6\n*E\n"})
public final class MaterialThemeKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void MaterialTheme(@Nullable Colors colors0, @Nullable Typography typography0, @Nullable Shapes shapes0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        Shapes shapes2;
        Typography typography2;
        int v5;
        Shapes shapes1;
        int v4;
        Typography typography1;
        int v3;
        int v2;
        Colors colors1;
        Composer composer1 = composer0.startRestartGroup(0xCADE0E09);
        if((v & 14) == 0) {
            if((v1 & 1) == 0) {
                colors1 = colors0;
                v2 = composer1.changed(colors1) ? 4 : 2;
            }
            else {
                colors1 = colors0;
                v2 = 2;
            }
            v3 = v2 | v;
        }
        else {
            colors1 = colors0;
            v3 = v;
        }
        if((v & 0x70) == 0) {
            if((v1 & 2) == 0) {
                typography1 = typography0;
                v4 = composer1.changed(typography1) ? 0x20 : 16;
            }
            else {
                typography1 = typography0;
                v4 = 16;
            }
            v3 |= v4;
        }
        else {
            typography1 = typography0;
        }
        if((v & 0x380) == 0) {
            if((v1 & 4) == 0) {
                shapes1 = shapes0;
                v5 = composer1.changed(shapes1) ? 0x100 : 0x80;
            }
            else {
                shapes1 = shapes0;
                v5 = 0x80;
            }
            v3 |= v5;
        }
        else {
            shapes1 = shapes0;
        }
        if((v1 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    colors1 = MaterialTheme.INSTANCE.getColors(composer1, 6);
                    v3 &= -15;
                }
                if((v1 & 2) != 0) {
                    typography1 = MaterialTheme.INSTANCE.getTypography(composer1, 6);
                    v3 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    shapes1 = MaterialTheme.INSTANCE.getShapes(composer1, 6);
                    v3 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v3 &= -15;
                }
                if((v1 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    v3 &= -897;
                }
            }
            typography2 = typography1;
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCADE0E09, v3, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:63)");
            }
            composer1.startReplaceableGroup(0xE2A708A4);
            Colors colors2 = composer1.rememberedValue();
            if(colors2 == Composer.Companion.getEmpty()) {
                colors2 = Colors.copy-pvPzIIM$default(colors1, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, 0x1FFF, null);
                composer1.updateRememberedValue(colors2);
            }
            composer1.endReplaceableGroup();
            ColorsKt.updateColorsFrom(colors2, colors1);
            shapes2 = shapes1;
            Indication indication0 = RippleKt.rememberRipple-9IZ8Weo(false, 0.0f, 0L, composer1, 0, 7);
            TextSelectionColors textSelectionColors0 = MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors2, composer1, 0);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorsKt.getLocalColors().provides(colors2), ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getHigh(composer1, 6)), IndicationKt.getLocalIndication().provides(indication0), RippleThemeKt.getLocalRippleTheme().provides(c5.a), ShapesKt.getLocalShapes().provides(shapes2), TextSelectionColorsKt.getLocalTextSelectionColors().provides(textSelectionColors0), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.composableLambda(composer1, -1740102967, true, new x(23, typography2, function20)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            typography2 = typography1;
            shapes2 = shapes1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(colors1, typography2, shapes2, function20, v, v1, 6));
        }
    }
}


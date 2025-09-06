package androidx.compose.material3;

import aa.x;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.foundation.text.selection.z;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001A@\u0010\n\u001A\u00020\u00072\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0011\u0010\t\u001A\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000B\u001AF\u0010\f\u001A\u00020\u00072\n\b\u0002\u0010\u0001\u001A\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0011\u0010\t\u001A\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001¢\u0006\u0004\b\f\u0010\u000B\u001A\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u000E\u0010\u000F\" \u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0018\u001A\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "colorScheme", "Landroidx/compose/material3/Shapes;", "shapes", "Landroidx/compose/material3/Typography;", "typography", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "MaterialTheme", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MaterialExpressiveTheme", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUsingExpressiveTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUsingExpressiveTheme", "", "TextSelectionBackgroundOpacity", "F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,172:1\n77#2:173\n1223#3,6:174\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialThemeKt\n*L\n135#1:173\n162#1:174,6\n*E\n"})
public final class MaterialThemeKt {
    public static final float TextSelectionBackgroundOpacity = 0.4f;
    public static final ProvidableCompositionLocal a;

    static {
        MaterialThemeKt.a = CompositionLocalKt.staticCompositionLocalOf(m4.J);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void MaterialExpressiveTheme(@Nullable ColorScheme colorScheme0, @Nullable Shapes shapes0, @Nullable Typography typography0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        Shapes shapes1;
        Typography typography1;
        ColorScheme colorScheme1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xAC95FA3A);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            colorScheme1 = colorScheme0;
        }
        else if((v & 6) == 0) {
            colorScheme1 = colorScheme0;
            v2 = (composer1.changed(colorScheme1) ? 4 : 2) | v;
        }
        else {
            colorScheme1 = colorScheme0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(shapes0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            typography1 = typography0;
        }
        else if((v & 0x180) == 0) {
            typography1 = typography0;
            v2 |= (composer1.changed(typography1) ? 0x100 : 0x80);
        }
        else {
            typography1 = typography0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                colorScheme1 = null;
            }
            shapes1 = (v1 & 2) == 0 ? shapes0 : null;
            Typography typography2 = (v1 & 4) == 0 ? typography1 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAC95FA3A, v2, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:133)");
            }
            ProvidableCompositionLocal providableCompositionLocal0 = MaterialThemeKt.a;
            if(((Boolean)composer1.consume(providableCompositionLocal0)).booleanValue()) {
                composer1.startReplaceGroup(0x209B78CB);
                composer1.startReplaceGroup(0x431DCF9F);
                ColorScheme colorScheme2 = colorScheme1 == null ? MaterialTheme.INSTANCE.getColorScheme(composer1, 6) : colorScheme1;
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(1126029309);
                Typography typography3 = typography2 == null ? MaterialTheme.INSTANCE.getTypography(composer1, 6) : typography2;
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(0x431DDF95);
                Shapes shapes2 = shapes1 == null ? MaterialTheme.INSTANCE.getShapes(composer1, 6) : shapes1;
                composer1.endReplaceGroup();
                MaterialThemeKt.MaterialTheme(colorScheme2, shapes2, typography3, function20, composer1, v2 & 0x1C00, 0);
            }
            else {
                composer1.startReplaceGroup(0x209F8CDD);
                CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal0.provides(Boolean.TRUE), ComposableLambdaKt.rememberComposableLambda(2050809758, true, new z(3, colorScheme1, shapes1, typography2, function20), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            typography1 = typography2;
        }
        else {
            composer1.skipToGroupEnd();
            shapes1 = shapes0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pc(colorScheme1, shapes1, typography1, function20, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void MaterialTheme(@Nullable ColorScheme colorScheme0, @Nullable Shapes shapes0, @Nullable Typography typography0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x81360482);
        int v2 = (v & 6) == 0 ? ((v1 & 1) != 0 || !composer1.changed(colorScheme0) ? 2 : 4) | v : v;
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(shapes0) ? 16 : 0x20);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(typography0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 1) != 0) {
                    colorScheme0 = MaterialTheme.INSTANCE.getColorScheme(composer1, 6);
                    v2 &= -15;
                }
                if((v1 & 2) != 0) {
                    shapes0 = MaterialTheme.INSTANCE.getShapes(composer1, 6);
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    typography0 = MaterialTheme.INSTANCE.getTypography(composer1, 6);
                    v2 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 1) != 0) {
                    v2 &= -15;
                }
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x81360482, v2, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)");
            }
            Indication indication0 = RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 0, 7);
            TextSelectionColors textSelectionColors0 = MaterialThemeKt.rememberTextSelectionColors(colorScheme0, composer1, v2 & 14);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme0), IndicationKt.getLocalIndication().provides(indication0), RippleThemeKt.getLocalRippleTheme().provides(CompatRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes0), TextSelectionColorsKt.getLocalTextSelectionColors().provides(textSelectionColors0), TypographyKt.getLocalTypography().provides(typography0)}, ComposableLambdaKt.rememberComposableLambda(0xC06D8942, true, new x(5, typography0, function20), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pc(colorScheme0, shapes0, typography0, function20, v, v1, 1));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalUsingExpressiveTheme() {
        return MaterialThemeKt.a;
    }

    @Composable
    @NotNull
    public static final TextSelectionColors rememberTextSelectionColors(@NotNull ColorScheme colorScheme0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6F3FD9D8, v, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)");
        }
        long v1 = colorScheme0.getPrimary-0d7_KjU();
        boolean z = composer0.changed(v1);
        TextSelectionColors textSelectionColors0 = composer0.rememberedValue();
        if(z || textSelectionColors0 == Composer.Companion.getEmpty()) {
            textSelectionColors0 = new TextSelectionColors(v1, Color.copy-wmQWz5c$default(v1, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer0.updateRememberedValue(textSelectionColors0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textSelectionColors0;
    }
}


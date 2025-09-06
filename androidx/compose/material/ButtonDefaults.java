package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.s2;
import p0.w2;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J0\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJD\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ:\u0010\u0016\u001A\u00020\u00132\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0019\u001A\u00020\u00132\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001B\u001A\u00020\u00132\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u0018R\u0017\u0010!\u001A\u00020\u001C8\u0006\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001D\u0010&\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001D\u0010)\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010%R\u001D\u0010,\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b*\u0010#\u001A\u0004\b+\u0010%R\u001D\u0010/\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b-\u0010#\u001A\u0004\b.\u0010%R\u0014\u00101\u001A\u0002008\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b1\u0010#R\u001D\u00104\u001A\u00020\u00028\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b2\u0010#\u001A\u0004\b3\u0010%R\u0017\u00107\u001A\u00020\u001C8\u0006\u00A2\u0006\f\n\u0004\b5\u0010\u001E\u001A\u0004\b6\u0010 R\u0011\u0010;\u001A\u0002088G\u00A2\u0006\u0006\u001A\u0004\b9\u0010:\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006<"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "textButtonColors-RGew2ao", "textButtonColors", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "b", "F", "getMinWidth-D9Ej5fM", "()F", "MinWidth", "c", "getMinHeight-D9Ej5fM", "MinHeight", "d", "getIconSize-D9Ej5fM", "IconSize", "e", "getIconSpacing-D9Ej5fM", "IconSpacing", "", "OutlinedBorderOpacity", "f", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "g", "getTextButtonContentPadding", "TextButtonContentPadding", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,617:1\n154#2:618\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:637\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n83#3,3:628\n1116#4,6:631\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n346#1:618\n347#1:619\n348#1:620\n353#1:621\n354#1:622\n372#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n294#1:637\n295#1:638\n311#1:639\n317#1:640\n324#1:641\n331#1:642\n469#1:643\n480#1:644\n378#1:628,3\n378#1:631,6\n*E\n"})
public final class ButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ButtonDefaults INSTANCE = null;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final PaddingValues a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final PaddingValues g;

    static {
        ButtonDefaults.INSTANCE = new ButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-a9UjIt4(16.0f, 8.0f, 16.0f, 8.0f);
        ButtonDefaults.a = paddingValues0;
        ButtonDefaults.b = 64.0f;
        ButtonDefaults.c = 36.0f;
        ButtonDefaults.d = 18.0f;
        ButtonDefaults.e = 8.0f;
        ButtonDefaults.f = 1.0f;
        ButtonDefaults.g = PaddingKt.PaddingValues-a9UjIt4(8.0f, paddingValues0.calculateTopPadding-D9Ej5fM(), 8.0f, paddingValues0.calculateBottomPadding-D9Ej5fM());
    }

    @Composable
    @NotNull
    public final ButtonColors buttonColors-ro_MJ88(long v, long v1, long v2, long v3, @Nullable Composer composer0, int v4, int v5) {
        composer0.startReplaceableGroup(0x6F7B993E);
        long v6 = (v5 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v7 = (v5 & 2) == 0 ? v1 : ColorsKt.contentColorFor-ek8zF_U(v6, composer0, v4 & 14);
        long v8 = (v5 & 4) == 0 ? v2 : ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        long v9 = (v5 & 8) == 0 ? v3 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6F7B993E, v4, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:411)");
        }
        ButtonColors buttonColors0 = new s2(v6, v7, v8, v9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonElevation elevation-R_JCAzs(float f, float f1, float f2, float f3, float f4, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xD40FABAA);
        if((v1 & 1) != 0) {
            f = 2.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 8.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 4.0f;
        }
        if((v1 & 16) != 0) {
            f4 = 4.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD40FABAA, v, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:376)");
        }
        Object[] arr_object = {Dp.box-impl(f), Dp.box-impl(f1), Dp.box-impl(f2), Dp.box-impl(f3), Dp.box-impl(f4)};
        composer0.startReplaceableGroup(0xDE219177);
        boolean z = false;
        for(int v2 = 0; v2 < 5; ++v2) {
            z |= composer0.changed(arr_object[v2]);
        }
        w2 w20 = composer0.rememberedValue();
        if(z || w20 == Composer.Companion.getEmpty()) {
            w20 = new w2(f, f1, f2, f3, f4);
            composer0.updateRememberedValue(w20);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return w20;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    public final ButtonElevation elevation-yajeYGU(float f, float f1, float f2, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x55265A6A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x55265A6A, v, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:348)");
        }
        ButtonElevation buttonElevation0 = this.elevation-R_JCAzs(((v1 & 1) == 0 ? f : 2.0f), ((v1 & 2) == 0 ? f1 : 8.0f), ((v1 & 4) == 0 ? f2 : 0.0f), 4.0f, 4.0f, composer0, v & 14 | 0x6C00 | v & 0x70 | v & 0x380 | v << 6 & 0x70000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return buttonElevation0;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ButtonDefaults.a;
    }

    public final float getIconSize-D9Ej5fM() {
        return ButtonDefaults.d;
    }

    public final float getIconSpacing-D9Ej5fM() {
        return ButtonDefaults.e;
    }

    public final float getMinHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-2091313033);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, v, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:475)");
        }
        long v1 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(ButtonDefaults.f, v1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return borderStroke0;
    }

    public final float getOutlinedBorderSize-D9Ej5fM() {
        return ButtonDefaults.f;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return ButtonDefaults.g;
    }

    @Composable
    @NotNull
    public final ButtonColors outlinedButtonColors-RGew2ao(long v, long v1, long v2, @Nullable Composer composer0, int v3, int v4) {
        composer0.startReplaceableGroup(-2124406093);
        long v5 = (v4 & 1) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v6 = (v4 & 2) == 0 ? v1 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v7 = (v4 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, v3, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:432)");
        }
        ButtonColors buttonColors0 = new s2(v5, v6, v5, v7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return buttonColors0;
    }

    @Composable
    @NotNull
    public final ButtonColors textButtonColors-RGew2ao(long v, long v1, long v2, @Nullable Composer composer0, int v3, int v4) {
        composer0.startReplaceableGroup(0xAE46CC8);
        long v5 = (v4 & 1) == 0 ? v : 0L;
        long v6 = (v4 & 2) == 0 ? v1 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v7 = (v4 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAE46CC8, v3, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:453)");
        }
        ButtonColors buttonColors0 = new s2(v5, v6, v5, v7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return buttonColors0;
    }
}


package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u00A9\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001A\u00020\u00142\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u001AH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\u0085\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0013\u001A\u00020\u00142\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u001AH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001Ac\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00010\u0003\u00A2\u0006\u0002\b\u001AH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006!"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "border", "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Card-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Card-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Card-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,212:1\n154#2:213\n154#2:214\n154#2:222\n25#3:215\n25#3:223\n1116#4,6:216\n1116#4,6:224\n74#5:230\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n65#1:213\n116#1:214\n187#1:222\n117#1:215\n188#1:223\n117#1:216,6\n188#1:224,6\n189#1:230\n*E\n"})
public final class CardKt {
    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Card function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Card(onClick, modifier, enabled, shape, backgroundColor, contentColor, border, elevation, interactionSource, content)", imports = {}))
    public static final void Card-9VG74zQ(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z, @Nullable String s, @Nullable Role role0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        MutableInteractionSource mutableInteractionSource2;
        composer0.startReplaceableGroup(0x50AE6642);
        Modifier modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v4 & 4) == 0 ? shape0 : MaterialTheme.INSTANCE.getShapes(composer0, 6).getMedium();
        long v5 = (v4 & 8) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v6 = (v4 & 16) == 0 ? v1 : ColorsKt.contentColorFor-ek8zF_U(v5, composer0, v2 >> 9 & 14);
        if((v4 & 0x80) == 0) {
            mutableInteractionSource2 = mutableInteractionSource0;
        }
        else {
            composer0.startReplaceableGroup(0xE2A708A4);
            MutableInteractionSource mutableInteractionSource1 = composer0.rememberedValue();
            if(mutableInteractionSource1 == Composer.Companion.getEmpty()) {
                mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                composer0.updateRememberedValue(mutableInteractionSource1);
            }
            composer0.endReplaceableGroup();
            mutableInteractionSource2 = mutableInteractionSource1;
        }
        Indication indication1 = (v4 & 0x100) == 0 ? indication0 : ((Indication)composer0.consume(IndicationKt.getLocalIndication()));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x50AE6642, v2, v3, "androidx.compose.material.Card (Card.kt:193)");
        }
        SurfaceKt.Surface-9VG74zQ(function00, modifier1, shape1, v5, v6, ((v4 & 0x20) == 0 ? borderStroke0 : null), ((v4 & 0x40) == 0 ? f : 1.0f), mutableInteractionSource2, indication1, ((v4 & 0x200) == 0 ? z : true), ((v4 & 0x400) == 0 ? s : null), ((v4 & 0x800) == 0 ? role0 : null), function20, composer0, v2 & 0x7FFFFFFE, v3 & 0x3FE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card-F-jzlyU(@Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        composer0.startReplaceableGroup(1956755640);
        Modifier modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v3 & 2) == 0 ? shape0 : MaterialTheme.INSTANCE.getShapes(composer0, 6).getMedium();
        long v4 = (v3 & 4) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v5 = (v3 & 8) == 0 ? v1 : ColorsKt.contentColorFor-ek8zF_U(v4, composer0, v2 >> 6 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, v2, -1, "androidx.compose.material.Card (Card.kt:66)");
        }
        SurfaceKt.Surface-F-jzlyU(modifier1, shape1, v4, v5, ((v3 & 16) == 0 ? borderStroke0 : null), ((v3 & 0x20) == 0 ? f : 1.0f), function20, composer0, v2 & 0x3FFFFE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Card-LPr_se0(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        MutableInteractionSource mutableInteractionSource2;
        composer0.startReplaceableGroup(0x2E678FE3);
        Modifier modifier1 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v3 & 8) == 0 ? shape0 : MaterialTheme.INSTANCE.getShapes(composer0, 6).getMedium();
        long v4 = (v3 & 16) == 0 ? v : MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU();
        long v5 = (v3 & 0x20) == 0 ? v1 : ColorsKt.contentColorFor-ek8zF_U(v4, composer0, v2 >> 12 & 14);
        if((v3 & 0x100) == 0) {
            mutableInteractionSource2 = mutableInteractionSource0;
        }
        else {
            composer0.startReplaceableGroup(0xE2A708A4);
            MutableInteractionSource mutableInteractionSource1 = composer0.rememberedValue();
            if(mutableInteractionSource1 == Composer.Companion.getEmpty()) {
                mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                composer0.updateRememberedValue(mutableInteractionSource1);
            }
            composer0.endReplaceableGroup();
            mutableInteractionSource2 = mutableInteractionSource1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2E678FE3, v2, -1, "androidx.compose.material.Card (Card.kt:118)");
        }
        SurfaceKt.Surface-LPr_se0(function00, modifier1, ((v3 & 4) == 0 ? z : true), shape1, v4, v5, ((v3 & 0x40) == 0 ? borderStroke0 : null), ((v3 & 0x80) == 0 ? f : 1.0f), mutableInteractionSource2, function20, composer0, v2 & 0x7FFFFFFE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }
}


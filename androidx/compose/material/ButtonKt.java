package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.y;
import androidx.compose.material3.w3;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.d2;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001A\u008D\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u008D\u0001\u0010\u001A\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u008D\u0001\u0010\u001B\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u00A8\u0006\u001C\u00B2\u0006\n\u0010\u001D\u001A\u00020\u001EX\u008A\u0084\u0002"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", "border", "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,617:1\n25#2:618\n25#2:626\n25#2:633\n1116#3,6:619\n1116#3,6:627\n1116#3,6:634\n154#4:625\n81#5:640\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n97#1:618\n171#1:626\n225#1:633\n97#1:619,6\n171#1:627,6\n225#1:634,6\n114#1:625\n105#1:640\n*E\n"})
public final class ButtonKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Button(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable ButtonElevation buttonElevation0, @Nullable Shape shape0, @Nullable BorderStroke borderStroke0, @Nullable ButtonColors buttonColors0, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        ButtonColors buttonColors1;
        Shape shape1;
        BorderStroke borderStroke1;
        ButtonElevation buttonElevation2;
        MutableInteractionSource mutableInteractionSource1;
        boolean z2;
        Modifier modifier1;
        Modifier modifier2;
        int v6;
        Shape shape2;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        PaddingValues paddingValues2;
        ButtonColors buttonColors2;
        ButtonColors buttonColors3;
        int v7;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource4;
        PaddingValues paddingValues1;
        int v4;
        int v3;
        ButtonElevation buttonElevation1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x81DE5DA8);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x380) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            if((v1 & 16) == 0) {
                buttonElevation1 = buttonElevation0;
                v3 = composer1.changed(buttonElevation1) ? 0x4000 : 0x2000;
            }
            else {
                buttonElevation1 = buttonElevation0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            buttonElevation1 = buttonElevation0;
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(buttonColors0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
            v4 = v1 & 0x100;
            paddingValues1 = paddingValues0;
        }
        else if((v & 0xE000000) == 0) {
            v4 = v1 & 0x100;
            paddingValues1 = paddingValues0;
            v2 |= (composer1.changed(paddingValues1) ? 0x4000000 : 0x2000000);
        }
        else {
            v4 = v1 & 0x100;
            paddingValues1 = paddingValues0;
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        int v5 = v2;
        if((0x5B6DB6DB & v5) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 4) == 0 ? z1 : true;
                if((v1 & 8) == 0) {
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v1 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                    buttonElevation1 = ButtonDefaults.INSTANCE.elevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x30000, 0x1F);
                }
                if((v1 & 0x20) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall();
                    v5 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) == 0) {
                    v7 = v4;
                    buttonColors3 = buttonColors0;
                }
                else {
                    v7 = v4;
                    buttonColors3 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(0L, 0L, 0L, 0L, composer1, 0x6000, 15);
                    v5 &= 0xFE3FFFFF;
                }
                if(v7 == 0) {
                    paddingValues2 = paddingValues0;
                    v6 = v5;
                    buttonColors2 = buttonColors3;
                    modifier2 = modifier3;
                    z1 = z3;
                }
                else {
                    v6 = v5;
                    paddingValues2 = ButtonDefaults.INSTANCE.getContentPadding();
                    modifier2 = modifier3;
                    z1 = z3;
                    buttonColors2 = buttonColors3;
                }
                borderStroke2 = (v1 & 0x40) == 0 ? borderStroke0 : null;
                shape2 = shape3;
                mutableInteractionSource2 = mutableInteractionSource4;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v5 &= 0xFE3FFFFF;
                }
                buttonColors2 = buttonColors0;
                paddingValues2 = paddingValues0;
                mutableInteractionSource2 = mutableInteractionSource0;
                borderStroke2 = borderStroke0;
                shape2 = shape0;
                v6 = v5;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x81DE5DA8, v6, -1, "androidx.compose.material.Button (Button.kt:103)");
            }
            int v8 = v6 >> 6 & 14 | v6 >> 18 & 0x70;
            State state0 = buttonColors2.contentColor(z1, composer1, v8);
            State state1 = null;
            Modifier modifier4 = SemanticsModifierKt.semantics$default(modifier2, false, d2.w, 1, null);
            long v9 = ((Color)buttonColors2.backgroundColor(z1, composer1, v8).getValue()).unbox-impl();
            long v10 = Color.copy-wmQWz5c$default(((Color)state0.getValue()).unbox-impl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            composer1.startReplaceableGroup(0xE6C21951);
            if(buttonElevation1 != null) {
                state1 = buttonElevation1.elevation(z1, mutableInteractionSource2, composer1, v6 >> 6 & 0x3FE);
            }
            composer1.endReplaceableGroup();
            SurfaceKt.Surface-LPr_se0(function00, modifier4, z1, shape2, v9, v10, borderStroke2, (state1 == null ? 0.0f : ((Dp)state1.getValue()).unbox-impl()), mutableInteractionSource2, ComposableLambdaKt.composableLambda(composer1, 0x72CFAF, true, new y(state0, paddingValues2, 5, function30)), composer1, v6 & 14 | 0x30000000 | v6 & 0x380 | v6 >> 6 & 0x1C00 | v6 & 0x380000 | v6 << 15 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke1 = borderStroke2;
            modifier1 = modifier2;
            z2 = z1;
            paddingValues1 = paddingValues2;
            buttonElevation2 = buttonElevation1;
            shape1 = shape2;
            buttonColors1 = buttonColors2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource0;
            buttonElevation2 = buttonElevation1;
            borderStroke1 = borderStroke0;
            shape1 = shape0;
            buttonColors1 = buttonColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w3(function00, modifier1, z2, mutableInteractionSource1, buttonElevation2, shape1, borderStroke1, buttonColors1, paddingValues1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable ButtonElevation buttonElevation0, @Nullable Shape shape0, @Nullable BorderStroke borderStroke0, @Nullable ButtonColors buttonColors0, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource2;
        composer0.startReplaceableGroup(0x9622572A);
        Modifier modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
        if((v1 & 8) == 0) {
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
        Shape shape1 = (v1 & 0x20) == 0 ? shape0 : MaterialTheme.INSTANCE.getShapes(composer0, 6).getSmall();
        BorderStroke borderStroke1 = (v1 & 0x40) == 0 ? borderStroke0 : ButtonDefaults.INSTANCE.getOutlinedBorder(composer0, 6);
        ButtonColors buttonColors1 = (v1 & 0x80) == 0 ? buttonColors0 : ButtonDefaults.INSTANCE.outlinedButtonColors-RGew2ao(0L, 0L, 0L, composer0, 0xC00, 7);
        PaddingValues paddingValues1 = (v1 & 0x100) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getContentPadding();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9622572A, v, -1, "androidx.compose.material.OutlinedButton (Button.kt:177)");
        }
        ButtonKt.Button(function00, modifier1, ((v1 & 4) == 0 ? z : true), mutableInteractionSource2, ((v1 & 16) == 0 ? buttonElevation0 : null), shape1, borderStroke1, buttonColors1, paddingValues1, function30, composer0, v & 0x7FFFFFFE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable ButtonElevation buttonElevation0, @Nullable Shape shape0, @Nullable BorderStroke borderStroke0, @Nullable ButtonColors buttonColors0, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource2;
        composer0.startReplaceableGroup(0x1136B375);
        Modifier modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
        if((v1 & 8) == 0) {
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
        Shape shape1 = (v1 & 0x20) == 0 ? shape0 : MaterialTheme.INSTANCE.getShapes(composer0, 6).getSmall();
        ButtonColors buttonColors1 = (v1 & 0x80) == 0 ? buttonColors0 : ButtonDefaults.INSTANCE.textButtonColors-RGew2ao(0L, 0L, 0L, composer0, 0xC00, 7);
        PaddingValues paddingValues1 = (v1 & 0x100) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getTextButtonContentPadding();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1136B375, v, -1, "androidx.compose.material.TextButton (Button.kt:231)");
        }
        ButtonKt.Button(function00, modifier1, ((v1 & 4) == 0 ? z : true), mutableInteractionSource2, ((v1 & 16) == 0 ? buttonElevation0 : null), shape1, ((v1 & 0x40) == 0 ? borderStroke0 : null), buttonColors1, paddingValues1, function30, composer0, v & 0x7FFFFFFE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    public static final long access$Button$lambda$1(State state0) {
        return ((Color)state0.getValue()).unbox-impl();
    }
}


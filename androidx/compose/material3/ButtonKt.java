package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u008F\u0001\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u008F\u0001\u0010\u001A\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u008F\u0001\u0010\u001B\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u008F\u0001\u0010\u001C\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u001A\u008F\u0001\u0010\u001D\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0007\u00A2\u0006\u0002\u0010\u0019\u00A8\u0006\u001E"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ButtonColors;", "elevation", "Landroidx/compose/material3/ButtonElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedButton", "FilledTonalButton", "OutlinedButton", "TextButton", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1108:1\n1223#2,6:1109\n148#3:1115\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonKt\n*L\n121#1:1109,6\n124#1:1115\n*E\n"})
public final class ButtonKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Button(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable ButtonColors buttonColors0, @Nullable ButtonElevation buttonElevation0, @Nullable BorderStroke borderStroke0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        PaddingValues paddingValues1;
        BorderStroke borderStroke2;
        ButtonElevation buttonElevation2;
        ButtonColors buttonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource4;
        int v7;
        PaddingValues paddingValues2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource2;
        int v9;
        ButtonColors buttonColors3;
        int v8;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v6;
        BorderStroke borderStroke1;
        int v5;
        ButtonElevation buttonElevation1;
        int v4;
        ButtonColors buttonColors1;
        int v3;
        Shape shape1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x26C01063);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                buttonColors1 = buttonColors0;
                v4 = composer1.changed(buttonColors1) ? 0x4000 : 0x2000;
            }
            else {
                buttonColors1 = buttonColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            buttonColors1 = buttonColors0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                buttonElevation1 = buttonElevation0;
                v5 = composer1.changed(buttonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                buttonElevation1 = buttonElevation0;
                v5 = 0x10000;
            }
            v2 |= v5;
        }
        else {
            buttonElevation1 = buttonElevation0;
        }
        if((v1 & 0x40) == 0) {
            borderStroke1 = borderStroke0;
            if((0x180000 & v) == 0) {
                v2 |= (composer1.changed(borderStroke1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x6000000) == 0) {
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x4000000 : 0x2000000);
        }
        else {
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFFFE3FF;
                    shape3 = ButtonDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 16) == 0) {
                    v8 = v2;
                    buttonColors3 = buttonColors1;
                }
                else {
                    v8 = v2 & 0xFFFF1FFF;
                    buttonColors3 = ButtonDefaults.INSTANCE.buttonColors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    modifier0 = modifier2;
                    v9 = v8;
                }
                else {
                    modifier0 = modifier2;
                    buttonElevation1 = ButtonDefaults.INSTANCE.buttonElevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x30000, 0x1F);
                    v9 = v8 & 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    borderStroke1 = null;
                }
                mutableInteractionSource2 = v6 == 0 ? mutableInteractionSource0 : null;
                v7 = v9;
                paddingValues2 = (v1 & 0x80) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getContentPadding();
                borderStroke3 = borderStroke1;
                buttonColors1 = buttonColors3;
                z1 = (v1 & 4) == 0 ? z1 : true;
                shape1 = shape3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                borderStroke3 = borderStroke1;
                paddingValues2 = paddingValues0;
                v7 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x26C01063, v7, -1, "androidx.compose.material3.Button (Button.kt:118)");
            }
            composer1.startReplaceGroup(0xF1BEC271);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource3);
                }
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            else {
                mutableInteractionSource4 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            long v10 = buttonColors1.containerColor-vNxB06k$material3_release(z1);
            long v11 = buttonColors1.contentColor-vNxB06k$material3_release(z1);
            composer1.startReplaceGroup(-239150048);
            State state0 = buttonElevation1 == null ? null : buttonElevation1.shadowElevation$material3_release(z1, mutableInteractionSource4, composer1, v7 >> 6 & 14 | v7 >> 9 & 0x380);
            composer1.endReplaceGroup();
            float f = state0 == null ? 0.0f : ((Dp)state0.getValue()).unbox-impl();
            SurfaceKt.Surface-o_FOJdg(function00, SemanticsModifierKt.semantics$default(modifier0, false, k2.w, 1, null), z1, shape1, v10, v11, 0.0f, f, borderStroke3, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(0x3902DB2E, true, new m2(v11, paddingValues2, function30, 0), composer1, 54), composer1, v7 & 8078 | 0xE000000 & v7 << 6, 6, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            buttonElevation2 = buttonElevation1;
            paddingValues1 = paddingValues2;
            z2 = z1;
            buttonColors2 = buttonColors1;
            borderStroke2 = borderStroke3;
            modifier1 = modifier0;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            shape2 = shape1;
            buttonColors2 = buttonColors1;
            buttonElevation2 = buttonElevation1;
            borderStroke2 = borderStroke1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(function00, modifier1, z2, shape2, buttonColors2, buttonElevation2, borderStroke2, paddingValues1, mutableInteractionSource1, function30, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ElevatedButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable ButtonColors buttonColors0, @Nullable ButtonElevation buttonElevation0, @Nullable BorderStroke borderStroke0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        PaddingValues paddingValues1;
        BorderStroke borderStroke2;
        ButtonElevation buttonElevation2;
        ButtonColors buttonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier1;
        BorderStroke borderStroke3;
        int v7;
        PaddingValues paddingValues2;
        Modifier modifier2;
        ButtonColors buttonColors3;
        int v8;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v6;
        BorderStroke borderStroke1;
        int v5;
        ButtonElevation buttonElevation1;
        int v4;
        ButtonColors buttonColors1;
        int v3;
        Shape shape1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x576EECD9);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                buttonColors1 = buttonColors0;
                v4 = composer1.changed(buttonColors1) ? 0x4000 : 0x2000;
            }
            else {
                buttonColors1 = buttonColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            buttonColors1 = buttonColors0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                buttonElevation1 = buttonElevation0;
                v5 = composer1.changed(buttonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                buttonElevation1 = buttonElevation0;
                v5 = 0x10000;
            }
            v2 |= v5;
        }
        else {
            buttonElevation1 = buttonElevation0;
        }
        if((v1 & 0x40) == 0) {
            borderStroke1 = borderStroke0;
            if((0x180000 & v) == 0) {
                v2 |= (composer1.changed(borderStroke1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x6000000) == 0) {
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x4000000 : 0x2000000);
        }
        else {
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 4) == 0 ? z1 : true;
                if((v1 & 8) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFFFE3FF;
                    shape3 = ButtonDefaults.INSTANCE.getElevatedShape(composer1, 6);
                }
                if((v1 & 16) == 0) {
                    v8 = v2;
                    buttonColors3 = buttonColors1;
                }
                else {
                    v8 = v2 & 0xFFFF1FFF;
                    buttonColors3 = ButtonDefaults.INSTANCE.elevatedButtonColors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    v2 = v8;
                }
                else {
                    buttonElevation1 = ButtonDefaults.INSTANCE.elevatedButtonElevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x30000, 0x1F);
                    v2 = v8 & 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    borderStroke1 = null;
                }
                paddingValues2 = (v1 & 0x80) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getContentPadding();
                if(v6 == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    v7 = v2;
                    borderStroke3 = borderStroke1;
                    z1 = z3;
                    shape1 = shape3;
                    buttonColors1 = buttonColors3;
                }
                else {
                    mutableInteractionSource1 = null;
                    z1 = z3;
                    shape1 = shape3;
                    buttonColors1 = buttonColors3;
                    v7 = v2;
                    borderStroke3 = borderStroke1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                paddingValues2 = paddingValues0;
                v7 = v2;
                borderStroke3 = borderStroke1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x576EECD9, v7, -1, "androidx.compose.material3.ElevatedButton (Button.kt:212)");
            }
            ButtonKt.Button(function00, modifier2, z1, shape1, buttonColors1, buttonElevation1, borderStroke3, paddingValues2, mutableInteractionSource1, function30, composer1, v7 & 0x7FFFFFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape2 = shape1;
            buttonElevation2 = buttonElevation1;
            paddingValues1 = paddingValues2;
            z2 = z1;
            buttonColors2 = buttonColors1;
            borderStroke2 = borderStroke3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            shape2 = shape1;
            buttonColors2 = buttonColors1;
            buttonElevation2 = buttonElevation1;
            borderStroke2 = borderStroke1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(function00, modifier1, z2, shape2, buttonColors2, buttonElevation2, borderStroke2, paddingValues1, mutableInteractionSource1, function30, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FilledTonalButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable ButtonColors buttonColors0, @Nullable ButtonElevation buttonElevation0, @Nullable BorderStroke borderStroke0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        PaddingValues paddingValues1;
        BorderStroke borderStroke2;
        ButtonElevation buttonElevation2;
        ButtonColors buttonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier1;
        BorderStroke borderStroke3;
        int v7;
        PaddingValues paddingValues2;
        Modifier modifier2;
        ButtonColors buttonColors3;
        int v8;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v6;
        BorderStroke borderStroke1;
        int v5;
        ButtonElevation buttonElevation1;
        int v4;
        ButtonColors buttonColors1;
        int v3;
        Shape shape1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x999A8DE3);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                buttonColors1 = buttonColors0;
                v4 = composer1.changed(buttonColors1) ? 0x4000 : 0x2000;
            }
            else {
                buttonColors1 = buttonColors0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            buttonColors1 = buttonColors0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                buttonElevation1 = buttonElevation0;
                v5 = composer1.changed(buttonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                buttonElevation1 = buttonElevation0;
                v5 = 0x10000;
            }
            v2 |= v5;
        }
        else {
            buttonElevation1 = buttonElevation0;
        }
        if((v1 & 0x40) == 0) {
            borderStroke1 = borderStroke0;
            if((0x180000 & v) == 0) {
                v2 |= (composer1.changed(borderStroke1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x6000000) == 0) {
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x4000000 : 0x2000000);
        }
        else {
            v6 = v1 & 0x100;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 4) == 0 ? z1 : true;
                if((v1 & 8) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFFFE3FF;
                    shape3 = ButtonDefaults.INSTANCE.getFilledTonalShape(composer1, 6);
                }
                if((v1 & 16) == 0) {
                    v8 = v2;
                    buttonColors3 = buttonColors1;
                }
                else {
                    v8 = v2 & 0xFFFF1FFF;
                    buttonColors3 = ButtonDefaults.INSTANCE.filledTonalButtonColors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    v2 = v8;
                }
                else {
                    buttonElevation1 = ButtonDefaults.INSTANCE.filledTonalButtonElevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x30000, 0x1F);
                    v2 = v8 & 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    borderStroke1 = null;
                }
                paddingValues2 = (v1 & 0x80) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getContentPadding();
                if(v6 == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    v7 = v2;
                    borderStroke3 = borderStroke1;
                    z1 = z3;
                    shape1 = shape3;
                    buttonColors1 = buttonColors3;
                }
                else {
                    mutableInteractionSource1 = null;
                    z1 = z3;
                    shape1 = shape3;
                    buttonColors1 = buttonColors3;
                    v7 = v2;
                    borderStroke3 = borderStroke1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                paddingValues2 = paddingValues0;
                v7 = v2;
                borderStroke3 = borderStroke1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x999A8DE3, v7, -1, "androidx.compose.material3.FilledTonalButton (Button.kt:285)");
            }
            ButtonKt.Button(function00, modifier2, z1, shape1, buttonColors1, buttonElevation1, borderStroke3, paddingValues2, mutableInteractionSource1, function30, composer1, v7 & 0x7FFFFFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape2 = shape1;
            buttonElevation2 = buttonElevation1;
            paddingValues1 = paddingValues2;
            z2 = z1;
            buttonColors2 = buttonColors1;
            borderStroke2 = borderStroke3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            shape2 = shape1;
            buttonColors2 = buttonColors1;
            buttonElevation2 = buttonElevation1;
            borderStroke2 = borderStroke1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(function00, modifier1, z2, shape2, buttonColors2, buttonElevation2, borderStroke2, paddingValues1, mutableInteractionSource1, function30, v, v1, 2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OutlinedButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable ButtonColors buttonColors0, @Nullable ButtonElevation buttonElevation0, @Nullable BorderStroke borderStroke0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        PaddingValues paddingValues1;
        BorderStroke borderStroke1;
        ButtonElevation buttonElevation2;
        ButtonColors buttonColors1;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        ButtonElevation buttonElevation3;
        ButtonColors buttonColors2;
        Shape shape2;
        boolean z2;
        PaddingValues paddingValues2;
        ButtonElevation buttonElevation1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x9AFB4721);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(shape0) ? 0x400 : 0x800);
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(buttonColors0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            buttonElevation1 = buttonElevation0;
        }
        else if((0x30000 & v) == 0) {
            buttonElevation1 = buttonElevation0;
            v2 |= (composer1.changed(buttonElevation1) ? 0x20000 : 0x10000);
        }
        else {
            buttonElevation1 = buttonElevation0;
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(borderStroke0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                z2 = (v1 & 4) == 0 ? z : true;
                if((v1 & 8) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = ButtonDefaults.INSTANCE.getOutlinedShape(composer1, 6);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) == 0) {
                    buttonColors2 = buttonColors0;
                }
                else {
                    buttonColors2 = ButtonDefaults.INSTANCE.outlinedButtonColors(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                mutableInteractionSource2 = null;
                if((v1 & 0x20) != 0) {
                    buttonElevation1 = null;
                }
                if((v1 & 0x40) == 0) {
                    borderStroke2 = borderStroke0;
                }
                else {
                    borderStroke2 = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, composer1, v2 >> 6 & 14 | 0x30, 0);
                    v2 &= 0xFFC7FFFF;
                }
                paddingValues2 = (v1 & 0x80) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getContentPadding();
                if((v1 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                buttonElevation3 = buttonElevation1;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                paddingValues2 = paddingValues0;
                z2 = z;
                shape2 = shape0;
                buttonColors2 = buttonColors0;
                buttonElevation3 = buttonElevation1;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9AFB4721, v2, -1, "androidx.compose.material3.OutlinedButton (Button.kt:357)");
            }
            ButtonKt.Button(function00, modifier1, z2, shape2, buttonColors2, buttonElevation3, borderStroke2, paddingValues2, mutableInteractionSource2, function30, composer1, v2 & 0x7FFFFFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            shape1 = shape2;
            buttonElevation2 = buttonElevation3;
            paddingValues1 = paddingValues2;
            buttonColors1 = buttonColors2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape1 = shape0;
            buttonColors1 = buttonColors0;
            buttonElevation2 = buttonElevation1;
            borderStroke1 = borderStroke0;
            paddingValues1 = paddingValues0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(function00, modifier1, z1, shape1, buttonColors1, buttonElevation2, borderStroke1, paddingValues1, mutableInteractionSource1, function30, v, v1, 3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TextButton(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, @Nullable ButtonColors buttonColors0, @Nullable ButtonElevation buttonElevation0, @Nullable BorderStroke borderStroke0, @Nullable PaddingValues paddingValues0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        PaddingValues paddingValues1;
        BorderStroke borderStroke2;
        ButtonElevation buttonElevation2;
        ButtonColors buttonColors1;
        Shape shape1;
        boolean z1;
        Modifier modifier1;
        PaddingValues paddingValues2;
        int v3;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke3;
        ButtonElevation buttonElevation3;
        ButtonColors buttonColors2;
        Shape shape2;
        boolean z2;
        Modifier modifier2;
        BorderStroke borderStroke1;
        ButtonElevation buttonElevation1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-2106428362);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(shape0) ? 0x400 : 0x800);
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(buttonColors0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            buttonElevation1 = buttonElevation0;
        }
        else if((0x30000 & v) == 0) {
            buttonElevation1 = buttonElevation0;
            v2 |= (composer1.changed(buttonElevation1) ? 0x20000 : 0x10000);
        }
        else {
            buttonElevation1 = buttonElevation0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
            borderStroke1 = borderStroke0;
        }
        else if((0x180000 & v) == 0) {
            borderStroke1 = borderStroke0;
            v2 |= (composer1.changed(borderStroke1) ? 0x100000 : 0x80000);
        }
        else {
            borderStroke1 = borderStroke0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                z2 = (v1 & 4) == 0 ? z : true;
                if((v1 & 8) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = ButtonDefaults.INSTANCE.getTextShape(composer1, 6);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) == 0) {
                    buttonColors2 = buttonColors0;
                }
                else {
                    buttonColors2 = ButtonDefaults.INSTANCE.textButtonColors(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                mutableInteractionSource2 = null;
                if((v1 & 0x20) != 0) {
                    buttonElevation1 = null;
                }
                if((v1 & 0x40) != 0) {
                    borderStroke1 = null;
                }
                PaddingValues paddingValues3 = (v1 & 0x80) == 0 ? paddingValues0 : ButtonDefaults.INSTANCE.getTextButtonContentPadding();
                if((v1 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                v3 = v2;
                borderStroke3 = borderStroke1;
                paddingValues2 = paddingValues3;
                buttonElevation3 = buttonElevation1;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                z2 = z;
                shape2 = shape0;
                buttonColors2 = buttonColors0;
                buttonElevation3 = buttonElevation1;
                borderStroke3 = borderStroke1;
                mutableInteractionSource2 = mutableInteractionSource0;
                v3 = v2;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2106428362, v3, -1, "androidx.compose.material3.TextButton (Button.kt:430)");
            }
            ButtonKt.Button(function00, modifier2, z2, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, mutableInteractionSource2, function30, composer1, v3 & 0x7FFFFFFE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            paddingValues1 = paddingValues2;
            z1 = z2;
            buttonColors1 = buttonColors2;
            borderStroke2 = borderStroke3;
            modifier1 = modifier2;
            shape1 = shape2;
            buttonElevation2 = buttonElevation3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape1 = shape0;
            buttonColors1 = buttonColors0;
            buttonElevation2 = buttonElevation1;
            borderStroke2 = borderStroke1;
            paddingValues1 = paddingValues0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(function00, modifier1, z1, shape1, buttonColors1, buttonElevation2, borderStroke2, paddingValues1, mutableInteractionSource1, function30, v, v1, 4));
        }
    }
}


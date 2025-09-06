package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.oa;
import androidx.compose.material3.ua;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.d0;
import p0.o4;
import p0.p4;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001Ao\u0010\u0012\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\f2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000EH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0086\u0001\u0010\u0017\u001A\u00020\u00012\u0011\u0010\u0013\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000E2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u0015\b\u0002\u0010\u0014\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000E2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/material/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/runtime/Composable;", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "text", "icon", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,413:1\n25#2:414\n25#2:421\n1116#3,6:415\n1116#3,6:422\n154#4:428\n154#4:429\n154#4:430\n154#4:431\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n83#1:414\n150#1:421\n83#1:415,6\n150#1:422,6\n409#1:428\n410#1:429\n411#1:430\n412#1:431\n*E\n"})
public final class FloatingActionButtonKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        FloatingActionButtonKt.a = 56.0f;
        FloatingActionButtonKt.b = 48.0f;
        FloatingActionButtonKt.c = 12.0f;
        FloatingActionButtonKt.d = 20.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ExtendedFloatingActionButton-wqdebIU(@NotNull Function2 function20, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @Nullable Composer composer0, int v2, int v3) {
        long v7;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        Shape shape1;
        long v6;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function23;
        Modifier modifier2;
        long v9;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long v8;
        Shape shape2;
        long v10;
        long v5;
        MutableInteractionSource mutableInteractionSource1;
        Function2 function22;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xA34597FD);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v2 & 0x380) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function22 = function21;
        }
        else if((v2 & 0x1C00) == 0) {
            function22 = function21;
            v4 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        else {
            function22 = function21;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v2 & 0xE000) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v4 |= (composer1.changed(mutableInteractionSource1) ? 0x4000 : 0x2000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v2 & 0x70000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x380000) == 0) {
            v5 = v;
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(v5) ? 0x80000 : 0x100000);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((v2 & 0xE000000) == 0) {
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(floatingActionButtonElevation0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 8) != 0) {
                    function22 = null;
                }
                if((v3 & 16) != 0) {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource1 = mutableInteractionSource3;
                }
                if((v3 & 0x20) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSecondary-0d7_KjU();
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) == 0) {
                    v10 = v1;
                }
                else {
                    v10 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 18 & 14);
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation0;
                }
                else {
                    floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v4 &= 0xF1FFFFFF;
                }
                v9 = v5;
                v8 = v10;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) != 0) {
                    v4 &= 0xF1FFFFFF;
                }
                shape2 = shape0;
                v8 = v1;
                floatingActionButtonElevation2 = floatingActionButtonElevation0;
                v9 = v5;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA34597FD, v4, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:154)");
            }
            FloatingActionButtonKt.FloatingActionButton-bogVsAg(function00, SizeKt.sizeIn-qDBjuR0$default(modifier1, FloatingActionButtonKt.b, FloatingActionButtonKt.b, 0.0f, 0.0f, 12, null), mutableInteractionSource1, shape2, v9, v8, floatingActionButtonElevation2, ComposableLambdaKt.composableLambda(composer1, 0x5493F13B, true, new o4(function22, function20)), composer1, v4 >> 3 & 14 | 0xC00000 | v4 >> 6 & 0x380 | v4 >> 6 & 0x1C00 | 0xE000 & v4 >> 6 | 0x70000 & v4 >> 6 | v4 >> 6 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            function23 = function22;
            v6 = v9;
            v7 = v8;
            shape1 = shape2;
            floatingActionButtonElevation1 = floatingActionButtonElevation2;
            mutableInteractionSource2 = mutableInteractionSource1;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            function23 = function22;
            mutableInteractionSource2 = mutableInteractionSource1;
            v6 = v5;
            shape1 = shape0;
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
            v7 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d0(function20, function00, modifier2, function23, mutableInteractionSource2, shape1, v6, v7, floatingActionButtonElevation1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void FloatingActionButton-bogVsAg(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        long v9;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        long v8;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        long v12;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long v11;
        int v10;
        long v13;
        int v7;
        long v6;
        int v5;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x3D5511F0);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x70) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v2 & 0x380) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v4 |= (composer1.changed(mutableInteractionSource1) ? 0x100 : 0x80);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 8) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v5 = 0x400;
            }
            v4 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0xE000) == 0) {
            if((v3 & 16) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x4000 : 0x2000;
            }
            else {
                v6 = v;
                v7 = 0x2000;
            }
            v4 |= v7;
        }
        else {
            v6 = v;
        }
        if((v2 & 0x70000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v1) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x380000) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(floatingActionButtonElevation0) ? 0x80000 : 0x100000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v4) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 4) != 0) {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource1 = mutableInteractionSource3;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    shape1 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if((v3 & 16) != 0) {
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSecondary-0d7_KjU();
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) == 0) {
                    v13 = v1;
                }
                else {
                    v13 = ColorsKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 12 & 14);
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v10 = v4;
                    v11 = v6;
                    floatingActionButtonElevation2 = floatingActionButtonElevation0;
                }
                else {
                    floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v10 = v4 & 0xFFC7FFFF;
                    v11 = v6;
                }
                v12 = v13;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                v10 = v4;
                v11 = v6;
                floatingActionButtonElevation2 = floatingActionButtonElevation0;
                v12 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3D5511F0, v10, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:88)");
            }
            SurfaceKt.Surface-LPr_se0(function00, SemanticsModifierKt.semantics$default(modifier1, false, p4.w, 1, null), false, shape1, v11, v12, null, ((Dp)floatingActionButtonElevation2.elevation(mutableInteractionSource1, composer1, v10 >> 6 & 14 | v10 >> 15 & 0x70).getValue()).unbox-impl(), mutableInteractionSource1, ComposableLambdaKt.composableLambda(composer1, 0x7597A2B7, true, new ua(v12, function20, 1)), composer1, v10 & 14 | 0x30000000 | v10 & 0x1C00 | 0xE000 & v10 | 0x70000 & v10 | v10 << 18 & 0xE000000, 68);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            floatingActionButtonElevation1 = floatingActionButtonElevation2;
            modifier2 = modifier1;
            v8 = v11;
            mutableInteractionSource2 = mutableInteractionSource1;
            shape2 = shape1;
            v9 = v12;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            mutableInteractionSource2 = mutableInteractionSource1;
            shape2 = shape1;
            v8 = v6;
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
            v9 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new oa(function00, modifier2, mutableInteractionSource2, shape2, v8, v9, floatingActionButtonElevation1, function20, v2, v3));
        }
    }

    public static final float access$getExtendedFabIconPadding$p() [...] // 潜在的解密器

    public static final float access$getExtendedFabTextPadding$p() [...] // 潜在的解密器

    public static final float access$getFabSize$p() [...] // 潜在的解密器
}


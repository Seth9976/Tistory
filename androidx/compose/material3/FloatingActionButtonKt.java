package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\u001Aq\u0010\u0012\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001Aq\u0010\u0014\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0011\u001Aq\u0010\u0016\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0011\u001A|\u0010\u001C\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u001C\u0010\u000F\u001A\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017\u00A2\u0006\u0002\b\u000E\u00A2\u0006\u0002\b\u0019H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u008E\u0001\u0010\u001C\u001A\u00020\u00012\u0011\u0010\u001D\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u000E2\u0011\u0010\u001E\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u000E2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\fH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006#"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", "content", "FloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "SmallFloatingActionButton-X-z6DiA", "SmallFloatingActionButton", "LargeFloatingActionButton-X-z6DiA", "LargeFloatingActionButton", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "ExtendedFloatingActionButton-X-z6DiA", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "text", "icon", "", "expanded", "ExtendedFloatingActionButton-ElI5-7k", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n1223#2,6:703\n148#3:709\n148#3:710\n148#3:711\n148#3:712\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n109#1:703,6\n660#1:709\n662#1:710\n664#1:711\n666#1:712\n*E\n"})
public final class FloatingActionButtonKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final ExitTransition e;
    public static final EnterTransition f;

    static {
        FloatingActionButtonKt.a = 16.0f;
        FloatingActionButtonKt.b = 12.0f;
        FloatingActionButtonKt.c = 20.0f;
        FloatingActionButtonKt.d = 80.0f;
        FloatingActionButtonKt.e = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, MotionTokens.INSTANCE.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));
        FloatingActionButtonKt.f = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, MotionTokens.INSTANCE.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedCubicBezier(), 2, null), Alignment.Companion.getStart(), false, null, 12, null));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ExtendedFloatingActionButton-ElI5-7k(@NotNull Function2 function20, @NotNull Function2 function21, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v2, int v3) {
        MutableInteractionSource mutableInteractionSource1;
        long v8;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        long v7;
        Shape shape1;
        boolean z2;
        Modifier modifier1;
        long v9;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        int v6;
        long v5;
        boolean z1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-1387401842);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            z1 = z;
        }
        else if((v2 & 0x6000) == 0) {
            z1 = z;
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        else {
            z1 = z;
        }
        if((0x30000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((0x180000 & v2) == 0) {
            if((v3 & 0x40) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100000 : 0x80000;
            }
            else {
                v5 = v;
                v6 = 0x80000;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0xC00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v1) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x6000000) == 0) {
            v4 |= ((v3 & 0x100) != 0 || !composer1.changed(floatingActionButtonElevation0) ? 0x2000000 : 0x4000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((0x30000000 & v2) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 16) != 0) {
                    z1 = true;
                }
                if((v3 & 0x20) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composer1, 6);
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v7 = v5;
                }
                else {
                    v7 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) == 0) {
                    v9 = v1;
                }
                else {
                    v9 = ColorSchemeKt.contentColorFor-ek8zF_U(v7, composer1, v4 >> 18 & 14);
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation0;
                }
                else {
                    floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v4 &= 0xF1FFFFFF;
                }
                mutableInteractionSource2 = (v3 & 0x200) == 0 ? mutableInteractionSource0 : null;
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
                mutableInteractionSource2 = mutableInteractionSource0;
                modifier2 = modifier0;
                shape1 = shape0;
                v7 = v5;
                floatingActionButtonElevation2 = floatingActionButtonElevation0;
                v9 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1387401842, v4, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:364)");
            }
            FloatingActionButtonKt.FloatingActionButton-X-z6DiA(function00, modifier2, shape1, v7, v9, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0x45DD1A10, true, new qa(z1, function21, function20), composer1, 54), composer1, v4 >> 6 & 0x70 | (v4 >> 6 & 14 | 0xC00000) | v4 >> 9 & 0x380 | v4 >> 9 & 0x1C00 | 0xE000 & v4 >> 9 | 0x70000 & v4 >> 9 | v4 >> 9 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z1;
            modifier1 = modifier2;
            v8 = v9;
            floatingActionButtonElevation1 = floatingActionButtonElevation2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            shape1 = shape0;
            v7 = v5;
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
            v8 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ra(function20, function21, function00, modifier1, z2, shape1, v7, v8, floatingActionButtonElevation1, mutableInteractionSource1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExtendedFloatingActionButton-X-z6DiA(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long v12;
        long v11;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        int v13;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        int v17;
        long v16;
        long v15;
        int v14;
        Shape shape3;
        int v10;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xEC8D509D);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x100 : 0x80;
            }
            else {
                shape1 = shape0;
                v5 = 0x80;
            }
            v4 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v;
                v7 = 0x400;
            }
            v4 |= v7;
        }
        else {
            v6 = v;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v4 |= v9;
        }
        else {
            v8 = v1;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = composer1.changed(floatingActionButtonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = 0x10000;
            }
            v4 |= v10;
        }
        else {
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v4) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    shape3 = shape1;
                }
                else {
                    v4 &= -897;
                    shape3 = FloatingActionButtonDefaults.INSTANCE.getExtendedFabShape(composer1, 6);
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    v6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v3 & 16) == 0) {
                    v14 = v4;
                    v15 = v8;
                }
                else {
                    v14 = v4 & 0xFFFF1FFF;
                    v15 = ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 9 & 14);
                }
                if((v3 & 0x20) == 0) {
                    v16 = v6;
                    v17 = v14;
                }
                else {
                    v16 = v6;
                    floatingActionButtonElevation1 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v17 = v14 & 0xFFF8FFFF;
                }
                mutableInteractionSource2 = (v3 & 0x40) == 0 ? mutableInteractionSource0 : null;
                v13 = v17;
                floatingActionButtonElevation3 = floatingActionButtonElevation1;
                shape1 = shape3;
                v8 = v15;
                v6 = v16;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v13 = v4;
                floatingActionButtonElevation3 = floatingActionButtonElevation1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEC8D509D, v13, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:291)");
            }
            FloatingActionButtonKt.FloatingActionButton-X-z6DiA(function00, modifier2, shape1, v6, v8, floatingActionButtonElevation3, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0x17BFF99F, true, new na(function30), composer1, 54), composer1, v13 & 14 | 0xC00000 | v13 & 0x70 | v13 & 0x380 | v13 & 0x1C00 | 0xE000 & v13 | 0x70000 & v13 | v13 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            modifier1 = modifier2;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            floatingActionButtonElevation2 = floatingActionButtonElevation1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new oa(function00, modifier1, shape2, v11, v12, floatingActionButtonElevation2, mutableInteractionSource1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FloatingActionButton-X-z6DiA(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long v12;
        long v11;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource4;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        int v13;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        int v17;
        long v16;
        long v15;
        int v14;
        Shape shape3;
        int v10;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xD462C777);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x100 : 0x80;
            }
            else {
                shape1 = shape0;
                v5 = 0x80;
            }
            v4 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v;
                v7 = 0x400;
            }
            v4 |= v7;
        }
        else {
            v6 = v;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v4 |= v9;
        }
        else {
            v8 = v1;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = composer1.changed(floatingActionButtonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = 0x10000;
            }
            v4 |= v10;
        }
        else {
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v4) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    shape3 = shape1;
                }
                else {
                    v4 &= -897;
                    shape3 = FloatingActionButtonDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    v6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v3 & 16) == 0) {
                    v14 = v4;
                    v15 = v8;
                }
                else {
                    v14 = v4 & 0xFFFF1FFF;
                    v15 = ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 9 & 14);
                }
                if((v3 & 0x20) == 0) {
                    v16 = v6;
                    v17 = v14;
                }
                else {
                    v16 = v6;
                    floatingActionButtonElevation1 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v17 = v14 & 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v13 = v17;
                    floatingActionButtonElevation3 = floatingActionButtonElevation1;
                    shape1 = shape3;
                    v8 = v15;
                    v6 = v16;
                }
                else {
                    v13 = v17;
                    floatingActionButtonElevation3 = floatingActionButtonElevation1;
                    shape1 = shape3;
                    v8 = v15;
                    v6 = v16;
                    mutableInteractionSource2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v13 = v4;
                floatingActionButtonElevation3 = floatingActionButtonElevation1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD462C777, v13, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:106)");
            }
            composer1.startReplaceGroup(0x1EFAD54D);
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
            SurfaceKt.Surface-o_FOJdg(function00, SemanticsModifierKt.semantics$default(modifier2, false, sa.w, 1, null), false, shape1, v6, v8, floatingActionButtonElevation3.tonalElevation-D9Ej5fM$material3_release(), ((Dp)floatingActionButtonElevation3.shadowElevation$material3_release(mutableInteractionSource4, composer1, v13 >> 12 & 0x70).getValue()).unbox-impl(), null, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(0x4A770E02, true, new ua(v8, function20, 0), composer1, 54), composer1, v13 & 14 | v13 << 3 & 0x1C00 | 0xE000 & v13 << 3 | v13 << 3 & 0x70000, 6, 260);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            modifier1 = modifier2;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            floatingActionButtonElevation2 = floatingActionButtonElevation1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new va(function00, modifier1, shape2, v11, v12, floatingActionButtonElevation2, mutableInteractionSource1, function20, v2, v3, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void LargeFloatingActionButton-X-z6DiA(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long v12;
        long v11;
        Shape shape2;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        int v13;
        Modifier modifier2;
        int v17;
        long v16;
        long v15;
        int v14;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v10;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-1650866856);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x100 : 0x80;
            }
            else {
                shape1 = shape0;
                v5 = 0x80;
            }
            v4 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v;
                v7 = 0x400;
            }
            v4 |= v7;
        }
        else {
            v6 = v;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v4 |= v9;
        }
        else {
            v8 = v1;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = composer1.changed(floatingActionButtonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = 0x10000;
            }
            v4 |= v10;
        }
        else {
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((0x180000 & v2) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v4 |= (composer1.changed(mutableInteractionSource1) ? 0x100000 : 0x80000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    shape3 = shape1;
                }
                else {
                    v4 &= -897;
                    shape3 = FloatingActionButtonDefaults.INSTANCE.getLargeShape(composer1, 6);
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    v6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v3 & 16) == 0) {
                    v14 = v4;
                    v15 = v8;
                }
                else {
                    v14 = v4 & 0xFFFF1FFF;
                    v15 = ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 9 & 14);
                }
                if((v3 & 0x20) == 0) {
                    v16 = v6;
                    v17 = v14;
                }
                else {
                    v16 = v6;
                    floatingActionButtonElevation1 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v17 = v14 & 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v13 = v17;
                    floatingActionButtonElevation3 = floatingActionButtonElevation1;
                    mutableInteractionSource2 = mutableInteractionSource1;
                }
                else {
                    mutableInteractionSource2 = null;
                    v13 = v17;
                    floatingActionButtonElevation3 = floatingActionButtonElevation1;
                }
                shape1 = shape3;
                v8 = v15;
                v6 = v16;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                v13 = v4;
                floatingActionButtonElevation3 = floatingActionButtonElevation1;
                mutableInteractionSource2 = mutableInteractionSource1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650866856, v13, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:232)");
            }
            FloatingActionButtonKt.FloatingActionButton-X-z6DiA(function00, SizeKt.sizeIn-qDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 12, null), shape1, v6, v8, floatingActionButtonElevation3, mutableInteractionSource2, function20, composer1, v13 & 0x1FFFF8E, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            modifier1 = modifier2;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            floatingActionButtonElevation2 = floatingActionButtonElevation1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new va(function00, modifier1, shape2, v11, v12, floatingActionButtonElevation2, mutableInteractionSource1, function20, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SmallFloatingActionButton-X-z6DiA(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable FloatingActionButtonElevation floatingActionButtonElevation0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long v12;
        long v11;
        Shape shape2;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource2;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        int v13;
        Modifier modifier2;
        int v17;
        long v16;
        long v15;
        int v14;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v10;
        FloatingActionButtonElevation floatingActionButtonElevation1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1444748300);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x100 : 0x80;
            }
            else {
                shape1 = shape0;
                v5 = 0x80;
            }
            v4 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x800 : 0x400;
            }
            else {
                v6 = v;
                v7 = 0x400;
            }
            v4 |= v7;
        }
        else {
            v6 = v;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v4 |= v9;
        }
        else {
            v8 = v1;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = composer1.changed(floatingActionButtonElevation1) ? 0x20000 : 0x10000;
            }
            else {
                floatingActionButtonElevation1 = floatingActionButtonElevation0;
                v10 = 0x10000;
            }
            v4 |= v10;
        }
        else {
            floatingActionButtonElevation1 = floatingActionButtonElevation0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((0x180000 & v2) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v4 |= (composer1.changed(mutableInteractionSource1) ? 0x100000 : 0x80000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    shape3 = shape1;
                }
                else {
                    v4 &= -897;
                    shape3 = FloatingActionButtonDefaults.INSTANCE.getSmallShape(composer1, 6);
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                    v6 = FloatingActionButtonDefaults.INSTANCE.getContainerColor(composer1, 6);
                }
                if((v3 & 16) == 0) {
                    v14 = v4;
                    v15 = v8;
                }
                else {
                    v14 = v4 & 0xFFFF1FFF;
                    v15 = ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 9 & 14);
                }
                if((v3 & 0x20) == 0) {
                    v16 = v6;
                    v17 = v14;
                }
                else {
                    v16 = v6;
                    floatingActionButtonElevation1 = FloatingActionButtonDefaults.INSTANCE.elevation-xZ9-QkE(0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x6000, 15);
                    v17 = v14 & 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v13 = v17;
                    floatingActionButtonElevation3 = floatingActionButtonElevation1;
                    mutableInteractionSource2 = mutableInteractionSource1;
                }
                else {
                    mutableInteractionSource2 = null;
                    v13 = v17;
                    floatingActionButtonElevation3 = floatingActionButtonElevation1;
                }
                shape1 = shape3;
                v8 = v15;
                v6 = v16;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                v13 = v4;
                floatingActionButtonElevation3 = floatingActionButtonElevation1;
                mutableInteractionSource2 = mutableInteractionSource1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444748300, v13, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:176)");
            }
            FloatingActionButtonKt.FloatingActionButton-X-z6DiA(function00, SizeKt.sizeIn-qDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, 0.0f, 12, null), shape1, v6, v8, floatingActionButtonElevation3, mutableInteractionSource2, function20, composer1, v13 & 0x1FFFF8E, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            modifier1 = modifier2;
            floatingActionButtonElevation2 = floatingActionButtonElevation3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape2 = shape1;
            v11 = v6;
            v12 = v8;
            floatingActionButtonElevation2 = floatingActionButtonElevation1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new va(function00, modifier1, shape2, v11, v12, floatingActionButtonElevation2, mutableInteractionSource1, function20, v2, v3, 2));
        }
    }

    public static final float access$getExtendedFabMinimumWidth$p() [...] // 潜在的解密器

    public static final float access$getExtendedFabStartIconPadding$p() [...] // 潜在的解密器

    public static final float access$getExtendedFabTextPadding$p() [...] // 潜在的解密器
}


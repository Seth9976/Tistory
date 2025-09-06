package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.mm;
import androidx.compose.material3.nm;
import androidx.compose.material3.om;
import androidx.compose.material3.pm;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.h0;
import p0.j9;
import p0.k9;
import p0.l9;
import p0.m9;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ac\u0010\u0011\u001A\u00020\f2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\f0\u000B\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A\u0085\u0001\u0010\u0011\u001A\u00020\f2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00152\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\f0\u000B\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u008D\u0001\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u00132\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00152\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\f0\u000B\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001A\u0093\u0001\u0010\u0011\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\u00132\u0012\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u001D2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00152\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\f0\u000B\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001F\u001A\u00A9\u0001\u0010\u0011\u001A\u00020\f2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00152\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010$2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\f0\u000B\u00A2\u0006\u0002\b\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006("}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/Indication;", "indication", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,642:1\n154#2:643\n154#2:646\n154#2:656\n154#2:666\n154#2:676\n74#3:644\n74#3:654\n74#3:664\n74#3:674\n74#3:684\n74#3:685\n51#4:645\n51#4:655\n51#4:665\n51#4:675\n51#4:686\n25#5:647\n25#5:657\n25#5:667\n25#5:677\n1116#6,6:648\n1116#6,6:658\n1116#6,6:668\n1116#6,6:678\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n111#1:643\n220#1:646\n334#1:656\n449#1:666\n577#1:676\n114#1:644\n224#1:654\n338#1:664\n453#1:674\n579#1:684\n585#1:685\n114#1:645\n224#1:655\n338#1:665\n453#1:675\n585#1:686\n221#1:647\n335#1:657\n450#1:667\n578#1:677\n221#1:648,6\n335#1:658,6\n450#1:668,6\n578#1:678,6\n*E\n"})
public final class SurfaceKt {
    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    public static final void Surface-9VG74zQ(@NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z, @Nullable String s, @Nullable Role role0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        boolean z1;
        Indication indication1;
        long v10;
        Role role1;
        String s1;
        MutableInteractionSource mutableInteractionSource1;
        float f1;
        BorderStroke borderStroke1;
        long v9;
        Shape shape1;
        Modifier modifier1;
        boolean z2;
        int v12;
        Role role2;
        String s2;
        Indication indication2;
        MutableInteractionSource mutableInteractionSource2;
        float f2;
        BorderStroke borderStroke2;
        long v11;
        Shape shape2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource4;
        float f4;
        int v7;
        long v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x5E874D70);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(shape0) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v5 |= ((v4 & 8) != 0 || !composer1.changed(v) ? 0x400 : 0x800);
        }
        if((v2 & 0xE000) == 0) {
            v6 = v1;
            v5 |= ((v4 & 16) != 0 || !composer1.changed(v6) ? 0x2000 : 0x4000);
        }
        else {
            v6 = v1;
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.changed(borderStroke0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0xE000000) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.changed(indication0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changed(z) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v7 = (v3 & 14) == 0 ? v3 | (composer1.changed(s) ? 4 : 2) : v3;
        }
        else {
            v7 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v7 |= (composer1.changed(role0) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v4 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v8 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (v8 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                shape2 = (v4 & 4) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
                if((v4 & 8) == 0) {
                    v11 = v;
                }
                else {
                    v11 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v6 = ColorsKt.contentColorFor-ek8zF_U(v11, composer1, v5 >> 9 & 14);
                    v5 &= 0xFFFF1FFF;
                }
                float f3 = (v4 & 0x40) == 0 ? f : 0.0f;
                if((v4 & 0x80) == 0) {
                    f4 = f3;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    f4 = f3;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v4 & 0x100) == 0) {
                    indication2 = indication0;
                }
                else {
                    indication2 = (Indication)composer1.consume(IndicationKt.getLocalIndication());
                    v5 &= 0xF1FFFFFF;
                }
                String s3 = (v4 & 0x400) == 0 ? s : null;
                if((v4 & 0x800) == 0) {
                    role2 = role0;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    s2 = s3;
                    v12 = v5;
                }
                else {
                    mutableInteractionSource2 = mutableInteractionSource4;
                    s2 = s3;
                    v12 = v5;
                    role2 = null;
                }
                modifier2 = modifier3;
                f2 = f4;
                z2 = (v4 & 0x200) == 0 ? z : true;
                borderStroke2 = (v4 & 0x20) == 0 ? borderStroke0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x100) != 0) {
                    v5 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                shape2 = shape0;
                v11 = v;
                borderStroke2 = borderStroke0;
                f2 = f;
                mutableInteractionSource2 = mutableInteractionSource0;
                indication2 = indication0;
                s2 = s;
                role2 = role0;
                v12 = v5;
                z2 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5E874D70, v12, v8, "androidx.compose.material.Surface (Surface.kt:583)");
            }
            float f5 = Dp.constructor-impl(((Dp)composer1.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).unbox-impl() + f2);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.box-impl(f5))}, ComposableLambdaKt.composableLambda(composer1, 0x8EAA230, true, new k9(modifier2, shape2, v11, f5, borderStroke2, f2, mutableInteractionSource2, indication2, z2, s2, role2, function00, function20)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke1 = borderStroke2;
            s1 = s2;
            role1 = role2;
            modifier1 = modifier2;
            f1 = f2;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape1 = shape2;
            z1 = z2;
            indication1 = indication2;
            v9 = v11;
            v10 = v6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            v9 = v;
            borderStroke1 = borderStroke0;
            f1 = f;
            mutableInteractionSource1 = mutableInteractionSource0;
            s1 = s;
            role1 = role0;
            v10 = v6;
            indication1 = indication0;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l9(function00, modifier1, shape1, v9, v10, borderStroke1, f1, mutableInteractionSource1, indication1, z1, s1, role1, function20, v2, v3, v4));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-F-jzlyU(@Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        Modifier modifier2;
        float f1;
        BorderStroke borderStroke1;
        long v7;
        int v6;
        long v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1412203386);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            shape1 = shape0;
        }
        else if((v2 & 0x70) == 0) {
            shape1 = shape0;
            v4 |= (composer1.changed(shape1) ? 0x20 : 16);
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0x380) == 0) {
            if((v3 & 4) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100 : 0x80;
            }
            else {
                v5 = v;
                v6 = 0x80;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x1C00) == 0) {
            v7 = v1;
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v7) ? 0x400 : 0x800);
        }
        else {
            v7 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            borderStroke1 = borderStroke0;
        }
        else if((0xE000 & v2) == 0) {
            borderStroke1 = borderStroke0;
            v4 |= (composer1.changed(borderStroke1) ? 0x4000 : 0x2000);
        }
        else {
            borderStroke1 = borderStroke0;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            f1 = f;
        }
        else if((0x70000 & v2) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    shape1 = RectangleShapeKt.getRectangleShape();
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                    v5 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v3 & 8) != 0) {
                    long v8 = ColorsKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                    v7 = v8;
                }
                if((v3 & 16) != 0) {
                    borderStroke1 = null;
                }
                if((v3 & 0x20) != 0) {
                    f1 = 0.0f;
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
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412203386, v4, -1, "androidx.compose.material.Surface (Surface.kt:112)");
            }
            float f2 = Dp.constructor-impl(((Dp)composer1.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).unbox-impl() + f1);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v7)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.box-impl(f2))}, ComposableLambdaKt.composableLambda(composer1, 0x9364083A, true, new mm(modifier2, shape1, v5, f2, borderStroke1, f1, function20, 1)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(modifier1, shape1, v5, v7, borderStroke1, f1, function20, v2, v3));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-LPr_se0(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        BorderStroke borderStroke1;
        long v7;
        boolean z2;
        MutableInteractionSource mutableInteractionSource1;
        long v6;
        Shape shape1;
        Modifier modifier1;
        float f2;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        long v5;
        boolean z1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x5D0914CD);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            z1 = z;
        }
        else if((v2 & 0x380) == 0) {
            z1 = z;
            v4 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(shape0) ? 0x800 : 0x400);
        }
        if((0xE000 & v2) == 0) {
            v4 |= ((v3 & 16) != 0 || !composer1.changed(v) ? 0x2000 : 0x4000);
        }
        if((0x70000 & v2) == 0) {
            v5 = v1;
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v5) ? 0x10000 : 0x20000);
        }
        else {
            v5 = v1;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((0x380000 & v2) == 0) {
            v4 |= (composer1.changed(borderStroke0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((0x70000000 & v2) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) != 0) {
                    z1 = true;
                }
                shape1 = (v3 & 8) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
                if((v3 & 16) == 0) {
                    v6 = v;
                }
                else {
                    v4 &= 0xFFFF1FFF;
                    v6 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                }
                if((v3 & 0x20) != 0) {
                    v5 = ColorsKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 12 & 14);
                    v4 &= 0xFFF8FFFF;
                }
                borderStroke2 = (v3 & 0x40) == 0 ? borderStroke0 : null;
                f2 = (v3 & 0x80) == 0 ? f : 0.0f;
                if((v3 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier1 = modifier0;
                shape1 = shape0;
                v6 = v;
                mutableInteractionSource2 = mutableInteractionSource0;
                borderStroke2 = borderStroke0;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5D0914CD, v4, -1, "androidx.compose.material.Surface (Surface.kt:222)");
            }
            float f3 = Dp.constructor-impl(((Dp)composer1.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).unbox-impl() + f2);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.box-impl(f3))}, ComposableLambdaKt.composableLambda(composer1, 2031491085, true, new nm(modifier1, shape1, v6, f3, borderStroke2, f2, mutableInteractionSource2, z1, function00, function20)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z1;
            v7 = v5;
            borderStroke1 = borderStroke2;
            f1 = f2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            v6 = v;
            mutableInteractionSource1 = mutableInteractionSource0;
            z2 = z1;
            v7 = v5;
            borderStroke1 = borderStroke0;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m9(function00, modifier1, z2, shape1, v6, v7, borderStroke1, f1, mutableInteractionSource1, function20, v2, v3));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-Ny5ogXk(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        MutableInteractionSource mutableInteractionSource1;
        long v8;
        BorderStroke borderStroke1;
        Shape shape1;
        boolean z3;
        Modifier modifier1;
        float f1;
        long v7;
        float f2;
        long v10;
        long v9;
        BorderStroke borderStroke2;
        Shape shape2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        int v6;
        boolean z2;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xF9E37F1);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            z2 = z1;
        }
        else if((v2 & 0x1C00) == 0) {
            z2 = z1;
            v5 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v5 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v2) == 0) {
            v5 |= ((v4 & 0x20) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x380000) == 0) {
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v1) ? 0x80000 : 0x100000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(borderStroke0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v6 = (v3 & 14) == 0 ? v3 | (composer1.changedInstance(function20) ? 4 : 2) : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (v6 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 8) != 0) {
                    z2 = true;
                }
                shape2 = (v4 & 16) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
                if((v4 & 0x20) == 0) {
                    v9 = v;
                }
                else {
                    v9 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) == 0) {
                    v10 = v1;
                }
                else {
                    v10 = ColorsKt.contentColorFor-ek8zF_U(v9, composer1, v5 >> 15 & 14);
                    v5 &= 0xFFC7FFFF;
                }
                borderStroke2 = (v4 & 0x80) == 0 ? borderStroke0 : null;
                f2 = (v4 & 0x100) == 0 ? f : 0.0f;
                if((v4 & 0x200) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                modifier2 = modifier0;
                shape2 = shape0;
                borderStroke2 = borderStroke0;
                v9 = v;
                v10 = v1;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF9E37F1, v5, v6, "androidx.compose.material.Surface (Surface.kt:336)");
            }
            float f3 = Dp.constructor-impl(((Dp)composer1.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).unbox-impl() + f2);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v10)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.box-impl(f3))}, ComposableLambdaKt.composableLambda(composer1, 0xAD13FB31, true, new om(modifier2, shape2, v9, f3, borderStroke2, f2, z, mutableInteractionSource2, z2, function00, function20)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
            v7 = v9;
            z3 = z2;
            v8 = v10;
            f1 = f2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            v7 = v;
            f1 = f;
            modifier1 = modifier0;
            z3 = z2;
            shape1 = shape0;
            borderStroke1 = borderStroke0;
            v8 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j9(z, function00, modifier1, z3, shape1, v7, v8, borderStroke1, f1, mutableInteractionSource1, function20, v2, v3, v4, 1));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-Ny5ogXk(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, long v, long v1, @Nullable BorderStroke borderStroke0, float f, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        MutableInteractionSource mutableInteractionSource1;
        long v8;
        BorderStroke borderStroke1;
        Shape shape1;
        boolean z3;
        Modifier modifier1;
        float f1;
        long v7;
        float f2;
        long v10;
        long v9;
        BorderStroke borderStroke2;
        Shape shape2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        int v6;
        boolean z2;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x4FF6B910);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            z2 = z1;
        }
        else if((v2 & 0x1C00) == 0) {
            z2 = z1;
            v5 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v5 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v2) == 0) {
            v5 |= ((v4 & 0x20) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x380000) == 0) {
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v1) ? 0x80000 : 0x100000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(borderStroke0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v6 = (v3 & 14) == 0 ? v3 | (composer1.changedInstance(function20) ? 4 : 2) : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (v6 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 8) != 0) {
                    z2 = true;
                }
                shape2 = (v4 & 16) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
                if((v4 & 0x20) == 0) {
                    v9 = v;
                }
                else {
                    v9 = MaterialTheme.INSTANCE.getColors(composer1, 6).getSurface-0d7_KjU();
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) == 0) {
                    v10 = v1;
                }
                else {
                    v10 = ColorsKt.contentColorFor-ek8zF_U(v9, composer1, v5 >> 15 & 14);
                    v5 &= 0xFFC7FFFF;
                }
                borderStroke2 = (v4 & 0x80) == 0 ? borderStroke0 : null;
                f2 = (v4 & 0x100) == 0 ? f : 0.0f;
                if((v4 & 0x200) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                modifier2 = modifier0;
                shape2 = shape0;
                borderStroke2 = borderStroke0;
                v9 = v;
                v10 = v1;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4FF6B910, v5, v6, "androidx.compose.material.Surface (Surface.kt:451)");
            }
            float f3 = Dp.constructor-impl(((Dp)composer1.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).unbox-impl() + f2);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v10)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.box-impl(f3))}, ComposableLambdaKt.composableLambda(composer1, 0xED6C7C50, true, new pm(modifier2, shape2, v9, f3, borderStroke2, f2, z, mutableInteractionSource2, z2, function10, function20)), composer1, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
            v7 = v9;
            z3 = z2;
            v8 = v10;
            f1 = f2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            v7 = v;
            f1 = f;
            modifier1 = modifier0;
            z3 = z2;
            shape1 = shape0;
            borderStroke1 = borderStroke0;
            v8 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j9(z, function10, modifier1, z3, shape1, v7, v8, borderStroke1, f1, mutableInteractionSource1, function20, v2, v3, v4, 0));
        }
    }

    public static final Modifier access$surface-8ww4TTg(Modifier modifier0, Shape shape0, long v, BorderStroke borderStroke0, float f) {
        Modifier modifier1 = ShadowKt.shadow-s4CzXII$default(modifier0, f, shape0, false, 0L, 0L, 24, null);
        return borderStroke0 == null ? ClipKt.clip(BackgroundKt.background-bw27NRU(modifier1.then(Modifier.Companion), v, shape0), shape0) : ClipKt.clip(BackgroundKt.background-bw27NRU(modifier1.then(BorderKt.border(Modifier.Companion, borderStroke0, shape0)), v, shape0), shape0);
    }

    public static final long access$surfaceColorAtElevation-cq6XJ1M(long v, ElevationOverlay elevationOverlay0, float f, Composer composer0, int v1) {
        composer0.startReplaceableGroup(0x5D144BF8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5D144BF8, v1, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:634)");
        }
        if(Color.equals-impl0(v, MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU()) && elevationOverlay0 != null) {
            v = elevationOverlay0.apply-7g2Lkgo(v, f, composer0, v1 & 14 | v1 >> 3 & 0x70 | v1 << 3 & 0x380);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return v;
    }
}


package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.v3;
import androidx.compose.material3.y;
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
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.i2;
import p0.k2;
import p0.l2;
import p0.n2;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0090\u0001\u0010\u0015\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000F2\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000F¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001AÆ\u0001\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u0017\u001A\u00020\u00052\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00182\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000F2\u0015\b\u0002\u0010\u0019\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000F2\u0015\b\u0002\u0010\u001A\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000F2\u001C\u0010\u0014\u001A\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000F¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006 ²\u0006\f\u0010\u001E\u001A\u00020\u001D8\nX\u008A\u0084\u0002²\u0006\f\u0010\u001F\u001A\u00020\u001D8\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/ChipColors;", "colors", "Landroidx/compose/runtime/Composable;", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "Chip", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "FilterChip", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,761:1\n25#2:762\n25#2:769\n1116#3,6:763\n1116#3,6:770\n81#4:776\n154#5:777\n154#5:778\n154#5:779\n154#5:780\n154#5:781\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n93#1:762\n190#1:769\n93#1:763,6\n190#1:770,6\n100#1:776\n730#1:777\n735#1:778\n740#1:779\n745#1:780\n760#1:781\n*E\n"})
public final class ChipKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        ChipKt.a = 12.0f;
        ChipKt.b = 4.0f;
        ChipKt.c = 8.0f;
        ChipKt.d = 8.0f;
        ChipKt.e = 24.0f;
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Chip(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable BorderStroke borderStroke0, @Nullable ChipColors chipColors0, @Nullable Function2 function20, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        ChipColors chipColors1;
        Function2 function21;
        BorderStroke borderStroke1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        boolean z2;
        Modifier modifier1;
        ChipColors chipColors2;
        Function2 function22;
        BorderStroke borderStroke2;
        Shape shape2;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEA0AB788);
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
            v2 |= ((v1 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(chipColors0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                    if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource2);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource1 = mutableInteractionSource2;
                }
                if((v1 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    v2 &= 0xFFFF1FFF;
                }
                borderStroke2 = (v1 & 0x20) == 0 ? borderStroke0 : null;
                if((v1 & 0x40) == 0) {
                    chipColors2 = chipColors0;
                }
                else {
                    chipColors2 = ChipDefaults.INSTANCE.chipColors-5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composer1, 0x180000, 0x3F);
                    v2 &= 0xFFC7FFFF;
                }
                function22 = (v1 & 0x80) == 0 ? function20 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                mutableInteractionSource1 = mutableInteractionSource0;
                shape2 = shape0;
                borderStroke2 = borderStroke0;
                function22 = function20;
                chipColors2 = chipColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEA0AB788, v2, -1, "androidx.compose.material.Chip (Chip.kt:98)");
            }
            int v3 = v2 >> 6 & 14 | v2 >> 15 & 0x70;
            State state0 = chipColors2.contentColor(z1, composer1, v3);
            SurfaceKt.Surface-LPr_se0(function00, SemanticsModifierKt.semantics$default(modifier1, false, i2.w, 1, null), z1, shape2, ((Color)chipColors2.backgroundColor(z1, composer1, v3).getValue()).unbox-impl(), Color.copy-wmQWz5c$default(((Color)state0.getValue()).unbox-impl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource1, ComposableLambdaKt.composableLambda(composer1, 0x84A244F, true, new k2(state0, function22, chipColors2, z1, function30)), composer1, v2 & 14 | 0x30000000 | v2 & 0x380 | v2 >> 3 & 0x1C00 | v2 << 3 & 0x380000 | v2 << 15 & 0xE000000, 0x80);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            z2 = z1;
            borderStroke1 = borderStroke2;
            chipColors1 = chipColors2;
            function21 = function22;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            borderStroke1 = borderStroke0;
            function21 = function20;
            chipColors1 = chipColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(function00, modifier1, z2, mutableInteractionSource1, shape1, borderStroke1, chipColors1, function21, function30, v, v1));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void FilterChip(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable BorderStroke borderStroke0, @Nullable SelectableChipColors selectableChipColors0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1, int v2) {
        boolean z2;
        Function2 function25;
        Function2 function24;
        Function2 function23;
        SelectableChipColors selectableChipColors1;
        BorderStroke borderStroke1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        Modifier modifier1;
        boolean z3;
        int v5;
        Function2 function28;
        Function2 function27;
        Function2 function26;
        SelectableChipColors selectableChipColors2;
        BorderStroke borderStroke2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        SelectableChipColors selectableChipColors3;
        Shape shape3;
        int v6;
        MutableInteractionSource mutableInteractionSource4;
        int v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xB4F201CA);
        if((v2 & 1) == 0) {
            v3 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v3 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v & 0x70000) == 0) {
            v3 |= ((v2 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v3 |= (composer1.changed(borderStroke0) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            v3 |= ((v2 & 0x80) != 0 || !composer1.changed(selectableChipColors0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v4 = (v1 & 14) == 0 ? v1 | (composer1.changedInstance(function22) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v3 & 0x5B6DB6DB) != 306783378 || (v4 & 91) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
                boolean z4 = (v2 & 8) == 0 ? z1 : true;
                if((v2 & 16) == 0) {
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
                if((v2 & 0x20) == 0) {
                    v6 = v3;
                    shape3 = shape0;
                }
                else {
                    v6 = v3 & 0xFFF8FFFF;
                    shape3 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                borderStroke2 = (v2 & 0x40) == 0 ? borderStroke0 : null;
                if((v2 & 0x80) == 0) {
                    selectableChipColors3 = selectableChipColors0;
                }
                else {
                    selectableChipColors3 = ChipDefaults.INSTANCE.filterChipColors-J08w3-E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0x30000000, 0x1FF);
                    v6 &= 0xFE3FFFFF;
                }
                Function2 function29 = (v2 & 0x100) == 0 ? function20 : null;
                Function2 function210 = (v2 & 0x200) == 0 ? function21 : null;
                if((v2 & 0x400) == 0) {
                    function28 = function22;
                    function26 = function29;
                    shape2 = shape3;
                    function27 = function210;
                    modifier2 = modifier3;
                    z3 = z4;
                }
                else {
                    function26 = function29;
                    shape2 = shape3;
                    function27 = function210;
                    modifier2 = modifier3;
                    z3 = z4;
                    function28 = null;
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                selectableChipColors2 = selectableChipColors3;
                v5 = v6;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFF8FFFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
                borderStroke2 = borderStroke0;
                selectableChipColors2 = selectableChipColors0;
                function26 = function20;
                function27 = function21;
                function28 = function22;
                v5 = v3;
                z3 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB4F201CA, v5, v4, "androidx.compose.material.FilterChip (Chip.kt:197)");
            }
            int v7 = v5 >> 15 & 0x380 | (v5 >> 9 & 14 | v5 << 3 & 0x70);
            State state0 = selectableChipColors2.contentColor(z3, z, composer1, v7);
            SurfaceKt.Surface-Ny5ogXk(z, function00, SemanticsModifierKt.semantics$default(modifier2, false, l2.w, 1, null), z3, shape2, ((Color)selectableChipColors2.backgroundColor(z3, z, composer1, v7).getValue()).unbox-impl(), Color.copy-wmQWz5c$default(((Color)state0.getValue()).unbox-impl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composer1, 0x2B0AC65F, true, new n2(state0, function26, z, function27, function28, function30, selectableChipColors2, z3)), composer1, v5 & 7294 | v5 >> 3 & 0xE000 | v5 << 3 & 0x1C00000 | v5 << 15 & 0x70000000, 6, 0x100);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            shape1 = shape2;
            function23 = function26;
            function24 = function27;
            function25 = function28;
            selectableChipColors1 = selectableChipColors2;
            z2 = z3;
            modifier1 = modifier2;
            borderStroke1 = borderStroke2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            borderStroke1 = borderStroke0;
            selectableChipColors1 = selectableChipColors0;
            function23 = function20;
            function24 = function21;
            function25 = function22;
            z2 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v3(z, function00, modifier1, z2, mutableInteractionSource1, shape1, borderStroke1, selectableChipColors1, function23, function24, function25, function30, v, v1, v2));
        }
    }

    public static final long access$Chip$lambda$1(State state0) {
        return ((Color)state0.getValue()).unbox-impl();
    }

    public static final float access$getHorizontalPadding$p() [...] // 潜在的解密器

    public static final float access$getLeadingIconEndSpacing$p() [...] // 潜在的解密器

    public static final float access$getLeadingIconStartSpacing$p() [...] // 潜在的解密器

    public static final float access$getSelectedIconContainerSize$p() [...] // 潜在的解密器

    public static final float access$getTrailingIconSpacing$p() [...] // 潜在的解密器
}


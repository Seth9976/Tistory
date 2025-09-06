package androidx.compose.material;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.c3;
import androidx.compose.material3.d3;
import androidx.compose.material3.e3;
import androidx.compose.material3.f3;
import androidx.compose.material3.i3;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.f2;
import p0.g2;
import p0.h2;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AU\u0010\f\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001AO\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u000E2\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001B²\u0006\f\u0010\u0015\u001A\u00020\u00148\nX\u008A\u0084\u0002²\u0006\f\u0010\u0016\u001A\u00020\u00148\nX\u008A\u0084\u0002²\u0006\f\u0010\u0018\u001A\u00020\u00178\nX\u008A\u0084\u0002²\u0006\f\u0010\u0019\u001A\u00020\u00178\nX\u008A\u0084\u0002²\u0006\f\u0010\u001A\u001A\u00020\u00178\nX\u008A\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/CheckboxColors;", "colors", "Checkbox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "", "checkDrawFraction", "checkCenterGravitationShiftFraction", "Landroidx/compose/ui/graphics/Color;", "checkColor", "boxColor", "borderColor", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,485:1\n25#2:486\n25#2:499\n25#2:524\n1116#3,6:487\n1116#3,6:493\n1116#3,6:500\n1116#3,6:525\n1116#3,6:531\n1163#4,4:506\n1083#4,5:510\n1163#4,4:515\n1083#4,5:519\n81#5:537\n81#5:538\n81#5:539\n81#5:540\n81#5:541\n154#6:542\n154#6:543\n154#6:544\n154#6:545\n154#6:546\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n91#1:486\n137#1:499\n297#1:524\n91#1:487,6\n96#1:493,6\n137#1:500,6\n297#1:525,6\n301#1:531,6\n266#1:506,4\n266#1:510,5\n282#1:515,4\n282#1:519,5\n266#1:537\n282#1:538\n298#1:539\n299#1:540\n300#1:541\n480#1:542\n481#1:543\n482#1:544\n483#1:545\n484#1:546\n*E\n"})
public final class CheckboxKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ToggleableState.values().length];
            try {
                arr_v[ToggleableState.On.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.Off.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ToggleableState.Indeterminate.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        CheckboxKt.a = 24.0f;
        CheckboxKt.b = 2.0f;
        CheckboxKt.c = 20.0f;
        CheckboxKt.d = 2.0f;
        CheckboxKt.e = 2.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Checkbox(boolean z, @Nullable Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable CheckboxColors checkboxColors0, @Nullable Composer composer0, int v, int v1) {
        CheckboxColors checkboxColors1;
        MutableInteractionSource mutableInteractionSource1;
        boolean z2;
        Modifier modifier1;
        Function0 function00;
        CheckboxColors checkboxColors2;
        boolean z3;
        int v3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-2118660998);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(checkboxColors0) ? 0x10000 : 0x20000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                z3 = (v1 & 8) == 0 ? z1 : true;
                if((v1 & 16) == 0) {
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
                if((v1 & 0x20) == 0) {
                    v3 = v2;
                    checkboxColors2 = checkboxColors0;
                }
                else {
                    v3 = v2 & 0xFFF8FFFF;
                    checkboxColors2 = CheckboxDefaults.INSTANCE.colors-zjMxDiM(0L, 0L, 0L, 0L, 0L, composer1, 0x30000, 0x1F);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v3 = v2;
                modifier1 = modifier0;
                z3 = z1;
                mutableInteractionSource1 = mutableInteractionSource0;
                checkboxColors2 = checkboxColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118660998, v3, -1, "androidx.compose.material.Checkbox (Checkbox.kt:92)");
            }
            ToggleableState toggleableState0 = ToggleableStateKt.ToggleableState(z);
            if(function10 == null) {
                function00 = null;
            }
            else {
                composer1.startReplaceableGroup(2084314017);
                boolean z4 = composer1.changedInstance(function10);
                boolean z5 = composer1.changed(z);
                c3 c30 = composer1.rememberedValue();
                if(z4 || z5 || c30 == Composer.Companion.getEmpty()) {
                    c30 = new c3(3, z, function10);
                    composer1.updateRememberedValue(c30);
                }
                composer1.endReplaceableGroup();
                function00 = c30;
            }
            CheckboxKt.TriStateCheckbox(toggleableState0, function00, modifier1, z3, mutableInteractionSource1, checkboxColors2, composer1, v3 & 0x7FF80, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            checkboxColors1 = checkboxColors2;
            z2 = z3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource0;
            checkboxColors1 = checkboxColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(z, function10, modifier1, z2, mutableInteractionSource1, checkboxColors1, v, v1, 3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TriStateCheckbox(@NotNull ToggleableState toggleableState0, @Nullable Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable CheckboxColors checkboxColors0, @Nullable Composer composer0, int v, int v1) {
        CheckboxColors checkboxColors1;
        MutableInteractionSource mutableInteractionSource1;
        boolean z1;
        Modifier modifier5;
        Modifier modifier4;
        int v4;
        int v3;
        CheckboxColors checkboxColors2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2031255194);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(toggleableState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x380) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(checkboxColors0) ? 0x10000 : 0x20000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
                boolean z3 = (v1 & 8) == 0 ? z : true;
                if((v1 & 16) == 0) {
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
                if((v1 & 0x20) == 0) {
                    z2 = z3;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    checkboxColors2 = checkboxColors0;
                }
                else {
                    v2 &= 0xFFF8FFFF;
                    z2 = z3;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    checkboxColors2 = CheckboxDefaults.INSTANCE.colors-zjMxDiM(0L, 0L, 0L, 0L, 0L, composer1, 0x30000, 0x1F);
                }
                v3 = v2;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                modifier2 = modifier1;
                z2 = z;
                mutableInteractionSource2 = mutableInteractionSource0;
                checkboxColors2 = checkboxColors0;
                v3 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031255194, v3, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
            }
            composer1.startReplaceableGroup(0xA58C0836);
            if(function00 == null) {
                v4 = v3;
                modifier4 = modifier2;
                modifier5 = Modifier.Companion;
            }
            else {
                Indication indication0 = RippleKt.rememberRipple-9IZ8Weo(false, CheckboxKt.a, 0L, composer1, 54, 4);
                Role role0 = Role.box-impl(1);
                v4 = v3;
                modifier4 = modifier2;
                modifier5 = ToggleableKt.triStateToggleable-O2vRcR0(Modifier.Companion, toggleableState0, mutableInteractionSource2, indication0, z2, role0, function00);
            }
            composer1.endReplaceableGroup();
            Modifier modifier6 = function00 == null ? Modifier.Companion : InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            CheckboxKt.a(z2, toggleableState0, PaddingKt.padding-3ABfNKs(modifier4.then(modifier6).then(modifier5), CheckboxKt.b), checkboxColors2, composer1, v4 >> 9 & 14 | v4 << 3 & 0x70 | v4 >> 6 & 0x1C00);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier4;
            z1 = z2;
            mutableInteractionSource1 = mutableInteractionSource2;
            checkboxColors1 = checkboxColors2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
            mutableInteractionSource1 = mutableInteractionSource0;
            checkboxColors1 = checkboxColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(toggleableState0, function00, modifier1, z1, mutableInteractionSource1, checkboxColors1, v, v1));
        }
    }

    public static final void a(boolean z, ToggleableState toggleableState0, Modifier modifier0, CheckboxColors checkboxColors0, Composer composer0, int v) {
        float f3;
        float f2;
        float f1;
        Composer composer1 = composer0.startRestartGroup(0x81B43791);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(toggleableState0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(checkboxColors0) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x81B43791, v1, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:263)");
            }
            int v2 = v1 >> 3 & 14;
            Transition transition0 = TransitionKt.updateTransition(toggleableState0, null, composer1, v2, 2);
            composer1.startReplaceableGroup(0xB03404EB);
            FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            composer1.startReplaceableGroup(0xF77F2E11);
            ToggleableState toggleableState1 = (ToggleableState)transition0.getCurrentState();
            composer1.startReplaceableGroup(0x94CF6C8C);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x94CF6C8C, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:274)");
            }
            int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
            float f = 0.0f;
            switch(arr_v[toggleableState1.ordinal()]) {
                case 2: {
                    f1 = 0.0f;
                    break;
                }
                case 1: 
                case 3: {
                    f1 = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Float float0 = f1;
            ToggleableState toggleableState2 = (ToggleableState)transition0.getTargetState();
            composer1.startReplaceableGroup(0x94CF6C8C);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x94CF6C8C, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:274)");
            }
            int v3 = arr_v[toggleableState2.ordinal()];
            switch(v3) {
                case 1: {
                    f2 = 1.0f;
                    break;
                }
                case 2: {
                    f2 = 0.0f;
                    break;
                }
                default: {
                    if(v3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 1.0f;
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Segment transition$Segment0 = transition0.getSegment();
            State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f2, ((FiniteAnimationSpec)h2.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "FloatAnimation", composer1, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xB03404EB);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            composer1.startReplaceableGroup(0xF77F2E11);
            ToggleableState toggleableState3 = (ToggleableState)transition0.getCurrentState();
            composer1.startReplaceableGroup(-2098942571);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:290)");
            }
            switch(arr_v[toggleableState3.ordinal()]) {
                case 1: 
                case 2: {
                    f3 = 0.0f;
                    break;
                }
                case 3: {
                    f3 = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Float float1 = f3;
            ToggleableState toggleableState4 = (ToggleableState)transition0.getTargetState();
            composer1.startReplaceableGroup(-2098942571);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:290)");
            }
            switch(arr_v[toggleableState4.ordinal()]) {
                case 1: 
                case 2: {
                    break;
                }
                case 3: {
                    f = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Segment transition$Segment1 = transition0.getSegment();
            State state1 = TransitionKt.createTransitionAnimation(transition0, float1, f, ((FiniteAnimationSpec)g2.w.invoke(transition$Segment1, composer1, 0)), twoWayConverter1, "FloatAnimation", composer1, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xE2A708A4);
            f2 f20 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(f20 == composer$Companion0.getEmpty()) {
                f20 = new f2();
                composer1.updateRememberedValue(f20);
            }
            composer1.endReplaceableGroup();
            State state2 = checkboxColors0.checkmarkColor(toggleableState0, composer1, v2 | v1 >> 6 & 0x70);
            int v4 = v1 >> 3 & 0x380 | v1 & 0x7E;
            State state3 = checkboxColors0.boxColor(z, toggleableState0, composer1, v4);
            State state4 = checkboxColors0.borderColor(z, toggleableState0, composer1, v4);
            Modifier modifier1 = SizeKt.requiredSize-3ABfNKs(SizeKt.wrapContentSize$default(modifier0, Alignment.Companion.getCenter(), false, 2, null), CheckboxKt.c);
            composer1.startReplaceableGroup(2084322042);
            boolean z1 = composer1.changed(state3);
            boolean z2 = composer1.changed(state4);
            boolean z3 = composer1.changed(state2);
            boolean z4 = composer1.changed(state0);
            boolean z5 = composer1.changed(state1);
            boolean z6 = composer1.changed(f20);
            e3 e30 = composer1.rememberedValue();
            if((z1 | z2 | z3 | z4 | z5 | z6) != 0 || e30 == composer$Companion0.getEmpty()) {
                e30 = new e3(f20, state3, state4, state2, state0, state1);
                composer1.updateRememberedValue(e30);
            }
            composer1.endReplaceableGroup();
            CanvasKt.Canvas(modifier1, e30, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f3(z, toggleableState0, modifier0, checkboxColors0, v, 1));
        }
    }

    public static final long access$CheckboxImpl$lambda$10(State state0) {
        return ((Color)state0.getValue()).unbox-impl();
    }

    public static final float access$CheckboxImpl$lambda$4(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final float access$CheckboxImpl$lambda$6(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    public static final long access$CheckboxImpl$lambda$8(State state0) {
        return ((Color)state0.getValue()).unbox-impl();
    }

    public static final long access$CheckboxImpl$lambda$9(State state0) {
        return ((Color)state0.getValue()).unbox-impl();
    }

    public static final void access$drawBox-1wkBAMs(DrawScope drawScope0, long v, long v1, float f, float f1) {
        Stroke stroke0 = new Stroke(f1, 0.0f, 0, 0, null, 30, null);
        float f2 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
        if(Color.equals-impl0(v, v1)) {
            DrawScope.drawRoundRect-u-Aw5IA$default(drawScope0, v, 0L, androidx.compose.ui.geometry.SizeKt.Size(f2, f2), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 0xE2, null);
            return;
        }
        float f3 = f2 - 2.0f * f1;
        DrawScope.drawRoundRect-u-Aw5IA$default(drawScope0, v, OffsetKt.Offset(f1, f1), androidx.compose.ui.geometry.SizeKt.Size(f3, f3), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f - f1), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 0xE0, null);
        DrawScope.drawRoundRect-u-Aw5IA$default(drawScope0, v1, OffsetKt.Offset(f1 / 2.0f, f1 / 2.0f), androidx.compose.ui.geometry.SizeKt.Size(f2 - f1, f2 - f1), CornerRadiusKt.CornerRadius$default(f - f1 / 2.0f, 0.0f, 2, null), stroke0, 0.0f, null, 0, 0xE0, null);
    }

    public static final void access$drawCheck-3IgeMak(DrawScope drawScope0, long v, float f, float f1, float f2, f2 f20) {
        Stroke stroke0 = new Stroke(f2, 0.0f, 2, 0, null, 26, null);
        float f3 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
        f20.a.reset();
        f20.a.moveTo(0.2f * f3, (f1 * 0.5f + (1.0f - f1) * 0.5f) * f3);
        f20.a.lineTo((f1 * 0.5f + (1.0f - f1) * 0.4f) * f3, (f1 * 0.5f + (1.0f - f1) * 0.7f) * f3);
        f20.a.lineTo(0.8f * f3, f3 * (f1 * 0.5f + (1.0f - f1) * 0.3f));
        f20.b.setPath(f20.a, false);
        f20.c.reset();
        float f4 = f20.b.getLength();
        f20.b.getSegment(0.0f, f4 * f, f20.c, true);
        DrawScope.drawPath-LG529CI$default(drawScope0, f20.c, v, 0.0f, stroke0, null, 0, 52, null);
    }

    public static final float access$getRadiusSize$p() [...] // 潜在的解密器

    public static final float access$getStrokeWidth$p() [...] // 潜在的解密器
}


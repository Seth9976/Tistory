package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
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

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AW\u0010\f\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001AQ\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u000E2\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/CheckboxColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Checkbox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "TriStateCheckbox", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,607:1\n1223#2,6:608\n1223#2,6:633\n1223#2,6:639\n71#3:614\n1967#4:615\n1964#4:616\n1882#4,7:617\n1967#4:624\n1964#4:625\n1882#4,7:626\n148#5:645\n148#5:646\n148#5:647\n148#5:648\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n104#1:608,6\n307#1:633,6\n311#1:639,6\n164#1:614\n275#1:615\n275#1:616\n275#1:617,7\n292#1:624\n292#1:625\n292#1:626,7\n603#1:645\n604#1:646\n605#1:647\n606#1:648\n*E\n"})
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

    static {
        CheckboxKt.a = 2.0f;
        CheckboxKt.b = 20.0f;
        CheckboxKt.c = 2.0f;
        CheckboxKt.d = 2.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Checkbox(boolean z, @Nullable Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable CheckboxColors checkboxColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        CheckboxColors checkboxColors2;
        boolean z3;
        Function0 function00;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors3;
        boolean z4;
        int v3;
        CheckboxColors checkboxColors1;
        boolean z2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1406741137);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z2 = z1;
        }
        else if((v & 0xC00) == 0) {
            z2 = z1;
            v2 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        else {
            z2 = z1;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                checkboxColors1 = checkboxColors0;
                v3 = composer1.changed(checkboxColors1) ? 0x4000 : 0x2000;
            }
            else {
                checkboxColors1 = checkboxColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            checkboxColors1 = checkboxColors0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            int v4 = 1;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 8) != 0) {
                    z2 = true;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    checkboxColors1 = CheckboxDefaults.INSTANCE.colors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                label_71:
                    z4 = z2;
                    checkboxColors3 = checkboxColors1;
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    z4 = z2;
                    checkboxColors3 = checkboxColors1;
                    mutableInteractionSource2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                goto label_71;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406741137, v2, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
            }
            ToggleableState toggleableState0 = ToggleableStateKt.ToggleableState(z);
            composer1.startReplaceGroup(0x3E66FB2A);
            if(function10 == null) {
                function00 = null;
            }
            else {
                if((v2 & 14) != 4) {
                    v4 = 0;
                }
                c3 c30 = composer1.rememberedValue();
                if((((v2 & 0x70) == 0x20 ? 1 : 0) | v4) != 0 || c30 == Composer.Companion.getEmpty()) {
                    c30 = new c3(0, z, function10);
                    composer1.updateRememberedValue(c30);
                }
                function00 = c30;
            }
            composer1.endReplaceGroup();
            CheckboxKt.TriStateCheckbox(toggleableState0, function00, modifier1, z4, checkboxColors3, mutableInteractionSource2, composer1, v2 & 0x7FF80, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
            checkboxColors2 = checkboxColors3;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            checkboxColors2 = checkboxColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(z, function10, modifier1, z3, checkboxColors2, mutableInteractionSource1, v, v1, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TriStateCheckbox(@NotNull ToggleableState toggleableState0, @Nullable Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable CheckboxColors checkboxColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        CheckboxColors checkboxColors2;
        boolean z2;
        Modifier modifier2;
        Modifier modifier5;
        Modifier modifier4;
        int v5;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors3;
        boolean z3;
        int v4;
        int v3;
        CheckboxColors checkboxColors1;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1608358065);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(toggleableState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                checkboxColors1 = checkboxColors0;
                v3 = composer1.changed(checkboxColors1) ? 0x4000 : 0x2000;
            }
            else {
                checkboxColors1 = checkboxColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            checkboxColors1 = checkboxColors0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 8) != 0) {
                    z1 = true;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    checkboxColors1 = CheckboxDefaults.INSTANCE.colors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    modifier1 = modifier3;
                    z3 = z1;
                    checkboxColors3 = checkboxColors1;
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    mutableInteractionSource2 = null;
                    z3 = z1;
                    checkboxColors3 = checkboxColors1;
                    modifier1 = modifier3;
                }
                v4 = v2;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                v4 = v2;
                z3 = z1;
                checkboxColors3 = checkboxColors1;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608358065, v4, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
            }
            composer1.startReplaceGroup(0xFA343D3E);
            if(function00 == null) {
                v5 = v4;
                modifier4 = modifier1;
                modifier5 = Modifier.Companion;
            }
            else {
                Indication indication0 = RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 54, 4);
                Role role0 = Role.box-impl(1);
                v5 = v4;
                modifier4 = modifier1;
                modifier5 = ToggleableKt.triStateToggleable-O2vRcR0(Modifier.Companion, toggleableState0, mutableInteractionSource2, indication0, z3, role0, function00);
            }
            composer1.endReplaceGroup();
            Modifier modifier6 = function00 == null ? Modifier.Companion : InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            CheckboxKt.a(z3, toggleableState0, PaddingKt.padding-3ABfNKs(modifier4.then(modifier6).then(modifier5), CheckboxKt.a), checkboxColors3, composer1, v5 >> 9 & 14 | v5 << 3 & 0x70 | v5 >> 3 & 0x1C00);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            z2 = z3;
            checkboxColors2 = checkboxColors3;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            z2 = z1;
            checkboxColors2 = checkboxColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(toggleableState0, function00, modifier2, z2, checkboxColors2, mutableInteractionSource1, v, v1));
        }
    }

    public static final void a(boolean z, ToggleableState toggleableState0, Modifier modifier0, CheckboxColors checkboxColors0, Composer composer0, int v) {
        float f3;
        float f2;
        float f1;
        Composer composer1 = composer0.startRestartGroup(2007131616);
        int v1 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(toggleableState0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(checkboxColors0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007131616, v1, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:271)");
            }
            int v2 = v1 >> 3 & 14;
            Transition transition0 = TransitionKt.updateTransition(toggleableState0, null, composer1, v2, 2);
            FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            ToggleableState toggleableState1 = (ToggleableState)transition0.getCurrentState();
            composer1.startReplaceGroup(1800065638);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
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
            composer1.endReplaceGroup();
            Float float0 = f1;
            ToggleableState toggleableState2 = (ToggleableState)transition0.getTargetState();
            composer1.startReplaceGroup(1800065638);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)");
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
            composer1.endReplaceGroup();
            Segment transition$Segment0 = transition0.getSegment();
            State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f2, ((FiniteAnimationSpec)h3.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "FloatAnimation", composer1, 0);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            ToggleableState toggleableState3 = (ToggleableState)transition0.getCurrentState();
            composer1.startReplaceGroup(0xAAF22C6F);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAAF22C6F, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
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
            composer1.endReplaceGroup();
            Float float1 = f3;
            ToggleableState toggleableState4 = (ToggleableState)transition0.getTargetState();
            composer1.startReplaceGroup(0xAAF22C6F);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAAF22C6F, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)");
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
            composer1.endReplaceGroup();
            Segment transition$Segment1 = transition0.getSegment();
            State state1 = TransitionKt.createTransitionAnimation(transition0, float1, f, ((FiniteAnimationSpec)g3.w.invoke(transition$Segment1, composer1, 0)), twoWayConverter1, "FloatAnimation", composer1, 0);
            b3 b30 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(b30 == composer$Companion0.getEmpty()) {
                b30 = new b3();
                composer1.updateRememberedValue(b30);
            }
            State state2 = checkboxColors0.checkmarkColor$material3_release(toggleableState0, composer1, v2 | v1 >> 6 & 0x70);
            int v4 = v1 >> 3 & 0x380 | v1 & 0x7E;
            State state3 = checkboxColors0.boxColor$material3_release(z, toggleableState0, composer1, v4);
            State state4 = checkboxColors0.borderColor$material3_release(z, toggleableState0, composer1, v4);
            Modifier modifier1 = SizeKt.requiredSize-3ABfNKs(SizeKt.wrapContentSize$default(modifier0, Alignment.Companion.getCenter(), false, 2, null), CheckboxKt.b);
            boolean z1 = composer1.changed(state3);
            boolean z2 = composer1.changed(state4);
            boolean z3 = composer1.changed(state2);
            boolean z4 = composer1.changed(state0);
            boolean z5 = composer1.changed(state1);
            e3 e30 = composer1.rememberedValue();
            if((z1 | z2 | z3 | z4 | z5) != 0 || e30 == composer$Companion0.getEmpty()) {
                e30 = new e3(state3, state4, state2, state0, state1, b30, 0);
                composer1.updateRememberedValue(e30);
            }
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
            scopeUpdateScope0.updateScope(new f3(z, toggleableState0, modifier0, checkboxColors0, v, 0));
        }
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

    public static final void access$drawCheck-3IgeMak(DrawScope drawScope0, long v, float f, float f1, float f2, b3 b30) {
        Stroke stroke0 = new Stroke(f2, 0.0f, 2, 0, null, 26, null);
        float f3 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
        b30.a.reset();
        b30.a.moveTo(0.2f * f3, (f1 * 0.5f + (1.0f - f1) * 0.5f) * f3);
        b30.a.lineTo((f1 * 0.5f + (1.0f - f1) * 0.4f) * f3, (f1 * 0.5f + (1.0f - f1) * 0.7f) * f3);
        b30.a.lineTo(0.8f * f3, f3 * (f1 * 0.5f + (1.0f - f1) * 0.3f));
        b30.b.setPath(b30.a, false);
        b30.c.reset();
        float f4 = b30.b.getLength();
        b30.b.getSegment(0.0f, f4 * f, b30.c, true);
        DrawScope.drawPath-LG529CI$default(drawScope0, b30.c, v, 0.0f, stroke0, null, 0, 52, null);
    }

    public static final float access$getRadiusSize$p() [...] // 潜在的解密器

    public static final float access$getStrokeWidth$p() [...] // 潜在的解密器
}


package p0;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material.TextFieldTransitionScope.WhenMappings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FloatCompanionObject;

public final class vb {
    public static final vb a;

    static {
        vb.a = new vb();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void a(s4 s40, long v, long v1, jb jb0, boolean z, ComposableLambda composableLambda0, Composer composer0, int v2) {
        float f3;
        float f2;
        float f1;
        Composer composer1 = composer0.startRestartGroup(0x76899C6A);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(s40) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(jb0) ? 0x800 : 0x400);
        }
        if((v2 & 0xE000) == 0) {
            v3 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v2) == 0) {
            v3 |= (composer1.changedInstance(composableLambda0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v3) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x76899C6A, v3, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:266)");
            }
            Transition transition0 = TransitionKt.updateTransition(s40, "TextFieldInputState", composer1, v3 & 14 | 0x30, 0);
            composer1.startReplaceableGroup(0xB03404EB);
            FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            composer1.startReplaceableGroup(0xF77F2E11);
            s4 s41 = (s4)transition0.getCurrentState();
            composer1.startReplaceableGroup(-1158004136);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
            }
            int v4 = s41.ordinal();
            float f = 0.0f;
            switch(v4) {
                case 0: {
                    f1 = 1.0f;
                    break;
                }
                case 1: {
                    f1 = 0.0f;
                    break;
                }
                default: {
                    if(v4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1 = 1.0f;
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Float float0 = f1;
            s4 s42 = (s4)transition0.getTargetState();
            composer1.startReplaceableGroup(-1158004136);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:276)");
            }
            switch(s42.ordinal()) {
                case 1: {
                    f2 = 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f2 = 1.0f;
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
            Segment transition$Segment0 = transition0.getSegment();
            State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f2, ((FiniteAnimationSpec)sb.w.invoke(transition$Segment0, composer1, 0)), twoWayConverter0, "LabelProgress", composer1, 0x30000);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xB03404EB);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            composer1.startReplaceableGroup(0xF77F2E11);
            s4 s43 = (s4)transition0.getCurrentState();
            composer1.startReplaceableGroup(0xADF97AD7);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xADF97AD7, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
            }
            switch(s43.ordinal()) {
                case 0: {
                    f3 = 1.0f;
                    break;
                }
                case 1: {
                    f3 = z ? 0.0f : 1.0f;
                    break;
                }
                case 2: {
                    f3 = 0.0f;
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
            s4 s44 = (s4)transition0.getTargetState();
            composer1.startReplaceableGroup(0xADF97AD7);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xADF97AD7, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:304)");
            }
            switch(s44.ordinal()) {
                case 0: {
                    f = 1.0f;
                    break;
                }
                case 1: {
                    if(!z) {
                        f = 1.0f;
                    }
                    break;
                }
                case 2: {
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
            State state1 = TransitionKt.createTransitionAnimation(transition0, float1, f, ((FiniteAnimationSpec)ub.w.invoke(transition$Segment1, composer1, 0)), twoWayConverter1, "PlaceholderOpacity", composer1, 0x30000);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x8C629A81);
            s4 s45 = (s4)transition0.getTargetState();
            composer1.startReplaceableGroup(-1490209928);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            int[] arr_v = TextFieldTransitionScope.WhenMappings.$EnumSwitchMapping$0;
            long v5 = arr_v[s45.ordinal()] == 1 ? v : v1;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            ColorSpace colorSpace0 = Color.getColorSpace-impl(v5);
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z1 = composer1.changed(colorSpace0);
            TwoWayConverter twoWayConverter2 = composer1.rememberedValue();
            if(z1 || twoWayConverter2 == Composer.Companion.getEmpty()) {
                twoWayConverter2 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace0);
                composer1.updateRememberedValue(twoWayConverter2);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xF77F2E11);
            s4 s46 = (s4)transition0.getCurrentState();
            composer1.startReplaceableGroup(-1490209928);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            long v6 = arr_v[s46.ordinal()] == 1 ? v : v1;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Color color0 = Color.box-impl(v6);
            s4 s47 = (s4)transition0.getTargetState();
            composer1.startReplaceableGroup(-1490209928);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1490209928, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            long v7 = arr_v[s47.ordinal()] == 1 ? v : v1;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceableGroup();
            Color color1 = Color.box-impl(v7);
            Segment transition$Segment2 = transition0.getSegment();
            State state2 = TransitionKt.createTransitionAnimation(transition0, color0, color1, ((FiniteAnimationSpec)tb.w.invoke(transition$Segment2, composer1, 0)), twoWayConverter2, "LabelTextStyleColor", composer1, 0x38000);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            int v8 = v3 & 0x1C00 | 0x180;
            composer1.startReplaceableGroup(0x8C629A81);
            ColorSpace colorSpace1 = Color.getColorSpace-impl(((Color)jb0.invoke(transition0.getTargetState(), composer1, ((int)(v8 >> 6 & 0x70)))).unbox-impl());
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z2 = composer1.changed(colorSpace1);
            TwoWayConverter twoWayConverter3 = composer1.rememberedValue();
            if(z2 || twoWayConverter3 == Composer.Companion.getEmpty()) {
                twoWayConverter3 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace1);
                composer1.updateRememberedValue(twoWayConverter3);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xF77F2E11);
            int v9 = (v8 << 3 & 0xE000 | 0xC40) >> 9 & 0x70;
            Object object0 = jb0.invoke(transition0.getCurrentState(), composer1, v9);
            Object object1 = jb0.invoke(transition0.getTargetState(), composer1, v9);
            Segment transition$Segment3 = transition0.getSegment();
            State state3 = TransitionKt.createTransitionAnimation(transition0, object0, object1, ((FiniteAnimationSpec)rb.w.invoke(transition$Segment3, composer1, 0)), twoWayConverter3, "LabelContentColor", composer1, 0x38000);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composableLambda0.invoke(((Number)state0.getValue()).floatValue(), Color.box-impl(((Color)state2.getValue()).unbox-impl()), Color.box-impl(((Color)state3.getValue()).unbox-impl()), ((Number)state1.getValue()).floatValue(), composer1, ((int)(v3 >> 3 & 0xE000)));
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qb(this, s40, v, v1, jb0, z, composableLambda0, v2));
        }
    }
}


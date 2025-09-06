package p0;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.CheckboxColors;
import androidx.compose.material.DefaultCheckboxColors.WhenMappings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.NoWhenBranchMatchedException;

public final class x2 implements CheckboxColors {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    public x2(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
        this.k = v10;
    }

    @Override  // androidx.compose.material.CheckboxColors
    public final State borderColor(boolean z, ToggleableState toggleableState0, Composer composer0, int v) {
        State state0;
        long v1;
        composer0.startReplaceableGroup(0xA28502A2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA28502A2, v, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if(z) {
            switch(DefaultCheckboxColors.WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: 
                case 2: {
                    v1 = this.h;
                    break;
                }
                case 3: {
                    v1 = this.i;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else {
            switch(DefaultCheckboxColors.WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 2: {
                    v1 = this.k;
                    break;
                }
                case 1: 
                case 3: {
                    v1 = this.j;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(z) {
            composer0.startReplaceableGroup(0xD087D215);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default((toggleableState0 == ToggleableState.Off ? 100 : 50), 0, null, 6, null), null, null, composer0, 0, 12);
        }
        else {
            composer0.startReplaceableGroup(-796405041);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.CheckboxColors
    public final State boxColor(boolean z, ToggleableState toggleableState0, Composer composer0, int v) {
        State state0;
        long v1;
        composer0.startReplaceableGroup(840901029);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, v, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if(z) {
            switch(DefaultCheckboxColors.WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: 
                case 2: {
                    v1 = this.c;
                    break;
                }
                case 3: {
                    v1 = this.d;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        else {
            switch(DefaultCheckboxColors.WhenMappings.$EnumSwitchMapping$0[toggleableState0.ordinal()]) {
                case 1: {
                    v1 = this.e;
                    break;
                }
                case 2: {
                    v1 = this.g;
                    break;
                }
                case 3: {
                    v1 = this.f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(z) {
            composer0.startReplaceableGroup(0x882803F4);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default((toggleableState0 == ToggleableState.Off ? 100 : 50), 0, null, 6, null), null, null, composer0, 0, 12);
        }
        else {
            composer0.startReplaceableGroup(-2010643282);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Override  // androidx.compose.material.CheckboxColors
    public final State checkmarkColor(ToggleableState toggleableState0, Composer composer0, int v) {
        composer0.startReplaceableGroup(0x2076CB8B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2076CB8B, v, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        State state0 = SingleValueAnimationKt.animateColorAsState-euL9pac((toggleableState0 == ToggleableState.Off ? this.b : this.a), AnimationSpecKt.tween$default((toggleableState0 == ToggleableState.Off ? 100 : 50), 0, null, 6, null), null, null, composer0, 0, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}


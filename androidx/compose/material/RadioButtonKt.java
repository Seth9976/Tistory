package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.d3;
import androidx.compose.material3.ei;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AO\u0010\f\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n25#2:234\n1116#3,6:235\n1116#3,6:243\n75#4:241\n75#4:252\n154#5:242\n154#5:249\n154#5:250\n154#5:251\n154#5:253\n154#5:254\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonKt\n*L\n79#1:234\n79#1:235,6\n116#1:243,6\n83#1:241\n230#1:252\n83#1:242\n227#1:249\n228#1:250\n229#1:251\n231#1:253\n232#1:254\n*E\n"})
public final class RadioButtonKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        RadioButtonKt.a = 24.0f;
        RadioButtonKt.b = 2.0f;
        RadioButtonKt.c = 20.0f;
        RadioButtonKt.d = 10.0f;
        RadioButtonKt.e = 12.0f;
        RadioButtonKt.f = 2.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void RadioButton(boolean z, @Nullable Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable RadioButtonColors radioButtonColors0, @Nullable Composer composer0, int v, int v1) {
        RadioButtonColors radioButtonColors1;
        MutableInteractionSource mutableInteractionSource1;
        boolean z2;
        Modifier modifier5;
        Modifier modifier4;
        boolean z4;
        RadioButtonColors radioButtonColors3;
        State state3;
        State state2;
        RadioButtonColors radioButtonColors2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x4E58B201);
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
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(radioButtonColors0) ? 0x10000 : 0x20000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
                z3 = (v1 & 8) == 0 ? z1 : true;
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
                    mutableInteractionSource2 = mutableInteractionSource4;
                    modifier2 = modifier3;
                    radioButtonColors2 = radioButtonColors0;
                }
                else {
                    v2 &= 0xFFF8FFFF;
                    mutableInteractionSource2 = mutableInteractionSource4;
                    modifier2 = modifier3;
                    radioButtonColors2 = RadioButtonDefaults.INSTANCE.colors-RGew2ao(0L, 0L, 0L, composer1, 0xC00, 7);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                modifier2 = modifier1;
                z3 = z1;
                mutableInteractionSource2 = mutableInteractionSource0;
                radioButtonColors2 = radioButtonColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4E58B201, v2, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
            }
            State state0 = AnimateAsStateKt.animateDpAsState-AjpBEmI((z ? RadioButtonKt.e / 2.0f : 0.0f), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer1, 0x30, 12);
            State state1 = radioButtonColors2.radioColor(z3, z, composer1, v2 << 3 & 0x70 | v2 >> 9 & 14 | v2 >> 9 & 0x380);
            composer1.startReplaceableGroup(0x73BAF562);
            if(function00 == null) {
                state3 = state1;
                radioButtonColors3 = radioButtonColors2;
                modifier4 = modifier2;
                state2 = state0;
                z4 = z3;
                modifier5 = Modifier.Companion;
            }
            else {
                state2 = state0;
                Indication indication0 = RippleKt.rememberRipple-9IZ8Weo(false, RadioButtonKt.a, 0L, composer1, 54, 4);
                Role role0 = Role.box-impl(3);
                state3 = state1;
                radioButtonColors3 = radioButtonColors2;
                z4 = z3;
                modifier4 = modifier2;
                modifier5 = SelectableKt.selectable-O2vRcR0(Modifier.Companion, z, mutableInteractionSource2, indication0, z4, role0, function00);
            }
            composer1.endReplaceableGroup();
            Modifier modifier6 = function00 == null ? Modifier.Companion : InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            Modifier modifier7 = SizeKt.requiredSize-3ABfNKs(PaddingKt.padding-3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifier6).then(modifier5), Alignment.Companion.getCenter(), false, 2, null), RadioButtonKt.b), RadioButtonKt.c);
            composer1.startReplaceableGroup(-982011571);
            boolean z5 = composer1.changed(state3);
            boolean z6 = composer1.changed(state2);
            ei ei0 = composer1.rememberedValue();
            if(z5 || z6 || ei0 == Composer.Companion.getEmpty()) {
                ei0 = new ei(state3, state2, 2);
                composer1.updateRememberedValue(ei0);
            }
            composer1.endReplaceableGroup();
            CanvasKt.Canvas(modifier7, ei0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier4;
            radioButtonColors1 = radioButtonColors3;
            z2 = z4;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource0;
            radioButtonColors1 = radioButtonColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(z, function00, modifier1, z2, mutableInteractionSource1, radioButtonColors1, v, v1, 5));
        }
    }

    public static final float access$getRadioRadius$p() [...] // 潜在的解密器

    public static final float access$getRadioStrokeWidth$p() [...] // 潜在的解密器
}


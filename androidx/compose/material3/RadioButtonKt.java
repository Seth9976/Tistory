package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AQ\u0010\f\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/RadioButtonColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,273:1\n71#2:274\n71#2:276\n148#3:275\n148#3:283\n148#3:284\n148#3:285\n1223#4,6:277\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonKt\n*L\n86#1:274\n101#1:276\n86#1:275\n270#1:283\n271#1:284\n272#1:285\n120#1:277,6\n*E\n"})
public final class RadioButtonKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        RadioButtonKt.a = 2.0f;
        RadioButtonKt.b = 12.0f;
        RadioButtonKt.c = 2.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RadioButton(boolean z, @Nullable Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable RadioButtonColors radioButtonColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource1;
        RadioButtonColors radioButtonColors2;
        boolean z3;
        Modifier modifier5;
        Modifier modifier4;
        boolean z5;
        RadioButtonColors radioButtonColors4;
        State state3;
        State state2;
        RadioButtonColors radioButtonColors3;
        boolean z4;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        int v3;
        RadioButtonColors radioButtonColors1;
        boolean z2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(408580840);
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
                radioButtonColors1 = radioButtonColors0;
                v3 = composer1.changed(radioButtonColors1) ? 0x4000 : 0x2000;
            }
            else {
                radioButtonColors1 = radioButtonColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            radioButtonColors1 = radioButtonColors0;
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
                    z2 = true;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    radioButtonColors1 = RadioButtonDefaults.INSTANCE.colors(composer1, 6);
                }
                if((v1 & 0x20) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier2 = modifier3;
                    z4 = z2;
                    radioButtonColors3 = radioButtonColors1;
                }
                else {
                    modifier2 = modifier3;
                    z4 = z2;
                    radioButtonColors3 = radioButtonColors1;
                    mutableInteractionSource2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                modifier2 = modifier1;
                z4 = z2;
                radioButtonColors3 = radioButtonColors1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408580840, v2, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
            }
            State state0 = AnimateAsStateKt.animateDpAsState-AjpBEmI((z ? RadioButtonKt.b / 2.0f : 0.0f), AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer1, 0x30, 12);
            State state1 = radioButtonColors3.radioColor$material3_release(z4, z, composer1, v2 >> 6 & 0x380 | (v2 >> 9 & 14 | v2 << 3 & 0x70));
            composer1.startReplaceGroup(0x4F1A0A60);
            if(function00 == null) {
                state3 = state1;
                radioButtonColors4 = radioButtonColors3;
                modifier4 = modifier2;
                state2 = state0;
                z5 = z4;
                modifier5 = Modifier.Companion;
            }
            else {
                state2 = state0;
                Indication indication0 = RippleKt.rippleOrFallbackImplementation-9IZ8Weo(false, 0.0f, 0L, composer1, 54, 4);
                Role role0 = Role.box-impl(3);
                state3 = state1;
                radioButtonColors4 = radioButtonColors3;
                z5 = z4;
                modifier4 = modifier2;
                modifier5 = SelectableKt.selectable-O2vRcR0(Modifier.Companion, z, mutableInteractionSource2, indication0, z5, role0, function00);
            }
            composer1.endReplaceGroup();
            Modifier modifier6 = function00 == null ? Modifier.Companion : InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            Modifier modifier7 = SizeKt.requiredSize-3ABfNKs(PaddingKt.padding-3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifier6).then(modifier5), Alignment.Companion.getCenter(), false, 2, null), RadioButtonKt.a), 0.0f);
            boolean z6 = composer1.changed(state3);
            boolean z7 = composer1.changed(state2);
            ei ei0 = composer1.rememberedValue();
            if(z6 || z7 || ei0 == Composer.Companion.getEmpty()) {
                ei0 = new ei(state3, state2, 0);
                composer1.updateRememberedValue(ei0);
            }
            CanvasKt.Canvas(modifier7, ei0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier4;
            radioButtonColors2 = radioButtonColors4;
            z3 = z5;
            mutableInteractionSource1 = mutableInteractionSource2;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            radioButtonColors2 = radioButtonColors1;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(z, function00, modifier1, z3, radioButtonColors2, mutableInteractionSource1, v, v1, 1));
        }
    }

    public static final float access$getRadioStrokeWidth$p() [...] // 潜在的解密器
}


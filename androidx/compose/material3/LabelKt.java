package androidx.compose.material3;

import aa.x;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.g;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A`\u0010\u000E\u001A\u00020\u00022\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0011\u0010\r\u001A\r\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "isPersistent", "Lkotlin/Function0;", "content", "Label", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,143:1\n1223#2,6:144\n1223#2,6:150\n1223#2,6:156\n1223#2,6:162\n1223#2,6:168\n*S KotlinDebug\n*F\n+ 1 Label.kt\nandroidx/compose/material3/LabelKt\n*L\n73#1:144,6\n77#1:150,6\n80#1:156,6\n81#1:162,6\n111#1:168,6\n*E\n"})
public final class LabelKt {
    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Label(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        MutableInteractionSource mutableInteractionSource1;
        TooltipState tooltipState0;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xDF8D2022);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
            MutableInteractionSource mutableInteractionSource2 = (v1 & 4) == 0 ? mutableInteractionSource0 : null;
            boolean z2 = (v1 & 8) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDF8D2022, v2, -1, "androidx.compose.material3.Label (Label.kt:70)");
            }
            composer1.startReplaceGroup(0x1EF0E9CD);
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
            PopupPositionProvider popupPositionProvider0 = TooltipDefaults.INSTANCE.rememberPlainTooltipPositionProvider-kHDZbjc(0.0f, composer1, 0x30, 1);
            if(z2) {
                composer1.startReplaceGroup(-1087377900);
                zb zb0 = composer1.rememberedValue();
                if(zb0 == Composer.Companion.getEmpty()) {
                    zb0 = new zb();
                    composer1.updateRememberedValue(zb0);
                }
                tooltipState0 = zb0;
            }
            else {
                composer1.startReplaceGroup(0x1EF10D29);
                tooltipState0 = BasicTooltipKt.rememberBasicTooltipState(false, false, new MutatorMutex(), composer1, 0, 3);
            }
            composer1.endReplaceGroup();
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            ref$ObjectRef0.element = mutableState0;
            TooltipScopeImpl tooltipScopeImpl0 = composer1.rememberedValue();
            if(tooltipScopeImpl0 == composer$Companion0.getEmpty()) {
                tooltipScopeImpl0 = new TooltipScopeImpl(new wb(ref$ObjectRef0));
                composer1.updateRememberedValue(tooltipScopeImpl0);
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x7445AC90, true, new yb(function20, ref$ObjectRef0), composer1, 54);
            BasicTooltip_androidKt.BasicTooltipBox(popupPositionProvider0, ComposableLambdaKt.rememberComposableLambda(784196780, true, new x(4, function30, tooltipScopeImpl0), composer1, 54), tooltipState0, modifier2, false, false, composableLambda0, composer1, v2 << 6 & 0x1C00 | 0x1B6030, 0);
            LabelKt.a(!z2, tooltipState0, mutableInteractionSource4, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            mutableInteractionSource1 = mutableInteractionSource2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            mutableInteractionSource1 = mutableInteractionSource0;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(function30, modifier1, mutableInteractionSource1, z1, function20, v, v1));
        }
    }

    public static final void a(boolean z, TooltipState tooltipState0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDA9CCD03);
        int v1 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? composer1.changed(tooltipState0) : composer1.changedInstance(tooltipState0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDA9CCD03, v1, -1, "androidx.compose.material3.HandleInteractions (Label.kt:108)");
            }
            int v2 = 0;
            if(z) {
                if((v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && composer1.changedInstance(tooltipState0)) {
                    v2 = 1;
                }
                ub ub0 = composer1.rememberedValue();
                if((((v1 & 0x380) == 0x100 ? 1 : 0) | v2) != 0 || ub0 == Composer.Companion.getEmpty()) {
                    ub0 = new ub(mutableInteractionSource0, tooltipState0, null);
                    composer1.updateRememberedValue(ub0);
                }
                EffectsKt.LaunchedEffect(mutableInteractionSource0, ub0, composer1, v1 >> 6 & 14);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(z, tooltipState0, mutableInteractionSource0, v, 2));
        }
    }

    public static final void access$HandleInteractions(boolean z, TooltipState tooltipState0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v) {
        LabelKt.a(z, tooltipState0, mutableInteractionSource0, composer0, v);
    }
}


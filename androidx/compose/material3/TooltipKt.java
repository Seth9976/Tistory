package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001An\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00A2\u0006\u0002\b\u0005\u00A2\u0006\u0002\b\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u00040\u000F\u00A2\u0006\u0002\b\u0005H\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A-\u0010\u0017\u001A\u00020\b2\b\b\u0002\u0010\u0013\u001A\u00020\f2\b\b\u0002\u0010\u0014\u001A\u00020\f2\b\b\u0002\u0010\u0016\u001A\u00020\u0015H\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A-\u0010\u0019\u001A\u00020\b2\b\b\u0002\u0010\u0013\u001A\u00020\f2\b\b\u0002\u0010\u0014\u001A\u00020\f2\b\b\u0002\u0010\u0016\u001A\u00020\u0015H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A#\u0010\u001D\u001A\u00020\n*\u00020\n2\u0006\u0010\u001B\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\fH\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A!\u0010!\u001A\u00020\n*\u00020\n2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\f0\u001FH\u0000\u00A2\u0006\u0004\b!\u0010\"\"\u001A\u0010(\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u001A\u0010+\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010%\u001A\u0004\b*\u0010\'\"\u001A\u0010.\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b,\u0010%\u001A\u0004\b-\u0010\'\"\u001A\u00101\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b/\u0010%\u001A\u0004\b0\u0010\'\"\u001A\u00107\u001A\u0002028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106\"\u001A\u0010:\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u0010%\u001A\u0004\b9\u0010\'\"\u001A\u0010=\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b;\u0010%\u001A\u0004\b<\u0010\'\"\u001A\u0010@\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b>\u0010%\u001A\u0004\b?\u0010\'\"\u001A\u0010C\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bA\u0010%\u001A\u0004\bB\u0010\'\"\u001A\u0010F\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bD\u0010%\u001A\u0004\bE\u0010\'\"\u0014\u0010H\u001A\u00020G8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010J\u001A\u00020G8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bJ\u0010I\u00A8\u0006N\u00B2\u0006\f\u0010L\u001A\u00020K8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010M\u001A\u00020K8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "Lkotlin/Function0;", "content", "TooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "rememberTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "TooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;)Landroidx/compose/material3/TooltipState;", "subheadExists", "actionExists", "textVerticalPadding", "(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "transition", "animateTooltip", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getSpacingBetweenTooltipAndAnchor", "()F", "SpacingBetweenTooltipAndAnchor", "b", "getTooltipMinHeight", "TooltipMinHeight", "c", "getTooltipMinWidth", "TooltipMinWidth", "d", "getPlainTooltipMaxWidth", "PlainTooltipMaxWidth", "Landroidx/compose/foundation/layout/PaddingValues;", "f", "Landroidx/compose/foundation/layout/PaddingValues;", "getPlainTooltipContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipContentPadding", "g", "getRichTooltipMaxWidth", "RichTooltipMaxWidth", "h", "getRichTooltipHorizontalPadding", "RichTooltipHorizontalPadding", "i", "getHeightToSubheadFirstLine", "HeightToSubheadFirstLine", "l", "getActionLabelMinHeight", "ActionLabelMinHeight", "m", "getActionLabelBottomPadding", "ActionLabelBottomPadding", "", "TooltipFadeInDuration", "I", "TooltipFadeOutDuration", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n1223#2,6:646\n1223#2,6:652\n1223#2,6:658\n135#3:664\n148#4:665\n148#4:666\n148#4:667\n148#4:668\n148#4:669\n148#4:670\n148#4:671\n148#4:672\n148#4:673\n148#4:674\n148#4:675\n148#4:676\n148#4:677\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n135#1:646,6\n136#1:652,6\n437#1:658,6\n580#1:664\n626#1:665\n627#1:666\n628#1:667\n629#1:668\n630#1:669\n631#1:670\n634#1:671\n635#1:672\n636#1:673\n637#1:674\n638#1:675\n639#1:676\n640#1:677\n*E\n"})
public final class TooltipKt {
    public static final int TooltipFadeInDuration = 150;
    public static final int TooltipFadeOutDuration = 75;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final PaddingValues f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;

    static {
        TooltipKt.a = 4.0f;
        TooltipKt.b = 24.0f;
        TooltipKt.c = 40.0f;
        TooltipKt.d = 200.0f;
        TooltipKt.e = 4.0f;
        TooltipKt.f = PaddingKt.PaddingValues-YgX7TsA(8.0f, 4.0f);
        TooltipKt.g = 320.0f;
        TooltipKt.h = 16.0f;
        TooltipKt.i = 28.0f;
        TooltipKt.j = 24.0f;
        TooltipKt.k = 16.0f;
        TooltipKt.l = 36.0f;
        TooltipKt.m = 8.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TooltipBox(@NotNull PopupPositionProvider popupPositionProvider0, @NotNull Function3 function30, @NotNull TooltipState tooltipState0, @Nullable Modifier modifier0, boolean z, boolean z1, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        boolean z3;
        boolean z2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1836749106);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (((v & 0x200) == 0 ? composer1.changed(tooltipState0) : composer1.changedInstance(tooltipState0)) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
            boolean z4 = (v1 & 16) == 0 ? z : true;
            boolean z5 = (v1 & 0x20) == 0 ? z1 : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1836749106, v2, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:131)");
            }
            Transition transition0 = TransitionKt.updateTransition(tooltipState0.getTransition(), "tooltip transition", composer1, MutableTransitionState.$stable | 0x30, 0);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            TooltipScopeImpl tooltipScopeImpl0 = composer1.rememberedValue();
            if(tooltipScopeImpl0 == composer$Companion0.getEmpty()) {
                tooltipScopeImpl0 = new TooltipScopeImpl(new x5(mutableState0, 2));
                composer1.updateRememberedValue(tooltipScopeImpl0);
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-1130808188, true, new xq(mutableState0, function20), composer1, 54);
            BasicTooltip_androidKt.BasicTooltipBox(popupPositionProvider0, ComposableLambdaKt.rememberComposableLambda(0xF7151BE8, true, new wq(transition0, function30, tooltipScopeImpl0), composer1, 54), tooltipState0, modifier2, z4, z5, composableLambda0, composer1, v2 & 14 | 0x180030 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | v2 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z2 = z4;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gb(popupPositionProvider0, function30, tooltipState0, modifier1, z2, z3, function20, v, v1));
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final TooltipState TooltipState(boolean z, boolean z1, @NotNull MutatorMutex mutatorMutex0) {
        return new dr(z, z1, mutatorMutex0);
    }

    public static TooltipState TooltipState$default(boolean z, boolean z1, MutatorMutex mutatorMutex0, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            mutatorMutex0 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipKt.TooltipState(z, z1, mutatorMutex0);
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier animateTooltip(@NotNull Modifier modifier0, @NotNull Transition transition0) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new e0(transition0, 2));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n1#1,178:1\n581#2,3:179\n*E\n"})
        public final class androidx.compose.material3.TooltipKt.animateTooltip..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final Transition w;

            public androidx.compose.material3.TooltipKt.animateTooltip..inlined.debugInspectorInfo.1(Transition transition0) {
                this.w = transition0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("animateTooltip");
                inspectorInfo0.getProperties().set("transition", this.w);
            }
        }

    }

    public static final float getActionLabelBottomPadding() [...] // 潜在的解密器

    public static final float getActionLabelMinHeight() [...] // 潜在的解密器

    public static final float getHeightToSubheadFirstLine() [...] // 潜在的解密器

    @NotNull
    public static final PaddingValues getPlainTooltipContentPadding() {
        return TooltipKt.f;
    }

    public static final float getPlainTooltipMaxWidth() [...] // 潜在的解密器

    public static final float getRichTooltipHorizontalPadding() [...] // 潜在的解密器

    public static final float getRichTooltipMaxWidth() [...] // 潜在的解密器

    public static final float getSpacingBetweenTooltipAndAnchor() [...] // 潜在的解密器

    public static final float getTooltipMinHeight() [...] // 潜在的解密器

    public static final float getTooltipMinWidth() [...] // 潜在的解密器

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final TooltipState rememberTooltipState(boolean z, boolean z1, @Nullable MutatorMutex mutatorMutex0, @Nullable Composer composer0, int v, int v1) {
        int v2 = 0;
        if((v1 & 1) != 0) {
            z = false;
        }
        if((v1 & 2) != 0) {
            z1 = false;
        }
        if((v1 & 4) != 0) {
            mutatorMutex0 = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, v, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:436)");
        }
        int v3 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(z1)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(mutatorMutex0) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        dr dr0 = composer0.rememberedValue();
        if((v3 | v2) != 0 || dr0 == Composer.Companion.getEmpty()) {
            dr0 = new dr(z, z1, mutatorMutex0);
            composer0.updateRememberedValue(dr0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dr0;
    }

    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static final Modifier textVerticalPadding(@NotNull Modifier modifier0, boolean z, boolean z1) {
        return z || z1 ? PaddingKt.padding-qDBjuR0$default(AlignmentLineKt.paddingFromBaseline-VpY3zN4$default(modifier0, TooltipKt.j, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TooltipKt.k, 7, null) : PaddingKt.padding-VpY3zN4$default(modifier0, 0.0f, TooltipKt.e, 1, null);
    }
}


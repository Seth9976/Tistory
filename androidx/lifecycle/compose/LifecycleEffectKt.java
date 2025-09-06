package androidx.lifecycle.compose;

import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import i4.f;
import i4.g;
import i4.h;
import i4.i;
import i4.j;
import i4.k;
import i4.l;
import i4.m;
import i4.n;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A/\u0010\u0007\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00A2\u0006\u0004\b\u0007\u0010\b\u001A<\u0010\u0010\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001AF\u0010\u0010\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u0012\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0013\u001AP\u0010\u0010\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u0012\u001A\u0004\u0018\u00010\t2\b\u0010\u0014\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0015\u001AJ\u0010\u0010\u001A\u00020\u00052\u0016\u0010\u0017\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0018\u001A2\u0010\u0010\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0019\u001A<\u0010\u001C\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u001B0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u0011\u001AF\u0010\u001C\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u0012\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u001B0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u0013\u001AP\u0010\u001C\u001A\u00020\u00052\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u0012\u001A\u0004\u0018\u00010\t2\b\u0010\u0014\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u001B0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u0015\u001AJ\u0010\u001C\u001A\u00020\u00052\u0016\u0010\u0017\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u001B0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u0018\u001A2\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0017\u0010\u000F\u001A\u0013\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u001B0\u000B\u00A2\u0006\u0002\b\u000EH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u0019\u00A8\u0006\u001E\u00B2\u0006\u0012\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "event", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "", "onEvent", "LifecycleEventEffect", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "key1", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "effects", "LifecycleStartEffect", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "keys", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "LifecycleResumeEffect", "currentOnEvent", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,747:1\n74#2:748\n74#2:755\n74#2:762\n74#2:769\n74#2:776\n74#2:786\n74#2:793\n74#2:800\n74#2:807\n74#2:814\n74#2:824\n1116#3,6:749\n1116#3,6:756\n1116#3,6:763\n1116#3,6:770\n1116#3,6:780\n1116#3,6:787\n1116#3,6:794\n1116#3,6:801\n1116#3,6:808\n1116#3,6:818\n1116#3,6:825\n83#4,3:777\n83#4,3:815\n81#5:831\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n56#1:748\n134#1:755\n197#1:762\n262#1:769\n323#1:776\n349#1:786\n467#1:793\n530#1:800\n595#1:807\n656#1:814\n682#1:824\n67#1:749,6\n137#1:756,6\n200#1:763,6\n265#1:770,6\n326#1:780,6\n359#1:787,6\n470#1:794,6\n533#1:801,6\n598#1:808,6\n659#1:818,6\n692#1:825,6\n326#1:777,3\n659#1:815,3\n66#1:831\n*E\n"})
public final class LifecycleEffectKt {
    @Composable
    public static final void LifecycleEventEffect(@NotNull Event lifecycle$Event0, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(-709389590);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(lifecycle$Event0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
        }
        else {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            else if((v1 & 2) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709389590, v2, -1, "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:57)");
            }
            if(lifecycle$Event0 == Event.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(function00, composer1, v2 >> 6 & 14);
            composer1.startReplaceableGroup(380955345);
            boolean z = composer1.changed(state0);
            boolean z1 = composer1.changedInstance(lifecycleOwner0);
            f f0 = composer1.rememberedValue();
            if(((v2 & 14) == 4 | z | z1) != 0 || f0 == Composer.Companion.getEmpty()) {
                f0 = new f(lifecycleOwner0, lifecycle$Event0, state0);
                composer1.updateRememberedValue(f0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner0, f0, composer1, v2 >> 3 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(lifecycle$Event0, lifecycleOwner0, function00, v, v1));
        }
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "LifecycleResumeEffect must provide one or more \'key\' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    public static final void LifecycleResumeEffect(@Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xD3726B0E);
        if((v & 1) == 0 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new l(lifecycleOwner0, function10, v, v1, 0));
            }
            return;
        }
        composer1.startDefaults();
        if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
            composer1.skipToGroupEnd();
            if((v1 & 1) != 0) {
                v &= -15;
            }
        }
        else if((v1 & 1) != 0) {
            LifecycleOwner lifecycleOwner1 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            v &= -15;
        }
        composer1.endDefaults();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD3726B0E, v, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:683)");
        }
        throw new IllegalStateException("LifecycleResumeEffect must provide one or more \'key\' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object object0, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(1220373486);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            else if((v1 & 2) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1220373486, v2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:468)");
            }
            composer1.startReplaceableGroup(0x579E65EB);
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(lifecycleOwner0);
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0 = composer1.rememberedValue();
            if(z || z1 || lifecycleResumePauseEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleResumePauseEffectScope0 = new LifecycleResumePauseEffectScope(lifecycleOwner0.getLifecycle());
                composer1.updateRememberedValue(lifecycleResumePauseEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.a(lifecycleOwner0, lifecycleResumePauseEffectScope0, function10, composer1, v2 >> 3 & 14 | v2 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(object0, lifecycleOwner0, function10, v, v1, 0));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object object0, @Nullable Object object1, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2CDCFCCE);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(object1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            else if((v1 & 4) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= -897;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2CDCFCCE, v2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:531)");
            }
            composer1.startReplaceableGroup(1470097201);
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(object1);
            boolean z2 = composer1.changed(lifecycleOwner0);
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0 = composer1.rememberedValue();
            if((z | z1 | z2) != 0 || lifecycleResumePauseEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleResumePauseEffectScope0 = new LifecycleResumePauseEffectScope(lifecycleOwner0.getLifecycle());
                composer1.updateRememberedValue(lifecycleResumePauseEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.a(lifecycleOwner0, lifecycleResumePauseEffectScope0, function10, composer1, v2 >> 6 & 14 | v2 >> 3 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(object0, object1, lifecycleOwner0, function10, v, v1, 0));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v3;
        LifecycleOwner lifecycleOwner1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE3091DAE);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(object1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(object2) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                lifecycleOwner1 = lifecycleOwner0;
                v3 = composer1.changedInstance(lifecycleOwner0) ? 0x800 : 0x400;
            }
            else {
                lifecycleOwner1 = lifecycleOwner0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            lifecycleOwner1 = lifecycleOwner0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
            }
            else if((v1 & 8) != 0) {
                lifecycleOwner1 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFE3FF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE3091DAE, v2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:596)");
            }
            composer1.startReplaceableGroup(1470198999);
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(object1);
            boolean z2 = composer1.changed(object2);
            boolean z3 = composer1.changed(lifecycleOwner1);
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0 = composer1.rememberedValue();
            if((z | z1 | z2 | z3) != 0 || lifecycleResumePauseEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleResumePauseEffectScope0 = new LifecycleResumePauseEffectScope(lifecycleOwner1.getLifecycle());
                composer1.updateRememberedValue(lifecycleResumePauseEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.a(lifecycleOwner1, lifecycleResumePauseEffectScope0, function10, composer1, v2 >> 9 & 14 | v2 >> 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(object0, object1, object2, lifecycleOwner1, function10, v, v1, 0));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@NotNull Object[] arr_object, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xD1675621);
        int v2 = (v & 0x30) == 0 ? ((v1 & 2) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 16 : 0x20) | v : v;
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        composer1.startMovableGroup(1470288308, ((int)arr_object.length));
        for(int v4 = 0; v4 < arr_object.length; ++v4) {
            v2 |= (composer1.changedInstance(arr_object[v4]) ? 4 : 0);
        }
        composer1.endMovableGroup();
        if((v2 & 14) == 0) {
            v2 |= 2;
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            else if((v1 & 2) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD1675621, v2, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:657)");
            }
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.addSpread(arr_object);
            spreadBuilder0.add(lifecycleOwner0);
            Object[] arr_object1 = spreadBuilder0.toArray(new Object[spreadBuilder0.size()]);
            composer1.startReplaceableGroup(0xDE219177);
            boolean z = false;
            for(int v3 = 0; v3 < arr_object1.length; ++v3) {
                z |= composer1.changed(arr_object1[v3]);
            }
            LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0 = composer1.rememberedValue();
            if(z || lifecycleResumePauseEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleResumePauseEffectScope0 = new LifecycleResumePauseEffectScope(lifecycleOwner0.getLifecycle());
                composer1.updateRememberedValue(lifecycleResumePauseEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.a(lifecycleOwner0, lifecycleResumePauseEffectScope0, function10, composer1, v2 & 0x380 | v2 >> 3 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(arr_object, lifecycleOwner0, function10, v, v1, 0));
        }
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "LifecycleStartEffect must provide one or more \'key\' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    public static final void LifecycleStartEffect(@Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xFCF8BB71);
        if((v & 1) == 0 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new l(lifecycleOwner0, function10, v, v1, 1));
            }
            return;
        }
        composer1.startDefaults();
        if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
            composer1.skipToGroupEnd();
            if((v1 & 1) != 0) {
                v &= -15;
            }
        }
        else if((v1 & 1) != 0) {
            LifecycleOwner lifecycleOwner1 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            v &= -15;
        }
        composer1.endDefaults();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFCF8BB71, v, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)");
        }
        throw new IllegalStateException("LifecycleStartEffect must provide one or more \'key\' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object object0, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xAC0ED2D1);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            else if((v1 & 2) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAC0ED2D1, v2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:135)");
            }
            composer1.startReplaceableGroup(0x90107234);
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(lifecycleOwner0);
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope0 = composer1.rememberedValue();
            if(z || z1 || lifecycleStartStopEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleStartStopEffectScope0 = new LifecycleStartStopEffectScope(lifecycleOwner0.getLifecycle());
                composer1.updateRememberedValue(lifecycleStartStopEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.b(lifecycleOwner0, lifecycleStartStopEffectScope0, function10, composer1, v2 >> 3 & 14 | v2 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(object0, lifecycleOwner0, function10, v, v1, 1));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object object0, @Nullable Object object1, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x298A3A31);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(object1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            else if((v1 & 4) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= -897;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x298A3A31, v2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:198)");
            }
            composer1.startReplaceableGroup(0x9011EDBA);
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(object1);
            boolean z2 = composer1.changed(lifecycleOwner0);
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope0 = composer1.rememberedValue();
            if((z | z1 | z2) != 0 || lifecycleStartStopEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleStartStopEffectScope0 = new LifecycleStartStopEffectScope(lifecycleOwner0.getLifecycle());
                composer1.updateRememberedValue(lifecycleStartStopEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.b(lifecycleOwner0, lifecycleStartStopEffectScope0, function10, composer1, v2 >> 6 & 14 | v2 >> 3 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(object0, object1, lifecycleOwner0, function10, v, v1, 1));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v3;
        LifecycleOwner lifecycleOwner1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2242F191);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(object1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(object2) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                lifecycleOwner1 = lifecycleOwner0;
                v3 = composer1.changedInstance(lifecycleOwner0) ? 0x800 : 0x400;
            }
            else {
                lifecycleOwner1 = lifecycleOwner0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            lifecycleOwner1 = lifecycleOwner0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
            }
            else if((v1 & 8) != 0) {
                lifecycleOwner1 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFE3FF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2242F191, v2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:263)");
            }
            composer1.startReplaceableGroup(0x90137660);
            boolean z = composer1.changed(object0);
            boolean z1 = composer1.changed(object1);
            boolean z2 = composer1.changed(object2);
            boolean z3 = composer1.changed(lifecycleOwner1);
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope0 = composer1.rememberedValue();
            if((z | z1 | z2 | z3) != 0 || lifecycleStartStopEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleStartStopEffectScope0 = new LifecycleStartStopEffectScope(lifecycleOwner1.getLifecycle());
                composer1.updateRememberedValue(lifecycleStartStopEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.b(lifecycleOwner1, lifecycleStartStopEffectScope0, function10, composer1, v2 >> 9 & 14 | v2 >> 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(object0, object1, object2, lifecycleOwner1, function10, v, v1, 1));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@NotNull Object[] arr_object, @Nullable LifecycleOwner lifecycleOwner0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xA5FA9044);
        int v2 = (v & 0x30) == 0 ? ((v1 & 2) != 0 || !composer1.changedInstance(lifecycleOwner0) ? 16 : 0x20) | v : v;
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        composer1.startMovableGroup(0x9014CE1F, ((int)arr_object.length));
        for(int v4 = 0; v4 < arr_object.length; ++v4) {
            v2 |= (composer1.changedInstance(arr_object[v4]) ? 4 : 0);
        }
        composer1.endMovableGroup();
        if((v2 & 14) == 0) {
            v2 |= 2;
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
            }
            else if((v1 & 2) != 0) {
                lifecycleOwner0 = (LifecycleOwner)composer1.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                v2 &= 0xFFFFFF8F;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA5FA9044, v2, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:324)");
            }
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.addSpread(arr_object);
            spreadBuilder0.add(lifecycleOwner0);
            Object[] arr_object1 = spreadBuilder0.toArray(new Object[spreadBuilder0.size()]);
            composer1.startReplaceableGroup(0xDE219177);
            boolean z = false;
            for(int v3 = 0; v3 < arr_object1.length; ++v3) {
                z |= composer1.changed(arr_object1[v3]);
            }
            LifecycleStartStopEffectScope lifecycleStartStopEffectScope0 = composer1.rememberedValue();
            if(z || lifecycleStartStopEffectScope0 == Composer.Companion.getEmpty()) {
                lifecycleStartStopEffectScope0 = new LifecycleStartStopEffectScope(lifecycleOwner0.getLifecycle());
                composer1.updateRememberedValue(lifecycleStartStopEffectScope0);
            }
            composer1.endReplaceableGroup();
            LifecycleEffectKt.b(lifecycleOwner0, lifecycleStartStopEffectScope0, function10, composer1, v2 & 0x380 | v2 >> 3 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(arr_object, lifecycleOwner0, function10, v, v1, 1));
        }
    }

    public static final void a(LifecycleOwner lifecycleOwner0, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x366893C6);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(lifecycleOwner0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(lifecycleResumePauseEffectScope0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x366893C6, v1, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:690)");
            }
            composer1.startReplaceableGroup(0x272F3A57);
            boolean z = composer1.changedInstance(lifecycleResumePauseEffectScope0);
            boolean z1 = composer1.changedInstance(lifecycleOwner0);
            m m0 = composer1.rememberedValue();
            if((z | (v1 & 0x380) == 0x100 | z1) != 0 || m0 == Composer.Companion.getEmpty()) {
                m0 = new m(lifecycleOwner0, lifecycleResumePauseEffectScope0, function10);
                composer1.updateRememberedValue(m0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner0, lifecycleResumePauseEffectScope0, m0, composer1, v1 & 0x7E);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 7, lifecycleOwner0, lifecycleResumePauseEffectScope0, function10));
        }
    }

    public static final Function0 access$LifecycleEventEffect$lambda$0(State state0) {
        return (Function0)state0.getValue();
    }

    public static final void access$LifecycleResumeEffectImpl(LifecycleOwner lifecycleOwner0, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope0, Function1 function10, Composer composer0, int v) {
        LifecycleEffectKt.a(lifecycleOwner0, lifecycleResumePauseEffectScope0, function10, composer0, v);
    }

    public static final void access$LifecycleStartEffectImpl(LifecycleOwner lifecycleOwner0, LifecycleStartStopEffectScope lifecycleStartStopEffectScope0, Function1 function10, Composer composer0, int v) {
        LifecycleEffectKt.b(lifecycleOwner0, lifecycleStartStopEffectScope0, function10, composer0, v);
    }

    public static final void b(LifecycleOwner lifecycleOwner0, LifecycleStartStopEffectScope lifecycleStartStopEffectScope0, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD9CAC4E);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(lifecycleOwner0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(lifecycleStartStopEffectScope0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD9CAC4E, v1, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)");
            }
            composer1.startReplaceableGroup(0xBFDA35F9);
            boolean z = composer1.changedInstance(lifecycleStartStopEffectScope0);
            boolean z1 = composer1.changedInstance(lifecycleOwner0);
            n n0 = composer1.rememberedValue();
            if((z | (v1 & 0x380) == 0x100 | z1) != 0 || n0 == Composer.Companion.getEmpty()) {
                n0 = new n(lifecycleOwner0, lifecycleStartStopEffectScope0, function10);
                composer1.updateRememberedValue(n0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner0, lifecycleStartStopEffectScope0, n0, composer1, v1 & 0x7E);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 8, lifecycleOwner0, lifecycleStartStopEffectScope0, function10));
        }
    }
}


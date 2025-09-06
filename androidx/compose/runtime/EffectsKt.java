package androidx.compose.runtime;

import androidx.compose.foundation.text.selection.s;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job.Key;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001D\u0010\u0003\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A(\u0010\t\u001A\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\t\u0010\n\u001A2\u0010\t\u001A\u00020\u00012\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\t\u0010\r\u001A<\u0010\t\u001A\u00020\u00012\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000B2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\t\u0010\u000F\u001AF\u0010\t\u001A\u00020\u00012\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000B2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\t\u0010\u0011\u001A@\u0010\t\u001A\u00020\u00012\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000B0\u0012\"\u0004\u0018\u00010\u000B2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\t\u0010\u0014\u001A8\u0010\u0019\u001A\u00020\u00012\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0015\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001AB\u0010\u0019\u001A\u00020\u00012\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0015\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001B\u001AL\u0010\u0019\u001A\u00020\u00012\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000B2\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0015\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001C\u001AV\u0010\u0019\u001A\u00020\u00012\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000B2\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0015\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001D\u001AP\u0010\u0019\u001A\u00020\u00012\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000B0\u0012\"\u0004\u0018\u00010\u000B2\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0015\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001E\u001A\u001F\u0010#\u001A\u00020\u00162\u0006\u0010 \u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020!H\u0001\u00A2\u0006\u0004\b#\u0010$\u001A%\u0010\'\u001A\u00020\u00162\u0013\b\u0006\u0010&\u001A\r\u0012\u0004\u0012\u00020\u001F0\u0000\u00A2\u0006\u0002\b%H\u0087\b\u00A2\u0006\u0004\b\'\u0010(\u00A8\u0006)"}, d2 = {"Lkotlin/Function0;", "", "effect", "SideEffect", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "DisposableEffect", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "LaunchedEffect", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/DisallowComposableCalls;", "getContext", "rememberCoroutineScope", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,497:1\n1223#2,6:498\n1223#2,6:504\n1223#2,6:510\n1223#2,6:520\n1223#2,6:526\n1223#2,6:532\n1223#2,6:538\n1223#2,6:548\n1223#2,6:554\n86#3,4:516\n86#3,4:544\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n157#1:498,6\n197#1:504,6\n238#1:510,6\n278#1:520,6\n340#1:526,6\n363#1:532,6\n387#1:538,6\n420#1:548,6\n490#1:554,6\n278#1:516,4\n420#1:544,4\n*E\n"})
public final class EffectsKt {
    public static final DisposableEffectScope a;

    static {
        EffectsKt.a = new DisposableEffectScope();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB61E25A1, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        if((composer0.changed(object0) | composer0.changed(object1) | composer0.changed(object2)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new k(function10));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object object0, @Nullable Object object1, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x552E4D01, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        if((composer0.changed(object0) | composer0.changed(object1)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new k(function10));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object object0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAE392461, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        if(composer0.changed(object0) || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new k(function10));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    public static final void DisposableEffect(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException("DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.");
    }

    @Composable
    public static final void DisposableEffect(@NotNull Object[] arr_object, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB20F318E, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        boolean z = false;
        for(int v1 = 0; v1 < arr_object1.length; ++v1) {
            z |= composer0.changed(arr_object1[v1]);
        }
        if(z || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new k(function10));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        if((composer0.changed(object0) | composer0.changed(object1) | composer0.changed(object2)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object object0, @Nullable Object object1, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        if((composer0.changed(object0) | composer0.changed(object1)) != 0 || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object object0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4648F105, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        if(composer0.changed(object0) || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @Deprecated(level = DeprecationLevel.ERROR, message = "LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    public static final void LaunchedEffect(@NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCFFE54A5);
        if((v & 1) == 0 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new s(v, 6, function20));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCFFE54A5, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
        }
        throw new IllegalStateException("LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
    }

    @Composable
    public static final void LaunchedEffect(@NotNull Object[] arr_object, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        CoroutineContext coroutineContext0 = composer0.getApplyCoroutineContext();
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        boolean z = false;
        for(int v1 = 0; v1 < arr_object1.length; ++v1) {
            z |= composer0.changed(arr_object1[v1]);
        }
        if(z || composer0.rememberedValue() == Composer.Companion.getEmpty()) {
            composer0.updateRememberedValue(new LaunchedEffectImpl(coroutineContext0, function20));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void SideEffect(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB3338EB7, v, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        composer0.recordSideEffect(function00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @PublishedApi
    @NotNull
    public static final CoroutineScope createCompositionCoroutineScope(@NotNull CoroutineContext coroutineContext0, @NotNull Composer composer0) {
        Key job$Key0 = Job.Key;
        if(coroutineContext0.get(job$Key0) != null) {
            CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
            completableJob0.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return CoroutineScopeKt.CoroutineScope(completableJob0);
        }
        CoroutineContext coroutineContext1 = composer0.getApplyCoroutineContext();
        return CoroutineScopeKt.CoroutineScope(coroutineContext1.plus(JobKt.Job(((Job)coroutineContext1.get(job$Key0)))).plus(coroutineContext0));
    }

    @Composable
    @NotNull
    public static final CoroutineScope rememberCoroutineScope(@Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            function00 = androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1.INSTANCE;
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(((CoroutineContext)function00.invoke()), composer0));
            composer0.updateRememberedValue(compositionScopedCoroutineScopeCanceller0);
        }
        return compositionScopedCoroutineScopeCanceller0.getCoroutineScope();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,497:1\n*E\n"})
        public final class androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1 extends Lambda implements Function0 {
            public static final androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1 INSTANCE;

            static {
                androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1.INSTANCE = new androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1();
            }

            public androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            @NotNull
            public final EmptyCoroutineContext invoke() {
                return EmptyCoroutineContext.INSTANCE;
            }
        }

    }
}


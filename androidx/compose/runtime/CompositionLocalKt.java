package androidx.compose.runtime;

import aa.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z9.k;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A(\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001A,\u0010\u0000\u001A\u00020\u00012\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\n\u001A<\u0010\u0000\u001A\u00020\u00012\u001A\u0010\u000B\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\f\"\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\r\u001A0\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00100\u000F\"\u0004\b\u0000\u0010\u00102\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\u00100\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u00100\u0005\u001A+\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\u00100\u000F\"\u0004\b\u0000\u0010\u00102\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002H\u00100\u0016¢\u0006\u0002\b\u0018\u001A \u0010\u0019\u001A\b\u0012\u0004\u0012\u0002H\u00100\u000F\"\u0004\b\u0000\u0010\u00102\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u00100\u0005¨\u0006\u001A"}, d2 = {"CompositionLocalProvider", "", "context", "Landroidx/compose/runtime/CompositionLocalContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionLocalContext;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "values", "", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "compositionLocalOf", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "compositionLocalWithComputedDefaultOf", "defaultComputation", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "staticCompositionLocalOf", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,424:1\n125#2:425\n152#2,3:426\n37#3,2:429\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n420#1:425\n420#1:426,3\n420#1:429,2\n*E\n"})
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull CompositionLocalContext compositionLocalContext0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6E803C08);
        int v1 = (v & 6) == 0 ? (composer1.changed(compositionLocalContext0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6E803C08, v1, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:417)");
            }
            PersistentCompositionLocalMap persistentCompositionLocalMap0 = compositionLocalContext0.getCompositionLocals$runtime_release();
            ArrayList arrayList0 = new ArrayList(persistentCompositionLocalMap0.size());
            for(Object object0: persistentCompositionLocalMap0.entrySet()) {
                arrayList0.add(((ValueHolder)((Map.Entry)object0).getValue()).toProvided(((CompositionLocal)((Map.Entry)object0).getKey())));
            }
            ProvidedValue[] arr_providedValue = (ProvidedValue[])arrayList0.toArray(new ProvidedValue[0]);
            CompositionLocalKt.CompositionLocalProvider(((ProvidedValue[])Arrays.copyOf(arr_providedValue, arr_providedValue.length)), function20, composer1, v1 & 0x70);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(compositionLocalContext0, function20, v, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull ProvidedValue providedValue0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1350970552);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, v, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        composer1.startProvider(providedValue0);
        function20.invoke(composer1, ((int)(v >> 3 & 14)));
        composer1.endProvider();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(providedValue0, function20, v, 28));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull ProvidedValue[] arr_providedValue, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1390796515);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, v, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        composer1.startProviders(arr_providedValue);
        function20.invoke(composer1, ((int)(v >> 3 & 14)));
        composer1.endProviders();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(arr_providedValue, function20, v, 27));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal compositionLocalOf(@NotNull SnapshotMutationPolicy snapshotMutationPolicy0, @NotNull Function0 function00) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy0, function00);
    }

    public static ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            snapshotMutationPolicy0 = SnapshotStateKt.structuralEqualityPolicy();
        }
        return CompositionLocalKt.compositionLocalOf(snapshotMutationPolicy0, function00);
    }

    @NotNull
    public static final ProvidableCompositionLocal compositionLocalWithComputedDefaultOf(@NotNull Function1 function10) {
        return new ComputedProvidableCompositionLocal(function10);
    }

    @NotNull
    public static final ProvidableCompositionLocal staticCompositionLocalOf(@NotNull Function0 function00) {
        return new StaticProvidableCompositionLocal(function00);
    }
}


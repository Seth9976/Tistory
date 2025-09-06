package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.x;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.a1;
import y0.b1;
import y0.c1;
import y0.d1;
import y0.e1;
import y0.g1;
import y0.j1;
import y0.y;
import y0.z0;

@Metadata(d1 = {"y0/z0"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotStateKt {
    @Composable
    @NotNull
    public static final State collectAsState(@NotNull Flow flow0, Object object0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, v, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:63)");
        }
        boolean z = composer0.changedInstance(coroutineContext0);
        boolean z1 = composer0.changedInstance(flow0);
        g1 g10 = composer0.rememberedValue();
        if(z || z1 || g10 == Composer.Companion.getEmpty()) {
            g10 = new g1(coroutineContext0, flow0, null);
            composer0.updateRememberedValue(g10);
        }
        State state0 = SnapshotStateKt.produceState(object0, flow0, coroutineContext0, g10, composer0, v >> 3 & 14 | v << 3 & 0x70 | v & 0x380);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State collectAsState(@NotNull StateFlow stateFlow0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAA2D1D71, v, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:47)");
        }
        State state0 = SnapshotStateKt.collectAsState(stateFlow0, stateFlow0.getValue(), coroutineContext0, composer0, v & 14 | v << 3 & 0x380, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @NotNull
    public static final MutableVector derivedStateObservers() {
        SnapshotThreadLocal snapshotThreadLocal0 = z0.b;
        MutableVector mutableVector0 = (MutableVector)snapshotThreadLocal0.get();
        if(mutableVector0 == null) {
            mutableVector0 = new MutableVector(new DerivedStateObserver[0], 0);
            snapshotThreadLocal0.set(mutableVector0);
        }
        return mutableVector0;
    }

    @StateFactoryMarker
    @NotNull
    public static final State derivedStateOf(@NotNull SnapshotMutationPolicy snapshotMutationPolicy0, @NotNull Function0 function00) {
        return new b(snapshotMutationPolicy0, function00);
    }

    @StateFactoryMarker
    @NotNull
    public static final State derivedStateOf(@NotNull Function0 function00) {
        return new b(null, function00);
    }

    public static final Object getValue(@NotNull State state0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        return state0.getValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final SnapshotStateList mutableStateListOf() {
        return new SnapshotStateList();
    }

    @StateFactoryMarker
    @NotNull
    public static final SnapshotStateList mutableStateListOf(@NotNull Object[] arr_object) {
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(ArraysKt___ArraysKt.toList(arr_object));
        return snapshotStateList0;
    }

    @StateFactoryMarker
    @NotNull
    public static final SnapshotStateMap mutableStateMapOf() {
        return new SnapshotStateMap();
    }

    @StateFactoryMarker
    @NotNull
    public static final SnapshotStateMap mutableStateMapOf(@NotNull Pair[] arr_pair) {
        SnapshotStateMap snapshotStateMap0 = new SnapshotStateMap();
        snapshotStateMap0.putAll(x.toMap(arr_pair));
        return snapshotStateMap0;
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableState mutableStateOf(Object object0, @NotNull SnapshotMutationPolicy snapshotMutationPolicy0) {
        return ActualAndroid_androidKt.createSnapshotMutableState(object0, snapshotMutationPolicy0);
    }

    public static MutableState mutableStateOf$default(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0, int v, Object object1) {
        if((v & 2) != 0) {
            snapshotMutationPolicy0 = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(object0, snapshotMutationPolicy0);
    }

    @NotNull
    public static final SnapshotMutationPolicy neverEqualPolicy() {
        Intrinsics.checkNotNull(y.b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return y.b;
    }

    public static final void observeDerivedStateRecalculations(@NotNull DerivedStateObserver derivedStateObserver0, @NotNull Function0 function00) {
        MutableVector mutableVector0 = SnapshotStateKt.derivedStateObservers();
        try {
            mutableVector0.add(derivedStateObserver0);
            function00.invoke();
        }
        finally {
            mutableVector0.removeAt(mutableVector0.getSize() - 1);
        }
    }

    @Composable
    @NotNull
    public static final State produceState(Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:181)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        boolean z = composer0.changedInstance(function20);
        d1 d10 = composer0.rememberedValue();
        if(z || d10 == composer$Companion0.getEmpty()) {
            d10 = new d1(function20, mutableState0, null);
            composer0.updateRememberedValue(d10);
        }
        EffectsKt.LaunchedEffect(object1, object2, object3, d10, composer0, v >> 3 & 0x3FE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    @Composable
    @NotNull
    public static final State produceState(Object object0, @Nullable Object object1, @Nullable Object object2, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        boolean z = composer0.changedInstance(function20);
        c1 c10 = composer0.rememberedValue();
        if(z || c10 == composer$Companion0.getEmpty()) {
            c10 = new c1(function20, mutableState0, null);
            composer0.updateRememberedValue(c10);
        }
        EffectsKt.LaunchedEffect(object1, object2, c10, composer0, v >> 3 & 0x7E);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    @Composable
    @NotNull
    public static final State produceState(Object object0, @Nullable Object object1, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8D10F463, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        boolean z = composer0.changedInstance(function20);
        b1 b10 = composer0.rememberedValue();
        if(z || b10 == composer$Companion0.getEmpty()) {
            b10 = new b1(function20, mutableState0, null);
            composer0.updateRememberedValue(b10);
        }
        EffectsKt.LaunchedEffect(object1, b10, composer0, v >> 3 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    @Composable
    @NotNull
    public static final State produceState(Object object0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9F8503, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        Unit unit0 = Unit.INSTANCE;
        boolean z = composer0.changedInstance(function20);
        a1 a10 = composer0.rememberedValue();
        if(z || a10 == composer$Companion0.getEmpty()) {
            a10 = new a1(function20, mutableState0, null);
            composer0.updateRememberedValue(a10);
        }
        EffectsKt.LaunchedEffect(unit0, a10, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    @Composable
    @NotNull
    public static final State produceState(Object object0, @NotNull Object[] arr_object, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, v, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        boolean z = composer0.changedInstance(function20);
        e1 e10 = composer0.rememberedValue();
        if(z || e10 == composer$Companion0.getEmpty()) {
            e10 = new e1(function20, mutableState0, null);
            composer0.updateRememberedValue(e10);
        }
        EffectsKt.LaunchedEffect(arr_object1, e10, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    @NotNull
    public static final SnapshotMutationPolicy referentialEqualityPolicy() {
        Intrinsics.checkNotNull(y.c, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return y.c;
    }

    @Composable
    @NotNull
    public static final State rememberUpdatedState(Object object0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC0EB518E, v, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        mutableState0.setValue(object0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }

    public static final void setValue(@NotNull MutableState mutableState0, @Nullable Object object0, @NotNull KProperty kProperty0, Object object1) {
        mutableState0.setValue(object1);
    }

    @NotNull
    public static final Flow snapshotFlow(@NotNull Function0 function00) {
        return FlowKt.flow(new j1(function00, null));
    }

    @NotNull
    public static final SnapshotMutationPolicy structuralEqualityPolicy() {
        Intrinsics.checkNotNull(y.d, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return y.d;
    }

    @NotNull
    public static final SnapshotStateList toMutableStateList(@NotNull Collection collection0) {
        SnapshotStateList snapshotStateList0 = new SnapshotStateList();
        snapshotStateList0.addAll(collection0);
        return snapshotStateList0;
    }

    @NotNull
    public static final SnapshotStateMap toMutableStateMap(@NotNull Iterable iterable0) {
        SnapshotStateMap snapshotStateMap0 = new SnapshotStateMap();
        snapshotStateMap0.putAll(x.toMap(iterable0));
        return snapshotStateMap0;
    }
}


package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import i4.e;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AG\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u00022\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\u000B\u001AI\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u00022\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\u000E\u001A?\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000F2\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\u0010\u001AA\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000F2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,181:1\n74#2:182\n74#2:183\n1116#3,6:184\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n58#1:182\n131#1:183\n171#1:184,6\n*E\n"})
public final class FlowExtKt {
    @Composable
    @NotNull
    public static final State collectAsStateWithLifecycle(@NotNull Flow flow0, Object object0, @NotNull Lifecycle lifecycle0, @Nullable androidx.lifecycle.Lifecycle.State lifecycle$State0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x75E27F00);
        if((v1 & 4) != 0) {
            lifecycle$State0 = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        if((v1 & 8) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x75E27F00, v, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        Object[] arr_object = {flow0, lifecycle0, lifecycle$State0, coroutineContext0};
        composer0.startReplaceableGroup(710004817);
        boolean z = composer0.changedInstance(lifecycle0);
        boolean z1 = (v & 0x1C00 ^ 0xC00) > 0x800 && composer0.changed(lifecycle$State0) || (v & 0xC00) == 0x800;
        boolean z2 = composer0.changedInstance(coroutineContext0);
        boolean z3 = composer0.changedInstance(flow0);
        e e0 = composer0.rememberedValue();
        if((z | z1 | z2 | z3) != 0 || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(lifecycle0, lifecycle$State0, coroutineContext0, flow0, null);
            composer0.updateRememberedValue(e0);
        }
        composer0.endReplaceableGroup();
        State state0 = SnapshotStateKt.produceState(object0, arr_object, e0, composer0, v >> 3 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Composable
    @NotNull
    public static final State collectAsStateWithLifecycle(@NotNull Flow flow0, Object object0, @Nullable LifecycleOwner lifecycleOwner0, @Nullable androidx.lifecycle.Lifecycle.State lifecycle$State0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xA76D7B65);
        LifecycleOwner lifecycleOwner1 = (v1 & 2) == 0 ? lifecycleOwner0 : ((LifecycleOwner)composer0.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner()));
        androidx.lifecycle.Lifecycle.State lifecycle$State1 = (v1 & 4) == 0 ? lifecycle$State0 : androidx.lifecycle.Lifecycle.State.STARTED;
        CoroutineContext coroutineContext1 = (v1 & 8) == 0 ? coroutineContext0 : EmptyCoroutineContext.INSTANCE;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA76D7B65, v, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(flow0, object0, lifecycleOwner1.getLifecycle(), lifecycle$State1, coroutineContext1, composer0, v & 14 | (v >> 3 & 8) << 3 | v & 0x70 | v & 0x1C00 | v & 0xE000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Composable
    @NotNull
    public static final State collectAsStateWithLifecycle(@NotNull StateFlow stateFlow0, @NotNull Lifecycle lifecycle0, @Nullable androidx.lifecycle.Lifecycle.State lifecycle$State0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x913EB1ED);
        if((v1 & 2) != 0) {
            lifecycle$State0 = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        if((v1 & 4) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x913EB1ED, v, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:95)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(stateFlow0, stateFlow0.getValue(), lifecycle0, lifecycle$State0, coroutineContext0, composer0, v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }

    @Composable
    @NotNull
    public static final State collectAsStateWithLifecycle(@NotNull StateFlow stateFlow0, @Nullable LifecycleOwner lifecycleOwner0, @Nullable androidx.lifecycle.Lifecycle.State lifecycle$State0, @Nullable CoroutineContext coroutineContext0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(743249048);
        if((v1 & 1) != 0) {
            lifecycleOwner0 = (LifecycleOwner)composer0.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if((v1 & 2) != 0) {
            lifecycle$State0 = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        if((v1 & 4) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, v, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        State state0 = FlowExtKt.collectAsStateWithLifecycle(stateFlow0, stateFlow0.getValue(), lifecycleOwner0.getLifecycle(), lifecycle$State0, coroutineContext0, composer0, v & 14 | v << 3 & 0x1C00 | v << 3 & 0xE000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return state0;
    }
}


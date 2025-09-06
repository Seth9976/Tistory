package androidx.compose.runtime.livedata;

import aa.r;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A%\u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A5\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0002*\u0002H\u0005*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0006\u001A\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"observeAsState", "Landroidx/compose/runtime/State;", "T", "Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "R", "initial", "(Landroidx/lifecycle/LiveData;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,71:1\n77#2:72\n1223#3,6:73\n1223#3,6:79\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n*L\n59#1:72\n60#1:73,6\n64#1:79,6\n*E\n"})
public final class LiveDataAdapterKt {
    @Composable
    @NotNull
    public static final State observeAsState(@NotNull LiveData liveData0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x872B4A00, v, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(liveData0, liveData0.getValue(), composer0, v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state0;
    }

    @Composable
    @NotNull
    public static final State observeAsState(@NotNull LiveData liveData0, Object object0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411178300, v, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:57)");
        }
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)composer0.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            if(liveData0.isInitialized()) {
                object0 = liveData0.getValue();
            }
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        boolean z = composer0.changedInstance(liveData0);
        boolean z1 = composer0.changedInstance(lifecycleOwner0);
        r r0 = composer0.rememberedValue();
        if(z || z1 || r0 == composer$Companion0.getEmpty()) {
            r0 = new r(liveData0, lifecycleOwner0, 8, mutableState0);
            composer0.updateRememberedValue(r0);
        }
        EffectsKt.DisposableEffect(liveData0, lifecycleOwner0, r0, composer0, v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState0;
    }
}


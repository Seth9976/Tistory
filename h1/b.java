package h1;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final Saver x;

    public b(Saver saver0, int v) {
        this.w = v;
        this.x = saver0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object4;
        Object object2;
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((MutableState)object0), "it");
            if(!(((MutableState)object0) instanceof SnapshotMutableState)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if(((MutableState)object0).getValue() == null) {
                object2 = null;
            }
            else {
                Object object1 = ((MutableState)object0).getValue();
                Intrinsics.checkNotNull(object1);
                object2 = this.x.restore(object1);
            }
            SnapshotMutationPolicy snapshotMutationPolicy0 = ((SnapshotMutableState)(((MutableState)object0))).getPolicy();
            Intrinsics.checkNotNull(snapshotMutationPolicy0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5?>");
            MutableState mutableState0 = SnapshotStateKt.mutableStateOf(object2, snapshotMutationPolicy0);
            Intrinsics.checkNotNull(mutableState0, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5>");
            return mutableState0;
        }
        if(!(((MutableState)object0) instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(((MutableState)object0).getValue() == null) {
            object4 = null;
        }
        else {
            Object object3 = ((MutableState)object0).getValue();
            Intrinsics.checkNotNull(object3);
            object4 = this.x.restore(object3);
        }
        SnapshotMutationPolicy snapshotMutationPolicy1 = ((SnapshotMutableState)(((MutableState)object0))).getPolicy();
        Intrinsics.checkNotNull(snapshotMutationPolicy1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
        MutableState mutableState1 = SnapshotStateKt.mutableStateOf(object4, snapshotMutationPolicy1);
        Intrinsics.checkNotNull(mutableState1, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3>");
        return mutableState1;
    }
}


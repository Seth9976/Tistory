package h1;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final int w;
    public final Saver x;

    public a(Saver saver0, int v) {
        this.w = v;
        this.x = saver0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((SaverScope)object0), "$this$Saver");
            Intrinsics.checkNotNullParameter(((MutableState)object1), "state");
            if(!(((MutableState)object1) instanceof SnapshotMutableState)) {
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
            }
            Object object2 = ((MutableState)object1).getValue();
            Object object3 = this.x.save(((SaverScope)object0), object2);
            SnapshotMutationPolicy snapshotMutationPolicy0 = ((SnapshotMutableState)(((MutableState)object1))).getPolicy();
            Intrinsics.checkNotNull(snapshotMutationPolicy0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.mutableStateOf(object3, snapshotMutationPolicy0);
        }
        if(!(((MutableState)object1) instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        Object object4 = ((MutableState)object1).getValue();
        Object object5 = this.x.save(((SaverScope)object0), object4);
        if(object5 != null) {
            SnapshotMutationPolicy snapshotMutationPolicy1 = ((SnapshotMutableState)(((MutableState)object1))).getPolicy();
            Intrinsics.checkNotNull(snapshotMutationPolicy1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.mutableStateOf(object5, snapshotMutationPolicy1);
        }
        return null;
    }
}


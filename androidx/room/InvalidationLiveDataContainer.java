package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E\"\u0004\b\u0000\u0010\u00062\u000E\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u000B\u001A\u00020\n2\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0013\u001A\u00020\u00122\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u000E¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001A\u00020\u00122\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u000E¢\u0006\u0004\b\u0015\u0010\u0014R$\u0010\u001B\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000E0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/room/InvalidationLiveDataContainer;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "create", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "liveData", "", "onActive", "(Landroidx/lifecycle/LiveData;)V", "onInactive", "", "b", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InvalidationLiveDataContainer {
    public final RoomDatabase a;
    public final Set b;

    public InvalidationLiveDataContainer(@NotNull RoomDatabase roomDatabase0) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "database");
        super();
        this.a = roomDatabase0;
        Set set0 = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(set0, "newSetFromMap(IdentityHashMap())");
        this.b = set0;
    }

    @NotNull
    public final LiveData create(@NotNull String[] arr_s, boolean z, @NotNull Callable callable0) {
        Intrinsics.checkNotNullParameter(arr_s, "tableNames");
        Intrinsics.checkNotNullParameter(callable0, "computeFunction");
        return new RoomTrackingLiveData(this.a, this, z, callable0, arr_s);
    }

    @NotNull
    public final Set getLiveDataSet$room_runtime_release() {
        return this.b;
    }

    public final void onActive(@NotNull LiveData liveData0) {
        Intrinsics.checkNotNullParameter(liveData0, "liveData");
        this.b.add(liveData0);
    }

    public final void onInactive(@NotNull LiveData liveData0) {
        Intrinsics.checkNotNullParameter(liveData0, "liveData");
        this.b.remove(liveData0);
    }
}


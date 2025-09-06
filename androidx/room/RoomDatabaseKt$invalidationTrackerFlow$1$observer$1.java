package androidx.room;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/RoomDatabaseKt$invalidationTrackerFlow$1$observer$1", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "", "onInvalidated", "(Ljava/util/Set;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RoomDatabaseKt.invalidationTrackerFlow.1.observer.1 extends Observer {
    public final AtomicBoolean b;
    public final ProducerScope c;

    public RoomDatabaseKt.invalidationTrackerFlow.1.observer.1(String[] arr_s, AtomicBoolean atomicBoolean0, ProducerScope producerScope0) {
        this.b = atomicBoolean0;
        this.c = producerScope0;
        super(arr_s);
    }

    @Override  // androidx.room.InvalidationTracker$Observer
    public void onInvalidated(@NotNull Set set0) {
        if(this.b.get()) {
            return;
        }
        this.c.trySend-JP2dKIU(set0);
    }
}


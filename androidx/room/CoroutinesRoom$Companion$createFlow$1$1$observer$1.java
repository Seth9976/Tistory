package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/CoroutinesRoom$Companion$createFlow$1$1$observer$1", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "", "onInvalidated", "(Ljava/util/Set;)V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CoroutinesRoom.Companion.createFlow.1.1.observer.1 extends Observer {
    public final Channel b;

    public CoroutinesRoom.Companion.createFlow.1.1.observer.1(String[] arr_s, Channel channel0) {
        this.b = channel0;
        super(arr_s);
    }

    @Override  // androidx.room.InvalidationTracker$Observer
    public void onInvalidated(@NotNull Set set0) {
        this.b.trySend-JP2dKIU(Unit.INSTANCE);
    }
}


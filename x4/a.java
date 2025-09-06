package x4;

import androidx.room.InvalidationTracker.Observer;
import androidx.room.paging.LimitOffsetDataSource;
import java.util.Set;

public final class a extends Observer {
    public final LimitOffsetDataSource b;

    public a(LimitOffsetDataSource limitOffsetDataSource0, String[] arr_s) {
        this.b = limitOffsetDataSource0;
        super(arr_s);
    }

    @Override  // androidx.room.InvalidationTracker$Observer
    public final void onInvalidated(Set set0) {
        this.b.invalidate();
    }
}


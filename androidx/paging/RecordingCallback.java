package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001F\u0010\n\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001F\u0010\u000B\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\tJ\u0015\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u0001¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/paging/RecordingCallback;", "Landroidx/paging/PagedList$Callback;", "<init>", "()V", "", "position", "count", "", "onChanged", "(II)V", "onInserted", "onRemoved", "other", "dispatchRecordingTo", "(Landroidx/paging/PagedList$Callback;)V", "Companion", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RecordingCallback extends Callback {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/paging/RecordingCallback$Companion;", "", "", "Changed", "I", "Inserted", "Removed", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ArrayList a;

    static {
        RecordingCallback.Companion = new Companion(null);
    }

    public RecordingCallback() {
        this.a = new ArrayList();
    }

    public final void dispatchRecordingTo(@NotNull Callback pagedList$Callback0) {
        Intrinsics.checkNotNullParameter(pagedList$Callback0, "other");
        ArrayList arrayList0 = this.a;
        IntProgression intProgression0 = c.step(c.until(0, arrayList0.size()), 3);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                switch(((Number)arrayList0.get(v)).intValue()) {
                    case 0: {
                        pagedList$Callback0.onChanged(((Number)arrayList0.get(v + 1)).intValue(), ((Number)arrayList0.get(v + 2)).intValue());
                        break;
                    }
                    case 1: {
                        pagedList$Callback0.onInserted(((Number)arrayList0.get(v + 1)).intValue(), ((Number)arrayList0.get(v + 2)).intValue());
                        break;
                    }
                    case 2: {
                        pagedList$Callback0.onRemoved(((Number)arrayList0.get(v + 1)).intValue(), ((Number)arrayList0.get(v + 2)).intValue());
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        arrayList0.clear();
    }

    @Override  // androidx.paging.PagedList$Callback
    public void onChanged(int v, int v1) {
        this.a.add(0);
        this.a.add(v);
        this.a.add(v1);
    }

    @Override  // androidx.paging.PagedList$Callback
    public void onInserted(int v, int v1) {
        this.a.add(1);
        this.a.add(v);
        this.a.add(v1);
    }

    @Override  // androidx.paging.PagedList$Callback
    public void onRemoved(int v, int v1) {
        this.a.add(2);
        this.a.add(v);
        this.a.add(v1);
    }
}


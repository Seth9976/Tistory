package s4;

import androidx.paging.DiffingChangePayload;
import androidx.paging.PlaceholderPaddedList;
import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

public final class f0 implements ListUpdateCallback {
    public final PlaceholderPaddedList a;
    public final PlaceholderPaddedList b;
    public final ListUpdateCallback c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
    }

    public f0(ListUpdateCallback listUpdateCallback0, PlaceholderPaddedList placeholderPaddedList0, PlaceholderPaddedList placeholderPaddedList1) {
        Intrinsics.checkNotNullParameter(placeholderPaddedList0, "oldList");
        Intrinsics.checkNotNullParameter(placeholderPaddedList1, "newList");
        Intrinsics.checkNotNullParameter(listUpdateCallback0, "callback");
        super();
        this.a = placeholderPaddedList0;
        this.b = placeholderPaddedList1;
        this.c = listUpdateCallback0;
        this.d = placeholderPaddedList0.getPlaceholdersBefore();
        this.e = placeholderPaddedList0.getPlaceholdersAfter();
        this.f = placeholderPaddedList0.getDataCount();
        this.g = 1;
        this.h = 1;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public final void onChanged(int v, int v1, Object object0) {
        this.c.onChanged(v + this.d, v1, object0);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public final void onInserted(int v, int v1) {
        ListUpdateCallback listUpdateCallback0 = this.c;
        if(v >= this.f && this.h != 2) {
            int v4 = Math.min(v1, this.e);
            if(v4 > 0) {
                this.h = 3;
                listUpdateCallback0.onChanged(this.d + v, v4, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.e -= v4;
            }
            int v5 = v1 - v4;
            if(v5 > 0) {
                listUpdateCallback0.onInserted(v + v4 + this.d, v5);
            }
        }
        else if(v > 0 || this.g == 2) {
            listUpdateCallback0.onInserted(v + this.d, v1);
        }
        else {
            int v2 = Math.min(v1, this.d);
            if(v2 > 0) {
                this.g = 3;
                listUpdateCallback0.onChanged(this.d - v2, v2, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.d -= v2;
            }
            int v3 = v1 - v2;
            if(v3 > 0) {
                listUpdateCallback0.onInserted(this.d, v3);
            }
        }
        this.f += v1;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public final void onMoved(int v, int v1) {
        this.c.onMoved(v + this.d, v1 + this.d);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public final void onRemoved(int v, int v1) {
        PlaceholderPaddedList placeholderPaddedList0 = this.b;
        ListUpdateCallback listUpdateCallback0 = this.c;
        if(v + v1 >= this.f && this.h != 3) {
            int v4 = c.coerceAtLeast(Math.min(placeholderPaddedList0.getPlaceholdersAfter() - this.e, v1), 0);
            int v5 = v1 - v4;
            if(v4 > 0) {
                this.h = 2;
                listUpdateCallback0.onChanged(this.d + v, v4, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.e += v4;
            }
            if(v5 > 0) {
                listUpdateCallback0.onRemoved(v + v4 + this.d, v5);
            }
        }
        else if(v > 0 || this.g == 3) {
            listUpdateCallback0.onRemoved(v + this.d, v1);
        }
        else {
            int v2 = c.coerceAtLeast(Math.min(placeholderPaddedList0.getPlaceholdersBefore() - this.d, v1), 0);
            int v3 = v1 - v2;
            if(v3 > 0) {
                listUpdateCallback0.onRemoved(this.d, v3);
            }
            if(v2 > 0) {
                this.g = 2;
                listUpdateCallback0.onChanged(this.d, v2, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.d += v2;
            }
        }
        this.f -= v1;
    }
}


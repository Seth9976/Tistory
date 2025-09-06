package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

public class BatchingListUpdateCallback implements ListUpdateCallback {
    public final ListUpdateCallback a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback0) {
        this.b = 0;
        this.c = -1;
        this.d = -1;
        this.e = null;
        this.a = listUpdateCallback0;
    }

    public void dispatchLastEvent() {
        int v = this.b;
        if(v == 0) {
            return;
        }
        ListUpdateCallback listUpdateCallback0 = this.a;
        switch(v) {
            case 1: {
                listUpdateCallback0.onInserted(this.c, this.d);
                break;
            }
            case 2: {
                listUpdateCallback0.onRemoved(this.c, this.d);
                break;
            }
            case 3: {
                listUpdateCallback0.onChanged(this.c, this.d, this.e);
            }
        }
        this.e = null;
        this.b = 0;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int v, int v1, Object object0) {
        if(this.b == 3) {
            int v2 = this.c;
            int v3 = this.d + v2;
            if(v <= v3) {
                int v4 = v + v1;
                if(v4 >= v2 && this.e == object0) {
                    this.c = Math.min(v, v2);
                    this.d = Math.max(v3, v4) - this.c;
                    return;
                }
            }
        }
        this.dispatchLastEvent();
        this.c = v;
        this.d = v1;
        this.e = object0;
        this.b = 3;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int v, int v1) {
        if(this.b == 1) {
            int v2 = this.c;
            if(v >= v2) {
                int v3 = this.d;
                if(v <= v2 + v3) {
                    this.d = v3 + v1;
                    this.c = Math.min(v, v2);
                    return;
                }
            }
        }
        this.dispatchLastEvent();
        this.c = v;
        this.d = v1;
        this.b = 1;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int v, int v1) {
        this.dispatchLastEvent();
        this.a.onMoved(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int v, int v1) {
        if(this.b == 2 && (this.c >= v && this.c <= v + v1)) {
            this.d += v1;
            this.c = v;
            return;
        }
        this.dispatchLastEvent();
        this.c = v;
        this.d = v1;
        this.b = 2;
    }
}


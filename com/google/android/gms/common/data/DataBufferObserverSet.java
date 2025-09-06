package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.HashSet;

public final class DataBufferObserverSet implements Observable, DataBufferObserver {
    public final HashSet a;

    public DataBufferObserverSet() {
        this.a = new HashSet();
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver$Observable
    public void addObserver(@NonNull DataBufferObserver dataBufferObserver0) {
        this.a.add(dataBufferObserver0);
    }

    public void clear() {
        this.a.clear();
    }

    public boolean hasObservers() {
        return !this.a.isEmpty();
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        for(Object object0: this.a) {
            ((DataBufferObserver)object0).onDataChanged();
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int v, int v1) {
        for(Object object0: this.a) {
            ((DataBufferObserver)object0).onDataRangeChanged(v, v1);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int v, int v1) {
        for(Object object0: this.a) {
            ((DataBufferObserver)object0).onDataRangeInserted(v, v1);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int v, int v1, int v2) {
        for(Object object0: this.a) {
            ((DataBufferObserver)object0).onDataRangeMoved(v, v1, v2);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int v, int v1) {
        for(Object object0: this.a) {
            ((DataBufferObserver)object0).onDataRangeRemoved(v, v1);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBufferObserver$Observable
    public void removeObserver(@NonNull DataBufferObserver dataBufferObserver0) {
        this.a.remove(dataBufferObserver0);
    }
}


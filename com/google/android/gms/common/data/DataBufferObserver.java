package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

public interface DataBufferObserver {
    public interface Observable {
        void addObserver(@NonNull DataBufferObserver arg1);

        void removeObserver(@NonNull DataBufferObserver arg1);
    }

    void onDataChanged();

    void onDataRangeChanged(int arg1, int arg2);

    void onDataRangeInserted(int arg1, int arg2);

    void onDataRangeMoved(int arg1, int arg2, int arg3);

    void onDataRangeRemoved(int arg1, int arg2);
}


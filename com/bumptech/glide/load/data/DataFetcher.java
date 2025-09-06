package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public interface DataFetcher {
    public interface DataCallback {
        void onDataReady(@Nullable Object arg1);

        void onLoadFailed(@NonNull Exception arg1);
    }

    void cancel();

    void cleanup();

    @NonNull
    Class getDataClass();

    @NonNull
    DataSource getDataSource();

    void loadData(@NonNull Priority arg1, @NonNull DataCallback arg2);
}


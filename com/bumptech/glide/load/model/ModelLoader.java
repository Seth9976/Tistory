package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.Collections;
import java.util.List;

public interface ModelLoader {
    public static class LoadData {
        public final List alternateKeys;
        public final DataFetcher fetcher;
        public final Key sourceKey;

        public LoadData(@NonNull Key key0, @NonNull DataFetcher dataFetcher0) {
            this(key0, Collections.emptyList(), dataFetcher0);
        }

        public LoadData(@NonNull Key key0, @NonNull List list0, @NonNull DataFetcher dataFetcher0) {
            this.sourceKey = (Key)Preconditions.checkNotNull(key0);
            this.alternateKeys = (List)Preconditions.checkNotNull(list0);
            this.fetcher = (DataFetcher)Preconditions.checkNotNull(dataFetcher0);
        }
    }

    @Nullable
    LoadData buildLoadData(@NonNull Object arg1, int arg2, int arg3, @NonNull Options arg4);

    boolean handles(@NonNull Object arg1);
}


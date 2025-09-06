package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

interface ViewInfoStore.ProcessCallback {
    void processAppeared(ViewHolder arg1, @Nullable ItemHolderInfo arg2, ItemHolderInfo arg3);

    void processDisappeared(ViewHolder arg1, @NonNull ItemHolderInfo arg2, @Nullable ItemHolderInfo arg3);

    void processPersistent(ViewHolder arg1, @NonNull ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

    void unused(ViewHolder arg1);
}


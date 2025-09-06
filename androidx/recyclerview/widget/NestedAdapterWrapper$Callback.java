package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

interface NestedAdapterWrapper.Callback {
    void onChanged(@NonNull a1 arg1);

    void onItemRangeChanged(@NonNull a1 arg1, int arg2, int arg3);

    void onItemRangeChanged(@NonNull a1 arg1, int arg2, int arg3, @Nullable Object arg4);

    void onItemRangeInserted(@NonNull a1 arg1, int arg2, int arg3);

    void onItemRangeMoved(@NonNull a1 arg1, int arg2, int arg3);

    void onItemRangeRemoved(@NonNull a1 arg1, int arg2, int arg3);

    void onStateRestorationPolicyChanged(a1 arg1);
}


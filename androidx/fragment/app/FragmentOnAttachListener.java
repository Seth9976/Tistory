package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

public interface FragmentOnAttachListener {
    @MainThread
    void onAttachFragment(@NonNull FragmentManager arg1, @NonNull Fragment arg2);
}


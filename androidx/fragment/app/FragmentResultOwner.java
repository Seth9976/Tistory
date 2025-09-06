package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

public interface FragmentResultOwner {
    void clearFragmentResult(@NonNull String arg1);

    void clearFragmentResultListener(@NonNull String arg1);

    void setFragmentResult(@NonNull String arg1, @NonNull Bundle arg2);

    void setFragmentResultListener(@NonNull String arg1, @NonNull LifecycleOwner arg2, @NonNull FragmentResultListener arg3);
}


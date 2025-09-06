package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

@Deprecated
public class ViewModelStores {
    @MainThread
    @NonNull
    @Deprecated
    public static ViewModelStore of(@NonNull Fragment fragment0) {
        return fragment0.getViewModelStore();
    }

    @MainThread
    @NonNull
    @Deprecated
    public static ViewModelStore of(@NonNull FragmentActivity fragmentActivity0) {
        return fragmentActivity0.getViewModelStore();
    }
}


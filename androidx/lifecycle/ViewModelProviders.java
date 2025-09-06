package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

@Deprecated
public class ViewModelProviders {
    @Deprecated
    public static class DefaultFactory extends AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(@NonNull Application application0) {
            super(application0);
        }
    }

    @MainThread
    @NonNull
    @Deprecated
    public static ViewModelProvider of(@NonNull Fragment fragment0) {
        return new ViewModelProvider(fragment0);
    }

    @MainThread
    @NonNull
    @Deprecated
    public static ViewModelProvider of(@NonNull Fragment fragment0, @Nullable Factory viewModelProvider$Factory0) {
        if(viewModelProvider$Factory0 == null) {
            viewModelProvider$Factory0 = fragment0.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragment0.getViewModelStore(), viewModelProvider$Factory0);
    }

    @MainThread
    @NonNull
    @Deprecated
    public static ViewModelProvider of(@NonNull FragmentActivity fragmentActivity0) {
        return new ViewModelProvider(fragmentActivity0);
    }

    @MainThread
    @NonNull
    @Deprecated
    public static ViewModelProvider of(@NonNull FragmentActivity fragmentActivity0, @Nullable Factory viewModelProvider$Factory0) {
        if(viewModelProvider$Factory0 == null) {
            viewModelProvider$Factory0 = fragmentActivity0.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragmentActivity0.getViewModelStore(), viewModelProvider$Factory0);
    }
}


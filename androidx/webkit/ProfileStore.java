package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ProfileStoreImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.util.List;

@UiThread
public interface ProfileStore {
    boolean deleteProfile(@NonNull String arg1);

    @NonNull
    List getAllProfileNames();

    @NonNull
    static ProfileStore getInstance() {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return ProfileStoreImpl.getInstance();
    }

    @NonNull
    Profile getOrCreateProfile(@NonNull String arg1);

    @Nullable
    Profile getProfile(@NonNull String arg1);
}


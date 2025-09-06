package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class ProfileStoreImpl implements ProfileStore {
    public final ProfileStoreBoundaryInterface a;
    public static ProfileStoreImpl b;

    public ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreBoundaryInterface0) {
        this.a = profileStoreBoundaryInterface0;
    }

    @Override  // androidx.webkit.ProfileStore
    public boolean deleteProfile(@NonNull String s) throws IllegalStateException {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.deleteProfile(s);
    }

    @Override  // androidx.webkit.ProfileStore
    @NonNull
    public List getAllProfileNames() {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.getAllProfileNames();
    }

    @Override  // androidx.webkit.ProfileStore
    @NonNull
    public static ProfileStore getInstance() {
        if(ProfileStoreImpl.b == null) {
            ProfileStoreImpl.b = new ProfileStoreImpl(WebViewGlueCommunicator.getFactory().getProfileStore());
        }
        return ProfileStoreImpl.b;
    }

    @Override  // androidx.webkit.ProfileStore
    @NonNull
    public Profile getOrCreateProfile(@NonNull String s) {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        InvocationHandler invocationHandler0 = this.a.getOrCreateProfile(s);
        return new ProfileImpl(((ProfileBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, invocationHandler0)));
    }

    @Override  // androidx.webkit.ProfileStore
    @Nullable
    public Profile getProfile(@NonNull String s) {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        InvocationHandler invocationHandler0 = this.a.getProfile(s);
        return invocationHandler0 != null ? new ProfileImpl(((ProfileBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, invocationHandler0))) : null;
    }
}


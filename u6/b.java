package u6;

import com.google.android.datatransport.runtime.dagger.MembersInjector;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public enum b implements MembersInjector {
    INSTANCE;

    @Override  // com.google.android.datatransport.runtime.dagger.MembersInjector
    public final void injectMembers(Object object0) {
        Preconditions.checkNotNull(object0, "Cannot inject members into a null reference");
    }
}


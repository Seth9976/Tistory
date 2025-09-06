package dagger.hilt.android.internal.modules;

import android.app.Application;
import dagger.hilt.android.internal.Contexts;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata
public final class ApplicationContextModule_ProvideApplicationFactory implements Factory {
    public final ApplicationContextModule a;

    public ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule0) {
        this.a = applicationContextModule0;
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule0) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule0);
    }

    public Application get() {
        return ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.a);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule0) {
        return (Application)Preconditions.checkNotNullFromProvides(Contexts.getApplication(applicationContextModule0.a));
    }
}


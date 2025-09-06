package dagger.hilt.android.internal.modules;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.qualifiers.ApplicationContext"})
@ScopeMetadata
public final class ApplicationContextModule_ProvideContextFactory implements Factory {
    public final ApplicationContextModule a;

    public ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule0) {
        this.a = applicationContextModule0;
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule0) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule0);
    }

    public Context get() {
        return ApplicationContextModule_ProvideContextFactory.provideContext(this.a);
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule0) {
        return (Context)Preconditions.checkNotNullFromProvides(applicationContextModule0.a);
    }
}


package dagger.hilt.android.internal.managers;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@DaggerGenerated
@QualifierMetadata
@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements Factory {
    public static ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return d.a;
    }

    public ActivityRetainedLifecycle get() {
        return ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle)Preconditions.checkNotNullFromProvides(new RetainedLifecycleImpl());
    }
}


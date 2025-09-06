package dagger.hilt.android.internal.managers;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.components.ActivityRetainedComponent;

@EntryPoint
@InstallIn({ActivityRetainedComponent.class})
public interface ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint {
    ActivityRetainedLifecycle getActivityRetainedLifecycle();
}


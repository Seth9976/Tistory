package dagger.hilt.android.internal.managers;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;

@EntryPoint
@InstallIn({ActivityRetainedComponent.class})
@OriginatingElement(topLevelClass = c.class)
public interface HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint extends ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint {
}


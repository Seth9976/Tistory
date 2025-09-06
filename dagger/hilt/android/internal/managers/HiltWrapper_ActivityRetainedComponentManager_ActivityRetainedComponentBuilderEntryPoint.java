package dagger.hilt.android.internal.managers;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@EntryPoint
@InstallIn({SingletonComponent.class})
@OriginatingElement(topLevelClass = c.class)
public interface HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint extends ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint {
}


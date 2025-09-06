package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;

@EntryPoint
@InstallIn({ActivityComponent.class})
@OriginatingElement(topLevelClass = HiltViewModelFactory.class)
public interface HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint extends ActivityCreatorEntryPoint {
}


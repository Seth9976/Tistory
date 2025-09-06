package dagger.hilt.android.internal.lifecycle;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;

@Module(includes = {ActivityModule.class})
@InstallIn({ActivityComponent.class})
@OriginatingElement(topLevelClass = DefaultViewModelFactories.class)
public final class HiltWrapper_DefaultViewModelFactories_ActivityModule {
}


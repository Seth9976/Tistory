package dagger.hilt.android.internal.lifecycle;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.codegen.OriginatingElement;

@Module(includes = {ViewModelModule.class})
@InstallIn({ViewModelComponent.class})
@OriginatingElement(topLevelClass = HiltViewModelFactory.class)
public final class HiltWrapper_HiltViewModelFactory_ViewModelModule {
}


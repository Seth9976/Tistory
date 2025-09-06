package dagger.hilt.android.flags;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;

@Module(includes = {a.class})
@InstallIn({SingletonComponent.class})
@OriginatingElement(topLevelClass = FragmentGetContextFix.class)
public final class HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule {
}


package dagger.hilt.android.internal.modules;

import android.content.Context;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn({SingletonComponent.class})
public final class ApplicationContextModule {
    public final Context a;

    public ApplicationContextModule(Context context0) {
        this.a = context0;
    }
}


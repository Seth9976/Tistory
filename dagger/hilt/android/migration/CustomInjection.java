package dagger.hilt.android.migration;

import android.app.Application;
import androidx.annotation.NonNull;
import dagger.hilt.android.internal.migration.HasCustomInject;
import dagger.hilt.internal.Preconditions;

public final class CustomInjection {
    public static void inject(@NonNull Application application0) {
        Preconditions.checkNotNull(application0);
        Preconditions.checkArgument(application0 instanceof HasCustomInject, "\'%s\' is not a custom inject application. Check that you have annotated the application with both @HiltAndroidApp and @CustomInject.", new Object[]{application0.getClass()});
        ((HasCustomInject)application0).customInject();
    }
}


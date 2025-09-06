package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.content.Context;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public final class BroadcastReceiverComponentManager {
    public static Object generatedComponent(Context context0) {
        Application application0 = Contexts.getApplication(context0.getApplicationContext());
        Preconditions.checkArgument(application0 instanceof GeneratedComponentManager, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{application0.getClass()});
        return ((GeneratedComponentManager)application0).generatedComponent();
    }
}


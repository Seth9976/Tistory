package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public final class ServiceComponentManager implements GeneratedComponentManager {
    @EntryPoint
    @InstallIn({SingletonComponent.class})
    public interface ServiceComponentBuilderEntryPoint {
        ServiceComponentBuilder serviceComponentBuilder();
    }

    public final Service a;
    public ServiceComponent b;

    public ServiceComponentManager(Service service0) {
        this.a = service0;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if(this.b == null) {
            Application application0 = this.a.getApplication();
            Preconditions.checkState(application0 instanceof GeneratedComponentManager, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", new Object[]{application0.getClass()});
            this.b = ((ServiceComponentBuilderEntryPoint)EntryPoints.get(application0, ServiceComponentBuilderEntryPoint.class)).serviceComponentBuilder().service(this.a).build();
        }
        return this.b;
    }
}


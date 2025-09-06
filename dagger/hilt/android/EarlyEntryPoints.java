package dagger.hilt.android;

import android.app.Application;
import android.content.Context;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.TestSingletonComponentManager;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

public final class EarlyEntryPoints {
    @Nonnull
    public static Object get(Context context0, Class class0) {
        Application application0 = Contexts.getApplication(context0);
        Preconditions.checkState(application0 instanceof GeneratedComponentManagerHolder, "Expected application to implement GeneratedComponentManagerHolder. Check that you\'re passing in an application context that uses Hilt. Application class found: %s", new Object[]{application0.getClass()});
        GeneratedComponentManager generatedComponentManager0 = ((GeneratedComponentManagerHolder)application0).componentManager();
        if(generatedComponentManager0 instanceof TestSingletonComponentManager) {
            Annotation[] arr_annotation = class0.getAnnotations();
            boolean z = false;
            for(int v = 0; v < arr_annotation.length; ++v) {
                if(arr_annotation[v].annotationType().equals(EarlyEntryPoint.class)) {
                    z = true;
                    break;
                }
            }
            Preconditions.checkState(z, "%s should be called with EntryPoints.get() rather than EarlyEntryPoints.get()", new Object[]{class0.getCanonicalName()});
            return class0.cast(((TestSingletonComponentManager)generatedComponentManager0).earlySingletonComponent());
        }
        return EntryPoints.get(application0, class0);
    }
}


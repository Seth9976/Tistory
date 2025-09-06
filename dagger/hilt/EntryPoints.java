package dagger.hilt;

import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.TestSingletonComponent;
import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

public final class EntryPoints {
    @Nonnull
    public static Object get(Object object0, Class class0) {
        if(object0 instanceof GeneratedComponent) {
            if(object0 instanceof TestSingletonComponent) {
                Annotation[] arr_annotation = class0.getAnnotations();
                int v = 0;
                for(int v1 = 0; v1 < arr_annotation.length; ++v1) {
                    if(arr_annotation[v1].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                        v = 1;
                        break;
                    }
                }
                Preconditions.checkState(((boolean)(v ^ 1)), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", new Object[]{class0.getCanonicalName()});
            }
            return class0.cast(object0);
        }
        if(!(object0 instanceof GeneratedComponentManager)) {
            throw new IllegalStateException("Given component holder " + object0.getClass() + " does not implement " + GeneratedComponent.class + " or " + GeneratedComponentManager.class);
        }
        return EntryPoints.get(((GeneratedComponentManager)object0).generatedComponent(), class0);
    }
}


package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RequiresApi(api = 28)
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface CompatWrapped {
        Object getWrapper();
    }

    public static Object a(Object object0) {
        if(object0 instanceof CompatWrapped) {
            Object object1 = ((CompatWrapped)object0).getWrapper();
            return object1 == null ? object0 : object1;
        }
        return object0;
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public Activity instantiateActivity(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity)CoreComponentFactory.a(super.instantiateActivity(classLoader0, s, intent0));
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public Application instantiateApplication(@NonNull ClassLoader classLoader0, @NonNull String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application)CoreComponentFactory.a(super.instantiateApplication(classLoader0, s));
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public ContentProvider instantiateProvider(@NonNull ClassLoader classLoader0, @NonNull String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider)CoreComponentFactory.a(super.instantiateProvider(classLoader0, s));
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver)CoreComponentFactory.a(super.instantiateReceiver(classLoader0, s, intent0));
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public Service instantiateService(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service)CoreComponentFactory.a(super.instantiateService(classLoader0, s, intent0));
    }
}


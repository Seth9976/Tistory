package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

@RequiresApi(28)
public class AppComponentFactory extends android.app.AppComponentFactory {
    @Override  // android.app.AppComponentFactory
    @NonNull
    public final Activity instantiateActivity(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity)CoreComponentFactory.a(this.instantiateActivityCompat(classLoader0, s, intent0));
    }

    @NonNull
    public Activity instantiateActivityCompat(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity)Class.forName(s, false, classLoader0).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public final Application instantiateApplication(@NonNull ClassLoader classLoader0, @NonNull String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application)CoreComponentFactory.a(this.instantiateApplicationCompat(classLoader0, s));
    }

    @NonNull
    public Application instantiateApplicationCompat(@NonNull ClassLoader classLoader0, @NonNull String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application)Class.forName(s, false, classLoader0).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public final ContentProvider instantiateProvider(@NonNull ClassLoader classLoader0, @NonNull String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider)CoreComponentFactory.a(this.instantiateProviderCompat(classLoader0, s));
    }

    @NonNull
    public ContentProvider instantiateProviderCompat(@NonNull ClassLoader classLoader0, @NonNull String s) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider)Class.forName(s, false, classLoader0).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public final BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver)CoreComponentFactory.a(this.instantiateReceiverCompat(classLoader0, s, intent0));
    }

    @NonNull
    public BroadcastReceiver instantiateReceiverCompat(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver)Class.forName(s, false, classLoader0).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }

    @Override  // android.app.AppComponentFactory
    @NonNull
    public final Service instantiateService(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service)CoreComponentFactory.a(this.instantiateServiceCompat(classLoader0, s, intent0));
    }

    @NonNull
    public Service instantiateServiceCompat(@NonNull ClassLoader classLoader0, @NonNull String s, @Nullable Intent intent0) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service)Class.forName(s, false, classLoader0).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        }
        catch(InvocationTargetException | NoSuchMethodException invocationTargetException0) {
            throw new RuntimeException("Couldn\'t call constructor", invocationTargetException0);
        }
    }
}


package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;

public class ActivityComponentManager implements GeneratedComponentManager {
    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    public interface ActivityComponentBuilderEntryPoint {
        ActivityComponentBuilder activityComponentBuilder();
    }

    public volatile Object a;
    protected final Activity activity;
    public final Object b;
    public final c c;

    public ActivityComponentManager(Activity activity0) {
        this.b = new Object();
        this.activity = activity0;
        this.c = new c(((ComponentActivity)activity0));
    }

    public Object createComponent() {
        if(!(this.activity.getApplication() instanceof GeneratedComponentManager)) {
            Class class0 = this.activity.getApplication().getClass();
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. " + (Application.class.equals(class0) ? "Did you forget to specify your Application\'s class name in your manifest\'s <application />\'s android:name attribute?" : "Found: " + this.activity.getApplication().getClass()));
        }
        return ((ActivityComponentBuilderEntryPoint)EntryPoints.get(this.c, ActivityComponentBuilderEntryPoint.class)).activityComponentBuilder().activity(this.activity).build();
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = this.createComponent();
                }
            }
        }
        return this.a;
    }

    public final SavedStateHandleHolder getSavedStateHandleHolder() {
        a a0 = new a(this.c.b);
        return ((b)new ViewModelProvider(this.c.a, a0).get(b.class)).I0;
    }
}


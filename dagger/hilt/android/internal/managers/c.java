package dagger.hilt.android.internal.managers;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.internal.GeneratedComponentManager;

public final class c implements GeneratedComponentManager {
    public final ComponentActivity a;
    public final ComponentActivity b;
    public volatile ActivityRetainedComponent c;
    public final Object d;

    public c(ComponentActivity componentActivity0) {
        this.d = new Object();
        this.a = componentActivity0;
        this.b = componentActivity0;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if(this.c == null) {
            Object object0 = this.d;
            synchronized(object0) {
                if(this.c == null) {
                    a a0 = new a(this.b);
                    this.c = ((b)new ViewModelProvider(this.a, a0).get(b.class)).H0;
                }
            }
        }
        return this.c;
    }
}


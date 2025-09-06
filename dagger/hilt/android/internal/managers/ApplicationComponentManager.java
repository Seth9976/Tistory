package dagger.hilt.android.internal.managers;

import dagger.hilt.internal.GeneratedComponentManager;

public final class ApplicationComponentManager implements GeneratedComponentManager {
    public volatile Object a;
    public final Object b;
    public final ComponentSupplier c;

    public ApplicationComponentManager(ComponentSupplier componentSupplier0) {
        this.b = new Object();
        this.c = componentSupplier0;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = this.c.get();
                }
            }
        }
        return this.a;
    }
}


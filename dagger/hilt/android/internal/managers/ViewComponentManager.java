package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public final class ViewComponentManager implements GeneratedComponentManager {
    public static final class FragmentContextWrapper extends ContextWrapper {
        public Fragment a;
        public LayoutInflater b;
        public LayoutInflater c;

        @Override  // android.content.ContextWrapper
        public Object getSystemService(String s) {
            if(!"layout_inflater".equals(s)) {
                return this.getBaseContext().getSystemService(s);
            }
            if(this.c == null) {
                if(this.b == null) {
                    this.b = (LayoutInflater)this.getBaseContext().getSystemService("layout_inflater");
                }
                this.c = this.b.cloneInContext(this);
            }
            return this.c;
        }
    }

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder viewComponentBuilder();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public volatile Object a;
    public final Object b;
    public final boolean c;
    public final View d;

    public ViewComponentManager(View view0, boolean z) {
        this.b = new Object();
        this.d = view0;
        this.c = z;
    }

    public final Object a() {
        GeneratedComponentManager generatedComponentManager0 = this.b(false);
        View view0 = this.d;
        return this.c ? ((ViewWithFragmentComponentBuilderEntryPoint)EntryPoints.get(generatedComponentManager0, ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(view0).build() : ((ViewComponentBuilderEntryPoint)EntryPoints.get(generatedComponentManager0, ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(view0).build();
    }

    public final GeneratedComponentManager b(boolean z) {
        View view0 = this.d;
        Class class0 = GeneratedComponentManager.class;
        if(this.c) {
            Context context0 = this.c(FragmentContextWrapper.class, z);
            if(context0 instanceof FragmentContextWrapper) {
                Preconditions.checkNotNull(((FragmentContextWrapper)context0).a, "The fragment has already been destroyed.");
                return (GeneratedComponentManager)((FragmentContextWrapper)context0).a;
            }
            if(z) {
                return null;
            }
            Context context1 = this.c(class0, false);
            Preconditions.checkState(!(context1 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", new Object[]{view0.getClass(), context1.getClass().getName()});
        }
        else {
            Context context2 = this.c(class0, z);
            if(context2 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager)context2;
            }
            if(z) {
                return null;
            }
        }
        throw new IllegalStateException(view0.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    public final Context c(Class class0, boolean z) {
        View view0 = this.d;
        Context context0;
        for(context0 = view0.getContext(); context0 instanceof ContextWrapper && !class0.isInstance(context0); context0 = ((ContextWrapper)context0).getBaseContext()) {
        }
        if(context0 == Contexts.getApplication(context0.getApplicationContext())) {
            Preconditions.checkState(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", new Object[]{view0.getClass()});
            return null;
        }
        return context0;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public Object generatedComponent() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = this.a();
                }
            }
        }
        return this.a;
    }

    public GeneratedComponentManager maybeGetParentComponentManager() {
        return this.b(true);
    }
}


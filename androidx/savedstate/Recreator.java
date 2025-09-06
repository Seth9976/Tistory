package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000EB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000F"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Recreator implements LifecycleEventObserver {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry;", "registry", "<init>", "(Landroidx/savedstate/SavedStateRegistry;)V", "Landroid/os/Bundle;", "saveState", "()Landroid/os/Bundle;", "", "className", "", "add", "(Ljava/lang/String;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        public final LinkedHashSet a;

        public SavedStateProvider(@NotNull SavedStateRegistry savedStateRegistry0) {
            Intrinsics.checkNotNullParameter(savedStateRegistry0, "registry");
            super();
            this.a = new LinkedHashSet();
            savedStateRegistry0.registerSavedStateProvider("androidx.savedstate.Restarter", this);
        }

        public final void add(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "className");
            this.a.add(s);
        }

        @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
        @NotNull
        public Bundle saveState() {
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle0;
        }
    }

    @NotNull
    public static final String CLASSES_KEY = "classes_to_restore";
    @NotNull
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    @NotNull
    public static final Companion Companion;
    public final SavedStateRegistryOwner a;

    static {
        Recreator.Companion = new Companion(null);
    }

    public Recreator(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
        super();
        this.a = savedStateRegistryOwner0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
        AutoRecreated savedStateRegistry$AutoRecreated0;
        Constructor constructor0;
        Class class0;
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 != Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner0.getLifecycle().removeObserver(this);
        SavedStateRegistryOwner savedStateRegistryOwner0 = this.a;
        Bundle bundle0 = savedStateRegistryOwner0.getSavedStateRegistry().consumeRestoredStateForKey("androidx.savedstate.Restarter");
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getStringArrayList("classes_to_restore");
        if(arrayList0 == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for(Object object0: arrayList0) {
            String s = (String)object0;
            try {
                class0 = Class.forName(s, false, Recreator.class.getClassLoader()).asSubclass(AutoRecreated.class);
                Intrinsics.checkNotNullExpressionValue(class0, "{\n                Class.…class.java)\n            }");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException("Class " + s + " wasn\'t found", classNotFoundException0);
            }
            try {
                constructor0 = class0.getDeclaredConstructor(null);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new IllegalStateException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
            }
            constructor0.setAccessible(true);
            try {
                Object object1 = constructor0.newInstance(null);
                Intrinsics.checkNotNullExpressionValue(object1, "{\n                constr…wInstance()\n            }");
                savedStateRegistry$AutoRecreated0 = (AutoRecreated)object1;
            }
            catch(Exception exception0) {
                throw new RuntimeException("Failed to instantiate " + s, exception0);
            }
            savedStateRegistry$AutoRecreated0.onRecreated(savedStateRegistryOwner0);
        }
    }
}


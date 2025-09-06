package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001A\u00020\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0010\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0012"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "", "performAttach", "()V", "Landroid/os/Bundle;", "savedState", "performRestore", "(Landroid/os/Bundle;)V", "outBundle", "performSave", "Landroidx/savedstate/SavedStateRegistry;", "b", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SavedStateRegistryController {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroidx/savedstate/SavedStateRegistryController;", "create", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/savedstate/SavedStateRegistryController;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
            return new SavedStateRegistryController(savedStateRegistryOwner0, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final SavedStateRegistryOwner a;
    public final SavedStateRegistry b;
    public boolean c;

    static {
        SavedStateRegistryController.Companion = new Companion(null);
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = savedStateRegistryOwner0;
        this.b = new SavedStateRegistry();
    }

    @JvmStatic
    @NotNull
    public static final SavedStateRegistryController create(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        return SavedStateRegistryController.Companion.create(savedStateRegistryOwner0);
    }

    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.b;
    }

    @MainThread
    public final void performAttach() {
        SavedStateRegistryOwner savedStateRegistryOwner0 = this.a;
        Lifecycle lifecycle0 = savedStateRegistryOwner0.getLifecycle();
        if(lifecycle0.getCurrentState() != State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        }
        lifecycle0.addObserver(new Recreator(savedStateRegistryOwner0));
        this.b.performAttach$savedstate_release(lifecycle0);
        this.c = true;
    }

    @MainThread
    public final void performRestore(@Nullable Bundle bundle0) {
        if(!this.c) {
            this.performAttach();
        }
        Lifecycle lifecycle0 = this.a.getLifecycle();
        if(lifecycle0.getCurrentState().isAtLeast(State.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle0.getCurrentState()).toString());
        }
        this.b.performRestore$savedstate_release(bundle0);
    }

    @MainThread
    public final void performSave(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outBundle");
        this.b.performSave(bundle0);
    }
}


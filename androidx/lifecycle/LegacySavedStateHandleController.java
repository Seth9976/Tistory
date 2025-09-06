package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.AutoRecreated;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014J3\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000B\u0010\fJ\'\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "Landroidx/savedstate/SavedStateRegistry;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "create", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/ViewModel;", "viewModel", "", "attachHandleIfNeeded", "(Landroidx/lifecycle/ViewModel;Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;)V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LegacySavedStateHandleController {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "()V", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class OnRecreation implements AutoRecreated {
        @Override  // androidx.savedstate.SavedStateRegistry$AutoRecreated
        public void onRecreated(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "owner");
            if(!(savedStateRegistryOwner0 instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore0 = ((ViewModelStoreOwner)savedStateRegistryOwner0).getViewModelStore();
            SavedStateRegistry savedStateRegistry0 = savedStateRegistryOwner0.getSavedStateRegistry();
            for(Object object0: viewModelStore0.keys()) {
                ViewModel viewModel0 = viewModelStore0.get(((String)object0));
                Intrinsics.checkNotNull(viewModel0);
                LegacySavedStateHandleController.attachHandleIfNeeded(viewModel0, savedStateRegistry0, savedStateRegistryOwner0.getLifecycle());
            }
            if(!viewModelStore0.keys().isEmpty()) {
                savedStateRegistry0.runOnNextRecreation(OnRecreation.class);
            }
        }
    }

    @NotNull
    public static final LegacySavedStateHandleController INSTANCE = null;
    @NotNull
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    static {
        LegacySavedStateHandleController.INSTANCE = new LegacySavedStateHandleController();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(SavedStateRegistry savedStateRegistry0, Lifecycle lifecycle0) {
        State lifecycle$State0 = lifecycle0.getCurrentState();
        if(lifecycle$State0 != State.INITIALIZED && !lifecycle$State0.isAtLeast(State.STARTED)) {
            lifecycle0.addObserver(new LegacySavedStateHandleController.tryToAddRecreator.1(savedStateRegistry0, lifecycle0));
            return;
        }
        savedStateRegistry0.runOnNextRecreation(OnRecreation.class);
    }

    @JvmStatic
    public static final void attachHandleIfNeeded(@NotNull ViewModel viewModel0, @NotNull SavedStateRegistry savedStateRegistry0, @NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(viewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(savedStateRegistry0, "registry");
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        SavedStateHandleController savedStateHandleController0 = (SavedStateHandleController)viewModel0.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if(savedStateHandleController0 != null && !savedStateHandleController0.isAttached()) {
            savedStateHandleController0.attachToLifecycle(savedStateRegistry0, lifecycle0);
            LegacySavedStateHandleController.INSTANCE.getClass();
            LegacySavedStateHandleController.a(savedStateRegistry0, lifecycle0);
        }
    }

    @JvmStatic
    @NotNull
    public static final SavedStateHandleController create(@NotNull SavedStateRegistry savedStateRegistry0, @NotNull Lifecycle lifecycle0, @Nullable String s, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(savedStateRegistry0, "registry");
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        Intrinsics.checkNotNull(s);
        Bundle bundle1 = savedStateRegistry0.consumeRestoredStateForKey(s);
        SavedStateHandleController savedStateHandleController0 = new SavedStateHandleController(s, SavedStateHandle.Companion.createHandle(bundle1, bundle0));
        savedStateHandleController0.attachToLifecycle(savedStateRegistry0, lifecycle0);
        LegacySavedStateHandleController.INSTANCE.getClass();
        LegacySavedStateHandleController.a(savedStateRegistry0, lifecycle0);
        return savedStateHandleController0;
    }
}


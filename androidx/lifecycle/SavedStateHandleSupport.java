package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A!\u0010\u0004\u001A\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u0013\u0010\b\u001A\u00020\u0007*\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001A\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000B\u0010\f\"\u001A\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u001A\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000F\u0010\f\"\u0018\u0010\u0013\u001A\u00020\u0010*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001A\u00020\u0014*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "T", "", "enableSavedStateHandles", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/SavedStateHandle;", "createSavedStateHandle", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "Landroid/os/Bundle;", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "SavedStateHandleSupport")
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class SavedStateHandleSupport {
    @JvmField
    @NotNull
    public static final Key DEFAULT_ARGS_KEY;
    @JvmField
    @NotNull
    public static final Key SAVED_STATE_REGISTRY_OWNER_KEY;
    @JvmField
    @NotNull
    public static final Key VIEW_MODEL_STORE_OWNER_KEY;

    static {
        SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY = new SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY = new SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        SavedStateHandleSupport.DEFAULT_ARGS_KEY = new SavedStateHandleSupport.DEFAULT_ARGS_KEY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @MainThread
    @NotNull
    public static final SavedStateHandle createSavedStateHandle(@NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(creationExtras0, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner0 = (SavedStateRegistryOwner)creationExtras0.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY);
        if(savedStateRegistryOwner0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner0 = (ViewModelStoreOwner)creationExtras0.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY);
        if(viewModelStoreOwner0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle0 = (Bundle)creationExtras0.get(SavedStateHandleSupport.DEFAULT_ARGS_KEY);
        String s = (String)creationExtras0.get(NewInstanceFactory.VIEW_MODEL_KEY);
        if(s == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        SavedStateHandlesProvider savedStateHandlesProvider0 = SavedStateHandleSupport.getSavedStateHandlesProvider(savedStateRegistryOwner0);
        SavedStateHandlesVM savedStateHandlesVM0 = SavedStateHandleSupport.getSavedStateHandlesVM(viewModelStoreOwner0);
        SavedStateHandle savedStateHandle0 = (SavedStateHandle)savedStateHandlesVM0.getHandles().get(s);
        if(savedStateHandle0 == null) {
            Bundle bundle1 = savedStateHandlesProvider0.consumeRestoredStateForKey(s);
            savedStateHandle0 = SavedStateHandle.Companion.createHandle(bundle1, bundle0);
            savedStateHandlesVM0.getHandles().put(s, savedStateHandle0);
        }
        return savedStateHandle0;
    }

    @MainThread
    public static final void enableSavedStateHandles(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "<this>");
        State lifecycle$State0 = savedStateRegistryOwner0.getLifecycle().getCurrentState();
        if(lifecycle$State0 != State.INITIALIZED && lifecycle$State0 != State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(savedStateRegistryOwner0.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider0 = new SavedStateHandlesProvider(savedStateRegistryOwner0.getSavedStateRegistry(), ((ViewModelStoreOwner)savedStateRegistryOwner0));
            savedStateRegistryOwner0.getSavedStateRegistry().registerSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider0);
            savedStateRegistryOwner0.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider0));
        }
    }

    @NotNull
    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(@NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner0, "<this>");
        SavedStateProvider savedStateRegistry$SavedStateProvider0 = savedStateRegistryOwner0.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider0 = savedStateRegistry$SavedStateProvider0 instanceof SavedStateHandlesProvider ? ((SavedStateHandlesProvider)savedStateRegistry$SavedStateProvider0) : null;
        if(savedStateHandlesProvider0 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call");
        }
        return savedStateHandlesProvider0;
    }

    @NotNull
    public static final SavedStateHandlesVM getSavedStateHandlesVM(@NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "<this>");
        return (SavedStateHandlesVM)new ViewModelProvider(viewModelStoreOwner0, new Factory() {  // 初始化器: Ljava/lang/Object;-><init>()V
            @Override  // androidx.lifecycle.ViewModelProvider$Factory
            @NotNull
            public ViewModel create(@NotNull Class class0, @NotNull CreationExtras creationExtras0) {
                Intrinsics.checkNotNullParameter(class0, "modelClass");
                Intrinsics.checkNotNullParameter(creationExtras0, "extras");
                return new SavedStateHandlesVM();
            }
        }).get("androidx.lifecycle.internal.SavedStateHandlesVM", SavedStateHandlesVM.class);
    }
}


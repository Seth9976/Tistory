package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000E\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR(\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "", "onCleared", "()V", "Ljava/util/UUID;", "H0", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "id", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolderRef", "Ljava/lang/ref/WeakReference;", "getSaveableStateHolderRef", "()Ljava/lang/ref/WeakReference;", "setSaveableStateHolderRef", "(Ljava/lang/ref/WeakReference;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class BackStackEntryIdViewModel extends ViewModel {
    public static final int $stable = 8;
    public final UUID H0;
    public WeakReference saveableStateHolderRef;

    public BackStackEntryIdViewModel(@NotNull SavedStateHandle savedStateHandle0) {
        UUID uUID0 = (UUID)savedStateHandle0.get("SaveableStateHolder_BackStackEntryKey");
        if(uUID0 == null) {
            uUID0 = UUID.randomUUID();
            savedStateHandle0.set("SaveableStateHolder_BackStackEntryKey", uUID0);
        }
        this.H0 = uUID0;
    }

    @NotNull
    public final UUID getId() {
        return this.H0;
    }

    @NotNull
    public final WeakReference getSaveableStateHolderRef() {
        WeakReference weakReference0 = this.saveableStateHolderRef;
        if(weakReference0 != null) {
            return weakReference0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        return null;
    }

    @Override  // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder0 = (SaveableStateHolder)this.getSaveableStateHolderRef().get();
        if(saveableStateHolder0 != null) {
            saveableStateHolder0.removeState(this.H0);
        }
        this.getSaveableStateHolderRef().clear();
    }

    public final void setSaveableStateHolderRef(@NotNull WeakReference weakReference0) {
        this.saveableStateHolderRef = weakReference0;
    }
}


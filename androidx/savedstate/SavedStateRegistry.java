package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.compose.ui.platform.t1;
import androidx.lifecycle.Lifecycle;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"RestrictedApi"})
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002-.B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0015\u001A\u00020\u000B2\u000E\u0010\u0014\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001B\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0019\u0010\u001F\u001A\u00020\u000B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u000B2\u0006\u0010 \u001A\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\u001ER$\u0010&\u001A\u00020\"2\u0006\u0010#\u001A\u00020\"8G@BX\u0086\u000E¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\"\u0010,\u001A\u00020\"8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b(\u0010%\u001A\u0004\b)\u0010\'\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "<init>", "()V", "", "key", "Landroid/os/Bundle;", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "provider", "", "registerSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;)V", "getSavedStateProvider", "(Ljava/lang/String;)Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "unregisterSavedStateProvider", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "clazz", "runOnNextRecreation", "(Ljava/lang/Class;)V", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "performAttach$savedstate_release", "(Landroidx/lifecycle/Lifecycle;)V", "performAttach", "savedState", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performRestore", "outBundle", "performSave", "", "<set-?>", "d", "Z", "isRestored", "()Z", "f", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "AutoRecreated", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class SavedStateRegistry {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface AutoRecreated {
        void onRecreated(@NotNull SavedStateRegistryOwner arg1);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface SavedStateProvider {
        @NotNull
        Bundle saveState();
    }

    public final SafeIterableMap a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public androidx.savedstate.Recreator.SavedStateProvider e;
    public boolean f;

    public SavedStateRegistry() {
        this.a = new SafeIterableMap();
        this.f = true;
    }

    @MainThread
    @Nullable
    public final Bundle consumeRestoredStateForKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        if(!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(s);
            Bundle bundle2 = this.c;
            if(bundle2 != null) {
                bundle2.remove(s);
            }
            if(this.c == null || this.c.isEmpty()) {
                this.c = null;
            }
            return bundle1;
        }
        return null;
    }

    @Nullable
    public final SavedStateProvider getSavedStateProvider(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        for(Object object0: this.a) {
            Intrinsics.checkNotNullExpressionValue(((Map.Entry)object0), "components");
            String s1 = (String)((Map.Entry)object0).getKey();
            SavedStateProvider savedStateRegistry$SavedStateProvider0 = (SavedStateProvider)((Map.Entry)object0).getValue();
            if(Intrinsics.areEqual(s1, s)) {
                return savedStateRegistry$SavedStateProvider0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.f;
    }

    @MainThread
    public final boolean isRestored() {
        return this.d;
    }

    @MainThread
    public final void performAttach$savedstate_release(@NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        if(this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle0.addObserver(new t1(this, 6));
        this.b = true;
    }

    @MainThread
    public final void performRestore$savedstate_release(@Nullable Bundle bundle0) {
        if(!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if(this.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.c = bundle0 == null ? null : bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        this.d = true;
    }

    @MainThread
    public final void performSave(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outBundle");
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = this.c;
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.a.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(safeIterableMap$IteratorWithAdditions0, "this.components.iteratorWithAdditions()");
        while(safeIterableMap$IteratorWithAdditions0.hasNext()) {
            Object object0 = safeIterableMap$IteratorWithAdditions0.next();
            bundle1.putBundle(((String)((Map.Entry)object0).getKey()), ((SavedStateProvider)((Map.Entry)object0).getValue()).saveState());
        }
        if(!bundle1.isEmpty()) {
            bundle0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
        }
    }

    @MainThread
    public final void registerSavedStateProvider(@NotNull String s, @NotNull SavedStateProvider savedStateRegistry$SavedStateProvider0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(savedStateRegistry$SavedStateProvider0, "provider");
        if(((SavedStateProvider)this.a.putIfAbsent(s, savedStateRegistry$SavedStateProvider0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @MainThread
    public final void runOnNextRecreation(@NotNull Class class0) {
        androidx.savedstate.Recreator.SavedStateProvider recreator$SavedStateProvider1;
        Intrinsics.checkNotNullParameter(class0, "clazz");
        if(!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        androidx.savedstate.Recreator.SavedStateProvider recreator$SavedStateProvider0 = this.e == null ? new androidx.savedstate.Recreator.SavedStateProvider(this) : this.e;
        try {
            this.e = recreator$SavedStateProvider0;
            class0.getDeclaredConstructor(null);
            recreator$SavedStateProvider1 = this.e;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalArgumentException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        if(recreator$SavedStateProvider1 != null) {
            String s = class0.getName();
            Intrinsics.checkNotNullExpressionValue(s, "clazz.name");
            recreator$SavedStateProvider1.add(s);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z) {
        this.f = z;
    }

    @MainThread
    public final void unregisterSavedStateProvider(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.a.remove(s);
    }
}


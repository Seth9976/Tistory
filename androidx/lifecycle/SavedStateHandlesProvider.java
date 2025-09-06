package androidx.lifecycle;

import a2.b;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map.Entry;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u0004\u0018\u00010\b2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "Landroid/os/Bundle;", "saveState", "()Landroid/os/Bundle;", "", "performRestore", "()V", "", "key", "consumeRestoredStateForKey", "(Ljava/lang/String;)Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n215#2,2:227\n1#3:229\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n147#1:227,2\n*E\n"})
public final class SavedStateHandlesProvider implements SavedStateProvider {
    public final SavedStateRegistry a;
    public boolean b;
    public Bundle c;
    public final Lazy d;

    public SavedStateHandlesProvider(@NotNull SavedStateRegistry savedStateRegistry0, @NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(savedStateRegistry0, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "viewModelStoreOwner");
        super();
        this.a = savedStateRegistry0;
        this.d = c.lazy(new b(viewModelStoreOwner0, 20));
    }

    @Nullable
    public final Bundle consumeRestoredStateForKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.performRestore();
        Bundle bundle0 = this.c == null ? null : this.c.getBundle(s);
        Bundle bundle1 = this.c;
        if(bundle1 != null) {
            bundle1.remove(s);
        }
        if(this.c != null && this.c.isEmpty()) {
            this.c = null;
        }
        return bundle0;
    }

    public final void performRestore() {
        if(!this.b) {
            Bundle bundle0 = this.a.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle1 = new Bundle();
            Bundle bundle2 = this.c;
            if(bundle2 != null) {
                bundle1.putAll(bundle2);
            }
            if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            this.c = bundle1;
            this.b = true;
            SavedStateHandlesVM savedStateHandlesVM0 = (SavedStateHandlesVM)this.d.getValue();
        }
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    @NotNull
    public Bundle saveState() {
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.c;
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
        for(Object object0: ((SavedStateHandlesVM)this.d.getValue()).getHandles().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Bundle bundle2 = ((SavedStateHandle)((Map.Entry)object0).getValue()).savedStateProvider().saveState();
            if(!Intrinsics.areEqual(bundle2, Bundle.EMPTY)) {
                bundle0.putBundle(s, bundle2);
            }
        }
        this.b = false;
        return bundle0;
    }
}


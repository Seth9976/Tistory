package androidx.lifecycle;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000B\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "", "key", "Landroidx/lifecycle/ViewModel;", "viewModel", "", "put", "(Ljava/lang/String;Landroidx/lifecycle/ViewModel;)V", "get", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "", "keys", "()Ljava/util/Set;", "clear", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ViewModelStore {
    public final LinkedHashMap a;

    public ViewModelStore() {
        this.a = new LinkedHashMap();
    }

    public final void clear() {
        LinkedHashMap linkedHashMap0 = this.a;
        for(Object object0: linkedHashMap0.values()) {
            ((ViewModel)object0).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap0.clear();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final ViewModel get(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return (ViewModel)this.a.get(s);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Set keys() {
        return new HashSet(this.a.keySet());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void put(@NotNull String s, @NotNull ViewModel viewModel0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(viewModel0, "viewModel");
        ViewModel viewModel1 = (ViewModel)this.a.put(s, viewModel0);
        if(viewModel1 != null) {
            viewModel1.clear$lifecycle_viewmodel_release();
        }
    }
}


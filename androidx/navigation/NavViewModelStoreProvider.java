package androidx.navigation;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelStore;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/navigation/NavViewModelStoreProvider;", "", "getViewModelStore", "Landroidx/lifecycle/ViewModelStore;", "backStackEntryId", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface NavViewModelStoreProvider {
    @NotNull
    ViewModelStore getViewModelStore(@NotNull String arg1);
}


package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroidx/fragment/app/Fragment;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FragmentKt {
    @NotNull
    public static final NavController findNavController(@NotNull Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        return NavHostFragment.Companion.findNavController(fragment0);
    }
}


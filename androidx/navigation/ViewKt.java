package androidx.navigation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroid/view/View;", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ViewKt {
    @NotNull
    public static final NavController findNavController(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        return Navigation.findNavController(view0);
    }
}


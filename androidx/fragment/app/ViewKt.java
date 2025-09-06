package androidx.fragment.app;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0019\u0010\u0000\u001A\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"findFragment", "F", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ViewKt {
    @NotNull
    public static final Fragment findFragment(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Fragment fragment0 = FragmentManager.findFragment(view0);
        Intrinsics.checkNotNullExpressionValue(fragment0, "findFragment(this)");
        return fragment0;
    }
}


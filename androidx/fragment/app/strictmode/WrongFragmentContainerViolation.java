package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "b", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrongFragmentContainerViolation extends Violation {
    public final ViewGroup b;

    public WrongFragmentContainerViolation(@NotNull Fragment fragment0, @NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        super(fragment0, "Attempting to add fragment " + fragment0 + " to container " + viewGroup0 + " which is not a FragmentContainerView");
        this.b = viewGroup0;
    }

    @NotNull
    public final ViewGroup getContainer() {
        return this.b;
    }
}


package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wb.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "expectedParentFragment", "", "containerId", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "b", "Landroidx/fragment/app/Fragment;", "getExpectedParentFragment", "()Landroidx/fragment/app/Fragment;", "c", "I", "getContainerId", "()I", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrongNestedHierarchyViolation extends Violation {
    public final Fragment b;
    public final int c;

    public WrongNestedHierarchyViolation(@NotNull Fragment fragment0, @NotNull Fragment fragment1, int v) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(fragment1, "expectedParentFragment");
        StringBuilder stringBuilder0 = new StringBuilder("Attempting to nest fragment ");
        stringBuilder0.append(fragment0);
        stringBuilder0.append(" within the view of parent fragment ");
        stringBuilder0.append(fragment1);
        stringBuilder0.append(" via container with ID ");
        super(fragment0, a.c(v, " without using parent\'s childFragmentManager", stringBuilder0));
        this.b = fragment1;
        this.c = v;
    }

    public final int getContainerId() {
        return this.c;
    }

    @NotNull
    public final Fragment getExpectedParentFragment() {
        return this.b;
    }
}


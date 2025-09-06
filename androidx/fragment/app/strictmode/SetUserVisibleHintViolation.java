package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\u0005\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "fragment", "", "isVisibleToUser", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "b", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SetUserVisibleHintViolation extends Violation {
    public final boolean b;

    public SetUserVisibleHintViolation(@NotNull Fragment fragment0, boolean z) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        super(fragment0, "Attempting to set user visible hint to " + z + " for fragment " + fragment0);
        this.b = z;
    }

    public final boolean isVisibleToUser() {
        return this.b;
    }
}


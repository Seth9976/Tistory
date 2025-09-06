package androidx.paging;

import androidx.recyclerview.widget.DiffUtil.DiffResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/paging/PlaceholderPaddedDiffResult;", "", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "diff", "", "hasOverlap", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$DiffResult;Z)V", "a", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getDiff", "()Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "b", "Z", "getHasOverlap", "()Z", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlaceholderPaddedDiffResult {
    public final DiffResult a;
    public final boolean b;

    public PlaceholderPaddedDiffResult(@NotNull DiffResult diffUtil$DiffResult0, boolean z) {
        Intrinsics.checkNotNullParameter(diffUtil$DiffResult0, "diff");
        super();
        this.a = diffUtil$DiffResult0;
        this.b = z;
    }

    @NotNull
    public final DiffResult getDiff() {
        return this.a;
    }

    public final boolean getHasOverlap() {
        return this.b;
    }
}


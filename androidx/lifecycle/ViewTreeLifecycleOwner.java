package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R.id;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/View;", "get", "setViewTreeLifecycleOwner", "", "lifecycleOwner", "set", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {
    @JvmName(name = "get")
    @Nullable
    public static final LifecycleOwner get(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        return (LifecycleOwner)SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view0, r0.x), s0.w));
    }

    @JvmName(name = "set")
    public static final void set(@NotNull View view0, @Nullable LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setTag(id.view_tree_lifecycle_owner, lifecycleOwner0);
    }
}


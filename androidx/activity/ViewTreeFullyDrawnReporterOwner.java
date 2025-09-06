package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001A\u0019\u0010\u0004\u001A\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeFullyDrawnReporterOwner", "Landroidx/activity/FullyDrawnReporterOwner;", "Landroid/view/View;", "get", "setViewTreeFullyDrawnReporterOwner", "", "fullyDrawnReporterOwner", "set", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "ViewTreeFullyDrawnReporterOwner")
public final class ViewTreeFullyDrawnReporterOwner {
    @JvmName(name = "get")
    @Nullable
    public static final FullyDrawnReporterOwner get(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        return (FullyDrawnReporterOwner)SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view0, l0.x), m0.w));
    }

    @JvmName(name = "set")
    public static final void set(@NotNull View view0, @NotNull FullyDrawnReporterOwner fullyDrawnReporterOwner0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner0, "fullyDrawnReporterOwner");
        view0.setTag(id.report_drawn, fullyDrawnReporterOwner0);
    }
}


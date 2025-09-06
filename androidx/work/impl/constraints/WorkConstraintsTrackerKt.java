package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A)\u0010\b\u001A\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", "listener", "Lkotlinx/coroutines/Job;", "listen", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;)Lkotlinx/coroutines/Job;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class WorkConstraintsTrackerKt {
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-WorkConstraintsTrack", "tagWithPrefix(\"WorkConstraintsTracker\")");
        WorkConstraintsTrackerKt.a = "WM-WorkConstraintsTrack";
    }

    // 去混淆评级： 低(20)
    public static final String access$getTAG$p() [...] // 潜在的解密器

    @NotNull
    public static final Job listen(@NotNull WorkConstraintsTracker workConstraintsTracker0, @NotNull WorkSpec workSpec0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull OnConstraintsStateChangedListener onConstraintsStateChangedListener0) {
        Intrinsics.checkNotNullParameter(workConstraintsTracker0, "<this>");
        Intrinsics.checkNotNullParameter(workSpec0, "spec");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "dispatcher");
        Intrinsics.checkNotNullParameter(onConstraintsStateChangedListener0, "listener");
        Job job0 = JobKt.Job$default(null, 1, null);
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineDispatcher0.plus(job0)), null, null, new b(workConstraintsTracker0, workSpec0, onConstraintsStateChangedListener0, null), 3, null);
        return job0;
    }
}


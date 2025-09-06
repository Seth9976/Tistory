package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data.Builder;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import wb.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\'\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u0017\u0010\u000B\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A%\u0010\u0010\u001A\u00020\t2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", "configuration", "Landroidx/work/impl/WorkContinuationImpl;", "continuation", "", "checkContentUriTriggerWorkerLimits", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Landroidx/work/impl/WorkContinuationImpl;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "tryDelegateConstrainedWorkSpec", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "", "Landroidx/work/impl/Scheduler;", "schedulers", "wrapInConstraintTrackingWorkerIfNeeded", "(Ljava/util/List;Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEnqueueUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1774#2,4:118\n1747#2,3:123\n1#3:122\n*S KotlinDebug\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n*L\n44#1:118,4\n112#1:123,3\n*E\n"})
public final class EnqueueUtilsKt {
    public static final void checkContentUriTriggerWorkerLimits(@NotNull WorkDatabase workDatabase0, @NotNull Configuration configuration0, @NotNull WorkContinuationImpl workContinuationImpl0) {
        int v1;
        Intrinsics.checkNotNullParameter(workDatabase0, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        Intrinsics.checkNotNullParameter(workContinuationImpl0, "continuation");
        List list0 = CollectionsKt__CollectionsKt.mutableListOf(new WorkContinuationImpl[]{workContinuationImpl0});
        int v = 0;
        while(!list0.isEmpty()) {
            WorkContinuationImpl workContinuationImpl1 = (WorkContinuationImpl)o.removeLast(list0);
            List list1 = workContinuationImpl1.getWork();
            Intrinsics.checkNotNullExpressionValue(list1, "current.work");
            Iterable iterable0 = list1;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                v1 = 0;
                for(Object object0: iterable0) {
                    if(((WorkRequest)object0).getWorkSpec().constraints.hasContentUriTriggers()) {
                        ++v1;
                        if(v1 < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
            }
            else {
                v1 = 0;
            }
            v += v1;
            List list2 = workContinuationImpl1.getParents();
            if(list2 != null) {
                list0.addAll(list2);
            }
        }
        if(v == 0) {
            return;
        }
        int v2 = workDatabase0.workSpecDao().countNonFinishedContentUriTriggerWorkers();
        int v3 = configuration0.getContentUriTriggerWorkersLimit();
        if(v2 + v > v3) {
            throw new IllegalArgumentException(a.c(v, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", q.u("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", v3, ";\nalready enqueued count: ", v2, ";\ncurrent enqueue operation count: ")));
        }
    }

    @NotNull
    public static final WorkSpec tryDelegateConstrainedWorkSpec(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        Constraints constraints0 = workSpec0.constraints;
        String s = workSpec0.workerClassName;
        Class class0 = ConstraintTrackingWorker.class;
        if(!Intrinsics.areEqual(s, "androidx.work.impl.workers.ConstraintTrackingWorker") && (constraints0.requiresBatteryNotLow() || constraints0.requiresStorageNotLow())) {
            Data data0 = new Builder().putAll(workSpec0.input).putString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", s).build();
            Intrinsics.checkNotNullExpressionValue(data0, "Builder().putAll(workSpe…ame)\n            .build()");
            String s1 = class0.getName();
            Intrinsics.checkNotNullExpressionValue(s1, "name");
            return WorkSpec.copy$default(workSpec0, null, null, s1, null, data0, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 0x7FFFEB, null);
        }
        return workSpec0;
    }

    @NotNull
    public static final WorkSpec wrapInConstraintTrackingWorkerIfNeeded(@NotNull List list0, @NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(list0, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        return workSpec0;
    }
}


package androidx.work.impl;

import androidx.activity.g0;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.k;
import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.WorkManager.UpdateResult;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A!\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A#\u0010\n\u001A\u00020\t*\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/work/impl/WorkManagerImpl;", "Landroidx/work/WorkRequest;", "workRequest", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/WorkManager$UpdateResult;", "updateWorkImpl", "(Landroidx/work/impl/WorkManagerImpl;Landroidx/work/WorkRequest;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "name", "Landroidx/work/Operation;", "enqueueUniquelyNamedPeriodic", "(Landroidx/work/impl/WorkManagerImpl;Ljava/lang/String;Landroidx/work/WorkRequest;)Landroidx/work/Operation;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "WorkerUpdater")
@SourceDebugExtension({"SMAP\nWorkerUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1855#2,2:172\n*S KotlinDebug\n*F\n+ 1 WorkerUpdater.kt\nandroidx/work/impl/WorkerUpdater\n*L\n55#1:172,2\n*E\n"})
public final class WorkerUpdater {
    // 去混淆评级： 低(20)
    public static final UpdateResult a(Processor processor0, WorkDatabase workDatabase0, Configuration configuration0, List list0, WorkSpec workSpec0, Set set0) {
        String s = workSpec0.id;
        if(workDatabase0.workSpecDao().getWorkSpec(s) == null) {
            throw new IllegalArgumentException("Worker with " + s + " doesn\'t exist");
        }
        return UpdateResult.NOT_APPLIED;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final Operation enqueueUniquelyNamedPeriodic(@NotNull WorkManagerImpl workManagerImpl0, @NotNull String s, @NotNull WorkRequest workRequest0) {
        Intrinsics.checkNotNullParameter(workManagerImpl0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(workRequest0, "workRequest");
        Operation operation0 = new OperationImpl();
        g0 g00 = new g0(5, workRequest0, workManagerImpl0, s, operation0);
        workManagerImpl0.getWorkTaskExecutor().getSerialTaskExecutor().execute(new j(workManagerImpl0, s, ((OperationImpl)operation0), g00, workRequest0));
        return operation0;
    }

    @NotNull
    public static final ListenableFuture updateWorkImpl(@NotNull WorkManagerImpl workManagerImpl0, @NotNull WorkRequest workRequest0) {
        Intrinsics.checkNotNullParameter(workManagerImpl0, "<this>");
        Intrinsics.checkNotNullParameter(workRequest0, "workRequest");
        ListenableFuture listenableFuture0 = SettableFuture.create();
        workManagerImpl0.getWorkTaskExecutor().getSerialTaskExecutor().execute(new k(listenableFuture0, workManagerImpl0, 4, workRequest0));
        Intrinsics.checkNotNullExpressionValue(listenableFuture0, "future");
        return listenableFuture0;
    }
}


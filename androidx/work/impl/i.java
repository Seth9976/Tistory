package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class i extends FunctionReferenceImpl implements Function6 {
    public static final i a;

    static {
        i.a = new i(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function6
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        Intrinsics.checkNotNullParameter(((Context)object0), "p0");
        Intrinsics.checkNotNullParameter(((Configuration)object1), "p1");
        Intrinsics.checkNotNullParameter(((TaskExecutor)object2), "p2");
        Intrinsics.checkNotNullParameter(((WorkDatabase)object3), "p3");
        Intrinsics.checkNotNullParameter(((Trackers)object4), "p4");
        Intrinsics.checkNotNullParameter(((Processor)object5), "p5");
        return WorkManagerImplExtKt.access$createSchedulers(((Context)object0), ((Configuration)object1), ((TaskExecutor)object2), ((WorkDatabase)object3), ((Trackers)object4), ((Processor)object5));
    }
}


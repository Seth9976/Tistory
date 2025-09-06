package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0006\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000E\u0010\u000FR\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001A\u0004\b\u0019\u0010\u0013R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0011\u001A\u0004\b\u001B\u0010\u0013¨\u0006\u001C"}, d2 = {"Landroidx/work/impl/constraints/trackers/Trackers;", "", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "batteryChargingTracker", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "batteryNotLowTracker", "Landroidx/work/impl/constraints/NetworkState;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "a", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "getBatteryChargingTracker", "()Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "b", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "getBatteryNotLowTracker", "()Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "c", "getNetworkStateTracker", "d", "getStorageNotLowTracker", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Trackers {
    public final ConstraintTracker a;
    public final BatteryNotLowTracker b;
    public final ConstraintTracker c;
    public final ConstraintTracker d;

    @JvmOverloads
    public Trackers(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        this(context0, taskExecutor0, null, null, null, null, 60, null);
    }

    @JvmOverloads
    public Trackers(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0, @NotNull ConstraintTracker constraintTracker0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        Intrinsics.checkNotNullParameter(constraintTracker0, "batteryChargingTracker");
        this(context0, taskExecutor0, constraintTracker0, null, null, null, 56, null);
    }

    @JvmOverloads
    public Trackers(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0, @NotNull ConstraintTracker constraintTracker0, @NotNull BatteryNotLowTracker batteryNotLowTracker0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        Intrinsics.checkNotNullParameter(constraintTracker0, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker0, "batteryNotLowTracker");
        this(context0, taskExecutor0, constraintTracker0, batteryNotLowTracker0, null, null, 0x30, null);
    }

    @JvmOverloads
    public Trackers(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0, @NotNull ConstraintTracker constraintTracker0, @NotNull BatteryNotLowTracker batteryNotLowTracker0, @NotNull ConstraintTracker constraintTracker1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        Intrinsics.checkNotNullParameter(constraintTracker0, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker0, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(constraintTracker1, "networkStateTracker");
        this(context0, taskExecutor0, constraintTracker0, batteryNotLowTracker0, constraintTracker1, null, 0x20, null);
    }

    @JvmOverloads
    public Trackers(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0, @NotNull ConstraintTracker constraintTracker0, @NotNull BatteryNotLowTracker batteryNotLowTracker0, @NotNull ConstraintTracker constraintTracker1, @NotNull ConstraintTracker constraintTracker2) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        Intrinsics.checkNotNullParameter(constraintTracker0, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker0, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(constraintTracker1, "networkStateTracker");
        Intrinsics.checkNotNullParameter(constraintTracker2, "storageNotLowTracker");
        super();
        this.a = constraintTracker0;
        this.b = batteryNotLowTracker0;
        this.c = constraintTracker1;
        this.d = constraintTracker2;
    }

    public Trackers(Context context0, TaskExecutor taskExecutor0, ConstraintTracker constraintTracker0, BatteryNotLowTracker batteryNotLowTracker0, ConstraintTracker constraintTracker1, ConstraintTracker constraintTracker2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        ConstraintTracker constraintTracker5;
        ConstraintTracker constraintTracker4;
        BatteryNotLowTracker batteryNotLowTracker1;
        ConstraintTracker constraintTracker3;
        if((v & 4) == 0) {
            constraintTracker3 = constraintTracker0;
        }
        else {
            Context context1 = context0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context1, "context.applicationContext");
            constraintTracker3 = new BatteryChargingTracker(context1, taskExecutor0);
        }
        if((v & 8) == 0) {
            batteryNotLowTracker1 = batteryNotLowTracker0;
        }
        else {
            Context context2 = context0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
            batteryNotLowTracker1 = new BatteryNotLowTracker(context2, taskExecutor0);
        }
        if((v & 16) == 0) {
            constraintTracker4 = constraintTracker1;
        }
        else {
            Context context3 = context0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context.applicationContext");
            constraintTracker4 = NetworkStateTrackerKt.NetworkStateTracker(context3, taskExecutor0);
        }
        if((v & 0x20) == 0) {
            constraintTracker5 = constraintTracker2;
        }
        else {
            Context context4 = context0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context.applicationContext");
            constraintTracker5 = new StorageNotLowTracker(context4, taskExecutor0);
        }
        this(context0, taskExecutor0, constraintTracker3, batteryNotLowTracker1, constraintTracker4, constraintTracker5);
    }

    @NotNull
    public final ConstraintTracker getBatteryChargingTracker() {
        return this.a;
    }

    @NotNull
    public final BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.b;
    }

    @NotNull
    public final ConstraintTracker getNetworkStateTracker() {
        return this.c;
    }

    @NotNull
    public final ConstraintTracker getStorageNotLowTracker() {
        return this.d;
    }
}


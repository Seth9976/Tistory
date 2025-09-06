package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/PeriodicWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/PeriodicWorkRequest$Builder;", "(Landroidx/work/PeriodicWorkRequest$Builder;)V", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PeriodicWorkRequest extends WorkRequest {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0016\u0012\u0010\u0010\u0003\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nB\u001F\b\u0017\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u000B¢\u0006\u0002\u0010\fB9\b\u0016\u0012\u0010\u0010\u0003\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\r\u001A\u00020\u0007\u0012\u0006\u0010\u000E\u001A\u00020\t¢\u0006\u0002\u0010\u000FB)\b\u0017\u0012\u0010\u0010\u0003\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B¢\u0006\u0002\u0010\u0010J\r\u0010\u0014\u001A\u00020\u0002H\u0010¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001A\u00020\u0000J\u000E\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0007R\u0014\u0010\u0011\u001A\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/work/PeriodicWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/PeriodicWorkRequest;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "repeatInterval", "", "repeatIntervalTimeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "thisObject", "getThisObject$work_runtime_release", "()Landroidx/work/PeriodicWorkRequest$Builder;", "buildInternal", "buildInternal$work_runtime_release", "clearNextScheduleTimeOverride", "setNextScheduleTimeOverride", "nextScheduleTimeOverrideMillis", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPeriodicWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1#2:325\n*E\n"})
    public static final class Builder extends androidx.work.WorkRequest.Builder {
        public Builder(@NotNull Class class0, long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            Intrinsics.checkNotNullParameter(timeUnit0, "repeatIntervalTimeUnit");
            super(class0);
            this.getWorkSpec$work_runtime_release().setPeriodic(timeUnit0.toMillis(v));
        }

        public Builder(@NotNull Class class0, long v, @NotNull TimeUnit timeUnit0, long v1, @NotNull TimeUnit timeUnit1) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            Intrinsics.checkNotNullParameter(timeUnit0, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(timeUnit1, "flexIntervalTimeUnit");
            super(class0);
            this.getWorkSpec$work_runtime_release().setPeriodic(timeUnit0.toMillis(v), timeUnit1.toMillis(v1));
        }

        @RequiresApi(26)
        public Builder(@NotNull Class class0, @NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            Intrinsics.checkNotNullParameter(duration0, "repeatInterval");
            super(class0);
            this.getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(duration0));
        }

        @RequiresApi(26)
        public Builder(@NotNull Class class0, @NotNull Duration duration0, @NotNull Duration duration1) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            Intrinsics.checkNotNullParameter(duration0, "repeatInterval");
            Intrinsics.checkNotNullParameter(duration1, "flexInterval");
            super(class0);
            this.getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(duration0), DurationApi26Impl.toMillisCompat(duration1));
        }

        @NotNull
        public PeriodicWorkRequest buildInternal$work_runtime_release() {
            if(this.getBackoffCriteriaSet$work_runtime_release() && this.getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if(this.getWorkSpec$work_runtime_release().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new PeriodicWorkRequest(this);
        }

        @Override  // androidx.work.WorkRequest$Builder
        public WorkRequest buildInternal$work_runtime_release() {
            return this.buildInternal$work_runtime_release();
        }

        @NotNull
        public final Builder clearNextScheduleTimeOverride() {
            this.getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(0x7FFFFFFFFFFFFFFFL);
            this.getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @NotNull
        public Builder getThisObject$work_runtime_release() [...] // Inlined contents

        @Override  // androidx.work.WorkRequest$Builder
        public androidx.work.WorkRequest.Builder getThisObject$work_runtime_release() {
            return this;
        }

        @NotNull
        public final Builder setNextScheduleTimeOverride(long v) {
            if(v == 0x7FFFFFFFFFFFFFFFL) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            this.getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(v);
            this.getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/work/PeriodicWorkRequest$Companion;", "", "", "MIN_PERIODIC_FLEX_MILLIS", "J", "MIN_PERIODIC_INTERVAL_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000L;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000L;

    static {
        PeriodicWorkRequest.Companion = new Companion(null);
    }

    public PeriodicWorkRequest(@NotNull Builder periodicWorkRequest$Builder0) {
        Intrinsics.checkNotNullParameter(periodicWorkRequest$Builder0, "builder");
        super(periodicWorkRequest$Builder0.getId$work_runtime_release(), periodicWorkRequest$Builder0.getWorkSpec$work_runtime_release(), periodicWorkRequest$Builder0.getTags$work_runtime_release());
    }
}


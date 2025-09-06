package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0002\b\u0015\b&\u0018\u0000 \u001A2\u00020\u0001:\u0002\u001B\u001AB\'\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001A\u00020\u00078G¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001C"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "b", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "c", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class WorkRequest {
    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\t\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0014\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001B\u001A\u00028\u00002\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0015\u0010\u001F\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010#\u001A\u00028\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b#\u0010$J\u001D\u0010%\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010%\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00020\u0016H\u0007\u00A2\u0006\u0004\b%\u0010\'J\u001F\u0010(\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b(\u0010&J\u0017\u0010(\u001A\u00028\u00002\u0006\u0010\u0017\u001A\u00020\u0016H\u0017\u00A2\u0006\u0004\b(\u0010\'J\u0017\u0010+\u001A\u00028\u00002\u0006\u0010*\u001A\u00020)H\u0017\u00A2\u0006\u0004\b+\u0010,J\r\u0010-\u001A\u00028\u0001\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00028\u0001H \u00A2\u0006\u0004\b/\u0010.J\u0017\u00103\u001A\u00028\u00002\u0006\u00102\u001A\u000201H\u0007\u00A2\u0006\u0004\b3\u00104J\u0017\u00107\u001A\u00028\u00002\u0006\u00106\u001A\u000205H\u0007\u00A2\u0006\u0004\b7\u00108J\u001F\u0010:\u001A\u00028\u00002\u0006\u00109\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b:\u0010&J\u001F\u0010<\u001A\u00028\u00002\u0006\u0010;\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b<\u0010&R\"\u0010\u0007\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\"\u0010H\u001A\u00020A8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u000B\u001A\u00020\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001A\u00020O8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010\\\u001A\b\u0012\u0004\u0012\u00020!0W8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R\u0014\u0010_\u001A\u00028\u00008 X\u00A0\u0004\u00A2\u0006\u0006\u001A\u0004\b]\u0010^\u00A8\u0006`"}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Landroidx/work/BackoffPolicy;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Landroidx/work/BackoffPolicy;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/Constraints;", "constraints", "setConstraints", "(Landroidx/work/Constraints;)Landroidx/work/WorkRequest$Builder;", "Landroidx/work/Data;", "inputData", "setInputData", "(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "Landroidx/work/OutOfQuotaPolicy;", "policy", "setExpedited", "(Landroidx/work/OutOfQuotaPolicy;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "buildInternal", "Landroidx/work/WorkInfo$State;", "state", "setInitialState", "(Landroidx/work/WorkInfo$State;)Landroidx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "lastEnqueueTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "a", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "b", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "c", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Landroidx/work/impl/model/WorkSpec;", "d", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec$work_runtime_release", "()Landroidx/work/impl/model/WorkSpec;", "setWorkSpec$work_runtime_release", "(Landroidx/work/impl/model/WorkSpec;)V", "workSpec", "", "e", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "tags", "getThisObject$work_runtime_release", "()Landroidx/work/WorkRequest$Builder;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkRequest.kt\nandroidx/work/WorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"})
    public static abstract class Builder {
        public final Class a;
        public boolean b;
        public UUID c;
        public WorkSpec d;
        public final Set e;

        public Builder(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "workerClass");
            super();
            this.a = class0;
            UUID uUID0 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uUID0, "randomUUID()");
            this.c = uUID0;
            String s = this.c.toString();
            Intrinsics.checkNotNullExpressionValue(s, "id.toString()");
            String s1 = class0.getName();
            Intrinsics.checkNotNullExpressionValue(s1, "workerClass.name");
            this.d = new WorkSpec(s, s1);
            String s2 = class0.getName();
            Intrinsics.checkNotNullExpressionValue(s2, "workerClass.name");
            this.e = f0.mutableSetOf(new String[]{s2});
        }

        @NotNull
        public final Builder addTag(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "tag");
            this.e.add(s);
            return this.getThisObject$work_runtime_release();
        }

        @NotNull
        public final WorkRequest build() {
            WorkRequest workRequest0 = this.buildInternal$work_runtime_release();
            Constraints constraints0 = this.d.constraints;
            boolean z = constraints0.hasContentUriTriggers() || constraints0.requiresBatteryNotLow() || constraints0.requiresCharging() || constraints0.requiresDeviceIdle();
            WorkSpec workSpec0 = this.d;
            if(workSpec0.expedited) {
                if(z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if(workSpec0.initialDelay > 0L) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uUID0 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uUID0, "randomUUID()");
            this.setId(uUID0);
            return workRequest0;
        }

        @NotNull
        public abstract WorkRequest buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.b;
        }

        @NotNull
        public final UUID getId$work_runtime_release() {
            return this.c;
        }

        @NotNull
        public final Set getTags$work_runtime_release() {
            return this.e;
        }

        @NotNull
        public abstract Builder getThisObject$work_runtime_release();

        @NotNull
        public final WorkSpec getWorkSpec$work_runtime_release() {
            return this.d;
        }

        @NotNull
        public final Class getWorkerClass$work_runtime_release() {
            return this.a;
        }

        @NotNull
        public final Builder keepResultsForAtLeast(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.minimumRetentionDuration = timeUnit0.toMillis(v);
            return this.getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        @NotNull
        public final Builder keepResultsForAtLeast(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            WorkSpec workSpec0 = this.d;
            workSpec0.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(duration0);
            return this.getThisObject$work_runtime_release();
        }

        @NotNull
        public final Builder setBackoffCriteria(@NotNull BackoffPolicy backoffPolicy0, long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            this.b = true;
            this.d.backoffPolicy = backoffPolicy0;
            this.d.setBackoffDelayDuration(timeUnit0.toMillis(v));
            return this.getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        @NotNull
        public final Builder setBackoffCriteria(@NotNull BackoffPolicy backoffPolicy0, @NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.b = true;
            this.d.backoffPolicy = backoffPolicy0;
            this.d.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(duration0));
            return this.getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.b = z;
        }

        @NotNull
        public final Builder setConstraints(@NotNull Constraints constraints0) {
            Intrinsics.checkNotNullParameter(constraints0, "constraints");
            this.d.constraints = constraints0;
            return this.getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @NotNull
        public Builder setExpedited(@NotNull OutOfQuotaPolicy outOfQuotaPolicy0) {
            Intrinsics.checkNotNullParameter(outOfQuotaPolicy0, "policy");
            this.d.expedited = true;
            this.d.outOfQuotaPolicy = outOfQuotaPolicy0;
            return this.getThisObject$work_runtime_release();
        }

        @NotNull
        public final Builder setId(@NotNull UUID uUID0) {
            Intrinsics.checkNotNullParameter(uUID0, "id");
            this.c = uUID0;
            String s = uUID0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "id.toString()");
            this.d = new WorkSpec(s, this.d);
            return this.getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(@NotNull UUID uUID0) {
            Intrinsics.checkNotNullParameter(uUID0, "<set-?>");
            this.c = uUID0;
        }

        @NotNull
        public Builder setInitialDelay(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.initialDelay = timeUnit0.toMillis(v);
            if(0x7FFFFFFFFFFFFFFFL - System.currentTimeMillis() <= this.d.initialDelay) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return this.getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        @NotNull
        public Builder setInitialDelay(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            WorkSpec workSpec0 = this.d;
            workSpec0.initialDelay = DurationApi26Impl.toMillisCompat(duration0);
            if(0x7FFFFFFFFFFFFFFFL - System.currentTimeMillis() <= this.d.initialDelay) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            return this.getThisObject$work_runtime_release();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final Builder setInitialRunAttemptCount(int v) {
            this.d.runAttemptCount = v;
            return this.getThisObject$work_runtime_release();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final Builder setInitialState(@NotNull State workInfo$State0) {
            Intrinsics.checkNotNullParameter(workInfo$State0, "state");
            this.d.state = workInfo$State0;
            return this.getThisObject$work_runtime_release();
        }

        @NotNull
        public final Builder setInputData(@NotNull Data data0) {
            Intrinsics.checkNotNullParameter(data0, "inputData");
            this.d.input = data0;
            return this.getThisObject$work_runtime_release();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final Builder setLastEnqueueTime(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.lastEnqueueTime = timeUnit0.toMillis(v);
            return this.getThisObject$work_runtime_release();
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final Builder setScheduleRequestedAt(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            WorkSpec workSpec0 = this.d;
            workSpec0.scheduleRequestedAt = timeUnit0.toMillis(v);
            return this.getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(@NotNull WorkSpec workSpec0) {
            Intrinsics.checkNotNullParameter(workSpec0, "<set-?>");
            this.d = workSpec0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/WorkRequest$Companion;", "", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000L;
    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000L;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000L;
    public final UUID a;
    public final WorkSpec b;
    public final Set c;

    static {
        WorkRequest.Companion = new Companion(null);
    }

    public WorkRequest(@NotNull UUID uUID0, @NotNull WorkSpec workSpec0, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        Intrinsics.checkNotNullParameter(set0, "tags");
        super();
        this.a = uUID0;
        this.b = workSpec0;
        this.c = set0;
    }

    @NotNull
    public UUID getId() {
        return this.a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStringId() {
        String s = this.getId().toString();
        Intrinsics.checkNotNullExpressionValue(s, "id.toString()");
        return s;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Set getTags() {
        return this.c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final WorkSpec getWorkSpec() {
        return this.b;
    }
}


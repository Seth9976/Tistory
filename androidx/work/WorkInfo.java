package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b1\u0018\u0000 H2\u00020\u0001:\u0003HIJB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\t\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001A\u00020\f\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b1\u0010.\u001A\u0004\b2\u00100R\u0017\u0010\r\u001A\u00020\f8\u0007\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001ER\u0017\u0010\u000E\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b6\u00104\u001A\u0004\b7\u0010\u001ER\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR\u0017\u0010\u0015\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bD\u0010=\u001A\u0004\bE\u0010?R\u0017\u0010\u0016\u001A\u00020\f8\u0007\u00A2\u0006\f\n\u0004\bF\u00104\u001A\u0004\bG\u0010\u001E\u00A8\u0006K"}, d2 = {"Landroidx/work/WorkInfo;", "", "Ljava/util/UUID;", "id", "Landroidx/work/WorkInfo$State;", "state", "", "", "tags", "Landroidx/work/Data;", "outputData", "progress", "", "runAttemptCount", "generation", "Landroidx/work/Constraints;", "constraints", "", "initialDelayMillis", "Landroidx/work/WorkInfo$PeriodicityInfo;", "periodicityInfo", "nextScheduleTimeMillis", "stopReason", "<init>", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "b", "Landroidx/work/WorkInfo$State;", "getState", "()Landroidx/work/WorkInfo$State;", "c", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "d", "Landroidx/work/Data;", "getOutputData", "()Landroidx/work/Data;", "e", "getProgress", "f", "I", "getRunAttemptCount", "g", "getGeneration", "h", "Landroidx/work/Constraints;", "getConstraints", "()Landroidx/work/Constraints;", "i", "J", "getInitialDelayMillis", "()J", "j", "Landroidx/work/WorkInfo$PeriodicityInfo;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "k", "getNextScheduleTimeMillis", "l", "getStopReason", "Companion", "PeriodicityInfo", "State", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WorkInfo {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0015"}, d2 = {"Landroidx/work/WorkInfo$Companion;", "", "", "STOP_REASON_APP_STANDBY", "I", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "", "repeatIntervalMillis", "flexIntervalMillis", "<init>", "(JJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "getRepeatIntervalMillis", "()J", "b", "getFlexIntervalMillis", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class PeriodicityInfo {
        public final long a;
        public final long b;

        public PeriodicityInfo(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return Intrinsics.areEqual(PeriodicityInfo.class, class0) && (((PeriodicityInfo)object0).a == this.a && ((PeriodicityInfo)object0).b == this.b);
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.b;
        }

        public final long getRepeatIntervalMillis() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.b) + Long.hashCode(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000B\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0011\u0010\u0003\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "", "isFinished", "()Z", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_NOT_STOPPED = 0xFFFFFF00;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = 0xFFFFFE00;
    public static final int STOP_REASON_USER = 13;
    public final UUID a;
    public final State b;
    public final Set c;
    public final Data d;
    public final Data e;
    public final int f;
    public final int g;
    public final Constraints h;
    public final long i;
    public final PeriodicityInfo j;
    public final long k;
    public final int l;

    static {
        WorkInfo.Companion = new Companion(null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        this(uUID0, workInfo$State0, set0, null, null, 0, 0, null, 0L, null, 0L, 0, 0xFF8, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        this(uUID0, workInfo$State0, set0, data0, null, 0, 0, null, 0L, null, 0L, 0, 0xFF0, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        this(uUID0, workInfo$State0, set0, data0, data1, 0, 0, null, 0L, null, 0L, 0, 0xFE0, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        this(uUID0, workInfo$State0, set0, data0, data1, v, 0, null, 0L, null, 0L, 0, 0xFC0, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v, int v1) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, null, 0L, null, 0L, 0, 0xF80, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v, int v1, @NotNull Constraints constraints0) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, 0L, null, 0L, 0, 0xF00, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v, int v1, @NotNull Constraints constraints0, long v2) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, v2, null, 0L, 0, 0xE00, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v, int v1, @NotNull Constraints constraints0, long v2, @Nullable PeriodicityInfo workInfo$PeriodicityInfo0) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, v2, workInfo$PeriodicityInfo0, 0L, 0, 0xC00, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v, int v1, @NotNull Constraints constraints0, long v2, @Nullable PeriodicityInfo workInfo$PeriodicityInfo0, long v3) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        this(uUID0, workInfo$State0, set0, data0, data1, v, v1, constraints0, v2, workInfo$PeriodicityInfo0, v3, 0, 0x800, null);
    }

    @JvmOverloads
    public WorkInfo(@NotNull UUID uUID0, @NotNull State workInfo$State0, @NotNull Set set0, @NotNull Data data0, @NotNull Data data1, int v, int v1, @NotNull Constraints constraints0, long v2, @Nullable PeriodicityInfo workInfo$PeriodicityInfo0, long v3, int v4) {
        Intrinsics.checkNotNullParameter(uUID0, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(set0, "tags");
        Intrinsics.checkNotNullParameter(data0, "outputData");
        Intrinsics.checkNotNullParameter(data1, "progress");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        super();
        this.a = uUID0;
        this.b = workInfo$State0;
        this.c = set0;
        this.d = data0;
        this.e = data1;
        this.f = v;
        this.g = v1;
        this.h = constraints0;
        this.i = v2;
        this.j = workInfo$PeriodicityInfo0;
        this.k = v3;
        this.l = v4;
    }

    public WorkInfo(UUID uUID0, State workInfo$State0, Set set0, Data data0, Data data1, int v, int v1, Constraints constraints0, long v2, PeriodicityInfo workInfo$PeriodicityInfo0, long v3, int v4, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        Data data3;
        Data data2;
        if((v5 & 8) == 0) {
            data2 = data0;
        }
        else {
            Intrinsics.checkNotNullExpressionValue(Data.EMPTY, "EMPTY");
            data2 = Data.EMPTY;
        }
        if((v5 & 16) == 0) {
            data3 = data1;
        }
        else {
            Intrinsics.checkNotNullExpressionValue(Data.EMPTY, "EMPTY");
            data3 = Data.EMPTY;
        }
        this(uUID0, workInfo$State0, set0, data2, data3, ((v5 & 0x20) == 0 ? v : 0), ((v5 & 0x40) == 0 ? v1 : 0), ((v5 & 0x80) == 0 ? constraints0 : Constraints.NONE), ((v5 & 0x100) == 0 ? v2 : 0L), ((v5 & 0x200) == 0 ? workInfo$PeriodicityInfo0 : null), ((v5 & 0x400) == 0 ? v3 : 0x7FFFFFFFFFFFFFFFL), ((v5 & 0x800) == 0 ? v4 : 0xFFFFFF00));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!Intrinsics.areEqual(WorkInfo.class, class0) || this.f != ((WorkInfo)object0).f) {
                return false;
            }
            if(this.g != ((WorkInfo)object0).g) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((WorkInfo)object0).a)) {
                return false;
            }
            if(this.b != ((WorkInfo)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((WorkInfo)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((WorkInfo)object0).h)) {
                return false;
            }
            if(this.i != ((WorkInfo)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((WorkInfo)object0).j)) {
                return false;
            }
            if(this.k != ((WorkInfo)object0).k) {
                return false;
            }
            if(this.l != ((WorkInfo)object0).l) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((WorkInfo)object0).c) ? Intrinsics.areEqual(this.e, ((WorkInfo)object0).e) : false;
        }
        return false;
    }

    @NotNull
    public final Constraints getConstraints() {
        return this.h;
    }

    public final int getGeneration() {
        return this.g;
    }

    @NotNull
    public final UUID getId() {
        return this.a;
    }

    public final long getInitialDelayMillis() {
        return this.i;
    }

    public final long getNextScheduleTimeMillis() {
        return this.k;
    }

    @NotNull
    public final Data getOutputData() {
        return this.d;
    }

    @Nullable
    public final PeriodicityInfo getPeriodicityInfo() {
        return this.j;
    }

    @NotNull
    public final Data getProgress() {
        return this.e;
    }

    @IntRange(from = 0L)
    public final int getRunAttemptCount() {
        return this.f;
    }

    @NotNull
    public final State getState() {
        return this.b;
    }

    @RequiresApi(0x1F)
    public final int getStopReason() {
        return this.l;
    }

    @NotNull
    public final Set getTags() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = a.k(this.i, (this.h.hashCode() + (((this.e.hashCode() + (this.c.hashCode() + (this.d.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F + this.f) * 0x1F + this.g) * 0x1F) * 0x1F, 0x1F);
        return this.j == null ? this.l + a.k(this.k, v * 0x1F, 0x1F) : this.l + a.k(this.k, (v + this.j.hashCode()) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "WorkInfo{id=\'" + this.a + "\', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}


package androidx.work.impl.model;

import a5.b;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.compose.ui.text.n0;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.PeriodicityInfo;
import androidx.work.WorkInfo.State;
import androidx.work.WorkInfo;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP})
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\bI\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0003opqB\u00E9\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\r\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0003\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u001A\u001A\u00020\u0019\u0012\b\b\u0002\u0010\u001C\u001A\u00020\u001B\u0012\b\b\u0002\u0010\u001D\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u001E\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u001F\u001A\u00020\u000B\u0012\b\b\u0002\u0010 \u001A\u00020\u0011\u0012\b\b\u0002\u0010!\u001A\u00020\u0011\u00A2\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010$\u001A\u00020\u0002\u00A2\u0006\u0004\b\"\u0010%B\u0019\b\u0016\u0012\u0006\u0010&\u001A\u00020\u0002\u0012\u0006\u0010\'\u001A\u00020\u0000\u00A2\u0006\u0004\b\"\u0010(J\u0015\u0010*\u001A\u00020)2\u0006\u0010\u0015\u001A\u00020\u000B\u00A2\u0006\u0004\b*\u0010+J\u0015\u0010,\u001A\u00020)2\u0006\u0010\r\u001A\u00020\u000B\u00A2\u0006\u0004\b,\u0010+J\u001D\u0010,\u001A\u00020)2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u000B\u00A2\u0006\u0004\b,\u0010-J\r\u0010.\u001A\u00020\u000B\u00A2\u0006\u0004\b.\u0010/J\r\u00100\u001A\u00020\u0019\u00A2\u0006\u0004\b0\u00101J\u000F\u00102\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b4\u00103J\u0010\u00105\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b7\u00103J\u0010\u00108\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b8\u00103J\u0010\u00109\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b9\u0010:J\u0010\u0010;\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b;\u0010:J\u0010\u0010<\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b<\u0010/J\u0010\u0010=\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b=\u0010/J\u0010\u0010>\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b>\u0010/J\u0010\u0010?\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b?\u0010@J\u0010\u0010A\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001A\u00020\u0013H\u00C6\u0003\u00A2\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\bE\u0010/J\u0010\u0010F\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\bF\u0010/J\u0010\u0010G\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\bG\u0010/J\u0010\u0010H\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\bH\u0010/J\u0010\u0010I\u001A\u00020\u0019H\u00C6\u0003\u00A2\u0006\u0004\bI\u00101J\u0010\u0010J\u001A\u00020\u001BH\u00C6\u0003\u00A2\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\bL\u0010BJ\u0010\u0010M\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\bM\u0010BJ\u0010\u0010N\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\bN\u0010/J\u0010\u0010O\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\bO\u0010BJ\u0010\u0010P\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\bP\u0010BJ\u00F6\u0001\u0010Q\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0003\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u000B2\b\b\u0002\u0010\u0016\u001A\u00020\u000B2\b\b\u0002\u0010\u0017\u001A\u00020\u000B2\b\b\u0002\u0010\u0018\u001A\u00020\u000B2\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001D\u001A\u00020\u00112\b\b\u0002\u0010\u001E\u001A\u00020\u00112\b\b\u0002\u0010\u001F\u001A\u00020\u000B2\b\b\u0002\u0010 \u001A\u00020\u00112\b\b\u0002\u0010!\u001A\u00020\u0011H\u00C6\u0001\u00A2\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001A\u00020\u0011H\u00D6\u0001\u00A2\u0006\u0004\bS\u0010BJ\u001A\u0010T\u001A\u00020\u00192\b\u0010\'\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0003\u0010VR\u0016\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0005\u0010WR\u0016\u0010\u0006\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0006\u0010VR\u0016\u0010\u0007\u001A\u00020\u00028\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0007\u0010VR\u0016\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\t\u0010XR\u0016\u0010\n\u001A\u00020\b8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\n\u0010XR\u0016\u0010\f\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\f\u0010YR\u0016\u0010\r\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\r\u0010YR\u0016\u0010\u000E\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u000E\u0010YR\u0016\u0010\u0010\u001A\u00020\u000F8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0010\u0010ZR\u0016\u0010\u0012\u001A\u00020\u00118\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0012\u0010[R\u0016\u0010\u0014\u001A\u00020\u00138\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\\R\u0016\u0010\u0015\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0015\u0010YR\u0016\u0010\u0016\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0016\u0010YR\u0016\u0010\u0017\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0017\u0010YR\u0016\u0010\u0018\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u0018\u0010YR\u0016\u0010\u001A\u001A\u00020\u00198\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u001A\u0010]R\u0016\u0010\u001C\u001A\u00020\u001B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\u001C\u0010^R\"\u0010\u001D\u001A\u00020\u00118\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\b_\u0010[\u001A\u0004\b`\u0010B\"\u0004\ba\u0010bR\u001A\u0010\u001E\u001A\u00020\u00118\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bc\u0010[\u001A\u0004\bd\u0010BR\"\u0010\u001F\u001A\u00020\u000B8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\be\u0010Y\u001A\u0004\bf\u0010/\"\u0004\bg\u0010+R\"\u0010 \u001A\u00020\u00118\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\bh\u0010[\u001A\u0004\bi\u0010B\"\u0004\bj\u0010bR\u001A\u0010!\u001A\u00020\u00118\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bk\u0010[\u001A\u0004\bl\u0010BR\u0011\u0010m\u001A\u00020\u00198F\u00A2\u0006\u0006\u001A\u0004\bm\u00101R\u0011\u0010n\u001A\u00020\u00198F\u00A2\u0006\u0006\u001A\u0004\bn\u00101\u00A8\u0006r"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/Data;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/Constraints;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Landroidx/work/OutOfQuotaPolicy;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJII)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "", "setBackoffDelayDuration", "(J)V", "setPeriodic", "(JJ)V", "calculateNextRunTime", "()J", "hasConstraints", "()Z", "toString", "()Ljava/lang/String;", "component1", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "component4", "component5", "()Landroidx/work/Data;", "component6", "component7", "component8", "component9", "component10", "()Landroidx/work/Constraints;", "component11", "()I", "component12", "()Landroidx/work/BackoffPolicy;", "component13", "component14", "component15", "component16", "component17", "component18", "()Landroidx/work/OutOfQuotaPolicy;", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJII)Landroidx/work/impl/model/WorkSpec;", "hashCode", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Landroidx/work/WorkInfo$State;", "Landroidx/work/Data;", "J", "Landroidx/work/Constraints;", "I", "Landroidx/work/BackoffPolicy;", "Z", "Landroidx/work/OutOfQuotaPolicy;", "a", "getPeriodCount", "setPeriodCount", "(I)V", "b", "getGeneration", "c", "getNextScheduleTimeOverride", "setNextScheduleTimeOverride", "d", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "e", "getStopReason", "isPeriodic", "isBackedOff", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWorkSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,544:1\n1549#2:545\n1620#2,3:546\n*S KotlinDebug\n*F\n+ 1 WorkSpec.kt\nandroidx/work/impl/model/WorkSpec\n*L\n482#1:545\n482#1:546,3\n*E\n"})
public final class WorkSpec {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001Je\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001A\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R,\u0010\u001C\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u00190\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "", "isBackedOff", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "calculateNextRunTime", "(ZILandroidx/work/BackoffPolicy;JJIZJJJJ)J", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final long calculateNextRunTime(boolean z, int v, @NotNull BackoffPolicy backoffPolicy0, long v1, long v2, int v3, boolean z1, long v4, long v5, long v6, long v7) {
            Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
            if(v7 != 0x7FFFFFFFFFFFFFFFL && z1) {
                return v3 == 0 ? v7 : c.coerceAtLeast(v7, v2 + 900000L);
            }
            if(z) {
                return backoffPolicy0 == BackoffPolicy.LINEAR ? c.coerceAtMost(((long)v) * v1, 18000000L) + v2 : c.coerceAtMost(((long)Math.scalb(v1, v - 1)), 18000000L) + v2;
            }
            if(z1) {
                long v8 = v3 == 0 ? v2 + v4 : v2 + v6;
                return v5 == v6 || v3 != 0 ? v8 : v6 - v5 + v8;
            }
            return v2 == -1L ? 0x7FFFFFFFFFFFFFFFL : v2 + v4;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\t\u0010\b\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001A\u00020\u00038\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001A\u00020\u00058\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class IdAndState {
        @ColumnInfo(name = "id")
        @JvmField
        @NotNull
        public String id;
        @ColumnInfo(name = "state")
        @JvmField
        @NotNull
        public State state;

        public IdAndState(@NotNull String s, @NotNull State workInfo$State0) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(workInfo$State0, "state");
            super();
            this.id = s;
            this.state = workInfo$State0;
        }

        @NotNull
        public final String component1() {
            return this.id;
        }

        @NotNull
        public final State component2() {
            return this.state;
        }

        @NotNull
        public final IdAndState copy(@NotNull String s, @NotNull State workInfo$State0) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(workInfo$State0, "state");
            return new IdAndState(s, workInfo$State0);
        }

        public static IdAndState copy$default(IdAndState workSpec$IdAndState0, String s, State workInfo$State0, int v, Object object0) {
            if((v & 1) != 0) {
                s = workSpec$IdAndState0.id;
            }
            if((v & 2) != 0) {
                workInfo$State0 = workSpec$IdAndState0.state;
            }
            return workSpec$IdAndState0.copy(s, workInfo$State0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof IdAndState)) {
                return false;
            }
            return Intrinsics.areEqual(this.id, ((IdAndState)object0).id) ? this.state == ((IdAndState)object0).state : false;
        }

        @Override
        public int hashCode() {
            return this.state.hashCode() + this.id.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000B\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B\u00A9\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\b\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001A\u00020\b\u0012\b\b\u0002\u0010\u0013\u001A\u00020\b\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u000E\u0012\u0006\u0010\u0015\u001A\u00020\u000E\u0012\u0006\u0010\u0016\u001A\u00020\b\u0012\u0006\u0010\u0017\u001A\u00020\u000E\u0012\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00060\u0018\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\r\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\'J\u0010\u0010)\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\'J\u0010\u0010*\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b0\u0010\'J\u0010\u00101\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b1\u0010\'J\u0010\u00102\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b2\u0010-J\u0010\u00103\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b3\u0010-J\u0010\u00104\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b4\u0010\'J\u0010\u00105\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b5\u0010-J\u0016\u00106\u001A\b\u0012\u0004\u0012\u00020\u00020\u0018H\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u0016\u00108\u001A\b\u0012\u0004\u0012\u00020\u00060\u0018H\u00C6\u0003\u00A2\u0006\u0004\b8\u00107J\u00C6\u0001\u00109\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\b2\b\b\u0002\u0010\u0013\u001A\u00020\b2\b\b\u0002\u0010\u0014\u001A\u00020\u000E2\b\b\u0002\u0010\u0015\u001A\u00020\u000E2\b\b\u0002\u0010\u0016\u001A\u00020\b2\b\b\u0002\u0010\u0017\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u00182\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00060\u0018H\u00C6\u0001\u00A2\u0006\u0004\b9\u0010:J\u0010\u0010;\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b;\u0010!J\u0010\u0010<\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\b<\u0010-J\u001A\u0010?\u001A\u00020>2\b\u0010=\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b?\u0010@R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010!R\u001A\u0010\u0005\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010#R\u001A\u0010\u0007\u001A\u00020\u00068\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010%R\u001A\u0010\t\u001A\u00020\b8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010\'R\u001A\u0010\n\u001A\u00020\b8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bM\u0010K\u001A\u0004\bN\u0010\'R\u001A\u0010\u000B\u001A\u00020\b8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bO\u0010K\u001A\u0004\bP\u0010\'R\u001A\u0010\r\u001A\u00020\f8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010+R\u001A\u0010\u000F\u001A\u00020\u000E8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010-R\"\u0010\u0011\u001A\u00020\u00108\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010X\u001A\u0004\bY\u0010/\"\u0004\bZ\u0010[R\"\u0010\u0012\u001A\u00020\b8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\b\\\u0010K\u001A\u0004\b]\u0010\'\"\u0004\b^\u0010_R\"\u0010\u0013\u001A\u00020\b8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\b`\u0010K\u001A\u0004\ba\u0010\'\"\u0004\bb\u0010_R\"\u0010\u0014\u001A\u00020\u000E8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010U\u001A\u0004\bd\u0010-\"\u0004\be\u0010fR\u001A\u0010\u0015\u001A\u00020\u000E8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bg\u0010U\u001A\u0004\bh\u0010-R\u001A\u0010\u0016\u001A\u00020\b8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bi\u0010K\u001A\u0004\bj\u0010\'R\u001A\u0010\u0017\u001A\u00020\u000E8\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bk\u0010U\u001A\u0004\bl\u0010-R \u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bm\u0010n\u001A\u0004\bo\u00107R \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0087\u0004\u00A2\u0006\f\n\u0004\bp\u0010n\u001A\u0004\bq\u00107R\u0011\u0010r\u001A\u00020>8F\u00A2\u0006\u0006\u001A\u0004\br\u0010sR\u0011\u0010t\u001A\u00020>8F\u00A2\u0006\u0006\u001A\u0004\bt\u0010s\u00A8\u0006u"}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "", "id", "Landroidx/work/WorkInfo$State;", "state", "Landroidx/work/Data;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/Constraints;", "constraints", "", "runAttemptCount", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V", "Landroidx/work/WorkInfo;", "toWorkInfo", "()Landroidx/work/WorkInfo;", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/work/WorkInfo$State;", "component3", "()Landroidx/work/Data;", "component4", "()J", "component5", "component6", "component7", "()Landroidx/work/Constraints;", "component8", "()I", "component9", "()Landroidx/work/BackoffPolicy;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/util/List;", "component17", "copy", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Landroidx/work/WorkInfo$State;", "getState", "c", "Landroidx/work/Data;", "getOutput", "d", "J", "getInitialDelay", "e", "getIntervalDuration", "f", "getFlexDuration", "g", "Landroidx/work/Constraints;", "getConstraints", "h", "I", "getRunAttemptCount", "i", "Landroidx/work/BackoffPolicy;", "getBackoffPolicy", "setBackoffPolicy", "(Landroidx/work/BackoffPolicy;)V", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "k", "getLastEnqueueTime", "setLastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "m", "getGeneration", "n", "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", "q", "getProgress", "isPeriodic", "()Z", "isBackedOff", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WorkInfoPojo {
        public final String a;
        public final State b;
        public final Data c;
        public final long d;
        public final long e;
        public final long f;
        public final Constraints g;
        public final int h;
        public BackoffPolicy i;
        public long j;
        public long k;
        public int l;
        public final int m;
        public final long n;
        public final int o;
        public final List p;
        public final List q;

        public WorkInfoPojo(@NotNull String s, @NotNull State workInfo$State0, @NotNull Data data0, long v, long v1, long v2, @NotNull Constraints constraints0, int v3, @NotNull BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(workInfo$State0, "state");
            Intrinsics.checkNotNullParameter(data0, "output");
            Intrinsics.checkNotNullParameter(constraints0, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
            Intrinsics.checkNotNullParameter(list0, "tags");
            Intrinsics.checkNotNullParameter(list1, "progress");
            super();
            this.a = s;
            this.b = workInfo$State0;
            this.c = data0;
            this.d = v;
            this.e = v1;
            this.f = v2;
            this.g = constraints0;
            this.h = v3;
            this.i = backoffPolicy0;
            this.j = v4;
            this.k = v5;
            this.l = v6;
            this.m = v7;
            this.n = v8;
            this.o = v9;
            this.p = list0;
            this.q = list1;
        }

        public WorkInfoPojo(String s, State workInfo$State0, Data data0, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, List list0, List list1, int v10, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, workInfo$State0, data0, ((v10 & 8) == 0 ? v : 0L), ((v10 & 16) == 0 ? v1 : 0L), ((v10 & 0x20) == 0 ? v2 : 0L), constraints0, v3, ((v10 & 0x100) == 0 ? backoffPolicy0 : BackoffPolicy.EXPONENTIAL), ((v10 & 0x200) == 0 ? v4 : 30000L), ((v10 & 0x400) == 0 ? v5 : 0L), ((v10 & 0x800) == 0 ? v6 : 0), v7, v8, v9, list0, list1);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final long component10() {
            return this.j;
        }

        public final long component11() {
            return this.k;
        }

        public final int component12() {
            return this.l;
        }

        public final int component13() {
            return this.m;
        }

        public final long component14() {
            return this.n;
        }

        public final int component15() {
            return this.o;
        }

        @NotNull
        public final List component16() {
            return this.p;
        }

        @NotNull
        public final List component17() {
            return this.q;
        }

        @NotNull
        public final State component2() {
            return this.b;
        }

        @NotNull
        public final Data component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        public final long component5() {
            return this.e;
        }

        public final long component6() {
            return this.f;
        }

        @NotNull
        public final Constraints component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        @NotNull
        public final BackoffPolicy component9() {
            return this.i;
        }

        @NotNull
        public final WorkInfoPojo copy(@NotNull String s, @NotNull State workInfo$State0, @NotNull Data data0, long v, long v1, long v2, @NotNull Constraints constraints0, int v3, @NotNull BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(workInfo$State0, "state");
            Intrinsics.checkNotNullParameter(data0, "output");
            Intrinsics.checkNotNullParameter(constraints0, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
            Intrinsics.checkNotNullParameter(list0, "tags");
            Intrinsics.checkNotNullParameter(list1, "progress");
            return new WorkInfoPojo(s, workInfo$State0, data0, v, v1, v2, constraints0, v3, backoffPolicy0, v4, v5, v6, v7, v8, v9, list0, list1);
        }

        public static WorkInfoPojo copy$default(WorkInfoPojo workSpec$WorkInfoPojo0, String s, State workInfo$State0, Data data0, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, int v6, int v7, long v8, int v9, List list0, List list1, int v10, Object object0) {
            String s1 = (v10 & 1) == 0 ? s : workSpec$WorkInfoPojo0.a;
            State workInfo$State1 = (v10 & 2) == 0 ? workInfo$State0 : workSpec$WorkInfoPojo0.b;
            Data data1 = (v10 & 4) == 0 ? data0 : workSpec$WorkInfoPojo0.c;
            long v11 = (v10 & 8) == 0 ? v : workSpec$WorkInfoPojo0.d;
            long v12 = (v10 & 16) == 0 ? v1 : workSpec$WorkInfoPojo0.e;
            long v13 = (v10 & 0x20) == 0 ? v2 : workSpec$WorkInfoPojo0.f;
            Constraints constraints1 = (v10 & 0x40) == 0 ? constraints0 : workSpec$WorkInfoPojo0.g;
            int v14 = (v10 & 0x80) == 0 ? v3 : workSpec$WorkInfoPojo0.h;
            BackoffPolicy backoffPolicy1 = (v10 & 0x100) == 0 ? backoffPolicy0 : workSpec$WorkInfoPojo0.i;
            long v15 = (v10 & 0x200) == 0 ? v4 : workSpec$WorkInfoPojo0.j;
            long v16 = (v10 & 0x400) == 0 ? v5 : workSpec$WorkInfoPojo0.k;
            int v17 = (v10 & 0x800) == 0 ? v6 : workSpec$WorkInfoPojo0.l;
            int v18 = (v10 & 0x1000) == 0 ? v7 : workSpec$WorkInfoPojo0.m;
            long v19 = (v10 & 0x2000) == 0 ? v8 : workSpec$WorkInfoPojo0.n;
            int v20 = (v10 & 0x4000) == 0 ? v9 : workSpec$WorkInfoPojo0.o;
            List list2 = (0x8000 & v10) == 0 ? list0 : workSpec$WorkInfoPojo0.p;
            return (v10 & 0x10000) == 0 ? workSpec$WorkInfoPojo0.copy(s1, workInfo$State1, data1, v11, v12, v13, constraints1, v14, backoffPolicy1, v15, v16, v17, v18, v19, v20, list2, list1) : workSpec$WorkInfoPojo0.copy(s1, workInfo$State1, data1, v11, v12, v13, constraints1, v14, backoffPolicy1, v15, v16, v17, v18, v19, v20, list2, workSpec$WorkInfoPojo0.q);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof WorkInfoPojo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((WorkInfoPojo)object0).a)) {
                return false;
            }
            if(this.b != ((WorkInfoPojo)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((WorkInfoPojo)object0).c)) {
                return false;
            }
            if(this.d != ((WorkInfoPojo)object0).d) {
                return false;
            }
            if(this.e != ((WorkInfoPojo)object0).e) {
                return false;
            }
            if(this.f != ((WorkInfoPojo)object0).f) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((WorkInfoPojo)object0).g)) {
                return false;
            }
            if(this.h != ((WorkInfoPojo)object0).h) {
                return false;
            }
            if(this.i != ((WorkInfoPojo)object0).i) {
                return false;
            }
            if(this.j != ((WorkInfoPojo)object0).j) {
                return false;
            }
            if(this.k != ((WorkInfoPojo)object0).k) {
                return false;
            }
            if(this.l != ((WorkInfoPojo)object0).l) {
                return false;
            }
            if(this.m != ((WorkInfoPojo)object0).m) {
                return false;
            }
            if(this.n != ((WorkInfoPojo)object0).n) {
                return false;
            }
            if(this.o != ((WorkInfoPojo)object0).o) {
                return false;
            }
            return Intrinsics.areEqual(this.p, ((WorkInfoPojo)object0).p) ? Intrinsics.areEqual(this.q, ((WorkInfoPojo)object0).q) : false;
        }

        public final long getBackoffDelayDuration() {
            return this.j;
        }

        @NotNull
        public final BackoffPolicy getBackoffPolicy() {
            return this.i;
        }

        @NotNull
        public final Constraints getConstraints() {
            return this.g;
        }

        public final long getFlexDuration() {
            return this.f;
        }

        public final int getGeneration() {
            return this.m;
        }

        @NotNull
        public final String getId() {
            return this.a;
        }

        public final long getInitialDelay() {
            return this.d;
        }

        public final long getIntervalDuration() {
            return this.e;
        }

        public final long getLastEnqueueTime() {
            return this.k;
        }

        public final long getNextScheduleTimeOverride() {
            return this.n;
        }

        @NotNull
        public final Data getOutput() {
            return this.c;
        }

        public final int getPeriodCount() {
            return this.l;
        }

        @NotNull
        public final List getProgress() {
            return this.q;
        }

        public final int getRunAttemptCount() {
            return this.h;
        }

        @NotNull
        public final State getState() {
            return this.b;
        }

        public final int getStopReason() {
            return this.o;
        }

        @NotNull
        public final List getTags() {
            return this.p;
        }

        @Override
        public int hashCode() {
            return this.q.hashCode() + b.c(this.p, a.c(this.o, wb.a.k(this.n, a.c(this.m, a.c(this.l, wb.a.k(this.k, wb.a.k(this.j, (this.i.hashCode() + a.c(this.h, (this.g.hashCode() + wb.a.k(this.f, wb.a.k(this.e, wb.a.k(this.d, (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public final boolean isBackedOff() {
            return this.b == State.ENQUEUED && this.h > 0;
        }

        public final boolean isPeriodic() {
            return this.e != 0L;
        }

        public final void setBackoffDelayDuration(long v) {
            this.j = v;
        }

        public final void setBackoffPolicy(@NotNull BackoffPolicy backoffPolicy0) {
            Intrinsics.checkNotNullParameter(backoffPolicy0, "<set-?>");
            this.i = backoffPolicy0;
        }

        public final void setLastEnqueueTime(long v) {
            this.k = v;
        }

        public final void setPeriodCount(int v) {
            this.l = v;
        }

        @Override
        @NotNull
        public String toString() {
            return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
        }

        @NotNull
        public final WorkInfo toWorkInfo() {
            Data data0 = this.q.isEmpty() ? Data.EMPTY : ((Data)this.q.get(0));
            UUID uUID0 = UUID.fromString(this.a);
            Intrinsics.checkNotNullExpressionValue(uUID0, "fromString(id)");
            HashSet hashSet0 = new HashSet(this.p);
            Intrinsics.checkNotNullExpressionValue(data0, "progress");
            PeriodicityInfo workInfo$PeriodicityInfo0 = this.e == 0L ? null : new PeriodicityInfo(this.e, this.f);
            if(this.b == State.ENQUEUED) {
                boolean z = this.isBackedOff();
                BackoffPolicy backoffPolicy0 = this.i;
                long v = this.j;
                long v1 = this.k;
                int v2 = this.l;
                boolean z1 = this.isPeriodic();
                long v3 = WorkSpec.Companion.calculateNextRunTime(z, this.h, backoffPolicy0, v, v1, v2, z1, this.d, this.f, this.e, this.n);
                return new WorkInfo(uUID0, this.b, hashSet0, this.c, data0, this.h, this.m, this.g, this.d, workInfo$PeriodicityInfo0, v3, this.o);
            }
            return new WorkInfo(uUID0, this.b, hashSet0, this.c, data0, this.h, this.m, this.g, this.d, workInfo$PeriodicityInfo0, 0x7FFFFFFFFFFFFFFFL, this.o);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1L;
    @JvmField
    @NotNull
    public static final Function WORK_INFO_MAPPER;
    public int a;
    public final int b;
    @ColumnInfo(name = "backoff_delay_duration")
    @JvmField
    public long backoffDelayDuration;
    @ColumnInfo(name = "backoff_policy")
    @JvmField
    @NotNull
    public BackoffPolicy backoffPolicy;
    public long c;
    @Embedded
    @JvmField
    @NotNull
    public Constraints constraints;
    public int d;
    public final int e;
    @ColumnInfo(name = "run_in_foreground")
    @JvmField
    public boolean expedited;
    public static final String f;
    @ColumnInfo(name = "flex_duration")
    @JvmField
    public long flexDuration;
    @ColumnInfo(name = "id")
    @PrimaryKey
    @JvmField
    @NotNull
    public final String id;
    @ColumnInfo(name = "initial_delay")
    @JvmField
    public long initialDelay;
    @ColumnInfo(name = "input")
    @JvmField
    @NotNull
    public Data input;
    @ColumnInfo(name = "input_merger_class_name")
    @JvmField
    @NotNull
    public String inputMergerClassName;
    @ColumnInfo(name = "interval_duration")
    @JvmField
    public long intervalDuration;
    @ColumnInfo(defaultValue = "-1", name = "last_enqueue_time")
    @JvmField
    public long lastEnqueueTime;
    @ColumnInfo(name = "minimum_retention_duration")
    @JvmField
    public long minimumRetentionDuration;
    @ColumnInfo(name = "out_of_quota_policy")
    @JvmField
    @NotNull
    public OutOfQuotaPolicy outOfQuotaPolicy;
    @ColumnInfo(name = "output")
    @JvmField
    @NotNull
    public Data output;
    @ColumnInfo(name = "run_attempt_count")
    @JvmField
    public int runAttemptCount;
    @ColumnInfo(name = "schedule_requested_at")
    @JvmField
    public long scheduleRequestedAt;
    @ColumnInfo(name = "state")
    @JvmField
    @NotNull
    public State state;
    @ColumnInfo(name = "worker_class_name")
    @JvmField
    @NotNull
    public String workerClassName;

    static {
        WorkSpec.Companion = new Companion(null);
        Intrinsics.checkNotNullExpressionValue("WM-WorkSpec", "tagWithPrefix(\"WorkSpec\")");
        WorkSpec.f = "WM-WorkSpec";
        WorkSpec.WORK_INFO_MAPPER = new n0(10);
    }

    public WorkSpec(@NotNull String s, @NotNull State workInfo$State0, @NotNull String s1, @NotNull String s2, @NotNull Data data0, @NotNull Data data1, long v, long v1, long v2, @NotNull Constraints constraints0, @IntRange(from = 0L) int v3, @NotNull BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, @NotNull OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(s1, "workerClassName");
        Intrinsics.checkNotNullParameter(s2, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(data0, "input");
        Intrinsics.checkNotNullParameter(data1, "output");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy0, "outOfQuotaPolicy");
        super();
        this.id = s;
        this.state = workInfo$State0;
        this.workerClassName = s1;
        this.inputMergerClassName = s2;
        this.input = data0;
        this.output = data1;
        this.initialDelay = v;
        this.intervalDuration = v1;
        this.flexDuration = v2;
        this.constraints = constraints0;
        this.runAttemptCount = v3;
        this.backoffPolicy = backoffPolicy0;
        this.backoffDelayDuration = v4;
        this.lastEnqueueTime = v5;
        this.minimumRetentionDuration = v6;
        this.scheduleRequestedAt = v7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy0;
        this.a = v8;
        this.b = v9;
        this.c = v10;
        this.d = v11;
        this.e = v12;
    }

    public WorkSpec(String s, State workInfo$State0, String s1, String s2, Data data0, Data data1, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12, int v13, DefaultConstructorMarker defaultConstructorMarker0) {
        Data data3;
        Data data2;
        String s3;
        State workInfo$State1 = (v13 & 2) == 0 ? workInfo$State0 : State.ENQUEUED;
        if((v13 & 8) == 0) {
            s3 = s2;
        }
        else {
            Intrinsics.checkNotNullExpressionValue("androidx.work.OverwritingInputMerger", "OverwritingInputMerger::class.java.name");
            s3 = "androidx.work.OverwritingInputMerger";
        }
        if((v13 & 16) == 0) {
            data2 = data0;
        }
        else {
            Intrinsics.checkNotNullExpressionValue(Data.EMPTY, "EMPTY");
            data2 = Data.EMPTY;
        }
        if((v13 & 0x20) == 0) {
            data3 = data1;
        }
        else {
            Intrinsics.checkNotNullExpressionValue(Data.EMPTY, "EMPTY");
            data3 = Data.EMPTY;
        }
        this(s, workInfo$State1, s1, s3, data2, data3, ((v13 & 0x40) == 0 ? v : 0L), ((v13 & 0x80) == 0 ? v1 : 0L), ((v13 & 0x100) == 0 ? v2 : 0L), ((v13 & 0x200) == 0 ? constraints0 : Constraints.NONE), ((v13 & 0x400) == 0 ? v3 : 0), ((v13 & 0x800) == 0 ? backoffPolicy0 : BackoffPolicy.EXPONENTIAL), ((v13 & 0x1000) == 0 ? v4 : 30000L), ((v13 & 0x2000) == 0 ? v5 : -1L), ((v13 & 0x4000) == 0 ? v6 : 0L), ((0x8000 & v13) == 0 ? v7 : -1L), ((0x10000 & v13) == 0 ? z : false), ((0x20000 & v13) == 0 ? outOfQuotaPolicy0 : OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST), ((0x40000 & v13) == 0 ? v8 : 0), ((0x80000 & v13) == 0 ? v9 : 0), ((0x100000 & v13) == 0 ? v10 : 0x7FFFFFFFFFFFFFFFL), ((0x200000 & v13) == 0 ? v11 : 0), ((v13 & 0x400000) == 0 ? v12 : 0xFFFFFF00));
    }

    public WorkSpec(@NotNull String s, @NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(s, "newId");
        Intrinsics.checkNotNullParameter(workSpec0, "other");
        this(s, workSpec0.state, workSpec0.workerClassName, workSpec0.inputMergerClassName, new Data(workSpec0.input), new Data(workSpec0.output), workSpec0.initialDelay, workSpec0.intervalDuration, workSpec0.flexDuration, new Constraints(workSpec0.constraints), workSpec0.runAttemptCount, workSpec0.backoffPolicy, workSpec0.backoffDelayDuration, workSpec0.lastEnqueueTime, workSpec0.minimumRetentionDuration, workSpec0.scheduleRequestedAt, workSpec0.expedited, workSpec0.outOfQuotaPolicy, workSpec0.a, 0, workSpec0.c, workSpec0.d, workSpec0.e, 0x80000, null);
    }

    public WorkSpec(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "workerClassName_");
        this(s, null, s1, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 0x7FFFFA, null);
    }

    public final long calculateNextRunTime() {
        boolean z = this.isBackedOff();
        int v = this.runAttemptCount;
        BackoffPolicy backoffPolicy0 = this.backoffPolicy;
        long v1 = this.backoffDelayDuration;
        long v2 = this.lastEnqueueTime;
        int v3 = this.a;
        boolean z1 = this.isPeriodic();
        return WorkSpec.Companion.calculateNextRunTime(z, v, backoffPolicy0, v1, v2, v3, z1, this.initialDelay, this.flexDuration, this.intervalDuration, this.c);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    @NotNull
    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    @NotNull
    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.a;
    }

    @NotNull
    public final State component2() {
        return this.state;
    }

    public final int component20() {
        return this.b;
    }

    public final long component21() {
        return this.c;
    }

    public final int component22() {
        return this.d;
    }

    public final int component23() {
        return this.e;
    }

    @NotNull
    public final String component3() {
        return this.workerClassName;
    }

    @NotNull
    public final String component4() {
        return this.inputMergerClassName;
    }

    @NotNull
    public final Data component5() {
        return this.input;
    }

    @NotNull
    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    @NotNull
    public final WorkSpec copy(@NotNull String s, @NotNull State workInfo$State0, @NotNull String s1, @NotNull String s2, @NotNull Data data0, @NotNull Data data1, long v, long v1, long v2, @NotNull Constraints constraints0, @IntRange(from = 0L) int v3, @NotNull BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, @NotNull OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(workInfo$State0, "state");
        Intrinsics.checkNotNullParameter(s1, "workerClassName");
        Intrinsics.checkNotNullParameter(s2, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(data0, "input");
        Intrinsics.checkNotNullParameter(data1, "output");
        Intrinsics.checkNotNullParameter(constraints0, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy0, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy0, "outOfQuotaPolicy");
        return new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v, v1, v2, constraints0, v3, backoffPolicy0, v4, v5, v6, v7, z, outOfQuotaPolicy0, v8, v9, v10, v11, v12);
    }

    public static WorkSpec copy$default(WorkSpec workSpec0, String s, State workInfo$State0, String s1, String s2, Data data0, Data data1, long v, long v1, long v2, Constraints constraints0, int v3, BackoffPolicy backoffPolicy0, long v4, long v5, long v6, long v7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy0, int v8, int v9, long v10, int v11, int v12, int v13, Object object0) {
        String s3 = (v13 & 1) == 0 ? s : workSpec0.id;
        State workInfo$State1 = (v13 & 2) == 0 ? workInfo$State0 : workSpec0.state;
        String s4 = (v13 & 4) == 0 ? s1 : workSpec0.workerClassName;
        String s5 = (v13 & 8) == 0 ? s2 : workSpec0.inputMergerClassName;
        Data data2 = (v13 & 16) == 0 ? data0 : workSpec0.input;
        Data data3 = (v13 & 0x20) == 0 ? data1 : workSpec0.output;
        long v14 = (v13 & 0x40) == 0 ? v : workSpec0.initialDelay;
        long v15 = (v13 & 0x80) == 0 ? v1 : workSpec0.intervalDuration;
        long v16 = (v13 & 0x100) == 0 ? v2 : workSpec0.flexDuration;
        Constraints constraints1 = (v13 & 0x200) == 0 ? constraints0 : workSpec0.constraints;
        int v17 = (v13 & 0x400) == 0 ? v3 : workSpec0.runAttemptCount;
        BackoffPolicy backoffPolicy1 = (v13 & 0x800) == 0 ? backoffPolicy0 : workSpec0.backoffPolicy;
        long v18 = (v13 & 0x1000) == 0 ? v4 : workSpec0.backoffDelayDuration;
        long v19 = (v13 & 0x2000) == 0 ? v5 : workSpec0.lastEnqueueTime;
        long v20 = (v13 & 0x4000) == 0 ? v6 : workSpec0.minimumRetentionDuration;
        long v21 = (v13 & 0x8000) == 0 ? v7 : workSpec0.scheduleRequestedAt;
        boolean z1 = (v13 & 0x10000) == 0 ? z : workSpec0.expedited;
        OutOfQuotaPolicy outOfQuotaPolicy1 = (0x20000 & v13) == 0 ? outOfQuotaPolicy0 : workSpec0.outOfQuotaPolicy;
        int v22 = (v13 & 0x40000) == 0 ? v8 : workSpec0.a;
        int v23 = (v13 & 0x80000) == 0 ? v9 : workSpec0.b;
        long v24 = (v13 & 0x100000) == 0 ? v10 : workSpec0.c;
        int v25 = (v13 & 0x200000) == 0 ? v11 : workSpec0.d;
        return (v13 & 0x400000) == 0 ? workSpec0.copy(s3, workInfo$State1, s4, s5, data2, data3, v14, v15, v16, constraints1, v17, backoffPolicy1, v18, v19, v20, v21, z1, outOfQuotaPolicy1, v22, v23, v24, v25, v12) : workSpec0.copy(s3, workInfo$State1, s4, s5, data2, data3, v14, v15, v16, constraints1, v17, backoffPolicy1, v18, v19, v20, v21, z1, outOfQuotaPolicy1, v22, v23, v24, v25, workSpec0.e);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec0 = (WorkSpec)object0;
        if(!Intrinsics.areEqual(this.id, workSpec0.id)) {
            return false;
        }
        if(this.state != workSpec0.state) {
            return false;
        }
        if(!Intrinsics.areEqual(this.workerClassName, workSpec0.workerClassName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.inputMergerClassName, workSpec0.inputMergerClassName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.input, workSpec0.input)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.output, workSpec0.output)) {
            return false;
        }
        if(this.initialDelay != workSpec0.initialDelay) {
            return false;
        }
        if(this.intervalDuration != workSpec0.intervalDuration) {
            return false;
        }
        if(this.flexDuration != workSpec0.flexDuration) {
            return false;
        }
        if(!Intrinsics.areEqual(this.constraints, workSpec0.constraints)) {
            return false;
        }
        if(this.runAttemptCount != workSpec0.runAttemptCount) {
            return false;
        }
        if(this.backoffPolicy != workSpec0.backoffPolicy) {
            return false;
        }
        if(this.backoffDelayDuration != workSpec0.backoffDelayDuration) {
            return false;
        }
        if(this.lastEnqueueTime != workSpec0.lastEnqueueTime) {
            return false;
        }
        if(this.minimumRetentionDuration != workSpec0.minimumRetentionDuration) {
            return false;
        }
        if(this.scheduleRequestedAt != workSpec0.scheduleRequestedAt) {
            return false;
        }
        if(this.expedited != workSpec0.expedited) {
            return false;
        }
        if(this.outOfQuotaPolicy != workSpec0.outOfQuotaPolicy) {
            return false;
        }
        if(this.a != workSpec0.a) {
            return false;
        }
        if(this.b != workSpec0.b) {
            return false;
        }
        if(this.c != workSpec0.c) {
            return false;
        }
        return this.d == workSpec0.d ? this.e == workSpec0.e : false;
    }

    public final int getGeneration() {
        return this.b;
    }

    public final long getNextScheduleTimeOverride() {
        return this.c;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.d;
    }

    public final int getPeriodCount() {
        return this.a;
    }

    public final int getStopReason() {
        return this.e;
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    @Override
    public int hashCode() {
        int v = wb.a.k(this.scheduleRequestedAt, wb.a.k(this.minimumRetentionDuration, wb.a.k(this.lastEnqueueTime, wb.a.k(this.backoffDelayDuration, (this.backoffPolicy.hashCode() + a.c(this.runAttemptCount, (this.constraints.hashCode() + wb.a.k(this.flexDuration, wb.a.k(this.intervalDuration, wb.a.k(this.initialDelay, (this.output.hashCode() + (this.input.hashCode() + q.c(q.c((this.state.hashCode() + this.id.hashCode() * 0x1F) * 0x1F, 0x1F, this.workerClassName), 0x1F, this.inputMergerClassName)) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        int v1 = this.expedited;
        if(v1) {
            v1 = 1;
        }
        return this.e + a.c(this.d, wb.a.k(this.c, a.c(this.b, a.c(this.a, (this.outOfQuotaPolicy.hashCode() + (v + v1) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    public final boolean isBackedOff() {
        return this.state == State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0L;
    }

    public final void setBackoffDelayDuration(long v) {
        if(Long.compare(v, 18000000L) > 0) {
            Logger.get().warning("WM-WorkSpec", "Backoff delay duration exceeds maximum value");
        }
        if(v < 10000L) {
            Logger.get().warning("WM-WorkSpec", "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = c.coerceIn(v, 10000L, 18000000L);
    }

    public final void setNextScheduleTimeOverride(long v) {
        this.c = v;
    }

    public final void setNextScheduleTimeOverrideGeneration(int v) {
        this.d = v;
    }

    public final void setPeriodCount(int v) {
        this.a = v;
    }

    public final void setPeriodic(long v) {
        if(v < 900000L) {
            Logger.get().warning("WM-WorkSpec", "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.setPeriodic(c.coerceAtLeast(v, 900000L), c.coerceAtLeast(v, 900000L));
    }

    public final void setPeriodic(long v, long v1) {
        if(Long.compare(v, 900000L) < 0) {
            Logger.get().warning("WM-WorkSpec", "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = c.coerceAtLeast(v, 900000L);
        if(v1 < 300000L) {
            Logger.get().warning("WM-WorkSpec", "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if(v1 > this.intervalDuration) {
            Logger.get().warning("WM-WorkSpec", "Flex duration greater than interval duration; Changed to " + v);
        }
        this.flexDuration = c.coerceIn(v1, 300000L, this.intervalDuration);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("{WorkSpec: ");
        return wb.a.b('}', this.id, stringBuilder0);
    }
}


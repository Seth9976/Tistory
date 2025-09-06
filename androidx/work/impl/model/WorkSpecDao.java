package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"UnknownNullness"})
@Dao
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0019\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\'J\u0010\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000B\u001A\u00020\u0003H\'J\u000E\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\'J\u000E\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\'J\u0014\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u000FH\'J\u0016\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001A\u00020\u0003H\'J\u000E\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0016\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0016\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0016\u001A\u00020\u0017H\'J\u000E\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00170\u000F2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u000E\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u001C2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u001E\u001A\u00020\u0007H\'J\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010 \u001A\u00020\u0007H\'J\u0012\u0010!\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0016\u0010\"\u001A\b\u0012\u0004\u0012\u00020#0\t2\u0006\u0010\u001E\u001A\u00020\u0007H\'J\"\u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0%2\f\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\'J\u001C\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0%2\u0006\u0010\u001E\u001A\u00020\u0007H\'J\u001C\u0010)\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0%2\u0006\u0010 \u001A\u00020\u0007H\'J\u0012\u0010*\u001A\u0004\u0018\u00010&2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u001C\u0010+\u001A\b\u0012\u0004\u0012\u00020&0\t2\f\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\'J\u0016\u0010,\u001A\b\u0012\u0004\u0012\u00020&0\t2\u0006\u0010\u001E\u001A\u00020\u0007H\'J\u0016\u0010-\u001A\b\u0012\u0004\u0012\u00020&0\t2\u0006\u0010 \u001A\u00020\u0007H\'J\"\u0010.\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\u000F2\f\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\'J\u001C\u0010/\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\u000F2\u0006\u0010\u001E\u001A\u00020\u0007H\'J\u001C\u00100\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\u000F2\u0006\u0010 \u001A\u00020\u0007H\'J\b\u00101\u001A\u000202H\'J\u0010\u00103\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0010\u00104\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0010\u00105\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0010\u00106\u001A\u00020\u00052\u0006\u00107\u001A\u00020\nH\'J\u0018\u00108\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u00109\u001A\u00020\u0017H\'J\b\u0010:\u001A\u00020\u0005H\'J\b\u0010;\u001A\u00020\u0003H\'J\u0018\u0010<\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010=\u001A\u00020\u0003H\'J\u0010\u0010>\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0010\u0010?\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0018\u0010@\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010A\u001A\u00020\u0017H\'J\u0018\u0010B\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010C\u001A\u00020\u0017H\'J\u0018\u0010D\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010E\u001A\u00020\u0014H\'J\u0018\u0010F\u001A\u00020\u00032\u0006\u0010G\u001A\u00020\u001C2\u0006\u0010\u0006\u001A\u00020\u0007H\'J\u0018\u0010H\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010I\u001A\u00020\u0003H\'J\u0010\u0010J\u001A\u00020\u00052\u0006\u00107\u001A\u00020\nH\'\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u0006K\u00C0\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "countNonFinishedContentUriTriggerWorkers", "", "delete", "", "id", "", "getAllEligibleWorkSpecsForScheduling", "", "Landroidx/work/impl/model/WorkSpec;", "maxLimit", "getAllUnfinishedWork", "getAllWorkSpecIds", "getAllWorkSpecIdsLiveData", "Landroidx/lifecycle/LiveData;", "getEligibleWorkForScheduling", "schedulerLimit", "getEligibleWorkForSchedulingWithContentUris", "getInputsFromPrerequisites", "Landroidx/work/Data;", "getRecentlyCompletedWork", "startingAt", "", "getRunningWork", "getScheduleRequestedAtLiveData", "getScheduledWork", "getState", "Landroidx/work/WorkInfo$State;", "getUnfinishedWorkWithName", "name", "getUnfinishedWorkWithTag", "tag", "getWorkSpec", "getWorkSpecIdAndStatesForName", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkStatusPojoFlowDataForIds", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "ids", "getWorkStatusPojoFlowForName", "getWorkStatusPojoFlowForTag", "getWorkStatusPojoForId", "getWorkStatusPojoForIds", "getWorkStatusPojoForName", "getWorkStatusPojoForTag", "getWorkStatusPojoLiveDataForIds", "getWorkStatusPojoLiveDataForName", "getWorkStatusPojoLiveDataForTag", "hasUnfinishedWork", "", "incrementGeneration", "incrementPeriodCount", "incrementWorkSpecRunAttemptCount", "insertWorkSpec", "workSpec", "markWorkSpecScheduled", "startTime", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "resetScheduledState", "resetWorkSpecNextScheduleTimeOverride", "overrideGeneration", "resetWorkSpecRunAttemptCount", "setCancelledState", "setLastEnqueueTime", "enqueueTime", "setNextScheduleTimeOverride", "nextScheduleTimeOverrideMillis", "setOutput", "output", "setState", "state", "setStopReason", "stopReason", "updateWorkSpec", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface WorkSpecDao {
    @Query("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)")
    int countNonFinishedContentUriTriggerWorkers();

    @Query("DELETE FROM workspec WHERE id=:id")
    void delete(@NotNull String arg1);

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    List getAllEligibleWorkSpecsForScheduling(int arg1);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    @NotNull
    List getAllUnfinishedWork();

    @Query("SELECT id FROM workspec")
    @NotNull
    List getAllWorkSpecIds();

    @Query("SELECT id FROM workspec")
    @Transaction
    @NotNull
    LiveData getAllWorkSpecIdsLiveData();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))")
    @NotNull
    List getEligibleWorkForScheduling(int arg1);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time")
    @NotNull
    List getEligibleWorkForSchedulingWithContentUris();

    @Query("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    List getInputsFromPrerequisites(@NotNull String arg1);

    @Query("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    List getRecentlyCompletedWork(long arg1);

    @Query("SELECT * FROM workspec WHERE state=1")
    @NotNull
    List getRunningWork();

    @Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    @NotNull
    LiveData getScheduleRequestedAtLiveData(@NotNull String arg1);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    List getScheduledWork();

    @Query("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    State getState(@NotNull String arg1);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List getUnfinishedWorkWithName(@NotNull String arg1);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @NotNull
    List getUnfinishedWorkWithTag(@NotNull String arg1);

    @Query("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    WorkSpec getWorkSpec(@NotNull String arg1);

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List getWorkSpecIdAndStatesForName(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    Flow getWorkStatusPojoFlowDataForIds(@NotNull List arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    Flow getWorkStatusPojoFlowForName(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    Flow getWorkStatusPojoFlowForTag(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=:id")
    @Transaction
    @Nullable
    WorkInfoPojo getWorkStatusPojoForId(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    List getWorkStatusPojoForIds(@NotNull List arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    List getWorkStatusPojoForName(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    List getWorkStatusPojoForTag(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    LiveData getWorkStatusPojoLiveDataForIds(@NotNull List arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    LiveData getWorkStatusPojoLiveDataForName(@NotNull String arg1);

    @Query("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    LiveData getWorkStatusPojoLiveDataForTag(@NotNull String arg1);

    @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean hasUnfinishedWork();

    @Query("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void incrementGeneration(@NotNull String arg1);

    @Query("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void incrementPeriodCount(@NotNull String arg1);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(@NotNull String arg1);

    @Insert(onConflict = 5)
    void insertWorkSpec(@NotNull WorkSpec arg1);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@NotNull String arg1, long arg2);

    @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @Query("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=:id AND next_schedule_time_override_generation=:overrideGeneration)")
    void resetWorkSpecNextScheduleTimeOverride(@NotNull String arg1, int arg2);

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(@NotNull String arg1);

    @Query("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=:id")
    int setCancelledState(@NotNull String arg1);

    @Query("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void setLastEnqueueTime(@NotNull String arg1, long arg2);

    @Query("UPDATE workspec SET next_schedule_time_override=:nextScheduleTimeOverrideMillis WHERE id=:id")
    void setNextScheduleTimeOverride(@NotNull String arg1, long arg2);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(@NotNull String arg1, @NotNull Data arg2);

    @Query("UPDATE workspec SET state=:state WHERE id=:id")
    int setState(@NotNull State arg1, @NotNull String arg2);

    @Query("UPDATE workspec SET stop_reason=:stopReason WHERE id=:id")
    void setStopReason(@NotNull String arg1, int arg2);

    @Update
    void updateWorkSpec(@NotNull WorkSpec arg1);
}


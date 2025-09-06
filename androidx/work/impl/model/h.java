package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;

public final class h extends EntityInsertionAdapter {
    @Override  // androidx.room.EntityInsertionAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement0, Object object0) {
        WorkSpec workSpec0 = (WorkSpec)object0;
        String s = workSpec0.id;
        if(s == null) {
            supportSQLiteStatement0.bindNull(1);
        }
        else {
            supportSQLiteStatement0.bindString(1, s);
        }
        supportSQLiteStatement0.bindLong(2, ((long)WorkTypeConverters.stateToInt(workSpec0.state)));
        String s1 = workSpec0.workerClassName;
        if(s1 == null) {
            supportSQLiteStatement0.bindNull(3);
        }
        else {
            supportSQLiteStatement0.bindString(3, s1);
        }
        String s2 = workSpec0.inputMergerClassName;
        if(s2 == null) {
            supportSQLiteStatement0.bindNull(4);
        }
        else {
            supportSQLiteStatement0.bindString(4, s2);
        }
        byte[] arr_b = Data.toByteArrayInternal(workSpec0.input);
        if(arr_b == null) {
            supportSQLiteStatement0.bindNull(5);
        }
        else {
            supportSQLiteStatement0.bindBlob(5, arr_b);
        }
        byte[] arr_b1 = Data.toByteArrayInternal(workSpec0.output);
        if(arr_b1 == null) {
            supportSQLiteStatement0.bindNull(6);
        }
        else {
            supportSQLiteStatement0.bindBlob(6, arr_b1);
        }
        supportSQLiteStatement0.bindLong(7, workSpec0.initialDelay);
        supportSQLiteStatement0.bindLong(8, workSpec0.intervalDuration);
        supportSQLiteStatement0.bindLong(9, workSpec0.flexDuration);
        supportSQLiteStatement0.bindLong(10, ((long)workSpec0.runAttemptCount));
        supportSQLiteStatement0.bindLong(11, ((long)WorkTypeConverters.backoffPolicyToInt(workSpec0.backoffPolicy)));
        supportSQLiteStatement0.bindLong(12, workSpec0.backoffDelayDuration);
        supportSQLiteStatement0.bindLong(13, workSpec0.lastEnqueueTime);
        supportSQLiteStatement0.bindLong(14, workSpec0.minimumRetentionDuration);
        supportSQLiteStatement0.bindLong(15, workSpec0.scheduleRequestedAt);
        supportSQLiteStatement0.bindLong(16, ((long)workSpec0.expedited));
        supportSQLiteStatement0.bindLong(17, ((long)WorkTypeConverters.outOfQuotaPolicyToInt(workSpec0.outOfQuotaPolicy)));
        supportSQLiteStatement0.bindLong(18, ((long)workSpec0.getPeriodCount()));
        supportSQLiteStatement0.bindLong(19, ((long)workSpec0.getGeneration()));
        supportSQLiteStatement0.bindLong(20, workSpec0.getNextScheduleTimeOverride());
        supportSQLiteStatement0.bindLong(21, ((long)workSpec0.getNextScheduleTimeOverrideGeneration()));
        supportSQLiteStatement0.bindLong(22, ((long)workSpec0.getStopReason()));
        Constraints constraints0 = workSpec0.constraints;
        if(constraints0 != null) {
            supportSQLiteStatement0.bindLong(23, ((long)WorkTypeConverters.networkTypeToInt(constraints0.getRequiredNetworkType())));
            supportSQLiteStatement0.bindLong(24, ((long)constraints0.requiresCharging()));
            supportSQLiteStatement0.bindLong(25, ((long)constraints0.requiresDeviceIdle()));
            supportSQLiteStatement0.bindLong(26, ((long)constraints0.requiresBatteryNotLow()));
            supportSQLiteStatement0.bindLong(27, ((long)constraints0.requiresStorageNotLow()));
            supportSQLiteStatement0.bindLong(28, constraints0.getContentTriggerUpdateDelayMillis());
            supportSQLiteStatement0.bindLong(29, constraints0.getContentTriggerMaxDelayMillis());
            byte[] arr_b2 = WorkTypeConverters.setOfTriggersToByteArray(constraints0.getContentUriTriggers());
            if(arr_b2 == null) {
                supportSQLiteStatement0.bindNull(30);
                return;
            }
            supportSQLiteStatement0.bindBlob(30, arr_b2);
            return;
        }
        supportSQLiteStatement0.bindNull(23);
        supportSQLiteStatement0.bindNull(24);
        supportSQLiteStatement0.bindNull(25);
        supportSQLiteStatement0.bindNull(26);
        supportSQLiteStatement0.bindNull(27);
        supportSQLiteStatement0.bindNull(28);
        supportSQLiteStatement0.bindNull(29);
        supportSQLiteStatement0.bindNull(30);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}


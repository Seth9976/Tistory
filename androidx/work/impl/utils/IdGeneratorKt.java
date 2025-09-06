package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\f\"\u0014\u0010\r\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000E\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\f¨\u0006\u000F"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sqLiteDatabase", "", "migrateLegacyIdGenerator", "(Landroid/content/Context;Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "INITIAL_ID", "I", "", "NEXT_JOB_SCHEDULER_ID_KEY", "Ljava/lang/String;", "NEXT_ALARM_MANAGER_ID_KEY", "PREFERENCE_FILE_KEY", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class IdGeneratorKt {
    public static final int INITIAL_ID = 0;
    @NotNull
    public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    @NotNull
    public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    @NotNull
    public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";

    public static final int access$nextId(WorkDatabase workDatabase0, String s) {
        Long long0 = workDatabase0.preferenceDao().getLongValue(s);
        int v = 0;
        int v1 = long0 == null ? 0 : ((int)(((long)long0)));
        if(v1 != 0x7FFFFFFF) {
            v = v1 + 1;
        }
        workDatabase0.preferenceDao().insertPreference(new Preference(s, ((long)v)));
        return v1;
    }

    public static final void access$updatePreference(WorkDatabase workDatabase0, String s, int v) {
        workDatabase0.preferenceDao().insertPreference(new Preference(s, ((long)v)));
    }

    public static final void migrateLegacyIdGenerator(@NotNull Context context0, @NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "sqLiteDatabase");
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("androidx.work.util.id", 0);
        if(sharedPreferences0.contains("next_job_scheduler_id") || sharedPreferences0.contains("next_job_scheduler_id")) {
            int v = sharedPreferences0.getInt("next_job_scheduler_id", 0);
            int v1 = sharedPreferences0.getInt("next_alarm_manager_id", 0);
            supportSQLiteDatabase0.beginTransaction();
            try {
                supportSQLiteDatabase0.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", v});
                supportSQLiteDatabase0.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", v1});
                sharedPreferences0.edit().clear().apply();
                supportSQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                supportSQLiteDatabase0.endTransaction();
            }
        }
    }
}


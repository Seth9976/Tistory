package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;

public abstract class b {
    public static final String a;

    static {
        b.a = "WM-Alarms";
    }

    public static void a(Context context0, WorkGenerationalId workGenerationalId0, int v) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_DELAY_MET");
        CommandHandler.c(intent0, workGenerationalId0);
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, intent0, 0x24000000);
        if(pendingIntent0 != null && alarmManager0 != null) {
            Logger.get().debug("WM-Alarms", "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId0 + ", " + v + ")");
            alarmManager0.cancel(pendingIntent0);
        }
    }

    public static void b(Context context0, WorkDatabase workDatabase0, WorkGenerationalId workGenerationalId0, long v) {
        SystemIdInfoDao systemIdInfoDao0 = workDatabase0.systemIdInfoDao();
        SystemIdInfo systemIdInfo0 = systemIdInfoDao0.getSystemIdInfo(workGenerationalId0);
        Class class0 = SystemAlarmService.class;
        if(systemIdInfo0 == null) {
            int v1 = new IdGenerator(workDatabase0).nextAlarmManagerId();
            systemIdInfoDao0.insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(workGenerationalId0, v1));
            AlarmManager alarmManager1 = (AlarmManager)context0.getSystemService("alarm");
            Intent intent1 = new Intent(context0, class0);
            intent1.setAction("ACTION_DELAY_MET");
            CommandHandler.c(intent1, workGenerationalId0);
            PendingIntent pendingIntent1 = PendingIntent.getService(context0, v1, intent1, 0xC000000);
            if(alarmManager1 != null) {
                a.a(alarmManager1, 0, v, pendingIntent1);
            }
        }
        else {
            b.a(context0, workGenerationalId0, systemIdInfo0.systemId);
            AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
            Intent intent0 = new Intent(context0, class0);
            intent0.setAction("ACTION_DELAY_MET");
            CommandHandler.c(intent0, workGenerationalId0);
            PendingIntent pendingIntent0 = PendingIntent.getService(context0, systemIdInfo0.systemId, intent0, 0xC000000);
            if(alarmManager0 != null) {
                a.a(alarmManager0, 0, v, pendingIntent0);
            }
        }
    }
}


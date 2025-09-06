package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.w0;
import androidx.work.Clock;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import wb.a;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CommandHandler implements ExecutionListener {
    public final Context a;
    public final HashMap b;
    public final Object c;
    public final Clock d;
    public final StartStopTokens e;
    public static final String f;

    static {
        CommandHandler.f = "WM-CommandHandler";
    }

    public CommandHandler(Context context0, Clock clock0, StartStopTokens startStopTokens0) {
        this.a = context0;
        this.d = clock0;
        this.e = startStopTokens0;
        this.b = new HashMap();
        this.c = new Object();
    }

    public final void a(Intent intent0, int v, SystemAlarmDispatcher systemAlarmDispatcher0) {
        List list1;
        String s = intent0.getAction();
        if("ACTION_CONSTRAINTS_CHANGED".equals(s)) {
            Logger.get().debug("WM-CommandHandler", "Handling constraints changed " + intent0);
            d d0 = new d(this.a, this.d, v, systemAlarmDispatcher0);
            List list0 = systemAlarmDispatcher0.e.getWorkDatabase().workSpecDao().getScheduledWork();
            boolean z = false;
            boolean z1 = false;
            boolean z2 = false;
            boolean z3 = false;
            for(Object object0: list0) {
                Constraints constraints0 = ((WorkSpec)object0).constraints;
                z |= constraints0.requiresBatteryNotLow();
                z1 |= constraints0.requiresCharging();
                z2 |= constraints0.requiresStorageNotLow();
                z3 |= constraints0.getRequiredNetworkType() != NetworkType.NOT_REQUIRED;
                if(z && z1 && z2 && z3) {
                    break;
                }
            }
            Context context0 = d0.a;
            context0.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context0, z, z1, z2, z3));
            ArrayList arrayList0 = new ArrayList(list0.size());
            long v1 = d0.b.currentTimeMillis();
            for(Object object1: list0) {
                WorkSpec workSpec0 = (WorkSpec)object1;
                if(v1 >= workSpec0.calculateNextRunTime() && (!workSpec0.hasConstraints() || d0.d.areAllConstraintsMet(workSpec0))) {
                    arrayList0.add(workSpec0);
                }
            }
            for(Object object2: arrayList0) {
                WorkGenerationalId workGenerationalId0 = WorkSpecKt.generationalId(((WorkSpec)object2));
                Intent intent1 = new Intent(context0, SystemAlarmService.class);
                intent1.setAction("ACTION_DELAY_MET");
                CommandHandler.c(intent1, workGenerationalId0);
                Logger.get().debug("WM-ConstraintsCmdHandle", a.d("Creating a delay_met command for workSpec with id (", ((WorkSpec)object2).id, ")"));
                systemAlarmDispatcher0.b.getMainThreadExecutor().execute(new w0(systemAlarmDispatcher0, intent1, d0.c, 1));
            }
            return;
        }
        if("ACTION_RESCHEDULE".equals(s)) {
            Logger.get().debug("WM-CommandHandler", "Handling reschedule " + intent0 + ", " + v);
            systemAlarmDispatcher0.e.rescheduleEligibleWork();
            return;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null && !bundle0.isEmpty() && bundle0.get("KEY_WORKSPEC_ID") != null) {
            if("ACTION_SCHEDULE_WORK".equals(s)) {
                WorkGenerationalId workGenerationalId1 = CommandHandler.b(intent0);
                Logger.get().debug("WM-CommandHandler", "Handling schedule work for " + workGenerationalId1);
                WorkDatabase workDatabase0 = systemAlarmDispatcher0.e.getWorkDatabase();
                workDatabase0.beginTransaction();
                try {
                    if(workDatabase0.workSpecDao().getWorkSpec(workGenerationalId1.getWorkSpecId()) == null) {
                        Logger.get().warning("WM-CommandHandler", "Skipping scheduling " + workGenerationalId1 + " because it\'s no longer in the DB");
                    }
                    else {
                        Logger.get().warning("WM-CommandHandler", "Skipping scheduling " + workGenerationalId1 + "because it is finished.");
                    }
                }
                finally {
                    workDatabase0.endTransaction();
                }
                return;
            }
            if("ACTION_DELAY_MET".equals(s)) {
                synchronized(this.c) {
                    WorkGenerationalId workGenerationalId2 = CommandHandler.b(intent0);
                    Logger.get().debug("WM-CommandHandler", "Handing delay met for " + workGenerationalId2);
                    if(this.b.containsKey(workGenerationalId2)) {
                        Logger.get().debug("WM-CommandHandler", "WorkSpec " + workGenerationalId2 + " is is already being handled for ACTION_DELAY_MET");
                    }
                    else {
                        StartStopToken startStopToken0 = this.e.tokenFor(workGenerationalId2);
                        DelayMetCommandHandler delayMetCommandHandler0 = new DelayMetCommandHandler(this.a, v, systemAlarmDispatcher0, startStopToken0);
                        this.b.put(workGenerationalId2, delayMetCommandHandler0);
                        delayMetCommandHandler0.d();
                    }
                }
                return;
            }
            if("ACTION_STOP_WORK".equals(s)) {
                Bundle bundle1 = intent0.getExtras();
                String s1 = bundle1.getString("KEY_WORKSPEC_ID");
                boolean z4 = bundle1.containsKey("KEY_WORKSPEC_GENERATION");
                StartStopTokens startStopTokens0 = this.e;
                if(z4) {
                    int v4 = bundle1.getInt("KEY_WORKSPEC_GENERATION");
                    list1 = new ArrayList(1);
                    StartStopToken startStopToken1 = startStopTokens0.remove(new WorkGenerationalId(s1, v4));
                    if(startStopToken1 != null) {
                        ((ArrayList)list1).add(startStopToken1);
                    }
                }
                else {
                    list1 = startStopTokens0.remove(s1);
                }
                for(Object object4: list1) {
                    Logger.get().debug("WM-CommandHandler", "Handing stopWork work for " + s1);
                    systemAlarmDispatcher0.j.stopWork(((StartStopToken)object4));
                    WorkGenerationalId workGenerationalId3 = ((StartStopToken)object4).getId();
                    SystemIdInfoDao systemIdInfoDao0 = systemAlarmDispatcher0.e.getWorkDatabase().systemIdInfoDao();
                    SystemIdInfo systemIdInfo0 = systemIdInfoDao0.getSystemIdInfo(workGenerationalId3);
                    if(systemIdInfo0 != null) {
                        b.a(this.a, workGenerationalId3, systemIdInfo0.systemId);
                        Logger.get().debug("WM-Alarms", "Removing SystemIdInfo for workSpecId (" + workGenerationalId3 + ")");
                        systemIdInfoDao0.removeSystemIdInfo(workGenerationalId3);
                    }
                    systemAlarmDispatcher0.onExecuted(((StartStopToken)object4).getId(), false);
                }
                return;
            }
            if("ACTION_EXECUTION_COMPLETED".equals(s)) {
                WorkGenerationalId workGenerationalId4 = CommandHandler.b(intent0);
                boolean z5 = intent0.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                Logger.get().debug("WM-CommandHandler", "Handling onExecutionCompleted " + intent0 + ", " + v);
                this.onExecuted(workGenerationalId4, z5);
                return;
            }
            Logger.get().warning("WM-CommandHandler", "Ignoring intent " + intent0);
            return;
        }
        Logger.get().error("WM-CommandHandler", "Invalid request for " + s + " , requires KEY_WORKSPEC_ID .");
    }

    public static WorkGenerationalId b(Intent intent0) {
        return new WorkGenerationalId(intent0.getStringExtra("KEY_WORKSPEC_ID"), intent0.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent0, WorkGenerationalId workGenerationalId0) {
        intent0.putExtra("KEY_WORKSPEC_ID", workGenerationalId0.getWorkSpecId());
        intent0.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId0.getGeneration());
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        synchronized(this.c) {
            DelayMetCommandHandler delayMetCommandHandler0 = (DelayMetCommandHandler)this.b.remove(workGenerationalId0);
            this.e.remove(workGenerationalId0);
            if(delayMetCommandHandler0 != null) {
                delayMetCommandHandler0.e(z);
            }
        }
    }
}


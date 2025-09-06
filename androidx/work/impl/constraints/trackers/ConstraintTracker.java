package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.activity.m;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\f\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001B\u0010\u000E\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000E\u0010\rJ\u000F\u0010\u000F\u001A\u00028\u0000H&¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u000BH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u000BH&¢\u0006\u0004\b\u0013\u0010\u0012R\u001A\u0010\u0018\u001A\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R$\u0010\u001D\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00028\u00008F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001A\u0010\u0010\"\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "T", "", "Landroid/content/Context;", "context", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)V", "Landroidx/work/impl/constraints/ConstraintListener;", "listener", "", "addListener", "(Landroidx/work/impl/constraints/ConstraintListener;)V", "removeListener", "readSystemState", "()Ljava/lang/Object;", "startTracking", "()V", "stopTracking", "b", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "appContext", "newState", "getState", "setState", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConstraintTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n*L\n96#1:125,2\n*E\n"})
public abstract class ConstraintTracker {
    public final TaskExecutor a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public ConstraintTracker(@NotNull Context context0, @NotNull TaskExecutor taskExecutor0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(taskExecutor0, "taskExecutor");
        super();
        this.a = taskExecutor0;
        Context context1 = context0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context1, "context.applicationContext");
        this.b = context1;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public final void addListener(@NotNull ConstraintListener constraintListener0) {
        Intrinsics.checkNotNullParameter(constraintListener0, "listener");
        synchronized(this.c) {
            if(this.d.add(constraintListener0)) {
                if(this.d.size() == 1) {
                    this.e = this.readSystemState();
                    Logger.get().debug("WM-ConstraintTracker", this.getClass().getSimpleName() + ": initial state = " + this.e);
                    this.startTracking();
                }
                constraintListener0.onConstraintChanged(this.e);
            }
        }
    }

    @NotNull
    public final Context getAppContext() {
        return this.b;
    }

    public final Object getState() {
        return this.e == null ? this.readSystemState() : this.e;
    }

    public abstract Object readSystemState();

    public final void removeListener(@NotNull ConstraintListener constraintListener0) {
        Intrinsics.checkNotNullParameter(constraintListener0, "listener");
        synchronized(this.c) {
            if(this.d.remove(constraintListener0) && this.d.isEmpty()) {
                this.stopTracking();
            }
        }
    }

    public final void setState(Object object0) {
        synchronized(this.c) {
            if(this.e != null && Intrinsics.areEqual(this.e, object0)) {
                return;
            }
            this.e = object0;
            List list0 = CollectionsKt___CollectionsKt.toList(this.d);
            this.a.getMainThreadExecutor().execute(new m(9, list0, this));
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}


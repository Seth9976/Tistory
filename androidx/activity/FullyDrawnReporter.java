package androidx.activity;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\u0005¢\u0006\u0004\b\u000B\u0010\nJ\u001B\u0010\r\u001A\u00020\u00052\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u000F\u001A\u00020\u00052\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000F\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\nR\u0011\u0010\u0012\u001A\u00020\u00118F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "addReporter", "()V", "removeReporter", "callback", "addOnReportDrawnListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnReportDrawnListener", "fullyDrawnReported", "", "isFullyDrawnReported", "()Z", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class FullyDrawnReporter {
    public final Executor a;
    public final Function0 b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final h h;

    public FullyDrawnReporter(@NotNull Executor executor0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(executor0, "executor");
        Intrinsics.checkNotNullParameter(function00, "reportFullyDrawn");
        super();
        this.a = executor0;
        this.b = function00;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new h(this, 2);
    }

    public final void addOnReportDrawnListener(@NotNull Function0 function00) {
        boolean z;
        Intrinsics.checkNotNullParameter(function00, "callback");
        synchronized(this.c) {
            if(this.f) {
                z = true;
            }
            else {
                this.g.add(function00);
                z = false;
            }
        }
        if(z) {
            function00.invoke();
        }
    }

    public final void addReporter() {
        synchronized(this.c) {
            if(!this.f) {
                ++this.d;
            }
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized(this.c) {
            this.f = true;
            for(Object object1: this.g) {
                ((Function0)object1).invoke();
            }
            this.g.clear();
        }
    }

    public final boolean isFullyDrawnReported() {
        synchronized(this.c) {
        }
        return this.f;
    }

    public final void removeOnReportDrawnListener(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "callback");
        synchronized(this.c) {
            this.g.remove(function00);
        }
    }

    public final void removeReporter() {
        synchronized(this.c) {
            if(!this.f) {
                int v1 = this.d;
                if(v1 > 0) {
                    this.d = v1 - 1;
                    if(!this.e && v1 - 1 == 0) {
                        this.e = true;
                        this.a.execute(this.h);
                    }
                }
            }
        }
    }
}


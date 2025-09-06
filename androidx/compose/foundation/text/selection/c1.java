package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.work.Configuration;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function6 {
    public final int w;
    public final Object x;

    public c1(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(6);
    }

    @Override  // kotlin.jvm.functions.Function6
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Context)object0), "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(((Configuration)object1), "<anonymous parameter 1>");
            Intrinsics.checkNotNullParameter(((TaskExecutor)object2), "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(((WorkDatabase)object3), "<anonymous parameter 3>");
            Intrinsics.checkNotNullParameter(((Trackers)object4), "<anonymous parameter 4>");
            Intrinsics.checkNotNullParameter(((Processor)object5), "<anonymous parameter 5>");
            return ArraysKt___ArraysKt.toList(((Scheduler[])this.x));
        }
        long v = SelectionManager.access$convertToContainerCoordinates-R5De75A(((SelectionManager)this.x), ((LayoutCoordinates)object1), ((Offset)object2).unbox-impl());
        long v1 = SelectionManager.access$convertToContainerCoordinates-R5De75A(((SelectionManager)this.x), ((LayoutCoordinates)object1), ((Offset)object3).unbox-impl());
        ((SelectionManager)this.x).setInTouchMode(((Boolean)object0).booleanValue());
        Offset offset0 = Offset.box-impl(v);
        return Boolean.valueOf(((SelectionManager)this.x).updateSelection-qNKwrvQ$foundation_release(offset0, v1, ((Boolean)object4).booleanValue(), ((SelectionAdjustment)object5)));
    }
}


package j;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.platform.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class j implements Function0 {
    public final FullyDrawnReporter a;
    public final Function0 b;
    public final SnapshotStateObserver c;
    public final h d;

    public j(FullyDrawnReporter fullyDrawnReporter0, Function0 function00) {
        this.a = fullyDrawnReporter0;
        this.b = function00;
        SnapshotStateObserver snapshotStateObserver0 = new SnapshotStateObserver(i.w);
        snapshotStateObserver0.start();
        this.c = snapshotStateObserver0;
        h h0 = new h(1, this, j.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0, 4);
        this.d = h0;
        fullyDrawnReporter0.addOnReportDrawnListener(this);
        if(!fullyDrawnReporter0.isFullyDrawnReported()) {
            fullyDrawnReporter0.addReporter();
            BooleanRef ref$BooleanRef0 = new BooleanRef();
            snapshotStateObserver0.observeReads(function00, h0, new j.h(ref$BooleanRef0, function00));
            if(ref$BooleanRef0.element) {
                snapshotStateObserver0.clear(function00);
                if(!fullyDrawnReporter0.isFullyDrawnReported()) {
                    fullyDrawnReporter0.removeReporter();
                }
                snapshotStateObserver0.clear();
                snapshotStateObserver0.stop();
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.c.clear();
        this.c.stop();
        return Unit.INSTANCE;
    }
}


package o2;

import android.view.View;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final ComposeViewAdapter w;

    public c(ComposeViewAdapter composeViewAdapter0) {
        this.w = composeViewAdapter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view0 = this.w.getChildAt(0);
        Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        View view1 = ((ComposeView)view0).getChildAt(0);
        ViewRootForTest viewRootForTest0 = view1 instanceof ViewRootForTest ? ((ViewRootForTest)view1) : null;
        if(viewRootForTest0 != null) {
            viewRootForTest0.invalidateDescendants();
        }
        Snapshot.Companion.sendApplyNotifications();
        return Unit.INSTANCE;
    }
}


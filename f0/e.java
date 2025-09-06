package f0;

import androidx.compose.foundation.pager.DefaultPagerState.Companion;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.functions.Function0;

public final class e extends PagerState {
    public final MutableState K;
    public static final DefaultPagerState.Companion L;
    public static final Saver M;

    static {
        e.L = new DefaultPagerState.Companion(null);
        e.M = ListSaverKt.listSaver(b.w, d.w);
    }

    public e(int v, float f, Function0 function00) {
        super(v, f);
        this.K = SnapshotStateKt.mutableStateOf$default(function00, null, 2, null);
    }

    @Override  // androidx.compose.foundation.pager.PagerState
    public final int getPageCount() {
        return ((Number)((Function0)this.K.getValue()).invoke()).intValue();
    }
}


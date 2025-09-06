package f0;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.pager.PagerIntervalContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

public final class t extends LazyLayoutIntervalContent {
    public final Function4 a;
    public final Function1 b;
    public final MutableIntervalList c;

    public t(int v, Function1 function10, Function4 function40) {
        this.a = function40;
        this.b = function10;
        MutableIntervalList mutableIntervalList0 = new MutableIntervalList();
        mutableIntervalList0.addInterval(v, new PagerIntervalContent(function10, function40));
        this.c = mutableIntervalList0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final IntervalList getIntervals() {
        return this.c;
    }
}


package z;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

public final class v extends Lambda implements Function1 {
    public final ContentInViewNode w;
    public final Job x;
    public final NestedScrollScope y;

    public v(ContentInViewNode contentInViewNode0, Job job0, NestedScrollScope nestedScrollScope0) {
        this.w = contentInViewNode0;
        this.x = job0;
        this.y = nestedScrollScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)object0).floatValue();
        float f1 = this.w.p ? 1.0f : -1.0f;
        ScrollingLogic scrollingLogic0 = this.w.o;
        long v = scrollingLogic0.reverseIfNeeded-MK-Hz9U(scrollingLogic0.toOffset-tuRUvjQ(f1 * f));
        float f2 = scrollingLogic0.toFloat-k-4lQ0M(scrollingLogic0.reverseIfNeeded-MK-Hz9U(this.y.scrollBy-OzD1aCk(v, 1))) * f1;
        if(Math.abs(f2) < Math.abs(f)) {
            JobKt.cancel$default(this.x, "Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + f + ')', null, 2, null);
        }
        return Unit.INSTANCE;
    }
}


package j5;

import android.view.WindowMetrics;
import androidx.window.embedding.SplitRule;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

public final class b implements Predicate {
    public final SplitRule a;

    public b(SplitRule splitRule0) {
        this.a = splitRule0;
    }

    @Override
    public final boolean test(Object object0) {
        Intrinsics.checkNotNullParameter(this.a, "$splitRule");
        Intrinsics.checkNotNullExpressionValue(((WindowMetrics)object0), "windowMetrics");
        return this.a.checkParentMetrics(((WindowMetrics)object0));
    }
}


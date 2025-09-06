package s4;

import androidx.paging.SingleRunner;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

public final class e2 extends CancellationException {
    public final SingleRunner a;

    public e2(SingleRunner singleRunner0) {
        Intrinsics.checkNotNullParameter(singleRunner0, "runner");
        super("Cancelled isolated runner");
        this.a = singleRunner0;
    }
}


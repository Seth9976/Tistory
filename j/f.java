package j;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

public final class f {
    public final boolean a;
    public final Channel b;
    public final Job c;

    public f(CoroutineScope coroutineScope0, boolean z, Function2 function20) {
        this.a = z;
        this.b = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);
        this.c = BuildersKt.launch$default(coroutineScope0, null, null, new e(function20, this, null), 3, null);
    }

    public final void a() {
        CancellationException cancellationException0 = new CancellationException("onBack cancelled");
        this.b.cancel(cancellationException0);
        DefaultImpls.cancel$default(this.c, null, 1, null);
    }
}


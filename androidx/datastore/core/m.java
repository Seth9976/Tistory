package androidx.datastore.core;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

public final class m extends Lambda implements Function1 {
    public final File w;
    public final ProducerScope x;

    public m(File file0, ProducerScope producerScope0) {
        this.w = file0;
        this.x = producerScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(Intrinsics.areEqual(((String)object0), this.w.getName())) {
            ChannelsKt.trySendBlocking(this.x, Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}


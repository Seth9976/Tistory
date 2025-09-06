package s4;

import androidx.paging.SimpleProducerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;

public final class o extends Lambda implements Function1 {
    public final SimpleProducerScope w;

    public o(SimpleProducerScope simpleProducerScope0) {
        this.w = simpleProducerScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        DefaultImpls.close$default(this.w, null, 1, null);
        return Unit.INSTANCE;
    }
}


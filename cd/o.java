package cd;

import com.kakao.sdk.auth.RxAuthApiClient;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMapPublisher;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;

public final class o implements Function {
    public final int a;
    public final Object b;
    public final Object c;

    public o(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        switch(this.a) {
            case 0: {
                return new Timed(object0, ((Scheduler)this.c).now(((TimeUnit)this.b)), ((TimeUnit)this.b));
            }
            case 1: {
                return ((BiFunction)this.b).apply(this.c, object0);
            }
            case 2: {
                return new FlowableMapPublisher(((Publisher)ObjectHelper.requireNonNull(((Function)this.c).apply(object0), "The mapper returned a null Publisher")), new o(1, ((BiFunction)this.b), object0));
            }
            case 3: {
                return Flowable.fromPublisher(((Publisher)ObjectHelper.requireNonNull(((Function)this.b).apply(((Flowable)object0)), "The selector returned a null Publisher"))).observeOn(((Scheduler)this.c));
            }
            default: {
                Intrinsics.checkParameterIsNotNull(((String)object0), "it");
                return RxAuthApiClient.access$getAuthApi$p(((RxAuthApiClient)this.b)).agt(((String)this.c), ((String)object0));
            }
        }
    }
}


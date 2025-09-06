package cd;

import com.kakao.sdk.user.RxUserApiClient;
import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Subscriber;

public final class h implements Action {
    public final int a;
    public final Object b;

    public h(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // io.reactivex.functions.Action
    public final void run() {
        switch(this.a) {
            case 0: {
                ((Future)this.b).get();
                return;
            }
            case 1: {
                ((Consumer)this.b).accept(Notification.createOnComplete());
                return;
            }
            case 2: {
                ((Subscriber)this.b).onComplete();
                return;
            }
            case 3: {
                ((Observer)this.b).onComplete();
                return;
            }
            case 4: {
                Intrinsics.checkExpressionValueIsNotNull(((Function0)this.b).invoke(), "invoke(...)");
                return;
            }
            default: {
                RxUserApiClient.access$getTokenManagerProvider$p(((RxUserApiClient)this.b)).getManager().clear();
            }
        }
    }
}


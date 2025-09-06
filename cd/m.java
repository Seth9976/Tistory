package cd;

import io.reactivex.Notification;
import io.reactivex.functions.Consumer;

public final class m implements Consumer {
    public final int a;
    public final Consumer b;

    public m(Consumer consumer0, int v) {
        this.a = v;
        this.b = consumer0;
        super();
    }

    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) {
        if(this.a != 0) {
            Notification notification0 = Notification.createOnNext(object0);
            this.b.accept(notification0);
            return;
        }
        Notification notification1 = Notification.createOnError(((Throwable)object0));
        this.b.accept(notification1);
    }
}


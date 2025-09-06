package e;

import java.util.concurrent.Callable;
import kotlin.Unit;

public final class k implements Callable {
    public final q a;
    public final p b;

    public k(p p0, q q0) {
        this.b = p0;
        this.a = q0;
        super();
    }

    @Override
    public final Object call() {
        this.b.a.beginTransaction();
        try {
            this.b.b.insert(this.a);
            this.b.a.setTransactionSuccessful();
            return Unit.INSTANCE;
        }
        finally {
            this.b.a.endTransaction();
        }
    }
}


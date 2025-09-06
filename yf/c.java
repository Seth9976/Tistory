package yf;

import androidx.compose.foundation.text.selection.b1;
import java.util.concurrent.CancellationException;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;

public final class c implements BiFunction {
    public final int a;
    public final Object b;

    public c(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        CancellationException cancellationException0 = null;
        if(this.a != 0) {
            if(((Throwable)object1) != null) {
                if(((Throwable)object1) instanceof CancellationException) {
                    cancellationException0 = (CancellationException)(((Throwable)object1));
                }
                if(cancellationException0 == null) {
                    cancellationException0 = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", ((Throwable)object1));
                }
            }
            ((Job)this.b).cancel(cancellationException0);
            return Unit.INSTANCE;
        }
        return ((b1)this.b).invoke(object0, ((Throwable)object1));
    }
}


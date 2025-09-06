package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {
    public Object a;
    public final e b;

    public d(e e0) {
        this.b = e0;
    }

    @Override
    public final boolean hasNext() {
        this.a = this.b.b;
        return !NotificationLite.isComplete(this.b.b);
    }

    @Override
    public final Object next() {
        try {
            if(this.a == null) {
                this.a = this.b.b;
            }
            if(NotificationLite.isComplete(this.a)) {
                throw new NoSuchElementException();
            }
            if(NotificationLite.isError(this.a)) {
                throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.a));
            }
            Object object0 = this.a;
            this.a = null;
            return object0;
        }
        catch(Throwable throwable0) {
        }
        this.a = null;
        throw throwable0;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}


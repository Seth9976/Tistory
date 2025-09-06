package androidx.datastore.preferences.protobuf;

import io.reactivex.internal.operators.flowable.d;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.k;

public final class z2 implements Iterator {
    public final int a;
    public Object b;
    public Object c;

    public z2(ByteString byteString0) {
        this.a = 0;
        super();
        if(byteString0 instanceof b3) {
            ArrayDeque arrayDeque0 = new ArrayDeque(((b3)byteString0).h);
            this.b = arrayDeque0;
            arrayDeque0.push(((b3)byteString0));
            ByteString byteString1;
            for(byteString1 = ((b3)byteString0).e; byteString1 instanceof b3; byteString1 = ((b3)byteString1).e) {
                ((ArrayDeque)this.b).push(((b3)byteString1));
            }
            this.c = (p)byteString1;
            return;
        }
        this.b = null;
        this.c = (p)byteString0;
    }

    public z2(d d0) {
        this.a = 1;
        super();
        this.c = d0;
    }

    public z2(kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString0) {
        this.a = 2;
        super();
        this.b = new Stack();
        while(byteString0 instanceof k) {
            ((Stack)this.b).push(((k)byteString0));
            byteString0 = ((k)byteString0).b;
        }
        this.c = (i)byteString0;
    }

    public p a() {
        p p1;
        p p0 = (p)this.c;
        if(p0 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque0 = (ArrayDeque)this.b;
            if(arrayDeque0 == null || arrayDeque0.isEmpty()) {
                p1 = null;
                this.c = p1;
                return p0;
            }
            ByteString byteString0;
            for(byteString0 = ((b3)arrayDeque0.pop()).f; byteString0 instanceof b3; byteString0 = ((b3)byteString0).e) {
                arrayDeque0.push(((b3)byteString0));
            }
        }
        while(((p)byteString0).isEmpty());
        p1 = (p)byteString0;
        this.c = p1;
        return p0;
    }

    public i b() {
        i i1;
        i i0 = (i)this.c;
        if(i0 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack0 = (Stack)this.b;
            if(stack0.isEmpty()) {
                i1 = null;
                break;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString byteString0;
            for(byteString0 = ((k)stack0.pop()).c; byteString0 instanceof k; byteString0 = ((k)byteString0).b) {
                stack0.push(((k)byteString0));
            }
            i1 = (i)byteString0;
        }
        while(i1.isEmpty());
        this.c = i1;
        return i0;
    }

    @Override
    public final boolean hasNext() {
        switch(this.a) {
            case 0: {
                return ((p)this.c) != null;
            }
            case 1: {
                Object object0 = ((d)this.c).b;
                this.b = object0;
                return !NotificationLite.isComplete(object0);
            }
            default: {
                return ((i)this.c) != null;
            }
        }
    }

    @Override
    public final Object next() {
        switch(this.a) {
            case 0: {
                return this.a();
            }
            case 1: {
                try {
                    if(this.b == null) {
                        this.b = ((d)this.c).b;
                    }
                    if(NotificationLite.isComplete(this.b)) {
                        throw new NoSuchElementException();
                    }
                    if(NotificationLite.isError(this.b)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.b));
                    }
                    Object object0 = this.b;
                    this.b = null;
                    return object0;
                }
                catch(Throwable throwable0) {
                }
                this.b = null;
                throw throwable0;
            }
            default: {
                return this.b();
            }
        }
    }

    @Override
    public final void remove() {
        switch(this.a) {
            case 0: {
                throw new UnsupportedOperationException();
            }
            case 1: {
                throw new UnsupportedOperationException("Read only iterator");
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}


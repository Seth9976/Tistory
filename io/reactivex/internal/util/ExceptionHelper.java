package io.reactivex.internal.util;

import id.a;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class ExceptionHelper {
    public static final Throwable TERMINATED;

    static {
        ExceptionHelper.TERMINATED = new a("No further exceptions");  // 初始化器: Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
    }

    public static boolean addThrowable(AtomicReference atomicReference0, Throwable throwable0) {
        while(true) {
            Throwable throwable1 = (Throwable)atomicReference0.get();
            if(throwable1 == ExceptionHelper.TERMINATED) {
                return false;
            }
            Throwable throwable2 = throwable1 == null ? throwable0 : new CompositeException(new Throwable[]{throwable1, throwable0});
            do {
                if(atomicReference0.compareAndSet(throwable1, throwable2)) {
                    return true;
                }
            }
            while(atomicReference0.get() == throwable1);
        }
    }

    public static List flatten(Throwable throwable0) {
        List list0 = new ArrayList();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.offer(throwable0);
        while(!arrayDeque0.isEmpty()) {
            Throwable throwable1 = (Throwable)arrayDeque0.removeFirst();
            if(throwable1 instanceof CompositeException) {
                List list1 = ((CompositeException)throwable1).getExceptions();
                for(int v = list1.size() - 1; v >= 0; --v) {
                    arrayDeque0.offerFirst(list1.get(v));
                }
            }
            else {
                ((ArrayList)list0).add(throwable1);
            }
        }
        return list0;
    }

    public static Throwable terminate(AtomicReference atomicReference0) {
        Throwable throwable0 = (Throwable)atomicReference0.get();
        return throwable0 == ExceptionHelper.TERMINATED ? throwable0 : ((Throwable)atomicReference0.getAndSet(ExceptionHelper.TERMINATED));
    }

    public static Exception throwIfThrowable(Throwable throwable0) throws Throwable {
        if(!(throwable0 instanceof Exception)) {
            throw throwable0;
        }
        return (Exception)throwable0;
    }

    public static String timeoutMessage(long v, TimeUnit timeUnit0) {
        return "The source did not signal an event for " + v + " " + timeUnit0.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException wrapOrThrow(Throwable throwable0) {
        if(throwable0 instanceof Error) {
            throw (Error)throwable0;
        }
        return throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
    }
}


package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import org.reactivestreams.Subscriber;

public class AppendOnlyLinkedArrayList {
    public interface NonThrowingPredicate extends Predicate {
        @Override  // io.reactivex.functions.Predicate
        boolean test(Object arg1);
    }

    public final int a;
    public final Object[] b;
    public Object[] c;
    public int d;

    public AppendOnlyLinkedArrayList(int v) {
        this.a = v;
        Object[] arr_object = new Object[v + 1];
        this.b = arr_object;
        this.c = arr_object;
    }

    public boolean accept(Observer observer0) {
        for(Object[] arr_object = this.b; true; arr_object = (Object[])arr_object[v1]) {
            if(arr_object == null) {
                break;
            }
            for(int v = 0; true; ++v) {
                int v1 = this.a;
                if(v >= v1) {
                    break;
                }
                Object object0 = arr_object[v];
                if(object0 == null) {
                    break;
                }
                if(NotificationLite.acceptFull(object0, observer0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean accept(Subscriber subscriber0) {
        for(Object[] arr_object = this.b; true; arr_object = (Object[])arr_object[v1]) {
            if(arr_object == null) {
                break;
            }
            for(int v = 0; true; ++v) {
                int v1 = this.a;
                if(v >= v1) {
                    break;
                }
                Object object0 = arr_object[v];
                if(object0 == null) {
                    break;
                }
                if(NotificationLite.acceptFull(object0, subscriber0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void add(Object object0) {
        int v = this.d;
        int v1 = this.a;
        if(v == v1) {
            Object[] arr_object = new Object[v1 + 1];
            this.c[v1] = arr_object;
            this.c = arr_object;
            v = 0;
        }
        this.c[v] = object0;
        this.d = v + 1;
    }

    public void forEachWhile(NonThrowingPredicate appendOnlyLinkedArrayList$NonThrowingPredicate0) {
        for(Object[] arr_object = this.b; arr_object != null; arr_object = (Object[])arr_object[v1]) {
            for(int v = 0; true; ++v) {
                int v1 = this.a;
                if(v >= v1) {
                    break;
                }
                Object object0 = arr_object[v];
                if(object0 == null) {
                    break;
                }
                if(appendOnlyLinkedArrayList$NonThrowingPredicate0.test(object0)) {
                    return;
                }
            }
        }
    }

    public void forEachWhile(Object object0, BiPredicate biPredicate0) throws Exception {
        int v;
        Object[] arr_object;
        for(arr_object = this.b; true; arr_object = (Object[])arr_object[v1]) {
            v = 0;
        label_2:
            int v1 = this.a;
            if(v < v1) {
                break;
            }
        }
        Object object1 = arr_object[v];
        if(object1 == null) {
            return;
        }
        if(!biPredicate0.test(object0, object1)) {
            ++v;
            goto label_2;
        }
    }

    public void setFirst(Object object0) {
        this.b[0] = object0;
    }
}


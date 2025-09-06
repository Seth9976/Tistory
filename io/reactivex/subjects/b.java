package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;

public final class b implements Disposable, NonThrowingPredicate {
    public final Observer a;
    public final BehaviorSubject b;
    public boolean c;
    public boolean d;
    public AppendOnlyLinkedArrayList e;
    public boolean f;
    public volatile boolean g;
    public long h;

    public b(Observer observer0, BehaviorSubject behaviorSubject0) {
        this.a = observer0;
        this.b = behaviorSubject0;
    }

    public final void a(Object object0, long v) {
        if(this.g) {
            return;
        }
        if(!this.f) {
            synchronized(this) {
                if(this.g) {
                    return;
                }
                if(this.h == v) {
                    return;
                }
                if(this.d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.e = appendOnlyLinkedArrayList0;
                    }
                    appendOnlyLinkedArrayList0.add(object0);
                    return;
                }
                this.c = true;
            }
            this.f = true;
        }
        this.test(object0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.g) {
            this.g = true;
            this.b.d(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.g;
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate
    public final boolean test(Object object0) {
        return this.g || NotificationLite.accept(object0, this.a);
    }
}


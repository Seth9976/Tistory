package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ListCompositeDisposable implements Disposable, DisposableContainer {
    public LinkedList a;
    public volatile boolean b;

    public ListCompositeDisposable() {
    }

    public ListCompositeDisposable(Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "resources is null");
        this.a = new LinkedList();
        for(Object object0: iterable0) {
            ObjectHelper.requireNonNull(((Disposable)object0), "Disposable item is null");
            this.a.add(((Disposable)object0));
        }
    }

    public ListCompositeDisposable(Disposable[] arr_disposable) {
        ObjectHelper.requireNonNull(arr_disposable, "resources is null");
        this.a = new LinkedList();
        for(int v = 0; v < arr_disposable.length; ++v) {
            Disposable disposable0 = arr_disposable[v];
            ObjectHelper.requireNonNull(disposable0, "Disposable item is null");
            this.a.add(disposable0);
        }
    }

    public static void a(LinkedList linkedList0) {
        if(linkedList0 == null) {
            return;
        }
        List list0 = null;
        for(Object object0: linkedList0) {
            Disposable disposable0 = (Disposable)object0;
            try {
                disposable0.dispose();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(throwable0);
            }
        }
        if(list0 != null) {
            if(list0.size() != 1) {
                throw new CompositeException(list0);
            }
            throw ExceptionHelper.wrapOrThrow(((Throwable)list0.get(0)));
        }
        return;
    }

    @Override  // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "d is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    LinkedList linkedList0 = this.a;
                    if(linkedList0 == null) {
                        linkedList0 = new LinkedList();
                        this.a = linkedList0;
                    }
                    linkedList0.add(disposable0);
                    return true;
                }
            }
        }
        disposable0.dispose();
        return false;
    }

    public boolean addAll(Disposable[] arr_disposable) {
        ObjectHelper.requireNonNull(arr_disposable, "ds is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    LinkedList linkedList0 = this.a;
                    if(linkedList0 == null) {
                        linkedList0 = new LinkedList();
                        this.a = linkedList0;
                    }
                    for(int v = 0; v < arr_disposable.length; ++v) {
                        Disposable disposable0 = arr_disposable[v];
                        ObjectHelper.requireNonNull(disposable0, "d is null");
                        linkedList0.add(disposable0);
                    }
                    return true;
                }
            }
        }
        for(int v2 = 0; v2 < arr_disposable.length; ++v2) {
            arr_disposable[v2].dispose();
        }
        return false;
    }

    public void clear() {
        LinkedList linkedList0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            linkedList0 = this.a;
            this.a = null;
        }
        ListCompositeDisposable.a(linkedList0);
    }

    @Override  // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "Disposable item is null");
        if(this.b) {
            return false;
        }
        synchronized(this) {
            return this.b ? false : this.a != null && this.a.remove(disposable0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        LinkedList linkedList0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            this.b = true;
            linkedList0 = this.a;
            this.a = null;
        }
        ListCompositeDisposable.a(linkedList0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b;
    }

    @Override  // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(Disposable disposable0) {
        if(this.delete(disposable0)) {
            disposable0.dispose();
            return true;
        }
        return false;
    }
}


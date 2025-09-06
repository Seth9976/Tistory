package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDisposable implements Disposable, DisposableContainer {
    public OpenHashSet a;
    public volatile boolean b;

    public CompositeDisposable() {
    }

    public CompositeDisposable(@NonNull Iterable iterable0) {
        ObjectHelper.requireNonNull(iterable0, "disposables is null");
        this.a = new OpenHashSet();
        for(Object object0: iterable0) {
            ObjectHelper.requireNonNull(((Disposable)object0), "A Disposable item in the disposables sequence is null");
            this.a.add(((Disposable)object0));
        }
    }

    public CompositeDisposable(@NonNull Disposable[] arr_disposable) {
        ObjectHelper.requireNonNull(arr_disposable, "disposables is null");
        this.a = new OpenHashSet(arr_disposable.length + 1);
        for(int v = 0; v < arr_disposable.length; ++v) {
            Disposable disposable0 = arr_disposable[v];
            ObjectHelper.requireNonNull(disposable0, "A Disposable in the disposables array is null");
            this.a.add(disposable0);
        }
    }

    public static void a(OpenHashSet openHashSet0) {
        if(openHashSet0 == null) {
            return;
        }
        Object[] arr_object = openHashSet0.keys();
        List list0 = null;
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 instanceof Disposable) {
                try {
                    ((Disposable)object0).dispose();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    if(list0 == null) {
                        list0 = new ArrayList();
                    }
                    list0.add(throwable0);
                }
            }
        }
        if(list0 != null) {
            if(list0.size() == 1) {
                throw ExceptionHelper.wrapOrThrow(((Throwable)list0.get(0)));
            }
            throw new CompositeException(list0);
        }
        return;
    }

    @Override  // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(@NonNull Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "disposable is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    OpenHashSet openHashSet0 = this.a;
                    if(openHashSet0 == null) {
                        openHashSet0 = new OpenHashSet();
                        this.a = openHashSet0;
                    }
                    openHashSet0.add(disposable0);
                    return true;
                }
            }
        }
        disposable0.dispose();
        return false;
    }

    public boolean addAll(@NonNull Disposable[] arr_disposable) {
        ObjectHelper.requireNonNull(arr_disposable, "disposables is null");
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    OpenHashSet openHashSet0 = this.a;
                    if(openHashSet0 == null) {
                        openHashSet0 = new OpenHashSet(arr_disposable.length + 1);
                        this.a = openHashSet0;
                    }
                    for(int v = 0; v < arr_disposable.length; ++v) {
                        Disposable disposable0 = arr_disposable[v];
                        ObjectHelper.requireNonNull(disposable0, "A Disposable in the disposables array is null");
                        openHashSet0.add(disposable0);
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
        OpenHashSet openHashSet0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            openHashSet0 = this.a;
            this.a = null;
        }
        CompositeDisposable.a(openHashSet0);
    }

    @Override  // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(@NonNull Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "disposables is null");
        if(this.b) {
            return false;
        }
        synchronized(this) {
            return this.b ? false : this.a != null && this.a.remove(disposable0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        OpenHashSet openHashSet0;
        if(this.b) {
            return;
        }
        synchronized(this) {
            if(this.b) {
                return;
            }
            this.b = true;
            openHashSet0 = this.a;
            this.a = null;
        }
        CompositeDisposable.a(openHashSet0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b;
    }

    @Override  // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(@NonNull Disposable disposable0) {
        if(this.delete(disposable0)) {
            disposable0.dispose();
            return true;
        }
        return false;
    }

    public int size() {
        int v = 0;
        if(this.b) {
            return 0;
        }
        synchronized(this) {
            if(this.b) {
                return 0;
            }
            OpenHashSet openHashSet0 = this.a;
            if(openHashSet0 != null) {
                v = openHashSet0.size();
            }
            return v;
        }
    }
}


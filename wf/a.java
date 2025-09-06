package wf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt;
import kotlinx.coroutines.debug.internal.HashedWeakRef;

public final class a implements Iterator, KMutableIterator {
    public final Lambda a;
    public int b;
    public Object c;
    public Object d;
    public final b e;

    public a(b b0, Function2 function20) {
        this.e = b0;
        this.a = (Lambda)function20;
        this.b = -1;
        this.a();
    }

    public final void a() {
        Object object1;
        Object object0;
        b b0;
    alab1:
        while(true) {
            do {
                do {
                    int v = this.b + 1;
                    this.b = v;
                    b0 = this.e;
                    if(v >= b0.a) {
                        break alab1;
                    }
                    HashedWeakRef hashedWeakRef0 = (HashedWeakRef)b0.d.get(v);
                    if(hashedWeakRef0 == null) {
                        continue alab1;
                    }
                    object0 = hashedWeakRef0.get();
                }
                while(object0 == null);
                this.c = object0;
                object1 = b0.e.get(this.b);
                if(object1 instanceof k) {
                    object1 = ((k)object1).a;
                }
            }
            while(object1 == null);
            this.d = object1;
            return;
        }
    }

    @Override
    public final boolean hasNext() {
        return this.b < this.e.a;
    }

    @Override
    public final Object next() {
        if(this.b >= this.e.a) {
            throw new NoSuchElementException();
        }
        Unit unit0 = this.c;
        if(unit0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("key");
            unit0 = Unit.INSTANCE;
        }
        Unit unit1 = this.d;
        if(unit1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("value");
            unit1 = Unit.INSTANCE;
        }
        Object object0 = ((Function2)this.a).invoke(unit0, unit1);
        this.a();
        return object0;
    }

    @Override
    public final void remove() {
        ConcurrentWeakMapKt.access$noImpl();
        throw new KotlinNothingValueException();
    }
}


package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

public class a implements Iterator, KMappedMarker {
    public final int a;
    public int b;
    public final Object c;

    public a(AbstractList abstractList0) {
        this.a = 0;
        super();
        this.c = abstractList0;
    }

    public a(byte[] arr_b) {
        this.a = 2;
        Intrinsics.checkNotNullParameter(arr_b, "array");
        super();
        this.c = arr_b;
    }

    public a(int[] arr_v) {
        this.a = 3;
        Intrinsics.checkNotNullParameter(arr_v, "array");
        super();
        this.c = arr_v;
    }

    public a(long[] arr_v) {
        this.a = 4;
        Intrinsics.checkNotNullParameter(arr_v, "array");
        super();
        this.c = arr_v;
    }

    public a(Object[] arr_object) {
        this.a = 1;
        Intrinsics.checkNotNullParameter(arr_object, "array");
        super();
        this.c = arr_object;
    }

    public a(short[] arr_v) {
        this.a = 5;
        Intrinsics.checkNotNullParameter(arr_v, "array");
        super();
        this.c = arr_v;
    }

    @Override
    public final boolean hasNext() {
        switch(this.a) {
            case 0: {
                return this.b < ((AbstractList)this.c).size();
            }
            case 1: {
                return this.b < ((Object[])this.c).length;
            }
            case 2: {
                return this.b < ((byte[])this.c).length;
            }
            case 3: {
                return this.b < ((int[])this.c).length;
            }
            case 4: {
                return this.b < ((long[])this.c).length;
            }
            default: {
                return this.b < ((short[])this.c).length;
            }
        }
    }

    @Override
    public final Object next() {
        switch(this.a) {
            case 0: {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                int v1 = this.b;
                this.b = v1 + 1;
                return ((AbstractList)this.c).get(v1);
            }
            case 1: {
                try {
                    int v2 = this.b;
                    this.b = v2 + 1;
                    return ((Object[])this.c)[v2];
                }
                catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                    --this.b;
                    throw new NoSuchElementException(arrayIndexOutOfBoundsException0.getMessage());
                }
            }
            case 2: {
                int v3 = this.b;
                byte[] arr_b = (byte[])this.c;
                if(v3 >= arr_b.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = v3 + 1;
                return UByte.box-impl(UByte.constructor-impl(arr_b[v3]));
            }
            case 3: {
                int v4 = this.b;
                int[] arr_v1 = (int[])this.c;
                if(v4 >= arr_v1.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = v4 + 1;
                return UInt.box-impl(UInt.constructor-impl(arr_v1[v4]));
            }
            case 4: {
                int v5 = this.b;
                long[] arr_v2 = (long[])this.c;
                if(v5 >= arr_v2.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = v5 + 1;
                return ULong.box-impl(ULong.constructor-impl(arr_v2[v5]));
            }
            default: {
                int v = this.b;
                short[] arr_v = (short[])this.c;
                if(v >= arr_v.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = v + 1;
                return UShort.box-impl(UShort.constructor-impl(arr_v[v]));
            }
        }
    }

    @Override
    public final void remove() {
        switch(this.a) {
            case 0: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 1: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 2: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 3: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 4: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }
    }
}


package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@DoNotMock("Use ImmutableList.of or another implementation")
@NullMarked
public abstract class zzac extends AbstractCollection implements Serializable {
    public static final Object[] a;

    static {
        zzac.a = new Object[0];
    }

    public void a(Object[] arr_object) {
        throw null;
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    public int b() {
        throw null;
    }

    public int c() {
        throw null;
    }

    @Override
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean d();

    public Object[] e() {
        throw null;
    }

    @Override
    public Iterator iterator() {
        return this.zze();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(zzac.a);
    }

    @Override
    @CanIgnoreReturnValue
    public final Object[] toArray(Object[] arr_object) {
        arr_object.getClass();
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.e();
            if(arr_object1 == null) {
                arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
                this.a(arr_object);
                return arr_object;
            }
            return Arrays.copyOfRange(arr_object1, this.c(), this.b(), arr_object.getClass());
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.a(arr_object);
        return arr_object;
    }

    public zzag zzd() {
        throw null;
    }

    public abstract zzaj zze();
}


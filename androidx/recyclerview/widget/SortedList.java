package androidx.recyclerview.widget;

import a5.b;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortedList {
    public static class BatchedCallback extends Callback {
        public final Callback a;
        public final BatchingListUpdateCallback b;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback sortedList$Callback0) {
            this.a = sortedList$Callback0;
            this.b = new BatchingListUpdateCallback(sortedList$Callback0);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public boolean areContentsTheSame(Object object0, Object object1) {
            return this.a.areContentsTheSame(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public boolean areItemsTheSame(Object object0, Object object1) {
            return this.a.areItemsTheSame(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public int compare(Object object0, Object object1) {
            return this.a.compare(object0, object1);
        }

        public void dispatchLastEvent() {
            this.b.dispatchLastEvent();
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        @Nullable
        public Object getChangePayload(Object object0, Object object1) {
            return this.a.getChangePayload(object0, object1);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        public void onChanged(int v, int v1) {
            this.b.onChanged(v, v1, null);
        }

        @Override  // androidx.recyclerview.widget.SortedList$Callback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int v, int v1, Object object0) {
            this.b.onChanged(v, v1, object0);
        }

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int v, int v1) {
            this.b.onInserted(v, v1);
        }

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int v, int v1) {
            this.b.onMoved(v, v1);
        }

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int v, int v1) {
            this.b.onRemoved(v, v1);
        }
    }

    public static abstract class Callback implements ListUpdateCallback, Comparator {
        public abstract boolean areContentsTheSame(Object arg1, Object arg2);

        public abstract boolean areItemsTheSame(Object arg1, Object arg2);

        @Override
        public abstract int compare(Object arg1, Object arg2);

        @Nullable
        public Object getChangePayload(Object object0, Object object1) {
            return null;
        }

        public abstract void onChanged(int arg1, int arg2);

        @Override  // androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int v, int v1, Object object0) {
            this.onChanged(v, v1);
        }
    }

    public static final int INVALID_POSITION = -1;
    public Object[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public Callback f;
    public BatchedCallback g;
    public int h;
    public final Class i;

    public SortedList(@NonNull Class class0, @NonNull Callback sortedList$Callback0) {
        this(class0, sortedList$Callback0, 10);
    }

    public SortedList(@NonNull Class class0, @NonNull Callback sortedList$Callback0, int v) {
        this.i = class0;
        this.a = (Object[])Array.newInstance(class0, v);
        this.f = sortedList$Callback0;
        this.h = 0;
    }

    public final int a(Object object0, boolean z) {
        int v = this.c(this.a, 0, this.h, 1, object0);
        if(v == -1) {
            v = 0;
        }
        else if(v < this.h) {
            Object object1 = this.a[v];
            if(this.f.areItemsTheSame(object1, object0)) {
                if(this.f.areContentsTheSame(object1, object0)) {
                    this.a[v] = object0;
                    return v;
                }
                this.a[v] = object0;
                this.f.onChanged(v, 1, this.f.getChangePayload(object1, object0));
                return v;
            }
        }
        int v1 = this.h;
        if(v <= v1) {
            Object[] arr_object = this.a;
            if(v1 == arr_object.length) {
                Object[] arr_object1 = (Object[])Array.newInstance(this.i, arr_object.length + 10);
                System.arraycopy(this.a, 0, arr_object1, 0, v);
                arr_object1[v] = object0;
                System.arraycopy(this.a, v, arr_object1, v + 1, this.h - v);
                this.a = arr_object1;
            }
            else {
                System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                this.a[v] = object0;
            }
            ++this.h;
            if(z) {
                this.f.onInserted(v, 1);
            }
            return v;
        }
        StringBuilder stringBuilder0 = b.s(v, "cannot add item to ", " because size is ");
        stringBuilder0.append(this.h);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public int add(Object object0) {
        this.g();
        return this.a(object0, true);
    }

    public void addAll(@NonNull Collection collection0) {
        this.addAll(collection0.toArray(((Object[])Array.newInstance(this.i, collection0.size()))), true);
    }

    public void addAll(@NonNull Object[] arr_object) {
        this.addAll(arr_object, false);
    }

    public void addAll(@NonNull Object[] arr_object, boolean z) {
        this.g();
        if(arr_object.length == 0) {
            return;
        }
        if(z) {
            this.b(arr_object);
            return;
        }
        Object[] arr_object1 = (Object[])Array.newInstance(this.i, arr_object.length);
        System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length);
        this.b(arr_object1);
    }

    public final void b(Object[] arr_object) {
        if(arr_object.length < 1) {
            return;
        }
        int v = this.f(arr_object);
        int v1 = 0;
        if(this.h == 0) {
            this.a = arr_object;
            this.h = v;
            this.f.onInserted(0, v);
            return;
        }
        boolean z = this.f instanceof BatchedCallback;
        if(!z) {
            this.beginBatchedUpdates();
        }
        this.b = this.a;
        this.c = 0;
        this.d = this.h;
        this.a = (Object[])Array.newInstance(this.i, this.h + v + 10);
        this.e = 0;
        while(true) {
            int v2 = this.c;
            int v3 = this.d;
            if(v2 >= v3 && v1 >= v) {
                break;
            }
            if(v2 == v3) {
                int v4 = v - v1;
                System.arraycopy(arr_object, v1, this.a, this.e, v4);
                int v5 = this.e + v4;
                this.e = v5;
                this.h += v4;
                this.f.onInserted(v5 - v4, v4);
                break;
            }
            if(v1 == v) {
                int v6 = v3 - v2;
                System.arraycopy(this.b, v2, this.a, this.e, v6);
                this.e += v6;
                break;
            }
            Object object0 = this.b[v2];
            Object object1 = arr_object[v1];
            int v7 = this.f.compare(object0, object1);
            if(v7 > 0) {
                int v8 = this.e;
                this.e = v8 + 1;
                this.a[v8] = object1;
                ++this.h;
                ++v1;
                this.f.onInserted(v8, 1);
            }
            else if(v7 == 0 && this.f.areItemsTheSame(object0, object1)) {
                int v9 = this.e;
                this.e = v9 + 1;
                this.a[v9] = object1;
                ++v1;
                ++this.c;
                if(this.f.areContentsTheSame(object0, object1)) {
                    continue;
                }
                this.f.onChanged(this.e - 1, 1, this.f.getChangePayload(object0, object1));
            }
            else {
                int v10 = this.e;
                this.e = v10 + 1;
                this.a[v10] = object0;
                ++this.c;
            }
        }
        this.b = null;
        if(!z) {
            this.endBatchedUpdates();
        }
    }

    public void beginBatchedUpdates() {
        this.g();
        Callback sortedList$Callback0 = this.f;
        if(sortedList$Callback0 instanceof BatchedCallback) {
            return;
        }
        if(this.g == null) {
            this.g = new BatchedCallback(sortedList$Callback0);
        }
        this.f = this.g;
    }

    public final int c(Object[] arr_object, int v, int v1, int v2, Object object0) {
        while(v < v1) {
            int v3 = (v + v1) / 2;
            Object object1 = arr_object[v3];
            int v4 = this.f.compare(object1, object0);
            if(v4 < 0) {
                v = v3 + 1;
            }
            else {
                if(v4 == 0) {
                    if(this.f.areItemsTheSame(object1, object0)) {
                        return v3;
                    }
                    int v5 = v3 - 1;
                alab1:
                    while(true) {
                        if(v5 >= v) {
                            Object object2 = this.a[v5];
                            if(this.f.compare(object2, object0) == 0) {
                                if(this.f.areItemsTheSame(object2, object0)) {
                                    break;
                                }
                                --v5;
                                continue;
                            }
                        }
                        for(v5 = v3 + 1; v5 < v1; ++v5) {
                            Object object3 = this.a[v5];
                            if(this.f.compare(object3, object0) != 0) {
                                break;
                            }
                            if(this.f.areItemsTheSame(object3, object0)) {
                                break alab1;
                            }
                        }
                        v5 = -1;
                        break;
                    }
                    return v2 == 1 && v5 == -1 ? v3 : v5;
                }
                v1 = v3;
            }
        }
        return v2 == 1 ? v : -1;
    }

    public void clear() {
        this.g();
        int v = this.h;
        if(v == 0) {
            return;
        }
        Arrays.fill(this.a, 0, v, null);
        this.h = 0;
        this.f.onRemoved(0, v);
    }

    public final void d(int v, boolean z) {
        System.arraycopy(this.a, v + 1, this.a, v, this.h - v - 1);
        int v1 = this.h - 1;
        this.h = v1;
        this.a[v1] = null;
        if(z) {
            this.f.onRemoved(v, 1);
        }
    }

    public final void e(Object[] arr_object) {
        boolean z = this.f instanceof BatchedCallback;
        if(!z) {
            this.beginBatchedUpdates();
        }
        this.c = 0;
        this.d = this.h;
        this.b = this.a;
        this.e = 0;
        int v = this.f(arr_object);
        this.a = (Object[])Array.newInstance(this.i, v);
        while(true) {
            int v1 = this.e;
            if(v1 >= v && this.c >= this.d) {
                break;
            }
            int v2 = this.c;
            int v3 = this.d;
            if(v2 >= v3) {
                int v4 = v - v1;
                System.arraycopy(arr_object, v1, this.a, v1, v4);
                this.e += v4;
                this.h += v4;
                this.f.onInserted(v1, v4);
                break;
            }
            if(v1 >= v) {
                int v5 = v3 - v2;
                this.h -= v5;
                this.f.onRemoved(v1, v5);
                break;
            }
            Object object0 = this.b[v2];
            Object object1 = arr_object[v1];
            int v6 = this.f.compare(object0, object1);
            if(v6 < 0) {
                --this.h;
                ++this.c;
                this.f.onRemoved(this.e, 1);
            }
            else if(v6 > 0) {
                int v7 = this.e;
                this.a[v7] = object1;
                this.e = v7 + 1;
                ++this.h;
                this.f.onInserted(v7, 1);
            }
            else if(this.f.areItemsTheSame(object0, object1)) {
                int v9 = this.e;
                this.a[v9] = object1;
                ++this.c;
                this.e = v9 + 1;
                if(!this.f.areContentsTheSame(object0, object1)) {
                    this.f.onChanged(this.e - 1, 1, this.f.getChangePayload(object0, object1));
                }
            }
            else {
                --this.h;
                ++this.c;
                this.f.onRemoved(this.e, 1);
                int v8 = this.e;
                this.a[v8] = object1;
                this.e = v8 + 1;
                ++this.h;
                this.f.onInserted(v8, 1);
            }
        }
        this.b = null;
        if(!z) {
            this.endBatchedUpdates();
        }
    }

    public void endBatchedUpdates() {
        this.g();
        Callback sortedList$Callback0 = this.f;
        if(sortedList$Callback0 instanceof BatchedCallback) {
            ((BatchedCallback)sortedList$Callback0).dispatchLastEvent();
        }
        BatchedCallback sortedList$BatchedCallback0 = this.g;
        if(this.f == sortedList$BatchedCallback0) {
            this.f = sortedList$BatchedCallback0.a;
        }
    }

    public final int f(Object[] arr_object) {
        if(arr_object.length == 0) {
            return 0;
        }
        Arrays.sort(arr_object, this.f);
        int v = 1;
        int v1 = 0;
        int v2 = 1;
        while(v < arr_object.length) {
            Object object0 = arr_object[v];
            if(this.f.compare(arr_object[v1], object0) == 0) {
                int v3 = v1;
                while(true) {
                    if(v3 < v2) {
                        if(this.f.areItemsTheSame(arr_object[v3], object0)) {
                            break;
                        }
                        else {
                            ++v3;
                            continue;
                        }
                    }
                    v3 = -1;
                    break;
                }
                if(v3 == -1) {
                    if(v2 != v) {
                        arr_object[v2] = object0;
                    }
                    ++v2;
                }
                else {
                    arr_object[v3] = object0;
                }
            }
            else {
                if(v2 != v) {
                    arr_object[v2] = object0;
                }
                v1 = v2;
                ++v2;
            }
            ++v;
        }
        return v2;
    }

    public final void g() {
        if(this.b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public Object get(int v) throws IndexOutOfBoundsException {
        if(v < this.h && v >= 0) {
            Object[] arr_object = this.b;
            if(arr_object != null) {
                return v < this.e ? this.a[v] : arr_object[v - this.e + this.c];
            }
            return this.a[v];
        }
        StringBuilder stringBuilder0 = b.s(v, "Asked to get item at ", " but size is ");
        stringBuilder0.append(this.h);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public int indexOf(Object object0) {
        if(this.b != null) {
            int v = this.c(this.a, 0, this.e, 4, object0);
            if(v != -1) {
                return v;
            }
            int v1 = this.c(this.b, this.c, this.d, 4, object0);
            return v1 == -1 ? -1 : v1 - this.c + this.e;
        }
        return this.c(this.a, 0, this.h, 4, object0);
    }

    public void recalculatePositionOfItemAt(int v) {
        this.g();
        Object object0 = this.get(v);
        this.d(v, false);
        int v1 = this.a(object0, false);
        if(v != v1) {
            this.f.onMoved(v, v1);
        }
    }

    public boolean remove(Object object0) {
        this.g();
        int v = this.c(this.a, 0, this.h, 2, object0);
        if(v == -1) {
            return false;
        }
        this.d(v, true);
        return true;
    }

    public Object removeItemAt(int v) {
        this.g();
        Object object0 = this.get(v);
        this.d(v, true);
        return object0;
    }

    public void replaceAll(@NonNull Collection collection0) {
        this.replaceAll(collection0.toArray(((Object[])Array.newInstance(this.i, collection0.size()))), true);
    }

    public void replaceAll(@NonNull Object[] arr_object) {
        this.replaceAll(arr_object, false);
    }

    public void replaceAll(@NonNull Object[] arr_object, boolean z) {
        this.g();
        if(z) {
            this.e(arr_object);
            return;
        }
        Object[] arr_object1 = (Object[])Array.newInstance(this.i, arr_object.length);
        System.arraycopy(arr_object, 0, arr_object1, 0, arr_object.length);
        this.e(arr_object1);
    }

    public int size() {
        return this.h;
    }

    public void updateItemAt(int v, Object object0) {
        this.g();
        Object object1 = this.get(v);
        boolean z = object1 == object0 || !this.f.areContentsTheSame(object1, object0);
        if(object1 != object0 && this.f.compare(object1, object0) == 0) {
            this.a[v] = object0;
            if(z) {
                this.f.onChanged(v, 1, this.f.getChangePayload(object1, object0));
            }
            return;
        }
        if(z) {
            this.f.onChanged(v, 1, this.f.getChangePayload(object1, object0));
        }
        this.d(v, false);
        int v1 = this.a(object0, false);
        if(v != v1) {
            this.f.onMoved(v, v1);
        }
    }
}


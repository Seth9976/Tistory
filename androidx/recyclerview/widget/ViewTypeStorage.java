package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.List;

interface ViewTypeStorage {
    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        public final SparseArray a;
        public int b;

        public IsolatedViewTypeStorage() {
            this.a = new SparseArray();
            this.b = 0;
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull a1 a10) {
            return new k2(this, a10);
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public a1 getWrapperForGlobalType(int v) {
            a1 a10 = (a1)this.a.get(v);
            if(a10 == null) {
                throw new IllegalArgumentException("Cannot find the wrapper for global view type " + v);
            }
            return a10;
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        public final SparseArray a;

        public SharedIdRangeViewTypeStorage() {
            this.a = new SparseArray();
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull a1 a10) {
            return new l2(this, a10);
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public a1 getWrapperForGlobalType(int v) {
            List list0 = (List)this.a.get(v);
            if(list0 == null || list0.isEmpty()) {
                throw new IllegalArgumentException("Cannot find the wrapper for global view type " + v);
            }
            return (a1)list0.get(0);
        }
    }

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int arg1);

        int localToGlobal(int arg1);
    }

    @NonNull
    ViewTypeLookup createViewTypeWrapper(@NonNull a1 arg1);

    @NonNull
    a1 getWrapperForGlobalType(int arg1);
}


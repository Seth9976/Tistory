package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

interface StableIdStorage {
    public static class IsolatedStableIdStorage implements StableIdStorage {
        public long a;

        public IsolatedStableIdStorage() {
            this.a = 0L;
        }

        @Override  // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return new y1(this);
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {
        public final z1 a;

        public NoStableIdStorage() {
            this.a = new z1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.a;
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {
        public final a2 a;

        public SharedPoolStableIdStorage() {
            this.a = new a2();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.a;
        }
    }

    public interface StableIdLookup {
        long localToGlobal(long arg1);
    }

    @NonNull
    StableIdLookup createStableIdLookup();
}


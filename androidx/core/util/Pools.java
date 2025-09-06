package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/core/util/Pools;", "", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Pools {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u000F\u0010\u0003\u001A\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00028\u0000H&¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "T", "", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Pool {
        @Nullable
        Object acquire();

        boolean release(@NotNull Object arg1);
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "", "T", "Landroidx/core/util/Pools$Pool;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class SimplePool implements Pool {
        public final Object[] a;
        public int b;

        public SimplePool(@IntRange(from = 1L) int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.a = new Object[v];
        }

        @Override  // androidx.core.util.Pools$Pool
        @Nullable
        public Object acquire() {
            int v = this.b;
            if(v > 0) {
                Object object0 = this.a[v - 1];
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                this.a[v - 1] = null;
                --this.b;
                return object0;
            }
            return null;
        }

        @Override  // androidx.core.util.Pools$Pool
        public boolean release(@NotNull Object object0) {
            Object[] arr_object;
            Intrinsics.checkNotNullParameter(object0, "instance");
            int v = this.b;
            for(int v1 = 0; true; ++v1) {
                boolean z = false;
                arr_object = this.a;
                if(v1 >= v) {
                    break;
                }
                if(arr_object[v1] == object0) {
                    z = true;
                    break;
                }
            }
            if(z) {
                throw new IllegalStateException("Already in the pool!");
            }
            int v2 = this.b;
            if(v2 < arr_object.length) {
                arr_object[v2] = object0;
                this.b = v2 + 1;
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "", "T", "Landroidx/core/util/Pools$SimplePool;", "", "maxPoolSize", "<init>", "(I)V", "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class SynchronizedPool extends SimplePool {
        public final Object c;

        public SynchronizedPool(int v) {
            super(v);
            this.c = new Object();
        }

        @Override  // androidx.core.util.Pools$SimplePool
        @Nullable
        public Object acquire() {
            synchronized(this.c) {
                return super.acquire();
            }
        }

        @Override  // androidx.core.util.Pools$SimplePool
        public boolean release(@NotNull Object object0) {
            Intrinsics.checkNotNullParameter(object0, "instance");
            synchronized(this.c) {
                return super.release(object0);
            }
        }
    }

}


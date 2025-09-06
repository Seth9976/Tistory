package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\u0007J2\u0010\u0010\u001A\u0004\u0018\u00018\u00002!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u0015\u001A\u0004\u0018\u00018\u00002\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000E0\nH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00028\u00002\u0014\u0010\u0019\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000E0\nH\u0086\b¢\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00028\u0000¢\u0006\u0004\b\u001C\u0010\u001DJ\u0011\u0010\u001E\u001A\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001E\u0010\u0013J\u0017\u0010!\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u001FH\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00028\u0000H\u0001¢\u0006\u0004\b#\u0010\u0018R$\u0010(\u001A\u00020\u001F2\u0006\u0010\r\u001A\u00020\u001F8F@BX\u0086\u000E¢\u0006\f\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0011\u0010)\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b)\u0010*R\u000B\u0010,\u001A\u00020+8\u0002X\u0082\u0004¨\u0006-"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "clear", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "", "predicate", "find", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "node", "addLast", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "getSize", "()I", "setSize", "(I)V", "size", "isEmpty", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
@InternalCoroutinesApi
public class ThreadSafeHeap {
    @Volatile
    private volatile int _size;
    public ThreadSafeHeapNode[] a;
    public static final AtomicIntegerFieldUpdater b;

    static {
        ThreadSafeHeap.b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");
    }

    public final void a(int v) {
        while(true) {
            if(v <= 0) {
                return;
            }
            ThreadSafeHeapNode[] arr_threadSafeHeapNode = this.a;
            Intrinsics.checkNotNull(arr_threadSafeHeapNode);
            int v1 = (v - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode0 = arr_threadSafeHeapNode[v1];
            Intrinsics.checkNotNull(threadSafeHeapNode0);
            ThreadSafeHeapNode threadSafeHeapNode1 = arr_threadSafeHeapNode[v];
            Intrinsics.checkNotNull(threadSafeHeapNode1);
            if(((Comparable)threadSafeHeapNode0).compareTo(threadSafeHeapNode1) <= 0) {
                return;
            }
            this.b(v, v1);
            v = v1;
        }
    }

    @PublishedApi
    public final void addImpl(@NotNull ThreadSafeHeapNode threadSafeHeapNode0) {
        threadSafeHeapNode0.setHeap(this);
        ThreadSafeHeapNode[] arr_threadSafeHeapNode = this.a;
        if(arr_threadSafeHeapNode == null) {
            arr_threadSafeHeapNode = new ThreadSafeHeapNode[4];
            this.a = arr_threadSafeHeapNode;
        }
        else if(this.getSize() >= arr_threadSafeHeapNode.length) {
            Object[] arr_object = Arrays.copyOf(arr_threadSafeHeapNode, this.getSize() * 2);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            arr_threadSafeHeapNode = (ThreadSafeHeapNode[])arr_object;
            this.a = arr_threadSafeHeapNode;
        }
        int v = this.getSize();
        ThreadSafeHeap.b.set(this, v + 1);
        arr_threadSafeHeapNode[v] = threadSafeHeapNode0;
        threadSafeHeapNode0.setIndex(v);
        this.a(v);
    }

    public final void addLast(@NotNull ThreadSafeHeapNode threadSafeHeapNode0) {
        synchronized(this) {
            this.addImpl(threadSafeHeapNode0);
        }
    }

    public final boolean addLastIf(@NotNull ThreadSafeHeapNode threadSafeHeapNode0, @NotNull Function1 function10) {
        boolean z;
        synchronized(this) {
            if(((Boolean)function10.invoke(this.firstImpl())).booleanValue()) {
                this.addImpl(threadSafeHeapNode0);
                z = true;
            }
            else {
                z = false;
            }
            return z;
        }
    }

    public final void b(int v, int v1) {
        ThreadSafeHeapNode[] arr_threadSafeHeapNode = this.a;
        Intrinsics.checkNotNull(arr_threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode0 = arr_threadSafeHeapNode[v1];
        Intrinsics.checkNotNull(threadSafeHeapNode0);
        ThreadSafeHeapNode threadSafeHeapNode1 = arr_threadSafeHeapNode[v];
        Intrinsics.checkNotNull(threadSafeHeapNode1);
        arr_threadSafeHeapNode[v] = threadSafeHeapNode0;
        arr_threadSafeHeapNode[v1] = threadSafeHeapNode1;
        threadSafeHeapNode0.setIndex(v);
        threadSafeHeapNode1.setIndex(v1);
    }

    public final void clear() {
        synchronized(this) {
            ThreadSafeHeapNode[] arr_threadSafeHeapNode = this.a;
            if(arr_threadSafeHeapNode != null) {
                ArraysKt___ArraysJvmKt.fill$default(arr_threadSafeHeapNode, null, 0, 0, 6, null);
            }
            ThreadSafeHeap.b.set(this, 0);
        }
    }

    @Nullable
    public final ThreadSafeHeapNode find(@NotNull Function1 function10) {
        ThreadSafeHeapNode threadSafeHeapNode0;
        synchronized(this) {
            int v1 = this.getSize();
            for(int v2 = 0; true; ++v2) {
                threadSafeHeapNode0 = null;
                if(v2 >= v1) {
                    break;
                }
                ThreadSafeHeapNode[] arr_threadSafeHeapNode = this.a;
                if(arr_threadSafeHeapNode != null) {
                    threadSafeHeapNode0 = arr_threadSafeHeapNode[v2];
                }
                Intrinsics.checkNotNull(threadSafeHeapNode0);
                if(((Boolean)function10.invoke(threadSafeHeapNode0)).booleanValue()) {
                    break;
                }
            }
            return threadSafeHeapNode0;
        }
    }

    @PublishedApi
    @Nullable
    public final ThreadSafeHeapNode firstImpl() {
        return this.a == null ? null : this.a[0];
    }

    public final int getSize() {
        return ThreadSafeHeap.b.get(this);
    }

    public final boolean isEmpty() {
        return this.getSize() == 0;
    }

    @Nullable
    public final ThreadSafeHeapNode peek() {
        synchronized(this) {
            return this.firstImpl();
        }
    }

    public final boolean remove(@NotNull ThreadSafeHeapNode threadSafeHeapNode0) {
        boolean z;
        synchronized(this) {
            if(threadSafeHeapNode0.getHeap() == null) {
                z = false;
            }
            else {
                this.removeAtImpl(threadSafeHeapNode0.getIndex());
                z = true;
            }
            return z;
        }
    }

    @PublishedApi
    @NotNull
    public final ThreadSafeHeapNode removeAtImpl(int v) {
        ThreadSafeHeapNode[] arr_threadSafeHeapNode = this.a;
        Intrinsics.checkNotNull(arr_threadSafeHeapNode);
        int v1 = this.getSize();
        ThreadSafeHeap.b.set(this, v1 - 1);
        if(v < this.getSize()) {
            this.b(v, this.getSize());
            int v2 = (v - 1) / 2;
            if(v > 0) {
                ThreadSafeHeapNode threadSafeHeapNode0 = arr_threadSafeHeapNode[v];
                Intrinsics.checkNotNull(threadSafeHeapNode0);
                ThreadSafeHeapNode threadSafeHeapNode1 = arr_threadSafeHeapNode[v2];
                Intrinsics.checkNotNull(threadSafeHeapNode1);
                if(((Comparable)threadSafeHeapNode0).compareTo(threadSafeHeapNode1) < 0) {
                    this.b(v, v2);
                    this.a(v2);
                    goto label_38;
                }
                goto label_16;
            }
            else {
                while(true) {
                label_16:
                    int v3 = v * 2 + 1;
                    if(v3 >= this.getSize()) {
                        break;
                    }
                    ThreadSafeHeapNode[] arr_threadSafeHeapNode1 = this.a;
                    Intrinsics.checkNotNull(arr_threadSafeHeapNode1);
                    int v4 = v * 2 + 2;
                    if(v4 < this.getSize()) {
                        ThreadSafeHeapNode threadSafeHeapNode2 = arr_threadSafeHeapNode1[v4];
                        Intrinsics.checkNotNull(threadSafeHeapNode2);
                        ThreadSafeHeapNode threadSafeHeapNode3 = arr_threadSafeHeapNode1[v3];
                        Intrinsics.checkNotNull(threadSafeHeapNode3);
                        if(((Comparable)threadSafeHeapNode2).compareTo(threadSafeHeapNode3) >= 0) {
                            v4 = v3;
                        }
                    }
                    else {
                        v4 = v3;
                    }
                    ThreadSafeHeapNode threadSafeHeapNode4 = arr_threadSafeHeapNode1[v];
                    Intrinsics.checkNotNull(threadSafeHeapNode4);
                    ThreadSafeHeapNode threadSafeHeapNode5 = arr_threadSafeHeapNode1[v4];
                    Intrinsics.checkNotNull(threadSafeHeapNode5);
                    if(((Comparable)threadSafeHeapNode4).compareTo(threadSafeHeapNode5) <= 0) {
                        break;
                    }
                    this.b(v, v4);
                    v = v4;
                }
            }
        }
    label_38:
        ThreadSafeHeapNode threadSafeHeapNode6 = arr_threadSafeHeapNode[this.getSize()];
        Intrinsics.checkNotNull(threadSafeHeapNode6);
        threadSafeHeapNode6.setHeap(null);
        threadSafeHeapNode6.setIndex(-1);
        arr_threadSafeHeapNode[this.getSize()] = null;
        return threadSafeHeapNode6;
    }

    @Nullable
    public final ThreadSafeHeapNode removeFirstIf(@NotNull Function1 function10) {
        synchronized(this) {
            ThreadSafeHeapNode threadSafeHeapNode0 = null;
            ThreadSafeHeapNode threadSafeHeapNode1 = this.firstImpl();
            if(threadSafeHeapNode1 == null) {
                return null;
            }
            if(((Boolean)function10.invoke(threadSafeHeapNode1)).booleanValue()) {
                threadSafeHeapNode0 = this.removeAtImpl(0);
            }
            return threadSafeHeapNode0;
        }
    }

    @Nullable
    public final ThreadSafeHeapNode removeFirstOrNull() {
        synchronized(this) {
            return this.getSize() <= 0 ? null : this.removeAtImpl(0);
        }
    }
}


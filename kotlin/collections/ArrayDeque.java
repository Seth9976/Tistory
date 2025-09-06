package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001C\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0007\u0018\u0000 G*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001GB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016\u00A2\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\b\u00A2\u0006\u0004\b\u0005\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00028\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\r\u0010\u0011\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\u000F\u0010\u0012\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u0012\u0010\u000FJ\u0015\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001A\u00028\u0000\u00A2\u0006\u0004\b\u0018\u0010\u000FJ\u000F\u0010\u0019\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u0019\u0010\u000FJ\r\u0010\u001A\u001A\u00028\u0000\u00A2\u0006\u0004\b\u001A\u0010\u000FJ\u000F\u0010\u001B\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b\u001B\u0010\u000FJ\u0017\u0010\u001C\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001C\u001A\u00020\u00142\u0006\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001FJ\u001D\u0010 \u001A\u00020\u000B2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00A2\u0006\u0004\b \u0010!J%\u0010 \u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00020\u00032\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00A2\u0006\u0004\b \u0010\"J\u0018\u0010#\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00020\u0003H\u0096\u0002\u00A2\u0006\u0004\b#\u0010$J \u0010%\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b%\u0010&J\u0018\u0010\'\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0004\b\'\u0010\u001DJ\u0017\u0010(\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b(\u0010)J\u0017\u0010*\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b*\u0010)J\u0017\u0010+\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b+\u0010\u001DJ\u0017\u0010,\u001A\u00028\u00002\u0006\u0010\u001E\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b,\u0010$J\u001D\u0010-\u001A\u00020\u000B2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00A2\u0006\u0004\b-\u0010!J\u001D\u0010.\u001A\u00020\u000B2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\bH\u0016\u00A2\u0006\u0004\b.\u0010!J\u000F\u0010/\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b/\u0010\u0007J)\u00103\u001A\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0001\u001002\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u000101H\u0016\u00A2\u0006\u0004\b3\u00104J\u0017\u00103\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010501H\u0016\u00A2\u0006\u0004\b3\u00106J)\u00108\u001A\b\u0012\u0004\u0012\u00028\u000101\"\u0004\b\u0001\u001002\f\u00102\u001A\b\u0012\u0004\u0012\u00028\u000101H\u0000\u00A2\u0006\u0004\b7\u00104J\u0017\u00108\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010501H\u0000\u00A2\u0006\u0004\b7\u00106JO\u0010@\u001A\u00020\u00142>\u0010=\u001A:\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010501\u00A2\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u001409H\u0000\u00A2\u0006\u0004\b>\u0010?R$\u0010F\u001A\u00020\u00032\u0006\u0010A\u001A\u00020\u00038\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\u00A8\u0006H"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "element", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "index", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "testToArray$kotlin_stdlib", "testToArray", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "structure", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", "internalStructure", "<set-?>", "c", "I", "getSize", "()I", "size", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
@SourceDebugExtension({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,569:1\n467#1,51:572\n467#1,51:623\n37#2,2:570\n26#3:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:572,51\n464#1:623,51\n47#1:570,2\n559#1:674\n*E\n"})
public final class ArrayDeque extends AbstractMutableList {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001C\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public int a;
    public Object[] b;
    public int c;
    public static final Object[] d;

    static {
        ArrayDeque.Companion = new Companion(null);
        ArrayDeque.d = new Object[0];
    }

    public ArrayDeque() {
        this.b = ArrayDeque.d;
    }

    public ArrayDeque(int v) {
        Object[] arr_object;
        if(v == 0) {
            arr_object = ArrayDeque.d;
        }
        else if(v > 0) {
            arr_object = new Object[v];
        }
        else {
            throw new IllegalArgumentException("Illegal Capacity: " + v);
        }
        this.b = arr_object;
    }

    public ArrayDeque(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        super();
        Object[] arr_object = collection0.toArray(new Object[0]);
        this.b = arr_object;
        this.c = arr_object.length;
        if(arr_object.length == 0) {
            this.b = ArrayDeque.d;
        }
    }

    public final void a(int v, Collection collection0) {
        Iterator iterator0 = collection0.iterator();
        while(v < this.b.length && iterator0.hasNext()) {
            Object[] arr_object = this.b;
            Object object0 = iterator0.next();
            arr_object[v] = object0;
            ++v;
        }
        int v1 = this.a;
        for(int v2 = 0; v2 < v1 && iterator0.hasNext(); ++v2) {
            Object[] arr_object1 = this.b;
            Object object1 = iterator0.next();
            arr_object1[v2] = object1;
        }
        this.c = collection0.size() + this.size();
    }

    @Override  // kotlin.collections.AbstractMutableList
    public void add(int v, Object object0) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.size());
        if(v == this.size()) {
            this.addLast(object0);
            return;
        }
        if(v == 0) {
            this.addFirst(object0);
            return;
        }
        this.b(this.size() + 1);
        int v1 = this.d(this.a + v);
        if(v < this.size() + 1 >> 1) {
            int v2 = v1 == 0 ? ArraysKt___ArraysKt.getLastIndex(this.b) : v1 - 1;
            int v3 = this.a == 0 ? ArraysKt___ArraysKt.getLastIndex(this.b) : this.a - 1;
            int v4 = this.a;
            if(v2 >= v4) {
                Object[] arr_object = this.b;
                arr_object[v3] = arr_object[v4];
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v4, v4 + 1, v2 + 1);
            }
            else {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v4 - 1, v4, this.b.length);
                Object[] arr_object1 = this.b;
                arr_object1[arr_object1.length - 1] = arr_object1[0];
                ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object1, 0, 1, v2 + 1);
            }
            this.b[v2] = object0;
            this.a = v3;
        }
        else {
            int v5 = this.d(this.size() + this.a);
            if(v1 < v5) {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v1 + 1, v1, v5);
            }
            else {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, 1, 0, v5);
                Object[] arr_object2 = this.b;
                arr_object2[0] = arr_object2[arr_object2.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object2, v1 + 1, v1, arr_object2.length - 1);
            }
            this.b[v1] = object0;
        }
        this.c = this.size() + 1;
    }

    @Override
    public boolean add(Object object0) {
        this.addLast(object0);
        return true;
    }

    @Override
    public boolean addAll(int v, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.size());
        if(collection0.isEmpty()) {
            return false;
        }
        if(v == this.size()) {
            return this.addAll(collection0);
        }
        this.b(collection0.size() + this.size());
        int v1 = this.d(this.size() + this.a);
        int v2 = this.d(this.a + v);
        int v3 = collection0.size();
        if(v < this.size() + 1 >> 1) {
            int v4 = this.a;
            int v5 = v4 - v3;
            if(v2 < v4) {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v5, v4, this.b.length);
                if(v3 >= v2) {
                    ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, this.b.length - v3, 0, v2);
                }
                else {
                    ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, this.b.length - v3, 0, v3);
                    ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, 0, v3, v2);
                }
            }
            else if(v5 >= 0) {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v5, v4, v2);
            }
            else {
                Object[] arr_object = this.b;
                v5 += arr_object.length;
                int v6 = arr_object.length - v5;
                if(v6 >= v2 - v4) {
                    ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v5, v4, v2);
                }
                else {
                    ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, v5, v4, v4 + v6);
                    ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, 0, this.a + v6, v2);
                }
            }
            this.a = v5;
            int v7 = v2 - v3;
            this.a((v7 >= 0 ? v2 - v3 : v7 + this.b.length), collection0);
            return true;
        }
        int v8 = v2 + v3;
        if(v2 < v1) {
            int v9 = v3 + v1;
            Object[] arr_object1 = this.b;
            if(v9 <= arr_object1.length) {
                ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object1, v8, v2, v1);
            }
            else if(v8 >= arr_object1.length) {
                ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object1, v8 - arr_object1.length, v2, v1);
            }
            else {
                int v10 = v1 - (v9 - arr_object1.length);
                ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object1, 0, v10, v1);
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v8, v2, v10);
            }
        }
        else {
            ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v3, 0, v1);
            Object[] arr_object2 = this.b;
            if(v8 >= arr_object2.length) {
                ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object2, v8 - arr_object2.length, v2, arr_object2.length);
            }
            else {
                ArraysKt___ArraysJvmKt.copyInto(arr_object2, arr_object2, 0, arr_object2.length - v3, arr_object2.length);
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v8, v2, this.b.length - v3);
            }
        }
        this.a(v2, collection0);
        return true;
    }

    @Override
    public boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        this.b(collection0.size() + this.size());
        this.a(this.d(this.size() + this.a), collection0);
        return true;
    }

    @Override
    public final void addFirst(Object object0) {
        this.b(this.size() + 1);
        int v = this.a == 0 ? ArraysKt___ArraysKt.getLastIndex(this.b) : this.a - 1;
        this.a = v;
        this.b[v] = object0;
        this.c = this.size() + 1;
    }

    @Override
    public final void addLast(Object object0) {
        this.b(this.size() + 1);
        this.b[this.d(this.size() + this.a)] = object0;
        this.c = this.size() + 1;
    }

    public final void b(int v) {
        if(v < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] arr_object = this.b;
        if(v <= arr_object.length) {
            return;
        }
        if(arr_object == ArrayDeque.d) {
            this.b = new Object[c.coerceAtLeast(v, 10)];
            return;
        }
        Object[] arr_object1 = new Object[AbstractList.Companion.newCapacity$kotlin_stdlib(arr_object.length, v)];
        ArraysKt___ArraysJvmKt.copyInto(this.b, arr_object1, 0, this.a, this.b.length);
        ArraysKt___ArraysJvmKt.copyInto(this.b, arr_object1, this.b.length - this.a, 0, this.a);
        this.a = 0;
        this.b = arr_object1;
    }

    public final int c(int v) {
        return v == ArraysKt___ArraysKt.getLastIndex(this.b) ? 0 : v + 1;
    }

    @Override
    public void clear() {
        int v = this.d(this.size() + this.a);
        int v1 = this.a;
        if(v1 < v) {
            ArraysKt___ArraysJvmKt.fill(this.b, null, v1, v);
        }
        else if(!this.isEmpty()) {
            ArraysKt___ArraysJvmKt.fill(this.b, null, this.a, this.b.length);
            ArraysKt___ArraysJvmKt.fill(this.b, null, 0, v);
        }
        this.a = 0;
        this.c = 0;
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    public final int d(int v) {
        return v < this.b.length ? v : v - this.b.length;
    }

    public final Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[this.a];
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object firstOrNull() {
        return this.isEmpty() ? null : this.b[this.a];
    }

    @Override
    public Object get(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.size());
        return this.b[this.d(this.a + v)];
    }

    @Override  // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.c;
    }

    @Override
    public int indexOf(Object object0) {
        int v = this.d(this.size() + this.a);
        int v1 = this.a;
        if(v1 < v) {
            while(v1 < v) {
                if(Intrinsics.areEqual(object0, this.b[v1])) {
                    return v1 - this.a;
                }
                ++v1;
            }
            return -1;
        }
        if(v1 >= v) {
            while(v1 < this.b.length) {
                if(Intrinsics.areEqual(object0, this.b[v1])) {
                    return v1 - this.a;
                }
                ++v1;
            }
            for(int v2 = 0; v2 < v; ++v2) {
                if(Intrinsics.areEqual(object0, this.b[v2])) {
                    return v2 + this.b.length - this.a;
                }
            }
        }
        return -1;
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2 function20) {
        int v2;
        Intrinsics.checkNotNullParameter(function20, "structure");
        int v = this.d(this.size() + this.a);
        if(this.isEmpty()) {
            v2 = this.a;
        }
        else {
            int v1 = this.a;
            v2 = v1 >= v ? v1 - this.b.length : this.a;
        }
        function20.invoke(v2, this.toArray());
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] arr_object = this.b;
        int v = this.a;
        return arr_object[this.d(CollectionsKt__CollectionsKt.getLastIndex(this) + v)];
    }

    @Override
    public int lastIndexOf(Object object0) {
        int v2;
        int v = this.d(this.size() + this.a);
        int v1 = this.a;
        if(v1 < v) {
            v2 = v - 1;
            if(v1 <= v2) {
                while(true) {
                    if(Intrinsics.areEqual(object0, this.b[v2])) {
                        return v2 - this.a;
                    }
                    if(v2 == v1) {
                        break;
                    }
                    --v2;
                }
            }
        }
        else if(v1 > v) {
            for(int v3 = v - 1; -1 < v3; --v3) {
                if(Intrinsics.areEqual(object0, this.b[v3])) {
                    return v3 + this.b.length - this.a;
                }
            }
            v2 = ArraysKt___ArraysKt.getLastIndex(this.b);
            int v4 = this.a;
            if(v4 <= v2) {
                while(true) {
                    if(Intrinsics.areEqual(object0, this.b[v2])) {
                        return v2 - this.a;
                    }
                    if(v2 == v4) {
                        break;
                    }
                    --v2;
                }
            }
        }
        return -1;
    }

    @Nullable
    public final Object lastOrNull() {
        if(this.isEmpty()) {
            return null;
        }
        Object[] arr_object = this.b;
        int v = this.a;
        return arr_object[this.d(CollectionsKt__CollectionsKt.getLastIndex(this) + v)];
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v == -1) {
            return false;
        }
        this.remove(v);
        return true;
    }

    @Override
    public boolean removeAll(@NotNull Collection collection0) {
        int v3;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = 0;
        if(!this.isEmpty() && this.b.length != 0) {
            int v1 = this.d(this.size() + this.a);
            int v2 = this.a;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.b[v2];
                    if(collection0.contains(object0)) {
                        v = 1;
                    }
                    else {
                        this.b[v3] = object0;
                        ++v3;
                    }
                    ++v2;
                }
                ArraysKt___ArraysJvmKt.fill(this.b, null, v3, v1);
            }
            else {
                int v4 = 0;
                int v5 = v2;
                while(v2 < this.b.length) {
                    Object[] arr_object = this.b;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(collection0.contains(object1)) {
                        v4 = 1;
                    }
                    else {
                        this.b[v5] = object1;
                        ++v5;
                    }
                    ++v2;
                }
                v3 = this.d(v5);
                while(v < v1) {
                    Object[] arr_object1 = this.b;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(collection0.contains(object2)) {
                        v4 = 1;
                    }
                    else {
                        this.b[v3] = object2;
                        v3 = this.c(v3);
                    }
                    ++v;
                }
                v = v4;
            }
            if(v) {
                int v6 = v3 - this.a;
                this.c = v6 >= 0 ? v3 - this.a : v6 + this.b.length;
            }
        }
        return v != 0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object removeAt(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.size());
        if(v == CollectionsKt__CollectionsKt.getLastIndex(this)) {
            return this.removeLast();
        }
        if(v == 0) {
            return this.removeFirst();
        }
        int v1 = this.d(this.a + v);
        Object object0 = this.b[v1];
        if(v < this.size() >> 1) {
            int v2 = this.a;
            if(v1 >= v2) {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v2 + 1, v2, v1);
            }
            else {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, 1, 0, v1);
                Object[] arr_object = this.b;
                arr_object[0] = arr_object[arr_object.length - 1];
                ArraysKt___ArraysJvmKt.copyInto(arr_object, arr_object, this.a + 1, this.a, arr_object.length - 1);
            }
            int v3 = this.a;
            this.b[v3] = null;
            this.a = this.c(v3);
        }
        else {
            int v4 = this.a;
            int v5 = this.d(CollectionsKt__CollectionsKt.getLastIndex(this) + v4);
            if(v1 <= v5) {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v1, v1 + 1, v5 + 1);
            }
            else {
                ArraysKt___ArraysJvmKt.copyInto(this.b, this.b, v1, v1 + 1, this.b.length);
                Object[] arr_object1 = this.b;
                arr_object1[arr_object1.length - 1] = arr_object1[0];
                ArraysKt___ArraysJvmKt.copyInto(arr_object1, arr_object1, 0, 1, v5 + 1);
            }
            this.b[v5] = null;
        }
        this.c = this.size() - 1;
        return object0;
    }

    @Override
    public final Object removeFirst() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] arr_object = this.b;
        int v = this.a;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        this.a = this.c(v);
        this.c = this.size() - 1;
        return object0;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object removeFirstOrNull() {
        return this.isEmpty() ? null : this.removeFirst();
    }

    @Override
    public final Object removeLast() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int v = this.a;
        int v1 = this.d(CollectionsKt__CollectionsKt.getLastIndex(this) + v);
        Object[] arr_object = this.b;
        Object object0 = arr_object[v1];
        arr_object[v1] = null;
        this.c = this.size() - 1;
        return object0;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public final Object removeLastOrNull() {
        return this.isEmpty() ? null : this.removeLast();
    }

    @Override
    public boolean retainAll(@NotNull Collection collection0) {
        int v3;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = 0;
        if(!this.isEmpty() && this.b.length != 0) {
            int v1 = this.d(this.size() + this.a);
            int v2 = this.a;
            if(v2 < v1) {
                v3 = v2;
                while(v2 < v1) {
                    Object object0 = this.b[v2];
                    if(collection0.contains(object0)) {
                        this.b[v3] = object0;
                        ++v3;
                    }
                    else {
                        v = 1;
                    }
                    ++v2;
                }
                ArraysKt___ArraysJvmKt.fill(this.b, null, v3, v1);
            }
            else {
                int v4 = 0;
                int v5 = v2;
                while(v2 < this.b.length) {
                    Object[] arr_object = this.b;
                    Object object1 = arr_object[v2];
                    arr_object[v2] = null;
                    if(collection0.contains(object1)) {
                        this.b[v5] = object1;
                        ++v5;
                    }
                    else {
                        v4 = 1;
                    }
                    ++v2;
                }
                v3 = this.d(v5);
                while(v < v1) {
                    Object[] arr_object1 = this.b;
                    Object object2 = arr_object1[v];
                    arr_object1[v] = null;
                    if(collection0.contains(object2)) {
                        this.b[v3] = object2;
                        v3 = this.c(v3);
                    }
                    else {
                        v4 = 1;
                    }
                    ++v;
                }
                v = v4;
            }
            if(v) {
                int v6 = v3 - this.a;
                this.c = v6 >= 0 ? v3 - this.a : v6 + this.b.length;
            }
        }
        return v != 0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object set(int v, Object object0) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.size());
        int v1 = this.d(this.a + v);
        Object[] arr_object = this.b;
        Object object1 = arr_object[v1];
        arr_object[v1] = object0;
        return object1;
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return this.toArray();
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return this.toArray(arr_object);
    }

    @Override
    @NotNull
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    @NotNull
    public Object[] toArray(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        if(arr_object.length < this.size()) {
            arr_object = e.arrayOfNulls(arr_object, this.size());
        }
        int v = this.d(this.size() + this.a);
        int v1 = this.a;
        if(v1 < v) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.b, arr_object, 0, v1, v, 2, null);
            return k.terminateCollectionToArray(this.size(), arr_object);
        }
        if(!this.isEmpty()) {
            ArraysKt___ArraysJvmKt.copyInto(this.b, arr_object, 0, this.a, this.b.length);
            ArraysKt___ArraysJvmKt.copyInto(this.b, arr_object, this.b.length - this.a, 0, v);
        }
        return k.terminateCollectionToArray(this.size(), arr_object);
    }
}


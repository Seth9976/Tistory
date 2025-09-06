package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n11515#2,11:143\n13644#2,2:154\n13646#2:157\n11526#2:158\n1#3:156\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n137#1:143,11\n137#1:154,2\n137#1:157\n137#1:158\n137#1:156\n*E\n"})
public final class ArrayMapImpl extends ArrayMap {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public Object[] a;
    public int b;

    static {
        ArrayMapImpl.Companion = new Companion(null);
    }

    public ArrayMapImpl() {
        super(null);
        this.a = new Object[20];
        this.b = 0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public Object get(int v) {
        return ArraysKt___ArraysKt.getOrNull(this.a, v);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @NotNull
    public Iterator iterator() {
        return new AbstractIterator() {
            public int c;

            {
                this.c = -1;
            }

            @Override  // kotlin.collections.AbstractIterator
            public void computeNext() {
                ArrayMapImpl arrayMapImpl0;
                do {
                    int v = this.c + 1;
                    this.c = v;
                    arrayMapImpl0 = this.d;
                }
                while(v < arrayMapImpl0.a.length && arrayMapImpl0.a[this.c] == null);
                if(this.c >= arrayMapImpl0.a.length) {
                    this.done();
                    return;
                }
                Object object0 = arrayMapImpl0.a[this.c];
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                this.setNext(object0);
            }
        };
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int v, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Object[] arr_object = this.a;
        if(arr_object.length <= v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, newSize)");
            this.a = arr_object1;
        }
        if(this.a[v] == null) {
            this.b = this.getSize() + 1;
        }
        this.a[v] = object0;
    }
}


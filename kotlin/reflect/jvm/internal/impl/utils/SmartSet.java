package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.f0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class SmartSet extends AbstractSet {
    @SourceDebugExtension({"SMAP\nSmartSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSet.kt\norg/jetbrains/kotlin/utils/SmartSet$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final SmartSet create() {
            return new SmartSet(null);
        }

        @JvmStatic
        @NotNull
        public final SmartSet create(@NotNull Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "set");
            SmartSet smartSet0 = new SmartSet(null);
            smartSet0.addAll(collection0);
            return smartSet0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public Object a;
    public int b;

    static {
        SmartSet.Companion = new Companion(null);
    }

    public SmartSet(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Override
    public boolean add(Object object0) {
        LinkedHashSet linkedHashSet0;
        switch(this.size()) {
            case 0: {
                this.a = object0;
                break;
            }
            case 1: {
                if(Intrinsics.areEqual(this.a, object0)) {
                    return false;
                }
                this.a = new Object[]{this.a, object0};
                break;
            }
            default: {
                if(this.size() < 5) {
                    Object object1 = this.a;
                    Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                    if(ArraysKt___ArraysKt.contains(((Object[])object1), object0)) {
                        return false;
                    }
                    if(this.size() == 4) {
                        linkedHashSet0 = f0.linkedSetOf(Arrays.copyOf(((Object[])object1), ((Object[])object1).length));
                        linkedHashSet0.add(object0);
                    }
                    else {
                        linkedHashSet0 = Arrays.copyOf(((Object[])object1), this.size() + 1);
                        Intrinsics.checkNotNullExpressionValue(linkedHashSet0, "copyOf(this, newSize)");
                        linkedHashSet0[linkedHashSet0.length - 1] = object0;
                    }
                    this.a = linkedHashSet0;
                }
                else {
                    Object object2 = this.a;
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
                    if(!TypeIntrinsics.asMutableSet(object2).add(object0)) {
                        return false;
                    }
                }
            }
        }
        this.setSize(this.size() + 1);
        return true;
    }

    @Override
    public void clear() {
        this.a = null;
        this.setSize(0);
    }

    @Override
    public boolean contains(Object object0) {
        switch(this.size()) {
            case 0: {
                return false;
            }
            case 1: {
                return Intrinsics.areEqual(this.a, object0);
            }
            default: {
                if(this.size() < 5) {
                    Object object1 = this.a;
                    Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                    return ArraysKt___ArraysKt.contains(((Object[])object1), object0);
                }
                Object object2 = this.a;
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
                return ((Set)object2).contains(object0);
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final SmartSet create() {
        return SmartSet.Companion.create();
    }

    public int getSize() {
        return this.b;
    }

    @Override
    @NotNull
    public Iterator iterator() {
        switch(this.size()) {
            case 0: {
                return Collections.emptySet().iterator();
            }
            case 1: {
                return new k(this.a);
            }
            default: {
                if(this.size() < 5) {
                    Object object0 = this.a;
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                    return new j(((Object[])object0));
                }
                Object object1 = this.a;
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
                return TypeIntrinsics.asMutableSet(object1).iterator();
            }
        }
    }

    public void setSize(int v) {
        this.b = v;
    }

    @Override
    public final int size() {
        return this.getSize();
    }
}


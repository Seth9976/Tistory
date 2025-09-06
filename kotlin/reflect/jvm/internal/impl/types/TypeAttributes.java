package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n105#1,9:134\n105#1,9:143\n105#1,9:152\n766#2:161\n857#2,2:162\n*S KotlinDebug\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n*L\n74#1:134,9\n78#1:143,9\n82#1:152,9\n99#1:161\n99#1:162,2\n*E\n"})
public final class TypeAttributes extends AttributeArrayOwner implements Iterable, KMappedMarker {
    @SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class Companion extends TypeRegistry {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TypeAttributes create(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "attributes");
            return list0.isEmpty() ? this.getEmpty() : new TypeAttributes(list0, null);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(@NotNull ConcurrentHashMap concurrentHashMap0, @NotNull String s, @NotNull Function1 function10) {
            Integer integer1;
            Intrinsics.checkNotNullParameter(concurrentHashMap0, "<this>");
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(function10, "compute");
            Integer integer0 = (Integer)concurrentHashMap0.get(s);
            if(integer0 == null) {
                synchronized(concurrentHashMap0) {
                    integer1 = (Integer)concurrentHashMap0.get(s);
                    if(integer1 == null) {
                        Object object0 = function10.invoke(s);
                        concurrentHashMap0.putIfAbsent(s, ((Number)object0).intValue());
                        integer1 = (Integer)object0;
                    }
                    Intrinsics.checkNotNullExpressionValue(integer1, "this[key] ?: compute(key…is.putIfAbsent(key, it) }");
                }
                return integer1.intValue();
            }
            return (int)integer0;
        }

        @NotNull
        public final TypeAttributes getEmpty() {
            return TypeAttributes.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final TypeAttributes b;

    static {
        TypeAttributes.Companion = new Companion(null);
        TypeAttributes.b = new TypeAttributes(CollectionsKt__CollectionsKt.emptyList());
    }

    public TypeAttributes(List list0) {
        for(Object object0: list0) {
            this.registerComponent(((TypeAttribute)object0).getKey(), ((TypeAttribute)object0));
        }
    }

    public TypeAttributes(List list0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0);
    }

    @NotNull
    public final TypeAttributes add(@NotNull TypeAttributes typeAttributes0) {
        TypeAttribute typeAttribute2;
        Intrinsics.checkNotNullParameter(typeAttributes0, "other");
        if(this.isEmpty() && typeAttributes0.isEmpty()) {
            return this;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: TypeAttributes.Companion.getIndices()) {
            int v = ((Number)object0).intValue();
            TypeAttribute typeAttribute0 = (TypeAttribute)this.getArrayMap().get(v);
            TypeAttribute typeAttribute1 = (TypeAttribute)typeAttributes0.getArrayMap().get(v);
            if(typeAttribute0 != null) {
                typeAttribute2 = typeAttribute0.add(typeAttribute1);
            }
            else if(typeAttribute1 == null) {
                typeAttribute2 = null;
            }
            else {
                typeAttribute2 = typeAttribute1.add(null);
            }
            CollectionsKt.addIfNotNull(arrayList0, typeAttribute2);
        }
        return TypeAttributes.Companion.create(arrayList0);
    }

    public final boolean contains(@NotNull TypeAttribute typeAttribute0) {
        Intrinsics.checkNotNullParameter(typeAttribute0, "attribute");
        KClass kClass0 = typeAttribute0.getKey();
        return this.getArrayMap().get(TypeAttributes.Companion.getId(kClass0)) != null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public TypeRegistry getTypeRegistry() {
        return TypeAttributes.Companion;
    }

    @NotNull
    public final TypeAttributes intersect(@NotNull TypeAttributes typeAttributes0) {
        TypeAttribute typeAttribute2;
        Intrinsics.checkNotNullParameter(typeAttributes0, "other");
        if(this.isEmpty() && typeAttributes0.isEmpty()) {
            return this;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: TypeAttributes.Companion.getIndices()) {
            int v = ((Number)object0).intValue();
            TypeAttribute typeAttribute0 = (TypeAttribute)this.getArrayMap().get(v);
            TypeAttribute typeAttribute1 = (TypeAttribute)typeAttributes0.getArrayMap().get(v);
            if(typeAttribute0 != null) {
                typeAttribute2 = typeAttribute0.intersect(typeAttribute1);
            }
            else if(typeAttribute1 == null) {
                typeAttribute2 = null;
            }
            else {
                typeAttribute2 = typeAttribute1.intersect(null);
            }
            CollectionsKt.addIfNotNull(arrayList0, typeAttribute2);
        }
        return TypeAttributes.Companion.create(arrayList0);
    }

    @NotNull
    public final TypeAttributes plus(@NotNull TypeAttribute typeAttribute0) {
        Intrinsics.checkNotNullParameter(typeAttribute0, "attribute");
        if(this.contains(typeAttribute0)) {
            return this;
        }
        if(this.isEmpty()) {
            return new TypeAttributes(k.listOf(typeAttribute0));
        }
        List list0 = CollectionsKt___CollectionsKt.plus(CollectionsKt___CollectionsKt.toList(this), typeAttribute0);
        return TypeAttributes.Companion.create(list0);
    }

    @NotNull
    public final TypeAttributes remove(@NotNull TypeAttribute typeAttribute0) {
        Intrinsics.checkNotNullParameter(typeAttribute0, "attribute");
        if(this.isEmpty()) {
            return this;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.getArrayMap()) {
            if(!Intrinsics.areEqual(((TypeAttribute)object0), typeAttribute0)) {
                arrayList0.add(object0);
            }
        }
        return arrayList0.size() == this.getArrayMap().getSize() ? this : TypeAttributes.Companion.create(arrayList0);
    }
}


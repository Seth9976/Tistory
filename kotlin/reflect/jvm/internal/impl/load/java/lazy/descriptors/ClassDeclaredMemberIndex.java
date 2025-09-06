package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;

@SourceDebugExtension({"SMAP\nDeclaredMemberIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n970#2:67\n999#2,3:68\n1002#2,3:78\n674#2:81\n704#2,4:82\n1137#2,3:95\n1137#2,3:98\n361#3,7:71\n766#4:86\n857#4,2:87\n1194#4,2:89\n1222#4,4:91\n*S KotlinDebug\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n*L\n52#1:67\n52#1:68,3\n52#1:78,3\n53#1:81\n53#1:82,4\n57#1:95,3\n60#1:98,3\n52#1:71,7\n54#1:86\n54#1:87,2\n54#1:89,2\n54#1:91,4\n*E\n"})
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {
    public final JavaClass a;
    public final Function1 b;
    public final h1 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public ClassDeclaredMemberIndex(@NotNull JavaClass javaClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(javaClass0, "jClass");
        Intrinsics.checkNotNullParameter(function10, "memberFilter");
        super();
        this.a = javaClass0;
        this.b = function10;
        h1 h10 = new h1(this, 4);
        this.c = h10;
        Sequence sequence0 = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(javaClass0.getMethods()), h10);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: sequence0) {
            Name name0 = ((JavaMethod)object0).getName();
            ArrayList arrayList0 = linkedHashMap0.get(name0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(name0, arrayList0);
            }
            arrayList0.add(object0);
        }
        this.d = linkedHashMap0;
        Sequence sequence1 = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.a.getFields()), this.b);
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object1: sequence1) {
            linkedHashMap1.put(((JavaField)object1).getName(), object1);
        }
        this.e = linkedHashMap1;
        Iterable iterable0 = this.a.getRecordComponents();
        Function1 function11 = this.b;
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: iterable0) {
            if(((Boolean)function11.invoke(object2)).booleanValue()) {
                arrayList1.add(object2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(arrayList1, 10)), 16));
        for(Object object3: arrayList1) {
            linkedHashMap2.put(((JavaRecordComponent)object3).getName(), object3);
        }
        this.f = linkedHashMap2;
    }

    public static final Function1 access$getMemberFilter$p(ClassDeclaredMemberIndex classDeclaredMemberIndex0) {
        return classDeclaredMemberIndex0.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaField findFieldByName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return (JavaField)this.e.get(name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Collection findMethodsByName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        List list0 = (List)this.d.get(name0);
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        return (JavaRecordComponent)this.f.get(name0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set getFieldNames() {
        Sequence sequence0 = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.a.getFields()), this.b);
        Set set0 = new LinkedHashSet();
        for(Object object0: sequence0) {
            set0.add(((JavaField)object0).getName());
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set getMethodNames() {
        Sequence sequence0 = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.a.getMethods()), this.c);
        Set set0 = new LinkedHashSet();
        for(Object object0: sequence0) {
            set0.add(((JavaMethod)object0).getName());
        }
        return set0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set getRecordComponentNames() {
        return this.f.keySet();
    }
}


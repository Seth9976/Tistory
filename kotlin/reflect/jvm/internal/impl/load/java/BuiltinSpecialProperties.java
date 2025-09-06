package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,42:1\n1549#2:43\n1620#2,3:44\n1490#2:47\n1520#2,3:48\n1523#2,3:58\n1238#2,4:63\n1549#2:67\n1620#2,3:68\n361#3,7:51\n442#3:61\n392#3:62\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n27#1:43\n27#1:44,3\n28#1:47\n28#1:48,3\n28#1:58,3\n29#1:63,4\n34#1:67\n34#1:68,3\n28#1:51,7\n29#1:61\n29#1:62\n*E\n"})
public final class BuiltinSpecialProperties {
    @NotNull
    public static final BuiltinSpecialProperties INSTANCE;
    public static final Map a;
    public static final LinkedHashMap b;
    public static final Set c;
    public static final Set d;

    static {
        BuiltinSpecialProperties.INSTANCE = new BuiltinSpecialProperties();  // 初始化器: Ljava/lang/Object;-><init>()V
        Map map0 = x.mapOf(new Pair[]{TuplesKt.to(BuiltinSpecialPropertiesKt.access$childSafe(FqNames._enum, "name"), Name.identifier("name")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$childSafe(FqNames._enum, "ordinal"), Name.identifier("ordinal")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(FqNames.collection, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(FqNames.map, "size"), Name.identifier("size")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$childSafe(FqNames.charSequence, "length"), Name.identifier("length")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(FqNames.map, "keys"), Name.identifier("keySet")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(FqNames.map, "values"), Name.identifier("values")), TuplesKt.to(BuiltinSpecialPropertiesKt.access$child(FqNames.map, "entries"), Name.identifier("entrySet"))});
        BuiltinSpecialProperties.a = map0;
        Iterable iterable0 = map0.entrySet();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(new Pair(((FqName)((Map.Entry)object0).getKey()).shortName(), ((Map.Entry)object0).getValue()));
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: arrayList0) {
            Name name0 = (Name)((Pair)object1).getSecond();
            ArrayList arrayList1 = linkedHashMap0.get(name0);
            if(arrayList1 == null) {
                arrayList1 = new ArrayList();
                linkedHashMap0.put(name0, arrayList1);
            }
            arrayList1.add(((Name)((Pair)object1).getFirst()));
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(w.mapCapacity(linkedHashMap0.size()));
        for(Object object2: linkedHashMap0.entrySet()) {
            linkedHashMap1.put(((Map.Entry)object2).getKey(), CollectionsKt___CollectionsKt.distinct(((Iterable)((Map.Entry)object2).getValue())));
        }
        BuiltinSpecialProperties.b = linkedHashMap1;
        Set set0 = BuiltinSpecialProperties.a.keySet();
        BuiltinSpecialProperties.c = set0;
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(set0, 10));
        for(Object object3: set0) {
            arrayList2.add(((FqName)object3).shortName());
        }
        BuiltinSpecialProperties.d = CollectionsKt___CollectionsKt.toSet(arrayList2);
    }

    @NotNull
    public final Map getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return BuiltinSpecialProperties.a;
    }

    @NotNull
    public final List getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name1");
        List list0 = (List)BuiltinSpecialProperties.b.get(name0);
        return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
    }

    @NotNull
    public final Set getSPECIAL_FQ_NAMES() {
        return BuiltinSpecialProperties.c;
    }

    @NotNull
    public final Set getSPECIAL_SHORT_NAMES() {
        return BuiltinSpecialProperties.d;
    }
}


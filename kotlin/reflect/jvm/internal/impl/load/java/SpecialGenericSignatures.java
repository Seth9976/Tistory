package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@SourceDebugExtension({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,146:1\n1549#2:147\n1620#2,3:148\n1549#2:151\n1620#2,3:152\n1549#2:155\n1620#2,3:156\n1238#2,4:162\n1549#2:166\n1620#2,3:167\n1549#2:170\n1620#2,3:171\n1238#2,4:177\n1549#2:181\n1620#2,3:182\n1549#2:185\n1620#2,3:186\n1208#2,2:189\n1238#2,4:191\n13#3:159\n13#3:174\n457#4:160\n403#4:161\n457#4:175\n403#4:176\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n54#1:147\n54#1:148,3\n56#1:151\n56#1:152,3\n57#1:155\n57#1:156,3\n95#1:162,4\n101#1:166\n101#1:167,3\n102#1:170\n102#1:171,3\n126#1:177,4\n128#1:181\n128#1:182,3\n132#1:185\n132#1:186,3\n133#1:189,2\n133#1:191,4\n60#1:159\n111#1:174\n95#1:160\n95#1:161\n126#1:175\n126#1:176\n*E\n"})
public class SpecialGenericSignatures {
    public static final class Companion {
        public static final class NameAndSignature {
            public final Name a;
            public final String b;

            public NameAndSignature(@NotNull Name name0, @NotNull String s) {
                Intrinsics.checkNotNullParameter(name0, "name");
                Intrinsics.checkNotNullParameter(s, "signature");
                super();
                this.a = name0;
                this.b = s;
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof NameAndSignature)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((NameAndSignature)object0).a) ? Intrinsics.areEqual(this.b, ((NameAndSignature)object0).b) : false;
            }

            @NotNull
            public final Name getName() {
                return this.a;
            }

            @NotNull
            public final String getSignature() {
                return this.b;
            }

            @Override
            public int hashCode() {
                return this.b.hashCode() + this.a.hashCode() * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                StringBuilder stringBuilder0 = new StringBuilder("NameAndSignature(name=");
                stringBuilder0.append(this.a);
                stringBuilder0.append(", signature=");
                return a.b(')', this.b, stringBuilder0);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final NameAndSignature access$method(Companion specialGenericSignatures$Companion0, String s, String s1, String s2, String s3) {
            specialGenericSignatures$Companion0.getClass();
            Name name0 = Name.identifier(s1);
            Intrinsics.checkNotNullExpressionValue(name0, "identifier(name)");
            return new NameAndSignature(name0, SignatureBuildingComponents.INSTANCE.signature(s, s1 + '(' + s2 + ')' + s3));
        }

        @Nullable
        public final Name getBuiltinFunctionNamesByJvmName(@NotNull Name name0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            return (Name)this.getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name0);
        }

        @NotNull
        public final List getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.b;
        }

        @NotNull
        public final Set getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.e;
        }

        @NotNull
        public final Set getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.f;
        }

        @NotNull
        public final Map getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.k;
        }

        @NotNull
        public final List getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.j;
        }

        @NotNull
        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.g;
        }

        @NotNull
        public final Map getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.d;
        }

        @NotNull
        public final Map getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.i;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name0) {
            Intrinsics.checkNotNullParameter(name0, "<this>");
            return this.getORIGINAL_SHORT_NAMES().contains(name0);
        }

        @NotNull
        public final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "builtinSignature");
            if(this.getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(s)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription)x.getValue(this.getSIGNATURE_TO_DEFAULT_VALUES_MAP(), s)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    public static enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER,
        OBJECT_PARAMETER_NON_GENERIC,
        OBJECT_PARAMETER_GENERIC;

    }

    public static enum TypeSafeBarrierDescription {
        NULL(null),
        INDEX(-1),
        FALSE(Boolean.FALSE),
        MAP_GET_OR_DEFAULT(null, null) /* 警告！未生成枚举子类：kotlin.reflect.jvm.internal.impl.load.java.d */;

        public final Object a;

        public TypeSafeBarrierDescription(Object object0) {
            this.a = object0;
        }

        public TypeSafeBarrierDescription(Object object0, DefaultConstructorMarker defaultConstructorMarker0) {
            this(object0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final ArrayList a;
    public static final ArrayList b;
    public static final Map c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;
    public static final NameAndSignature g;
    public static final Map h;
    public static final LinkedHashMap i;
    public static final ArrayList j;
    public static final LinkedHashMap k;

    static {
        SpecialGenericSignatures.Companion = new Companion(null);
        Iterable iterable0 = f0.setOf(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            String s = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(s, "BOOLEAN.desc");
            arrayList0.add(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Collection", ((String)object0), "Ljava/util/Collection;", s));
        }
        SpecialGenericSignatures.a = arrayList0;
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(((NameAndSignature)object1).getSignature());
        }
        SpecialGenericSignatures.b = arrayList1;
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(SpecialGenericSignatures.a, 10));
        for(Object object2: SpecialGenericSignatures.a) {
            arrayList2.add(((NameAndSignature)object2).getName().asString());
        }
        String s1 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkNotNullExpressionValue(s1, "BOOLEAN.desc");
        Pair pair0 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Collection", "contains", "Ljava/lang/Object;", s1), TypeSafeBarrierDescription.FALSE);
        String s2 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkNotNullExpressionValue(s2, "BOOLEAN.desc");
        Pair pair1 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Collection", "remove", "Ljava/lang/Object;", s2), TypeSafeBarrierDescription.FALSE);
        String s3 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkNotNullExpressionValue(s3, "BOOLEAN.desc");
        Pair pair2 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Map", "containsKey", "Ljava/lang/Object;", s3), TypeSafeBarrierDescription.FALSE);
        String s4 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkNotNullExpressionValue(s4, "BOOLEAN.desc");
        Pair pair3 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Map", "containsValue", "Ljava/lang/Object;", s4), TypeSafeBarrierDescription.FALSE);
        String s5 = JvmPrimitiveType.BOOLEAN.getDesc();
        Intrinsics.checkNotNullExpressionValue(s5, "BOOLEAN.desc");
        Pair pair4 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Map", "remove", "Ljava/lang/Object;Ljava/lang/Object;", s5), TypeSafeBarrierDescription.FALSE);
        Pair pair5 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Map", "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Pair pair6 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Map", "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.NULL);
        Pair pair7 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/Map", "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.NULL);
        String s6 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s6, "INT.desc");
        Pair pair8 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/List", "indexOf", "Ljava/lang/Object;", s6), TypeSafeBarrierDescription.INDEX);
        String s7 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s7, "INT.desc");
        Map map0 = x.mapOf(new Pair[]{pair0, pair1, pair2, pair3, pair4, pair5, pair6, pair7, pair8, TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/util/List", "lastIndexOf", "Ljava/lang/Object;", s7), TypeSafeBarrierDescription.INDEX)});
        SpecialGenericSignatures.c = map0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.mapCapacity(map0.size()));
        for(Object object3: map0.entrySet()) {
            linkedHashMap0.put(((NameAndSignature)((Map.Entry)object3).getKey()).getSignature(), ((Map.Entry)object3).getValue());
        }
        SpecialGenericSignatures.d = linkedHashMap0;
        Iterable iterable1 = g0.plus(SpecialGenericSignatures.c.keySet(), SpecialGenericSignatures.a);
        ArrayList arrayList3 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
        for(Object object4: iterable1) {
            arrayList3.add(((NameAndSignature)object4).getName());
        }
        SpecialGenericSignatures.e = CollectionsKt___CollectionsKt.toSet(arrayList3);
        ArrayList arrayList4 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
        for(Object object5: iterable1) {
            arrayList4.add(((NameAndSignature)object5).getSignature());
        }
        SpecialGenericSignatures.f = CollectionsKt___CollectionsKt.toSet(arrayList4);
        String s8 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s8, "INT.desc");
        NameAndSignature specialGenericSignatures$Companion$NameAndSignature0 = Companion.access$method(SpecialGenericSignatures.Companion, "java/util/List", "removeAt", s8, "Ljava/lang/Object;");
        SpecialGenericSignatures.g = specialGenericSignatures$Companion$NameAndSignature0;
        String s9 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(s9, "BYTE.desc");
        Pair pair9 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/Number", "toByte", "", s9), Name.identifier("byteValue"));
        String s10 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s10, "SHORT.desc");
        Pair pair10 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/Number", "toShort", "", s10), Name.identifier("shortValue"));
        String s11 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s11, "INT.desc");
        Pair pair11 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/Number", "toInt", "", s11), Name.identifier("intValue"));
        String s12 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(s12, "LONG.desc");
        Pair pair12 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/Number", "toLong", "", s12), Name.identifier("longValue"));
        String s13 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s13, "FLOAT.desc");
        Pair pair13 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/Number", "toFloat", "", s13), Name.identifier("floatValue"));
        String s14 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(s14, "DOUBLE.desc");
        Pair pair14 = TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/Number", "toDouble", "", s14), Name.identifier("doubleValue"));
        Pair pair15 = TuplesKt.to(specialGenericSignatures$Companion$NameAndSignature0, Name.identifier("remove"));
        String s15 = JvmPrimitiveType.INT.getDesc();
        Intrinsics.checkNotNullExpressionValue(s15, "INT.desc");
        String s16 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(s16, "CHAR.desc");
        Map map1 = x.mapOf(new Pair[]{pair9, pair10, pair11, pair12, pair13, pair14, pair15, TuplesKt.to(Companion.access$method(SpecialGenericSignatures.Companion, "java/lang/CharSequence", "get", s15, s16), Name.identifier("charAt"))});
        SpecialGenericSignatures.h = map1;
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(w.mapCapacity(map1.size()));
        for(Object object6: map1.entrySet()) {
            linkedHashMap1.put(((NameAndSignature)((Map.Entry)object6).getKey()).getSignature(), ((Map.Entry)object6).getValue());
        }
        SpecialGenericSignatures.i = linkedHashMap1;
        Iterable iterable2 = SpecialGenericSignatures.h.keySet();
        ArrayList arrayList5 = new ArrayList(l.collectionSizeOrDefault(iterable2, 10));
        for(Object object7: iterable2) {
            arrayList5.add(((NameAndSignature)object7).getName());
        }
        SpecialGenericSignatures.j = arrayList5;
        Iterable iterable3 = SpecialGenericSignatures.h.entrySet();
        ArrayList arrayList6 = new ArrayList(l.collectionSizeOrDefault(iterable3, 10));
        for(Object object8: iterable3) {
            arrayList6.add(new Pair(((NameAndSignature)((Map.Entry)object8).getKey()).getName(), ((Map.Entry)object8).getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(arrayList6, 10)), 16));
        for(Object object9: arrayList6) {
            linkedHashMap2.put(((Name)((Pair)object9).getSecond()), ((Name)((Pair)object9).getFirst()));
        }
        SpecialGenericSignatures.k = linkedHashMap2;
    }
}


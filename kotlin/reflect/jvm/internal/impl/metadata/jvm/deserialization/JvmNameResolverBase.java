package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
public class JvmNameResolverBase implements NameResolver {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Operation.values().length];
            try {
                arr_v[Operation.NONE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String[] a;
    public final Set b;
    public final List c;
    public static final List d;

    // 去混淆评级： 中等(166)
    static {
        JvmNameResolverBase.Companion = new Companion(null);
        List list0 = CollectionsKt__CollectionsKt.listOf(new String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});
        JvmNameResolverBase.d = list0;
        Iterable iterable0 = CollectionsKt___CollectionsKt.withIndex(list0);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(iterable0, 10)), 16));
        for(Object object0: iterable0) {
            linkedHashMap0.put("kotlin/collections/MutableListIterator", ((IndexedValue)object0).getIndex());
        }
    }

    public JvmNameResolverBase(@NotNull String[] arr_s, @NotNull Set set0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(arr_s, "strings");
        Intrinsics.checkNotNullParameter(set0, "localNameIndices");
        Intrinsics.checkNotNullParameter(list0, "records");
        super();
        this.a = arr_s;
        this.b = set0;
        this.c = list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int v) {
        return this.getString(v);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int v) {
        String s;
        Record jvmProtoBuf$StringTableTypes$Record0 = (Record)this.c.get(v);
        if(jvmProtoBuf$StringTableTypes$Record0.hasString()) {
            s = jvmProtoBuf$StringTableTypes$Record0.getString();
        }
        else if(jvmProtoBuf$StringTableTypes$Record0.hasPredefinedIndex()) {
            List list0 = JvmNameResolverBase.d;
            int v1 = jvmProtoBuf$StringTableTypes$Record0.getPredefinedIndex();
            s = v1 < 0 || v1 >= list0.size() ? this.a[v] : ((String)list0.get(jvmProtoBuf$StringTableTypes$Record0.getPredefinedIndex()));
        }
        else {
            s = this.a[v];
        }
        if(jvmProtoBuf$StringTableTypes$Record0.getSubstringIndexCount() >= 2) {
            List list1 = jvmProtoBuf$StringTableTypes$Record0.getSubstringIndexList();
            Intrinsics.checkNotNullExpressionValue(list1, "substringIndexList");
            Integer integer0 = (Integer)list1.get(0);
            Integer integer1 = (Integer)list1.get(1);
            Intrinsics.checkNotNullExpressionValue(integer0, "begin");
            if(((int)integer0) >= 0) {
                Intrinsics.checkNotNullExpressionValue(integer1, "end");
                if(((int)integer0) <= ((int)integer1) && ((int)integer1) <= s.length()) {
                    Intrinsics.checkNotNullExpressionValue(s, "string");
                    s = s.substring(((int)integer0), ((int)integer1));
                    Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String s1 = s;
        if(jvmProtoBuf$StringTableTypes$Record0.getReplaceCharCount() >= 2) {
            List list2 = jvmProtoBuf$StringTableTypes$Record0.getReplaceCharList();
            Intrinsics.checkNotNullExpressionValue(list2, "replaceCharList");
            Integer integer2 = (Integer)list2.get(0);
            Integer integer3 = (Integer)list2.get(1);
            Intrinsics.checkNotNullExpressionValue(s1, "string");
            s1 = p.replace$default(s1, ((char)(((int)integer2))), ((char)(((int)integer3))), false, 4, null);
        }
        String s2 = s1;
        switch(WhenMappings.$EnumSwitchMapping$0[(jvmProtoBuf$StringTableTypes$Record0.getOperation() == null ? Operation.NONE : jvmProtoBuf$StringTableTypes$Record0.getOperation()).ordinal()]) {
            case 2: {
                Intrinsics.checkNotNullExpressionValue(s2, "string");
                s2 = p.replace$default(s2, '$', '.', false, 4, null);
                break;
            }
            case 3: {
                if(s2.length() >= 2) {
                    Intrinsics.checkNotNullExpressionValue(s2, "string");
                    s2 = s2.substring(1, s2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(s2, "string");
                s2 = p.replace$default(s2, '$', '.', false, 4, null);
            }
        }
        Intrinsics.checkNotNullExpressionValue(s2, "string");
        return s2;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int v) {
        return this.b.contains(v);
    }
}


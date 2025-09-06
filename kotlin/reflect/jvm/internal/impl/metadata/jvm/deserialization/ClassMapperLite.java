package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import wb.a;

public final class ClassMapperLite {
    @NotNull
    public static final ClassMapperLite INSTANCE;
    public static final String a;
    public static final LinkedHashMap b;

    static {
        ClassMapperLite.INSTANCE = new ClassMapperLite();  // 初始化器: Ljava/lang/Object;-><init>()V
        ClassMapperLite.a = "kotlin";
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v1 = ProgressionUtilKt.getProgressionLastElement(0, CollectionsKt__CollectionsKt.listOf(new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"}).size() - 1, 2);
        if(v1 >= 0) {
            for(int v2 = 0; true; v2 += 2) {
                linkedHashMap0.put("kotlin" + '/' + "Double", "D");
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("kotlin");
                stringBuilder0.append('/');
                new StringBuilder("[").append("D");
                linkedHashMap0.put("kotlin/DoubleArray", "[D");
                if(v2 == v1) {
                    break;
                }
            }
        }
        linkedHashMap0.put("kotlin/Unit", "V");
        ClassMapperLite.a(linkedHashMap0, "Any", "java/lang/Object");
        ClassMapperLite.a(linkedHashMap0, "Nothing", "java/lang/Void");
        ClassMapperLite.a(linkedHashMap0, "Annotation", "java/lang/annotation/Annotation");
        Iterator iterator0 = CollectionsKt__CollectionsKt.listOf(new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"}).iterator();
        while(iterator0.hasNext()) {
            ClassMapperLite.a(linkedHashMap0, "Enum", "java/lang/Enum");
        }
        Iterator iterator1 = CollectionsKt__CollectionsKt.listOf(new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"}).iterator();
        while(iterator1.hasNext()) {
            ClassMapperLite.a(linkedHashMap0, "collections/ListIterator", "java/util/ListIterator");
            ClassMapperLite.a(linkedHashMap0, "collections/MutableListIterator", "java/util/ListIterator");
        }
        ClassMapperLite.a(linkedHashMap0, "collections/Iterable", "java/lang/Iterable");
        ClassMapperLite.a(linkedHashMap0, "collections/MutableIterable", "java/lang/Iterable");
        ClassMapperLite.a(linkedHashMap0, "collections/Map.Entry", "java/util/Map$Entry");
        ClassMapperLite.a(linkedHashMap0, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for(int v = 0; v < 23; ++v) {
            ClassMapperLite.a(linkedHashMap0, "Function" + v, "kotlin/jvm/functions/Function" + v);
            ClassMapperLite.a(linkedHashMap0, "reflect/KFunction" + v, "kotlin/reflect/KFunction");
        }
        Iterator iterator2 = CollectionsKt__CollectionsKt.listOf(new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"}).iterator();
        while(iterator2.hasNext()) {
            ClassMapperLite.a(linkedHashMap0, "Enum.Companion", "kotlin/jvm/internal/EnumCompanionObject");
        }
        ClassMapperLite.b = linkedHashMap0;
    }

    public static final void a(LinkedHashMap linkedHashMap0, String s, String s1) {
        linkedHashMap0.put("kotlin" + '/' + s, "L" + s1 + ';');
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "classId");
        String s1 = (String)ClassMapperLite.b.get(s);
        if(s1 == null) {
            StringBuilder stringBuilder0 = new StringBuilder("L");
            return a.b(';', p.replace$default(s, '.', '$', false, 4, null), stringBuilder0);
        }
        return s1;
    }
}


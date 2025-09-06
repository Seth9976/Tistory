package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nKotlinTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,140:1\n3792#2:141\n4307#2,2:142\n*S KotlinDebug\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n*L\n81#1:141\n81#1:142,2\n*E\n"})
public enum KotlinTarget {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    EXPRESSION(false),
    FILE(false),
    TYPEALIAS(false),
    TYPE_PROJECTION(false),
    STAR_PROJECTION(false),
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    LOCAL_FUNCTION(false),
    MEMBER_FUNCTION(false),
    TOP_LEVEL_FUNCTION(false),
    MEMBER_PROPERTY(false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    TOP_LEVEL_PROPERTY(false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    BACKING_FIELD(true),
    INITIALIZER(false),
    DESTRUCTURING_DECLARATION(false),
    LAMBDA_EXPRESSION(false),
    ANONYMOUS_FUNCTION(false),
    OBJECT_LITERAL(false);

    @NotNull
    public static final Companion Companion;
    public final boolean a;
    public static final HashMap b;
    public static final Set c;
    public static final Set d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final List l;
    public static final List m;
    public static final List n;
    public static final List o;
    public static final List p;
    public static final Map q;

    static {
        Set set3;
        Set set2;
        Set set0;
        KotlinTarget.Companion = new Companion(null);
        KotlinTarget.b = new HashMap();
        KotlinTarget[] arr_kotlinTarget = (KotlinTarget[])KotlinTarget.r.clone();
        for(int v = 0; v < arr_kotlinTarget.length; ++v) {
            KotlinTarget kotlinTarget0 = arr_kotlinTarget[v];
            KotlinTarget.b.put(kotlinTarget0.name(), kotlinTarget0);
        }
        KotlinTarget[] arr_kotlinTarget1 = (KotlinTarget[])KotlinTarget.r.clone();
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_kotlinTarget1.length; ++v1) {
            KotlinTarget kotlinTarget1 = arr_kotlinTarget1[v1];
            if(kotlinTarget1.a) {
                arrayList0.add(kotlinTarget1);
            }
        }
        if(arrayList0 instanceof Collection) {
            switch(arrayList0.size()) {
                case 0: {
                    set0 = EmptySet.INSTANCE;
                    break;
                }
                case 1: {
                    Set set1 = Collections.singleton((arrayList0 instanceof List ? arrayList0.get(0) : arrayList0.iterator().next()));
                    Intrinsics.checkNotNullExpressionValue(set1, "singleton(...)");
                    set0 = set1;
                    break;
                }
                default: {
                    int v2 = arrayList0.size();
                    if(v2 >= 0) {
                        if(v2 < 3) {
                            ++v2;
                        }
                        else {
                            v2 = v2 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v2) / 0.75f + 1.0f));
                        }
                    }
                    set0 = (Set)CollectionsKt___CollectionsKt.toCollection(arrayList0, new LinkedHashSet(v2));
                }
            }
            set2 = set0;
        }
        else {
            Collection collection0 = new LinkedHashSet();
            Intrinsics.checkNotNullParameter(arrayList0, "<this>");
            Intrinsics.checkNotNullParameter(collection0, "destination");
            for(Object object0: arrayList0) {
                collection0.add(object0);
            }
            set2 = f0.optimizeReadOnlySet(((Set)collection0));
        }
        KotlinTarget.c = set2;
        Object[] arr_object = (KotlinTarget[])KotlinTarget.r.clone();
        Intrinsics.checkNotNullParameter(arr_object, "<this>");
        switch(arr_object.length) {
            case 0: {
                set3 = f0.emptySet();
                break;
            }
            case 1: {
                set3 = e0.setOf(arr_object[0]);
                break;
            }
            default: {
                set3 = (Set)ArraysKt___ArraysKt.toCollection(arr_object, new LinkedHashSet(w.mapCapacity(arr_object.length)));
            }
        }
        KotlinTarget.d = set3;
        Object[] arr_object1 = {KotlinTarget.ANNOTATION_CLASS, KotlinTarget.CLASS};
        Intrinsics.checkNotNullParameter(arr_object1, "<this>");
        List list0 = Arrays.asList(arr_object1);
        Intrinsics.checkNotNullExpressionValue(list0, "asList(...)");
        KotlinTarget.e = list0;
        Object[] arr_object2 = {KotlinTarget.LOCAL_CLASS, KotlinTarget.CLASS};
        Intrinsics.checkNotNullParameter(arr_object2, "<this>");
        List list1 = Arrays.asList(arr_object2);
        Intrinsics.checkNotNullExpressionValue(list1, "asList(...)");
        KotlinTarget.f = list1;
        Object[] arr_object3 = {KotlinTarget.CLASS_ONLY, KotlinTarget.CLASS};
        Intrinsics.checkNotNullParameter(arr_object3, "elements");
        KotlinTarget.g = ArraysKt___ArraysJvmKt.asList(arr_object3);
        Object[] arr_object4 = {KotlinTarget.COMPANION_OBJECT, KotlinTarget.OBJECT, KotlinTarget.CLASS};
        Intrinsics.checkNotNullParameter(arr_object4, "elements");
        KotlinTarget.h = ArraysKt___ArraysJvmKt.asList(arr_object4);
        Object[] arr_object5 = {KotlinTarget.STANDALONE_OBJECT, KotlinTarget.OBJECT, KotlinTarget.CLASS};
        Intrinsics.checkNotNullParameter(arr_object5, "elements");
        KotlinTarget.i = ArraysKt___ArraysJvmKt.asList(arr_object5);
        Object[] arr_object6 = {KotlinTarget.INTERFACE, KotlinTarget.CLASS};
        Intrinsics.checkNotNullParameter(arr_object6, "elements");
        KotlinTarget.j = ArraysKt___ArraysJvmKt.asList(arr_object6);
        KotlinTarget.k = CollectionsKt__CollectionsKt.listOf(new KotlinTarget[]{KotlinTarget.ENUM_CLASS, KotlinTarget.CLASS});
        KotlinTarget.l = CollectionsKt__CollectionsKt.listOf(new KotlinTarget[]{KotlinTarget.ENUM_ENTRY, KotlinTarget.PROPERTY, KotlinTarget.FIELD});
        KotlinTarget.m = k.listOf(KotlinTarget.PROPERTY_SETTER);
        KotlinTarget.n = k.listOf(KotlinTarget.PROPERTY_GETTER);
        KotlinTarget.o = k.listOf(KotlinTarget.FUNCTION);
        KotlinTarget.p = k.listOf(KotlinTarget.FILE);
        KotlinTarget.q = x.mapOf(new Pair[]{TuplesKt.to(AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER, KotlinTarget.VALUE_PARAMETER), TuplesKt.to(AnnotationUseSiteTarget.FIELD, KotlinTarget.FIELD), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY, KotlinTarget.PROPERTY), TuplesKt.to(AnnotationUseSiteTarget.FILE, KotlinTarget.FILE), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_GETTER), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_SETTER, KotlinTarget.PROPERTY_SETTER), TuplesKt.to(AnnotationUseSiteTarget.RECEIVER, KotlinTarget.VALUE_PARAMETER), TuplesKt.to(AnnotationUseSiteTarget.SETTER_PARAMETER, KotlinTarget.VALUE_PARAMETER), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, KotlinTarget.FIELD)});
    }

    public KotlinTarget(boolean z) {
        this.a = z;
    }
}


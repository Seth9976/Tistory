package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KClass;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001RB\u0013\u0012\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0002H\u0017\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\r\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u0002H\u0096\u0002\u00A2\u0006\u0004\b\r\u0010\u000BJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013R\u001E\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001A\u0004\u0018\u00010\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0013R\u0016\u0010\u001B\u001A\u0004\u0018\u00010\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u0013R\u001E\u0010 \u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001D0\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR \u0010#\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020!0\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010\u001FR\u001E\u0010%\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010\u001FR\u001A\u0010*\u001A\b\u0012\u0004\u0012\u00020\'0&8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010)R\u0016\u0010-\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b+\u0010,R \u00102\u001A\b\u0012\u0004\u0012\u00020.0&8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b0\u00101\u001A\u0004\b/\u0010)R \u00106\u001A\b\u0012\u0004\u0012\u0002030&8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b5\u00101\u001A\u0004\b4\u0010)R(\u00109\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010&8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b8\u00101\u001A\u0004\b7\u0010)R\u001C\u0010>\u001A\u0004\u0018\u00010:8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b=\u00101\u001A\u0004\b;\u0010<R\u001A\u0010?\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bA\u00101\u001A\u0004\b?\u0010@R\u001A\u0010B\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bC\u00101\u001A\u0004\bB\u0010@R\u001A\u0010D\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bE\u00101\u001A\u0004\bD\u0010@R\u001A\u0010F\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bG\u00101\u001A\u0004\bF\u0010@R\u001A\u0010H\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bI\u00101\u001A\u0004\bH\u0010@R\u001A\u0010J\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bK\u00101\u001A\u0004\bJ\u0010@R\u001A\u0010L\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bM\u00101\u001A\u0004\bL\u0010@R\u001A\u0010N\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bO\u00101\u001A\u0004\bN\u0010@R\u001A\u0010P\u001A\u00020\t8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bQ\u00101\u001A\u0004\bP\u0010@\u00A8\u0006S"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "getSimpleName", "simpleName", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "getSealedSubclasses", "getSealedSubclasses$annotations", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isCompanion", "isCompanion$annotations", "isFun", "isFun$annotations", "isValue", "isValue$annotations", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class ClassReference implements ClassBasedDeclarationContainer, KClass {
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001B\u0010\u0007\u001A\u0004\u0018\u00010\u00042\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\u0006J#\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u00012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\n\u0010\u000BR,\u0010\u000F\u001A\u001A\u0012\u0010\u0012\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\u0002\u0012\u0004\u0012\u00020\u000E0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010R0\u0010\u0013\u001A\u001E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011j\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R0\u0010\u0015\u001A\u001E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011j\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R0\u0010\u0016\u001A\u001E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011j\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "Ljava/lang/Class;", "jClass", "", "getClassSimpleName", "(Ljava/lang/Class;)Ljava/lang/String;", "getClassQualifiedName", "value", "", "isInstance", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final String getClassQualifiedName(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "jClass");
            String s = null;
            if(!class0.isAnonymousClass() && !class0.isLocalClass()) {
                if(class0.isArray()) {
                    Class class1 = class0.getComponentType();
                    if(class1.isPrimitive()) {
                        String s1 = (String)ClassReference.c.get(class1.getName());
                        if(s1 != null) {
                            s = s1 + "Array";
                        }
                    }
                    return s == null ? "kotlin.Array" : s;
                }
                s = (String)ClassReference.c.get(class0.getName());
                return s == null ? class0.getCanonicalName() : s;
            }
            return null;
        }

        @Nullable
        public final String getClassSimpleName(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "jClass");
            String s = null;
            if(!class0.isAnonymousClass()) {
                if(class0.isLocalClass()) {
                    String s1 = class0.getSimpleName();
                    Method method0 = class0.getEnclosingMethod();
                    if(method0 != null) {
                        Intrinsics.checkNotNull(s1);
                        String s2 = StringsKt__StringsKt.substringAfter$default(s1, method0.getName() + '$', null, 2, null);
                        if(s2 != null) {
                            return s2;
                        }
                    }
                    Constructor constructor0 = class0.getEnclosingConstructor();
                    if(constructor0 != null) {
                        Intrinsics.checkNotNull(s1);
                        return StringsKt__StringsKt.substringAfter$default(s1, constructor0.getName() + '$', null, 2, null);
                    }
                    Intrinsics.checkNotNull(s1);
                    return StringsKt__StringsKt.substringAfter$default(s1, '$', null, 2, null);
                }
                if(class0.isArray()) {
                    Class class1 = class0.getComponentType();
                    if(class1.isPrimitive()) {
                        String s3 = (String)ClassReference.d.get(class1.getName());
                        if(s3 != null) {
                            s = s3 + "Array";
                        }
                    }
                    return s == null ? "Array" : s;
                }
                s = (String)ClassReference.d.get(class0.getName());
                return s == null ? class0.getSimpleName() : s;
            }
            return null;
        }

        public final boolean isInstance(@Nullable Object object0, @NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "jClass");
            Map map0 = ClassReference.b;
            Intrinsics.checkNotNull(map0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer integer0 = (Integer)map0.get(class0);
            if(integer0 != null) {
                return TypeIntrinsics.isFunctionOfArity(object0, integer0.intValue());
            }
            if(class0.isPrimitive()) {
                class0 = JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(class0));
            }
            return class0.isInstance(object0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Class a;
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap d;

    static {
        ClassReference.Companion = new Companion(null);
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        int v = 0;
        for(Object object0: iterable0) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList0.add(TuplesKt.to(((Class)object0), v));
            ++v;
        }
        ClassReference.b = x.toMap(arrayList0);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("boolean", "kotlin.Boolean");
        hashMap0.put("char", "kotlin.Char");
        hashMap0.put("byte", "kotlin.Byte");
        hashMap0.put("short", "kotlin.Short");
        hashMap0.put("int", "kotlin.Int");
        hashMap0.put("float", "kotlin.Float");
        hashMap0.put("long", "kotlin.Long");
        hashMap0.put("double", "kotlin.Double");
        HashMap hashMap1 = new HashMap();
        hashMap1.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap1.put("java.lang.Character", "kotlin.Char");
        hashMap1.put("java.lang.Byte", "kotlin.Byte");
        hashMap1.put("java.lang.Short", "kotlin.Short");
        hashMap1.put("java.lang.Integer", "kotlin.Int");
        hashMap1.put("java.lang.Float", "kotlin.Float");
        hashMap1.put("java.lang.Long", "kotlin.Long");
        hashMap1.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Object", "kotlin.Any");
        hashMap2.put("java.lang.String", "kotlin.String");
        hashMap2.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap2.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap2.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap2.put("java.lang.Number", "kotlin.Number");
        hashMap2.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap2.put("java.lang.Enum", "kotlin.Enum");
        hashMap2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap2.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap2.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap2.put("java.util.List", "kotlin.collections.List");
        hashMap2.put("java.util.Set", "kotlin.collections.Set");
        hashMap2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap2.put("java.util.Map", "kotlin.collections.Map");
        hashMap2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap2.putAll(hashMap0);
        hashMap2.putAll(hashMap1);
        Collection collection0 = hashMap0.values();
        Intrinsics.checkNotNullExpressionValue(collection0, "<get-values>(...)");
        Iterator iterator1 = collection0.iterator();
        while(iterator1.hasNext()) {
            new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.checkNotNull("kotlin.Long");
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("kotlin.Long");
            stringBuilder0.append(".Companion");
            TuplesKt.to("kotlin.jvm.internal.LongCompanionObject", "kotlin.Long.Companion");
            hashMap2.put("kotlin.jvm.internal.LongCompanionObject", "kotlin.Long.Companion");
        }
        for(Object object1: ClassReference.b.entrySet()) {
            hashMap2.put("kotlin.jvm.functions.Function22", "kotlin.Function" + ((Number)((Map.Entry)object1).getValue()).intValue());
        }
        ClassReference.c = hashMap2;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.mapCapacity(hashMap2.size()));
        Iterator iterator3 = hashMap2.entrySet().iterator();
        while(iterator3.hasNext()) {
            iterator3.next();
            linkedHashMap0.put("java.lang.Comparable", "Comparable");
        }
        ClassReference.d = linkedHashMap0;
    }

    public ClassReference(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        super();
        this.a = class0;
    }

    public static void a() {
        throw new KotlinReflectionNotSupportedError();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.KClass
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof ClassReference && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType(((KClass)object0)));
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List getAnnotations() {
        ClassReference.a();
        throw null;
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public Collection getConstructors() {
        ClassReference.a();
        throw null;
    }

    @Override  // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class getJClass() {
        return this.a;
    }

    @Override  // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection getMembers() {
        ClassReference.a();
        throw null;
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public Collection getNestedClasses() {
        ClassReference.a();
        throw null;
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public Object getObjectInstance() {
        ClassReference.a();
        throw null;
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public String getQualifiedName() {
        return ClassReference.Companion.getClassQualifiedName(this.getJClass());
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public List getSealedSubclasses() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.3")
    public static void getSealedSubclasses$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public String getSimpleName() {
        return ClassReference.Companion.getClassSimpleName(this.getJClass());
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public List getSupertypes() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void getSupertypes$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    @NotNull
    public List getTypeParameters() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void getTypeParameters$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    @Nullable
    public KVisibility getVisibility() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void getVisibility$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override  // kotlin.reflect.KClass
    public boolean isAbstract() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isAbstract$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isCompanion() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isCompanion$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isData() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isData$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isFinal() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isFinal$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isFun() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.4")
    public static void isFun$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isInner() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isInner$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    @SinceKotlin(version = "1.1")
    public boolean isInstance(@Nullable Object object0) {
        return ClassReference.Companion.isInstance(object0, this.getJClass());
    }

    @Override  // kotlin.reflect.KClass
    public boolean isOpen() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isOpen$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isSealed() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.1")
    public static void isSealed$annotations() {
    }

    @Override  // kotlin.reflect.KClass
    public boolean isValue() {
        ClassReference.a();
        throw null;
    }

    @SinceKotlin(version = "1.5")
    public static void isValue$annotations() {
    }

    @Override
    @NotNull
    public String toString() {
        return this.getJClass().toString() + " (Kotlin reflection is not available)";
    }
}


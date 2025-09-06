package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class StandardNames {
    @SourceDebugExtension({"SMAP\nStandardNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,295:1\n11670#2,3:296\n11670#2,3:299\n*S KotlinDebug\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n*L\n191#1:296,3\n195#1:299,3\n*E\n"})
    public static final class FqNames {
        @NotNull
        public static final FqNames INSTANCE;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _boolean;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _byte;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _char;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _double;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _enum;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _float;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _int;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _long;
        @JvmField
        @NotNull
        public static final FqNameUnsafe _short;
        @JvmField
        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;
        @JvmField
        @NotNull
        public static final FqName annotation;
        @JvmField
        @NotNull
        public static final FqName annotationRetention;
        @JvmField
        @NotNull
        public static final FqName annotationTarget;
        @JvmField
        @NotNull
        public static final FqNameUnsafe any;
        @JvmField
        @NotNull
        public static final FqNameUnsafe array;
        @JvmField
        @NotNull
        public static final Map arrayClassFqNameToPrimitiveType;
        @JvmField
        @NotNull
        public static final FqNameUnsafe charSequence;
        @JvmField
        @NotNull
        public static final FqNameUnsafe cloneable;
        @JvmField
        @NotNull
        public static final FqName collection;
        @JvmField
        @NotNull
        public static final FqName comparable;
        @JvmField
        @NotNull
        public static final FqName contextFunctionTypeParams;
        @JvmField
        @NotNull
        public static final FqName deprecated;
        @JvmField
        @NotNull
        public static final FqName deprecatedSinceKotlin;
        @JvmField
        @NotNull
        public static final FqName deprecationLevel;
        @JvmField
        @NotNull
        public static final FqName extensionFunctionType;
        @JvmField
        @NotNull
        public static final Map fqNameToPrimitiveType;
        @JvmField
        @NotNull
        public static final FqNameUnsafe functionSupertype;
        @JvmField
        @NotNull
        public static final FqNameUnsafe intRange;
        @JvmField
        @NotNull
        public static final FqName iterable;
        @JvmField
        @NotNull
        public static final FqName iterator;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kCallable;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kClass;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty0;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty1;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty2;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;
        @JvmField
        @NotNull
        public static final ClassId kProperty;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty0;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty1;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty2;
        @JvmField
        @NotNull
        public static final FqNameUnsafe kPropertyFqName;
        @JvmField
        @NotNull
        public static final FqName list;
        @JvmField
        @NotNull
        public static final FqName listIterator;
        @JvmField
        @NotNull
        public static final FqNameUnsafe longRange;
        @JvmField
        @NotNull
        public static final FqName map;
        @JvmField
        @NotNull
        public static final FqName mapEntry;
        @JvmField
        @NotNull
        public static final FqName mustBeDocumented;
        @JvmField
        @NotNull
        public static final FqName mutableCollection;
        @JvmField
        @NotNull
        public static final FqName mutableIterable;
        @JvmField
        @NotNull
        public static final FqName mutableIterator;
        @JvmField
        @NotNull
        public static final FqName mutableList;
        @JvmField
        @NotNull
        public static final FqName mutableListIterator;
        @JvmField
        @NotNull
        public static final FqName mutableMap;
        @JvmField
        @NotNull
        public static final FqName mutableMapEntry;
        @JvmField
        @NotNull
        public static final FqName mutableSet;
        @JvmField
        @NotNull
        public static final FqNameUnsafe nothing;
        @JvmField
        @NotNull
        public static final FqNameUnsafe number;
        @JvmField
        @NotNull
        public static final FqName parameterName;
        @JvmField
        @NotNull
        public static final ClassId parameterNameClassId;
        @JvmField
        @NotNull
        public static final Set primitiveArrayTypeShortNames;
        @JvmField
        @NotNull
        public static final Set primitiveTypeShortNames;
        @JvmField
        @NotNull
        public static final FqName publishedApi;
        @JvmField
        @NotNull
        public static final FqName repeatable;
        @JvmField
        @NotNull
        public static final ClassId repeatableClassId;
        @JvmField
        @NotNull
        public static final FqName replaceWith;
        @JvmField
        @NotNull
        public static final FqName retention;
        @JvmField
        @NotNull
        public static final ClassId retentionClassId;
        @JvmField
        @NotNull
        public static final FqName set;
        @JvmField
        @NotNull
        public static final FqNameUnsafe string;
        @JvmField
        @NotNull
        public static final FqName suppress;
        @JvmField
        @NotNull
        public static final FqName target;
        @JvmField
        @NotNull
        public static final ClassId targetClassId;
        @JvmField
        @NotNull
        public static final FqName throwable;
        @JvmField
        @NotNull
        public static final ClassId uByte;
        @JvmField
        @NotNull
        public static final FqName uByteArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uByteFqName;
        @JvmField
        @NotNull
        public static final ClassId uInt;
        @JvmField
        @NotNull
        public static final FqName uIntArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uIntFqName;
        @JvmField
        @NotNull
        public static final ClassId uLong;
        @JvmField
        @NotNull
        public static final FqName uLongArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uLongFqName;
        @JvmField
        @NotNull
        public static final ClassId uShort;
        @JvmField
        @NotNull
        public static final FqName uShortArrayFqName;
        @JvmField
        @NotNull
        public static final FqName uShortFqName;
        @JvmField
        @NotNull
        public static final FqNameUnsafe unit;
        @JvmField
        @NotNull
        public static final FqName unsafeVariance;

        static {
            FqNames.INSTANCE = new FqNames();  // 初始化器: Ljava/lang/Object;-><init>()V
            FqNames.any = FqNames.d("Any");
            FqNames.nothing = FqNames.d("Nothing");
            FqNames.cloneable = FqNames.d("Cloneable");
            FqNames.suppress = FqNames.c("Suppress");
            FqNames.unit = FqNames.d("Unit");
            FqNames.charSequence = FqNames.d("CharSequence");
            FqNames.string = FqNames.d("String");
            FqNames.array = FqNames.d("Array");
            FqNames._boolean = FqNames.d("Boolean");
            FqNames._char = FqNames.d("Char");
            FqNames._byte = FqNames.d("Byte");
            FqNames._short = FqNames.d("Short");
            FqNames._int = FqNames.d("Int");
            FqNames._long = FqNames.d("Long");
            FqNames._float = FqNames.d("Float");
            FqNames._double = FqNames.d("Double");
            FqNames.number = FqNames.d("Number");
            FqNames._enum = FqNames.d("Enum");
            FqNames.functionSupertype = FqNames.d("Function");
            FqNames.throwable = FqNames.c("Throwable");
            FqNames.comparable = FqNames.c("Comparable");
            Name name0 = Name.identifier("IntRange");
            FqNameUnsafe fqNameUnsafe0 = StandardNames.RANGES_PACKAGE_FQ_NAME.child(name0).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            FqNames.intRange = fqNameUnsafe0;
            Name name1 = Name.identifier("LongRange");
            FqNameUnsafe fqNameUnsafe1 = StandardNames.RANGES_PACKAGE_FQ_NAME.child(name1).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe1, "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            FqNames.longRange = fqNameUnsafe1;
            FqNames.deprecated = FqNames.c("Deprecated");
            FqNames.deprecatedSinceKotlin = FqNames.c("DeprecatedSinceKotlin");
            FqNames.deprecationLevel = FqNames.c("DeprecationLevel");
            FqNames.replaceWith = FqNames.c("ReplaceWith");
            FqNames.extensionFunctionType = FqNames.c("ExtensionFunctionType");
            FqNames.contextFunctionTypeParams = FqNames.c("ContextFunctionTypeParams");
            FqName fqName0 = FqNames.c("ParameterName");
            FqNames.parameterName = fqName0;
            ClassId classId0 = ClassId.topLevel(fqName0);
            Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(parameterName)");
            FqNames.parameterNameClassId = classId0;
            FqNames.annotation = FqNames.c("Annotation");
            FqName fqName1 = FqNames.a("Target");
            FqNames.target = fqName1;
            ClassId classId1 = ClassId.topLevel(fqName1);
            Intrinsics.checkNotNullExpressionValue(classId1, "topLevel(target)");
            FqNames.targetClassId = classId1;
            FqNames.annotationTarget = FqNames.a("AnnotationTarget");
            FqNames.annotationRetention = FqNames.a("AnnotationRetention");
            FqName fqName2 = FqNames.a("Retention");
            FqNames.retention = fqName2;
            ClassId classId2 = ClassId.topLevel(fqName2);
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(retention)");
            FqNames.retentionClassId = classId2;
            FqName fqName3 = FqNames.a("Repeatable");
            FqNames.repeatable = fqName3;
            ClassId classId3 = ClassId.topLevel(fqName3);
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(repeatable)");
            FqNames.repeatableClassId = classId3;
            FqNames.mustBeDocumented = FqNames.a("MustBeDocumented");
            FqNames.unsafeVariance = FqNames.c("UnsafeVariance");
            FqNames.publishedApi = FqNames.c("PublishedApi");
            Name name2 = Name.identifier("AccessibleLateinitPropertyLiteral");
            FqName fqName4 = StandardNames.KOTLIN_INTERNAL_FQ_NAME.child(name2);
            Intrinsics.checkNotNullExpressionValue(fqName4, "KOTLIN_INTERNAL_FQ_NAME.…e.identifier(simpleName))");
            FqNames.accessibleLateinitPropertyLiteral = fqName4;
            FqNames.iterator = FqNames.b("Iterator");
            FqNames.iterable = FqNames.b("Iterable");
            FqNames.collection = FqNames.b("Collection");
            FqNames.list = FqNames.b("List");
            FqNames.listIterator = FqNames.b("ListIterator");
            FqNames.set = FqNames.b("Set");
            FqName fqName5 = FqNames.b("Map");
            FqNames.map = fqName5;
            FqName fqName6 = fqName5.child(Name.identifier("Entry"));
            Intrinsics.checkNotNullExpressionValue(fqName6, "map.child(Name.identifier(\"Entry\"))");
            FqNames.mapEntry = fqName6;
            FqNames.mutableIterator = FqNames.b("MutableIterator");
            FqNames.mutableIterable = FqNames.b("MutableIterable");
            FqNames.mutableCollection = FqNames.b("MutableCollection");
            FqNames.mutableList = FqNames.b("MutableList");
            FqNames.mutableListIterator = FqNames.b("MutableListIterator");
            FqNames.mutableSet = FqNames.b("MutableSet");
            FqName fqName7 = FqNames.b("MutableMap");
            FqNames.mutableMap = fqName7;
            FqName fqName8 = fqName7.child(Name.identifier("MutableEntry"));
            Intrinsics.checkNotNullExpressionValue(fqName8, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            FqNames.mutableMapEntry = fqName8;
            FqNames.kClass = FqNames.reflect("KClass");
            FqNames.kCallable = FqNames.reflect("KCallable");
            FqNames.kProperty0 = FqNames.reflect("KProperty0");
            FqNames.kProperty1 = FqNames.reflect("KProperty1");
            FqNames.kProperty2 = FqNames.reflect("KProperty2");
            FqNames.kMutableProperty0 = FqNames.reflect("KMutableProperty0");
            FqNames.kMutableProperty1 = FqNames.reflect("KMutableProperty1");
            FqNames.kMutableProperty2 = FqNames.reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafe2 = FqNames.reflect("KProperty");
            FqNames.kPropertyFqName = fqNameUnsafe2;
            FqNames.kMutablePropertyFqName = FqNames.reflect("KMutableProperty");
            ClassId classId4 = ClassId.topLevel(fqNameUnsafe2.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(kPropertyFqName.toSafe())");
            FqNames.kProperty = classId4;
            FqNames.kDeclarationContainer = FqNames.reflect("KDeclarationContainer");
            FqName fqName9 = FqNames.c("UByte");
            FqNames.uByteFqName = fqName9;
            FqName fqName10 = FqNames.c("UShort");
            FqNames.uShortFqName = fqName10;
            FqName fqName11 = FqNames.c("UInt");
            FqNames.uIntFqName = fqName11;
            FqName fqName12 = FqNames.c("ULong");
            FqNames.uLongFqName = fqName12;
            ClassId classId5 = ClassId.topLevel(fqName9);
            Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(uByteFqName)");
            FqNames.uByte = classId5;
            ClassId classId6 = ClassId.topLevel(fqName10);
            Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(uShortFqName)");
            FqNames.uShort = classId6;
            ClassId classId7 = ClassId.topLevel(fqName11);
            Intrinsics.checkNotNullExpressionValue(classId7, "topLevel(uIntFqName)");
            FqNames.uInt = classId7;
            ClassId classId8 = ClassId.topLevel(fqName12);
            Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(uLongFqName)");
            FqNames.uLong = classId8;
            FqNames.uByteArrayFqName = FqNames.c("UByteArray");
            FqNames.uShortArrayFqName = FqNames.c("UShortArray");
            FqNames.uIntArrayFqName = FqNames.c("UIntArray");
            FqNames.uLongArrayFqName = FqNames.c("ULongArray");
            HashSet hashSet0 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] arr_primitiveType = PrimitiveType.values();
            for(int v1 = 0; v1 < arr_primitiveType.length; ++v1) {
                hashSet0.add(arr_primitiveType[v1].getTypeName());
            }
            FqNames.primitiveTypeShortNames = hashSet0;
            HashSet hashSet1 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] arr_primitiveType1 = PrimitiveType.values();
            for(int v2 = 0; v2 < arr_primitiveType1.length; ++v2) {
                hashSet1.add(arr_primitiveType1[v2].getArrayTypeName());
            }
            FqNames.primitiveArrayTypeShortNames = hashSet1;
            HashMap hashMap0 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] arr_primitiveType2 = PrimitiveType.values();
            for(int v3 = 0; v3 < arr_primitiveType2.length; ++v3) {
                PrimitiveType primitiveType0 = arr_primitiveType2[v3];
                String s = primitiveType0.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(s, "primitiveType.typeName.asString()");
                FqNames.INSTANCE.getClass();
                hashMap0.put(FqNames.d(s), primitiveType0);
            }
            FqNames.fqNameToPrimitiveType = hashMap0;
            HashMap hashMap1 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] arr_primitiveType3 = PrimitiveType.values();
            for(int v = 0; v < arr_primitiveType3.length; ++v) {
                PrimitiveType primitiveType1 = arr_primitiveType3[v];
                String s1 = primitiveType1.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(s1, "primitiveType.arrayTypeName.asString()");
                FqNames.INSTANCE.getClass();
                hashMap1.put(FqNames.d(s1), primitiveType1);
            }
            FqNames.arrayClassFqNameToPrimitiveType = hashMap1;
        }

        public static FqName a(String s) {
            Name name0 = Name.identifier(s);
            FqName fqName0 = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(name0);
            Intrinsics.checkNotNullExpressionValue(fqName0, "ANNOTATION_PACKAGE_FQ_NA…e.identifier(simpleName))");
            return fqName0;
        }

        public static FqName b(String s) {
            Name name0 = Name.identifier(s);
            FqName fqName0 = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(name0);
            Intrinsics.checkNotNullExpressionValue(fqName0, "COLLECTIONS_PACKAGE_FQ_N…e.identifier(simpleName))");
            return fqName0;
        }

        public static FqName c(String s) {
            Name name0 = Name.identifier(s);
            FqName fqName0 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(name0);
            Intrinsics.checkNotNullExpressionValue(fqName0, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(simpleName))");
            return fqName0;
        }

        public static FqNameUnsafe d(String s) {
            FqNameUnsafe fqNameUnsafe0 = FqNames.c(s).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "fqName(simpleName).toUnsafe()");
            return fqNameUnsafe0;
        }

        @JvmStatic
        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "simpleName");
            Name name0 = Name.identifier(s);
            FqNameUnsafe fqNameUnsafe0 = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(name0).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return fqNameUnsafe0;
        }
    }

    @JvmField
    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name BACKING_FIELD;
    @JvmField
    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final Set BUILT_INS_PACKAGE_FQ_NAMES;
    @JvmField
    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;
    @JvmField
    @NotNull
    public static final Name CHAR_CODE;
    @JvmField
    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    @JvmField
    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;
    @JvmField
    @NotNull
    public static final Name DATA_CLASS_COPY;
    @JvmField
    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;
    @JvmField
    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name ENUM_ENTRIES;
    @JvmField
    @NotNull
    public static final Name ENUM_VALUES;
    @JvmField
    @NotNull
    public static final Name ENUM_VALUE_OF;
    @JvmField
    @NotNull
    public static final Name HASHCODE_NAME;
    @NotNull
    public static final StandardNames INSTANCE;
    @JvmField
    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;
    @JvmField
    @NotNull
    public static final Name NEXT_CHAR;
    @JvmField
    @NotNull
    public static final List PREFIXES;
    @JvmField
    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName RESULT_FQ_NAME;
    @JvmField
    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    static {
        StandardNames.INSTANCE = new StandardNames();  // 初始化器: Ljava/lang/Object;-><init>()V
        Name name0 = Name.identifier("field");
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"field\")");
        StandardNames.BACKING_FIELD = name0;
        Name name1 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(name1, "identifier(\"value\")");
        StandardNames.DEFAULT_VALUE_PARAMETER = name1;
        Name name2 = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(name2, "identifier(\"values\")");
        StandardNames.ENUM_VALUES = name2;
        Name name3 = Name.identifier("entries");
        Intrinsics.checkNotNullExpressionValue(name3, "identifier(\"entries\")");
        StandardNames.ENUM_ENTRIES = name3;
        Name name4 = Name.identifier("valueOf");
        Intrinsics.checkNotNullExpressionValue(name4, "identifier(\"valueOf\")");
        StandardNames.ENUM_VALUE_OF = name4;
        Name name5 = Name.identifier("copy");
        Intrinsics.checkNotNullExpressionValue(name5, "identifier(\"copy\")");
        StandardNames.DATA_CLASS_COPY = name5;
        StandardNames.DATA_CLASS_COMPONENT_PREFIX = "component";
        Name name6 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(name6, "identifier(\"hashCode\")");
        StandardNames.HASHCODE_NAME = name6;
        Name name7 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(name7, "identifier(\"code\")");
        StandardNames.CHAR_CODE = name7;
        Name name8 = Name.identifier("nextChar");
        Intrinsics.checkNotNullExpressionValue(name8, "identifier(\"nextChar\")");
        StandardNames.NEXT_CHAR = name8;
        Name name9 = Name.identifier("count");
        Intrinsics.checkNotNullExpressionValue(name9, "identifier(\"count\")");
        StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = name9;
        StandardNames.DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName0 = new FqName("kotlin.coroutines");
        StandardNames.COROUTINES_PACKAGE_FQ_NAME = fqName0;
        StandardNames.COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        StandardNames.COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        FqName fqName1 = fqName0.child(Name.identifier("Continuation"));
        Intrinsics.checkNotNullExpressionValue(fqName1, "COROUTINES_PACKAGE_FQ_NA…entifier(\"Continuation\"))");
        StandardNames.CONTINUATION_INTERFACE_FQ_NAME = fqName1;
        StandardNames.RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        StandardNames.KOTLIN_REFLECT_FQ_NAME = fqName2;
        StandardNames.PREFIXES = CollectionsKt__CollectionsKt.listOf(new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name name10 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(name10, "identifier(\"kotlin\")");
        StandardNames.BUILT_INS_PACKAGE_NAME = name10;
        FqName fqName3 = FqName.topLevel(name10);
        Intrinsics.checkNotNullExpressionValue(fqName3, "topLevel(BUILT_INS_PACKAGE_NAME)");
        StandardNames.BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName fqName4 = fqName3.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(fqName4, "BUILT_INS_PACKAGE_FQ_NAM…identifier(\"annotation\"))");
        StandardNames.ANNOTATION_PACKAGE_FQ_NAME = fqName4;
        FqName fqName5 = fqName3.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(fqName5, "BUILT_INS_PACKAGE_FQ_NAM…dentifier(\"collections\"))");
        StandardNames.COLLECTIONS_PACKAGE_FQ_NAME = fqName5;
        FqName fqName6 = fqName3.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(fqName6, "BUILT_INS_PACKAGE_FQ_NAM…ame.identifier(\"ranges\"))");
        StandardNames.RANGES_PACKAGE_FQ_NAME = fqName6;
        FqName fqName7 = fqName3.child(Name.identifier("text"));
        Intrinsics.checkNotNullExpressionValue(fqName7, "BUILT_INS_PACKAGE_FQ_NAM…(Name.identifier(\"text\"))");
        StandardNames.TEXT_PACKAGE_FQ_NAME = fqName7;
        FqName fqName8 = fqName3.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(fqName8, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(\"internal\"))");
        StandardNames.KOTLIN_INTERNAL_FQ_NAME = fqName8;
        new FqName("error.NonExistentClass");
        StandardNames.BUILT_INS_PACKAGE_FQ_NAMES = f0.setOf(new FqName[]{fqName3, fqName5, fqName6, fqName4, fqName2, fqName8, fqName0});
    }

    @JvmStatic
    @NotNull
    public static final ClassId getFunctionClassId(int v) {
        Name name0 = Name.identifier(StandardNames.getFunctionName(v));
        return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, name0);
    }

    @JvmStatic
    @NotNull
    public static final String getFunctionName(int v) {
        return "Function" + v;
    }

    @JvmStatic
    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType0) {
        Intrinsics.checkNotNullParameter(primitiveType0, "primitiveType");
        FqName fqName0 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType0.getTypeName());
        Intrinsics.checkNotNullExpressionValue(fqName0, "BUILT_INS_PACKAGE_FQ_NAM…d(primitiveType.typeName)");
        return fqName0;
    }

    // 去混淆评级： 低(20)
    @JvmStatic
    @NotNull
    public static final String getSuspendFunctionName(int v) {
        return "SuspendFunction" + v;
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe0) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe0, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe0) != null;
    }
}


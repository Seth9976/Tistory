package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@SourceDebugExtension({"SMAP\nJvmProtoBufUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1549#2:142\n1620#2,3:143\n1549#2:146\n1620#2,3:147\n1549#2:150\n1620#2,3:151\n1#3:154\n*S KotlinDebug\n*F\n+ 1 JvmProtoBufUtil.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmProtoBufUtil\n*L\n79#1:142\n79#1:143,3\n81#1:146\n81#1:147,3\n103#1:150\n103#1:151,3\n*E\n"})
public final class JvmProtoBufUtil {
    @NotNull
    public static final JvmProtoBufUtil INSTANCE;
    public static final ExtensionRegistryLite a;

    static {
        JvmProtoBufUtil.INSTANCE = new JvmProtoBufUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(extensionRegistryLite0);
        Intrinsics.checkNotNullExpressionValue(extensionRegistryLite0, "newInstance().apply(JvmP…f::registerAllExtensions)");
        JvmProtoBufUtil.a = extensionRegistryLite0;
    }

    // 去混淆评级： 低(20)
    public static String a(Type protoBuf$Type0, NameResolver nameResolver0) {
        return protoBuf$Type0.hasClassName() ? ClassMapperLite.mapClass(nameResolver0.getQualifiedClassName(protoBuf$Type0.getClassName())) : null;
    }

    @NotNull
    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return JvmProtoBufUtil.a;
    }

    @Nullable
    public final Method getJvmConstructorSignature(@NotNull Constructor protoBuf$Constructor0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$Constructor0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.constructorSignature, "constructorSignature");
        JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = (JvmMethodSignature)ProtoBufUtilKt.getExtensionOrNull(protoBuf$Constructor0, JvmProtoBuf.constructorSignature);
        String s = jvmProtoBuf$JvmMethodSignature0 == null || !jvmProtoBuf$JvmMethodSignature0.hasName() ? "<init>" : nameResolver0.getString(jvmProtoBuf$JvmMethodSignature0.getName());
        if(jvmProtoBuf$JvmMethodSignature0 != null && jvmProtoBuf$JvmMethodSignature0.hasDesc()) {
            return new Method(s, nameResolver0.getString(jvmProtoBuf$JvmMethodSignature0.getDesc()));
        }
        List list0 = protoBuf$Constructor0.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.valueParameterList");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            Intrinsics.checkNotNullExpressionValue(((ValueParameter)object0), "it");
            Type protoBuf$Type0 = ProtoTypeTableUtilKt.type(((ValueParameter)object0), typeTable0);
            JvmProtoBufUtil.INSTANCE.getClass();
            String s1 = JvmProtoBufUtil.a(protoBuf$Type0, nameResolver0);
            if(s1 == null) {
                return null;
            }
            arrayList0.add(s1);
        }
        return new Method(s, CollectionsKt___CollectionsKt.joinToString$default(arrayList0, "", "(", ")V", 0, null, null, 56, null));
    }

    @Nullable
    public final Field getJvmFieldSignature(@NotNull Property protoBuf$Property0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0, boolean z) {
        String s;
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.propertySignature, "propertySignature");
        JvmPropertySignature jvmProtoBuf$JvmPropertySignature0 = (JvmPropertySignature)ProtoBufUtilKt.getExtensionOrNull(protoBuf$Property0, JvmProtoBuf.propertySignature);
        if(jvmProtoBuf$JvmPropertySignature0 == null) {
            return null;
        }
        JvmFieldSignature jvmProtoBuf$JvmFieldSignature0 = jvmProtoBuf$JvmPropertySignature0.hasField() ? jvmProtoBuf$JvmPropertySignature0.getField() : null;
        if(jvmProtoBuf$JvmFieldSignature0 == null && z) {
            return null;
        }
        int v = jvmProtoBuf$JvmFieldSignature0 == null || !jvmProtoBuf$JvmFieldSignature0.hasName() ? protoBuf$Property0.getName() : jvmProtoBuf$JvmFieldSignature0.getName();
        if(jvmProtoBuf$JvmFieldSignature0 != null && jvmProtoBuf$JvmFieldSignature0.hasDesc()) {
            s = nameResolver0.getString(jvmProtoBuf$JvmFieldSignature0.getDesc());
            return new Field(nameResolver0.getString(v), s);
        }
        s = JvmProtoBufUtil.a(ProtoTypeTableUtilKt.returnType(protoBuf$Property0, typeTable0), nameResolver0);
        return s == null ? null : new Field(nameResolver0.getString(v), s);
    }

    public static Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil0, Property protoBuf$Property0, NameResolver nameResolver0, TypeTable typeTable0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil0.getJvmFieldSignature(protoBuf$Property0, nameResolver0, typeTable0, z);
    }

    @Nullable
    public final Method getJvmMethodSignature(@NotNull Function protoBuf$Function0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0) {
        String s;
        Intrinsics.checkNotNullParameter(protoBuf$Function0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
        Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.methodSignature, "methodSignature");
        JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = (JvmMethodSignature)ProtoBufUtilKt.getExtensionOrNull(protoBuf$Function0, JvmProtoBuf.methodSignature);
        int v = jvmProtoBuf$JvmMethodSignature0 == null || !jvmProtoBuf$JvmMethodSignature0.hasName() ? protoBuf$Function0.getName() : jvmProtoBuf$JvmMethodSignature0.getName();
        if(jvmProtoBuf$JvmMethodSignature0 != null && jvmProtoBuf$JvmMethodSignature0.hasDesc()) {
            s = nameResolver0.getString(jvmProtoBuf$JvmMethodSignature0.getDesc());
            return new Method(nameResolver0.getString(v), s);
        }
        Collection collection0 = CollectionsKt__CollectionsKt.listOfNotNull(ProtoTypeTableUtilKt.receiverType(protoBuf$Function0, typeTable0));
        List list0 = protoBuf$Function0.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(list0, "proto.valueParameterList");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            Intrinsics.checkNotNullExpressionValue(((ValueParameter)object0), "it");
            arrayList0.add(ProtoTypeTableUtilKt.type(((ValueParameter)object0), typeTable0));
        }
        Iterable iterable0 = CollectionsKt___CollectionsKt.plus(collection0, arrayList0);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object1: iterable0) {
            JvmProtoBufUtil.INSTANCE.getClass();
            String s1 = JvmProtoBufUtil.a(((Type)object1), nameResolver0);
            if(s1 == null) {
                return null;
            }
            arrayList1.add(s1);
        }
        String s2 = JvmProtoBufUtil.a(ProtoTypeTableUtilKt.returnType(protoBuf$Function0, typeTable0), nameResolver0);
        if(s2 == null) {
            return null;
        }
        s = a.o(new StringBuilder(), CollectionsKt___CollectionsKt.joinToString$default(arrayList1, "", "(", ")", 0, null, null, 56, null), s2);
        return new Method(nameResolver0.getString(v), s);
    }

    @JvmStatic
    public static final boolean isMovedFromInterfaceCompanion(@NotNull Property protoBuf$Property0) {
        Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
        BooleanFlagField flags$BooleanFlagField0 = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object object0 = protoBuf$Property0.getExtension(JvmProtoBuf.flags);
        Intrinsics.checkNotNullExpressionValue(object0, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean boolean0 = flags$BooleanFlagField0.get(((Number)object0).intValue());
        Intrinsics.checkNotNullExpressionValue(boolean0, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return boolean0.booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final Pair readClassDataFrom(@NotNull byte[] arr_b, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(arr_b, "bytes");
        Intrinsics.checkNotNullParameter(arr_s, "strings");
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        JvmProtoBufUtil.INSTANCE.getClass();
        StringTableTypes jvmProtoBuf$StringTableTypes0 = StringTableTypes.parseDelimitedFrom(byteArrayInputStream0, JvmProtoBufUtil.a);
        Intrinsics.checkNotNullExpressionValue(jvmProtoBuf$StringTableTypes0, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new Pair(new JvmNameResolver(jvmProtoBuf$StringTableTypes0, arr_s), Class.parseFrom(byteArrayInputStream0, JvmProtoBufUtil.a));
    }

    @JvmStatic
    @NotNull
    public static final Pair readClassDataFrom(@NotNull String[] arr_s, @NotNull String[] arr_s1) {
        Intrinsics.checkNotNullParameter(arr_s, "data");
        Intrinsics.checkNotNullParameter(arr_s1, "strings");
        byte[] arr_b = BitEncoding.decodeBytes(arr_s);
        Intrinsics.checkNotNullExpressionValue(arr_b, "decodeBytes(data)");
        return JvmProtoBufUtil.readClassDataFrom(arr_b, arr_s1);
    }

    @JvmStatic
    @NotNull
    public static final Pair readFunctionDataFrom(@NotNull String[] arr_s, @NotNull String[] arr_s1) {
        Intrinsics.checkNotNullParameter(arr_s, "data");
        Intrinsics.checkNotNullParameter(arr_s1, "strings");
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(BitEncoding.decodeBytes(arr_s));
        JvmProtoBufUtil.INSTANCE.getClass();
        StringTableTypes jvmProtoBuf$StringTableTypes0 = StringTableTypes.parseDelimitedFrom(byteArrayInputStream0, JvmProtoBufUtil.a);
        Intrinsics.checkNotNullExpressionValue(jvmProtoBuf$StringTableTypes0, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new Pair(new JvmNameResolver(jvmProtoBuf$StringTableTypes0, arr_s1), Function.parseFrom(byteArrayInputStream0, JvmProtoBufUtil.a));
    }

    @JvmStatic
    @NotNull
    public static final Pair readPackageDataFrom(@NotNull byte[] arr_b, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(arr_b, "bytes");
        Intrinsics.checkNotNullParameter(arr_s, "strings");
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        JvmProtoBufUtil.INSTANCE.getClass();
        StringTableTypes jvmProtoBuf$StringTableTypes0 = StringTableTypes.parseDelimitedFrom(byteArrayInputStream0, JvmProtoBufUtil.a);
        Intrinsics.checkNotNullExpressionValue(jvmProtoBuf$StringTableTypes0, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new Pair(new JvmNameResolver(jvmProtoBuf$StringTableTypes0, arr_s), Package.parseFrom(byteArrayInputStream0, JvmProtoBufUtil.a));
    }

    @JvmStatic
    @NotNull
    public static final Pair readPackageDataFrom(@NotNull String[] arr_s, @NotNull String[] arr_s1) {
        Intrinsics.checkNotNullParameter(arr_s, "data");
        Intrinsics.checkNotNullParameter(arr_s1, "strings");
        byte[] arr_b = BitEncoding.decodeBytes(arr_s);
        Intrinsics.checkNotNullExpressionValue(arr_b, "decodeBytes(data)");
        return JvmProtoBufUtil.readPackageDataFrom(arr_b, arr_s1);
    }
}


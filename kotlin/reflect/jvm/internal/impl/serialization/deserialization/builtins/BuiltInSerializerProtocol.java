package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import r0.a;

@SourceDebugExtension({"SMAP\nBuiltInSerializerProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializerProtocol.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInSerializerProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    @NotNull
    public static final BuiltInSerializerProtocol INSTANCE;

    static {
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.newInstance();
        BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLite0);
        Intrinsics.checkNotNullExpressionValue(extensionRegistryLite0, "newInstance().apply(Buil…f::registerAllExtensions)");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.packageFqName, "packageFqName");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.constructorAnnotation, "constructorAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.classAnnotation, "classAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.functionAnnotation, "functionAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.propertyAnnotation, "propertyAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.propertyGetterAnnotation, "propertyGetterAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.propertySetterAnnotation, "propertySetterAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.enumEntryAnnotation, "enumEntryAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.compileTimeValue, "compileTimeValue");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.parameterAnnotation, "parameterAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.typeAnnotation, "typeAnnotation");
        Intrinsics.checkNotNullExpressionValue(BuiltInsProtoBuf.typeParameterAnnotation, "typeParameterAnnotation");
        BuiltInSerializerProtocol.INSTANCE = new BuiltInSerializerProtocol(extensionRegistryLite0, BuiltInsProtoBuf.packageFqName, BuiltInsProtoBuf.constructorAnnotation, BuiltInsProtoBuf.classAnnotation, BuiltInsProtoBuf.functionAnnotation, null, BuiltInsProtoBuf.propertyAnnotation, BuiltInsProtoBuf.propertyGetterAnnotation, BuiltInsProtoBuf.propertySetterAnnotation, null, null, null, BuiltInsProtoBuf.enumEntryAnnotation, BuiltInsProtoBuf.compileTimeValue, BuiltInsProtoBuf.parameterAnnotation, BuiltInsProtoBuf.typeAnnotation, BuiltInsProtoBuf.typeParameterAnnotation);  // 初始化器: Lkotlin/reflect/jvm/internal/impl/serialization/SerializerExtensionProtocol;-><init>(Lkotlin/reflect/jvm/internal/impl/protobuf/ExtensionRegistryLite;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;Lkotlin/reflect/jvm/internal/impl/protobuf/GeneratedMessageLite$GeneratedExtension;)V
    }

    @NotNull
    public final String getBuiltInsFileName(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        StringBuilder stringBuilder0 = new StringBuilder();
        if(fqName0.isRoot()) {
            return a.o(stringBuilder0, "default-package", ".kotlin_builtins");
        }
        String s = fqName0.shortName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "fqName.shortName().asString()");
        return a.o(stringBuilder0, s, ".kotlin_builtins");
    }

    @NotNull
    public final String getBuiltInsFilePath(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        String s = fqName0.asString();
        Intrinsics.checkNotNullExpressionValue(s, "fqName.asString()");
        return p.replace$default(s, '.', '/', false, 4, null) + '/' + this.getBuiltInsFileName(fqName0);
    }
}


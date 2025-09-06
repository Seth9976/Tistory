package kotlin.reflect.jvm.internal.impl.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SerializerExtensionProtocol {
    public final ExtensionRegistryLite a;
    public final GeneratedExtension b;
    public final GeneratedExtension c;
    public final GeneratedExtension d;
    public final GeneratedExtension e;
    public final GeneratedExtension f;
    public final GeneratedExtension g;
    public final GeneratedExtension h;
    public final GeneratedExtension i;
    public final GeneratedExtension j;
    public final GeneratedExtension k;
    public final GeneratedExtension l;
    public final GeneratedExtension m;
    public final GeneratedExtension n;
    public final GeneratedExtension o;
    public final GeneratedExtension p;

    public SerializerExtensionProtocol(@NotNull ExtensionRegistryLite extensionRegistryLite0, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension0, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension1, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension2, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension3, @Nullable GeneratedExtension generatedMessageLite$GeneratedExtension4, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension5, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension6, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension7, @Nullable GeneratedExtension generatedMessageLite$GeneratedExtension8, @Nullable GeneratedExtension generatedMessageLite$GeneratedExtension9, @Nullable GeneratedExtension generatedMessageLite$GeneratedExtension10, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension11, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension12, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension13, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension14, @NotNull GeneratedExtension generatedMessageLite$GeneratedExtension15) {
        Intrinsics.checkNotNullParameter(extensionRegistryLite0, "extensionRegistry");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension0, "packageFqName");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension1, "constructorAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension2, "classAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension3, "functionAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension5, "propertyAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension6, "propertyGetterAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension7, "propertySetterAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension11, "enumEntryAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension12, "compileTimeValue");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension13, "parameterAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension14, "typeAnnotation");
        Intrinsics.checkNotNullParameter(generatedMessageLite$GeneratedExtension15, "typeParameterAnnotation");
        super();
        this.a = extensionRegistryLite0;
        this.b = generatedMessageLite$GeneratedExtension1;
        this.c = generatedMessageLite$GeneratedExtension2;
        this.d = generatedMessageLite$GeneratedExtension3;
        this.e = generatedMessageLite$GeneratedExtension4;
        this.f = generatedMessageLite$GeneratedExtension5;
        this.g = generatedMessageLite$GeneratedExtension6;
        this.h = generatedMessageLite$GeneratedExtension7;
        this.i = generatedMessageLite$GeneratedExtension8;
        this.j = generatedMessageLite$GeneratedExtension9;
        this.k = generatedMessageLite$GeneratedExtension10;
        this.l = generatedMessageLite$GeneratedExtension11;
        this.m = generatedMessageLite$GeneratedExtension12;
        this.n = generatedMessageLite$GeneratedExtension13;
        this.o = generatedMessageLite$GeneratedExtension14;
        this.p = generatedMessageLite$GeneratedExtension15;
    }

    @NotNull
    public final GeneratedExtension getClassAnnotation() {
        return this.c;
    }

    @NotNull
    public final GeneratedExtension getCompileTimeValue() {
        return this.m;
    }

    @NotNull
    public final GeneratedExtension getConstructorAnnotation() {
        return this.b;
    }

    @NotNull
    public final GeneratedExtension getEnumEntryAnnotation() {
        return this.l;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistry() {
        return this.a;
    }

    @NotNull
    public final GeneratedExtension getFunctionAnnotation() {
        return this.d;
    }

    @Nullable
    public final GeneratedExtension getFunctionExtensionReceiverAnnotation() {
        return this.e;
    }

    @NotNull
    public final GeneratedExtension getParameterAnnotation() {
        return this.n;
    }

    @NotNull
    public final GeneratedExtension getPropertyAnnotation() {
        return this.f;
    }

    @Nullable
    public final GeneratedExtension getPropertyBackingFieldAnnotation() {
        return this.j;
    }

    @Nullable
    public final GeneratedExtension getPropertyDelegatedFieldAnnotation() {
        return this.k;
    }

    @Nullable
    public final GeneratedExtension getPropertyExtensionReceiverAnnotation() {
        return this.i;
    }

    @NotNull
    public final GeneratedExtension getPropertyGetterAnnotation() {
        return this.g;
    }

    @NotNull
    public final GeneratedExtension getPropertySetterAnnotation() {
        return this.h;
    }

    @NotNull
    public final GeneratedExtension getTypeAnnotation() {
        return this.o;
    }

    @NotNull
    public final GeneratedExtension getTypeParameterAnnotation() {
        return this.p;
    }
}


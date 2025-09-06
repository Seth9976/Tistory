package kotlin.reflect.jvm.internal;

import a5.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u000F\u0010\u0003\u001A\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000B\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "", "asString", "()Ljava/lang/String;", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class JvmPropertySignature {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "asString", "()Ljava/lang/String;", "a", "Ljava/lang/reflect/Field;", "getField", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class JavaField extends JvmPropertySignature {
        public final Field a;

        public JavaField(@NotNull Field field0) {
            Intrinsics.checkNotNullParameter(field0, "field");
            super(null);
            this.a = field0;
        }

        @Override  // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        public String asString() {
            String s = this.a.getName();
            Intrinsics.checkNotNullExpressionValue(s, "field.name");
            Class class0 = this.a.getType();
            Intrinsics.checkNotNullExpressionValue(class0, "field.type");
            return JvmAbi.getterName(s) + "()" + ReflectClassUtilKt.getDesc(class0);
        }

        @NotNull
        public final Field getField() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000B\u001A\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "asString", "()Ljava/lang/String;", "a", "Ljava/lang/reflect/Method;", "getGetterMethod", "()Ljava/lang/reflect/Method;", "b", "getSetterMethod", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class JavaMethodProperty extends JvmPropertySignature {
        public final Method a;
        public final Method b;

        public JavaMethodProperty(@NotNull Method method0, @Nullable Method method1) {
            Intrinsics.checkNotNullParameter(method0, "getterMethod");
            super(null);
            this.a = method0;
            this.b = method1;
        }

        @Override  // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        public String asString() {
            return RuntimeTypeMapperKt.access$getSignature(this.a);
        }

        @NotNull
        public final Method getGetterMethod() {
            return this.a;
        }

        @Nullable
        public final Method getSetterMethod() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "asString", "()Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n1#2:284\n*E\n"})
    public static final class KotlinProperty extends JvmPropertySignature {
        public final PropertyDescriptor a;
        public final Property b;
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature c;
        public final NameResolver d;
        public final TypeTable e;
        public final String f;

        public KotlinProperty(@NotNull PropertyDescriptor propertyDescriptor0, @NotNull Property protoBuf$Property0, @NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmProtoBuf$JvmPropertySignature0, @NotNull NameResolver nameResolver0, @NotNull TypeTable typeTable0) {
            Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
            String s3;
            String s2;
            String s;
            Intrinsics.checkNotNullParameter(protoBuf$Property0, "proto");
            Intrinsics.checkNotNullParameter(jvmProtoBuf$JvmPropertySignature0, "signature");
            Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable0, "typeTable");
            super(null);
            this.a = propertyDescriptor0;
            this.b = protoBuf$Property0;
            this.c = jvmProtoBuf$JvmPropertySignature0;
            this.d = nameResolver0;
            this.e = typeTable0;
            if(jvmProtoBuf$JvmPropertySignature0.hasGetter()) {
                s = nameResolver0.getString(jvmProtoBuf$JvmPropertySignature0.getGetter().getName()) + nameResolver0.getString(jvmProtoBuf$JvmPropertySignature0.getGetter().getDesc());
            }
            else {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field jvmMemberSignature$Field0 = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, protoBuf$Property0, nameResolver0, typeTable0, false, 8, null);
                if(jvmMemberSignature$Field0 == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + propertyDescriptor0);
                }
                String s1 = jvmMemberSignature$Field0.component2();
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(JvmAbi.getterName(jvmMemberSignature$Field0.component1()));
                DeclarationDescriptor declarationDescriptor0 = propertyDescriptor0.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "descriptor.containingDeclaration");
                if(Intrinsics.areEqual(propertyDescriptor0.getVisibility(), DescriptorVisibilities.INTERNAL) && declarationDescriptor0 instanceof DeserializedClassDescriptor) {
                    Intrinsics.checkNotNullExpressionValue(JvmProtoBuf.classModuleName, "classModuleName");
                    Integer integer0 = (Integer)ProtoBufUtilKt.getExtensionOrNull(((DeserializedClassDescriptor)declarationDescriptor0).getClassProto(), JvmProtoBuf.classModuleName);
                    if(integer0 == null) {
                        s2 = "main";
                    }
                    else {
                        s2 = nameResolver0.getString(integer0.intValue());
                        if(s2 == null) {
                            s2 = "main";
                        }
                    }
                    s3 = "$" + NameUtils.sanitizeAsJavaIdentifier(s2);
                }
                else if(!Intrinsics.areEqual(propertyDescriptor0.getVisibility(), DescriptorVisibilities.PRIVATE) || !(declarationDescriptor0 instanceof PackageFragmentDescriptor)) {
                    s3 = "";
                }
                else {
                    Intrinsics.checkNotNull(propertyDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                    DeserializedContainerSource deserializedContainerSource0 = ((DeserializedPropertyDescriptor)propertyDescriptor0).getContainerSource();
                    s3 = !(deserializedContainerSource0 instanceof JvmPackagePartSource) || ((JvmPackagePartSource)deserializedContainerSource0).getFacadeClassName() == null ? "" : "$" + ((JvmPackagePartSource)deserializedContainerSource0).getSimpleName().asString();
                }
                s = b.q(stringBuilder0, s3, "()", s1);
            }
            this.f = s;
        }

        @Override  // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        public String asString() {
            return this.f;
        }

        @NotNull
        public final PropertyDescriptor getDescriptor() {
            return this.a;
        }

        @NotNull
        public final NameResolver getNameResolver() {
            return this.d;
        }

        @NotNull
        public final Property getProto() {
            return this.b;
        }

        @NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature getSignature() {
            return this.c;
        }

        @NotNull
        public final TypeTable getTypeTable() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000B\u001A\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getterSignature", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "", "asString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "b", "getSetterSignature", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class MappedKotlinProperty extends JvmPropertySignature {
        public final KotlinFunction a;
        public final KotlinFunction b;

        public MappedKotlinProperty(@NotNull KotlinFunction jvmFunctionSignature$KotlinFunction0, @Nullable KotlinFunction jvmFunctionSignature$KotlinFunction1) {
            Intrinsics.checkNotNullParameter(jvmFunctionSignature$KotlinFunction0, "getterSignature");
            super(null);
            this.a = jvmFunctionSignature$KotlinFunction0;
            this.b = jvmFunctionSignature$KotlinFunction1;
        }

        @Override  // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        public String asString() {
            return this.a.asString();
        }

        @NotNull
        public final KotlinFunction getGetterSignature() {
            return this.a;
        }

        @Nullable
        public final KotlinFunction getSetterSignature() {
            return this.b;
        }
    }

    public JvmPropertySignature(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract String asString();
}


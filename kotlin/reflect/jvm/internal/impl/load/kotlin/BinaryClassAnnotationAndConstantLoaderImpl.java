package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader {
    public final ModuleDescriptor c;
    public final NotFoundClasses d;
    public final AnnotationDeserializer e;
    public JvmMetadataVersion f;

    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull NotFoundClasses notFoundClasses0, @NotNull StorageManager storageManager0, @NotNull KotlinClassFinder kotlinClassFinder0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses0, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder0, "kotlinClassFinder");
        super(storageManager0, kotlinClassFinder0);
        this.c = moduleDescriptor0;
        this.d = notFoundClasses0;
        this.e = new AnnotationDeserializer(moduleDescriptor0, notFoundClasses0);
        this.f = JvmMetadataVersion.INSTANCE;
    }

    public static final ConstantValue access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0, Name name0, Object object0) {
        ConstantValue constantValue0 = ConstantValueFactory.INSTANCE.createConstantValue(object0, binaryClassAnnotationAndConstantLoaderImpl0.c);
        return constantValue0 == null ? ErrorValue.Companion.create("Unsupported annotation argument: " + name0) : constantValue0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    public JvmMetadataVersion getJvmMetadataVersion() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @Nullable
    public AnnotationArgumentVisitor loadAnnotation(@NotNull ClassId classId0, @NotNull SourceElement sourceElement0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(classId0, "annotationClassId");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        Intrinsics.checkNotNullParameter(list0, "result");
        return new BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor(FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.c, classId0, this.d)) {
            public final HashMap b;

            {
                BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0 = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.c, classId0, this.d);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                ClassDescriptor classDescriptor0 = classId0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                ClassId classId0 = list0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                List list0 = sourceElement0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = new HashMap();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor
            public void visitArrayValue(@Nullable Name name0, @NotNull ArrayList arrayList0) {
                Intrinsics.checkNotNullParameter(arrayList0, "elements");
                if(name0 == null) {
                    return;
                }
                ValueParameterDescriptor valueParameterDescriptor0 = DescriptorResolverUtils.getAnnotationParameterByName(name0, classId0);
                if(valueParameterDescriptor0 != null) {
                    List list0 = CollectionsKt.compact(arrayList0);
                    KotlinType kotlinType0 = valueParameterDescriptor0.getType();
                    Intrinsics.checkNotNullExpressionValue(kotlinType0, "parameter.type");
                    ArrayValue arrayValue0 = ConstantValueFactory.INSTANCE.createArrayValue(list0, kotlinType0);
                    this.b.put(name0, arrayValue0);
                    return;
                }
                if(FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.c, classId0, this.d).isImplicitRepeatableContainer(list0) && Intrinsics.areEqual(name0.asString(), "value")) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: arrayList0) {
                        if(object0 instanceof AnnotationValue) {
                            arrayList1.add(object0);
                        }
                    }
                    Collection collection0 = sourceElement0;
                    for(Object object1: arrayList1) {
                        collection0.add(((AnnotationDescriptor)((AnnotationValue)object1).getValue()));
                    }
                }
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor
            public void visitConstantValue(@Nullable Name name0, @NotNull ConstantValue constantValue0) {
                Intrinsics.checkNotNullParameter(constantValue0, "value");
                if(name0 != null) {
                    this.b.put(name0, constantValue0);
                }
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            public void visitEnd() {
                HashMap hashMap0 = this.b;
                BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0 = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.c, classId0, this.d);
                ClassId classId0 = list0;
                if(binaryClassAnnotationAndConstantLoaderImpl0.isRepeatableWithImplicitContainer(classId0, hashMap0)) {
                    return;
                }
                if(binaryClassAnnotationAndConstantLoaderImpl0.isImplicitRepeatableContainer(classId0)) {
                    return;
                }
                AnnotationDescriptorImpl annotationDescriptorImpl0 = new AnnotationDescriptorImpl(classId0.getDefaultType(), hashMap0, this.g);
                sourceElement0.add(annotationDescriptorImpl0);
            }
        };
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public Object loadConstant(String s, Object object0) {
        return this.loadConstant(s, object0);
    }

    @Nullable
    public ConstantValue loadConstant(@NotNull String s, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(s, "desc");
        Intrinsics.checkNotNullParameter(object0, "initializer");
        boolean z = false;
        if(StringsKt__StringsKt.contains$default("ZBCS", s, false, 2, null)) {
            int v = (int)(((Integer)object0));
            switch(s) {
                case "B": {
                    return ConstantValueFactory.INSTANCE.createConstantValue(((byte)v), this.c);
                }
                case "C": {
                    return ConstantValueFactory.INSTANCE.createConstantValue(Character.valueOf(((char)v)), this.c);
                }
                case "S": {
                    return ConstantValueFactory.INSTANCE.createConstantValue(((short)v), this.c);
                }
                case "Z": {
                    if(v != 0) {
                        z = true;
                    }
                    return ConstantValueFactory.INSTANCE.createConstantValue(Boolean.valueOf(z), this.c);
                }
                default: {
                    throw new AssertionError(s);
                }
            }
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(object0, this.c);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public Object loadTypeAnnotation(Annotation protoBuf$Annotation0, NameResolver nameResolver0) {
        return this.loadTypeAnnotation(protoBuf$Annotation0, nameResolver0);
    }

    @NotNull
    public AnnotationDescriptor loadTypeAnnotation(@NotNull Annotation protoBuf$Annotation0, @NotNull NameResolver nameResolver0) {
        Intrinsics.checkNotNullParameter(protoBuf$Annotation0, "proto");
        Intrinsics.checkNotNullParameter(nameResolver0, "nameResolver");
        return this.e.deserializeAnnotation(protoBuf$Annotation0, nameResolver0);
    }

    public void setJvmMetadataVersion(@NotNull JvmMetadataVersion jvmMetadataVersion0) {
        Intrinsics.checkNotNullParameter(jvmMetadataVersion0, "<set-?>");
        this.f = jvmMetadataVersion0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public Object transformToUnsignedConstant(Object object0) {
        return this.transformToUnsignedConstant(((ConstantValue)object0));
    }

    @Nullable
    public ConstantValue transformToUnsignedConstant(@NotNull ConstantValue constantValue0) {
        Intrinsics.checkNotNullParameter(constantValue0, "constant");
        if(constantValue0 instanceof ByteValue) {
            return new UByteValue(((Number)((ByteValue)constantValue0).getValue()).byteValue());
        }
        if(constantValue0 instanceof ShortValue) {
            return new UShortValue(((Number)((ShortValue)constantValue0).getValue()).shortValue());
        }
        if(constantValue0 instanceof IntValue) {
            return new UIntValue(((Number)((IntValue)constantValue0).getValue()).intValue());
        }
        return constantValue0 instanceof LongValue ? new ULongValue(((Number)((LongValue)constantValue0).getValue()).longValue()) : constantValue0;
    }
}


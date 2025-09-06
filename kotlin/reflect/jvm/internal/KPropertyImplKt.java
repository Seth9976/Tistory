package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundInstance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.BoundJvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Instance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.JvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter.Static;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass.Bound;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass.Unbound;
import kotlin.reflect.jvm.internal.calls.ThrowingCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\"\"\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
public final class KPropertyImplKt {
    public static final CallerImpl a(Accessor kPropertyImpl$Accessor0, boolean z, Field field0) {
        PropertyDescriptor propertyDescriptor0 = kPropertyImpl$Accessor0.getProperty().getDescriptor();
        DeclarationDescriptor declarationDescriptor0 = propertyDescriptor0.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "containingDeclaration");
        if(DescriptorUtils.isCompanionObject(declarationDescriptor0)) {
            DeclarationDescriptor declarationDescriptor1 = declarationDescriptor0.getContainingDeclaration();
            if((DescriptorUtils.isInterface(declarationDescriptor1) || DescriptorUtils.isAnnotationClass(declarationDescriptor1)) && (!(propertyDescriptor0 instanceof DeserializedPropertyDescriptor) || !JvmProtoBufUtil.isMovedFromInterfaceCompanion(((DeserializedPropertyDescriptor)propertyDescriptor0).getProto()))) {
                goto label_6;
            }
            goto label_7;
        }
    label_6:
        if(!Modifier.isStatic(field0.getModifiers())) {
        label_7:
            if(z) {
                return kPropertyImpl$Accessor0.isBound() ? new BoundInstance(field0, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)) : new Instance(field0);
            }
            return kPropertyImpl$Accessor0.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundInstance(field0, KPropertyImplKt.b(kPropertyImpl$Accessor0), KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Instance(field0, KPropertyImplKt.b(kPropertyImpl$Accessor0));
        }
        if(kPropertyImpl$Accessor0.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.getJVM_STATIC())) {
            if(z) {
                return kPropertyImpl$Accessor0.isBound() ? new BoundJvmStaticInObject(field0) : new JvmStaticInObject(field0);
            }
            return kPropertyImpl$Accessor0.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundJvmStaticInObject(field0, KPropertyImplKt.b(kPropertyImpl$Accessor0)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.JvmStaticInObject(field0, KPropertyImplKt.b(kPropertyImpl$Accessor0));
        }
        return z ? new Static(field0) : new kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Static(field0, KPropertyImplKt.b(kPropertyImpl$Accessor0));
    }

    public static final Caller access$computeCallerForAccessor(Accessor kPropertyImpl$Accessor0, boolean z) {
        KotlinFunction jvmFunctionSignature$KotlinFunction0;
        Method method2;
        JvmMethodSignature jvmProtoBuf$JvmMethodSignature0;
        if(KDeclarationContainerImpl.Companion.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().matches(kPropertyImpl$Accessor0.getProperty().getSignature())) {
            return ThrowingCaller.INSTANCE;
        }
        PropertyDescriptor propertyDescriptor0 = kPropertyImpl$Accessor0.getProperty().getDescriptor();
        JvmPropertySignature jvmPropertySignature0 = RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor0);
        if(jvmPropertySignature0 instanceof KotlinProperty) {
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmProtoBuf$JvmPropertySignature0 = ((KotlinProperty)jvmPropertySignature0).getSignature();
            if(!z) {
                jvmProtoBuf$JvmMethodSignature0 = jvmProtoBuf$JvmPropertySignature0.hasSetter() ? jvmProtoBuf$JvmPropertySignature0.getSetter() : null;
            }
            else if(jvmProtoBuf$JvmPropertySignature0.hasGetter()) {
                jvmProtoBuf$JvmMethodSignature0 = jvmProtoBuf$JvmPropertySignature0.getGetter();
            }
            else {
                jvmProtoBuf$JvmMethodSignature0 = null;
            }
            Method method0 = jvmProtoBuf$JvmMethodSignature0 == null ? null : kPropertyImpl$Accessor0.getProperty().getContainer().findMethodBySignature(((KotlinProperty)jvmPropertySignature0).getNameResolver().getString(jvmProtoBuf$JvmMethodSignature0.getName()), ((KotlinProperty)jvmPropertySignature0).getNameResolver().getString(jvmProtoBuf$JvmMethodSignature0.getDesc()));
            if(method0 == null) {
                if(InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(kPropertyImpl$Accessor0.getProperty().getDescriptor()) && Intrinsics.areEqual(kPropertyImpl$Accessor0.getProperty().getDescriptor().getVisibility(), DescriptorVisibilities.INTERNAL)) {
                    Class class0 = InlineClassAwareCallerKt.toInlineClass(kPropertyImpl$Accessor0.getProperty().getDescriptor().getContainingDeclaration());
                    if(class0 != null) {
                        Method method1 = InlineClassAwareCallerKt.getUnboxMethod(class0, kPropertyImpl$Accessor0.getProperty().getDescriptor());
                        if(method1 != null) {
                            return kPropertyImpl$Accessor0.isBound() ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new Bound(method1, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new Unbound(method1), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
                        }
                    }
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + kPropertyImpl$Accessor0.getProperty() + " should have a field");
                }
                Field field0 = kPropertyImpl$Accessor0.getProperty().getJavaField();
                if(field0 == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + kPropertyImpl$Accessor0.getProperty());
                }
                return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(KPropertyImplKt.a(kPropertyImpl$Accessor0, z, field0), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
            }
            if(!Modifier.isStatic(method0.getModifiers())) {
                return kPropertyImpl$Accessor0.isBound() ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(method0, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(method0), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
            }
            if(kPropertyImpl$Accessor0.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.getJVM_STATIC())) {
                return kPropertyImpl$Accessor0.isBound() ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject(method0), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject(method0), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
            }
            return kPropertyImpl$Accessor0.isBound() ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new BoundStatic(method0, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static(method0), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
        }
        if(jvmPropertySignature0 instanceof JavaField) {
            return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(KPropertyImplKt.a(kPropertyImpl$Accessor0, z, ((JavaField)jvmPropertySignature0).getField()), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
        }
        if(jvmPropertySignature0 instanceof JavaMethodProperty) {
            if(z) {
                method2 = ((JavaMethodProperty)jvmPropertySignature0).getGetterMethod();
                return kPropertyImpl$Accessor0.isBound() ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(method2, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(method2), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
            }
            method2 = ((JavaMethodProperty)jvmPropertySignature0).getSetterMethod();
            if(method2 == null) {
                throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + ((JavaMethodProperty)jvmPropertySignature0).getGetterMethod());
            }
            return kPropertyImpl$Accessor0.isBound() ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(method2, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(method2), kPropertyImpl$Accessor0.getDescriptor(), false, 2, null);
        }
        if(!(jvmPropertySignature0 instanceof MappedKotlinProperty)) {
            throw new NoWhenBranchMatchedException();
        }
        if(z) {
            jvmFunctionSignature$KotlinFunction0 = ((MappedKotlinProperty)jvmPropertySignature0).getGetterSignature();
        }
        else {
            jvmFunctionSignature$KotlinFunction0 = ((MappedKotlinProperty)jvmPropertySignature0).getSetterSignature();
            if(jvmFunctionSignature$KotlinFunction0 == null) {
                throw new KotlinReflectionInternalError("No setter found for property " + kPropertyImpl$Accessor0.getProperty());
            }
        }
        Method method3 = kPropertyImpl$Accessor0.getProperty().getContainer().findMethodBySignature(jvmFunctionSignature$KotlinFunction0.getMethodName(), jvmFunctionSignature$KotlinFunction0.getMethodDesc());
        if(method3 == null) {
            throw new KotlinReflectionInternalError("No accessor found for property " + kPropertyImpl$Accessor0.getProperty());
        }
        Modifier.isStatic(method3.getModifiers());
        return kPropertyImpl$Accessor0.isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(method3, KPropertyImplKt.getBoundReceiver(kPropertyImpl$Accessor0)) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(method3);
    }

    public static final boolean b(Accessor kPropertyImpl$Accessor0) {
        return !TypeUtils.isNullableType(kPropertyImpl$Accessor0.getProperty().getDescriptor().getType());
    }

    @Nullable
    public static final Object getBoundReceiver(@NotNull Accessor kPropertyImpl$Accessor0) {
        Intrinsics.checkNotNullParameter(kPropertyImpl$Accessor0, "<this>");
        return kPropertyImpl$Accessor0.getProperty().getBoundReceiver();
    }
}


package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

public final class z extends Lambda implements Function0 {
    public final KFunctionImpl w;

    public z(KFunctionImpl kFunctionImpl0) {
        this.w = kFunctionImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CallerImpl callerImpl0;
        Method method0;
        KFunctionImpl kFunctionImpl0 = this.w;
        FunctionDescriptor functionDescriptor0 = kFunctionImpl0.getDescriptor();
        JvmFunctionSignature jvmFunctionSignature0 = RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor0);
        if(jvmFunctionSignature0 instanceof KotlinFunction) {
            String s = ((KotlinFunction)jvmFunctionSignature0).getMethodName();
            String s1 = ((KotlinFunction)jvmFunctionSignature0).getMethodDesc();
            Member member0 = kFunctionImpl0.getCaller().getMember();
            Intrinsics.checkNotNull(member0);
            method0 = kFunctionImpl0.getContainer().findDefaultMethod(s, s1, !Modifier.isStatic(member0.getModifiers()));
        }
        else if(jvmFunctionSignature0 instanceof KotlinConstructor) {
            if(kFunctionImpl0.isAnnotationConstructor()) {
                Class class0 = kFunctionImpl0.getContainer().getJClass();
                Iterable iterable0 = kFunctionImpl0.getParameters();
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    String s2 = ((KParameter)object0).getName();
                    Intrinsics.checkNotNull(s2);
                    arrayList0.add(s2);
                }
                return new AnnotationConstructorCaller(class0, arrayList0, CallMode.CALL_BY_NAME, Origin.KOTLIN, null, 16, null);
            }
            method0 = kFunctionImpl0.getContainer().findDefaultConstructor(((KotlinConstructor)jvmFunctionSignature0).getConstructorDesc());
        }
        else {
            if(jvmFunctionSignature0 instanceof FakeJavaAnnotationConstructor) {
                List list0 = ((FakeJavaAnnotationConstructor)jvmFunctionSignature0).getMethods();
                Class class1 = kFunctionImpl0.getContainer().getJClass();
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object1: list0) {
                    arrayList1.add(((Method)object1).getName());
                }
                return new AnnotationConstructorCaller(class1, arrayList1, CallMode.CALL_BY_NAME, Origin.JAVA, list0);
            }
            method0 = null;
        }
        if(method0 instanceof Constructor) {
            callerImpl0 = KFunctionImpl.access$createConstructorCaller(kFunctionImpl0, ((Constructor)method0), kFunctionImpl0.getDescriptor(), true);
            return callerImpl0 == null ? null : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(callerImpl0, kFunctionImpl0.getDescriptor(), true);
        }
        if(method0 instanceof Method) {
            if(kFunctionImpl0.getDescriptor().getAnnotations().findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                DeclarationDescriptor declarationDescriptor0 = kFunctionImpl0.getDescriptor().getContainingDeclaration();
                Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if(!((ClassDescriptor)declarationDescriptor0).isCompanionObject()) {
                    callerImpl0 = KFunctionImpl.access$createJvmStaticInObjectCaller(kFunctionImpl0, method0);
                    return callerImpl0 == null ? null : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(callerImpl0, kFunctionImpl0.getDescriptor(), true);
                }
            }
            callerImpl0 = KFunctionImpl.access$createStaticMethodCaller(kFunctionImpl0, method0);
            return callerImpl0 == null ? null : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(callerImpl0, kFunctionImpl0.getDescriptor(), true);
        }
        return null;
    }
}


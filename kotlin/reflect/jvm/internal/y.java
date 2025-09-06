package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

public final class y extends Lambda implements Function0 {
    public final KFunctionImpl w;

    public y(KFunctionImpl kFunctionImpl0) {
        this.w = kFunctionImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Constructor constructor0;
        KFunctionImpl kFunctionImpl0 = this.w;
        FunctionDescriptor functionDescriptor0 = kFunctionImpl0.getDescriptor();
        JvmFunctionSignature jvmFunctionSignature0 = RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor0);
        if(jvmFunctionSignature0 instanceof KotlinConstructor) {
            if(kFunctionImpl0.isAnnotationConstructor()) {
                Class class0 = kFunctionImpl0.getContainer().getJClass();
                Iterable iterable0 = kFunctionImpl0.getParameters();
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object0: iterable0) {
                    String s = ((KParameter)object0).getName();
                    Intrinsics.checkNotNull(s);
                    arrayList0.add(s);
                }
                return new AnnotationConstructorCaller(class0, arrayList0, CallMode.POSITIONAL_CALL, Origin.KOTLIN, null, 16, null);
            }
            constructor0 = kFunctionImpl0.getContainer().findConstructorBySignature(((KotlinConstructor)jvmFunctionSignature0).getConstructorDesc());
            goto label_26;
        }
        if(jvmFunctionSignature0 instanceof KotlinFunction) {
            constructor0 = kFunctionImpl0.getContainer().findMethodBySignature(((KotlinFunction)jvmFunctionSignature0).getMethodName(), ((KotlinFunction)jvmFunctionSignature0).getMethodDesc());
            goto label_26;
        }
        boolean z = false;
        if(jvmFunctionSignature0 instanceof JavaMethod) {
            z = true;
            constructor0 = ((JavaMethod)jvmFunctionSignature0).getMethod();
        }
        else if(jvmFunctionSignature0 instanceof JavaConstructor) {
            z = true;
            constructor0 = ((JavaConstructor)jvmFunctionSignature0).getConstructor();
        }
        if(z) {
        label_26:
            if(constructor0 instanceof Constructor) {
                return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(KFunctionImpl.access$createConstructorCaller(kFunctionImpl0, constructor0, kFunctionImpl0.getDescriptor(), false), kFunctionImpl0.getDescriptor(), false, 2, null);
            }
            if(!(constructor0 instanceof Method)) {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl0.getDescriptor() + " (member = " + constructor0 + ')');
            }
            if(!Modifier.isStatic(((Method)constructor0).getModifiers())) {
                return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(KFunctionImpl.access$createInstanceMethodCaller(kFunctionImpl0, ((Method)constructor0)), kFunctionImpl0.getDescriptor(), false, 2, null);
            }
            return kFunctionImpl0.getDescriptor().getAnnotations().findAnnotation(UtilKt.getJVM_STATIC()) == null ? InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(KFunctionImpl.access$createStaticMethodCaller(kFunctionImpl0, ((Method)constructor0)), kFunctionImpl0.getDescriptor(), false, 2, null) : InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(KFunctionImpl.access$createJvmStaticInObjectCaller(kFunctionImpl0, ((Method)constructor0)), kFunctionImpl0.getDescriptor(), false, 2, null);
        }
        if(!(jvmFunctionSignature0 instanceof FakeJavaAnnotationConstructor)) {
            throw new NoWhenBranchMatchedException();
        }
        List list0 = ((FakeJavaAnnotationConstructor)jvmFunctionSignature0).getMethods();
        Class class1 = kFunctionImpl0.getContainer().getJClass();
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object1: list0) {
            arrayList1.add(((Method)object1).getName());
        }
        return new AnnotationConstructorCaller(class1, arrayList1, CallMode.POSITIONAL_CALL, Origin.JAVA, list0);
    }
}


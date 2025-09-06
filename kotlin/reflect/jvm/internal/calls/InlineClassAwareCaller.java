package kotlin.reflect.jvm.internal.calls;

import androidx.appcompat.app.w0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001BB%\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000E\u001A\u0004\u0018\u00010\r2\n\u0010\f\u001A\u0006\u0012\u0002\b\u00030\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0012\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001A\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00130\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001C"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "caller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "androidx/appcompat/app/w0", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInlineClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n26#2:220\n1620#3,3:221\n*S KotlinDebug\n*F\n+ 1 InlineClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller\n*L\n53#1:220\n94#1:221,3\n*E\n"})
public final class InlineClassAwareCaller implements Caller {
    public final Caller a;
    public final boolean b;
    public final w0 c;

    public InlineClassAwareCaller(@NotNull CallableMemberDescriptor callableMemberDescriptor0, @NotNull Caller caller0, boolean z) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        Method method1;
        w0 w00;
        Intrinsics.checkNotNullParameter(caller0, "caller");
        super();
        this.a = caller0;
        this.b = z;
        KotlinType kotlinType0 = callableMemberDescriptor0.getReturnType();
        Intrinsics.checkNotNull(kotlinType0);
        Class class0 = InlineClassAwareCallerKt.toInlineClass(kotlinType0);
        Method method0 = class0 == null ? null : InlineClassAwareCallerKt.getBoxMethod(class0, callableMemberDescriptor0);
        if(InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(callableMemberDescriptor0)) {
            w00 = new w0(IntRange.Companion.getEMPTY(), new Method[0], method0);
        }
        else {
            int v1 = 1;
            int v2 = -1;
            if(!(caller0 instanceof BoundStatic)) {
                if(!(callableMemberDescriptor0 instanceof ConstructorDescriptor)) {
                    if(callableMemberDescriptor0.getDispatchReceiverParameter() == null || caller0 instanceof BoundCaller) {
                        v2 = 0;
                    }
                    else {
                        DeclarationDescriptor declarationDescriptor0 = callableMemberDescriptor0.getContainingDeclaration();
                        Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "descriptor.containingDeclaration");
                        v2 = InlineClassesUtilsKt.isInlineClass(declarationDescriptor0) ? 0 : 1;
                    }
                }
                else if(!(caller0 instanceof BoundCaller)) {
                    v2 = 0;
                }
            }
            ArrayList arrayList0 = new ArrayList();
            ReceiverParameterDescriptor receiverParameterDescriptor0 = callableMemberDescriptor0.getExtensionReceiverParameter();
            KotlinType kotlinType1 = receiverParameterDescriptor0 == null ? null : receiverParameterDescriptor0.getType();
            if(kotlinType1 != null) {
                arrayList0.add(kotlinType1);
            }
            else if(callableMemberDescriptor0 instanceof ConstructorDescriptor) {
                ClassDescriptor classDescriptor0 = ((ConstructorDescriptor)callableMemberDescriptor0).getConstructedClass();
                Intrinsics.checkNotNullExpressionValue(classDescriptor0, "descriptor.constructedClass");
                if(classDescriptor0.isInner()) {
                    DeclarationDescriptor declarationDescriptor1 = classDescriptor0.getContainingDeclaration();
                    Intrinsics.checkNotNull(declarationDescriptor1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList0.add(((ClassDescriptor)declarationDescriptor1).getDefaultType());
                }
            }
            else {
                DeclarationDescriptor declarationDescriptor2 = callableMemberDescriptor0.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(declarationDescriptor2, "descriptor.containingDeclaration");
                if(declarationDescriptor2 instanceof ClassDescriptor && InlineClassesUtilsKt.isInlineClass(declarationDescriptor2)) {
                    arrayList0.add(((ClassDescriptor)declarationDescriptor2).getDefaultType());
                }
            }
            List list0 = callableMemberDescriptor0.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "descriptor.valueParameters");
            for(Object object0: list0) {
                arrayList0.add(((ValueParameterDescriptor)object0).getType());
            }
            int v3 = this.b ? (arrayList0.size() + 0x1F) / 0x20 + 1 : 0;
            if(!(callableMemberDescriptor0 instanceof FunctionDescriptor) || !((FunctionDescriptor)callableMemberDescriptor0).isSuspend()) {
                v1 = 0;
            }
            int v4 = arrayList0.size() + v2 + (v3 + v1);
            if(CallerKt.getArity(this) != v4) {
                throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.getArity(this) + " != " + v4 + "\nCalling: " + callableMemberDescriptor0 + "\nParameter types: " + this.getParameterTypes() + ")\nDefault: " + this.b);
            }
            IntRange intRange0 = c.until(Math.max(v2, 0), arrayList0.size() + v2);
            Method[] arr_method = new Method[v4];
            for(int v = 0; v < v4; ++v) {
                if(v > intRange0.getLast() || intRange0.getFirst() > v) {
                    method1 = null;
                }
                else {
                    Class class1 = InlineClassAwareCallerKt.toInlineClass(((KotlinType)arrayList0.get(v - v2)));
                    if(class1 != null) {
                        method1 = InlineClassAwareCallerKt.getUnboxMethod(class1, callableMemberDescriptor0);
                    }
                }
                arr_method[v] = method1;
            }
            w00 = new w0(intRange0, arr_method, method0);
        }
        this.c = w00;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "args");
        w0 w00 = this.c;
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "copyOf(this, size)");
        int v = ((IntRange)w00.a).getFirst();
        int v1 = ((IntRange)w00.a).getLast();
        if(v <= v1) {
            while(true) {
                Method method0 = ((Method[])w00.b)[v];
                Object object0 = arr_object[v];
                if(method0 != null) {
                    if(object0 == null) {
                        Class class0 = method0.getReturnType();
                        Intrinsics.checkNotNullExpressionValue(class0, "method.returnType");
                        object0 = UtilKt.defaultPrimitiveValue(class0);
                    }
                    else {
                        object0 = method0.invoke(object0, null);
                    }
                }
                arr_object1[v] = object0;
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        Object object1 = this.a.call(arr_object1);
        Method method1 = (Method)w00.c;
        if(method1 != null) {
            Object object2 = method1.invoke(null, object1);
            return object2 == null ? object1 : object2;
        }
        return object1;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    public Member getMember() {
        return this.a.getMember();
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List getParameterTypes() {
        return this.a.getParameterTypes();
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.a.getReturnType();
    }
}


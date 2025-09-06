package kotlin.reflect.jvm.internal;

import aa.m;
import java.lang.reflect.Constructor;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenBoundConstructor;
import kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenConstructor;
import kotlin.reflect.jvm.internal.calls.CallerImpl.BoundConstructor;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static;
import kotlin.reflect.jvm.internal.calls.CallerImpl.Method;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BB7\b\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\n\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\n\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0002H\u0096\u0002\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u001F\u0010&\u001A\u0006\u0012\u0002\b\u00030!8VX\u0096\u0084\u0002\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R!\u0010)\u001A\b\u0012\u0002\b\u0003\u0018\u00010!8VX\u0096\u0084\u0002\u00A2\u0006\f\n\u0004\b\'\u0010#\u001A\u0004\b(\u0010%R\u0014\u0010*\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b*\u0010+R\u0014\u0010\r\u001A\u00020\f8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b,\u0010\u001CR\u0014\u0010.\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010\u001AR\u0014\u0010/\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010+R\u0014\u00100\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u0010+R\u0014\u00101\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u0010+R\u0014\u00102\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b2\u0010+R\u0014\u00103\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u0010+\u00A8\u00064"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "f", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "j", "Lkotlin/Lazy;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "k", "getDefaultCaller", "defaultCaller", "isBound", "()Z", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KFunctionImpl extends KCallableImpl implements FunctionBase, KFunction, FunctionWithAllInvokes {
    public final KDeclarationContainerImpl f;
    public final String g;
    public final Object h;
    public final LazySoftVal i;
    public final Lazy j;
    public final Lazy k;
    public static final KProperty[] l;

    static {
        KFunctionImpl.l = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public KFunctionImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        this(kDeclarationContainerImpl0, s, s1, null, object0);
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl0, String s, String s1, FunctionDescriptor functionDescriptor0, Object object0) {
        this.f = kDeclarationContainerImpl0;
        this.g = s1;
        this.h = object0;
        this.i = ReflectProperties.lazySoft(functionDescriptor0, new m(19, this, s));
        y y0 = new y(this);
        this.j = c.lazy(LazyThreadSafetyMode.PUBLICATION, y0);
        z z0 = new z(this);
        this.k = c.lazy(LazyThreadSafetyMode.PUBLICATION, z0);
    }

    public KFunctionImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull FunctionDescriptor functionDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(functionDescriptor0, "descriptor");
        String s = functionDescriptor0.getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "descriptor.name.asString()");
        this(kDeclarationContainerImpl0, s, RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor0).asString(), functionDescriptor0, CallableReference.NO_RECEIVER);
    }

    public static final CallerImpl access$createConstructorCaller(KFunctionImpl kFunctionImpl0, Constructor constructor0, FunctionDescriptor functionDescriptor0, boolean z) {
        if(!z) {
            kFunctionImpl0.getClass();
            if(InlineClassManglingRulesKt.shouldHideConstructorDueToInlineClassTypeValueParameters(functionDescriptor0)) {
                if(kFunctionImpl0.isBound()) {
                    FunctionDescriptor functionDescriptor1 = kFunctionImpl0.getDescriptor();
                    return new AccessorForHiddenBoundConstructor(constructor0, InlineClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl0.h, functionDescriptor1));
                }
                return new AccessorForHiddenConstructor(constructor0);
            }
        }
        if(kFunctionImpl0.isBound()) {
            FunctionDescriptor functionDescriptor2 = kFunctionImpl0.getDescriptor();
            return new BoundConstructor(constructor0, InlineClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl0.h, functionDescriptor2));
        }
        return new kotlin.reflect.jvm.internal.calls.CallerImpl.Constructor(constructor0);
    }

    public static final Method access$createInstanceMethodCaller(KFunctionImpl kFunctionImpl0, java.lang.reflect.Method method0) {
        if(kFunctionImpl0.isBound()) {
            FunctionDescriptor functionDescriptor0 = kFunctionImpl0.getDescriptor();
            return new BoundInstance(method0, InlineClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl0.h, functionDescriptor0));
        }
        return new Instance(method0);
    }

    public static final Method access$createJvmStaticInObjectCaller(KFunctionImpl kFunctionImpl0, java.lang.reflect.Method method0) {
        return kFunctionImpl0.isBound() ? new BoundJvmStaticInObject(method0) : new JvmStaticInObject(method0);
    }

    public static final Method access$createStaticMethodCaller(KFunctionImpl kFunctionImpl0, java.lang.reflect.Method method0) {
        if(kFunctionImpl0.isBound()) {
            FunctionDescriptor functionDescriptor0 = kFunctionImpl0.getDescriptor();
            return new BoundStatic(method0, InlineClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl0.h, functionDescriptor0));
        }
        return new Static(method0);
    }

    public static final String access$getSignature$p(KFunctionImpl kFunctionImpl0) {
        return kFunctionImpl0.g;
    }

    // 去混淆评级： 低(25)
    @Override
    public boolean equals(@Nullable Object object0) {
        KFunctionImpl kFunctionImpl0 = UtilKt.asKFunctionImpl(object0);
        return kFunctionImpl0 == null ? false : Intrinsics.areEqual(this.getContainer(), kFunctionImpl0.getContainer()) && Intrinsics.areEqual(this.getName(), kFunctionImpl0.getName()) && Intrinsics.areEqual(this.g, kFunctionImpl0.g) && Intrinsics.areEqual(this.h, kFunctionImpl0.h);
    }

    @Override  // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return CallerKt.getArity(this.getCaller());
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public Caller getCaller() {
        return (Caller)this.j.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public KDeclarationContainerImpl getContainer() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    public Caller getDefaultCaller() {
        return (Caller)this.k.getValue();
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    public CallableMemberDescriptor getDescriptor() {
        return this.getDescriptor();
    }

    @NotNull
    public FunctionDescriptor getDescriptor() {
        Object object0 = this.i.getValue(this, KFunctionImpl.l[0]);
        Intrinsics.checkNotNullExpressionValue(object0, "<get-descriptor>(...)");
        return (FunctionDescriptor)object0;
    }

    @Override  // kotlin.reflect.KCallable
    @NotNull
    public String getName() {
        String s = this.getDescriptor().getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "descriptor.name.asString()");
        return s;
    }

    @Override
    public int hashCode() {
        int v = this.getName().hashCode();
        return this.g.hashCode() + (v + this.getContainer().hashCode() * 0x1F) * 0x1F;
    }

    @Override  // kotlin.jvm.functions.Function0
    @Nullable
    public Object invoke() {
        return DefaultImpls.invoke(this);
    }

    @Override  // kotlin.jvm.functions.Function1
    @Nullable
    public Object invoke(@Nullable Object object0) {
        return DefaultImpls.invoke(this, object0);
    }

    @Override  // kotlin.jvm.functions.Function2
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1) {
        return DefaultImpls.invoke(this, object0, object1);
    }

    @Override  // kotlin.jvm.functions.Function3
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2) {
        return DefaultImpls.invoke(this, object0, object1, object2);
    }

    @Override  // kotlin.jvm.functions.Function4
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3);
    }

    @Override  // kotlin.jvm.functions.Function5
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4);
    }

    @Override  // kotlin.jvm.functions.Function6
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5);
    }

    @Override  // kotlin.jvm.functions.Function7
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6);
    }

    @Override  // kotlin.jvm.functions.Function8
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7);
    }

    @Override  // kotlin.jvm.functions.Function9
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8);
    }

    @Override  // kotlin.jvm.functions.Function10
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9);
    }

    @Override  // kotlin.jvm.functions.Function11
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10);
    }

    @Override  // kotlin.jvm.functions.Function12
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11);
    }

    @Override  // kotlin.jvm.functions.Function13
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12);
    }

    @Override  // kotlin.jvm.functions.Function14
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13);
    }

    @Override  // kotlin.jvm.functions.Function15
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14);
    }

    @Override  // kotlin.jvm.functions.Function16
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15);
    }

    @Override  // kotlin.jvm.functions.Function17
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16);
    }

    @Override  // kotlin.jvm.functions.Function18
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @Nullable Object object17) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17);
    }

    @Override  // kotlin.jvm.functions.Function19
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @Nullable Object object17, @Nullable Object object18) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18);
    }

    @Override  // kotlin.jvm.functions.Function20
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @Nullable Object object17, @Nullable Object object18, @Nullable Object object19) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19);
    }

    @Override  // kotlin.jvm.functions.Function21
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @Nullable Object object17, @Nullable Object object18, @Nullable Object object19, @Nullable Object object20) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20);
    }

    @Override  // kotlin.jvm.functions.Function22
    @Nullable
    public Object invoke(@Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4, @Nullable Object object5, @Nullable Object object6, @Nullable Object object7, @Nullable Object object8, @Nullable Object object9, @Nullable Object object10, @Nullable Object object11, @Nullable Object object12, @Nullable Object object13, @Nullable Object object14, @Nullable Object object15, @Nullable Object object16, @Nullable Object object17, @Nullable Object object18, @Nullable Object object19, @Nullable Object object20, @Nullable Object object21) {
        return DefaultImpls.invoke(this, object0, object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21);
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return !Intrinsics.areEqual(this.h, CallableReference.NO_RECEIVER);
    }

    @Override  // kotlin.reflect.KFunction
    public boolean isExternal() {
        return this.getDescriptor().isExternal();
    }

    @Override  // kotlin.reflect.KFunction
    public boolean isInfix() {
        return this.getDescriptor().isInfix();
    }

    @Override  // kotlin.reflect.KFunction
    public boolean isInline() {
        return this.getDescriptor().isInline();
    }

    @Override  // kotlin.reflect.KFunction
    public boolean isOperator() {
        return this.getDescriptor().isOperator();
    }

    @Override  // kotlin.reflect.KFunction, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return this.getDescriptor().isSuspend();
    }

    @Override
    @NotNull
    public String toString() {
        FunctionDescriptor functionDescriptor0 = this.getDescriptor();
        return ReflectionObjectRenderer.INSTANCE.renderFunction(functionDescriptor0);
    }
}


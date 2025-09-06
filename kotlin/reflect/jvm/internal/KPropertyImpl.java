package kotlin.reflect.jvm.internal;

import d0.s;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\b \u0018\u0000 D*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004EDFGB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tB5\b\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\b\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\n\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\b\u0010\u0012J\u0011\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0004\u00A2\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001A\u0004\u0018\u00010\u000E2\b\u0010\u0016\u001A\u0004\u0018\u00010\u00132\b\u0010\u0017\u001A\u0004\u0018\u00010\u000E2\b\u0010\u0018\u001A\u0004\u0018\u00010\u000EH\u0004\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u000EH\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\"\u0010#R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010#R\u0017\u0010\f\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b+\u0010)\u001A\u0004\b,\u0010#R\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u000E8F\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u0014\u0010/\u001A\u00020\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u00100R\u0013\u00104\u001A\u0004\u0018\u0001018F\u00A2\u0006\u0006\u001A\u0004\b2\u00103R\u001A\u00108\u001A\b\u0012\u0004\u0012\u00028\u0000058&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u0018\u0010<\u001A\u0006\u0012\u0002\b\u0003098VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u001A\u0010>\u001A\b\u0012\u0002\b\u0003\u0018\u0001098VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u0010;R\u0014\u0010?\u001A\u00020\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b?\u00100R\u0014\u0010@\u001A\u00020\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u00100R\u0014\u0010A\u001A\u00020\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u00100R\u0014\u0010\u0007\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bB\u0010C\u00A8\u0006H"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "computeDelegateSource", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "getDelegateImpl", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "f", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "g", "Ljava/lang/String;", "getName", "h", "getSignature", "getBoundReceiver", "()Ljava/lang/Object;", "isBound", "()Z", "Ljava/lang/reflect/Field;", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Companion", "Accessor", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
public abstract class KPropertyImpl extends KCallableImpl implements KProperty {
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0012\u0010\u000F\u001A\u00020\u0010X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001A\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0015R\u0018\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00010\u001CX¦\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Accessor extends KCallableImpl implements KFunction, kotlin.reflect.KProperty.Accessor {
        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public KDeclarationContainerImpl getContainer() {
            return this.getProperty().getContainer();
        }

        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        @Nullable
        public Caller getDefaultCaller() {
            return null;
        }

        @NotNull
        public abstract PropertyAccessorDescriptor getDescriptor();

        @NotNull
        public abstract KPropertyImpl getProperty();

        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        public boolean isBound() {
            return this.getProperty().isBound();
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0002\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "EXTENSION_PROPERTY_DELEGATE", "Ljava/lang/Object;", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Object getEXTENSION_PROPERTY_DELEGATE() {
            return KPropertyImpl.l;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u001F\u0010\u0016\u001A\u0006\u0012\u0002\b\u00030\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/calls/Caller;", "g", "Lkotlin/Lazy;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Getter extends Accessor implements kotlin.reflect.KProperty.Getter {
        public final LazySoftVal f;
        public final Lazy g;
        public static final KProperty[] h;

        static {
            Getter.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
        }

        public Getter() {
            this.f = ReflectProperties.lazySoft(new j0(this));
            i0 i00 = new i0(this);
            this.g = c.lazy(LazyThreadSafetyMode.PUBLICATION, i00);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Getter && Intrinsics.areEqual(this.getProperty(), ((Getter)object0).getProperty());
        }

        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public Caller getCaller() {
            return (Caller)this.g.getValue();
        }

        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        public CallableMemberDescriptor getDescriptor() {
            return this.getDescriptor();
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public PropertyAccessorDescriptor getDescriptor() {
            return this.getDescriptor();
        }

        @NotNull
        public PropertyGetterDescriptor getDescriptor() {
            Object object0 = this.f.getValue(this, Getter.h[0]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-descriptor>(...)");
            return (PropertyGetterDescriptor)object0;
        }

        @Override  // kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "<get-" + this.getProperty().getName() + '>';
        }

        @Override
        public int hashCode() {
            return this.getProperty().hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "getter of " + this.getProperty();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001F\u0010\u0017\u001A\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\t¨\u0006\u001A"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/calls/Caller;", "g", "Lkotlin/Lazy;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Setter extends Accessor implements kotlin.reflect.KMutableProperty.Setter {
        public final LazySoftVal f;
        public final Lazy g;
        public static final KProperty[] h;

        static {
            Setter.h = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
        }

        public Setter() {
            this.f = ReflectProperties.lazySoft(new l0(this));
            k0 k00 = new k0(this);
            this.g = c.lazy(LazyThreadSafetyMode.PUBLICATION, k00);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return object0 instanceof Setter && Intrinsics.areEqual(this.getProperty(), ((Setter)object0).getProperty());
        }

        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public Caller getCaller() {
            return (Caller)this.g.getValue();
        }

        @Override  // kotlin.reflect.jvm.internal.KCallableImpl
        public CallableMemberDescriptor getDescriptor() {
            return this.getDescriptor();
        }

        @Override  // kotlin.reflect.jvm.internal.KPropertyImpl$Accessor
        public PropertyAccessorDescriptor getDescriptor() {
            return this.getDescriptor();
        }

        @NotNull
        public PropertySetterDescriptor getDescriptor() {
            Object object0 = this.f.getValue(this, Setter.h[0]);
            Intrinsics.checkNotNullExpressionValue(object0, "<get-descriptor>(...)");
            return (PropertySetterDescriptor)object0;
        }

        @Override  // kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "<set-" + this.getProperty().getName() + '>';
        }

        @Override
        public int hashCode() {
            return this.getProperty().hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "setter of " + this.getProperty();
        }
    }

    @NotNull
    public static final Companion Companion;
    public final KDeclarationContainerImpl f;
    public final String g;
    public final String h;
    public final Object i;
    public final Lazy j;
    public final LazySoftVal k;
    public static final Object l;

    static {
        KPropertyImpl.Companion = new Companion(null);
        KPropertyImpl.l = new Object();
    }

    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull String s, @NotNull String s1, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "signature");
        this(kDeclarationContainerImpl0, s, s1, null, object0);
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl0, String s, String s1, PropertyDescriptor propertyDescriptor0, Object object0) {
        this.f = kDeclarationContainerImpl0;
        this.g = s;
        this.h = s1;
        this.i = object0;
        m0 m00 = new m0(this);
        this.j = c.lazy(LazyThreadSafetyMode.PUBLICATION, m00);
        LazySoftVal reflectProperties$LazySoftVal0 = ReflectProperties.lazySoft(propertyDescriptor0, new s(this, 10));
        Intrinsics.checkNotNullExpressionValue(reflectProperties$LazySoftVal0, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.k = reflectProperties$LazySoftVal0;
    }

    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl0, @NotNull PropertyDescriptor propertyDescriptor0) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl0, "container");
        Intrinsics.checkNotNullParameter(propertyDescriptor0, "descriptor");
        String s = propertyDescriptor0.getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "descriptor.name.asString()");
        this(kDeclarationContainerImpl0, s, RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor0).asString(), propertyDescriptor0, CallableReference.NO_RECEIVER);
    }

    @Nullable
    public final Member computeDelegateSource() {
        if(!this.getDescriptor().isDelegated()) {
            return null;
        }
        PropertyDescriptor propertyDescriptor0 = this.getDescriptor();
        JvmPropertySignature jvmPropertySignature0 = RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor0);
        if(jvmPropertySignature0 instanceof KotlinProperty && ((KotlinProperty)jvmPropertySignature0).getSignature().hasDelegateMethod()) {
            JvmMethodSignature jvmProtoBuf$JvmMethodSignature0 = ((KotlinProperty)jvmPropertySignature0).getSignature().getDelegateMethod();
            return jvmProtoBuf$JvmMethodSignature0.hasName() && jvmProtoBuf$JvmMethodSignature0.hasDesc() ? this.getContainer().findMethodBySignature(((KotlinProperty)jvmPropertySignature0).getNameResolver().getString(jvmProtoBuf$JvmMethodSignature0.getName()), ((KotlinProperty)jvmPropertySignature0).getNameResolver().getString(jvmProtoBuf$JvmMethodSignature0.getDesc())) : null;
        }
        return this.getJavaField();
    }

    // 去混淆评级： 低(25)
    @Override
    public boolean equals(@Nullable Object object0) {
        KPropertyImpl kPropertyImpl0 = UtilKt.asKPropertyImpl(object0);
        return kPropertyImpl0 == null ? false : Intrinsics.areEqual(this.getContainer(), kPropertyImpl0.getContainer()) && Intrinsics.areEqual(this.getName(), kPropertyImpl0.getName()) && Intrinsics.areEqual(this.h, kPropertyImpl0.h) && Intrinsics.areEqual(this.i, kPropertyImpl0.i);
    }

    @Nullable
    public final Object getBoundReceiver() {
        PropertyDescriptor propertyDescriptor0 = this.getDescriptor();
        return InlineClassAwareCallerKt.coerceToExpectedReceiverType(this.i, propertyDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public Caller getCaller() {
        return this.getGetter().getCaller();
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public KDeclarationContainerImpl getContainer() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    public Caller getDefaultCaller() {
        return this.getGetter().getDefaultCaller();
    }

    @Nullable
    public final Object getDelegateImpl(@Nullable Member member0, @Nullable Object object0, @Nullable Object object1) {
        try {
            Object object2 = KPropertyImpl.l;
            if((object0 == object2 || object1 == object2) && this.getDescriptor().getExtensionReceiverParameter() == null) {
                throw new RuntimeException("\'" + this + "\' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object object3 = this.isBound() ? this.getBoundReceiver() : object0;
            if(object3 == object2) {
                object3 = null;
            }
            if(!this.isBound()) {
                object0 = object1;
            }
            if(object0 == object2) {
                object0 = null;
            }
            AccessibleObject accessibleObject0 = member0 instanceof AccessibleObject ? ((AccessibleObject)member0) : null;
            if(accessibleObject0 != null) {
                accessibleObject0.setAccessible(KCallablesJvm.isAccessible(this));
            }
            if(member0 != null) {
                if(member0 instanceof Field) {
                    return ((Field)member0).get(object3);
                }
                if(member0 instanceof Method) {
                    switch(((Method)member0).getParameterTypes().length) {
                        case 0: {
                            return ((Method)member0).invoke(null, null);
                        }
                        case 1: {
                            if(object3 == null) {
                                Class class0 = ((Method)member0).getParameterTypes()[0];
                                Intrinsics.checkNotNullExpressionValue(class0, "fieldOrMethod.parameterTypes[0]");
                                object3 = UtilKt.defaultPrimitiveValue(class0);
                            }
                            return ((Method)member0).invoke(null, object3);
                        }
                        case 2: {
                            if(object0 == null) {
                                Class class1 = ((Method)member0).getParameterTypes()[1];
                                Intrinsics.checkNotNullExpressionValue(class1, "fieldOrMethod.parameterTypes[1]");
                                object0 = UtilKt.defaultPrimitiveValue(class1);
                            }
                            return ((Method)member0).invoke(null, object3, object0);
                        }
                        default: {
                            throw new AssertionError("delegate method " + member0 + " should take 0, 1, or 2 parameters");
                        }
                    }
                }
                throw new AssertionError("delegate field/method " + member0 + " neither field nor method");
            }
            return null;
        }
        catch(IllegalAccessException illegalAccessException0) {
        }
        throw new IllegalPropertyDelegateAccessException(illegalAccessException0);
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    public CallableMemberDescriptor getDescriptor() {
        return this.getDescriptor();
    }

    @NotNull
    public PropertyDescriptor getDescriptor() {
        Object object0 = this.k.invoke();
        Intrinsics.checkNotNullExpressionValue(object0, "_descriptor()");
        return (PropertyDescriptor)object0;
    }

    @NotNull
    public abstract Getter getGetter();

    @Nullable
    public final Field getJavaField() {
        return (Field)this.j.getValue();
    }

    @Override  // kotlin.reflect.KCallable
    @NotNull
    public String getName() {
        return this.g;
    }

    @NotNull
    public final String getSignature() {
        return this.h;
    }

    @Override
    public int hashCode() {
        return this.h.hashCode() + (this.getName().hashCode() + this.getContainer().hashCode() * 0x1F) * 0x1F;
    }

    @Override  // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return !Intrinsics.areEqual(this.i, CallableReference.NO_RECEIVER);
    }

    @Override  // kotlin.reflect.KProperty
    public boolean isConst() {
        return this.getDescriptor().isConst();
    }

    @Override  // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return this.getDescriptor().isLateInit();
    }

    @Override  // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        PropertyDescriptor propertyDescriptor0 = this.getDescriptor();
        return ReflectionObjectRenderer.INSTANCE.renderProperty(propertyDescriptor0);
    }
}


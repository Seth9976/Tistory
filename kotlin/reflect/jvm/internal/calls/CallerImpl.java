package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000  *\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b!\"# $%&\'J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0013\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0019\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R \u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u000E0\u001A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\u0082\u0001\u0007()*+,-.¨\u0006/"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "obj", "", "checkObjectInstance", "(Ljava/lang/Object;)V", "a", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "b", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "getInstanceClass", "()Ljava/lang/Class;", "instanceClass", "", "d", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "Companion", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
public abstract class CallerImpl implements Caller {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001D\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n247#2:251\n26#3:252\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n*L\n76#1:251\n76#1:252\n*E\n"})
    public static final class AccessorForHiddenBoundConstructor extends CallerImpl implements BoundCaller {
        public final Object e;

        public AccessorForHiddenBoundConstructor(@NotNull Constructor constructor0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(constructor0, "constructor");
            Class class0 = constructor0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(class0, "constructor.declaringClass");
            Type[] arr_type = constructor0.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_type, "constructor.genericParameterTypes");
            Type[] arr_type1 = arr_type.length <= 2 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_type, 1, arr_type.length - 1);
            super(constructor0, class0, null, arr_type1, null);
            this.e = object0;
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(3);
            spreadBuilder0.add(this.e);
            spreadBuilder0.addSpread(arr_object);
            spreadBuilder0.add(null);
            return ((Constructor)this.getMember()).newInstance(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n243#2:251\n26#3:252\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n*L\n62#1:251\n62#1:252\n*E\n"})
    public static final class AccessorForHiddenConstructor extends CallerImpl {
        public AccessorForHiddenConstructor(@NotNull Constructor constructor0) {
            Intrinsics.checkNotNullParameter(constructor0, "constructor");
            Class class0 = constructor0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(class0, "constructor.declaringClass");
            Type[] arr_type = constructor0.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_type, "constructor.genericParameterTypes");
            Type[] arr_type1 = arr_type.length <= 1 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_type, 0, arr_type.length - 1);
            super(constructor0, class0, null, arr_type1, null);
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.addSpread(arr_object);
            spreadBuilder0.add(null);
            return ((Constructor)this.getMember()).newInstance(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001D\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class BoundConstructor extends CallerImpl implements BoundCaller {
        public final Object e;

        public BoundConstructor(@NotNull Constructor constructor0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(constructor0, "constructor");
            Class class0 = constructor0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(class0, "constructor.declaringClass");
            Type[] arr_type = constructor0.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_type, "constructor.genericParameterTypes");
            super(constructor0, class0, null, arr_type, null);
            this.e = object0;
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.add(this.e);
            spreadBuilder0.addSpread(arr_object);
            return ((Constructor)this.getMember()).newInstance(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J*\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n26#2:251\n26#2:252\n26#2:253\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n239#1:251\n243#1:252\n247#1:253\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.Constructor extends CallerImpl {
        public kotlin.reflect.jvm.internal.calls.CallerImpl.Constructor(@NotNull Constructor constructor0) {
            Intrinsics.checkNotNullParameter(constructor0, "constructor");
            Class class0 = constructor0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(class0, "constructor.declaringClass");
            Class class1 = constructor0.getDeclaringClass();
            Class class2 = class1.getDeclaringClass();
            Class class3 = class2 == null || Modifier.isStatic(class1.getModifiers()) ? null : class2;
            Type[] arr_type = constructor0.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(arr_type, "constructor.genericParameterTypes");
            super(constructor0, class0, class3, arr_type, null);
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            return ((Constructor)this.getMember()).newInstance(Arrays.copyOf(arr_object, arr_object.length));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\b\t\n\u000B\fJ\u001D\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000E\u000F\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n26#2:251\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter\n*L\n157#1:251\n*E\n"})
    public static abstract class FieldGetter extends CallerImpl {
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class BoundInstance extends FieldGetter implements BoundCaller {
            public final Object e;

            public BoundInstance(@NotNull Field field0, @Nullable Object object0) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, false, null);
                this.e = object0;
            }

            @Override  // kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                return ((Field)this.getMember()).get(this.e);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
            public BoundJvmStaticInObject(@NotNull Field field0) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, false, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Instance extends FieldGetter {
            public Instance(@NotNull Field field0) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, true, null);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001A\u00020\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class JvmStaticInObject extends FieldGetter {
            public JvmStaticInObject(@NotNull Field field0) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, true, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                super.checkArguments(arr_object);
                this.checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(arr_object));
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Static extends FieldGetter {
            public Static(@NotNull Field field0) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, false, null);
            }
        }

        public FieldGetter(Field field0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
            Type type0 = field0.getGenericType();
            Intrinsics.checkNotNullExpressionValue(type0, "field.genericType");
            super(field0, type0, (z ? field0.getDeclaringClass() : null), new Type[0], null);
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            Field field0 = (Field)this.getMember();
            return this.getInstanceClass() == null ? field0.get(null) : field0.get(ArraysKt___ArraysKt.first(arr_object));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000B\f\r\u000E\u000FJ\u001B\u0010\u0006\u001A\u00020\u00052\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\t\u001A\u0004\u0018\u00010\b2\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class FieldSetter extends CallerImpl {
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\r\u001A\u00020\u00072\n\u0010\f\u001A\u0006\u0012\u0002\b\u00030\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundInstance extends FieldSetter implements BoundCaller {
            public final Object f;

            public kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundInstance(@NotNull Field field0, boolean z, @Nullable Object object0) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, z, false, null);
                this.f = object0;
            }

            @Override  // kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter
            @NotNull
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                Object object0 = ArraysKt___ArraysKt.first(arr_object);
                ((Field)this.getMember()).set(this.f, object0);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001A\u00020\t2\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\u000BH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundJvmStaticInObject extends FieldSetter implements BoundCaller {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.BoundJvmStaticInObject(@NotNull Field field0, boolean z) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, z, false, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter
            @NotNull
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                ((Field)this.getMember()).set(null, ArraysKt___ArraysKt.last(arr_object));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Instance extends FieldSetter {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Instance(@NotNull Field field0, boolean z) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, z, true, null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001A\u00020\b2\n\u0010\t\u001A\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.JvmStaticInObject extends FieldSetter {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.JvmStaticInObject(@NotNull Field field0, boolean z) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, z, true, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter
            public void checkArguments(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                super.checkArguments(arr_object);
                this.checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(arr_object));
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Static extends FieldSetter {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter.Static(@NotNull Field field0, boolean z) {
                Intrinsics.checkNotNullParameter(field0, "field");
                super(field0, z, false, null);
            }
        }

        public final boolean e;

        public FieldSetter(Field field0, boolean z, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
            Class class0 = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(class0, "TYPE");
            Class class1 = z1 ? field0.getDeclaringClass() : null;
            Type type0 = field0.getGenericType();
            Intrinsics.checkNotNullExpressionValue(type0, "field.genericType");
            super(field0, class0, class1, new Type[]{type0}, null);
            this.e = z;
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            ((Field)this.getMember()).set((this.getInstanceClass() == null ? null : ArraysKt___ArraysKt.first(arr_object)), ArraysKt___ArraysKt.last(arr_object));
            return Unit.INSTANCE;
        }

        @Override  // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void checkArguments(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            super.checkArguments(arr_object);
            if(this.e && ArraysKt___ArraysKt.last(arr_object) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\t\n\u000B\f\r\u000EJ\'\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000F\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "callMethod", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Method extends CallerImpl {
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance extends Method implements BoundCaller {
            public final Object f;

            public kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(@NotNull java.lang.reflect.Method method0, @Nullable Object object0) {
                Intrinsics.checkNotNullParameter(method0, "method");
                super(method0, false, null, 4, null);
                this.f = object0;
            }

            @Override  // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                return this.callMethod(this.f, arr_object);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001B\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject extends Method implements BoundCaller {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject(@NotNull java.lang.reflect.Method method0) {
                Intrinsics.checkNotNullParameter(method0, "method");
                super(method0, false, null, 4, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                return this.callMethod(null, arr_object);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n239#2:251\n26#3:252\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n*L\n126#1:251\n126#1:252\n*E\n"})
        public static final class BoundStatic extends Method implements BoundCaller {
            public final Object f;

            public BoundStatic(@NotNull java.lang.reflect.Method method0, @Nullable Object object0) {
                Intrinsics.checkNotNullParameter(method0, "method");
                Type[] arr_type = method0.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(arr_type, "method.genericParameterTypes");
                Type[] arr_type1 = arr_type.length <= 1 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(arr_type, 1, arr_type.length);
                super(method0, false, arr_type1, null);
                this.f = object0;
            }

            @Override  // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
                spreadBuilder0.add(this.f);
                spreadBuilder0.addSpread(arr_object);
                return this.callMethod(null, spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n239#2:251\n26#3:252\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n*L\n113#1:251\n113#1:252\n*E\n"})
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance extends Method {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(@NotNull java.lang.reflect.Method method0) {
                Intrinsics.checkNotNullParameter(method0, "method");
                super(method0, false, null, 6, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                Object object0 = arr_object[0];
                return arr_object.length > 1 ? this.callMethod(object0, ArraysKt___ArraysJvmKt.copyOfRange(arr_object, 1, arr_object.length)) : this.callMethod(object0, new Object[0]);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,250:1\n239#2:251\n26#3:252\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n*L\n121#1:251\n121#1:252\n*E\n"})
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject extends Method {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject(@NotNull java.lang.reflect.Method method0) {
                Intrinsics.checkNotNullParameter(method0, "method");
                super(method0, true, null, 4, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                this.checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(arr_object));
                return arr_object.length > 1 ? this.callMethod(null, ArraysKt___ArraysJvmKt.copyOfRange(arr_object, 1, arr_object.length)) : this.callMethod(null, new Object[0]);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static extends Method {
            public kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static(@NotNull java.lang.reflect.Method method0) {
                Intrinsics.checkNotNullParameter(method0, "method");
                super(method0, false, null, 6, null);
            }

            @Override  // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] arr_object) {
                Intrinsics.checkNotNullParameter(arr_object, "args");
                this.checkArguments(arr_object);
                return this.callMethod(null, arr_object);
            }
        }

        public final boolean e;

        public Method(java.lang.reflect.Method method0, boolean z, Type[] arr_type, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                z = !Modifier.isStatic(method0.getModifiers());
            }
            if((v & 4) != 0) {
                arr_type = method0.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(arr_type, "method.genericParameterTypes");
            }
            this(method0, z, arr_type, null);
        }

        public Method(java.lang.reflect.Method method0, boolean z, Type[] arr_type, DefaultConstructorMarker defaultConstructorMarker0) {
            Type type0 = method0.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(type0, "method.genericReturnType");
            super(method0, type0, (z ? method0.getDeclaringClass() : null), arr_type, null);
            this.e = Intrinsics.areEqual(this.getReturnType(), Void.TYPE);
        }

        @Nullable
        public final Object callMethod(@Nullable Object object0, @NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            Unit unit0 = ((java.lang.reflect.Method)this.getMember()).invoke(object0, Arrays.copyOf(arr_object, arr_object.length));
            return this.e ? Unit.INSTANCE : unit0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    static {
        CallerImpl.Companion = new Companion(null);
    }

    public CallerImpl(Member member0, Type type0, Class class0, Type[] arr_type, DefaultConstructorMarker defaultConstructorMarker0) {
        List list0;
        this.a = member0;
        this.b = type0;
        this.c = class0;
        if(class0 == null) {
            list0 = ArraysKt___ArraysKt.toList(arr_type);
        }
        else {
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.add(class0);
            spreadBuilder0.addSpread(arr_type);
            list0 = CollectionsKt__CollectionsKt.listOf(spreadBuilder0.toArray(new Type[spreadBuilder0.size()]));
            if(list0 == null) {
                list0 = ArraysKt___ArraysKt.toList(arr_type);
            }
        }
        this.d = list0;
    }

    public void checkArguments(@NotNull Object[] arr_object) {
        DefaultImpls.checkArguments(this, arr_object);
    }

    public final void checkObjectInstance(@Nullable Object object0) {
        if(object0 == null || !this.a.getDeclaringClass().isInstance(object0)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Nullable
    public final Class getInstanceClass() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final Member getMember() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List getParameterTypes() {
        return this.d;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final Type getReturnType() {
        return this.b;
    }
}


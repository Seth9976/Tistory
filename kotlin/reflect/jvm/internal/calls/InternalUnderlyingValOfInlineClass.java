package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0018\u0019J\'\u0010\u0007\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0014\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001A\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001A\u001B¨\u0006\u001C"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "callMethod", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Type;", "b", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "c", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "getMember", "()Ljava/lang/reflect/Method;", "member", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class InternalUnderlyingValOfInlineClass implements Caller {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\u0010\n\u001A\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {
        public final Object d;

        public Bound(@NotNull Method method0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(method0, "unboxMethod");
            super(method0, CollectionsKt__CollectionsKt.emptyList(), null);
            this.d = object0;
        }

        @Override  // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] arr_object) {
            Intrinsics.checkNotNullParameter(arr_object, "args");
            this.checkArguments(arr_object);
            return this.callMethod(this.d, arr_object);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00062\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nInternalUnderlyingValOfInlineClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,45:1\n239#2:46\n26#3:47\n*S KotlinDebug\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n*L\n31#1:46\n31#1:47\n*E\n"})
    public static final class Unbound extends InternalUnderlyingValOfInlineClass {
        public Unbound(@NotNull Method method0) {
            Intrinsics.checkNotNullParameter(method0, "unboxMethod");
            super(method0, k.listOf(method0.getDeclaringClass()), null);
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

    public final Method a;
    public final List b;
    public final Class c;

    public InternalUnderlyingValOfInlineClass(Method method0, List list0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = method0;
        this.b = list0;
        Class class0 = method0.getReturnType();
        Intrinsics.checkNotNullExpressionValue(class0, "unboxMethod.returnType");
        this.c = class0;
    }

    @Nullable
    public final Object callMethod(@Nullable Object object0, @NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "args");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        return this.a.invoke(object0, arr_object1);
    }

    public void checkArguments(@NotNull Object[] arr_object) {
        DefaultImpls.checkArguments(this, arr_object);
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    public Member getMember() {
        return null;
    }

    @Nullable
    public final Method getMember() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final List getParameterTypes() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final Type getReturnType() {
        return this.c;
    }
}


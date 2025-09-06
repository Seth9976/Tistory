package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002!\"BA\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0013\u001A\u0004\u0018\u00010\u00122\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00150\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001D\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010 \u001A\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "e", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "getMember", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,181:1\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,2:187\n1622#2:190\n1549#2:191\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n1#3:189\n11425#4:199\n11536#4,4:200\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n*L\n28#1:182\n28#1:183,3\n35#1:186\n35#1:187,2\n35#1:190\n37#1:191\n37#1:192,3\n20#1:195\n20#1:196,3\n53#1:199\n53#1:200,4\n*E\n"})
public final class AnnotationConstructorCaller implements Caller {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL;

    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Origin {
        JAVA,
        KOTLIN;

    }

    public final Class a;
    public final List b;
    public final CallMode c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public AnnotationConstructorCaller(@NotNull Class class0, @NotNull List list0, @NotNull CallMode annotationConstructorCaller$CallMode0, @NotNull Origin annotationConstructorCaller$Origin0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        Intrinsics.checkNotNullParameter(list0, "parameterNames");
        Intrinsics.checkNotNullParameter(annotationConstructorCaller$CallMode0, "callMode");
        Intrinsics.checkNotNullParameter(annotationConstructorCaller$Origin0, "origin");
        Intrinsics.checkNotNullParameter(list1, "methods");
        super();
        this.a = class0;
        this.b = list0;
        this.c = annotationConstructorCaller$CallMode0;
        this.d = list1;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
        for(Object object0: list1) {
            arrayList0.add(((Method)object0).getGenericReturnType());
        }
        this.e = arrayList0;
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(this.d, 10));
        for(Object object1: this.d) {
            Class class1 = ((Method)object1).getReturnType();
            Intrinsics.checkNotNullExpressionValue(class1, "it");
            Class class2 = ReflectClassUtilKt.getWrapperByPrimitive(class1);
            if(class2 != null) {
                class1 = class2;
            }
            arrayList1.add(class1);
        }
        this.f = arrayList1;
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(this.d, 10));
        for(Object object2: this.d) {
            arrayList2.add(((Method)object2).getDefaultValue());
        }
        this.g = arrayList2;
        if(this.c == CallMode.POSITIONAL_CALL && annotationConstructorCaller$Origin0 == Origin.JAVA && !CollectionsKt___CollectionsKt.minus(this.b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public AnnotationConstructorCaller(Class class0, List list0, CallMode annotationConstructorCaller$CallMode0, Origin annotationConstructorCaller$Origin0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        List list2;
        if((v & 16) == 0) {
            list2 = list1;
        }
        else {
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(class0.getDeclaredMethod(((String)object0), null));
            }
            list2 = arrayList0;
        }
        this(class0, list0, annotationConstructorCaller$CallMode0, annotationConstructorCaller$Origin0, list2);
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] arr_object) {
        List list0;
        Intrinsics.checkNotNullParameter(arr_object, "args");
        this.checkArguments(arr_object);
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        int v = 0;
        int v1 = 0;
        while(true) {
            list0 = this.b;
            if(v >= arr_object.length) {
                break;
            }
            Object object0 = arr_object[v];
            ArrayList arrayList1 = this.f;
            Object object1 = object0 != null || this.c != CallMode.CALL_BY_NAME ? AnnotationConstructorCallerKt.access$transformKotlinToJvm(object0, ((Class)arrayList1.get(v1))) : this.g.get(v1);
            if(object1 != null) {
                arrayList0.add(object1);
                ++v;
                ++v1;
                continue;
            }
            AnnotationConstructorCallerKt.access$throwIllegalArgumentType(v1, ((String)list0.get(v1)), ((Class)arrayList1.get(v1)));
            throw null;
        }
        Map map0 = x.toMap(CollectionsKt___CollectionsKt.zip(list0, arrayList0));
        return AnnotationConstructorCallerKt.createAnnotationInstance(this.a, map0, this.d);
    }

    public void checkArguments(@NotNull Object[] arr_object) {
        DefaultImpls.checkArguments(this, arr_object);
    }

    @Nullable
    public Void getMember() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    public Member getMember() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List getParameterTypes() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.a;
    }
}


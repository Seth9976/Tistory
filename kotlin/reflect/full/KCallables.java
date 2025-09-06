package kotlin.reflect.full;

import de.b;
import de.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter.Kind;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\u001A9\u0010\u000F\u001A\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00022\u0016\u0010\u0011\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001A7\u0010\u0015\u001A\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00022\u0014\u0010\u0011\u001A\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0016H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001A\u001A\u0010\u0018\u001A\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0019\u001A\u00020\u001AH\u0007\"$\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"$\u0010\u0007\u001A\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\"(\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u000B*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0004\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001B"}, d2 = {"extensionReceiverParameter", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KCallable;", "getExtensionReceiverParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "getExtensionReceiverParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "instanceParameter", "getInstanceParameter$annotations", "getInstanceParameter", "valueParameters", "", "getValueParameters$annotations", "getValueParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "callSuspend", "R", "args", "", "", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callSuspendBy", "", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findParameterByName", "name", "", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "KCallables")
@SourceDebugExtension({"SMAP\nKCallables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n661#2,11:83\n661#2,11:94\n766#2:105\n857#2,2:106\n661#2,11:108\n1#3:119\n*S KotlinDebug\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n*L\n23#1:83,11\n31#1:94,11\n38#1:105\n38#1:106,2\n45#1:108,11\n*E\n"})
public final class KCallables {
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final Object callSuspend(@NotNull KCallable kCallable0, @NotNull Object[] arr_object, @NotNull Continuation continuation0) {
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.r;
            if((v & 0x80000000) == 0) {
                b0 = new b(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                b0.r = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = b0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!kCallable0.isSuspend()) {
                    return kCallable0.call(Arrays.copyOf(arr_object, arr_object.length));
                }
                if(!(kCallable0 instanceof KFunction)) {
                    throw new IllegalArgumentException("Cannot callSuspend on a property " + kCallable0 + ": suspend properties are not supported yet");
                }
                b0.o = kCallable0;
                b0.p = arr_object;
                b0.r = 1;
                SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
                spreadBuilder0.addSpread(arr_object);
                spreadBuilder0.add(b0);
                object0 = kCallable0.call(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
                if(object0 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(b0);
                }
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                kCallable0 = b0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Intrinsics.areEqual(kCallable0.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class)) && !kCallable0.getReturnType().isMarkedNullable() ? Unit.INSTANCE : object0;
    }

    @SinceKotlin(version = "1.3")
    @Nullable
    public static final Object callSuspendBy(@NotNull KCallable kCallable0, @NotNull Map map0, @NotNull Continuation continuation0) {
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.r;
            if((v & 0x80000000) == 0) {
                c0 = new c(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                c0.r = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = c0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!kCallable0.isSuspend()) {
                    return kCallable0.callBy(map0);
                }
                if(!(kCallable0 instanceof KFunction)) {
                    throw new IllegalArgumentException("Cannot callSuspendBy on a property " + kCallable0 + ": suspend properties are not supported yet");
                }
                KCallableImpl kCallableImpl0 = UtilKt.asKCallableImpl(kCallable0);
                if(kCallableImpl0 == null) {
                    throw new KotlinReflectionInternalError("This callable does not support a default call: " + kCallable0);
                }
                c0.o = kCallable0;
                c0.p = map0;
                c0.r = 1;
                object0 = kCallableImpl0.callDefaultMethod$kotlin_reflection(map0, c0);
                if(object0 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c0);
                }
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                kCallable0 = c0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Intrinsics.areEqual(kCallable0.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class)) && !kCallable0.getReturnType().isMarkedNullable() ? Unit.INSTANCE : object0;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final KParameter findParameterByName(@NotNull KCallable kCallable0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(kCallable0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        Object object0 = null;
        boolean z = false;
        Object object1 = null;
        Iterator iterator0 = kCallable0.getParameters().iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                if(!z) {
                    break;
                }
                object0 = object1;
                break;
            }
            Object object2 = iterator0.next();
            if(Intrinsics.areEqual(((KParameter)object2).getName(), s)) {
                if(z) {
                    break;
                }
                z = true;
                object1 = object2;
            }
        }
        return (KParameter)object0;
    }

    @Nullable
    public static final KParameter getExtensionReceiverParameter(@NotNull KCallable kCallable0) {
        Intrinsics.checkNotNullParameter(kCallable0, "<this>");
        Object object0 = null;
        boolean z = false;
        Object object1 = null;
        Iterator iterator0 = kCallable0.getParameters().iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                if(!z) {
                    break;
                }
                object0 = object1;
                break;
            }
            Object object2 = iterator0.next();
            if(((KParameter)object2).getKind() == Kind.EXTENSION_RECEIVER) {
                if(z) {
                    break;
                }
                z = true;
                object1 = object2;
            }
        }
        return (KParameter)object0;
    }

    @SinceKotlin(version = "1.1")
    public static void getExtensionReceiverParameter$annotations(KCallable kCallable0) {
    }

    @Nullable
    public static final KParameter getInstanceParameter(@NotNull KCallable kCallable0) {
        Intrinsics.checkNotNullParameter(kCallable0, "<this>");
        Object object0 = null;
        boolean z = false;
        Object object1 = null;
        Iterator iterator0 = kCallable0.getParameters().iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                if(!z) {
                    break;
                }
                object0 = object1;
                break;
            }
            Object object2 = iterator0.next();
            if(((KParameter)object2).getKind() == Kind.INSTANCE) {
                if(z) {
                    break;
                }
                z = true;
                object1 = object2;
            }
        }
        return (KParameter)object0;
    }

    @SinceKotlin(version = "1.1")
    public static void getInstanceParameter$annotations(KCallable kCallable0) {
    }

    @NotNull
    public static final List getValueParameters(@NotNull KCallable kCallable0) {
        Intrinsics.checkNotNullParameter(kCallable0, "<this>");
        Iterable iterable0 = kCallable0.getParameters();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((KParameter)object0).getKind() == Kind.VALUE) {
                list0.add(object0);
            }
        }
        return list0;
    }

    @SinceKotlin(version = "1.1")
    public static void getValueParameters$annotations(KCallable kCallable0) {
    }
}


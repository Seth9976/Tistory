package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CopyableThrowable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.y0;
import zf.b;
import zf.c;
import zf.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A#\u0010\u0003\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004*(\b\u0002\u0010\u0006\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00052\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¨\u0006\u0007"}, d2 = {"", "E", "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/Function1;", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
public final class ExceptionsConstructorKt {
    public static final int a;
    public static final CtorCache b;

    static {
        ExceptionsConstructorKt.a = ExceptionsConstructorKt.a(-1, Throwable.class);
        ExceptionsConstructorKt.b = l.a;
    }

    public static final int a(int v, Class class0) {
        Integer integer0;
        JvmClassMappingKt.getKotlinClass(class0);
        try {
            int v1 = 0;
            do {
                Field[] arr_field = class0.getDeclaredFields();
                int v3 = 0;
                for(int v2 = 0; v2 < arr_field.length; ++v2) {
                    if(!Modifier.isStatic(arr_field[v2].getModifiers())) {
                        ++v3;
                    }
                }
                v1 += v3;
                class0 = class0.getSuperclass();
            }
            while(class0 != null);
            integer0 = v1;
        }
        catch(Throwable throwable0) {
            integer0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        Integer integer1 = v;
        if(Result.isFailure-impl(integer0)) {
            integer0 = integer1;
        }
        return integer0.intValue();
    }

    public static final Function1 access$createConstructor(Class class0) {
        Pair pair0;
        Object object0;
        int v = ExceptionsConstructorKt.a(0, class0);
        Function1 function10 = c.w;
        if(ExceptionsConstructorKt.a == v) {
            Constructor[] arr_constructor = class0.getConstructors();
            ArrayList arrayList0 = new ArrayList(arr_constructor.length);
            for(int v1 = 0; true; ++v1) {
                object0 = null;
                if(v1 >= arr_constructor.length) {
                    break;
                }
                Constructor constructor0 = arr_constructor[v1];
                Class[] arr_class = constructor0.getParameterTypes();
                int v2 = arr_class.length;
                if(v2 == 0) {
                    pair0 = TuplesKt.to(new y0(new b(constructor0, 3)), 0);
                }
                else {
                    Class class1 = Throwable.class;
                    Class class2 = String.class;
                    switch(v2) {
                        case 1: {
                            Class class3 = arr_class[0];
                            if(Intrinsics.areEqual(class3, class2)) {
                                pair0 = TuplesKt.to(new y0(new b(constructor0, 1)), 2);
                            }
                            else if(Intrinsics.areEqual(class3, class1)) {
                                pair0 = TuplesKt.to(new y0(new b(constructor0, 2)), 1);
                            }
                            else {
                                pair0 = TuplesKt.to(null, -1);
                            }
                            break;
                        }
                        case 2: {
                            pair0 = !Intrinsics.areEqual(arr_class[0], class2) || !Intrinsics.areEqual(arr_class[1], class1) ? TuplesKt.to(null, -1) : TuplesKt.to(new y0(new b(constructor0, 0)), 3);
                            break;
                        }
                        default: {
                            pair0 = TuplesKt.to(null, -1);
                        }
                    }
                }
                arrayList0.add(pair0);
            }
            Iterator iterator0 = arrayList0.iterator();
            if(iterator0.hasNext()) {
                object0 = iterator0.next();
                if(iterator0.hasNext()) {
                    int v3 = ((Number)((Pair)object0).getSecond()).intValue();
                    while(true) {
                        Object object1 = iterator0.next();
                        int v4 = ((Number)((Pair)object1).getSecond()).intValue();
                        if(v3 < v4) {
                            object0 = object1;
                            v3 = v4;
                        }
                        if(!iterator0.hasNext()) {
                            break;
                        }
                    }
                }
            }
            if(((Pair)object0) != null) {
                Function1 function11 = (Function1)((Pair)object0).getFirst();
                return function11 == null ? function10 : function11;
            }
        }
        return function10;
    }

    @Nullable
    public static final Throwable tryCopyException(@NotNull Throwable throwable0) {
        Object object0;
        if(throwable0 instanceof CopyableThrowable) {
            try {
                object0 = Result.constructor-impl(((CopyableThrowable)throwable0).createCopy());
            }
            catch(Throwable throwable1) {
                object0 = Result.constructor-impl(ResultKt.createFailure(throwable1));
            }
            if(Result.isFailure-impl(object0)) {
                object0 = null;
            }
            return (Throwable)object0;
        }
        Class class0 = throwable0.getClass();
        return (Throwable)ExceptionsConstructorKt.b.get(class0).invoke(throwable0);
    }
}


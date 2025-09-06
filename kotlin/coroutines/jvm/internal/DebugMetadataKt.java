package kotlin.coroutines.jvm.internal;

import androidx.appcompat.widget.u2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u001B\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005*\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "getStackTraceElementImpl", "", "", "getSpilledVariableFieldMapping", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
public final class DebugMetadataKt {
    public static final void a(int v) {
        if(v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
    }

    public static final int b(BaseContinuationImpl baseContinuationImpl0) {
        try {
            Field field0 = baseContinuationImpl0.getClass().getDeclaredField("label");
            field0.setAccessible(true);
            Object object0 = field0.get(baseContinuationImpl0);
            Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
            return integer0 == null ? -1 : ((int)integer0) - 1;
        }
        catch(Exception unused_ex) {
            return -1;
        }
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "getSpilledVariableFieldMapping")
    @Nullable
    public static final String[] getSpilledVariableFieldMapping(@NotNull BaseContinuationImpl baseContinuationImpl0) {
        Intrinsics.checkNotNullParameter(baseContinuationImpl0, "<this>");
        DebugMetadata debugMetadata0 = (DebugMetadata)baseContinuationImpl0.getClass().getAnnotation(DebugMetadata.class);
        if(debugMetadata0 == null) {
            return null;
        }
        DebugMetadataKt.a(debugMetadata0.v());
        ArrayList arrayList0 = new ArrayList();
        int v = DebugMetadataKt.b(baseContinuationImpl0);
        int[] arr_v = debugMetadata0.i();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                arrayList0.add(debugMetadata0.s()[v1]);
                arrayList0.add(debugMetadata0.n()[v1]);
            }
        }
        return (String[])arrayList0.toArray(new String[0]);
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "getStackTraceElement")
    @Nullable
    public static final StackTraceElement getStackTraceElement(@NotNull BaseContinuationImpl baseContinuationImpl0) {
        Intrinsics.checkNotNullParameter(baseContinuationImpl0, "<this>");
        DebugMetadata debugMetadata0 = (DebugMetadata)baseContinuationImpl0.getClass().getAnnotation(DebugMetadata.class);
        String s = null;
        if(debugMetadata0 == null) {
            return null;
        }
        DebugMetadataKt.a(debugMetadata0.v());
        int v = DebugMetadataKt.b(baseContinuationImpl0);
        int v1 = v >= 0 ? debugMetadata0.l()[v] : -1;
        Intrinsics.checkNotNullParameter(baseContinuationImpl0, "continuation");
        u2 u20 = a.b;
        u2 u21 = a.a;
        if(u20 == null) {
            try {
                u2 u22 = new u2(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl0.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl0.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                a.b = u22;
                u20 = u22;
            }
            catch(Exception unused_ex) {
                a.b = u21;
                u20 = u21;
            }
        }
        if(u20 != u21) {
            Object object0 = u20.a == null ? null : u20.a.invoke(baseContinuationImpl0.getClass(), null);
            if(object0 != null) {
                Object object1 = u20.b == null ? null : u20.b.invoke(object0, null);
                if(object1 != null) {
                    Object object2 = u20.c == null ? null : u20.c.invoke(object1, null);
                    if(object2 instanceof String) {
                        s = (String)object2;
                    }
                }
            }
        }
        return s == null ? new StackTraceElement(debugMetadata0.c(), debugMetadata0.m(), debugMetadata0.f(), v1) : new StackTraceElement(s + '/' + debugMetadata0.c(), debugMetadata0.m(), debugMetadata0.f(), v1);
    }
}


package kotlin.reflect.jvm.internal;

import fe.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A-\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\'\u0010\b\u001A\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001A\u000F\u0010\u000B\u001A\u00020\nH\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A=\u0010\u0013\u001A\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0006\u0010\u0011\u001A\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014*0\b\u0002\u0010\u0016\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u00100\u00152\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u0004\u0012\u00020\u00100\u0015¨\u0006\u0017"}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "getOrCreateKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/KDeclarationContainer;", "getOrCreateKotlinPackage", "(Ljava/lang/Class;)Lkotlin/reflect/KDeclarationContainer;", "", "clearCaches", "()V", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/KType;", "getOrCreateKType", "(Ljava/lang/Class;Ljava/util/List;Z)Lkotlin/reflect/KType;", "Lkotlin/Pair;", "Key", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\ncaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n73#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n*L\n68#1:75,2\n68#1:77\n*E\n"})
public final class CachesKt {
    public static final CacheByClass a;
    public static final CacheByClass b;
    public static final CacheByClass c;
    public static final CacheByClass d;
    public static final CacheByClass e;

    static {
        CachesKt.a = CacheByClassKt.createCache(a.A);
        CachesKt.b = CacheByClassKt.createCache(a.B);
        CachesKt.c = CacheByClassKt.createCache(a.x);
        CachesKt.d = CacheByClassKt.createCache(a.z);
        CachesKt.e = CacheByClassKt.createCache(a.y);
    }

    public static final void clearCaches() {
        CachesKt.a.clear();
        CachesKt.b.clear();
        CachesKt.c.clear();
        CachesKt.d.clear();
        CachesKt.e.clear();
    }

    @NotNull
    public static final KType getOrCreateKType(@NotNull Class class0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        if(list0.isEmpty()) {
            return z ? ((KType)CachesKt.d.get(class0)) : ((KType)CachesKt.c.get(class0));
        }
        ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)CachesKt.e.get(class0);
        Pair pair0 = TuplesKt.to(list0, Boolean.valueOf(z));
        KType kType0 = concurrentHashMap0.get(pair0);
        if(kType0 == null) {
            KType kType1 = KClassifiers.createType(CachesKt.getOrCreateKotlinClass(class0), list0, z, CollectionsKt__CollectionsKt.emptyList());
            Object object0 = concurrentHashMap0.putIfAbsent(pair0, kType1);
            kType0 = object0 == null ? kType1 : object0;
        }
        Intrinsics.checkNotNullExpressionValue(kType0, "cache.getOrPut(arguments…lable, emptyList())\n    }");
        return kType0;
    }

    @NotNull
    public static final KClassImpl getOrCreateKotlinClass(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        Object object0 = CachesKt.a.get(class0);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl)object0;
    }

    @NotNull
    public static final KDeclarationContainer getOrCreateKotlinPackage(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "jClass");
        return (KDeclarationContainer)CachesKt.b.get(class0);
    }
}


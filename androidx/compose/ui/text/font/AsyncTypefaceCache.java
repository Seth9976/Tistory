package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import i2.f;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001A\u001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\b\u001A\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010JJ\u0010\u0015\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u001E\u0010\u0014\u001A\u001A\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0018\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u000E\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/Font;", "font", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "result", "", "forever", "", "put", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Ljava/lang/Object;Z)V", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get-1ASDuI8", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "runCached", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "runCachedBlocking", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,432:1\n26#2:433\n26#2:434\n26#2:435\n26#2:436\n26#2:437\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n369#1:433\n380#1:434\n392#1:435\n399#1:436\n420#1:437\n*E\n"})
public final class AsyncTypefaceCache {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001A\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u0011\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000F\u0010\u0010R\u0019\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001A\u00020\u000E8F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "isPermanentFailure-impl", "(Ljava/lang/Object;)Z", "isPermanentFailure", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class AsyncTypefaceResult {
        public final Object a;

        public AsyncTypefaceResult(Object object0) {
            this.a = object0;
        }

        public static final AsyncTypefaceResult box-impl(Object object0) {
            return new AsyncTypefaceResult(object0);
        }

        @NotNull
        public static Object constructor-impl(@Nullable Object object0) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return AsyncTypefaceResult.equals-impl(this.a, object0);
        }

        // 去混淆评级： 低(20)
        public static boolean equals-impl(Object object0, Object object1) {
            return object1 instanceof AsyncTypefaceResult ? Intrinsics.areEqual(object0, ((AsyncTypefaceResult)object1).unbox-impl()) : false;
        }

        public static final boolean equals-impl0(Object object0, Object object1) {
            return Intrinsics.areEqual(object0, object1);
        }

        @Nullable
        public final Object getResult() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return AsyncTypefaceResult.hashCode-impl(this.a);
        }

        public static int hashCode-impl(Object object0) {
            return object0 == null ? 0 : object0.hashCode();
        }

        public static final boolean isPermanentFailure-impl(Object object0) {
            return object0 == null;
        }

        @Override
        public String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }

        public static String toString-impl(Object object0) [...] // Inlined contents

        public final Object unbox-impl() {
            return this.a;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\n¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "Landroidx/compose/ui/text/font/Font;", "font", "loaderKey", "<init>", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "component1", "()Landroidx/compose/ui/text/font/Font;", "component2", "()Ljava/lang/Object;", "copy", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/font/Font;", "getFont", "b", "Ljava/lang/Object;", "getLoaderKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Key {
        public static final int $stable = 8;
        public final Font a;
        public final Object b;

        public Key(@NotNull Font font0, @Nullable Object object0) {
            this.a = font0;
            this.b = object0;
        }

        @NotNull
        public final Font component1() {
            return this.a;
        }

        @Nullable
        public final Object component2() {
            return this.b;
        }

        @NotNull
        public final Key copy(@NotNull Font font0, @Nullable Object object0) {
            return new Key(font0, object0);
        }

        public static Key copy$default(Key asyncTypefaceCache$Key0, Font font0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                font0 = asyncTypefaceCache$Key0.a;
            }
            if((v & 2) != 0) {
                object0 = asyncTypefaceCache$Key0.b;
            }
            return asyncTypefaceCache$Key0.copy(font0, object0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Key)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Key)object0).a) ? Intrinsics.areEqual(this.b, ((Key)object0).b) : false;
        }

        @NotNull
        public final Font getFont() {
            return this.a;
        }

        @Nullable
        public final Object getLoaderKey() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }
    }

    public static final int $stable = 8;
    public final Object a;
    public final LruCache b;
    public final SimpleArrayMap c;
    public final SynchronizedObject d;

    public AsyncTypefaceCache() {
        this.a = null;
        this.b = new LruCache(16);
        this.c = new SimpleArrayMap(0, 1, null);
        this.d = Synchronization_jvmKt.createSynchronizedObject();
    }

    @Nullable
    public final AsyncTypefaceResult get-1ASDuI8(@NotNull Font font0, @NotNull PlatformFontLoader platformFontLoader0) {
        Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.getCacheKey());
        synchronized(this.d) {
            AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.b.get(asyncTypefaceCache$Key0);
            if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.c.get(asyncTypefaceCache$Key0);
            }
            return asyncTypefaceCache$AsyncTypefaceResult0;
        }
    }

    public final void put(@NotNull Font font0, @NotNull PlatformFontLoader platformFontLoader0, @Nullable Object object0, boolean z) {
        Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.getCacheKey());
        synchronized(this.d) {
            if(object0 == null) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = AsyncTypefaceResult.box-impl(this.a);
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult1 = (AsyncTypefaceResult)this.c.put(asyncTypefaceCache$Key0, asyncTypefaceCache$AsyncTypefaceResult0);
            }
            else if(z) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult2 = AsyncTypefaceResult.box-impl(object0);
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult3 = (AsyncTypefaceResult)this.c.put(asyncTypefaceCache$Key0, asyncTypefaceCache$AsyncTypefaceResult2);
            }
            else {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult4 = AsyncTypefaceResult.box-impl(object0);
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult5 = (AsyncTypefaceResult)this.b.put(asyncTypefaceCache$Key0, asyncTypefaceCache$AsyncTypefaceResult4);
            }
        }
    }

    public static void put$default(AsyncTypefaceCache asyncTypefaceCache0, Font font0, PlatformFontLoader platformFontLoader0, Object object0, boolean z, int v, Object object1) {
        if((v & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache0.put(font0, platformFontLoader0, object0, z);
    }

    @Nullable
    public final Object runCached(@NotNull Font font0, @NotNull PlatformFontLoader platformFontLoader0, boolean z, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        Key asyncTypefaceCache$Key1;
        AsyncTypefaceCache asyncTypefaceCache0;
        Object object2;
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.t;
            if((v & 0x80000000) == 0) {
                f0 = new f(this, continuation0);
            }
            else {
                f0.t = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(this, continuation0);
        }
        Object object0 = f0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.getCacheKey());
                SynchronizedObject synchronizedObject0 = this.d;
                __monitor_enter(synchronizedObject0);
                try {
                    AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.b.get(asyncTypefaceCache$Key0);
                    if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                        asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.c.get(asyncTypefaceCache$Key0);
                    }
                    if(asyncTypefaceCache$AsyncTypefaceResult0 != null) {
                        object2 = asyncTypefaceCache$AsyncTypefaceResult0.unbox-impl();
                        goto label_26;
                    }
                    goto label_28;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(synchronizedObject0);
                throw throwable0;
            label_26:
                __monitor_exit(synchronizedObject0);
                return object2;
            label_28:
                __monitor_exit(synchronizedObject0);
                f0.o = this;
                f0.p = asyncTypefaceCache$Key0;
                f0.q = z;
                f0.t = 1;
                Object object3 = function10.invoke(f0);
                if(object3 == object1) {
                    return object1;
                }
                asyncTypefaceCache0 = this;
                object0 = object3;
                asyncTypefaceCache$Key1 = asyncTypefaceCache$Key0;
                break;
            }
            case 1: {
                z = f0.q;
                asyncTypefaceCache$Key1 = f0.p;
                asyncTypefaceCache0 = f0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        synchronized(asyncTypefaceCache0.d) {
            if(object0 == null) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult1 = AsyncTypefaceResult.box-impl(asyncTypefaceCache0.a);
                asyncTypefaceCache0.c.put(asyncTypefaceCache$Key1, asyncTypefaceCache$AsyncTypefaceResult1);
            }
            else if(z) {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult2 = AsyncTypefaceResult.box-impl(object0);
                asyncTypefaceCache0.c.put(asyncTypefaceCache$Key1, asyncTypefaceCache$AsyncTypefaceResult2);
            }
            else {
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult3 = AsyncTypefaceResult.box-impl(object0);
                asyncTypefaceCache0.b.put(asyncTypefaceCache$Key1, asyncTypefaceCache$AsyncTypefaceResult3);
            }
            return object0;
        }
    }

    @Nullable
    public final Object runCachedBlocking(@NotNull Font font0, @NotNull PlatformFontLoader platformFontLoader0, @NotNull Function0 function00) {
        Object object0;
        SynchronizedObject synchronizedObject0 = this.d;
        __monitor_enter(synchronizedObject0);
        try {
            Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.getCacheKey());
            AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.b.get(asyncTypefaceCache$Key0);
            if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)this.c.get(asyncTypefaceCache$Key0);
            }
            if(asyncTypefaceCache$AsyncTypefaceResult0 != null) {
                object0 = asyncTypefaceCache$AsyncTypefaceResult0.unbox-impl();
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(synchronizedObject0);
        throw throwable0;
    label_12:
        __monitor_exit(synchronizedObject0);
        return object0;
    label_14:
        __monitor_exit(synchronizedObject0);
        Object object1 = function00.invoke();
        AsyncTypefaceCache.put$default(this, font0, platformFontLoader0, object1, false, 8, null);
        return object1;
    }
}


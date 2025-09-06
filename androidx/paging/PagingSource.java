package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import s4.a1;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001B\u0010\n\u001A\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\f\u001A\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\u000BJ*\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000F2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001A\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00168AX\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001D\u001A\u00020\u001A8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001F\u001A\u00020\u001A8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001CR\u0011\u0010!\u001A\u00020\u001A8F¢\u0006\u0006\u001A\u0004\b \u0010\u001C¨\u0006$"}, d2 = {"Landroidx/paging/PagingSource;", "", "Key", "Value", "<init>", "()V", "", "invalidate", "Lkotlin/Function0;", "onInvalidatedCallback", "registerInvalidatedCallback", "(Lkotlin/jvm/functions/Function0;)V", "unregisterInvalidatedCallback", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "", "getInvalidateCallbackCount$paging_common_release", "()I", "invalidateCallbackCount", "", "getJumpingSupported", "()Z", "jumpingSupported", "getKeyReuseSupported", "keyReuseSupported", "getInvalid", "invalid", "LoadParams", "LoadResult", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingSource.kt\nandroidx/paging/PagingSource\n+ 2 PagingLogger.kt\nandroidx/paging/PagingLoggerKt\n*L\n1#1,425:1\n32#2,10:426\n*S KotlinDebug\n*F\n+ 1 PagingSource.kt\nandroidx/paging/PagingSource\n*L\n359#1:426,10\n*E\n"})
public abstract class PagingSource {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0012*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0013\u0012\u0014\u0015R\u0017\u0010\b\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000E\u001A\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001A\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Landroidx/paging/PagingSource$LoadParams;", "", "Key", "", "a", "I", "getLoadSize", "()I", "loadSize", "", "b", "Z", "getPlaceholdersEnabled", "()Z", "placeholdersEnabled", "getKey", "()Ljava/lang/Object;", "key", "Companion", "Append", "Prepend", "Refresh", "Landroidx/paging/PagingSource$LoadParams$Append;", "Landroidx/paging/PagingSource$LoadParams$Prepend;", "Landroidx/paging/PagingSource$LoadParams$Refresh;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadParams {
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001F\u0012\u0006\u0010\u0004\u001A\u00028\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0004\u001A\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Append;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "c", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Append extends LoadParams {
            public final Object c;

            public Append(@NotNull Object object0, int v, boolean z) {
                Intrinsics.checkNotNullParameter(object0, "key");
                super(v, z, null);
                this.c = object0;
            }

            @Override  // androidx.paging.PagingSource$LoadParams
            @NotNull
            public Object getKey() {
                return this.c;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J?\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00030\n\"\b\b\u0003\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\u0010\u0005\u001A\u0004\u0018\u00018\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Companion;", "", "Key", "Landroidx/paging/LoadType;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "Landroidx/paging/PagingSource$LoadParams;", "create", "(Landroidx/paging/LoadType;Ljava/lang/Object;IZ)Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[LoadType.values().length];
                    try {
                        arr_v[LoadType.REFRESH.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[LoadType.PREPEND.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[LoadType.APPEND.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final LoadParams create(@NotNull LoadType loadType0, @Nullable Object object0, int v, boolean z) {
                Intrinsics.checkNotNullParameter(loadType0, "loadType");
                switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
                    case 1: {
                        return new Refresh(object0, v, z);
                    }
                    case 2: {
                        if(object0 == null) {
                            throw new IllegalArgumentException("key cannot be null for prepend");
                        }
                        return new Prepend(object0, v, z);
                    }
                    case 3: {
                        if(object0 == null) {
                            throw new IllegalArgumentException("key cannot be null for append");
                        }
                        return new Append(object0, v, z);
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001F\u0012\u0006\u0010\u0004\u001A\u00028\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0004\u001A\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Prepend;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "c", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Prepend extends LoadParams {
            public final Object c;

            public Prepend(@NotNull Object object0, int v, boolean z) {
                Intrinsics.checkNotNullParameter(object0, "key");
                super(v, z, null);
                this.c = object0;
            }

            @Override  // androidx.paging.PagingSource$LoadParams
            @NotNull
            public Object getKey() {
                return this.c;
            }
        }

        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\u0004\u001A\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001C\u0010\u0004\u001A\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/paging/PagingSource$LoadParams$Refresh;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "c", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Refresh extends LoadParams {
            public final Object c;

            public Refresh(@Nullable Object object0, int v, boolean z) {
                super(v, z, null);
                this.c = object0;
            }

            @Override  // androidx.paging.PagingSource$LoadParams
            @Nullable
            public Object getKey() {
                return this.c;
            }
        }

        @NotNull
        public static final Companion Companion;
        public final int a;
        public final boolean b;

        static {
            LoadParams.Companion = new Companion(null);
        }

        public LoadParams(int v, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
            this.b = z;
        }

        @Nullable
        public abstract Object getKey();

        public final int getLoadSize() {
            return this.a;
        }

        public final boolean getPlaceholdersEnabled() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/paging/PagingSource$LoadResult;", "", "Key", "Value", "Error", "Invalid", "Page", "Landroidx/paging/PagingSource$LoadResult$Error;", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "Landroidx/paging/PagingSource$LoadResult$Page;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadResult {
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\r¨\u0006\u001A"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Error;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Landroidx/paging/PagingSource$LoadResult$Error;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Error extends LoadResult {
            public final Throwable a;

            public Error(@NotNull Throwable throwable0) {
                Intrinsics.checkNotNullParameter(throwable0, "throwable");
                super(null);
                this.a = throwable0;
            }

            @NotNull
            public final Throwable component1() {
                return this.a;
            }

            @NotNull
            public final Error copy(@NotNull Throwable throwable0) {
                Intrinsics.checkNotNullParameter(throwable0, "throwable");
                return new Error(throwable0);
            }

            public static Error copy$default(Error pagingSource$LoadResult$Error0, Throwable throwable0, int v, Object object0) {
                if((v & 1) != 0) {
                    throwable0 = pagingSource$LoadResult$Error0.a;
                }
                return pagingSource$LoadResult$Error0.copy(throwable0);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Error ? Intrinsics.areEqual(this.a, ((Error)object0).a) : false;
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a.hashCode();
            }

            @Override
            @NotNull
            public String toString() {
                return k.trimMargin$default(("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) "), null, 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u0000*\b\b\u0004\u0010\u0001*\u00020\u0002*\b\b\u0005\u0010\u0003*\u00020\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Invalid;", "Key", "", "Value", "Landroidx/paging/PagingSource$LoadResult;", "()V", "toString", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Invalid extends LoadResult {
            public Invalid() {
                super(null);
            }

            @Override
            @NotNull
            public String toString() {
                return "LoadResult.Invalid";
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0086\b\u0018\u0000 2*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u00012B=\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001A\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u000B\u001A\u00020\n\u0012\b\b\u0003\u0010\f\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EB+\b\u0016\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00050\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00018\u0004\u0012\b\u0010\t\u001A\u0004\u0018\u00018\u0004\u00A2\u0006\u0004\b\r\u0010\u000FJ\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00050\u0010H\u0096\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00050\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001A\u0004\u0018\u00018\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001A\u001A\u0004\u0018\u00018\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001CJX\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00050\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00018\u00042\n\b\u0002\u0010\t\u001A\u0004\u0018\u00018\u00042\b\b\u0003\u0010\u000B\u001A\u00020\n2\b\b\u0003\u0010\f\u001A\u00020\nH\u00C6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u001CJ\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00050\u00068\u0006\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0017R\u0019\u0010\b\u001A\u0004\u0018\u00018\u00048\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0019R\u0019\u0010\t\u001A\u0004\u0018\u00018\u00048\u0006\u00A2\u0006\f\n\u0004\b+\u0010)\u001A\u0004\b,\u0010\u0019R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001CR\u0017\u0010\f\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b0\u0010.\u001A\u0004\b1\u0010\u001C\u00A8\u00063"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()I", "component5", "copy", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)Landroidx/paging/PagingSource$LoadResult$Page;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getData", "b", "Ljava/lang/Object;", "getPrevKey", "c", "getNextKey", "d", "I", "getItemsBefore", "e", "getItemsAfter", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Page extends LoadResult implements Iterable, KMappedMarker {
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0004\"\b\b\u0006\u0010\u0002*\u00020\u0001\"\b\b\u0007\u0010\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\f\u0010\r\u001A\u0004\b\u000B\u0010\u0006R\u0014\u0010\u000F\u001A\u00020\u000E8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/paging/PagingSource$LoadResult$Page$Companion;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult$Page;", "empty$paging_common_release", "()Landroidx/paging/PagingSource$LoadResult$Page;", "empty", "", "EMPTY", "Landroidx/paging/PagingSource$LoadResult$Page;", "getEMPTY$paging_common_release", "getEMPTY$paging_common_release$annotations", "()V", "", "COUNT_UNDEFINED", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
            public static final class androidx.paging.PagingSource.LoadResult.Page.Companion {
                public androidx.paging.PagingSource.LoadResult.Page.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
                }

                @NotNull
                public final Page empty$paging_common_release() {
                    Page pagingSource$LoadResult$Page0 = this.getEMPTY$paging_common_release();
                    Intrinsics.checkNotNull(pagingSource$LoadResult$Page0, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
                    return pagingSource$LoadResult$Page0;
                }

                @NotNull
                public final Page getEMPTY$paging_common_release() {
                    return Page.f;
                }

                public static void getEMPTY$paging_common_release$annotations() {
                }
            }

            public static final int COUNT_UNDEFINED = 0x80000000;
            @NotNull
            public static final androidx.paging.PagingSource.LoadResult.Page.Companion Companion;
            public final List a;
            public final Object b;
            public final Object c;
            public final int d;
            public final int e;
            public static final Page f;

            static {
                Page.Companion = new androidx.paging.PagingSource.LoadResult.Page.Companion(null);
                Page.f = new Page(CollectionsKt__CollectionsKt.emptyList(), null, null, 0, 0);
            }

            public Page(@NotNull List list0, @Nullable Object object0, @Nullable Object object1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                this(list0, object0, object1, 0x80000000, 0x80000000);
            }

            public Page(@NotNull List list0, @Nullable Object object0, @Nullable Object object1, @IntRange(from = 0xFFFFFFFF80000000L) int v, @IntRange(from = 0xFFFFFFFF80000000L) int v1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                super(null);
                this.a = list0;
                this.b = object0;
                this.c = object1;
                this.d = v;
                this.e = v1;
                if(v != 0x80000000 && v < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if(v1 != 0x80000000 && v1 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public Page(List list0, Object object0, Object object1, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
                this(list0, object0, object1, ((v2 & 8) == 0 ? v : 0x80000000), ((v2 & 16) == 0 ? v1 : 0x80000000));
            }

            @NotNull
            public final List component1() {
                return this.a;
            }

            @Nullable
            public final Object component2() {
                return this.b;
            }

            @Nullable
            public final Object component3() {
                return this.c;
            }

            public final int component4() {
                return this.d;
            }

            public final int component5() {
                return this.e;
            }

            @NotNull
            public final Page copy(@NotNull List list0, @Nullable Object object0, @Nullable Object object1, @IntRange(from = 0xFFFFFFFF80000000L) int v, @IntRange(from = 0xFFFFFFFF80000000L) int v1) {
                Intrinsics.checkNotNullParameter(list0, "data");
                return new Page(list0, object0, object1, v, v1);
            }

            public static Page copy$default(Page pagingSource$LoadResult$Page0, List list0, Object object0, Object object1, int v, int v1, int v2, Object object2) {
                if((v2 & 1) != 0) {
                    list0 = pagingSource$LoadResult$Page0.a;
                }
                if((v2 & 2) != 0) {
                    object0 = pagingSource$LoadResult$Page0.b;
                }
                if((v2 & 4) != 0) {
                    object1 = pagingSource$LoadResult$Page0.c;
                }
                if((v2 & 8) != 0) {
                    v = pagingSource$LoadResult$Page0.d;
                }
                if((v2 & 16) != 0) {
                    v1 = pagingSource$LoadResult$Page0.e;
                }
                return pagingSource$LoadResult$Page0.copy(list0, object0, object1, v, v1);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof Page)) {
                    return false;
                }
                if(!Intrinsics.areEqual(this.a, ((Page)object0).a)) {
                    return false;
                }
                if(!Intrinsics.areEqual(this.b, ((Page)object0).b)) {
                    return false;
                }
                if(!Intrinsics.areEqual(this.c, ((Page)object0).c)) {
                    return false;
                }
                return this.d == ((Page)object0).d ? this.e == ((Page)object0).e : false;
            }

            @NotNull
            public final List getData() {
                return this.a;
            }

            public final int getItemsAfter() {
                return this.e;
            }

            public final int getItemsBefore() {
                return this.d;
            }

            @Nullable
            public final Object getNextKey() {
                return this.c;
            }

            @Nullable
            public final Object getPrevKey() {
                return this.b;
            }

            @Override
            public int hashCode() {
                int v = this.a.hashCode();
                int v1 = 0;
                int v2 = this.b == null ? 0 : this.b.hashCode();
                Object object0 = this.c;
                if(object0 != null) {
                    v1 = object0.hashCode();
                }
                return this.e + a.c(this.d, ((v * 0x1F + v2) * 0x1F + v1) * 0x1F, 0x1F);
            }

            @Override
            @NotNull
            public Iterator iterator() {
                return this.a.listIterator();
            }

            @Override
            @NotNull
            public String toString() {
                StringBuilder stringBuilder0 = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                stringBuilder0.append(this.a.size());
                stringBuilder0.append("\n                    |   first Item: ");
                stringBuilder0.append(CollectionsKt___CollectionsKt.firstOrNull(this.a));
                stringBuilder0.append("\n                    |   last Item: ");
                stringBuilder0.append(CollectionsKt___CollectionsKt.lastOrNull(this.a));
                stringBuilder0.append("\n                    |   nextKey: ");
                stringBuilder0.append(this.c);
                stringBuilder0.append("\n                    |   prevKey: ");
                stringBuilder0.append(this.b);
                stringBuilder0.append("\n                    |   itemsBefore: ");
                stringBuilder0.append(this.d);
                stringBuilder0.append("\n                    |   itemsAfter: ");
                return k.trimMargin$default(wb.a.c(this.e, "\n                    |) ", stringBuilder0), null, 1, null);
            }
        }

        public LoadResult(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public final InvalidateCallbackTracker f;

    public PagingSource() {
        this.f = new InvalidateCallbackTracker(a1.z, null, 2, null);
    }

    public final boolean getInvalid() {
        return this.f.getInvalid$paging_common_release();
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.f.callbackCount$paging_common_release();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() [...] // Inlined contents

    @Nullable
    public abstract Object getRefreshKey(@NotNull PagingState arg1);

    public final void invalidate() {
        if(this.f.invalidate$paging_common_release()) {
            PagingLogger pagingLogger0 = PagingLogger.INSTANCE;
            if(pagingLogger0.isLoggable(3)) {
                pagingLogger0.log(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    @Nullable
    public abstract Object load(@NotNull LoadParams arg1, @NotNull Continuation arg2);

    public final void registerInvalidatedCallback(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onInvalidatedCallback");
        this.f.registerInvalidatedCallback$paging_common_release(function00);
    }

    public final void unregisterInvalidatedCallback(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onInvalidatedCallback");
        this.f.unregisterInvalidatedCallback$paging_common_release(function00);
    }
}


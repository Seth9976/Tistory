package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import a5.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
public abstract class BinaryVersion {
    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    static {
        BinaryVersion.Companion = new Companion(null);
    }

    public BinaryVersion(@NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "numbers");
        List list0;
        super();
        this.a = arr_v;
        Integer integer0 = ArraysKt___ArraysKt.getOrNull(arr_v, 0);
        int v = -1;
        this.b = integer0 == null ? -1 : ((int)integer0);
        Integer integer1 = ArraysKt___ArraysKt.getOrNull(arr_v, 1);
        this.c = integer1 == null ? -1 : ((int)integer1);
        Integer integer2 = ArraysKt___ArraysKt.getOrNull(arr_v, 2);
        if(integer2 != null) {
            v = (int)integer2;
        }
        this.d = v;
        if(arr_v.length > 3) {
            if(arr_v.length > 0x400) {
                throw new IllegalArgumentException(b.p(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), arr_v.length, '.'));
            }
            list0 = CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysJvmKt.asList(arr_v).subList(3, arr_v.length));
        }
        else {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this.e = list0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 != null && Intrinsics.areEqual(this.getClass(), object0.getClass()) && this.b == ((BinaryVersion)object0).b && this.c == ((BinaryVersion)object0).c && this.d == ((BinaryVersion)object0).d && Intrinsics.areEqual(this.e, ((BinaryVersion)object0).e);
    }

    public final int getMajor() {
        return this.b;
    }

    public final int getMinor() {
        return this.c;
    }

    // 去混淆评级： 低(40)
    @Override
    public int hashCode() {
        return this.e.hashCode() + 0x20 * this.d + 0x8000 * this.b + 0x400 * this.c;
    }

    public final boolean isAtLeast(int v, int v1, int v2) {
        int v3 = this.b;
        if(v3 > v) {
            return true;
        }
        if(v3 < v) {
            return false;
        }
        int v4 = this.c;
        if(v4 > v1) {
            return true;
        }
        return v4 >= v1 ? this.d >= v2 : false;
    }

    public final boolean isAtLeast(@NotNull BinaryVersion binaryVersion0) {
        Intrinsics.checkNotNullParameter(binaryVersion0, "version");
        return this.isAtLeast(binaryVersion0.b, binaryVersion0.c, binaryVersion0.d);
    }

    public final boolean isAtMost(int v, int v1, int v2) {
        int v3 = this.b;
        if(v3 < v) {
            return true;
        }
        if(v3 > v) {
            return false;
        }
        int v4 = this.c;
        if(v4 < v1) {
            return true;
        }
        return v4 <= v1 ? this.d <= v2 : false;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion binaryVersion0) {
        Intrinsics.checkNotNullParameter(binaryVersion0, "ourVersion");
        return this.b == 0 ? binaryVersion0.b == 0 && this.c == binaryVersion0.c : this.b == binaryVersion0.b && this.c <= binaryVersion0.c;
    }

    @NotNull
    public final int[] toArray() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        int[] arr_v = this.toArray();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == -1) {
                break;
            }
            arrayList0.add(v1);
        }
        return arrayList0.isEmpty() ? "unknown" : CollectionsKt___CollectionsKt.joinToString$default(arrayList0, ".", null, null, 0, null, null, 62, null);
    }
}


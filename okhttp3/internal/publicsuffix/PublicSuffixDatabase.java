package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\f\u001A\u00020\u000B2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "", "setListBytes", "([B[B)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PublicSuffixDatabase {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001A\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000F\u001A\u00020\u000E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "EXCEPTION_MARKER", "C", "", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // This method was un-flattened
        public static final String access$binarySearch(Companion publicSuffixDatabase$Companion0, byte[] arr_b, byte[][] arr2_b, int v) {
            int v6;
            publicSuffixDatabase$Companion0.getClass();
            int v1 = arr_b.length;
            int v2 = 0;
            while(v2 < v1) {
                int v3;
                for(v3 = (v2 + v1) / 2; v3 > -1 && arr_b[v3] != 10; --v3) {
                }
                int v4 = v3 + 1;
                for(int v5 = 1; true; ++v5) {
                    v6 = v4 + v5;
                    if(arr_b[v6] == 10) {
                        break;
                    }
                }
                int v7 = v6 - v4;
                int v8 = v;
                int v9 = 0;
                int v10 = 0;
            alab1:
                while(true) {
                    for(int v11 = Util.and(arr2_b[v8][v9], ((byte)0xFF)); true; v11 = 46) {
                        int v12 = v11 - Util.and(arr_b[v4 + v10], ((byte)0xFF));
                        if(v12 != 0) {
                            break alab1;
                        }
                        ++v10;
                        ++v9;
                        if(v10 == v7) {
                            break alab1;
                        }
                        if(arr2_b[v8].length != v9) {
                            break;
                        }
                        if(v8 == arr2_b.length - 1) {
                            break alab1;
                        }
                        ++v8;
                        v9 = -1;
                    }
                }
                if(v12 >= 0) {
                    if(v12 <= 0) {
                        int v13 = v7 - v10;
                        int v14 = arr2_b[v8].length - v9;
                        for(int v15 = v8 + 1; v15 < arr2_b.length; ++v15) {
                            v14 += arr2_b[v15].length;
                        }
                        if(v14 >= v13) {
                            if(v14 <= v13) {
                                Charset charset0 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(charset0, "UTF_8");
                                return new String(arr_b, v4, v7, charset0);
                            }
                            v2 = v6 + 1;
                            continue;
                        }
                    }
                    else {
                        v2 = v6 + 1;
                        continue;
                    }
                }
                v1 = v3;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.g;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    public final AtomicBoolean a;
    public final CountDownLatch b;
    public byte[] c;
    public byte[] d;
    public static final byte[] e;
    public static final List f;
    public static final PublicSuffixDatabase g;

    static {
        PublicSuffixDatabase.Companion = new Companion(null);
        PublicSuffixDatabase.e = new byte[]{42};
        PublicSuffixDatabase.f = k.listOf("*");
        PublicSuffixDatabase.g = new PublicSuffixDatabase();
    }

    public PublicSuffixDatabase() {
        this.a = new AtomicBoolean(false);
        this.b = new CountDownLatch(1);
    }

    public final void a() {
        int v1;
        try {
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            ObjectRef ref$ObjectRef1 = new ObjectRef();
            InputStream inputStream0 = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if(inputStream0 == null) {
                return;
            }
            BufferedSource bufferedSource0 = Okio.buffer(new GzipSource(Okio.source(inputStream0)));
            try {
                ref$ObjectRef0.element = bufferedSource0.readByteArray(((long)bufferedSource0.readInt()));
                ref$ObjectRef1.element = bufferedSource0.readByteArray(((long)bufferedSource0.readInt()));
            }
            catch(Throwable throwable0) {
                CloseableKt.closeFinally(bufferedSource0, throwable0);
                throw throwable0;
            }
            CloseableKt.closeFinally(bufferedSource0, null);
            synchronized(this) {
                v1 = FIN.finallyOpen$NT();
                Object object0 = ref$ObjectRef0.element;
                Intrinsics.checkNotNull(object0);
                this.c = (byte[])object0;
                Object object1 = ref$ObjectRef1.element;
                Intrinsics.checkNotNull(object1);
                this.d = (byte[])object1;
                FIN.finallyCodeBegin$NT(v1);
            }
        }
        finally {
            this.b.countDown();
        }
        FIN.finallyCodeEnd$NT(v1);
    }

    public static List b(String s) {
        List list0 = StringsKt__StringsKt.split$default(s, new char[]{'.'}, false, 0, 6, null);
        return Intrinsics.areEqual(CollectionsKt___CollectionsKt.last(list0), "") ? CollectionsKt___CollectionsKt.dropLast(list0, 1) : list0;
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String s) {
        List list2;
        List list1;
        String s3;
        Intrinsics.checkNotNullParameter(s, "domain");
        String s1 = IDN.toUnicode(s);
        Intrinsics.checkNotNullExpressionValue(s1, "unicodeDomain");
        List list0 = PublicSuffixDatabase.b(s1);
        if(this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
        }
        else {
            boolean z = false;
            try {
                while(true) {
                    try {
                        this.a();
                        goto label_20;
                    }
                    catch(InterruptedIOException unused_ex) {
                    }
                    catch(IOException iOException0) {
                        break;
                    }
                    Thread.interrupted();
                    z = true;
                }
                Platform.Companion.get().log("Failed to read public suffix list", 5, iOException0);
                if(z) {
                    goto label_14;
                }
                goto label_26;
            }
            catch(Throwable throwable0) {
                goto label_17;
            }
        label_14:
            Thread.currentThread().interrupt();
            goto label_26;
        label_17:
            if(z) {
                Thread.currentThread().interrupt();
            }
            throw throwable0;
        label_20:
            if(z) {
                Thread.currentThread().interrupt();
            }
        }
    label_26:
        if(this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int v = list0.size();
        byte[][] arr2_b = new byte[v][];
        for(int v1 = 0; v1 < v; ++v1) {
            String s2 = (String)list0.get(v1);
            Charset charset0 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset0, "UTF_8");
            byte[] arr_b = s2.getBytes(charset0);
            Intrinsics.checkNotNullExpressionValue(arr_b, "this as java.lang.String).getBytes(charset)");
            arr2_b[v1] = arr_b;
        }
        for(int v2 = 0; true; ++v2) {
            s3 = null;
            if(v2 >= v) {
                break;
            }
            Companion publicSuffixDatabase$Companion0 = PublicSuffixDatabase.Companion;
            byte[] arr_b1 = this.c;
            if(arr_b1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                arr_b1 = null;
            }
            String s4 = Companion.access$binarySearch(publicSuffixDatabase$Companion0, arr_b1, arr2_b, v2);
            if(s4 != null) {
                s3 = s4;
                break;
            }
        }
        String s5 = null;
        if(v > 1) {
            byte[][] arr2_b1 = (byte[][])arr2_b.clone();
            int v3 = arr2_b1.length - 1;
            for(int v4 = 0; v4 < v3; ++v4) {
                arr2_b1[v4] = PublicSuffixDatabase.e;
                Companion publicSuffixDatabase$Companion1 = PublicSuffixDatabase.Companion;
                byte[] arr_b2 = this.c;
                if(arr_b2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                    arr_b2 = null;
                }
                String s6 = Companion.access$binarySearch(publicSuffixDatabase$Companion1, arr_b2, arr2_b1, v4);
                if(s6 != null) {
                    s5 = s6;
                    break;
                }
            }
        }
        String s7 = null;
        if(s5 != null) {
            for(int v5 = 0; v5 < v - 1; ++v5) {
                Companion publicSuffixDatabase$Companion2 = PublicSuffixDatabase.Companion;
                byte[] arr_b3 = this.d;
                if(arr_b3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                    arr_b3 = null;
                }
                String s8 = Companion.access$binarySearch(publicSuffixDatabase$Companion2, arr_b3, arr2_b, v5);
                if(s8 != null) {
                    s7 = s8;
                    break;
                }
            }
        }
        if(s7 != null) {
            list1 = StringsKt__StringsKt.split$default(("!" + s7), new char[]{'.'}, false, 0, 6, null);
        }
        else if(s3 != null || s5 != null) {
            if(s3 == null) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                list2 = StringsKt__StringsKt.split$default(s3, new char[]{'.'}, false, 0, 6, null);
                if(list2 == null) {
                    list2 = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            if(s5 == null) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                list1 = StringsKt__StringsKt.split$default(s5, new char[]{'.'}, false, 0, 6, null);
                if(list1 == null) {
                    list1 = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            if(list2.size() > list1.size()) {
                list1 = list2;
            }
        }
        else {
            list1 = PublicSuffixDatabase.f;
        }
        if(list0.size() == list1.size() && ((String)list1.get(0)).charAt(0) != 33) {
            return null;
        }
        return ((String)list1.get(0)).charAt(0) == 33 ? SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence(PublicSuffixDatabase.b(s)), list0.size() - list1.size()), ".", null, null, 0, null, null, 62, null) : SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence(PublicSuffixDatabase.b(s)), list0.size() - (list1.size() + 1)), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(@NotNull byte[] arr_b, @NotNull byte[] arr_b1) {
        Intrinsics.checkNotNullParameter(arr_b, "publicSuffixListBytes");
        Intrinsics.checkNotNullParameter(arr_b1, "publicSuffixExceptionListBytes");
        this.c = arr_b;
        this.d = arr_b1;
        this.a.set(true);
        this.b.countDown();
    }
}


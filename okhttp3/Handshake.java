package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B;\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0017\u001A\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0011\u0010\u001A\u001A\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0016J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\u0003\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0007¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b\u0005\u0010\u0010R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b\b\u0010\u0012R!\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0017\u001A\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0016R\u0013\u0010\u001A\u001A\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0016¨\u0006."}, d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/TlsVersion;", "b", "Lokhttp3/CipherSuite;", "c", "Ljava/util/List;", "d", "Lkotlin/Lazy;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
public final class Handshake {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J;\u0010\u0004\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000E0\rH\u0007¢\u0006\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/Handshake;", "get", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/Handshake;", "handshake", "sslSession", "-deprecated_get", "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "peerCertificates", "localCertificates", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ljava/util/List;)Lokhttp3/Handshake;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    public static final class Companion {
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        @JvmName(name = "-deprecated_get")
        @NotNull
        public final Handshake -deprecated_get(@NotNull SSLSession sSLSession0) throws IOException {
            Intrinsics.checkNotNullParameter(sSLSession0, "sslSession");
            return this.get(sSLSession0);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmName(name = "get")
        @JvmStatic
        @NotNull
        public final Handshake get(@NotNull SSLSession sSLSession0) throws IOException {
            List list0;
            Intrinsics.checkNotNullParameter(sSLSession0, "<this>");
            String s = sSLSession0.getCipherSuite();
            if(s == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if((Intrinsics.areEqual(s, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(s, "SSL_NULL_WITH_NULL_NULL"))) {
                throw new IOException("cipherSuite == " + s);
            }
            CipherSuite cipherSuite0 = CipherSuite.Companion.forJavaName(s);
            String s1 = sSLSession0.getProtocol();
            if(s1 == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if(Intrinsics.areEqual("NONE", s1)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersion0 = TlsVersion.Companion.forJavaName(s1);
            try {
                Certificate[] arr_certificate = sSLSession0.getPeerCertificates();
                list0 = arr_certificate == null ? CollectionsKt__CollectionsKt.emptyList() : Util.immutableListOf(Arrays.copyOf(arr_certificate, arr_certificate.length));
            }
            catch(SSLPeerUnverifiedException unused_ex) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            Certificate[] arr_certificate1 = sSLSession0.getLocalCertificates();
            return arr_certificate1 == null ? new Handshake(tlsVersion0, cipherSuite0, CollectionsKt__CollectionsKt.emptyList(), new g(list0)) : new Handshake(tlsVersion0, cipherSuite0, Util.immutableListOf(Arrays.copyOf(arr_certificate1, arr_certificate1.length)), new g(list0));
        }

        @JvmStatic
        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion0, @NotNull CipherSuite cipherSuite0, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(tlsVersion0, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite0, "cipherSuite");
            Intrinsics.checkNotNullParameter(list0, "peerCertificates");
            Intrinsics.checkNotNullParameter(list1, "localCertificates");
            List list2 = Util.toImmutableList(list0);
            return new Handshake(tlsVersion0, cipherSuite0, Util.toImmutableList(list1), new f(list2));
        }
    }

    @NotNull
    public static final Companion Companion;
    public final TlsVersion a;
    public final CipherSuite b;
    public final List c;
    public final Lazy d;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuite", imports = {}))
    @JvmName(name = "-deprecated_cipherSuite")
    @NotNull
    public final CipherSuite -deprecated_cipherSuite() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "localCertificates", imports = {}))
    @JvmName(name = "-deprecated_localCertificates")
    @NotNull
    public final List -deprecated_localCertificates() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "localPrincipal", imports = {}))
    @JvmName(name = "-deprecated_localPrincipal")
    @Nullable
    public final Principal -deprecated_localPrincipal() {
        return this.localPrincipal();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "peerCertificates", imports = {}))
    @JvmName(name = "-deprecated_peerCertificates")
    @NotNull
    public final List -deprecated_peerCertificates() {
        return this.peerCertificates();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "peerPrincipal", imports = {}))
    @JvmName(name = "-deprecated_peerPrincipal")
    @Nullable
    public final Principal -deprecated_peerPrincipal() {
        return this.peerPrincipal();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersion", imports = {}))
    @JvmName(name = "-deprecated_tlsVersion")
    @NotNull
    public final TlsVersion -deprecated_tlsVersion() {
        return this.a;
    }

    static {
        Handshake.Companion = new Companion(null);
    }

    public Handshake(@NotNull TlsVersion tlsVersion0, @NotNull CipherSuite cipherSuite0, @NotNull List list0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(tlsVersion0, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite0, "cipherSuite");
        Intrinsics.checkNotNullParameter(list0, "localCertificates");
        Intrinsics.checkNotNullParameter(function00, "peerCertificatesFn");
        super();
        this.a = tlsVersion0;
        this.b = cipherSuite0;
        this.c = list0;
        this.d = c.lazy(new a4.c(function00, 9));
    }

    @JvmName(name = "cipherSuite")
    @NotNull
    public final CipherSuite cipherSuite() {
        return this.b;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Handshake && ((Handshake)object0).a == this.a && Intrinsics.areEqual(((Handshake)object0).b, this.b) && Intrinsics.areEqual(((Handshake)object0).peerCertificates(), this.peerCertificates()) && Intrinsics.areEqual(((Handshake)object0).c, this.c);
    }

    @JvmName(name = "get")
    @JvmStatic
    @NotNull
    public static final Handshake get(@NotNull SSLSession sSLSession0) throws IOException {
        return Handshake.Companion.get(sSLSession0);
    }

    @JvmStatic
    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion0, @NotNull CipherSuite cipherSuite0, @NotNull List list0, @NotNull List list1) {
        return Handshake.Companion.get(tlsVersion0, cipherSuite0, list0, list1);
    }

    @Override
    public int hashCode() {
        int v = this.peerCertificates().hashCode();
        return this.c.hashCode() + (v + (this.b.hashCode() + (this.a.hashCode() + 0x20F) * 0x1F) * 0x1F) * 0x1F;
    }

    @JvmName(name = "localCertificates")
    @NotNull
    public final List localCertificates() {
        return this.c;
    }

    @JvmName(name = "localPrincipal")
    @Nullable
    public final Principal localPrincipal() {
        Object object0 = CollectionsKt___CollectionsKt.firstOrNull(this.c);
        X509Certificate x509Certificate0 = object0 instanceof X509Certificate ? ((X509Certificate)object0) : null;
        return x509Certificate0 != null ? x509Certificate0.getSubjectX500Principal() : null;
    }

    @JvmName(name = "peerCertificates")
    @NotNull
    public final List peerCertificates() {
        return (List)this.d.getValue();
    }

    @JvmName(name = "peerPrincipal")
    @Nullable
    public final Principal peerPrincipal() {
        Object object0 = CollectionsKt___CollectionsKt.firstOrNull(this.peerCertificates());
        X509Certificate x509Certificate0 = object0 instanceof X509Certificate ? ((X509Certificate)object0) : null;
        return x509Certificate0 != null ? x509Certificate0.getSubjectX500Principal() : null;
    }

    @JvmName(name = "tlsVersion")
    @NotNull
    public final TlsVersion tlsVersion() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        String s1;
        String s;
        Iterable iterable0 = this.peerCertificates();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            Certificate certificate0 = (Certificate)object0;
            if(certificate0 instanceof X509Certificate) {
                s = ((X509Certificate)certificate0).getSubjectDN().toString();
            }
            else {
                s = certificate0.getType();
                Intrinsics.checkNotNullExpressionValue(s, "type");
            }
            arrayList0.add(s);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Handshake{tlsVersion=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(" cipherSuite=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(" peerCertificates=");
        stringBuilder0.append(arrayList0.toString());
        stringBuilder0.append(" localCertificates=");
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(this.c, 10));
        for(Object object1: this.c) {
            Certificate certificate1 = (Certificate)object1;
            if(certificate1 instanceof X509Certificate) {
                s1 = ((X509Certificate)certificate1).getSubjectDN().toString();
            }
            else {
                s1 = certificate1.getType();
                Intrinsics.checkNotNullExpressionValue(s1, "type");
            }
            arrayList1.add(s1);
        }
        stringBuilder0.append(arrayList1);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}


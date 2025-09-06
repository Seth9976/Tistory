package okhttp3;

import androidx.compose.material3.td;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlin.text.q;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000E\u0018\u0000 ,2\u00020\u0001:\u0003-,.B#\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\t2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000F\u0010\u0010J+\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\t2\u0012\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000B0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\n\u001A\u00020\t2\u0012\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0007¢\u0006\u0004\b\u000F\u0010\u0017J\u001B\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00030\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010\"\u001A\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "Lokhttp3/CertificatePinner$Pin;", "pins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "check", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "(Ljava/lang/String;)Ljava/util/List;", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "b", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "Builder", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
public final class CertificatePinner {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0007\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000B\u0010\fR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "", "pattern", "", "pins", "add", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "Lokhttp3/CertificatePinner;", "build", "()Lokhttp3/CertificatePinner;", "", "Lokhttp3/CertificatePinner$Pin;", "a", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public final ArrayList a;

        public Builder() {
            this.a = new ArrayList();
        }

        @NotNull
        public final Builder add(@NotNull String s, @NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(s, "pattern");
            Intrinsics.checkNotNullParameter(arr_s, "pins");
            for(int v = 0; v < arr_s.length; ++v) {
                Pin certificatePinner$Pin0 = new Pin(s, arr_s[v]);
                this.a.add(certificatePinner$Pin0);
            }
            return this;
        }

        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt___CollectionsKt.toSet(this.a), null, 2, null);
        }

        @NotNull
        public final List getPins() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000BR\u0014\u0010\r\u001A\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "Ljava/security/cert/X509Certificate;", "Lokio/ByteString;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Lokio/ByteString;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final String pin(@NotNull Certificate certificate0) {
            Intrinsics.checkNotNullParameter(certificate0, "certificate");
            if(!(certificate0 instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + this.sha256Hash(((X509Certificate)certificate0)).base64();
        }

        @JvmStatic
        @NotNull
        public final ByteString sha1Hash(@NotNull X509Certificate x509Certificate0) {
            Intrinsics.checkNotNullParameter(x509Certificate0, "<this>");
            byte[] arr_b = x509Certificate0.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(arr_b, "publicKey.encoded");
            return okio.ByteString.Companion.of$default(ByteString.Companion, arr_b, 0, 0, 3, null).sha1();
        }

        @JvmStatic
        @NotNull
        public final ByteString sha256Hash(@NotNull X509Certificate x509Certificate0) {
            Intrinsics.checkNotNullParameter(x509Certificate0, "<this>");
            byte[] arr_b = x509Certificate0.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(arr_b, "publicKey.encoded");
            return okio.ByteString.Companion.of$default(ByteString.Companion, arr_b, 0, 0, 3, null).sha256();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0012\u001A\u00020\b2\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\u0010R\u0017\u0010\"\u001A\u00020\u001D8\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006#"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getPattern", "b", "getHashAlgorithm", "hashAlgorithm", "Lokio/ByteString;", "c", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hash", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Pin {
        public final String a;
        public final String b;
        public final ByteString c;

        public Pin(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "pattern");
            Intrinsics.checkNotNullParameter(s1, "pin");
            super();
            if((!p.startsWith$default(s, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default(s, "*", 1, false, 4, null) != -1) && (!p.startsWith$default(s, "**.", false, 2, null) || StringsKt__StringsKt.indexOf$default(s, "*", 2, false, 4, null) != -1) && StringsKt__StringsKt.indexOf$default(s, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + s).toString());
            }
            String s2 = HostnamesKt.toCanonicalHost(s);
            if(s2 == null) {
                throw new IllegalArgumentException("Invalid pattern: " + s);
            }
            this.a = s2;
            if(p.startsWith$default(s1, "sha1/", false, 2, null)) {
                this.b = "sha1";
                String s3 = s1.substring(5);
                Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).substring(startIndex)");
                ByteString byteString0 = ByteString.Companion.decodeBase64(s3);
                if(byteString0 == null) {
                    throw new IllegalArgumentException("Invalid pin hash: " + s1);
                }
                this.c = byteString0;
                return;
            }
            if(!p.startsWith$default(s1, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with \'sha256/\' or \'sha1/\': " + s1);
            }
            this.b = "sha256";
            String s4 = s1.substring(7);
            Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String).substring(startIndex)");
            ByteString byteString1 = ByteString.Companion.decodeBase64(s4);
            if(byteString1 == null) {
                throw new IllegalArgumentException("Invalid pin hash: " + s1);
            }
            this.c = byteString1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Pin)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Pin)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Pin)object0).b) ? Intrinsics.areEqual(this.c, ((Pin)object0).c) : false;
        }

        @NotNull
        public final ByteString getHash() {
            return this.c;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.b;
        }

        @NotNull
        public final String getPattern() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + q.c(this.a.hashCode() * 0x1F, 0x1F, this.b);
        }

        public final boolean matchesCertificate(@NotNull X509Certificate x509Certificate0) {
            Intrinsics.checkNotNullParameter(x509Certificate0, "certificate");
            String s = this.b;
            boolean z = Intrinsics.areEqual(s, "sha256");
            ByteString byteString0 = this.c;
            if(z) {
                return Intrinsics.areEqual(byteString0, CertificatePinner.Companion.sha256Hash(x509Certificate0));
            }
            return Intrinsics.areEqual(s, "sha1") ? Intrinsics.areEqual(byteString0, CertificatePinner.Companion.sha1Hash(x509Certificate0)) : false;
        }

        public final boolean matchesHostname(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "hostname");
            String s1 = this.a;
            if(p.startsWith$default(s1, "**.", false, 2, null)) {
                int v = s1.length();
                int v1 = s.length() - (v - 3);
                return p.regionMatches$default(s, s.length() - (v - 3), this.a, 3, v - 3, false, 16, null) && (v1 == 0 || s.charAt(v1 - 1) == 46);
            }
            if(p.startsWith$default(s1, "*.", false, 2, null)) {
                int v2 = s1.length();
                return p.regionMatches$default(s, s.length() - (v2 - 1), this.a, 1, v2 - 1, false, 16, null) && StringsKt__StringsKt.lastIndexOf$default(s, '.', s.length() - (v2 - 1) - 1, false, 4, null) == -1;
            }
            return Intrinsics.areEqual(s, s1);
        }

        @Override
        @NotNull
        public String toString() {
            return this.b + '/' + this.c.base64();
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final CertificatePinner DEFAULT;
    public final Set a;
    public final CertificateChainCleaner b;

    static {
        CertificatePinner.Companion = new Companion(null);
        CertificatePinner.DEFAULT = new Builder().build();
    }

    public CertificatePinner(@NotNull Set set0, @Nullable CertificateChainCleaner certificateChainCleaner0) {
        Intrinsics.checkNotNullParameter(set0, "pins");
        super();
        this.a = set0;
        this.b = certificateChainCleaner0;
    }

    public CertificatePinner(Set set0, CertificateChainCleaner certificateChainCleaner0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            certificateChainCleaner0 = null;
        }
        this(set0, certificateChainCleaner0);
    }

    public final void check(@NotNull String s, @NotNull List list0) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(s, "hostname");
        Intrinsics.checkNotNullParameter(list0, "peerCertificates");
        this.check$okhttp(s, new td(this, list0, 9, s));
    }

    @Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@NotNull String s, @NotNull Certificate[] arr_certificate) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(s, "hostname");
        Intrinsics.checkNotNullParameter(arr_certificate, "peerCertificates");
        this.check(s, ArraysKt___ArraysKt.toList(arr_certificate));
    }

    public final void check$okhttp(@NotNull String s, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "hostname");
        Intrinsics.checkNotNullParameter(function00, "cleanedPeerCertificatesFn");
        List list0 = this.findMatchingPins(s);
        if(list0.isEmpty()) {
            return;
        }
        List list1 = (List)function00.invoke();
        for(Object object0: list1) {
            X509Certificate x509Certificate0 = (X509Certificate)object0;
            ByteString byteString0 = null;
            ByteString byteString1 = null;
            for(Object object1: list0) {
                Pin certificatePinner$Pin0 = (Pin)object1;
                String s1 = certificatePinner$Pin0.getHashAlgorithm();
                if(Intrinsics.areEqual(s1, "sha256")) {
                    if(byteString0 == null) {
                        byteString0 = CertificatePinner.Companion.sha256Hash(x509Certificate0);
                    }
                    if(!Intrinsics.areEqual(certificatePinner$Pin0.getHash(), byteString0)) {
                        continue;
                    }
                    return;
                }
                if(!Intrinsics.areEqual(s1, "sha1")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + certificatePinner$Pin0.getHashAlgorithm());
                }
                if(byteString1 == null) {
                    byteString1 = CertificatePinner.Companion.sha1Hash(x509Certificate0);
                }
                if(!Intrinsics.areEqual(certificatePinner$Pin0.getHash(), byteString1)) {
                    continue;
                }
                return;
            }
            if(false) {
                break;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for(Object object2: list1) {
            stringBuilder0.append("\n    ");
            stringBuilder0.append(CertificatePinner.Companion.pin(((X509Certificate)object2)));
            stringBuilder0.append(": ");
            stringBuilder0.append(((X509Certificate)object2).getSubjectDN().getName());
        }
        stringBuilder0.append("\n  Pinned certificates for ");
        stringBuilder0.append(s);
        stringBuilder0.append(":");
        for(Object object3: list0) {
            stringBuilder0.append("\n    ");
            stringBuilder0.append(((Pin)object3));
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(s2);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof CertificatePinner && Intrinsics.areEqual(((CertificatePinner)object0).a, this.a) && Intrinsics.areEqual(((CertificatePinner)object0).b, this.b);
    }

    @NotNull
    public final List findMatchingPins(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "hostname");
        List list0 = CollectionsKt__CollectionsKt.emptyList();
        for(Object object0: this.a) {
            if(((Pin)object0).matchesHostname(s)) {
                if(list0.isEmpty()) {
                    list0 = new ArrayList();
                }
                Intrinsics.checkNotNull(list0, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                TypeIntrinsics.asMutableList(list0).add(object0);
            }
        }
        return list0;
    }

    @Nullable
    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.b;
    }

    @NotNull
    public final Set getPins() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v + 0x5ED) * 41 : (v + 0x5ED) * 41 + this.b.hashCode();
    }

    @JvmStatic
    @NotNull
    public static final String pin(@NotNull Certificate certificate0) {
        return CertificatePinner.Companion.pin(certificate0);
    }

    @JvmStatic
    @NotNull
    public static final ByteString sha1Hash(@NotNull X509Certificate x509Certificate0) {
        return CertificatePinner.Companion.sha1Hash(x509Certificate0);
    }

    @JvmStatic
    @NotNull
    public static final ByteString sha256Hash(@NotNull X509Certificate x509Certificate0) {
        return CertificatePinner.Companion.sha256Hash(x509Certificate0);
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner0) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner0, "certificateChainCleaner");
        return Intrinsics.areEqual(this.b, certificateChainCleaner0) ? this : new CertificatePinner(this.a, certificateChainCleaner0);
    }
}


package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;
import r0.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0002+*B9\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000BH\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000BH\u0007¢\u0006\u0004\b\u0011\u0010\u000EJ\u000F\u0010\u0004\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001D\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u0015¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010 \u001A\u00020\u00022\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000F\u0010#\u001A\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b)\u0010(\u001A\u0004\b\u0004\u0010\u0014R\u0019\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000B8G¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u000ER\u0019\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000B8G¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u000E¨\u0006,"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuites", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersions", "tlsVersions", "-deprecated_supportsTlsExtensions", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "", "apply$okhttp", "(Ljavax/net/ssl/SSLSocket;Z)V", "apply", "socket", "isCompatible", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "b", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
public final class ConnectionSpec {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001A\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001A\u00020\u00002\u0012\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000B\"\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ!\u0010\r\u001A\u00020\u00002\u0012\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000F0\u000B\"\u00020\u000F¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0011\u001A\u00020\u0000¢\u0006\u0004\b\u0011\u0010\nJ!\u0010\u0013\u001A\u00020\u00002\u0012\u0010\u0013\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u000B\"\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001A\u00020\u00002\u0012\u0010\u0013\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000F0\u000B\"\u00020\u000F¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u0005R*\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0013\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b$\u0010\u001F\u001A\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\u0015\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\'\u0010\u001A\u001A\u0004\b(\u0010\u001C\"\u0004\b)\u0010\u0005¨\u0006*"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "", "tls", "<init>", "(Z)V", "Lokhttp3/ConnectionSpec;", "connectionSpec", "(Lokhttp3/ConnectionSpec;)V", "allEnabledCipherSuites", "()Lokhttp3/ConnectionSpec$Builder;", "", "Lokhttp3/CipherSuite;", "cipherSuites", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "allEnabledTlsVersions", "Lokhttp3/TlsVersion;", "tlsVersions", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "supportsTlsExtensions", "(Z)Lokhttp3/ConnectionSpec$Builder;", "build", "()Lokhttp3/ConnectionSpec;", "a", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "b", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "c", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "d", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class Builder {
        public boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(@NotNull ConnectionSpec connectionSpec0) {
            Intrinsics.checkNotNullParameter(connectionSpec0, "connectionSpec");
            super();
            this.a = connectionSpec0.isTls();
            this.b = connectionSpec0.c;
            this.c = connectionSpec0.d;
            this.d = connectionSpec0.supportsTlsExtensions();
        }

        public Builder(boolean z) {
            this.a = z;
        }

        @NotNull
        public final Builder allEnabledCipherSuites() {
            if(!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.b = null;
            return this;
        }

        @NotNull
        public final Builder allEnabledTlsVersions() {
            if(!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.c = null;
            return this;
        }

        @NotNull
        public final ConnectionSpec build() {
            return new ConnectionSpec(this.a, this.d, this.b, this.c);
        }

        @NotNull
        public final Builder cipherSuites(@NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(arr_s, "cipherSuites");
            if(!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if(arr_s.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[])arr_s.clone();
            return this;
        }

        @NotNull
        public final Builder cipherSuites(@NotNull CipherSuite[] arr_cipherSuite) {
            Intrinsics.checkNotNullParameter(arr_cipherSuite, "cipherSuites");
            if(!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList0 = new ArrayList(arr_cipherSuite.length);
            for(int v = 0; v < arr_cipherSuite.length; ++v) {
                arrayList0.add(arr_cipherSuite[v].javaName());
            }
            String[] arr_s = (String[])arrayList0.toArray(new String[0]);
            return this.cipherSuites(((String[])Arrays.copyOf(arr_s, arr_s.length)));
        }

        @Nullable
        public final String[] getCipherSuites$okhttp() {
            return this.b;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.d;
        }

        public final boolean getTls$okhttp() {
            return this.a;
        }

        @Nullable
        public final String[] getTlsVersions$okhttp() {
            return this.c;
        }

        public final void setCipherSuites$okhttp(@Nullable String[] arr_s) {
            this.b = arr_s;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z) {
            this.d = z;
        }

        public final void setTls$okhttp(boolean z) {
            this.a = z;
        }

        public final void setTlsVersions$okhttp(@Nullable String[] arr_s) {
            this.c = arr_s;
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final Builder supportsTlsExtensions(boolean z) {
            if(!this.a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.d = z;
            return this;
        }

        @NotNull
        public final Builder tlsVersions(@NotNull String[] arr_s) {
            Intrinsics.checkNotNullParameter(arr_s, "tlsVersions");
            if(!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if(arr_s.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[])arr_s.clone();
            return this;
        }

        @NotNull
        public final Builder tlsVersions(@NotNull TlsVersion[] arr_tlsVersion) {
            Intrinsics.checkNotNullParameter(arr_tlsVersion, "tlsVersions");
            if(!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList0 = new ArrayList(arr_tlsVersion.length);
            for(int v = 0; v < arr_tlsVersion.length; ++v) {
                arrayList0.add(arr_tlsVersion[v].javaName());
            }
            String[] arr_s = (String[])arrayList0.toArray(new String[0]);
            return this.tlsVersions(((String[])Arrays.copyOf(arr_s, arr_s.length)));
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001A\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000B\u0010\u0005R\u0014\u0010\f\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "", "Lokhttp3/CipherSuite;", "APPROVED_CIPHER_SUITES", "[Lokhttp3/CipherSuite;", "Lokhttp3/ConnectionSpec;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @JvmField
    @NotNull
    public static final ConnectionSpec CLEARTEXT;
    @JvmField
    @NotNull
    public static final ConnectionSpec COMPATIBLE_TLS;
    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final ConnectionSpec MODERN_TLS;
    @JvmField
    @NotNull
    public static final ConnectionSpec RESTRICTED_TLS;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuites", imports = {}))
    @JvmName(name = "-deprecated_cipherSuites")
    @Nullable
    public final List -deprecated_cipherSuites() {
        return this.cipherSuites();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    @JvmName(name = "-deprecated_supportsTlsExtensions")
    public final boolean -deprecated_supportsTlsExtensions() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersions", imports = {}))
    @JvmName(name = "-deprecated_tlsVersions")
    @Nullable
    public final List -deprecated_tlsVersions() {
        return this.tlsVersions();
    }

    static {
        ConnectionSpec.Companion = new Companion(null);
        CipherSuite[] arr_cipherSuite = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        ConnectionSpec.RESTRICTED_TLS = new Builder(true).cipherSuites(((CipherSuite[])Arrays.copyOf(new CipherSuite[]{CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256}, 9))).tlsVersions(new TlsVersion[]{TlsVersion.TLS_1_3, TlsVersion.TLS_1_2}).supportsTlsExtensions(true).build();
        ConnectionSpec.MODERN_TLS = new Builder(true).cipherSuites(((CipherSuite[])Arrays.copyOf(arr_cipherSuite, 16))).tlsVersions(new TlsVersion[]{TlsVersion.TLS_1_3, TlsVersion.TLS_1_2}).supportsTlsExtensions(true).build();
        ConnectionSpec.COMPATIBLE_TLS = new Builder(true).cipherSuites(((CipherSuite[])Arrays.copyOf(arr_cipherSuite, 16))).tlsVersions(new TlsVersion[]{TlsVersion.TLS_1_3, TlsVersion.TLS_1_2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0}).supportsTlsExtensions(true).build();
        ConnectionSpec.CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z, boolean z1, @Nullable String[] arr_s, @Nullable String[] arr_s1) {
        this.a = z;
        this.b = z1;
        this.c = arr_s;
        this.d = arr_s1;
    }

    public final void apply$okhttp(@NotNull SSLSocket sSLSocket0, boolean z) {
        String[] arr_s5;
        String[] arr_s2;
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        String[] arr_s = this.c;
        if(arr_s == null) {
            arr_s2 = sSLSocket0.getEnabledCipherSuites();
        }
        else {
            String[] arr_s1 = sSLSocket0.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(arr_s1, "sslSocket.enabledCipherSuites");
            arr_s2 = Util.intersect(arr_s1, arr_s, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        }
        String[] arr_s3 = this.d;
        if(arr_s3 == null) {
            arr_s5 = sSLSocket0.getEnabledProtocols();
        }
        else {
            String[] arr_s4 = sSLSocket0.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(arr_s4, "sslSocket.enabledProtocols");
            arr_s5 = Util.intersect(arr_s4, arr_s3, c.naturalOrder());
        }
        String[] arr_s6 = sSLSocket0.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(arr_s6, "supportedCipherSuites");
        int v = Util.indexOf(arr_s6, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if(z && v != -1) {
            Intrinsics.checkNotNullExpressionValue(arr_s2, "cipherSuitesIntersection");
            String s = arr_s6[v];
            Intrinsics.checkNotNullExpressionValue(s, "supportedCipherSuites[indexOfFallbackScsv]");
            arr_s2 = Util.concat(arr_s2, s);
        }
        Builder connectionSpec$Builder0 = new Builder(this);
        Intrinsics.checkNotNullExpressionValue(arr_s2, "cipherSuitesIntersection");
        Builder connectionSpec$Builder1 = connectionSpec$Builder0.cipherSuites(((String[])Arrays.copyOf(arr_s2, arr_s2.length)));
        Intrinsics.checkNotNullExpressionValue(arr_s5, "tlsVersionsIntersection");
        ConnectionSpec connectionSpec0 = connectionSpec$Builder1.tlsVersions(((String[])Arrays.copyOf(arr_s5, arr_s5.length))).build();
        if(connectionSpec0.tlsVersions() != null) {
            sSLSocket0.setEnabledProtocols(connectionSpec0.d);
        }
        if(connectionSpec0.cipherSuites() != null) {
            sSLSocket0.setEnabledCipherSuites(connectionSpec0.c);
        }
    }

    @JvmName(name = "cipherSuites")
    @Nullable
    public final List cipherSuites() {
        String[] arr_s = this.c;
        if(arr_s != null) {
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(CipherSuite.Companion.forJavaName(arr_s[v]));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList0);
        }
        return null;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(!(object0 instanceof ConnectionSpec)) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        boolean z = this.a;
        if(z != ((ConnectionSpec)object0).a) {
            return false;
        }
        if(z) {
            if(!Arrays.equals(this.c, ((ConnectionSpec)object0).c)) {
                return false;
            }
            return Arrays.equals(this.d, ((ConnectionSpec)object0).d) ? this.b == ((ConnectionSpec)object0).b : false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if(this.a) {
            int v = 0;
            int v1 = this.c == null ? 0 : Arrays.hashCode(this.c);
            String[] arr_s = this.d;
            if(arr_s != null) {
                v = Arrays.hashCode(arr_s);
            }
            return ((v1 + 0x20F) * 0x1F + v) * 0x1F + !this.b;
        }
        return 17;
    }

    public final boolean isCompatible(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "socket");
        if(!this.a) {
            return false;
        }
        return this.d == null || Util.hasIntersection(this.d, sSLSocket0.getEnabledProtocols(), c.naturalOrder()) ? this.c == null || Util.hasIntersection(this.c, sSLSocket0.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp()) : false;
    }

    @JvmName(name = "isTls")
    public final boolean isTls() {
        return this.a;
    }

    @JvmName(name = "supportsTlsExtensions")
    public final boolean supportsTlsExtensions() {
        return this.b;
    }

    @JvmName(name = "tlsVersions")
    @Nullable
    public final List tlsVersions() {
        String[] arr_s = this.d;
        if(arr_s != null) {
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(TlsVersion.Companion.forJavaName(arr_s[v]));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList0);
        }
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        if(!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder stringBuilder0 = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder0.append(Objects.toString(this.cipherSuites(), "[all enabled]"));
        stringBuilder0.append(", tlsVersions=");
        stringBuilder0.append(Objects.toString(this.tlsVersions(), "[all enabled]"));
        stringBuilder0.append(", supportsTlsExtensions=");
        return a.p(stringBuilder0, this.b, ')');
    }
}


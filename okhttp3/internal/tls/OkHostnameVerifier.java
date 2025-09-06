package okhttp3.internal.tls;

import androidx.room.a;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\u000BJ\u001B\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "", "host", "Ljavax/net/ssl/SSLSession;", "session", "", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class OkHostnameVerifier implements HostnameVerifier {
    @NotNull
    public static final OkHostnameVerifier INSTANCE;

    static {
        OkHostnameVerifier.INSTANCE = new OkHostnameVerifier();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static List a(X509Certificate x509Certificate0, int v) {
        try {
            Collection collection0 = x509Certificate0.getSubjectAlternativeNames();
            if(collection0 == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List list0 = new ArrayList();
            for(Object object0: collection0) {
                List list1 = (List)object0;
                if(list1 != null && list1.size() >= 2 && Intrinsics.areEqual(list1.get(0), v)) {
                    Object object1 = list1.get(1);
                    if(object1 != null) {
                        ((ArrayList)list0).add(((String)object1));
                    }
                }
            }
            return list0;
        }
        catch(CertificateParsingException unused_ex) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final List allSubjectAltNames(@NotNull X509Certificate x509Certificate0) {
        Intrinsics.checkNotNullParameter(x509Certificate0, "certificate");
        return CollectionsKt___CollectionsKt.plus(OkHostnameVerifier.a(x509Certificate0, 7), OkHostnameVerifier.a(x509Certificate0, 2));
    }

    public final boolean verify(@NotNull String s, @NotNull X509Certificate x509Certificate0) {
        boolean z;
        String s1 = s;
        Intrinsics.checkNotNullParameter(s1, "host");
        Intrinsics.checkNotNullParameter(x509Certificate0, "certificate");
        if(Util.canParseAsIpAddress(s)) {
            String s2 = HostnamesKt.toCanonicalHost(s);
            Iterable iterable0 = OkHostnameVerifier.a(x509Certificate0, 7);
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(!Intrinsics.areEqual(s2, HostnamesKt.toCanonicalHost(((String)object0)))) {
                        continue;
                    }
                    return true;
                }
            }
        }
        else {
            if(s.length() == ((int)Utf8.size$default(s1, 0, 0, 3, null))) {
                s1 = a.k(Locale.US, "US", s1, Locale.US, "this as java.lang.String).toLowerCase(locale)");
            }
            Iterable iterable1 = OkHostnameVerifier.a(x509Certificate0, 2);
            if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                for(Object object1: iterable1) {
                    String s3 = (String)object1;
                    OkHostnameVerifier.INSTANCE.getClass();
                    if(s1 == null || s1.length() == 0 || p.startsWith$default(s1, ".", false, 2, null) || p.endsWith$default(s1, "..", false, 2, null) || s3 == null || s3.length() == 0 || p.startsWith$default(s3, ".", false, 2, null) || p.endsWith$default(s3, "..", false, 2, null)) {
                        z = false;
                    }
                    else {
                        String s4 = p.endsWith$default(s1, ".", false, 2, null) ? s1 : s1 + ".";
                        if(!p.endsWith$default(s3, ".", false, 2, null)) {
                            s3 = s3 + ".";
                        }
                        if(s3.length() == ((int)Utf8.size$default(s3, 0, 0, 3, null))) {
                            s3 = a.k(Locale.US, "US", s3, Locale.US, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if(!StringsKt__StringsKt.contains$default(s3, "*", false, 2, null)) {
                            z = Intrinsics.areEqual(s4, s3);
                        }
                        else if(p.startsWith$default(s3, "*.", false, 2, null) && StringsKt__StringsKt.indexOf$default(s3, '*', 1, false, 4, null) == -1 && s4.length() >= s3.length() && !Intrinsics.areEqual("*.", s3)) {
                            String s5 = s3.substring(1);
                            Intrinsics.checkNotNullExpressionValue(s5, "this as java.lang.String).substring(startIndex)");
                            if(p.endsWith$default(s4, s5, false, 2, null)) {
                                int v = s4.length() - s5.length();
                                if(v <= 0 || StringsKt__StringsKt.lastIndexOf$default(s4, '.', v - 1, false, 4, null) == -1) {
                                    z = true;
                                }
                            }
                        }
                    }
                    if(z) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override  // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String s, @NotNull SSLSession sSLSession0) {
        Intrinsics.checkNotNullParameter(s, "host");
        Intrinsics.checkNotNullParameter(sSLSession0, "session");
        if(s.length() == ((int)Utf8.size$default(s, 0, 0, 3, null))) {
            try {
                Certificate certificate0 = sSLSession0.getPeerCertificates()[0];
                Intrinsics.checkNotNull(certificate0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return this.verify(s, ((X509Certificate)certificate0));
            }
            catch(SSLException unused_ex) {
            }
        }
        return false;
    }
}


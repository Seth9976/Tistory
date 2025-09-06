package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustRootIndex", "<init>", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "clean", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner$Companion;", "", "", "MAX_SIGNERS", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final TrustRootIndex a;

    static {
        BasicCertificateChainCleaner.Companion = new Companion(null);
    }

    public BasicCertificateChainCleaner(@NotNull TrustRootIndex trustRootIndex0) {
        Intrinsics.checkNotNullParameter(trustRootIndex0, "trustRootIndex");
        super();
        this.a = trustRootIndex0;
    }

    @Override  // okhttp3.internal.tls.CertificateChainCleaner
    @NotNull
    public List clean(@NotNull List list0, @NotNull String s) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(list0, "chain");
        Intrinsics.checkNotNullParameter(s, "hostname");
        ArrayDeque arrayDeque0 = new ArrayDeque(list0);
        List list1 = new ArrayList();
        Object object0 = arrayDeque0.removeFirst();
        Intrinsics.checkNotNullExpressionValue(object0, "queue.removeFirst()");
        ((ArrayList)list1).add(object0);
        boolean z = false;
        int v = 0;
        while(v < 9) {
            Object object1 = ((ArrayList)list1).get(((ArrayList)list1).size() - 1);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate0 = (X509Certificate)object1;
            X509Certificate x509Certificate1 = this.a.findByIssuerAndSignature(x509Certificate0);
            if(x509Certificate1 == null) {
                Iterator iterator0 = arrayDeque0.iterator();
                Intrinsics.checkNotNullExpressionValue(iterator0, "queue.iterator()");
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_34;
                    }
                    Object object2 = iterator0.next();
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate)object2;
                    if(Intrinsics.areEqual(x509Certificate0.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate0.verify(x509Certificate2.getPublicKey());
                        }
                        catch(GeneralSecurityException unused_ex) {
                            continue;
                        }
                        iterator0.remove();
                        ((ArrayList)list1).add(x509Certificate2);
                        break;
                    }
                }
            }
            else {
                if(((ArrayList)list1).size() > 1 || !Intrinsics.areEqual(x509Certificate0, x509Certificate1)) {
                    ((ArrayList)list1).add(x509Certificate1);
                }
                z = true;
                if(Intrinsics.areEqual(x509Certificate1.getIssuerDN(), x509Certificate1.getSubjectDN())) {
                    try {
                        x509Certificate1.verify(x509Certificate1.getPublicKey());
                        return list1;
                    }
                    catch(GeneralSecurityException unused_ex) {
                    }
                }
            }
            ++v;
            continue;
        label_34:
            if(!z) {
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate0);
            }
            return list1;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + list1);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 == this || object0 instanceof BasicCertificateChainCleaner && Intrinsics.areEqual(((BasicCertificateChainCleaner)object0).a, this.a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}


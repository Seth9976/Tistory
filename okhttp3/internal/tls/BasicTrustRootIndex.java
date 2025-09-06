package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "", "Ljava/security/cert/X509Certificate;", "caCerts", "<init>", "([Ljava/security/cert/X509Certificate;)V", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n372#2,7:57\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n28#1:57,7\n37#1:64,2\n*E\n"})
public final class BasicTrustRootIndex implements TrustRootIndex {
    public final LinkedHashMap a;

    public BasicTrustRootIndex(@NotNull X509Certificate[] arr_x509Certificate) {
        Intrinsics.checkNotNullParameter(arr_x509Certificate, "caCerts");
        super();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v = 0; v < arr_x509Certificate.length; ++v) {
            X509Certificate x509Certificate0 = arr_x509Certificate[v];
            X500Principal x500Principal0 = x509Certificate0.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(x500Principal0, "caCert.subjectX500Principal");
            LinkedHashSet linkedHashSet0 = linkedHashMap0.get(x500Principal0);
            if(linkedHashSet0 == null) {
                linkedHashSet0 = new LinkedHashSet();
                linkedHashMap0.put(x500Principal0, linkedHashSet0);
            }
            linkedHashSet0.add(x509Certificate0);
        }
        this.a = linkedHashMap0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 == this || object0 instanceof BasicTrustRootIndex && Intrinsics.areEqual(((BasicTrustRootIndex)object0).a, this.a);
    }

    @Override  // okhttp3.internal.tls.TrustRootIndex
    @Nullable
    public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate x509Certificate0) {
        Intrinsics.checkNotNullParameter(x509Certificate0, "cert");
        X500Principal x500Principal0 = x509Certificate0.getIssuerX500Principal();
        Set set0 = (Set)this.a.get(x500Principal0);
        Object object0 = null;
        if(set0 == null) {
            return null;
        }
        Iterator iterator0 = set0.iterator();
    label_7:
        if(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            X509Certificate x509Certificate1 = (X509Certificate)object1;
            try {
                x509Certificate0.verify(x509Certificate1.getPublicKey());
                object0 = object1;
            }
            catch(Exception unused_ex) {
                goto label_7;
            }
        }
        return (X509Certificate)object0;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}


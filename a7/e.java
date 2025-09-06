package a7;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

public abstract class e extends zzy {
    public final int a;

    public e(byte[] arr_b) {
        Preconditions.checkArgument(arr_b.length == 25);
        this.a = Arrays.hashCode(arr_b);
    }

    public static byte[] a(String s) [...] // 潜在的解密器

    public abstract byte[] b();

    @Override
    public final boolean equals(Object object0) {
        if(object0 != null && object0 instanceof zzz) {
            try {
                if(((zzz)object0).zzc() != this.a) {
                    return false;
                }
                IObjectWrapper iObjectWrapper0 = ((zzz)object0).zzd();
                if(iObjectWrapper0 == null) {
                    return false;
                }
                byte[] arr_b = (byte[])ObjectWrapper.unwrap(iObjectWrapper0);
                return Arrays.equals(this.b(), arr_b);
            }
            catch(RemoteException remoteException0) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override  // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        return this.a;
    }

    @Override  // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(this.b());
    }
}


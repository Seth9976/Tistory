package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class LogWriter extends Writer {
    public final String a;
    public final StringBuilder b;

    public LogWriter(String s) {
        this.b = new StringBuilder(0x80);
        this.a = s;
    }

    public final void a() {
        StringBuilder stringBuilder0 = this.b;
        if(stringBuilder0.length() > 0) {
            Log.d(this.a, stringBuilder0.toString());
            stringBuilder0.delete(0, stringBuilder0.length());
        }
    }

    @Override
    public void close() {
        this.a();
    }

    @Override
    public void flush() {
        this.a();
    }

    @Override
    public void write(char[] arr_c, int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_c[v + v2];
            if(v3 == 10) {
                this.a();
            }
            else {
                this.b.append(((char)v3));
            }
        }
    }
}


package v4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class f {
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public f(int v, long v1, int v2, long v3) {
        this.a = v;
        this.b = v2;
        this.c = v1;
        this.d = v3;
    }

    public static f a(File file0) {
        try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file0))) {
            int v = dataInputStream0.readInt();
            int v1 = dataInputStream0.readInt();
            return new f(v, dataInputStream0.readLong(), v1, dataInputStream0.readLong());
        }
    }

    public final void b(File file0) {
        file0.delete();
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file0))) {
            dataOutputStream0.writeInt(this.a);
            dataOutputStream0.writeInt(this.b);
            dataOutputStream0.writeLong(this.c);
            dataOutputStream0.writeLong(this.d);
        }
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && object0 instanceof f && (this.b == ((f)object0).b && this.c == ((f)object0).c && this.a == ((f)object0).a && this.d == ((f)object0).d);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.c, this.a, this.d});
    }
}


package d0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey.Companion.CREATOR.1;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class b implements Parcelable {
    @JvmField
    @NotNull
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        b.CREATOR = new DefaultLazyKey.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public b(int v) {
        this.a = v;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a == ((b)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return a5.b.p(new StringBuilder("DefaultLazyKey(index="), this.a, ')');
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
    }
}


package t4;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.paging.compose.PagingPlaceholderKey.Companion.CREATOR.1;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class g implements Parcelable {
    @JvmField
    @NotNull
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        g.CREATOR = new PagingPlaceholderKey.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public g(int v) {
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
        return object0 instanceof g ? this.a == ((g)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return b.p(new StringBuilder("PagingPlaceholderKey(index="), this.a, ')');
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "parcel");
        parcel0.writeInt(this.a);
    }
}


package androidx.work.impl.constraints;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0017\u001A\u00020\u00022\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0003\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001A\u001A\u0004\b\u0004\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001A\u001A\u0004\b\u0005\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001A\u001A\u0004\b\u0006\u0010\n¨\u0006\u001E"}, d2 = {"Landroidx/work/impl/constraints/NetworkState;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "<init>", "(ZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "copy", "(ZZZZ)Landroidx/work/impl/constraints/NetworkState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "c", "d", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NetworkState {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public NetworkState(boolean z, boolean z1, boolean z2, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
    }

    public final boolean component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    @NotNull
    public final NetworkState copy(boolean z, boolean z1, boolean z2, boolean z3) {
        return new NetworkState(z, z1, z2, z3);
    }

    public static NetworkState copy$default(NetworkState networkState0, boolean z, boolean z1, boolean z2, boolean z3, int v, Object object0) {
        if((v & 1) != 0) {
            z = networkState0.a;
        }
        if((v & 2) != 0) {
            z1 = networkState0.b;
        }
        if((v & 4) != 0) {
            z2 = networkState0.c;
        }
        if((v & 8) != 0) {
            z3 = networkState0.d;
        }
        return networkState0.copy(z, z1, z2, z3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof NetworkState)) {
            return false;
        }
        if(this.a != ((NetworkState)object0).a) {
            return false;
        }
        if(this.b != ((NetworkState)object0).b) {
            return false;
        }
        return this.c == ((NetworkState)object0).c ? this.d == ((NetworkState)object0).d : false;
    }

    @Override
    public int hashCode() {
        int v = 1;
        int v1 = this.a;
        if(v1) {
            v1 = 1;
        }
        int v2 = this.b;
        if(v2) {
            v2 = 1;
        }
        int v3 = this.c;
        if(v3) {
            v3 = 1;
        }
        if(!this.d) {
            v = false;
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    public final boolean isConnected() {
        return this.a;
    }

    public final boolean isMetered() {
        return this.c;
    }

    public final boolean isNotRoaming() {
        return this.d;
    }

    public final boolean isValidated() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NetworkState(isConnected=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", isValidated=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isMetered=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", isNotRoaming=");
        return a.p(stringBuilder0, this.d, ')');
    }
}


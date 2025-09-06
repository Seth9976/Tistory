package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000B\u001A\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000B\u001A\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000B\u001A\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/KeyInfo;", "", "", "key", "objectKey", "location", "nodes", "index", "<init>", "(ILjava/lang/Object;III)V", "a", "I", "getKey", "()I", "b", "Ljava/lang/Object;", "getObjectKey", "()Ljava/lang/Object;", "c", "getLocation", "d", "getNodes", "e", "getIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KeyInfo {
    public static final int $stable = 8;
    public final int a;
    public final Object b;
    public final int c;
    public final int d;
    public final int e;

    public KeyInfo(int v, @Nullable Object object0, int v1, int v2, int v3) {
        this.a = v;
        this.b = object0;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    public final int getIndex() {
        return this.e;
    }

    public final int getKey() {
        return this.a;
    }

    public final int getLocation() {
        return this.c;
    }

    public final int getNodes() {
        return this.d;
    }

    @Nullable
    public final Object getObjectKey() {
        return this.b;
    }
}


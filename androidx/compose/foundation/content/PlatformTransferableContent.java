package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u001B\b\u0000\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/compose/foundation/content/PlatformTransferableContent;", "", "Landroid/net/Uri;", "linkUri", "Landroid/os/Bundle;", "extras", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "getLinkUri", "()Landroid/net/Uri;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformTransferableContent {
    public static final int $stable = 8;
    public final Uri a;
    public final Bundle b;

    public PlatformTransferableContent(@Nullable Uri uri0, @NotNull Bundle bundle0) {
        this.a = uri0;
        this.b = bundle0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PlatformTransferableContent)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((PlatformTransferableContent)object0).a) ? Intrinsics.areEqual(this.b, ((PlatformTransferableContent)object0).b) : false;
    }

    @NotNull
    public final Bundle getExtras() {
        return this.b;
    }

    @Nullable
    public final Uri getLinkUri() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.a + ", extras=" + this.b + ')';
    }
}


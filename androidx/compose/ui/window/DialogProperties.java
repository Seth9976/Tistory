package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u000BB\'\b\u0017\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\t\u0010\fJ\u001A\u0010\u000E\u001A\u00020\u00022\b\u0010\r\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0014\u001A\u0004\b\u001E\u0010\u0016R\u0017\u0010\b\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u0014\u001A\u0004\b \u0010\u0016¨\u0006!"}, d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(ZZZ)V", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "getDismissOnBackPress", "()Z", "b", "getDismissOnClickOutside", "c", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "d", "getUsePlatformDefaultWidth", "e", "getDecorFitsSystemWindows", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DialogProperties {
    public static final int $stable;
    public final boolean a;
    public final boolean b;
    public final SecureFlagPolicy c;
    public final boolean d;
    public final boolean e;

    public DialogProperties() {
        this(false, false, null, false, false, 0x1F, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0) {
        this(z, z1, secureFlagPolicy0, true, true);
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        this(z, z1, secureFlagPolicy0);
    }

    public DialogProperties(boolean z, boolean z1, @NotNull SecureFlagPolicy secureFlagPolicy0, boolean z2, boolean z3) {
        this.a = z;
        this.b = z1;
        this.c = secureFlagPolicy0;
        this.d = z2;
        this.e = z3;
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, boolean z2, boolean z3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        this(((v & 1) == 0 ? z : true), ((v & 2) == 0 ? z1 : true), secureFlagPolicy0, ((v & 8) == 0 ? z2 : true), ((v & 16) == 0 ? z3 : true));
    }

    public DialogProperties(boolean z, boolean z1, boolean z2) {
        this(z, z1, SecureFlagPolicy.Inherit, z2, true);
    }

    public DialogProperties(boolean z, boolean z1, boolean z2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            z2 = true;
        }
        this(z, z1, z2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DialogProperties)) {
            return false;
        }
        if(this.a != ((DialogProperties)object0).a) {
            return false;
        }
        if(this.b != ((DialogProperties)object0).b) {
            return false;
        }
        if(this.c != ((DialogProperties)object0).c) {
            return false;
        }
        return this.d == ((DialogProperties)object0).d ? this.e == ((DialogProperties)object0).e : false;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.e;
    }

    public final boolean getDismissOnBackPress() {
        return this.a;
    }

    public final boolean getDismissOnClickOutside() {
        return this.b;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.c;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.e) + a.e((this.c.hashCode() + a.e(Boolean.hashCode(this.a) * 0x1F, 0x1F, this.b)) * 0x1F, 0x1F, this.d);
    }
}


package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001C\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u000BB1\b\u0016\u0012\b\b\u0002\u0010\f\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\r\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u000EBE\b\u0016\u0012\b\b\u0002\u0010\f\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\r\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u0011BO\b\u0016\u0012\b\b\u0002\u0010\f\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\r\u001A\u00020\u0004\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u0012J\u001A\u0010\u0014\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u0017R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u001F\u0010\u001C\u001A\u0004\b \u0010\u001ER\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u001C\u001A\u0004\b\"\u0010\u001ER\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u001C\u001A\u0004\b$\u0010\u001ER\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u001C\u001A\u0004\b&\u0010\u001ER\u0011\u0010\f\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\b\'\u0010\u001ER\u0011\u0010\u0010\u001A\u00020\u000F8F\u00A2\u0006\u0006\u001A\u0004\b(\u0010)R\u0011\u0010\r\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\b*\u0010\u001E\u00A8\u0006+"}, d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "", "flags", "", "inheritSecurePolicy", "dismissOnBackPress", "dismissOnClickOutside", "excludeFromSystemGesture", "usePlatformDefaultWidth", "<init>", "(IZZZZZ)V", "focusable", "clippingEnabled", "(ZZZZ)V", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getFlags$ui_release", "b", "Z", "getInheritSecurePolicy$ui_release", "()Z", "c", "getDismissOnBackPress", "d", "getDismissOnClickOutside", "e", "getExcludeFromSystemGesture", "f", "getUsePlatformDefaultWidth", "getFocusable", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getClippingEnabled", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PopupProperties {
    public static final int $stable;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public PopupProperties(int v, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public PopupProperties(int v, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, ((v1 & 2) == 0 ? z : true), ((v1 & 4) == 0 ? z1 : true), ((v1 & 8) == 0 ? z2 : true), ((v1 & 16) == 0 ? z3 : true), ((v1 & 0x20) == 0 ? z4 : false));
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, @NotNull SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4) {
        this(z, z1, z2, secureFlagPolicy0, z3, z4, false);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        boolean z5 = true;
        if((v & 8) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 0x20) == 0) {
            z5 = z4;
        }
        this(z, ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : true), secureFlagPolicy0, ((v & 16) == 0 ? z3 : true), z5);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, @NotNull SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, boolean z5) {
        this(AndroidPopup_androidKt.access$createFlags(z, secureFlagPolicy0, z4), secureFlagPolicy0 == SecureFlagPolicy.Inherit, z1, z2, z3, z5);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, boolean z5, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        boolean z6 = true;
        if((v & 8) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 0x20) == 0) {
            z6 = z4;
        }
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : true), secureFlagPolicy0, ((v & 16) == 0 ? z3 : true), z6, ((v & 0x40) == 0 ? z5 : false));
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, boolean z3) {
        this(z, z1, z2, SecureFlagPolicy.Inherit, true, z3);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, boolean z3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            z2 = true;
        }
        if((v & 8) != 0) {
            z3 = true;
        }
        this(z, z1, z2, z3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PopupProperties)) {
            return false;
        }
        if(this.a != ((PopupProperties)object0).a) {
            return false;
        }
        if(this.b != ((PopupProperties)object0).b) {
            return false;
        }
        if(this.c != ((PopupProperties)object0).c) {
            return false;
        }
        if(this.d != ((PopupProperties)object0).d) {
            return false;
        }
        return this.e == ((PopupProperties)object0).e ? this.f == ((PopupProperties)object0).f : false;
    }

    public final boolean getClippingEnabled() {
        return (this.a & 0x200) == 0;
    }

    public final boolean getDismissOnBackPress() {
        return this.c;
    }

    public final boolean getDismissOnClickOutside() {
        return this.d;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.e;
    }

    public final int getFlags$ui_release() {
        return this.a;
    }

    public final boolean getFocusable() {
        return (this.a & 8) == 0;
    }

    public final boolean getInheritSecurePolicy$ui_release() {
        return this.b;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        if(this.b) {
            return SecureFlagPolicy.Inherit;
        }
        return (this.a & 0x2000) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.f) + a.e(a.e(a.e(a.e(this.a * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d), 0x1F, this.e);
    }
}


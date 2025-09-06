package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Immutable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bB!\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001A\u0010\f\u001A\u00020\u00042\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "", "shouldDismissOnBackPress", "<init>", "(Landroidx/compose/ui/window/SecureFlagPolicy;Z)V", "(Z)V", "isFocusable", "(Landroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/window/SecureFlagPolicy;", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "b", "Z", "getShouldDismissOnBackPress", "()Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ModalBottomSheetProperties {
    public static final int $stable;
    public final SecureFlagPolicy a;
    public final boolean b;

    public ModalBottomSheetProperties() {
        this(null, false, 3, null);
    }

    public ModalBottomSheetProperties(@NotNull SecureFlagPolicy secureFlagPolicy0, boolean z) {
        this.a = secureFlagPolicy0;
        this.b = z;
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.Inherit;
        }
        if((v & 2) != 0) {
            z = true;
        }
        this(secureFlagPolicy0, z);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\'isFocusable\' param is no longer used. Use constructor without this parameter.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetProperties(securePolicy, shouldDismissOnBackPress)", imports = {}))
    public ModalBottomSheetProperties(@NotNull SecureFlagPolicy secureFlagPolicy0, boolean z, boolean z1) {
        this(secureFlagPolicy0, z1);
    }

    public ModalBottomSheetProperties(boolean z) {
        this(SecureFlagPolicy.Inherit, z);
    }

    public ModalBottomSheetProperties(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ModalBottomSheetProperties ? this.a == ((ModalBottomSheetProperties)object0).a : false;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.a;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }
}


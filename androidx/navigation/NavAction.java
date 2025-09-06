package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u000FR$\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR$\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/navigation/NavAction;", "", "", "destinationId", "Landroidx/navigation/NavOptions;", "navOptions", "Landroid/os/Bundle;", "defaultArguments", "<init>", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getDestinationId", "b", "Landroidx/navigation/NavOptions;", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "c", "Landroid/os/Bundle;", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 NavAction.kt\nandroidx/navigation/NavAction\n*L\n58#1:87,3\n67#1:90,2\n*E\n"})
public final class NavAction {
    public final int a;
    public NavOptions b;
    public Bundle c;

    @JvmOverloads
    public NavAction(@IdRes int v) {
        this(v, null, null, 6, null);
    }

    @JvmOverloads
    public NavAction(@IdRes int v, @Nullable NavOptions navOptions0) {
        this(v, navOptions0, null, 4, null);
    }

    @JvmOverloads
    public NavAction(@IdRes int v, @Nullable NavOptions navOptions0, @Nullable Bundle bundle0) {
        this.a = v;
        this.b = navOptions0;
        this.c = bundle0;
    }

    public NavAction(int v, NavOptions navOptions0, Bundle bundle0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            navOptions0 = null;
        }
        if((v1 & 4) != 0) {
            bundle0 = null;
        }
        this(v, navOptions0, bundle0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && object0 instanceof NavAction && (this.a == ((NavAction)object0).a && Intrinsics.areEqual(this.b, ((NavAction)object0).b))) {
            if(Intrinsics.areEqual(this.c, ((NavAction)object0).c)) {
                return true;
            }
            Bundle bundle0 = this.c;
            if(bundle0 != null) {
                Set set0 = bundle0.keySet();
                if(set0 != null) {
                    if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                        for(Object object1: set0) {
                            String s = (String)object1;
                            Object object2 = null;
                            Object object3 = this.c == null ? null : this.c.get(s);
                            Bundle bundle1 = ((NavAction)object0).c;
                            if(bundle1 != null) {
                                object2 = bundle1.get(s);
                            }
                            if(Intrinsics.areEqual(object3, object2)) {
                                continue;
                            }
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final Bundle getDefaultArguments() {
        return this.c;
    }

    public final int getDestinationId() {
        return this.a;
    }

    @Nullable
    public final NavOptions getNavOptions() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a * 0x1F + (this.b == null ? 0 : this.b.hashCode());
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Set set0 = bundle0.keySet();
            if(set0 != null) {
                for(Object object0: set0) {
                    Object object1 = this.c == null ? null : this.c.get(((String)object0));
                    v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
                }
            }
        }
        return v;
    }

    public final void setDefaultArguments(@Nullable Bundle bundle0) {
        this.c = bundle0;
    }

    public final void setNavOptions(@Nullable NavOptions navOptions0) {
        this.b = navOptions0;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NavAction(0x");
        stringBuilder0.append(Integer.toHexString(this.a));
        stringBuilder0.append(")");
        if(this.b != null) {
            stringBuilder0.append(" navOptions=");
            stringBuilder0.append(this.b);
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
        return s;
    }
}


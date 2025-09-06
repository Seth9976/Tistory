package androidx.navigation.fragment;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;
import androidx.navigation.NavArgsLazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001F\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u0087\b¨\u0006\u0005"}, d2 = {"navArgs", "Landroidx/navigation/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Landroidx/fragment/app/Fragment;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FragmentNavArgsLazyKt {
    @MainThread
    public static final NavArgsLazy navArgs(Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new NavArgsLazy(Reflection.getOrCreateKotlinClass(NavArgs.class), new Function0(fragment0) {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final Bundle invoke() {
                Fragment fragment0 = this.w;
                Bundle bundle0 = fragment0.getArguments();
                if(bundle0 == null) {
                    throw new IllegalStateException("Fragment " + fragment0 + " has null arguments");
                }
                return bundle0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
    }
}


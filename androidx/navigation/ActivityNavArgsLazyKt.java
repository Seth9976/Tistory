package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001F\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\u0087\b¨\u0006\u0005"}, d2 = {"navArgs", "Landroidx/navigation/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Landroid/app/Activity;", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityNavArgsLazyKt {
    @MainThread
    public static final NavArgsLazy navArgs(Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "Args");
        return new NavArgsLazy(Reflection.getOrCreateKotlinClass(NavArgs.class), new Function0(activity0) {
            public final Activity w;

            {
                this.w = activity0;
                super(0);
            }

            @NotNull
            public final Bundle invoke() {
                Bundle bundle0;
                Activity activity0 = this.w;
                Intent intent0 = activity0.getIntent();
                if(intent0 == null) {
                    bundle0 = null;
                }
                else {
                    bundle0 = intent0.getExtras();
                    if(bundle0 == null) {
                        throw new IllegalStateException("Activity " + activity0 + " has null extras in " + intent0);
                    }
                }
                if(bundle0 == null) {
                    throw new IllegalStateException("Activity " + activity0 + " has a null Intent");
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


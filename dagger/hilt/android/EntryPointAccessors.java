package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001J+\u0010\u0007\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001A\u00020\t2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u000B\u0010\fJ+\u0010\u000F\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000E\u001A\u00020\r2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u000F\u0010\u0010J+\u0010\u0013\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0012\u001A\u00020\u00112\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0007\u001A\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0015J \u0010\u000B\u001A\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\n\u001A\u00020\tH\u0086\b¢\u0006\u0004\b\u000B\u0010\u0016J \u0010\u000F\u001A\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u000E\u001A\u00020\rH\u0086\b¢\u0006\u0004\b\u000F\u0010\u0017J \u0010\u0013\u001A\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0012\u001A\u00020\u0011H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldagger/hilt/android/EntryPointAccessors;", "", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "entryPoint", "fromApplication", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "fromActivity", "(Landroid/app/Activity;Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "fragment", "fromFragment", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;)Ljava/lang/Object;", "Landroid/view/View;", "view", "fromView", "(Landroid/view/View;Ljava/lang/Class;)Ljava/lang/Object;", "(Landroid/content/Context;)Ljava/lang/Object;", "(Landroid/app/Activity;)Ljava/lang/Object;", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "(Landroid/view/View;)Ljava/lang/Object;", "java_dagger_hilt_android-entry_point_accessors_internal_kt"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EntryPointAccessors {
    @NotNull
    public static final EntryPointAccessors INSTANCE;

    static {
        EntryPointAccessors.INSTANCE = new EntryPointAccessors();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmStatic
    public static final Object fromActivity(@NotNull Activity activity0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(class0, "entryPoint");
        return EntryPoints.get(activity0, class0);
    }

    public final Object fromActivity(Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.reifiedOperationMarker(4, "T");
        return EntryPointAccessors.fromActivity(activity0, Object.class);
    }

    @JvmStatic
    public static final Object fromApplication(@NotNull Context context0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(class0, "entryPoint");
        return EntryPoints.get(Contexts.getApplication(context0.getApplicationContext()), class0);
    }

    public final Object fromApplication(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.reifiedOperationMarker(4, "T");
        return EntryPointAccessors.fromApplication(context0, Object.class);
    }

    @JvmStatic
    public static final Object fromFragment(@NotNull Fragment fragment0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(class0, "entryPoint");
        return EntryPoints.get(fragment0, class0);
    }

    public final Object fromFragment(Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.reifiedOperationMarker(4, "T");
        return EntryPointAccessors.fromFragment(fragment0, Object.class);
    }

    @JvmStatic
    public static final Object fromView(@NotNull View view0, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(class0, "entryPoint");
        return EntryPoints.get(view0, class0);
    }

    public final Object fromView(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.reifiedOperationMarker(4, "T");
        return EntryPointAccessors.fromView(view0, Object.class);
    }
}


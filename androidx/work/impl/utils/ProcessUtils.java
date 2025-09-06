package androidx.work.impl.utils;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkManager;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u001D\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/Configuration;", "configuration", "", "isDefaultProcess", "(Landroid/content/Context;Landroidx/work/Configuration;)Z", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "ProcessUtils")
@SourceDebugExtension({"SMAP\nProcessUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessUtils.kt\nandroidx/work/impl/utils/ProcessUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class ProcessUtils {
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-ProcessUtils", "tagWithPrefix(\"ProcessUtils\")");
        ProcessUtils.a = "WM-ProcessUtils";
    }

    public static final boolean isDefaultProcess(@NotNull Context context0, @NotNull Configuration configuration0) {
        String s;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(configuration0, "configuration");
        if(Build.VERSION.SDK_INT >= 28) {
            s = a.a.a();
        }
        else {
            try {
                s = null;
                Method method0 = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                method0.setAccessible(true);
                Object object0 = method0.invoke(null, null);
                Intrinsics.checkNotNull(object0);
                if(object0 instanceof String) {
                    s = (String)object0;
                }
                else {
                    goto label_15;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
                Logger.get().debug("WM-ProcessUtils", "Unable to check ActivityThread for processName", throwable0);
            }
        label_15:
            int v = Process.myPid();
            Object object1 = context0.getSystemService("activity");
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type android.app.ActivityManager");
            List list0 = ((ActivityManager)object1).getRunningAppProcesses();
            if(list0 != null) {
                Object object2 = null;
                for(Object object3: list0) {
                    if(((ActivityManager.RunningAppProcessInfo)object3).pid == v) {
                        object2 = object3;
                        break;
                    }
                }
                if(((ActivityManager.RunningAppProcessInfo)object2) != null) {
                    s = ((ActivityManager.RunningAppProcessInfo)object2).processName;
                }
            }
        }
    label_28:
        String s1 = configuration0.getDefaultProcessName();
        return s1 == null || s1.length() == 0 ? Intrinsics.areEqual(s, context0.getApplicationInfo().processName) : Intrinsics.areEqual(s, configuration0.getDefaultProcessName());
    }
}


package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A#\u0010\u0006\u001A\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "newWakeLock", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "", "checkWakeLocks", "()V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "WakeLocks")
@SourceDebugExtension({"SMAP\nWakeLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WakeLocks.kt\nandroidx/work/impl/utils/WakeLocks\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n215#2,2:74\n*S KotlinDebug\n*F\n+ 1 WakeLocks.kt\nandroidx/work/impl/utils/WakeLocks\n*L\n65#1:74,2\n*E\n"})
public final class WakeLocks {
    public static final String a;

    // 去混淆评级： 低(20)
    static {
        Intrinsics.checkNotNullExpressionValue("WM-WakeLocks", "tagWithPrefix(\"WakeLocks\")");
        WakeLocks.a = "WM-WakeLocks";
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        synchronized(m.a) {
            linkedHashMap0.putAll(m.b);
        }
        for(Object object0: linkedHashMap0.entrySet()) {
            PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)((Map.Entry)object0).getKey();
            String s = (String)((Map.Entry)object0).getValue();
            if(powerManager$WakeLock0 != null && powerManager$WakeLock0.isHeld()) {
                Logger.get().warning("WM-WakeLocks", "WakeLock held for " + s);
            }
        }
    }

    @NotNull
    public static final PowerManager.WakeLock newWakeLock(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "tag");
        Object object0 = context0.getApplicationContext().getSystemService("power");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)object0).newWakeLock(1, "WorkManager: " + s);
        synchronized(m.a) {
            String s1 = (String)m.b.put(powerManager$WakeLock0, "WorkManager: " + s);
        }
        Intrinsics.checkNotNullExpressionValue(powerManager$WakeLock0, "wakeLock");
        return powerManager$WakeLock0;
    }
}


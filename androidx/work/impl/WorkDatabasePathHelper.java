package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/work/impl/WorkDatabasePathHelper;", "", "Landroid/content/Context;", "context", "", "migrateDatabase", "(Landroid/content/Context;)V", "", "Ljava/io/File;", "migrationPaths", "(Landroid/content/Context;)Ljava/util/Map;", "getDefaultDatabasePath", "(Landroid/content/Context;)Ljava/io/File;", "getDatabasePath", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWorkDatabasePathHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkDatabasePathHelper.kt\nandroidx/work/impl/WorkDatabasePathHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,126:1\n215#2,2:127\n8676#3,2:129\n9358#3,4:131\n*S KotlinDebug\n*F\n+ 1 WorkDatabasePathHelper.kt\nandroidx/work/impl/WorkDatabasePathHelper\n*L\n51#1:127,2\n78#1:129,2\n78#1:131,4\n*E\n"})
public final class WorkDatabasePathHelper {
    @NotNull
    public static final WorkDatabasePathHelper INSTANCE;

    static {
        WorkDatabasePathHelper.INSTANCE = new WorkDatabasePathHelper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final File getDatabasePath(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(context0), "androidx.work.workdb");
    }

    @NotNull
    public final File getDefaultDatabasePath(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        File file0 = context0.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(file0, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return file0;
    }

    @JvmStatic
    public static final void migrateDatabase(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        WorkDatabasePathHelper workDatabasePathHelper0 = WorkDatabasePathHelper.INSTANCE;
        if(workDatabasePathHelper0.getDefaultDatabasePath(context0).exists()) {
            Logger.get().debug("WM-WrkDbPathHelper", "Migrating WorkDatabase to the no-backup directory");
            for(Object object0: workDatabasePathHelper0.migrationPaths(context0).entrySet()) {
                File file0 = (File)((Map.Entry)object0).getKey();
                File file1 = (File)((Map.Entry)object0).getValue();
                if(file0.exists()) {
                    if(file1.exists()) {
                        Logger.get().warning("WM-WrkDbPathHelper", "Over-writing contents of " + file1);
                    }
                    String s = file0.renameTo(file1) ? "Migrated " + file0 + "to " + file1 : "Renaming " + file0 + " to " + file1 + " failed";
                    Logger.get().debug("WM-WrkDbPathHelper", s);
                }
            }
        }
    }

    @NotNull
    public final Map migrationPaths(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        File file0 = this.getDefaultDatabasePath(context0);
        File file1 = this.getDatabasePath(context0);
        String[] arr_s = WorkDatabasePathHelperKt.access$getDATABASE_EXTRA_FILES$p();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(arr_s.length), 16));
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Pair pair0 = TuplesKt.to(new File(file0.getPath() + s), new File(file1.getPath() + s));
            linkedHashMap0.put(pair0.getFirst(), pair0.getSecond());
        }
        return x.plus(linkedHashMap0, TuplesKt.to(file0, file1));
    }
}


package androidx.datastore.core;

import android.os.FileObserver;
import androidx.annotation.CheckResult;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rJ!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "", "event", "", "path", "", "onEvent", "(ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n*L\n50#1:146,2\n*E\n"})
public final class MulticastFileObserver extends FileObserver {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\n\u001A\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\tR,\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u0012\u0004\b\u0012\u0010\t\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001A\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", "", "Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/Flow;", "", "observe", "(Ljava/io/File;)Lkotlinx/coroutines/flow/Flow;", "removeAllObservers$datastore_core_release", "()V", "removeAllObservers", "", "", "Landroidx/datastore/core/MulticastFileObserver;", "fileObservers", "Ljava/util/Map;", "getFileObservers$datastore_core_release", "()Ljava/util/Map;", "getFileObservers$datastore_core_release$annotations", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n372#2,7:146\n1855#3,2:153\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n*L\n103#1:146,7\n137#1:153,2\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final DisposableHandle access$observe(Companion multicastFileObserver$Companion0, File file0, Function1 function10) {
            multicastFileObserver$Companion0.getClass();
            String s = file0.getCanonicalFile().getPath();
            synchronized(MulticastFileObserver.c) {
                Map map0 = MulticastFileObserver.Companion.getFileObservers$datastore_core_release();
                Intrinsics.checkNotNullExpressionValue(s, "key");
                MulticastFileObserver multicastFileObserver0 = map0.get(s);
                if(multicastFileObserver0 == null) {
                    multicastFileObserver0 = new MulticastFileObserver(s, null);
                    map0.put(s, multicastFileObserver0);
                }
                multicastFileObserver0.b.add(function10);
                if(multicastFileObserver0.b.size() == 1) {
                    multicastFileObserver0.startWatching();
                }
            }
            return new a(1, s, function10);
        }

        @NotNull
        public final Map getFileObservers$datastore_core_release() {
            return MulticastFileObserver.d;
        }

        @VisibleForTesting
        public static void getFileObservers$datastore_core_release$annotations() {
        }

        @CheckResult
        @NotNull
        public final Flow observe(@NotNull File file0) {
            Intrinsics.checkNotNullParameter(file0, "file");
            return FlowKt.channelFlow(new n(file0, null));
        }

        @VisibleForTesting
        public final void removeAllObservers$datastore_core_release() {
            synchronized(MulticastFileObserver.c) {
                for(Object object1: MulticastFileObserver.Companion.getFileObservers$datastore_core_release().values()) {
                    ((MulticastFileObserver)object1).stopWatching();
                }
                MulticastFileObserver.Companion.getFileObservers$datastore_core_release().clear();
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final CopyOnWriteArrayList b;
    public static final Object c;
    public static final LinkedHashMap d;

    static {
        MulticastFileObserver.Companion = new Companion(null);
        MulticastFileObserver.c = new Object();
        MulticastFileObserver.d = new LinkedHashMap();
    }

    public MulticastFileObserver(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        super(s, 0x80);
        this.a = s;
        this.b = new CopyOnWriteArrayList();
    }

    @NotNull
    public final String getPath() {
        return this.a;
    }

    @Override  // android.os.FileObserver
    public void onEvent(int v, @Nullable String s) {
        for(Object object0: this.b) {
            ((Function1)object0).invoke(s);
        }
    }
}


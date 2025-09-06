package androidx.paging;

import a5.b;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.k1;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.a1;
import s4.b1;

@Deprecated(message = "PagedList is deprecated and has been replaced by PagingData")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u000E\b\'\u0018\u0000 t*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006uvwtxyBA\b\u0000\u0012\u0010\u0010\u0005\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001B\u001A\u00020\u00192\u0018\u0010\u001A\u001A\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016H\'\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001E\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u0013H\'\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010 \u001A\u00020\u0019H&\u00A2\u0006\u0004\b \u0010!J\u001F\u0010$\u001A\u00020\u00192\u0006\u0010\"\u001A\u00020\u00172\u0006\u0010#\u001A\u00020\u0018H\u0017\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010&\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b&\u0010!J\u0019\u0010)\u001A\u00020\u00192\b\u0010(\u001A\u0004\u0018\u00010\'H\u0007\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010.\u001A\u00020\u00192\u0006\u0010+\u001A\u00020\u00172\u0006\u0010,\u001A\u00020\u0018H\u0000\u00A2\u0006\u0004\b-\u0010%J\u001A\u0010/\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u001D\u001A\u00020\u0013H\u0096\u0002\u00A2\u0006\u0004\b/\u00100J\u0015\u00101\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u0013\u00A2\u0006\u0004\b1\u0010\u001FJ\u0013\u00103\u001A\b\u0012\u0004\u0012\u00028\u000002\u00A2\u0006\u0004\b3\u00104J\'\u00106\u001A\u00020\u00192\u0018\u00105\u001A\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016\u00A2\u0006\u0004\b6\u0010\u001CJ\'\u00107\u001A\u00020\u00192\u0018\u00105\u001A\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0016\u00A2\u0006\u0004\b7\u0010\u001CJ\'\u0010:\u001A\u00020\u00192\u000E\u00108\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001022\u0006\u0010\u001A\u001A\u000209H\u0007\u00A2\u0006\u0004\b:\u0010;J\u0015\u0010:\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u000209\u00A2\u0006\u0004\b:\u0010<J\u0015\u0010=\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u000209\u00A2\u0006\u0004\b=\u0010<J\u001F\u0010B\u001A\u00020\u00192\u0006\u0010>\u001A\u00020\u00132\u0006\u0010?\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b@\u0010AJ\u001F\u0010C\u001A\u00020\u00192\u0006\u0010>\u001A\u00020\u00132\u0006\u0010?\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\bC\u0010AJ\u001F\u0010D\u001A\u00020\u00192\u0006\u0010>\u001A\u00020\u00132\u0006\u0010?\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\bD\u0010AR$\u0010\u0005\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00048\u0017X\u0096\u0004\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR\u001A\u0010\u0007\u001A\u00020\u00068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010LR\u001A\u0010\t\u001A\u00020\b8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010PR \u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010TR\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010XR$\u0010(\u001A\u0004\u0018\u00010\'8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\\"\u0004\b]\u0010*R\u001A\u0010a\u001A\u00020\u00138\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010\u0015R\u0014\u0010c\u001A\u00020\u00138VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bb\u0010\u0015R$\u0010h\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000d8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bg\u0010!\u001A\u0004\be\u0010fR\u0016\u0010k\u001A\u0004\u0018\u00010\u00018&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bi\u0010jR\u0014\u0010m\u001A\u00020l8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bm\u0010nR\u0011\u0010p\u001A\u00020\u00138F\u00A2\u0006\u0006\u001A\u0004\bo\u0010\u0015R\u0014\u0010q\u001A\u00020l8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bq\u0010nR\u0011\u0010s\u001A\u00020\u00138F\u00A2\u0006\u0006\u001A\u0004\br\u0010\u0015\u00A8\u0006z"}, d2 = {"Landroidx/paging/PagedList;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/PagingSource;", "pagingSource", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "Landroidx/paging/PagedStorage;", "storage", "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedStorage;Landroidx/paging/PagedList$Config;)V", "Landroidx/paging/PlaceholderPaddedList;", "getPlaceholderPaddedList", "()Landroidx/paging/PlaceholderPaddedList;", "", "lastLoad", "()I", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "index", "loadAroundInternal", "(I)V", "detach", "()V", "loadType", "loadState", "setInitialLoadState", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "retry", "Ljava/lang/Runnable;", "refreshRetryCallback", "setRetryCallback", "(Ljava/lang/Runnable;)V", "type", "state", "dispatchStateChangeAsync$paging_common_release", "dispatchStateChangeAsync", "get", "(I)Ljava/lang/Object;", "loadAround", "", "snapshot", "()Ljava/util/List;", "listener", "addWeakLoadStateListener", "removeWeakLoadStateListener", "previousSnapshot", "Landroidx/paging/PagedList$Callback;", "addWeakCallback", "(Ljava/util/List;Landroidx/paging/PagedList$Callback;)V", "(Landroidx/paging/PagedList$Callback;)V", "removeWeakCallback", "position", "count", "notifyInserted$paging_common_release", "(II)V", "notifyInserted", "notifyChanged", "notifyRemoved", "a", "Landroidx/paging/PagingSource;", "getPagingSource", "()Landroidx/paging/PagingSource;", "b", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope$paging_common_release", "()Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "getNotifyDispatcher$paging_common_release", "()Lkotlinx/coroutines/CoroutineDispatcher;", "d", "Landroidx/paging/PagedStorage;", "getStorage$paging_common_release", "()Landroidx/paging/PagedStorage;", "e", "Landroidx/paging/PagedList$Config;", "getConfig", "()Landroidx/paging/PagedList$Config;", "f", "Ljava/lang/Runnable;", "getRefreshRetryCallback$paging_common_release", "()Ljava/lang/Runnable;", "setRefreshRetryCallback$paging_common_release", "g", "I", "getRequiredRemainder$paging_common_release", "requiredRemainder", "getSize", "size", "Landroidx/paging/DataSource;", "getDataSource", "()Landroidx/paging/DataSource;", "getDataSource$annotations", "dataSource", "getLastKey", "()Ljava/lang/Object;", "lastKey", "", "isDetached", "()Z", "getLoadedCount", "loadedCount", "isImmutable", "getPositionOffset", "positionOffset", "Companion", "BoundaryCallback", "Builder", "Callback", "Config", "LoadStateManager", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagedList.kt\nandroidx/paging/PagedList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1290:1\n1855#2,2:1291\n1855#2,2:1293\n1855#2,2:1295\n*S KotlinDebug\n*F\n+ 1 PagedList.kt\nandroidx/paging/PagedList\n*L\n1229#1:1291,2\n1235#1:1293,2\n1241#1:1295,2\n*E\n"})
public abstract class PagedList extends AbstractList {
    @MainThread
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\'\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001A\u00020\u0005H\u0016¨\u0006\u000B"}, d2 = {"Landroidx/paging/PagedList$BoundaryCallback;", "T", "", "()V", "onItemAtEndLoaded", "", "itemAtEnd", "(Ljava/lang/Object;)V", "onItemAtFrontLoaded", "itemAtFront", "onZeroItemsLoaded", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class BoundaryCallback {
        public void onItemAtEndLoaded(@NotNull Object object0) {
            Intrinsics.checkNotNullParameter(object0, "itemAtEnd");
        }

        public void onItemAtFrontLoaded(@NotNull Object object0) {
            Intrinsics.checkNotNullParameter(object0, "itemAtFront");
        }

        public void onZeroItemsLoaded() {
        }
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData, which no longer supports constructing snapshots of loaded data manually.", replaceWith = @ReplaceWith(expression = "Pager.flow", imports = {"androidx.paging.Pager"}))
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0016\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\b\u0010\fB9\b\u0016\u0012\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000F\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\u0011B9\b\u0016\u0012\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\u0012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000F\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\b\u0010\u0012J!\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0017H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001AJ!\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001D\u0010\u001EJ#\u0010 \u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u0017H\u0007\u00A2\u0006\u0004\b \u0010\u001AJ!\u0010\"\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010!\u001A\u00020\u001B\u00A2\u0006\u0004\b\"\u0010\u001EJ)\u0010%\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u000E\u0010$\u001A\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010#\u00A2\u0006\u0004\b%\u0010&J#\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\'\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\b(\u0010)J\u0013\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00020*\u00A2\u0006\u0004\b+\u0010,\u00A8\u0006-"}, d2 = {"Landroidx/paging/PagedList$Builder;", "", "Key", "Value", "Landroidx/paging/DataSource;", "dataSource", "Landroidx/paging/PagedList$Config;", "config", "<init>", "(Landroidx/paging/DataSource;Landroidx/paging/PagedList$Config;)V", "", "pageSize", "(Landroidx/paging/DataSource;I)V", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedList$Config;)V", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;I)V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/paging/PagedList$Builder;", "Ljava/util/concurrent/Executor;", "notifyExecutor", "setNotifyExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/paging/PagedList$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "setNotifyDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Landroidx/paging/PagedList$Builder;", "fetchExecutor", "setFetchExecutor", "fetchDispatcher", "setFetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "setBoundaryCallback", "(Landroidx/paging/PagedList$BoundaryCallback;)Landroidx/paging/PagedList$Builder;", "initialKey", "setInitialKey", "(Ljava/lang/Object;)Landroidx/paging/PagedList$Builder;", "Landroidx/paging/PagedList;", "build", "()Landroidx/paging/PagedList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public final PagingSource a;
        public final DataSource b;
        public final Page c;
        public final Config d;
        public CoroutineScope e;
        public CoroutineDispatcher f;
        public CoroutineDispatcher g;
        public BoundaryCallback h;
        public Object i;

        public Builder(@NotNull DataSource dataSource0, int v) {
            Intrinsics.checkNotNullParameter(dataSource0, "dataSource");
            this(dataSource0, PagedListConfigKt.Config$default(v, 0, false, 0, 0, 30, null));
        }

        public Builder(@NotNull DataSource dataSource0, @NotNull Config pagedList$Config0) {
            Intrinsics.checkNotNullParameter(dataSource0, "dataSource");
            Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
            super();
            this.e = GlobalScope.INSTANCE;
            this.a = null;
            this.b = dataSource0;
            this.c = null;
            this.d = pagedList$Config0;
        }

        public Builder(@NotNull PagingSource pagingSource0, @NotNull Page pagingSource$LoadResult$Page0, int v) {
            Intrinsics.checkNotNullParameter(pagingSource0, "pagingSource");
            Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "initialPage");
            this(pagingSource0, pagingSource$LoadResult$Page0, PagedListConfigKt.Config$default(v, 0, false, 0, 0, 30, null));
        }

        public Builder(@NotNull PagingSource pagingSource0, @NotNull Page pagingSource$LoadResult$Page0, @NotNull Config pagedList$Config0) {
            Intrinsics.checkNotNullParameter(pagingSource0, "pagingSource");
            Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "initialPage");
            Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
            super();
            this.e = GlobalScope.INSTANCE;
            this.a = pagingSource0;
            this.b = null;
            this.c = pagingSource$LoadResult$Page0;
            this.d = pagedList$Config0;
        }

        @NotNull
        public final PagedList build() {
            PagingSource pagingSource1;
            CoroutineDispatcher coroutineDispatcher0 = this.g == null ? Dispatchers.getIO() : this.g;
            PagingSource pagingSource0 = this.a;
            if(pagingSource0 == null) {
                pagingSource1 = this.b == null ? null : new LegacyPagingSource(coroutineDispatcher0, this.b);
            }
            else {
                pagingSource1 = pagingSource0;
            }
            if(pagingSource1 instanceof LegacyPagingSource) {
                ((LegacyPagingSource)pagingSource1).setPageSize(this.d.pageSize);
            }
            if(pagingSource1 == null) {
                throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource");
            }
            Companion pagedList$Companion0 = PagedList.Companion;
            CoroutineScope coroutineScope0 = this.e;
            CoroutineDispatcher coroutineDispatcher1 = this.f;
            if(coroutineDispatcher1 == null) {
                coroutineDispatcher1 = Dispatchers.getMain().getImmediate();
            }
            return pagedList$Companion0.create(pagingSource1, this.c, coroutineScope0, coroutineDispatcher1, coroutineDispatcher0, this.h, this.d, this.i);
        }

        @NotNull
        public final Builder setBoundaryCallback(@Nullable BoundaryCallback pagedList$BoundaryCallback0) {
            this.h = pagedList$BoundaryCallback0;
            return this;
        }

        @NotNull
        public final Builder setCoroutineScope(@NotNull CoroutineScope coroutineScope0) {
            Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
            this.e = coroutineScope0;
            return this;
        }

        @NotNull
        public final Builder setFetchDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher0, "fetchDispatcher");
            this.g = coroutineDispatcher0;
            return this;
        }

        @Deprecated(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @ReplaceWith(expression = "setFetchDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        @NotNull
        public final Builder setFetchExecutor(@NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(executor0, "fetchExecutor");
            this.g = ExecutorsKt.from(executor0);
            return this;
        }

        @NotNull
        public final Builder setInitialKey(@Nullable Object object0) {
            this.i = object0;
            return this;
        }

        @NotNull
        public final Builder setNotifyDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
            this.f = coroutineDispatcher0;
            return this;
        }

        @Deprecated(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @ReplaceWith(expression = "setNotifyDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        @NotNull
        public final Builder setNotifyExecutor(@NotNull Executor executor0) {
            Intrinsics.checkNotNullParameter(executor0, "notifyExecutor");
            this.f = ExecutorsKt.from(executor0);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H&J\u0018\u0010\b\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H&J\u0018\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H&¨\u0006\n"}, d2 = {"Landroidx/paging/PagedList$Callback;", "", "()V", "onChanged", "", "position", "", "count", "onInserted", "onRemoved", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Callback {
        public abstract void onChanged(int arg1, int arg2);

        public abstract void onInserted(int arg1, int arg2);

        public abstract void onRemoved(int arg1, int arg2);
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u008D\u0001\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00020\u0012\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r2\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0011\u001A\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\'\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u0018H\u0000¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/paging/PagedList$Companion;", "", "K", "T", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingSource$LoadResult$Page;", "initialPage", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "fetchDispatcher", "Landroidx/paging/PagedList$BoundaryCallback;", "boundaryCallback", "Landroidx/paging/PagedList$Config;", "config", "key", "Landroidx/paging/PagedList;", "create", "(Landroidx/paging/PagingSource;Landroidx/paging/PagingSource$LoadResult$Page;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$BoundaryCallback;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)Landroidx/paging/PagedList;", "", "currentSize", "snapshotSize", "Landroidx/paging/PagedList$Callback;", "callback", "", "dispatchNaiveUpdatesSinceSnapshot$paging_common_release", "(IILandroidx/paging/PagedList$Callback;)V", "dispatchNaiveUpdatesSinceSnapshot", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public final PagedList create(@NotNull PagingSource pagingSource0, @Nullable Page pagingSource$LoadResult$Page0, @NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull Config pagedList$Config0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(pagingSource0, "pagingSource");
            Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
            Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(coroutineDispatcher1, "fetchDispatcher");
            Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
            return pagingSource$LoadResult$Page0 == null ? new ContiguousPagedList(pagingSource0, coroutineScope0, coroutineDispatcher0, coroutineDispatcher1, pagedList$BoundaryCallback0, pagedList$Config0, ((Page)BuildersKt.runBlocking$default(null, new r0(pagingSource0, new Refresh(object0, pagedList$Config0.initialLoadSizeHint, pagedList$Config0.enablePlaceholders), null), 1, null)), object0) : new ContiguousPagedList(pagingSource0, coroutineScope0, coroutineDispatcher0, coroutineDispatcher1, pagedList$BoundaryCallback0, pagedList$Config0, pagingSource$LoadResult$Page0, object0);
        }

        public final void dispatchNaiveUpdatesSinceSnapshot$paging_common_release(int v, int v1, @NotNull Callback pagedList$Callback0) {
            Intrinsics.checkNotNullParameter(pagedList$Callback0, "callback");
            if(v1 < v) {
                if(v1 > 0) {
                    pagedList$Callback0.onChanged(0, v1);
                }
                int v2 = v - v1;
                if(v2 > 0) {
                    pagedList$Callback0.onInserted(v1, v2);
                }
            }
            else {
                if(v > 0) {
                    pagedList$Callback0.onChanged(0, v);
                }
                int v3 = v1 - v;
                if(v3 != 0) {
                    pagedList$Callback0.onRemoved(v, v3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\u0018\u0000 \u000B2\u00020\u0001:\u0002\n\u000BB/\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tR\u0010\u0010\u0005\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/paging/PagedList$Config;", "", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "(IIZII)V", "Builder", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Config {
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u00020\u00002\b\b\u0001\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001A\u00020\u00002\b\b\u0001\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u00002\b\b\u0001\u0010\u000E\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0007J\u0017\u0010\u0011\u001A\u00020\u00002\b\b\u0001\u0010\u0010\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/paging/PagedList$Config$Builder;", "", "<init>", "()V", "", "pageSize", "setPageSize", "(I)Landroidx/paging/PagedList$Config$Builder;", "prefetchDistance", "setPrefetchDistance", "", "enablePlaceholders", "setEnablePlaceholders", "(Z)Landroidx/paging/PagedList$Config$Builder;", "initialLoadSizeHint", "setInitialLoadSizeHint", "maxSize", "setMaxSize", "Landroidx/paging/PagedList$Config;", "build", "()Landroidx/paging/PagedList$Config;", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.paging.PagedList.Config.Builder {
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/PagedList$Config$Builder$Companion;", "", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
            public static final class androidx.paging.PagedList.Config.Builder.Companion {
                public androidx.paging.PagedList.Config.Builder.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
                }
            }

            @NotNull
            public static final androidx.paging.PagedList.Config.Builder.Companion Companion = null;
            public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
            public int a;
            public int b;
            public int c;
            public boolean d;
            public int e;

            static {
                androidx.paging.PagedList.Config.Builder.Companion = new androidx.paging.PagedList.Config.Builder.Companion(null);
            }

            public androidx.paging.PagedList.Config.Builder() {
                this.a = -1;
                this.b = -1;
                this.c = -1;
                this.d = true;
                this.e = 0x7FFFFFFF;
            }

            @NotNull
            public final Config build() {
                if(this.b < 0) {
                    this.b = this.a;
                }
                if(this.c < 0) {
                    this.c = this.a * 3;
                }
                if(!this.d && this.b == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                if(this.e != 0x7FFFFFFF && this.e < this.b * 2 + this.a) {
                    throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.a + ", prefetchDist=" + this.b + ", maxSize=" + this.e);
                }
                return new Config(this.a, this.b, this.d, this.c, this.e);
            }

            @NotNull
            public final androidx.paging.PagedList.Config.Builder setEnablePlaceholders(boolean z) {
                this.d = z;
                return this;
            }

            @NotNull
            public final androidx.paging.PagedList.Config.Builder setInitialLoadSizeHint(@IntRange(from = 1L) int v) {
                this.c = v;
                return this;
            }

            @NotNull
            public final androidx.paging.PagedList.Config.Builder setMaxSize(@IntRange(from = 2L) int v) {
                this.e = v;
                return this;
            }

            @NotNull
            public final androidx.paging.PagedList.Config.Builder setPageSize(@IntRange(from = 1L) int v) {
                if(v < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.a = v;
                return this;
            }

            @NotNull
            public final androidx.paging.PagedList.Config.Builder setPrefetchDistance(@IntRange(from = 0L) int v) {
                this.b = v;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/PagedList$Config$Companion;", "", "", "MAX_SIZE_UNBOUNDED", "I", "getMAX_SIZE_UNBOUNDED$annotations", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.paging.PagedList.Config.Companion {
            public androidx.paging.PagedList.Config.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            public static void getMAX_SIZE_UNBOUNDED$annotations() {
            }
        }

        @NotNull
        public static final androidx.paging.PagedList.Config.Companion Companion = null;
        public static final int MAX_SIZE_UNBOUNDED = 0x7FFFFFFF;
        @JvmField
        public final boolean enablePlaceholders;
        @JvmField
        public final int initialLoadSizeHint;
        @JvmField
        public final int maxSize;
        @JvmField
        public final int pageSize;
        @JvmField
        public final int prefetchDistance;

        static {
            Config.Companion = new androidx.paging.PagedList.Config.Companion(null);
        }

        public Config(int v, int v1, boolean z, int v2, int v3) {
            this.pageSize = v;
            this.prefetchDistance = v1;
            this.enablePlaceholders = z;
            this.initialLoadSizeHint = v2;
            this.maxSize = v3;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001D\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\'¢\u0006\u0004\b\u000B\u0010\nJ\'\u0010\u000E\u001A\u00020\b2\u0018\u0010\r\u001A\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u000E\u0010\u000FR\"\u0010\u0016\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001A\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001A\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001E\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u0011\u001A\u0004\b\u001C\u0010\u0013\"\u0004\b\u001D\u0010\u0015¨\u0006\u001F"}, d2 = {"Landroidx/paging/PagedList$LoadStateManager;", "", "<init>", "()V", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/LoadState;", "state", "", "setState", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "onStateChanged", "Lkotlin/Function2;", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "a", "Landroidx/paging/LoadState;", "getRefreshState", "()Landroidx/paging/LoadState;", "setRefreshState", "(Landroidx/paging/LoadState;)V", "refreshState", "b", "getStartState", "setStartState", "startState", "c", "getEndState", "setEndState", "endState", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class LoadStateManager {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[LoadType.values().length];
                try {
                    arr_v[LoadType.REFRESH.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LoadType.PREPEND.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LoadType.APPEND.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        public LoadState a;
        public LoadState b;
        public LoadState c;

        public LoadStateManager() {
            this.a = NotLoading.Companion.getIncomplete$paging_common_release();
            this.b = NotLoading.Companion.getIncomplete$paging_common_release();
            this.c = NotLoading.Companion.getIncomplete$paging_common_release();
        }

        public final void dispatchCurrentLoadState(@NotNull Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "callback");
            function20.invoke(LoadType.REFRESH, this.a);
            function20.invoke(LoadType.PREPEND, this.b);
            function20.invoke(LoadType.APPEND, this.c);
        }

        @NotNull
        public final LoadState getEndState() {
            return this.c;
        }

        @NotNull
        public final LoadState getRefreshState() {
            return this.a;
        }

        @NotNull
        public final LoadState getStartState() {
            return this.b;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public abstract void onStateChanged(@NotNull LoadType arg1, @NotNull LoadState arg2);

        public final void setEndState(@NotNull LoadState loadState0) {
            Intrinsics.checkNotNullParameter(loadState0, "<set-?>");
            this.c = loadState0;
        }

        public final void setRefreshState(@NotNull LoadState loadState0) {
            Intrinsics.checkNotNullParameter(loadState0, "<set-?>");
            this.a = loadState0;
        }

        public final void setStartState(@NotNull LoadState loadState0) {
            Intrinsics.checkNotNullParameter(loadState0, "<set-?>");
            this.b = loadState0;
        }

        public final void setState(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
            Intrinsics.checkNotNullParameter(loadType0, "type");
            Intrinsics.checkNotNullParameter(loadState0, "state");
            switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
                case 1: {
                    if(Intrinsics.areEqual(this.a, loadState0)) {
                        return;
                    }
                    this.a = loadState0;
                    break;
                }
                case 2: {
                    if(Intrinsics.areEqual(this.b, loadState0)) {
                        return;
                    }
                    this.b = loadState0;
                    break;
                }
                case 3: {
                    if(Intrinsics.areEqual(this.c, loadState0)) {
                        return;
                    }
                    this.c = loadState0;
                }
            }
            this.onStateChanged(loadType0, loadState0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final PagingSource a;
    public final CoroutineScope b;
    public final CoroutineDispatcher c;
    public final PagedStorage d;
    public final Config e;
    public Runnable f;
    public final int g;
    public final ArrayList h;
    public final ArrayList i;

    static {
        PagedList.Companion = new Companion(null);
    }

    public PagedList(@NotNull PagingSource pagingSource0, @NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull PagedStorage pagedStorage0, @NotNull Config pagedList$Config0) {
        Intrinsics.checkNotNullParameter(pagingSource0, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(pagedStorage0, "storage");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        super();
        this.a = pagingSource0;
        this.b = coroutineScope0;
        this.c = coroutineDispatcher0;
        this.d = pagedStorage0;
        this.e = pagedList$Config0;
        this.g = pagedList$Config0.prefetchDistance * 2 + pagedList$Config0.pageSize;
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public final void addWeakCallback(@NotNull Callback pagedList$Callback0) {
        Intrinsics.checkNotNullParameter(pagedList$Callback0, "callback");
        o.removeAll(this.h, s0.w);
        WeakReference weakReference0 = new WeakReference(pagedList$Callback0);
        this.h.add(weakReference0);
    }

    @Deprecated(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    public final void addWeakCallback(@Nullable List list0, @NotNull Callback pagedList$Callback0) {
        Intrinsics.checkNotNullParameter(pagedList$Callback0, "callback");
        if(list0 != null && list0 != this) {
            PagedList.Companion.dispatchNaiveUpdatesSinceSnapshot$paging_common_release(this.size(), list0.size(), pagedList$Callback0);
        }
        this.addWeakCallback(pagedList$Callback0);
    }

    public final void addWeakLoadStateListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "listener");
        o.removeAll(this.i, a1.x);
        WeakReference weakReference0 = new WeakReference(function20);
        this.i.add(weakReference0);
        this.dispatchCurrentLoadState(function20);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @NotNull
    public static final PagedList create(@NotNull PagingSource pagingSource0, @Nullable Page pagingSource$LoadResult$Page0, @NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @Nullable BoundaryCallback pagedList$BoundaryCallback0, @NotNull Config pagedList$Config0, @Nullable Object object0) {
        return PagedList.Companion.create(pagingSource0, pagingSource$LoadResult$Page0, coroutineScope0, coroutineDispatcher0, coroutineDispatcher1, pagedList$BoundaryCallback0, pagedList$Config0, object0);
    }

    public abstract void detach();

    @RestrictTo({Scope.LIBRARY})
    public abstract void dispatchCurrentLoadState(@NotNull Function2 arg1);

    public final void dispatchStateChangeAsync$paging_common_release(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "type");
        Intrinsics.checkNotNullParameter(loadState0, "state");
        b1 b10 = new b1(this, loadType0, loadState0, null);
        BuildersKt.launch$default(this.b, this.c, null, b10, 2, null);
    }

    @Override
    @Nullable
    public Object get(int v) {
        return this.d.get(v);
    }

    @NotNull
    public final Config getConfig() {
        return this.e;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope$paging_common_release() {
        return this.b;
    }

    @NotNull
    public final DataSource getDataSource() {
        PagingSource pagingSource0 = this.getPagingSource();
        if(!(pagingSource0 instanceof LegacyPagingSource)) {
            throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + pagingSource0.getClass().getSimpleName() + " instead of a DataSource");
        }
        DataSource dataSource0 = ((LegacyPagingSource)pagingSource0).getDataSource$paging_common_release();
        Intrinsics.checkNotNull(dataSource0, "null cannot be cast to non-null type androidx.paging.DataSource<*, T of androidx.paging.PagedList>");
        return dataSource0;
    }

    @Deprecated(message = "DataSource is deprecated and has been replaced by PagingSource. PagedList offers indirect ways of controlling fetch (\'loadAround()\', \'retry()\') so that you should not need to access the DataSource/PagingSource.")
    public static void getDataSource$annotations() {
    }

    @Nullable
    public abstract Object getLastKey();

    public final int getLoadedCount() {
        return this.d.getDataCount();
    }

    @NotNull
    public final CoroutineDispatcher getNotifyDispatcher$paging_common_release() {
        return this.c;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public PagingSource getPagingSource() {
        return this.a;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final PlaceholderPaddedList getPlaceholderPaddedList() {
        return this.d;
    }

    public final int getPositionOffset() {
        return this.d.getPositionOffset();
    }

    @Nullable
    public final Runnable getRefreshRetryCallback$paging_common_release() {
        return this.f;
    }

    public final int getRequiredRemainder$paging_common_release() {
        return this.g;
    }

    public int getSize() {
        return this.d.size();
    }

    @NotNull
    public final PagedStorage getStorage$paging_common_release() {
        return this.d;
    }

    public abstract boolean isDetached();

    public boolean isImmutable() {
        return this.isDetached();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final int lastLoad() {
        return this.d.getLastLoadAroundIndex();
    }

    public final void loadAround(int v) {
        if(v >= 0 && v < this.size()) {
            this.d.setLastLoadAroundIndex(v);
            this.loadAroundInternal(v);
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.size());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @RestrictTo({Scope.LIBRARY})
    public abstract void loadAroundInternal(int arg1);

    @RestrictTo({Scope.LIBRARY})
    public final void notifyChanged(int v, int v1) {
        if(v1 == 0) {
            return;
        }
        for(Object object0: CollectionsKt___CollectionsKt.reversed(this.h)) {
            Callback pagedList$Callback0 = (Callback)((WeakReference)object0).get();
            if(pagedList$Callback0 != null) {
                pagedList$Callback0.onChanged(v, v1);
            }
        }
    }

    public final void notifyInserted$paging_common_release(int v, int v1) {
        if(v1 == 0) {
            return;
        }
        for(Object object0: CollectionsKt___CollectionsKt.reversed(this.h)) {
            Callback pagedList$Callback0 = (Callback)((WeakReference)object0).get();
            if(pagedList$Callback0 != null) {
                pagedList$Callback0.onInserted(v, v1);
            }
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public final void notifyRemoved(int v, int v1) {
        if(v1 == 0) {
            return;
        }
        for(Object object0: CollectionsKt___CollectionsKt.reversed(this.h)) {
            Callback pagedList$Callback0 = (Callback)((WeakReference)object0).get();
            if(pagedList$Callback0 != null) {
                pagedList$Callback0.onRemoved(v, v1);
            }
        }
    }

    @Override
    public final Object remove(int v) {
        return this.removeAt(v);
    }

    public Object removeAt(int v) {
        return super.remove(v);
    }

    public final void removeWeakCallback(@NotNull Callback pagedList$Callback0) {
        Intrinsics.checkNotNullParameter(pagedList$Callback0, "callback");
        t0 t00 = new t0(pagedList$Callback0);
        o.removeAll(this.h, t00);
    }

    public final void removeWeakLoadStateListener(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "listener");
        k1 k10 = new k1(function20, 3);
        o.removeAll(this.i, k10);
    }

    public void retry() {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setInitialLoadState(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(loadState0, "loadState");
    }

    public final void setRefreshRetryCallback$paging_common_release(@Nullable Runnable runnable0) {
        this.f = runnable0;
    }

    @RestrictTo({Scope.LIBRARY})
    public final void setRetryCallback(@Nullable Runnable runnable0) {
        this.f = runnable0;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @NotNull
    public final List snapshot() {
        return this.isImmutable() ? this : new SnapshotPagedList(this);
    }
}


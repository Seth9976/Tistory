package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00FC\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u00DA\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000B2\u00020\f2\u00020\r2\u00020\u000E2\u00020\u000F2\u00020\u00102\u00020\u0011:\n\u00DB\u0001\u00DC\u0001\u00DD\u0001\u00DE\u0001\u00DF\u0001B\u0007\u00A2\u0006\u0004\b\u0012\u0010\u0013B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0012\u0010\u0016J\u0019\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0014\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001D\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u0017H\u0015\u00A2\u0006\u0004\b\u001D\u0010\u001BJ\u000F\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u00A2\u0006\u0004\b\u001F\u0010 J\u0011\u0010!\u001A\u0004\u0018\u00010\u001EH\u0017\u00A2\u0006\u0004\b!\u0010 J\u0019\u0010#\u001A\u00020\u00192\b\b\u0001\u0010\"\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b#\u0010\u0016J\u0019\u0010#\u001A\u00020\u00192\b\u0010%\u001A\u0004\u0018\u00010$H\u0016\u00A2\u0006\u0004\b#\u0010&J#\u0010#\u001A\u00020\u00192\b\u0010%\u001A\u0004\u0018\u00010$2\b\u0010(\u001A\u0004\u0018\u00010\'H\u0016\u00A2\u0006\u0004\b#\u0010)J#\u0010*\u001A\u00020\u00192\b\u0010%\u001A\u0004\u0018\u00010$2\b\u0010(\u001A\u0004\u0018\u00010\'H\u0016\u00A2\u0006\u0004\b*\u0010)J\u000F\u0010+\u001A\u00020\u0019H\u0017\u00A2\u0006\u0004\b+\u0010\u0013J\u0011\u0010-\u001A\u0004\u0018\u00010,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0015\u00101\u001A\u00020\u00192\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\u0015\u00103\u001A\u00020\u00192\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b3\u00102J)\u00108\u001A\u0002072\u0006\u00104\u001A\u00020\u00142\b\u0010%\u001A\u0004\u0018\u00010$2\u0006\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\b8\u00109J\u001F\u0010:\u001A\u0002072\u0006\u00104\u001A\u00020\u00142\u0006\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\b:\u0010;J\u001F\u0010>\u001A\u0002072\u0006\u00104\u001A\u00020\u00142\u0006\u0010=\u001A\u00020<H\u0016\u00A2\u0006\u0004\b>\u0010?J\u001F\u0010@\u001A\u00020\u00192\u0006\u00104\u001A\u00020\u00142\u0006\u00106\u001A\u000205H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001A\u00020\u00192\u0006\u0010C\u001A\u00020BH\u0016\u00A2\u0006\u0004\bD\u0010EJ\u001F\u0010D\u001A\u00020\u00192\u0006\u0010C\u001A\u00020B2\u0006\u0010F\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\bD\u0010GJ\'\u0010D\u001A\u00020\u00192\u0006\u0010C\u001A\u00020B2\u0006\u0010F\u001A\u00020\u00032\u0006\u0010I\u001A\u00020HH\u0017\u00A2\u0006\u0004\bD\u0010JJ\u0017\u0010K\u001A\u00020\u00192\u0006\u0010C\u001A\u00020BH\u0016\u00A2\u0006\u0004\bK\u0010EJ\u000F\u0010L\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\bL\u0010\u0013J\u000F\u0010M\u001A\u00020\u0019H\u0017\u00A2\u0006\u0004\bM\u0010\u0013J\u001F\u0010Q\u001A\u00020\u00192\u0006\u0010O\u001A\u00020N2\u0006\u0010P\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\bQ\u0010RJ)\u0010Q\u001A\u00020\u00192\u0006\u0010O\u001A\u00020N2\u0006\u0010P\u001A\u00020\u00142\b\u0010S\u001A\u0004\u0018\u00010\u0017H\u0017\u00A2\u0006\u0004\bQ\u0010TJA\u0010Z\u001A\u00020\u00192\u0006\u0010O\u001A\u00020U2\u0006\u0010P\u001A\u00020\u00142\b\u0010V\u001A\u0004\u0018\u00010N2\u0006\u0010W\u001A\u00020\u00142\u0006\u0010X\u001A\u00020\u00142\u0006\u0010Y\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\bZ\u0010[JK\u0010Z\u001A\u00020\u00192\u0006\u0010O\u001A\u00020U2\u0006\u0010P\u001A\u00020\u00142\b\u0010V\u001A\u0004\u0018\u00010N2\u0006\u0010W\u001A\u00020\u00142\u0006\u0010X\u001A\u00020\u00142\u0006\u0010Y\u001A\u00020\u00142\b\u0010S\u001A\u0004\u0018\u00010\u0017H\u0017\u00A2\u0006\u0004\bZ\u0010\\J)\u0010_\u001A\u00020\u00192\u0006\u0010P\u001A\u00020\u00142\u0006\u0010]\u001A\u00020\u00142\b\u0010^\u001A\u0004\u0018\u00010NH\u0015\u00A2\u0006\u0004\b_\u0010`J-\u0010f\u001A\u00020\u00192\u0006\u0010P\u001A\u00020\u00142\f\u0010c\u001A\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010e\u001A\u00020dH\u0017\u00A2\u0006\u0004\bf\u0010gJI\u0010q\u001A\b\u0012\u0004\u0012\u00028\u00000p\"\u0004\b\u0000\u0010h\"\u0004\b\u0001\u0010i2\u0012\u0010k\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010j2\u0006\u0010m\u001A\u00020l2\f\u0010o\u001A\b\u0012\u0004\u0012\u00028\u00010n\u00A2\u0006\u0004\bq\u0010rJA\u0010q\u001A\b\u0012\u0004\u0012\u00028\u00000p\"\u0004\b\u0000\u0010h\"\u0004\b\u0001\u0010i2\u0012\u0010k\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010j2\f\u0010o\u001A\b\u0012\u0004\u0012\u00028\u00010n\u00A2\u0006\u0004\bq\u0010sJ\u0017\u0010v\u001A\u00020\u00192\u0006\u0010u\u001A\u00020tH\u0017\u00A2\u0006\u0004\bv\u0010wJ\u001B\u0010y\u001A\u00020\u00192\f\u00100\u001A\b\u0012\u0004\u0012\u00020t0x\u00A2\u0006\u0004\by\u0010zJ\u001B\u0010{\u001A\u00020\u00192\f\u00100\u001A\b\u0012\u0004\u0012\u00020t0x\u00A2\u0006\u0004\b{\u0010zJ\u0017\u0010}\u001A\u00020\u00192\u0006\u0010|\u001A\u00020\u0014H\u0017\u00A2\u0006\u0004\b}\u0010\u0016J\u001B\u0010~\u001A\u00020\u00192\f\u00100\u001A\b\u0012\u0004\u0012\u00020\u00140x\u00A2\u0006\u0004\b~\u0010zJ\u001B\u0010\u007F\u001A\u00020\u00192\f\u00100\u001A\b\u0012\u0004\u0012\u00020\u00140x\u00A2\u0006\u0004\b\u007F\u0010zJ\u001A\u0010\u0080\u0001\u001A\u00020\u00192\u0006\u0010O\u001A\u00020NH\u0015\u00A2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001D\u0010\u0082\u0001\u001A\u00020\u00192\f\u00100\u001A\b\u0012\u0004\u0012\u00020N0x\u00A2\u0006\u0005\b\u0082\u0001\u0010zJ\u001D\u0010\u0083\u0001\u001A\u00020\u00192\f\u00100\u001A\b\u0012\u0004\u0012\u00020N0x\u00A2\u0006\u0005\b\u0083\u0001\u0010zJ\u001B\u0010\u0085\u0001\u001A\u00020\u00192\u0007\u0010\u0084\u0001\u001A\u000207H\u0017\u00A2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J#\u0010\u0085\u0001\u001A\u00020\u00192\u0007\u0010\u0084\u0001\u001A\u0002072\u0006\u0010u\u001A\u00020tH\u0017\u00A2\u0006\u0006\b\u0085\u0001\u0010\u0087\u0001J\u001E\u0010\u0089\u0001\u001A\u00020\u00192\r\u00100\u001A\t\u0012\u0005\u0012\u00030\u0088\u00010x\u00A2\u0006\u0005\b\u0089\u0001\u0010zJ\u001E\u0010\u008A\u0001\u001A\u00020\u00192\r\u00100\u001A\t\u0012\u0005\u0012\u00030\u0088\u00010x\u00A2\u0006\u0005\b\u008A\u0001\u0010zJ\u001B\u0010\u008C\u0001\u001A\u00020\u00192\u0007\u0010\u008B\u0001\u001A\u000207H\u0017\u00A2\u0006\u0006\b\u008C\u0001\u0010\u0086\u0001J#\u0010\u008C\u0001\u001A\u00020\u00192\u0007\u0010\u008B\u0001\u001A\u0002072\u0006\u0010u\u001A\u00020tH\u0017\u00A2\u0006\u0006\b\u008C\u0001\u0010\u0087\u0001J\u001E\u0010\u008E\u0001\u001A\u00020\u00192\r\u00100\u001A\t\u0012\u0005\u0012\u00030\u008D\u00010x\u00A2\u0006\u0005\b\u008E\u0001\u0010zJ\u001E\u0010\u008F\u0001\u001A\u00020\u00192\r\u00100\u001A\t\u0012\u0005\u0012\u00030\u008D\u00010x\u00A2\u0006\u0005\b\u008F\u0001\u0010zJ\u0011\u0010\u0090\u0001\u001A\u00020\u0019H\u0015\u00A2\u0006\u0005\b\u0090\u0001\u0010\u0013J\u0019\u0010\u0092\u0001\u001A\u00020\u00192\u0007\u00100\u001A\u00030\u0091\u0001\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0019\u0010\u0094\u0001\u001A\u00020\u00192\u0007\u00100\u001A\u00030\u0091\u0001\u00A2\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001J\u0011\u0010\u0095\u0001\u001A\u00020\u0019H\u0016\u00A2\u0006\u0005\b\u0095\u0001\u0010\u0013R\u0018\u0010\u0097\u0001\u001A\u00030\u0096\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009A\u0001\u001A\u00030\u0099\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u009A\u0001\u0010\u009B\u0001R\u001F\u0010\u009D\u0001\u001A\u00030\u009C\u00018\u0002X\u0082\u0004\u00A2\u0006\u000F\n\u0006\b\u009D\u0001\u0010\u009E\u0001\u0012\u0005\b\u009F\u0001\u0010\u0013R\u001C\u0010\u00A1\u0001\u001A\u0005\u0018\u00010\u00A0\u00018\u0002@\u0002X\u0082\u000E\u00A2\u0006\b\n\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0018\u0010\u00A4\u0001\u001A\u00030\u00A3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00A4\u0001\u0010\u00A5\u0001R!\u0010\u00AB\u0001\u001A\u00030\u00A6\u00018VX\u0096\u0084\u0002\u00A2\u0006\u0010\n\u0006\b\u00A7\u0001\u0010\u00A8\u0001\u001A\u0006\b\u00A9\u0001\u0010\u00AA\u0001R\u0016\u0010\u0015\u001A\u00020\u00148\u0002@\u0002X\u0083\u000E\u00A2\u0006\u0006\n\u0004\b\u0015\u0010hR\u0018\u0010\u00AD\u0001\u001A\u00030\u00AC\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00AD\u0001\u0010\u00AE\u0001R\u001C\u0010\u00AF\u0001\u001A\u00020l8\u0006\u00A2\u0006\u0010\n\u0006\b\u00AF\u0001\u0010\u00B0\u0001\u001A\u0006\b\u00B1\u0001\u0010\u00B2\u0001R$\u0010\u00B4\u0001\u001A\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0x0\u00B3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00B4\u0001\u0010\u00B5\u0001R$\u0010\u00B6\u0001\u001A\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140x0\u00B3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00B6\u0001\u0010\u00B5\u0001R$\u0010\u00B7\u0001\u001A\u000F\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0x0\u00B3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00B7\u0001\u0010\u00B5\u0001R%\u0010\u00B8\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0005\u0012\u00030\u0088\u00010x0\u00B3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00B8\u0001\u0010\u00B5\u0001R%\u0010\u00B9\u0001\u001A\u0010\u0012\u000B\u0012\t\u0012\u0005\u0012\u00030\u008D\u00010x0\u00B3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00B9\u0001\u0010\u00B5\u0001R\u001F\u0010\u00BA\u0001\u001A\n\u0012\u0005\u0012\u00030\u0091\u00010\u00B3\u00018\u0002X\u0082\u0004\u00A2\u0006\b\n\u0006\b\u00BA\u0001\u0010\u00B5\u0001R\u0019\u0010\u00BB\u0001\u001A\u0002078\u0002@\u0002X\u0082\u000E\u00A2\u0006\b\n\u0006\b\u00BB\u0001\u0010\u00BC\u0001R\u0019\u0010\u00BD\u0001\u001A\u0002078\u0002@\u0002X\u0082\u000E\u00A2\u0006\b\n\u0006\b\u00BD\u0001\u0010\u00BC\u0001R!\u0010\u00C2\u0001\u001A\u00030\u00BE\u00018VX\u0096\u0084\u0002\u00A2\u0006\u0010\n\u0006\b\u00BF\u0001\u0010\u00A8\u0001\u001A\u0006\b\u00C0\u0001\u0010\u00C1\u0001R(\u0010\u00C8\u0001\u001A\u00030\u00C3\u00018FX\u0086\u0084\u0002\u00A2\u0006\u0017\n\u0006\b\u00C4\u0001\u0010\u00A8\u0001\u0012\u0005\b\u00C7\u0001\u0010\u0013\u001A\u0006\b\u00C5\u0001\u0010\u00C6\u0001R\u0018\u0010\u00CA\u0001\u001A\u0004\u0018\u00010\u001E8WX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00C9\u0001\u0010 R\u0018\u0010\u00CE\u0001\u001A\u00030\u00CB\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00CC\u0001\u0010\u00CD\u0001R\u0018\u0010\u00D1\u0001\u001A\u00030\u00A0\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00CF\u0001\u0010\u00D0\u0001R\u0018\u0010\u00D5\u0001\u001A\u00030\u00D2\u00018WX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00D3\u0001\u0010\u00D4\u0001R\u0015\u0010\u00D9\u0001\u001A\u00030\u00D6\u00018F\u00A2\u0006\b\u001A\u0006\b\u00D7\u0001\u0010\u00D8\u0001\u00A8\u0006\u00E0\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "Landroidx/activity/contextaware/ContextAware;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/core/content/OnConfigurationChangedProvider;", "Landroidx/core/content/OnTrimMemoryProvider;", "Landroidx/core/app/OnNewIntentProvider;", "Landroidx/core/app/OnMultiWindowModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/view/MenuHost;", "Landroidx/activity/FullyDrawnReporterOwner;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", "listener", "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", "provider", "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "owner", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/MultiWindowModeChangedInfo;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/PictureInPictureModeChangedInfo;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Landroidx/activity/contextaware/ContextAwareHelper;", "contextAwareHelper", "Landroidx/activity/contextaware/ContextAwareHelper;", "Landroidx/core/view/MenuHostHelper;", "menuHostHelper", "Landroidx/core/view/MenuHostHelper;", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "androidx/activity/f", "androidx/activity/g", "NonConfigurationInstances", "ReportFullyDrawnExecutor", "androidx/activity/i", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements FullyDrawnReporterOwner, OnBackPressedDispatcherOwner, ContextAware, ActivityResultCaller, ActivityResultRegistryOwner, OnMultiWindowModeChangedProvider, OnNewIntentProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, OnConfigurationChangedProvider, OnTrimMemoryProvider, MenuHost, HasDefaultViewModelProviderFactory, LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001A\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0012\u001A\u0004\u0018\u00010\u000B8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/activity/ComponentActivity$NonConfigurationInstances;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "getCustom", "()Ljava/lang/Object;", "setCustom", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/ViewModelStore;", "b", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class NonConfigurationInstances {
        public Object a;
        public ViewModelStore b;

        @Nullable
        public final Object getCustom() {
            return this.a;
        }

        @Nullable
        public final ViewModelStore getViewModelStore() {
            return this.b;
        }

        public final void setCustom(@Nullable Object object0) {
            this.a = object0;
        }

        public final void setViewModelStore(@Nullable ViewModelStore viewModelStore0) {
            this.b = viewModelStore0;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u0010\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "activityDestroyed", "", "viewCreated", "view", "Landroid/view/View;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    interface ReportFullyDrawnExecutor extends Executor {
        void activityDestroyed();

        void viewCreated(@NotNull View arg1);
    }

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    @NotNull
    private static final g Companion;
    @Nullable
    private ViewModelStore _viewModelStore;
    @NotNull
    private final ActivityResultRegistry activityResultRegistry;
    @LayoutRes
    private int contentLayoutId;
    @NotNull
    private final ContextAwareHelper contextAwareHelper;
    @NotNull
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    @NotNull
    private final Lazy fullyDrawnReporter$delegate;
    @NotNull
    private final MenuHostHelper menuHostHelper;
    @NotNull
    private final AtomicInteger nextLocalRequestCode;
    @NotNull
    private final Lazy onBackPressedDispatcher$delegate;
    @NotNull
    private final CopyOnWriteArrayList onConfigurationChangedListeners;
    @NotNull
    private final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    @NotNull
    private final CopyOnWriteArrayList onNewIntentListeners;
    @NotNull
    private final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    @NotNull
    private final CopyOnWriteArrayList onTrimMemoryListeners;
    @NotNull
    private final CopyOnWriteArrayList onUserLeaveHintListeners;
    @NotNull
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    @NotNull
    private final SavedStateRegistryController savedStateRegistryController;
    public static final int x;

    static {
        ComponentActivity.Companion = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ComponentActivity() {
        this.contextAwareHelper = new ContextAwareHelper();
        this.menuHostHelper = new MenuHostHelper(new a(this, 0));
        SavedStateRegistryController savedStateRegistryController0 = SavedStateRegistryController.Companion.create(this);
        this.savedStateRegistryController = savedStateRegistryController0;
        this.reportFullyDrawnExecutor = new i(this);
        this.fullyDrawnReporter$delegate = c.lazy(new l(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ActivityResultRegistry() {
            public static final int i;

            @Override  // androidx.activity.result.ActivityResultRegistry
            public void onLaunch(int v, @NotNull ActivityResultContract activityResultContract0, Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
                Bundle bundle2;
                Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
                ComponentActivity componentActivity0 = this.h;
                SynchronousResult activityResultContract$SynchronousResult0 = activityResultContract0.getSynchronousResult(componentActivity0, object0);
                if(activityResultContract$SynchronousResult0 != null) {
                    new Handler(Looper.getMainLooper()).post(new j(this, v, activityResultContract$SynchronousResult0, 0));
                    return;
                }
                Intent intent0 = activityResultContract0.createIntent(componentActivity0, object0);
                if(intent0.getExtras() != null) {
                    Bundle bundle0 = intent0.getExtras();
                    Intrinsics.checkNotNull(bundle0);
                    if(bundle0.getClassLoader() == null) {
                        intent0.setExtrasClassLoader(componentActivity0.getClassLoader());
                    }
                }
                if(intent0.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    Bundle bundle1 = intent0.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    intent0.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    bundle2 = bundle1;
                }
                else {
                    bundle2 = activityOptionsCompat0 == null ? null : activityOptionsCompat0.toBundle();
                }
                if(Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intent0.getAction())) {
                    String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if(arr_s == null) {
                        arr_s = new String[0];
                    }
                    ActivityCompat.requestPermissions(componentActivity0, arr_s, v);
                    return;
                }
                if(Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intent0.getAction())) {
                    IntentSenderRequest intentSenderRequest0 = (IntentSenderRequest)intent0.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        Intrinsics.checkNotNull(intentSenderRequest0);
                        ActivityCompat.startIntentSenderForResult(componentActivity0, intentSenderRequest0.getIntentSender(), v, intentSenderRequest0.getFillInIntent(), intentSenderRequest0.getFlagsMask(), intentSenderRequest0.getFlagsValues(), 0, bundle2);
                    }
                    catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                        new Handler(Looper.getMainLooper()).post(new j(this, v, intentSender$SendIntentException0, 1));
                    }
                    return;
                }
                ActivityCompat.startActivityForResult(componentActivity0, intent0, v, bundle2);
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList();
        this.onNewIntentListeners = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
        if(this.getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        this.getLifecycle().addObserver(new b(this, 0));
        this.getLifecycle().addObserver(new b(this, 1));
        this.getLifecycle().addObserver(new LifecycleEventObserver() {
            public final ComponentActivity a;

            {
                this.a = componentActivity0;
            }

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                ComponentActivity.access$ensureViewModelStore(this.a);
                this.a.getLifecycle().removeObserver(this);
            }
        });
        savedStateRegistryController0.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        this.getSavedStateRegistry().registerSavedStateProvider("android:support:activity-result", new androidx.activity.c(this, 0));
        this.addOnContextAvailableListener((Context context0) -> {
            Intrinsics.checkNotNullParameter(this, "this$0");
            Intrinsics.checkNotNullParameter(context0, "it");
            Bundle bundle0 = this.getSavedStateRegistry().consumeRestoredStateForKey("android:support:activity-result");
            if(bundle0 != null) {
                this.activityResultRegistry.onRestoreInstanceState(bundle0);
            }
        });
        this.defaultViewModelProviderFactory$delegate = c.lazy(new k(this, 0));
        this.onBackPressedDispatcher$delegate = c.lazy(new k(this, 2));
    }

    @ContentView
    public ComponentActivity(@LayoutRes int v) {
        this.contentLayoutId = v;
    }

    // 检测为 Lambda 实现
    public static void a(ComponentActivity componentActivity0, Context context0) [...]

    public static final void access$addObserverForBackInvoker(ComponentActivity componentActivity0, OnBackPressedDispatcher onBackPressedDispatcher0) {
        componentActivity0.getLifecycle().addObserver(new e(0, onBackPressedDispatcher0, componentActivity0));
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity0) {
        if(componentActivity0._viewModelStore == null) {
            NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)componentActivity0.getLastNonConfigurationInstance();
            if(componentActivity$NonConfigurationInstances0 != null) {
                componentActivity0._viewModelStore = componentActivity$NonConfigurationInstances0.getViewModelStore();
            }
            if(componentActivity0._viewModelStore == null) {
                componentActivity0._viewModelStore = new ViewModelStore();
            }
        }
    }

    @Override  // android.app.Activity
    public void addContentView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.initializeViewTreeOwners();
        View view1 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view1, "window.decorView");
        this.reportFullyDrawnExecutor.viewCreated(view1);
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // androidx.core.view.MenuHost
    public void addMenuProvider(@NotNull MenuProvider menuProvider0) {
        Intrinsics.checkNotNullParameter(menuProvider0, "provider");
        this.menuHostHelper.addMenuProvider(menuProvider0);
    }

    @Override  // androidx.core.view.MenuHost
    public void addMenuProvider(@NotNull MenuProvider menuProvider0, @NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(menuProvider0, "provider");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        this.menuHostHelper.addMenuProvider(menuProvider0, lifecycleOwner0);
    }

    @Override  // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull MenuProvider menuProvider0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull State lifecycle$State0) {
        Intrinsics.checkNotNullParameter(menuProvider0, "provider");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(lifecycle$State0, "state");
        this.menuHostHelper.addMenuProvider(menuProvider0, lifecycleOwner0, lifecycle$State0);
    }

    @Override  // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onConfigurationChangedListeners.add(consumer0);
    }

    @Override  // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener0) {
        Intrinsics.checkNotNullParameter(onContextAvailableListener0, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(onContextAvailableListener0);
    }

    @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onMultiWindowModeChangedListeners.add(consumer0);
    }

    @Override  // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onNewIntentListeners.add(consumer0);
    }

    @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onPictureInPictureModeChangedListeners.add(consumer0);
    }

    @Override  // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onTrimMemoryListeners.add(consumer0);
    }

    @Override  // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "listener");
        this.onUserLeaveHintListeners.add(runnable0);
    }

    public static void b(ComponentActivity componentActivity0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(componentActivity0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            componentActivity0.contextAwareHelper.clearAvailableContext();
            if(!componentActivity0.isChangingConfigurations()) {
                componentActivity0.getViewModelStore().clear();
            }
            componentActivity0.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    public static Bundle c(ComponentActivity componentActivity0) {
        Intrinsics.checkNotNullParameter(componentActivity0, "this$0");
        Bundle bundle0 = new Bundle();
        componentActivity0.activityResultRegistry.onSaveInstanceState(bundle0);
        return bundle0;
    }

    @Override  // androidx.activity.result.ActivityResultRegistryOwner
    @NotNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @CallSuper
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Bundle bundle0 = null;
        CreationExtras creationExtras0 = new MutableCreationExtras(null, 1, null);
        if(this.getApplication() != null) {
            Application application0 = this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application0, "application");
            ((MutableCreationExtras)creationExtras0).set(AndroidViewModelFactory.APPLICATION_KEY, application0);
        }
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            bundle0 = intent0.getExtras();
        }
        if(bundle0 != null) {
            ((MutableCreationExtras)creationExtras0).set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle0);
        }
        return creationExtras0;
    }

    @Override  // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public Factory getDefaultViewModelProviderFactory() {
        return (Factory)this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override  // androidx.activity.FullyDrawnReporterOwner
    @NotNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter)this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
        return componentActivity$NonConfigurationInstances0 == null ? null : componentActivity$NonConfigurationInstances0.getCustom();
    }

    @Override  // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override  // androidx.activity.OnBackPressedDispatcherOwner
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher)this.onBackPressedDispatcher$delegate.getValue();
    }

    public static void getOnBackPressedDispatcher$annotations() {
    }

    @Override  // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override  // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        if(this.getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
        }
        if(this._viewModelStore == null) {
            NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
            if(componentActivity$NonConfigurationInstances0 != null) {
                this._viewModelStore = componentActivity$NonConfigurationInstances0.getViewModelStore();
            }
            if(this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore0 = this._viewModelStore;
        Intrinsics.checkNotNull(viewModelStore0);
        return viewModelStore0;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        View view0 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        ViewTreeLifecycleOwner.set(view0, this);
        View view1 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view1, "window.decorView");
        ViewTreeViewModelStoreOwner.set(view1, this);
        View view2 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view2, "window.decorView");
        ViewTreeSavedStateRegistryOwner.set(view2, this);
        View view3 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view3, "window.decorView");
        ViewTreeOnBackPressedDispatcherOwner.set(view3, this);
        View view4 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view4, "window.decorView");
        ViewTreeFullyDrawnReporterOwner.set(view4, this);
    }

    @Override  // androidx.core.view.MenuHost
    public void invalidateMenu() {
        this.invalidateOptionsMenu();
    }

    @Override  // android.app.Activity
    @CallSuper
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        if(!this.activityResultRegistry.dispatchResult(v, v1, intent0)) {
            super.onActivityResult(v, v1, intent0);
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    @MainThread
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        this.getOnBackPressedDispatcher().onBackPressed();
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        for(Object object0: this.onConfigurationChangedListeners) {
            ((Consumer)object0).accept(configuration0);
        }
    }

    @Override  // androidx.core.app.ComponentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        this.savedStateRegistryController.performRestore(bundle0);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle0);
        ReportFragment.Companion.injectIfNeededIn(this);
        int v = this.contentLayoutId;
        if(v != 0) {
            this.setContentView(v);
        }
    }

    @Override  // android.app.Activity
    public boolean onCreatePanelMenu(int v, @NotNull Menu menu0) {
        Intrinsics.checkNotNullParameter(menu0, "menu");
        if(v == 0) {
            super.onCreatePanelMenu(0, menu0);
            MenuInflater menuInflater0 = this.getMenuInflater();
            this.menuHostHelper.onCreateMenu(menu0, menuInflater0);
        }
        return true;
    }

    @Override  // android.app.Activity
    public boolean onMenuItemSelected(int v, @NotNull MenuItem menuItem0) {
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 0 ? this.menuHostHelper.onMenuItemSelected(menuItem0) : false;
    }

    @Override  // android.app.Activity
    @CallSuper
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if(this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        for(Object object0: this.onMultiWindowModeChangedListeners) {
            ((Consumer)object0).accept(new MultiWindowModeChangedInfo(z));
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    @RequiresApi(api = 26)
    public void onMultiWindowModeChanged(boolean z, @NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration0);
        }
        finally {
            this.dispatchingOnMultiWindowModeChanged = false;
        }
        for(Object object0: this.onMultiWindowModeChangedListeners) {
            ((Consumer)object0).accept(new MultiWindowModeChangedInfo(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onNewIntent(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        super.onNewIntent(intent0);
        for(Object object0: this.onNewIntentListeners) {
            ((Consumer)object0).accept(intent0);
        }
    }

    @Override  // android.app.Activity
    public void onPanelClosed(int v, @NotNull Menu menu0) {
        Intrinsics.checkNotNullParameter(menu0, "menu");
        this.menuHostHelper.onMenuClosed(menu0);
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    @CallSuper
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if(this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        for(Object object0: this.onPictureInPictureModeChangedListeners) {
            ((Consumer)object0).accept(new PictureInPictureModeChangedInfo(z));
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    @RequiresApi(api = 26)
    public void onPictureInPictureModeChanged(boolean z, @NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration0);
        }
        finally {
            this.dispatchingOnPictureInPictureModeChanged = false;
        }
        for(Object object0: this.onPictureInPictureModeChangedListeners) {
            ((Consumer)object0).accept(new PictureInPictureModeChangedInfo(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    public boolean onPreparePanel(int v, @Nullable View view0, @NotNull Menu menu0) {
        Intrinsics.checkNotNullParameter(menu0, "menu");
        if(v == 0) {
            super.onPreparePanel(0, view0, menu0);
            this.menuHostHelper.onPrepareMenu(menu0);
        }
        return true;
    }

    @Override  // android.app.Activity
    @CallSuper
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int v, @NotNull String[] arr_s, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_s, "permissions");
        Intrinsics.checkNotNullParameter(arr_v, "grantResults");
        Intent intent0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", arr_v);
        if(!this.activityResultRegistry.dispatchResult(v, -1, intent0)) {
            super.onRequestPermissionsResult(v, arr_s, arr_v);
        }
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() [...] // Inlined contents

    @Override  // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        ViewModelStore viewModelStore0 = this._viewModelStore;
        if(viewModelStore0 == null) {
            NonConfigurationInstances componentActivity$NonConfigurationInstances0 = (NonConfigurationInstances)this.getLastNonConfigurationInstance();
            if(componentActivity$NonConfigurationInstances0 != null) {
                viewModelStore0 = componentActivity$NonConfigurationInstances0.getViewModelStore();
            }
        }
        if(viewModelStore0 == null) {
            return null;
        }
        NonConfigurationInstances componentActivity$NonConfigurationInstances1 = new NonConfigurationInstances();
        componentActivity$NonConfigurationInstances1.setCustom(null);
        componentActivity$NonConfigurationInstances1.setViewModelStore(viewModelStore0);
        return componentActivity$NonConfigurationInstances1;
    }

    @Override  // androidx.core.app.ComponentActivity
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        if(this.getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle0 = this.getLifecycle();
            Intrinsics.checkNotNull(lifecycle0, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry)lifecycle0).setCurrentState(State.CREATED);
        }
        super.onSaveInstanceState(bundle0);
        this.savedStateRegistryController.performSave(bundle0);
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onTrimMemory(int v) {
        super.onTrimMemory(v);
        for(Object object0: this.onTrimMemoryListeners) {
            ((Consumer)object0).accept(v);
        }
    }

    @Override  // android.app.Activity
    @CallSuper
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        for(Object object0: this.onUserLeaveHintListeners) {
            ((Runnable)object0).run();
        }
    }

    @Override  // androidx.activity.contextaware.ContextAware
    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @NotNull
    public final ActivityResultLauncher registerForActivityResult(@NotNull ActivityResultContract activityResultContract0, @NotNull ActivityResultCallback activityResultCallback0) {
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(activityResultCallback0, "callback");
        return this.registerForActivityResult(activityResultContract0, this.activityResultRegistry, activityResultCallback0);
    }

    @Override  // androidx.activity.result.ActivityResultCaller
    @NotNull
    public final ActivityResultLauncher registerForActivityResult(@NotNull ActivityResultContract activityResultContract0, @NotNull ActivityResultRegistry activityResultRegistry0, @NotNull ActivityResultCallback activityResultCallback0) {
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(activityResultRegistry0, "registry");
        Intrinsics.checkNotNullParameter(activityResultCallback0, "callback");
        return activityResultRegistry0.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, activityResultContract0, activityResultCallback0);
    }

    @Override  // androidx.core.view.MenuHost
    public void removeMenuProvider(@NotNull MenuProvider menuProvider0) {
        Intrinsics.checkNotNullParameter(menuProvider0, "provider");
        this.menuHostHelper.removeMenuProvider(menuProvider0);
    }

    @Override  // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onConfigurationChangedListeners.remove(consumer0);
    }

    @Override  // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener0) {
        Intrinsics.checkNotNullParameter(onContextAvailableListener0, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener0);
    }

    @Override  // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onMultiWindowModeChangedListeners.remove(consumer0);
    }

    @Override  // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onNewIntentListeners.remove(consumer0);
    }

    @Override  // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onPictureInPictureModeChangedListeners.remove(consumer0);
    }

    @Override  // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NotNull Consumer consumer0) {
        Intrinsics.checkNotNullParameter(consumer0, "listener");
        this.onTrimMemoryListeners.remove(consumer0);
    }

    @Override  // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "listener");
        this.onUserLeaveHintListeners.remove(runnable0);
    }

    @Override  // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if(Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.getFullyDrawnReporter().fullyDrawnReported();
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // android.app.Activity
    public void setContentView(@LayoutRes int v) {
        this.initializeViewTreeOwners();
        View view0 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        this.reportFullyDrawnExecutor.viewCreated(view0);
        super.setContentView(v);
    }

    @Override  // android.app.Activity
    public void setContentView(@Nullable View view0) {
        this.initializeViewTreeOwners();
        View view1 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view1, "window.decorView");
        this.reportFullyDrawnExecutor.viewCreated(view1);
        super.setContentView(view0);
    }

    @Override  // android.app.Activity
    public void setContentView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.initializeViewTreeOwners();
        View view1 = this.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view1, "window.decorView");
        this.reportFullyDrawnExecutor.viewCreated(view1);
        super.setContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent0, int v) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        super.startActivityForResult(intent0, v);
    }

    @Override  // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(@NotNull Intent intent0, int v, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        super.startActivityForResult(intent0, v, bundle0);
    }

    @Override  // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intentSender0, "intent");
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3);
    }

    @Override  // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(@NotNull IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intentSender0, "intent");
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }
}


package androidx.compose.ui.platform;

import aa.m;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.activity.c0;
import androidx.activity.h;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.material3.v6;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode.UsageByParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.NestedVectorStack;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner.OnLayoutCompletedListener;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00BE\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00C3\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u00C3\u0003\u00C4\u0003B\u0017\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ9\u0010\u0013\u001A\u00020\u000F2\'\u0010\u0012\u001A#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u00A2\u0006\u0002\b\u0011H\u0096@\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ-\u0010$\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u00152\u0006\u0010 \u001A\u00020\u001F2\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\"0!H\u0016\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020\u00172\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J#\u0010.\u001A\u0004\u0018\u00010*2\b\u0010+\u001A\u0004\u0018\u00010*2\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b.\u0010/J!\u00102\u001A\u0002012\u0006\u0010-\u001A\u00020,2\b\u00100\u001A\u0004\u0018\u00010\u0015H\u0016\u00A2\u0006\u0004\b2\u00103J)\u00105\u001A\u00020\u00172\u0006\u00104\u001A\u0002012\u0006\u0010-\u001A\u00020,2\b\u00100\u001A\u0004\u0018\u00010\u0015H\u0014\u00A2\u0006\u0004\b5\u00106J\u0017\u00108\u001A\u00020\u00172\u0006\u00107\u001A\u000201H\u0016\u00A2\u0006\u0004\b8\u00109J\u001A\u0010>\u001A\u0002012\u0006\u0010;\u001A\u00020:H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b<\u0010=J\u0017\u0010A\u001A\u0002012\u0006\u0010@\u001A\u00020?H\u0016\u00A2\u0006\u0004\bA\u0010=J\u0017\u0010B\u001A\u0002012\u0006\u0010@\u001A\u00020?H\u0016\u00A2\u0006\u0004\bB\u0010=J\u0017\u0010D\u001A\u00020\u00172\u0006\u0010C\u001A\u000201H\u0016\u00A2\u0006\u0004\bD\u00109J\u0017\u0010G\u001A\u00020\u00172\u0006\u0010F\u001A\u00020EH\u0016\u00A2\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001A\u00020\u00172\u0006\u0010J\u001A\u00020IH\u0016\u00A2\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001A\u00020\u00172\u0006\u0010J\u001A\u00020IH\u0016\u00A2\u0006\u0004\bM\u0010LJ\r\u0010N\u001A\u00020\u0017\u00A2\u0006\u0004\bN\u0010OJ\u000F\u0010P\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bP\u0010OJ\u001D\u0010S\u001A\u00020\u00172\f\u0010R\u001A\b\u0012\u0004\u0012\u00020\u00170QH\u0016\u00A2\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001A\u00020\u00172\b\u0010U\u001A\u0004\u0018\u00010*H\u0016\u00A2\u0006\u0004\bV\u0010WJ!\u0010V\u001A\u00020\u00172\b\u0010U\u001A\u0004\u0018\u00010*2\u0006\u0010X\u001A\u00020,H\u0016\u00A2\u0006\u0004\bV\u0010YJ)\u0010V\u001A\u00020\u00172\b\u0010U\u001A\u0004\u0018\u00010*2\u0006\u0010Z\u001A\u00020,2\u0006\u0010[\u001A\u00020,H\u0016\u00A2\u0006\u0004\bV\u0010\\J#\u0010V\u001A\u00020\u00172\b\u0010U\u001A\u0004\u0018\u00010*2\b\u0010^\u001A\u0004\u0018\u00010]H\u0016\u00A2\u0006\u0004\bV\u0010_J+\u0010V\u001A\u00020\u00172\b\u0010U\u001A\u0004\u0018\u00010*2\u0006\u0010X\u001A\u00020,2\b\u0010^\u001A\u0004\u0018\u00010]H\u0016\u00A2\u0006\u0004\bV\u0010`J\u001D\u0010d\u001A\u00020\u00172\u0006\u0010b\u001A\u00020a2\u0006\u0010c\u001A\u00020I\u00A2\u0006\u0004\bd\u0010eJ\u0015\u0010f\u001A\u00020\u00172\u0006\u0010b\u001A\u00020a\u00A2\u0006\u0004\bf\u0010gJ\u001D\u0010j\u001A\u00020\u00172\u0006\u0010b\u001A\u00020a2\u0006\u0010i\u001A\u00020h\u00A2\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001A\u00020\u00172\u0006\u0010l\u001A\u000201H\u0016\u00A2\u0006\u0004\bm\u00109J\"\u0010m\u001A\u00020\u00172\u0006\u0010c\u001A\u00020I2\u0006\u0010o\u001A\u00020nH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bp\u0010qJ\u001F\u0010s\u001A\u00020\u00172\u0006\u0010c\u001A\u00020I2\u0006\u0010r\u001A\u000201H\u0016\u00A2\u0006\u0004\bs\u0010tJ/\u0010w\u001A\u00020\u00172\u0006\u0010c\u001A\u00020I2\u0006\u0010r\u001A\u0002012\u0006\u0010u\u001A\u0002012\u0006\u0010v\u001A\u000201H\u0016\u00A2\u0006\u0004\bw\u0010xJ\'\u0010y\u001A\u00020\u00172\u0006\u0010c\u001A\u00020I2\u0006\u0010r\u001A\u0002012\u0006\u0010u\u001A\u000201H\u0016\u00A2\u0006\u0004\by\u0010zJ\u0017\u0010{\u001A\u00020\u00172\u0006\u0010c\u001A\u00020IH\u0016\u00A2\u0006\u0004\b{\u0010LJ\u000F\u0010|\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b|\u0010OJ \u0010\u007F\u001A\u00020\u00172\u0006\u0010}\u001A\u00020,2\u0006\u0010~\u001A\u00020,H\u0014\u00A2\u0006\u0005\b\u007F\u0010\u0080\u0001J?\u0010\u0086\u0001\u001A\u00020\u00172\u0007\u0010\u0081\u0001\u001A\u0002012\u0007\u0010\u0082\u0001\u001A\u00020,2\u0007\u0010\u0083\u0001\u001A\u00020,2\u0007\u0010\u0084\u0001\u001A\u00020,2\u0007\u0010\u0085\u0001\u001A\u00020,H\u0014\u00A2\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001A\u0010\u0088\u0001\u001A\u00020\u00172\u0006\u0010i\u001A\u00020hH\u0014\u00A2\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001Jp\u0010\u0093\u0001\u001A\u00030\u0092\u00012@\u0010\u008F\u0001\u001A;\u0012\u0016\u0012\u00140\u008A\u0001\u00A2\u0006\u000E\b\u008B\u0001\u0012\t\b\u008C\u0001\u0012\u0004\b\b(i\u0012\u0019\u0012\u0017\u0018\u00010\u008D\u0001\u00A2\u0006\u000F\b\u008B\u0001\u0012\n\b\u008C\u0001\u0012\u0005\b\b(\u008E\u0001\u0012\u0004\u0012\u00020\u00170\f2\r\u0010\u0090\u0001\u001A\b\u0012\u0004\u0012\u00020\u00170Q2\n\u0010\u0091\u0001\u001A\u0005\u0018\u00010\u008D\u0001H\u0016\u00A2\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001C\u0010\u0098\u0001\u001A\u0002012\b\u0010\u0095\u0001\u001A\u00030\u0092\u0001H\u0000\u00A2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0099\u0001\u001A\u00020\u0017H\u0016\u00A2\u0006\u0005\b\u0099\u0001\u0010OJ\u0019\u0010\u009A\u0001\u001A\u00020\u00172\u0006\u0010c\u001A\u00020IH\u0016\u00A2\u0006\u0005\b\u009A\u0001\u0010LJ\u001E\u0010\u009C\u0001\u001A\u00020\u00172\u000B\u0010b\u001A\u00070*j\u0003`\u009B\u0001H\u0016\u00A2\u0006\u0005\b\u009C\u0001\u0010WJ\u001B\u0010\u009E\u0001\u001A\u00020\u00172\u0007\u0010R\u001A\u00030\u009D\u0001H\u0016\u00A2\u0006\u0006\b\u009E\u0001\u0010\u009F\u0001J \u0010\u00A3\u0001\u001A\u0005\u0018\u00010\u00A0\u00012\u0006\u0010;\u001A\u00020:H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u00A1\u0001\u0010\u00A2\u0001J\u001A\u0010\u00A4\u0001\u001A\u00020\u00172\u0006\u0010i\u001A\u00020hH\u0014\u00A2\u0006\u0006\b\u00A4\u0001\u0010\u0089\u0001J%\u0010\u00A8\u0001\u001A\u00020\u00172\b\u0010\u0095\u0001\u001A\u00030\u0092\u00012\u0007\u0010\u00A5\u0001\u001A\u000201H\u0000\u00A2\u0006\u0006\b\u00A6\u0001\u0010\u00A7\u0001J\'\u0010\u00AC\u0001\u001A\u00020\u00172\u0015\u0010\u00AB\u0001\u001A\u0010\u0012\u0005\u0012\u00030\u00AA\u0001\u0012\u0004\u0012\u00020\u00170\u00A9\u0001\u00A2\u0006\u0006\b\u00AC\u0001\u0010\u00AD\u0001J\u0013\u0010\u00AE\u0001\u001A\u00020\u0017H\u0086@\u00A2\u0006\u0006\b\u00AE\u0001\u0010\u00AF\u0001J\u0013\u0010\u00B0\u0001\u001A\u00020\u0017H\u0086@\u00A2\u0006\u0006\b\u00B0\u0001\u0010\u00AF\u0001J\u0011\u0010\u00B1\u0001\u001A\u00020\u0017H\u0016\u00A2\u0006\u0005\b\u00B1\u0001\u0010OJ\u0011\u0010\u00B2\u0001\u001A\u00020\u0017H\u0014\u00A2\u0006\u0005\b\u00B2\u0001\u0010OJ\u0011\u0010\u00B3\u0001\u001A\u00020\u0017H\u0014\u00A2\u0006\u0005\b\u00B3\u0001\u0010OJ%\u0010\u00B5\u0001\u001A\u00020\u00172\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\u0007\u0010\u00B4\u0001\u001A\u00020,H\u0016\u00A2\u0006\u0006\b\u00B5\u0001\u0010\u00B6\u0001J#\u0010\u00BA\u0001\u001A\u00020\u00172\u000F\u0010\u00B9\u0001\u001A\n\u0012\u0005\u0012\u00030\u00B8\u00010\u00B7\u0001H\u0016\u00A2\u0006\u0006\b\u00BA\u0001\u0010\u00BB\u0001J8\u0010\u00C2\u0001\u001A\u00020\u00172\b\u0010\u00BD\u0001\u001A\u00030\u00BC\u00012\b\u0010\u00BF\u0001\u001A\u00030\u00BE\u00012\u0010\u0010\u00C1\u0001\u001A\u000B\u0012\u0007\u0012\u0005\u0018\u00010\u00C0\u00010!H\u0017\u00A2\u0006\u0006\b\u00C2\u0001\u0010\u00C3\u0001J%\u0010\u00C7\u0001\u001A\u00020\u00172\u0011\u0010\u00C6\u0001\u001A\f\u0012\u0007\u0012\u0005\u0018\u00010\u00C5\u00010\u00C4\u0001H\u0017\u00A2\u0006\u0006\b\u00C7\u0001\u0010\u00C8\u0001J\u001C\u0010\u00CB\u0001\u001A\u0002012\b\u0010\u00CA\u0001\u001A\u00030\u00C9\u0001H\u0016\u00A2\u0006\u0006\b\u00CB\u0001\u0010\u00CC\u0001J\u001C\u0010\u00CD\u0001\u001A\u0002012\b\u0010\u00CA\u0001\u001A\u00030\u00C9\u0001H\u0016\u00A2\u0006\u0006\b\u00CD\u0001\u0010\u00CC\u0001J\u001A\u0010\u00CE\u0001\u001A\u0002012\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0006\b\u00CE\u0001\u0010\u00CF\u0001J\u001A\u0010\u00D0\u0001\u001A\u0002012\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0006\b\u00D0\u0001\u0010\u00CF\u0001J \u0010\u00D5\u0001\u001A\u00030\u00D1\u00012\b\u0010\u00D2\u0001\u001A\u00030\u00D1\u0001H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u00D3\u0001\u0010\u00D4\u0001J\u001F\u0010\u00D5\u0001\u001A\u00020\u00172\b\u0010\u00D7\u0001\u001A\u00030\u00D6\u0001H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u00D8\u0001\u0010\u00D9\u0001J \u0010\u00DC\u0001\u001A\u00030\u00D1\u00012\b\u0010\u00DA\u0001\u001A\u00030\u00D1\u0001H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u00DB\u0001\u0010\u00D4\u0001J\u0012\u0010\u00DD\u0001\u001A\u000201H\u0016\u00A2\u0006\u0006\b\u00DD\u0001\u0010\u00DE\u0001J\u001F\u0010\u00E2\u0001\u001A\u0005\u0018\u00010\u00E1\u00012\b\u0010\u00E0\u0001\u001A\u00030\u00DF\u0001H\u0016\u00A2\u0006\u0006\b\u00E2\u0001\u0010\u00E3\u0001J \u0010\u00E6\u0001\u001A\u00030\u00D1\u00012\b\u0010\u00E4\u0001\u001A\u00030\u00D1\u0001H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u00E5\u0001\u0010\u00D4\u0001J \u0010\u00E8\u0001\u001A\u00030\u00D1\u00012\b\u0010\u00D2\u0001\u001A\u00030\u00D1\u0001H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u00E7\u0001\u0010\u00D4\u0001J\u001C\u0010\u00EB\u0001\u001A\u00020\u00172\b\u0010\u00EA\u0001\u001A\u00030\u00E9\u0001H\u0014\u00A2\u0006\u0006\b\u00EB\u0001\u0010\u00EC\u0001J\u001B\u0010\u00EE\u0001\u001A\u00020\u00172\u0007\u0010\u00ED\u0001\u001A\u00020,H\u0016\u00A2\u0006\u0006\b\u00EE\u0001\u0010\u00EF\u0001J\u001B\u0010\u00F0\u0001\u001A\u0002012\u0007\u0010@\u001A\u00030\u00C9\u0001H\u0016\u00A2\u0006\u0006\b\u00F0\u0001\u0010\u00CC\u0001J\u001B\u0010\u00F2\u0001\u001A\u0004\u0018\u00010*2\u0007\u0010\u00F1\u0001\u001A\u00020,\u00A2\u0006\u0006\b\u00F2\u0001\u0010\u00F3\u0001J\u0012\u0010\u00F4\u0001\u001A\u000201H\u0016\u00A2\u0006\u0006\b\u00F4\u0001\u0010\u00DE\u0001R \u0010\u00FA\u0001\u001A\u00030\u00F5\u00018\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00F6\u0001\u0010\u00F7\u0001\u001A\u0006\b\u00F8\u0001\u0010\u00F9\u0001R5\u0010\u0083\u0002\u001A\u00030\u00FB\u00012\b\u0010\u00FC\u0001\u001A\u00030\u00FB\u00018V@RX\u0096\u008E\u0002\u00A2\u0006\u0018\n\u0006\b\u00FD\u0001\u0010\u00FE\u0001\u001A\u0006\b\u00FF\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R \u0010\u0089\u0002\u001A\u00030\u0084\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001A\u0006\b\u0087\u0002\u0010\u0088\u0002R1\u0010\t\u001A\u00020\b2\u0007\u0010\u008A\u0002\u001A\u00020\b8\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u008B\u0002\u0010\u008C\u0002\u001A\u0006\b\u008D\u0002\u0010\u008E\u0002\"\u0006\b\u008F\u0002\u0010\u0090\u0002R \u0010\u0096\u0002\u001A\u00030\u0091\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001A\u0006\b\u0094\u0002\u0010\u0095\u0002R\u001F\u0010\u009A\u0002\u001A\u00020I8\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0097\u0002\u001A\u0006\b\u0098\u0002\u0010\u0099\u0002R \u0010\u00A0\u0002\u001A\u00030\u009B\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u009C\u0002\u0010\u009D\u0002\u001A\u0006\b\u009E\u0002\u0010\u009F\u0002R \u0010\u00A6\u0002\u001A\u00030\u00A1\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00A2\u0002\u0010\u00A3\u0002\u001A\u0006\b\u00A4\u0002\u0010\u00A5\u0002R*\u0010\u00AE\u0002\u001A\u00030\u00A7\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00A8\u0002\u0010\u00A9\u0002\u001A\u0006\b\u00AA\u0002\u0010\u00AB\u0002\"\u0006\b\u00AC\u0002\u0010\u00AD\u0002R \u0010\u00B4\u0002\u001A\u00030\u00AF\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00B0\u0002\u0010\u00B1\u0002\u001A\u0006\b\u00B2\u0002\u0010\u00B3\u0002R \u0010\u00B9\u0002\u001A\u00030\u00B5\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u00B6\u0002\u001A\u0006\b\u00B7\u0002\u0010\u00B8\u0002R \u0010\u00BF\u0002\u001A\u00030\u00BA\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00BB\u0002\u0010\u00BC\u0002\u001A\u0006\b\u00BD\u0002\u0010\u00BE\u0002R7\u0010\u00C5\u0002\u001A\u0010\u0012\u0005\u0012\u00030\u00E9\u0001\u0012\u0004\u0012\u00020\u00170\u00A9\u00018\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0018\n\u0006\b\u00C0\u0002\u0010\u00C1\u0002\u001A\u0006\b\u00C2\u0002\u0010\u00C3\u0002\"\u0006\b\u00C4\u0002\u0010\u00AD\u0001R \u0010\u00CB\u0002\u001A\u00030\u00C6\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00C7\u0002\u0010\u00C8\u0002\u001A\u0006\b\u00C9\u0002\u0010\u00CA\u0002R \u0010\u00D1\u0002\u001A\u00030\u00CC\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00CD\u0002\u0010\u00CE\u0002\u001A\u0006\b\u00CF\u0002\u0010\u00D0\u0002R/\u0010\u00D7\u0002\u001A\u0002018\u0016@\u0016X\u0096\u000E\u00A2\u0006\u001E\n\u0006\b\u00D2\u0002\u0010\u00D3\u0002\u0012\u0005\b\u00D6\u0002\u0010O\u001A\u0006\b\u00D4\u0002\u0010\u00DE\u0001\"\u0005\b\u00D5\u0002\u00109R \u0010\u00DD\u0002\u001A\u00030\u00D8\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00D9\u0002\u0010\u00DA\u0002\u001A\u0006\b\u00DB\u0002\u0010\u00DC\u0002R/\u0010\u00E4\u0002\u001A\u00020E8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u001E\n\u0006\b\u00DE\u0002\u0010\u00DF\u0002\u0012\u0005\b\u00E3\u0002\u0010O\u001A\u0006\b\u00E0\u0002\u0010\u00E1\u0002\"\u0005\b\u00E2\u0002\u0010HR9\u0010\u00EA\u0002\u001A\u0005\u0018\u00010\u00AA\u00012\n\u0010\u00FC\u0001\u001A\u0005\u0018\u00010\u00AA\u00018B@BX\u0082\u008E\u0002\u00A2\u0006\u0018\n\u0006\b\u00E5\u0002\u0010\u00FE\u0001\u001A\u0006\b\u00E6\u0002\u0010\u00E7\u0002\"\u0006\b\u00E8\u0002\u0010\u00E9\u0002R#\u0010\u00EE\u0002\u001A\u0005\u0018\u00010\u00AA\u00018FX\u0086\u0084\u0002\u00A2\u0006\u0010\n\u0006\b\u00EB\u0002\u0010\u00EC\u0002\u001A\u0006\b\u00ED\u0002\u0010\u00E7\u0002R \u0010\u00F4\u0002\u001A\u00030\u00EF\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00F0\u0002\u0010\u00F1\u0002\u001A\u0006\b\u00F2\u0002\u0010\u00F3\u0002R \u0010\u00FA\u0002\u001A\u00030\u00F5\u00028\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00F6\u0002\u0010\u00F7\u0002\u001A\u0006\b\u00F8\u0002\u0010\u00F9\u0002R\'\u0010\u0081\u0003\u001A\u00030\u00FB\u00028\u0016X\u0097\u0004\u00A2\u0006\u0017\n\u0006\b\u00FC\u0002\u0010\u00FD\u0002\u0012\u0005\b\u0080\u0003\u0010O\u001A\u0006\b\u00FE\u0002\u0010\u00FF\u0002R5\u0010\u0088\u0003\u001A\u00030\u0082\u00032\b\u0010\u00FC\u0001\u001A\u00030\u0082\u00038V@RX\u0096\u008E\u0002\u00A2\u0006\u0018\n\u0006\b\u0083\u0003\u0010\u00FE\u0001\u001A\u0006\b\u0084\u0003\u0010\u0085\u0003\"\u0006\b\u0086\u0003\u0010\u0087\u0003R5\u0010\u00ED\u0001\u001A\u00030\u0089\u00032\b\u0010\u00FC\u0001\u001A\u00030\u0089\u00038V@RX\u0096\u008E\u0002\u00A2\u0006\u0018\n\u0006\b\u008A\u0003\u0010\u00FE\u0001\u001A\u0006\b\u008B\u0003\u0010\u008C\u0003\"\u0006\b\u008D\u0003\u0010\u008E\u0003R \u0010\u0094\u0003\u001A\u00030\u008F\u00038\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u0090\u0003\u0010\u0091\u0003\u001A\u0006\b\u0092\u0003\u0010\u0093\u0003R \u0010\u009A\u0003\u001A\u00030\u0095\u00038\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u0096\u0003\u0010\u0097\u0003\u001A\u0006\b\u0098\u0003\u0010\u0099\u0003R \u0010\u00A0\u0003\u001A\u00030\u009B\u00038\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u009C\u0003\u0010\u009D\u0003\u001A\u0006\b\u009E\u0003\u0010\u009F\u0003R \u0010\u00A6\u0003\u001A\u00030\u00A1\u00038\u0016X\u0096\u0004\u00A2\u0006\u0010\n\u0006\b\u00A2\u0003\u0010\u00A3\u0003\u001A\u0006\b\u00A4\u0003\u0010\u00A5\u0003R\u0016\u0010b\u001A\u00020*8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00A7\u0003\u0010\u00A8\u0003R\u0018\u0010\u00AC\u0003\u001A\u00030\u00A9\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00AA\u0003\u0010\u00AB\u0003R\u001A\u0010\u00BA\u0001\u001A\u0005\u0018\u00010\u00AD\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00AE\u0003\u0010\u00AF\u0003R\u0018\u0010\u00B3\u0003\u001A\u00030\u00B0\u00038@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00B1\u0003\u0010\u00B2\u0003R\u0017\u0010\u00B5\u0003\u001A\u00020E8VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00B4\u0003\u0010\u00E1\u0002R\u0017\u0010\u00B7\u0003\u001A\u0002018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00B6\u0003\u0010\u00DE\u0001R\u0018\u0010\u00BB\u0003\u001A\u00030\u00B8\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00B9\u0003\u0010\u00BA\u0003R\u0018\u0010\u00BF\u0003\u001A\u00030\u00BC\u00038VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00BD\u0003\u0010\u00BE\u0003R\u0017\u0010\u00C1\u0003\u001A\u0002018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00C0\u0003\u0010\u00DE\u0001R\u0017\u0010\u00C2\u0003\u001A\u0002018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u00C2\u0003\u0010\u00DE\u0001\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u00C5\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "session", "textInputSession", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rect", "", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "localVisibleRect", "Landroid/graphics/Point;", "windowOffset", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "onScrollCaptureSearch", "(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onResume", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroid/view/View;", "focused", "", "direction", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "previouslyFocusedRect", "", "requestFocus", "(ILandroid/graphics/Rect;)Z", "gainFocus", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendKeyEvent", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "dispatchKeyEventPreIme", "enable", "forceAccessibilityForTesting", "", "intervalMillis", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "onAttach", "(Landroidx/compose/ui/node/LayoutNode;)V", "onDetach", "requestClearInvalidObservations", "()V", "onEndApplyChanges", "Lkotlin/Function0;", "listener", "registerOnEndApplyChangesListener", "(Lkotlin/jvm/functions/Function0;)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "addAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V", "removeAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "Landroid/graphics/Canvas;", "canvas", "drawAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "affectsLookahead", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "forceRequest", "scheduleMeasureAndLayout", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "onRequestRelayout", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "requestOnPositionedCallback", "measureAndLayoutForTest", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "drawBlock", "invalidateParentLayer", "explicitLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Landroidx/compose/ui/node/OwnedLayer;", "layer", "recycle$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;)Z", "recycle", "onSemanticsChange", "onLayoutChange", "Landroidx/compose/ui/viewinterop/InteropView;", "onInteropViewLayoutChange", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "dispatchDraw", "isDirty", "notifyLayerIsDirty$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;Z)V", "notifyLayerIsDirty", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "boundsUpdatesContentCaptureEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesAccessibilityEventLoop", "invalidateDescendants", "onAttachedToWindow", "onDetachedFromWindow", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "Landroid/view/MotionEvent;", "motionEvent", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "dispatchTouchEvent", "canScrollHorizontally", "(I)Z", "canScrollVertically", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localToScreen", "Landroidx/compose/ui/graphics/Matrix;", "localTransform", "localToScreen-58bKbWc", "([F)V", "positionOnScreen", "screenToLocal-MK-Hz9U", "screenToLocal", "onCheckIsTextEditor", "()Z", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "calculatePositionInWindow-MK-Hz9U", "calculatePositionInWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "accessibilityId", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "shouldDelayChildPressedState", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "c", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/unit/Density;", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/focus/FocusOwner;", "e", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "value", "f", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "setCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "g", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/RootForTest;", "m", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/semantics/SemanticsOwner;", "n", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "p", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "getContentCaptureManager$ui_release", "()Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "setContentCaptureManager$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "q", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/ui/autofill/AutofillTree;", "s", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "z", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "configurationChangeObserver", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "C", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "D", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "E", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/ViewConfiguration;", "K", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Q", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "U", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "_viewTreeOwners", "V", "Landroidx/compose/runtime/State;", "getViewTreeOwners", "viewTreeOwners", "Landroidx/compose/ui/text/input/TextInputService;", "e0", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "g0", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "h0", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "i0", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "k0", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "l0", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "n0", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/TextToolbar;", "o0", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/input/pointer/PointerIconService;", "A0", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "isLifecycleInResumedState", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 12 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 13 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 14 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 15 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 16 DebugUtils.kt\nandroidx/compose/ui/platform/DebugUtilsKt\n+ 17 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2769:1\n1382#1,4:2883\n1382#1,4:2887\n1208#2:2770\n1187#2,2:2771\n1208#2:2821\n1187#2,2:2822\n81#3:2773\n107#3,2:2774\n81#3:2853\n107#3,2:2854\n81#3:2856\n81#3:2857\n107#3,2:2858\n81#3:2860\n107#3,2:2861\n82#4:2776\n292#5:2777\n104#5:2778\n105#5,15:2786\n432#5,6:2801\n442#5,2:2808\n444#5,8:2813\n452#5,9:2824\n461#5,8:2836\n121#5,8:2844\n42#6,7:2779\n66#6,9:2927\n66#6,9:2936\n264#7:2807\n245#8,3:2810\n248#8,3:2833\n1#9:2852\n26#10:2863\n26#10:2864\n26#10:2865\n26#10:2866\n523#11:2867\n728#11,2:2868\n460#11,11:2902\n460#11,11:2914\n26#12,5:2870\n26#12,5:2875\n26#12,3:2880\n30#12:2891\n26#12,5:2947\n57#13,4:2892\n47#14,5:2896\n203#15:2901\n203#15:2913\n20#16,2:2925\n20#16,2:2945\n217#17,6:2952\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView\n*L\n1356#1:2883,4\n1357#1:2887,4\n692#1:2770\n692#1:2771,2\n286#1:2821\n286#1:2822,2\n251#1:2773\n251#1:2774,2\n541#1:2853\n541#1:2854,2\n550#1:2856\n612#1:2857\n612#1:2858,2\n626#1:2860\n626#1:2861,2\n286#1:2776\n286#1:2777\n286#1:2778\n286#1:2786,15\n286#1:2801,6\n286#1:2808,2\n286#1:2813,8\n286#1:2824,9\n286#1:2836,8\n286#1:2844,8\n286#1:2779,7\n1712#1:2927,9\n1729#1:2936,9\n286#1:2807\n286#1:2810,3\n286#1:2833,3\n802#1:2863\n803#1:2864\n804#1:2865\n805#1:2866\n1015#1:2867\n1028#1:2868,2\n1646#1:2902,11\n1654#1:2914,11\n1271#1:2870,5\n1284#1:2875,5\n1352#1:2880,3\n1352#1:2891\n1855#1:2947,5\n1424#1:2892,4\n1562#1:2896,5\n1646#1:2901\n1654#1:2913\n1667#1:2925,2\n1734#1:2945,2\n1989#1:2952,6\n*E\n"})
public final class AndroidComposeView extends ViewGroup implements PositionCalculator, Owner, ViewRootForTest, DefaultLifecycleObserver {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001C\u0010\u0006\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final boolean access$getIsShowingLayoutBounds(Companion androidComposeView$Companion0) {
            Boolean boolean0 = null;
            androidComposeView$Companion0.getClass();
            try {
                if(AndroidComposeView.B0 == null) {
                    AndroidComposeView.B0 = Class.forName("android.os.SystemProperties");
                    Class class0 = AndroidComposeView.B0;
                    AndroidComposeView.C0 = class0 == null ? null : class0.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method0 = AndroidComposeView.C0;
                Object object0 = method0 == null ? null : method0.invoke(null, "debug.layout", Boolean.FALSE);
                if(object0 instanceof Boolean) {
                    boolean0 = (Boolean)object0;
                }
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            catch(Exception unused_ex) {
            }
            return false;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "a", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "b", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        public final LifecycleOwner a;
        public final SavedStateRegistryOwner b;

        public ViewTreeOwners(@NotNull LifecycleOwner lifecycleOwner0, @NotNull SavedStateRegistryOwner savedStateRegistryOwner0) {
            this.a = lifecycleOwner0;
            this.b = savedStateRegistryOwner0;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.a;
        }

        @NotNull
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.b;
        }
    }

    public static final int $stable;
    public final AndroidAutofill A;
    public final androidx.compose.ui.platform.AndroidComposeView.pointerIconService.1 A0;
    public boolean B;
    public static Class B0;
    public final AndroidClipboardManager C;
    public static Method C0;
    @NotNull
    public static final Companion Companion;
    public final OwnerSnapshotObserver D;
    public boolean E;
    public AndroidViewsHandler F;
    public DrawChildContainer G;
    public Constraints H;
    public boolean I;
    public final MeasureAndLayoutDelegate J;
    public final AndroidViewConfiguration K;
    public long L;
    public final int[] M;
    public final float[] N;
    public final float[] O;
    public final float[] P;
    public long Q;
    public boolean R;
    public long S;
    public boolean T;
    public final MutableState U;
    public final State V;
    public Function1 W;
    public long a;
    public final b a0;
    public final boolean b;
    public final c b0;
    public final LayoutNodeDrawScope c;
    public final d c0;
    public final MutableState d;
    public final TextInputServiceAndroid d0;
    public final FocusOwnerImpl e;
    public final TextInputService e0;
    public CoroutineContext f;
    public final AtomicReference f0;
    public final z0 g;
    public final DelegatingSoftwareKeyboardController g0;
    public final WindowInfoImpl h;
    public final AndroidFontResourceLoader h0;
    public final Modifier i;
    public final MutableState i0;
    public final Modifier j;
    public int j0;
    public final CanvasHolder k;
    public final MutableState k0;
    public final LayoutNode l;
    public final PlatformHapticFeedback l0;
    public final AndroidComposeView m;
    public final InputModeManagerImpl m0;
    public final SemanticsOwner n;
    public final ModifierLocalManager n0;
    public final AndroidComposeViewAccessibilityDelegateCompat o;
    public final AndroidTextToolbar o0;
    public AndroidContentCaptureManager p;
    public MotionEvent p0;
    public final AndroidAccessibilityManager q;
    public long q0;
    public final GraphicsContext r;
    public final WeakCache r0;
    public final AutofillTree s;
    public final MutableVector s0;
    public final ArrayList t;
    public final androidx.compose.ui.platform.AndroidComposeView.resendMotionEventRunnable.1 t0;
    public ArrayList u;
    public final h u0;
    public boolean v;
    public boolean v0;
    public boolean w;
    public final a2.b w0;
    public final MotionEventAdapter x;
    public final CalculateMatrixToWindow x0;
    public final PointerInputEventProcessor y;
    public boolean y0;
    public Function1 z;
    public final ScrollCapture z0;

    static {
        AndroidComposeView.Companion = new Companion(null);
        AndroidComposeView.$stable = 8;
    }

    public AndroidComposeView(@NotNull Context context0, @NotNull CoroutineContext coroutineContext0) {
        super(context0);
        this.a = 0x7FC000007FC00000L;
        this.b = true;
        this.c = new LayoutNodeDrawScope(null, 1, null);
        this.d = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context0), SnapshotStateKt.referentialEqualityPolicy());
        EmptySemanticsModifier emptySemanticsModifier0 = new EmptySemanticsModifier();
        EmptySemanticsElement emptySemanticsElement0 = new EmptySemanticsElement(emptySemanticsModifier0);
        this.e = new FocusOwnerImpl(new androidx.compose.ui.platform.h(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 0), new i(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 0), new androidx.compose.ui.platform.h(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0, 1), new c0(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 5), new c0(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 6), new j(0, this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        z0 z00 = new z0(new g(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
        this.f = coroutineContext0;
        this.g = z00;
        this.h = new WindowInfoImpl();
        l l0 = new l(this);
        Modifier modifier0 = KeyInputModifierKt.onKeyEvent(Modifier.Companion, l0);
        this.i = modifier0;
        Modifier modifier1 = RotaryInputModifierKt.onRotaryScrollEvent(Modifier.Companion, f.A);
        this.j = modifier1;
        this.k = new CanvasHolder();
        LayoutNode layoutNode0 = new LayoutNode(false, 0, 3, null);
        layoutNode0.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode0.setDensity(this.getDensity());
        layoutNode0.setModifier(emptySemanticsElement0.then(modifier1).then(modifier0).then(this.getFocusOwner().getModifier()).then(z00.d));
        this.l = layoutNode0;
        this.m = this;
        this.n = new SemanticsOwner(this.getRoot(), emptySemanticsModifier0);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.o = androidComposeViewAccessibilityDelegateCompat0;
        this.p = new AndroidContentCaptureManager(this, new c0(0, this, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        this.q = new AndroidAccessibilityManager(context0);
        this.r = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.s = new AutofillTree();
        this.t = new ArrayList();
        this.x = new MotionEventAdapter();
        this.y = new PointerInputEventProcessor(this.getRoot());
        this.z = f.y;
        this.A = new AndroidAutofill(this, this.getAutofillTree());
        this.C = new AndroidClipboardManager(context0);
        this.D = new OwnerSnapshotObserver(new n(this, 0));
        this.J = new MeasureAndLayoutDelegate(this.getRoot());
        this.K = new AndroidViewConfiguration(ViewConfiguration.get(context0));
        this.L = 0x7FFFFFFF7FFFFFFFL;
        this.M = new int[]{0, 0};
        float[] arr_f = Matrix.constructor-impl$default(null, 1, null);
        this.N = arr_f;
        this.O = Matrix.constructor-impl$default(null, 1, null);
        this.P = Matrix.constructor-impl$default(null, 1, null);
        this.Q = -1L;
        this.S = 0x7F8000007F800000L;
        this.T = true;
        this.U = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.V = SnapshotStateKt.derivedStateOf(new p(this));
        this.a0 = new b(this, 0);
        this.b0 = new c(this);
        this.c0 = new d(this);
        TextInputServiceAndroid textInputServiceAndroid0 = new TextInputServiceAndroid(this, this);
        this.d0 = textInputServiceAndroid0;
        this.e0 = new TextInputService(((PlatformTextInputService)AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid0)));
        this.f0 = SessionMutex.constructor-impl();
        this.g0 = new DelegatingSoftwareKeyboardController(this.getTextInputService());
        this.h0 = new AndroidFontResourceLoader(context0);
        this.i0 = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context0), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration0 = context0.getResources().getConfiguration();
        int v = Build.VERSION.SDK_INT;
        this.j0 = v < 0x1F ? 0 : a.a(configuration0);
        LayoutDirection layoutDirection0 = FocusInteropUtils_androidKt.toLayoutDirection(context0.getResources().getConfiguration().getLayoutDirection());
        if(layoutDirection0 == null) {
            layoutDirection0 = LayoutDirection.Ltr;
        }
        this.k0 = SnapshotStateKt.mutableStateOf$default(layoutDirection0, null, 2, null);
        this.l0 = new PlatformHapticFeedback(this);
        this.m0 = new InputModeManagerImpl((this.isInTouchMode() ? 1 : 2), new e(this), null);
        this.n0 = new ModifierLocalManager(this);
        this.o0 = new AndroidTextToolbar(this);
        this.r0 = new WeakCache();
        this.s0 = new MutableVector(new Function0[16], 0);
        this.t0 = new Runnable() {
            public final AndroidComposeView a;

            {
                this.a = androidComposeView0;
            }

            @Override
            public void run() {
                boolean z = false;
                this.a.removeCallbacks(this);
                MotionEvent motionEvent0 = this.a.p0;
                if(motionEvent0 != null) {
                    if(motionEvent0.getToolType(0) == 3) {
                        z = true;
                    }
                    int v = motionEvent0.getActionMasked();
                    if(z) {
                        if(v != 1 && v != 10) {
                            AndroidComposeView.access$sendSimulatedEvent(this.a, motionEvent0, (v == 7 || v == 9 ? 7 : 2), this.a.q0, false);
                        }
                    }
                    else if(v != 1) {
                        AndroidComposeView.access$sendSimulatedEvent(this.a, motionEvent0, (v == 7 || v == 9 ? 7 : 2), this.a.q0, false);
                    }
                }
            }
        };
        this.u0 = new h(this, 3);
        this.w0 = new a2.b(this, 13);
        p0 p00 = v < 29 ? new p0(arr_f) : new q0();
        this.x0 = p00;
        this.addOnAttachStateChangeListener(this.p);
        this.setWillNotDraw(false);
        this.setFocusable(true);
        g0.a.a(this, 1, false);
        this.setFocusableInTouchMode(true);
        this.setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat0);
        Function1 function10 = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if(function10 != null) {
            function10.invoke(this);
        }
        this.setOnDragListener(z00);
        this.getRoot().attach$ui_release(this);
        if(v >= 29) {
            androidx.compose.ui.platform.c0.a.a(this);
        }
        this.z0 = v < 0x1F ? null : new ScrollCapture();
        this.A0 = new PointerIconService() {
            public PointerIcon a;
            public final AndroidComposeView b;

            {
                this.b = androidComposeView0;
                this.a = PointerIcon.Companion.getDefault();
            }

            @Override  // androidx.compose.ui.input.pointer.PointerIconService
            @NotNull
            public PointerIcon getIcon() {
                return this.a;
            }

            @Override  // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(@Nullable PointerIcon pointerIcon0) {
                if(pointerIcon0 == null) {
                    pointerIcon0 = PointerIcon.Companion.getDefault();
                }
                this.a = pointerIcon0;
                f0.a.a(this.b, pointerIcon0);
            }
        };
    }

    public static void a(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof AndroidComposeView) {
                ((AndroidComposeView)view0).onEndApplyChanges();
            }
            else if(view0 instanceof ViewGroup) {
                AndroidComposeView.a(((ViewGroup)view0));
            }
        }
    }

    public static final void access$addExtraDataToAccessibilityNodeInfoHelper(AndroidComposeView androidComposeView0, int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = androidComposeView0.o;
        if(Intrinsics.areEqual(s, androidComposeViewAccessibilityDelegateCompat0.getExtraDataTestTraversalBeforeVal$ui_release())) {
            int v1 = androidComposeViewAccessibilityDelegateCompat0.getIdToBeforeMap$ui_release().getOrDefault(v, -1);
            if(v1 != -1) {
                accessibilityNodeInfo0.getExtras().putInt(s, v1);
            }
        }
        else if(Intrinsics.areEqual(s, androidComposeViewAccessibilityDelegateCompat0.getExtraDataTestTraversalAfterVal$ui_release())) {
            int v2 = androidComposeViewAccessibilityDelegateCompat0.getIdToAfterMap$ui_release().getOrDefault(v, -1);
            if(v2 != -1) {
                accessibilityNodeInfo0.getExtras().putInt(s, v2);
            }
        }
    }

    public static final View access$findNextNonChildView(AndroidComposeView androidComposeView0, int v) {
        androidComposeView0.getClass();
        View view0 = androidComposeView0;
        while(view0 != null) {
            FocusFinder focusFinder0 = FocusFinder.getInstance();
            View view1 = androidComposeView0.getRootView();
            Intrinsics.checkNotNull(view1, "null cannot be cast to non-null type android.view.ViewGroup");
            view0 = focusFinder0.findNextFocus(((ViewGroup)view1), view0, v);
            if(view0 != null && !AndroidComposeView_androidKt.access$containsDescendant(androidComposeView0, view0)) {
                return view0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final void access$onClearFocusForOwner(AndroidComposeView androidComposeView0) {
        if(androidComposeView0.isFocused() || androidComposeView0.hasFocus()) {
            androidComposeView0.clearFocus();
        }
    }

    public static final boolean access$onMoveFocusInChildren-3ESFkO8(AndroidComposeView androidComposeView0, int v) {
        androidComposeView0.getClass();
        if(!FocusDirection.equals-impl0(v, 7) && !FocusDirection.equals-impl0(v, 8)) {
            Integer integer0 = FocusInteropUtils_androidKt.toAndroidFocusDirection-3ESFkO8(v);
            if(integer0 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int v1 = integer0.intValue();
            Rect rect0 = androidComposeView0.j();
            android.graphics.Rect rect1 = rect0 == null ? null : RectHelper_androidKt.toAndroidRect(rect0);
            FocusFinder focusFinder0 = FocusFinder.getInstance();
            View view0 = rect1 == null ? focusFinder0.findNextFocus(androidComposeView0, androidComposeView0.findFocus(), v1) : focusFinder0.findNextFocusFromRect(androidComposeView0, rect1, v1);
            return view0 == null ? false : FocusInteropUtils_androidKt.requestInteropFocus(view0, v1, rect1);
        }
        return false;
    }

    public static final boolean access$onRequestFocusForOwner-7o62pno(AndroidComposeView androidComposeView0, FocusDirection focusDirection0, Rect rect0) {
        if(!androidComposeView0.isFocused() && !androidComposeView0.hasFocus()) {
            if(focusDirection0 != null) {
                Integer integer0 = FocusInteropUtils_androidKt.toAndroidFocusDirection-3ESFkO8(focusDirection0.unbox-impl());
                if(integer0 != null) {
                    int v = (int)integer0;
                    return rect0 == null ? androidComposeView0.super.requestFocus(v, null) : androidComposeView0.super.requestFocus(v, RectHelper_androidKt.toAndroidRect(rect0));
                }
            }
            return rect0 == null ? androidComposeView0.super.requestFocus(130, null) : androidComposeView0.super.requestFocus(130, RectHelper_androidKt.toAndroidRect(rect0));
        }
        return true;
    }

    public static final void access$sendSimulatedEvent(AndroidComposeView androidComposeView0, MotionEvent motionEvent0, int v, long v1, boolean z) {
        androidComposeView0.o(motionEvent0, v, v1, z);
    }

    public static final boolean access$startDrag-12SF9DM(AndroidComposeView androidComposeView0, DragAndDropTransferData dragAndDropTransferData0, long v, Function1 function10) {
        Resources resources0 = androidComposeView0.getContext().getResources();
        ComposeDragShadowBuilder composeDragShadowBuilder0 = new ComposeDragShadowBuilder(DensityKt.Density(resources0.getDisplayMetrics().density, resources0.getConfiguration().fontScale), v, function10, null);
        return d0.a.a(androidComposeView0, dragAndDropTransferData0, composeDragShadowBuilder0);
    }

    public final void addAndroidView(@NotNull AndroidViewHolder androidViewHolder0, @NotNull LayoutNode layoutNode0) {
        this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder0, layoutNode0);
        this.getAndroidViewsHandler$ui_release().addView(androidViewHolder0);
        this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode0, androidViewHolder0);
        androidViewHolder0.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder0, new AccessibilityDelegateCompat() {
            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NotNull View view0, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfoCompat0);
                AndroidComposeView androidComposeView0 = layoutNode0;
                if(androidComposeView0.o.isEnabled$ui_release()) {
                    accessibilityNodeInfoCompat0.setVisibleToUser(false);
                }
                LayoutNode layoutNode0 = this;
                LayoutNode layoutNode1 = SemanticsNodeKt.findClosestParentNode(layoutNode0, f.x);
                Integer integer0 = layoutNode1 == null ? null : layoutNode1.getSemanticsId();
                if(integer0 == null || ((int)integer0) == androidComposeView0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                    integer0 = -1;
                }
                AndroidComposeView androidComposeView1 = this.f;
                accessibilityNodeInfoCompat0.setParent(androidComposeView1, ((int)integer0));
                int v = layoutNode0.getSemanticsId();
                int v1 = androidComposeView0.o.getIdToBeforeMap$ui_release().getOrDefault(v, -1);
                if(v1 != -1) {
                    View view1 = SemanticsUtils_androidKt.semanticsIdToView(androidComposeView0.getAndroidViewsHandler$ui_release(), v1);
                    if(view1 == null) {
                        accessibilityNodeInfoCompat0.setTraversalBefore(androidComposeView1, v1);
                    }
                    else {
                        accessibilityNodeInfoCompat0.setTraversalBefore(view1);
                    }
                    AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(androidComposeView0, v, accessibilityNodeInfoCompat0.unwrap(), androidComposeView0.o.getExtraDataTestTraversalBeforeVal$ui_release());
                }
                int v2 = androidComposeView0.o.getIdToAfterMap$ui_release().getOrDefault(v, -1);
                if(v2 != -1) {
                    View view2 = SemanticsUtils_androidKt.semanticsIdToView(androidComposeView0.getAndroidViewsHandler$ui_release(), v2);
                    if(view2 == null) {
                        accessibilityNodeInfoCompat0.setTraversalAfter(androidComposeView1, v2);
                    }
                    else {
                        accessibilityNodeInfoCompat0.setTraversalAfter(view2);
                    }
                    AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(androidComposeView0, v, accessibilityNodeInfoCompat0.unwrap(), androidComposeView0.o.getExtraDataTestTraversalAfterVal$ui_release());
                }
            }
        });
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0) {
        this.addView(view0, -1);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, int v) {
        Intrinsics.checkNotNull(view0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
        }
        this.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
        viewGroup$LayoutParams0.width = v;
        viewGroup$LayoutParams0.height = v1;
        this.addView(view0, -1, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, int v, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.addViewInLayout(view0, v, viewGroup$LayoutParams0, true);
    }

    @Override  // android.view.ViewGroup
    public void addView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.addView(view0, -1, viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void autofill(@NotNull SparseArray sparseArray0) {
        AndroidAutofill androidAutofill0 = this.A;
        if(androidAutofill0 != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill0, sparseArray0);
        }
    }

    public static long b(int v) {
        int v1 = View.MeasureSpec.getMode(v);
        int v2 = View.MeasureSpec.getSize(v);
        switch(v1) {
            case 0x80000000: {
                return AndroidComposeView.k(0, v2);
            }
            case 0: {
                return 0x7FFFFFFFL;
            }
            default: {
                if(v1 != 0x40000000) {
                    throw new IllegalStateException();
                }
                return AndroidComposeView.k(v2, v2);
            }
        }
    }

    @Nullable
    public final Object boundsUpdatesAccessibilityEventLoop(@NotNull Continuation continuation0) {
        Object object0 = this.o.boundsUpdatesEventLoop$ui_release(continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object boundsUpdatesContentCaptureEventLoop(@NotNull Continuation continuation0) {
        Object object0 = this.p.boundsUpdatesEventLoop$ui_release(continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static View c(int v, View view0) {
        if(Build.VERSION.SDK_INT < 29) {
            Method method0 = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            method0.setAccessible(true);
            if(Intrinsics.areEqual(method0.invoke(view0, null), v)) {
                return view0;
            }
            if(view0 instanceof ViewGroup) {
                int v1 = ((ViewGroup)view0).getChildCount();
                for(int v2 = 0; v2 < v1; ++v2) {
                    View view1 = AndroidComposeView.c(v, ((ViewGroup)view0).getChildAt(v2));
                    if(view1 != null) {
                        return view1;
                    }
                }
            }
        }
        return null;
    }

    @Override  // androidx.compose.ui.node.Owner
    public long calculateLocalPosition-MK-Hz9U(long v) {
        this.l();
        return Matrix.map-MK-Hz9U(this.P, v);
    }

    @Override  // androidx.compose.ui.node.Owner
    public long calculatePositionInWindow-MK-Hz9U(long v) {
        this.l();
        return Matrix.map-MK-Hz9U(this.O, v);
    }

    @Override  // android.view.View
    public boolean canScrollHorizontally(int v) {
        return this.o.canScroll-0AR0LA0$ui_release(false, v, this.a);
    }

    @Override  // android.view.View
    public boolean canScrollVertically(int v) {
        return this.o.canScroll-0AR0LA0$ui_release(true, v, this.a);
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public OwnedLayer createLayer(@NotNull Function2 function20, @NotNull Function0 function00, @Nullable GraphicsLayer graphicsLayer0) {
        if(graphicsLayer0 != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer0, null, this, function20, function00);
        }
        OwnedLayer ownedLayer0 = (OwnedLayer)this.r0.pop();
        if(ownedLayer0 != null) {
            ownedLayer0.reuseLayer(function20, function00);
            return ownedLayer0;
        }
        if(this.isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new GraphicsLayerOwnerLayer(this.getGraphicsContext().createGraphicsLayer(), this.getGraphicsContext(), this, function20, function00);
        }
        if(this.isHardwareAccelerated() && this.T) {
            try {
                return new RenderNodeLayer(this, function20, function00);
            }
            catch(Throwable unused_ex) {
                this.T = false;
            }
        }
        if(this.G == null) {
            ViewLayer.Companion.updateDisplayList(new View(this.getContext()));
            DrawChildContainer drawChildContainer0 = new ViewLayerContainer(this.getContext());
            this.G = drawChildContainer0;
            this.addView(drawChildContainer0);
        }
        DrawChildContainer drawChildContainer1 = this.G;
        Intrinsics.checkNotNull(drawChildContainer1);
        return new ViewLayer(this, drawChildContainer1, function20, function00);
    }

    public final int d(MotionEvent motionEvent0) {
        int v6;
        this.removeCallbacks(this.t0);
        try {
            this.Q = AnimationUtils.currentAnimationTimeMillis();
            this.x0.calculateMatrixToWindow-EL8BTi8(this, this.O);
            InvertMatrixKt.invertTo-JiSxe2E(this.O, this.P);
            long v = OffsetKt.Offset(motionEvent0.getX(), motionEvent0.getY());
            long v1 = Matrix.map-MK-Hz9U(this.O, v);
            this.S = OffsetKt.Offset(motionEvent0.getRawX() - Offset.getX-impl(v1), motionEvent0.getRawY() - Offset.getY-impl(v1));
            boolean z = true;
            this.R = true;
            this.measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int v3 = motionEvent0.getActionMasked();
                MotionEvent motionEvent1 = this.p0;
                boolean z1 = motionEvent1 == null || motionEvent1.getToolType(0) != 3 ? false : true;
                PointerInputEventProcessor pointerInputEventProcessor0 = this.y;
                if(motionEvent1 != null && (motionEvent1.getSource() != motionEvent0.getSource() || motionEvent1.getToolType(0) != motionEvent0.getToolType(0))) {
                    if(motionEvent1.getButtonState() == 0) {
                        switch(motionEvent1.getActionMasked()) {
                            case 0: 
                            case 2: 
                            case 6: {
                                pointerInputEventProcessor0.processCancel();
                                break;
                            }
                            default: {
                                if(motionEvent1.getActionMasked() != 10 && z1) {
                                    this.o(motionEvent1, 10, motionEvent1.getEventTime(), true);
                                }
                            }
                        }
                    }
                    else {
                        pointerInputEventProcessor0.processCancel();
                    }
                }
                if(!z1 && motionEvent0.getToolType(0) == 3 && (v3 != 3 && v3 != 9) && this.h(motionEvent0)) {
                    this.o(motionEvent0, 9, motionEvent0.getEventTime(), true);
                }
                if(motionEvent1 != null) {
                    motionEvent1.recycle();
                }
                if(this.p0 != null && this.p0.getAction() == 10) {
                    int v4 = this.p0 == null ? -1 : this.p0.getPointerId(0);
                    int v5 = motionEvent0.getAction();
                    MotionEventAdapter motionEventAdapter0 = this.x;
                    if(v5 != 9 || motionEvent0.getHistorySize() != 0) {
                        if(motionEvent0.getAction() == 0 && motionEvent0.getHistorySize() == 0) {
                            float f = NaNf;
                            float f1 = this.p0 == null ? NaNf : this.p0.getX();
                            MotionEvent motionEvent2 = this.p0;
                            if(motionEvent2 != null) {
                                f = motionEvent2.getY();
                            }
                            boolean z2 = f1 != motionEvent0.getX() || f != motionEvent0.getY();
                            if((this.p0 == null ? -1L : this.p0.getEventTime()) == motionEvent0.getEventTime()) {
                                z = false;
                            }
                            if(z2 || z) {
                                if(v4 >= 0) {
                                    motionEventAdapter0.endStream(v4);
                                }
                                pointerInputEventProcessor0.clearPreviouslyHitModifierNodes();
                            }
                        }
                    }
                    else if(v4 >= 0) {
                        motionEventAdapter0.endStream(v4);
                    }
                }
                this.p0 = MotionEvent.obtainNoHistory(motionEvent0);
                v6 = this.n(motionEvent0);
            }
            finally {
                Trace.endSection();
            }
            this.R = false;
            return v6;
        }
        catch(Throwable throwable0) {
            this.R = false;
            throw throwable0;
        }
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NotNull Canvas canvas0) {
        if(!this.isAttachedToWindow()) {
            AndroidComposeView.e(this.getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.sendApplyNotifications();
        this.v = true;
        this.k.getAndroidCanvas().setInternalCanvas(canvas0);
        this.getRoot().draw$ui_release(this.k.getAndroidCanvas(), null);
        this.k.getAndroidCanvas().setInternalCanvas(this.k.getAndroidCanvas().getInternalCanvas());
        ArrayList arrayList0 = this.t;
        if(!arrayList0.isEmpty()) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((OwnedLayer)arrayList0.get(v1)).updateDisplayList();
            }
        }
        if(ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int v2 = canvas0.save();
            canvas0.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas0);
            canvas0.restoreToCount(v2);
        }
        arrayList0.clear();
        this.v = false;
        ArrayList arrayList1 = this.u;
        if(arrayList1 != null) {
            Intrinsics.checkNotNull(arrayList1);
            arrayList0.addAll(arrayList1);
            arrayList1.clear();
        }
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent motionEvent0) {
        if(this.v0) {
            h h0 = this.u0;
            this.removeCallbacks(h0);
            if(motionEvent0.getActionMasked() == 8) {
                this.v0 = false;
            }
            else {
                h0.run();
            }
        }
        if(motionEvent0.getActionMasked() == 8 && (!AndroidComposeView.g(motionEvent0) && this.isAttachedToWindow())) {
            if(motionEvent0.isFromSource(0x400000)) {
                ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
                float f = motionEvent0.getAxisValue(26);
                return this.getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration0, this.getContext()) * -f, ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration0, this.getContext()) * -f, motionEvent0.getEventTime(), motionEvent0.getDeviceId()));
            }
            return ProcessResult.getDispatchedToAPointerInputModifier-impl(this.d(motionEvent0));
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchHoverEvent(@NotNull MotionEvent motionEvent0) {
        h h0 = this.u0;
        if(this.v0) {
            this.removeCallbacks(h0);
            h0.run();
        }
        if(!AndroidComposeView.g(motionEvent0) && this.isAttachedToWindow()) {
            this.o.dispatchHoverEvent$ui_release(motionEvent0);
            switch(motionEvent0.getActionMasked()) {
                case 7: {
                    return this.i(motionEvent0) ? ProcessResult.getDispatchedToAPointerInputModifier-impl(this.d(motionEvent0)) : false;
                }
                case 10: {
                    if(this.h(motionEvent0)) {
                        if(motionEvent0.getToolType(0) == 3 && motionEvent0.getButtonState() != 0) {
                            return false;
                        }
                        MotionEvent motionEvent1 = this.p0;
                        if(motionEvent1 != null) {
                            motionEvent1.recycle();
                        }
                        this.p0 = MotionEvent.obtainNoHistory(motionEvent0);
                        this.v0 = true;
                        this.postDelayed(h0, 8L);
                        return false;
                    }
                    return ProcessResult.getDispatchedToAPointerInputModifier-impl(this.d(motionEvent0));
                }
                default: {
                    return ProcessResult.getDispatchedToAPointerInputModifier-impl(this.d(motionEvent0));
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent0) {
        if(this.isFocused()) {
            int v = PointerKeyboardModifiers.constructor-impl(keyEvent0.getMetaState());
            this.h.setKeyboardModifiers-5xRPYO0(v);
            return FocusOwner.dispatchKeyEvent-YhN2O0w$default(this.getFocusOwner(), keyEvent0, null, 2, null) || super.dispatchKeyEvent(keyEvent0);
        }
        return this.getFocusOwner().dispatchKeyEvent-YhN2O0w(keyEvent0, new m(6, this, keyEvent0));
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEventPreIme(@NotNull KeyEvent keyEvent0) {
        return this.isFocused() && this.getFocusOwner().dispatchInterceptedSoftKeyboardEvent-ZmokQxo(keyEvent0) || super.dispatchKeyEventPreIme(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public void dispatchProvideStructure(@NotNull ViewStructure viewStructure0) {
        if(Build.VERSION.SDK_INT < 28) {
            b0.a.a(viewStructure0, this);
            return;
        }
        super.dispatchProvideStructure(viewStructure0);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent0) {
        if(this.v0) {
            h h0 = this.u0;
            this.removeCallbacks(h0);
            MotionEvent motionEvent1 = this.p0;
            Intrinsics.checkNotNull(motionEvent1);
            if(motionEvent0.getActionMasked() != 0 || motionEvent1.getSource() != motionEvent0.getSource() || motionEvent1.getToolType(0) != motionEvent0.getToolType(0)) {
                h0.run();
            }
            else {
                this.v0 = false;
            }
        }
        if(AndroidComposeView.g(motionEvent0) || !this.isAttachedToWindow() || motionEvent0.getActionMasked() == 2 && !this.i(motionEvent0)) {
            return false;
        }
        int v = this.d(motionEvent0);
        if(ProcessResult.getAnyMovementConsumed-impl(v)) {
            this.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.getDispatchedToAPointerInputModifier-impl(v);
    }

    public final void drawAndroidView(@NotNull AndroidViewHolder androidViewHolder0, @NotNull Canvas canvas0) {
        this.getAndroidViewsHandler$ui_release().drawView(androidViewHolder0, canvas0);
    }

    public static void e(LayoutNode layoutNode0) {
        layoutNode0.invalidateLayers$ui_release();
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                AndroidComposeView.e(((LayoutNode)arr_object[v1]));
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void f(LayoutNode layoutNode0) {
        int v = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.J, layoutNode0, false, 2, null);
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                this.f(((LayoutNode)arr_object[v]));
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int v) {
        try {
            if(Build.VERSION.SDK_INT < 29) {
                return AndroidComposeView.c(v, this);
            }
            Method method0 = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            method0.setAccessible(true);
            Object object0 = method0.invoke(this, v);
            return object0 instanceof View ? ((View)object0) : null;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        return null;
    }

    @Override  // android.view.ViewGroup
    @Nullable
    public View focusSearch(@Nullable View view0, int v) {
        if(view0 != null) {
            Rect rect0 = FocusInteropUtils_androidKt.calculateBoundingRect(view0);
            FocusDirection focusDirection0 = FocusInteropUtils_androidKt.toFocusDirection(v);
            if(Intrinsics.areEqual(this.getFocusOwner().focusSearch-ULY8qGw((focusDirection0 == null ? 6 : focusDirection0.unbox-impl()), rect0, f.z), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view0, v);
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z) {
        this.o.setAccessibilityForceEnabledForTesting$ui_release(z);
    }

    @Override  // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode0, boolean z) {
        this.J.forceMeasureTheSubtree(layoutNode0, z);
    }

    public static boolean g(MotionEvent motionEvent0) {
        boolean z;
        float f = motionEvent0.getX();
        if(Float.isInfinite(f) || Float.isNaN(f)) {
            z = true;
        }
        else {
            float f1 = motionEvent0.getY();
            if(Float.isInfinite(f1) || Float.isNaN(f1)) {
                z = true;
            }
            else {
                float f2 = motionEvent0.getRawX();
                if(Float.isInfinite(f2) || Float.isNaN(f2)) {
                    z = true;
                }
                else {
                    float f3 = motionEvent0.getRawY();
                    z = Float.isInfinite(f3) || Float.isNaN(f3);
                }
            }
        }
        if(!z) {
            int v = motionEvent0.getPointerCount();
            for(int v1 = 1; v1 < v; ++v1) {
                float f4 = motionEvent0.getX(v1);
                if(Float.isInfinite(f4) || Float.isNaN(f4)) {
                    z = true;
                }
                else {
                    float f5 = motionEvent0.getY(v1);
                    if(!Float.isInfinite(f5) && !Float.isNaN(f5) && (Build.VERSION.SDK_INT < 29 || e1.a.a(motionEvent0, v1))) {
                        z = false;
                    }
                }
                if(z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override  // androidx.compose.ui.node.Owner
    public AccessibilityManager getAccessibilityManager() {
        return this.getAccessibilityManager();
    }

    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.q;
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if(this.F == null) {
            AndroidViewsHandler androidViewsHandler0 = new AndroidViewsHandler(this.getContext());
            this.F = androidViewsHandler0;
            this.addView(androidViewsHandler0);
            this.requestLayout();
        }
        AndroidViewsHandler androidViewsHandler1 = this.F;
        Intrinsics.checkNotNull(androidViewsHandler1);
        return androidViewsHandler1;
    }

    @Override  // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this.A;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.s;
    }

    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.C;
    }

    @Override  // androidx.compose.ui.node.Owner
    public ClipboardManager getClipboardManager() {
        return this.getClipboardManager();
    }

    @NotNull
    public final Function1 getConfigurationChangeObserver() {
        return this.z;
    }

    @NotNull
    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.p;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f;
    }

    @Override  // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public Density getDensity() {
        return (Density)this.d.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public DragAndDropManager getDragAndDropManager() {
        return this.g;
    }

    // 去混淆评级： 低(34)
    @Override  // androidx.compose.ui.node.Owner
    @Nullable
    public FocusDirection getFocusDirection-P8AzH3I(@NotNull KeyEvent keyEvent0) {
        boolean z = true;
        long v = KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0);
        if(Key.equals-impl0(v, 0x3D00000000L)) {
            return KeyEvent_androidKt.isShiftPressed-ZmokQxo(keyEvent0) ? FocusDirection.box-impl(2) : FocusDirection.box-impl(1);
        }
        if(Key.equals-impl0(v, 0x1600000000L)) {
            return FocusDirection.box-impl(4);
        }
        if(Key.equals-impl0(v, 0x1500000000L)) {
            return FocusDirection.box-impl(3);
        }
        if((Key.equals-impl0(v, 0x1300000000L) ? true : Key.equals-impl0(v, 0x5C00000000L))) {
            return FocusDirection.box-impl(5);
        }
        if((Key.equals-impl0(v, 0x1400000000L) ? true : Key.equals-impl0(v, 0x5D00000000L))) {
            return FocusDirection.box-impl(6);
        }
        if(((Key.equals-impl0(v, 0x1700000000L) ? true : Key.equals-impl0(v, 0x4200000000L)) ? true : Key.equals-impl0(v, 0xA000000000L))) {
            return FocusDirection.box-impl(7);
        }
        if(!Key.equals-impl0(v, 0x400000000L)) {
            z = Key.equals-impl0(v, 0x6F00000000L);
        }
        return z ? FocusDirection.box-impl(8) : null;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.e;
    }

    @Override  // android.view.View
    public void getFocusedRect(@NotNull android.graphics.Rect rect0) {
        Unit unit0;
        Rect rect1 = this.j();
        if(rect1 == null) {
            unit0 = null;
        }
        else {
            rect0.left = Math.round(rect1.getLeft());
            rect0.top = Math.round(rect1.getTop());
            rect0.right = Math.round(rect1.getRight());
            rect0.bottom = Math.round(rect1.getBottom());
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            super.getFocusedRect(rect0);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public Resolver getFontFamilyResolver() {
        return (Resolver)this.i0.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public ResourceLoader getFontLoader() {
        return this.h0;
    }

    @Override  // androidx.compose.ui.node.Owner
    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static void getFontLoader$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public GraphicsContext getGraphicsContext() {
        return this.r;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.l0;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.J.getHasPendingMeasureOrLayout();
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this.m0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.Q;
    }

    @VisibleForTesting
    public static void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection)this.k0.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.J.getMeasureIteration();
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.n0;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.A0;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.l;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public RootForTest getRootForTest() {
        return this.m;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return this.z0 == null ? false : this.z0.getScrollCaptureInProgress();
        }
        return false;
    }

    @Override  // androidx.compose.ui.node.RootForTest
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.c;
    }

    @Override  // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.E;
    }

    public static void getShowLayoutBounds$annotations() {
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.D;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.g0;
    }

    @Override  // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public TextInputService getTextInputService() {
        return this.e0;
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.o0;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    @NotNull
    public View getView() [...] // Inlined contents

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
        return this.K;
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners)this.V.getValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this.h;
    }

    private final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners)this.U.getValue();
    }

    public final boolean h(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        return 0.0f <= f && f <= ((float)this.getWidth()) && 0.0f <= f1 && f1 <= ((float)this.getHeight());
    }

    public final boolean i(MotionEvent motionEvent0) {
        if(motionEvent0.getPointerCount() != 1) {
            return true;
        }
        MotionEvent motionEvent1 = this.p0;
        return motionEvent1 == null || motionEvent1.getPointerCount() != motionEvent0.getPointerCount() || motionEvent0.getRawX() != motionEvent1.getRawX() || motionEvent0.getRawY() != motionEvent1.getRawY();
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        AndroidComposeView.e(this.getRoot());
    }

    @Override  // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            LifecycleOwner lifecycleOwner0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner();
            if(lifecycleOwner0 != null) {
                Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                return lifecycle0 == null ? null == androidx.lifecycle.Lifecycle.State.RESUMED : lifecycle0.getCurrentState() == androidx.lifecycle.Lifecycle.State.RESUMED;
            }
        }
        return null == androidx.lifecycle.Lifecycle.State.RESUMED;
    }

    public final Rect j() {
        if(this.isFocused()) {
            return this.getFocusOwner().getFocusRect();
        }
        View view0 = this.findFocus();
        return view0 == null ? null : FocusInteropUtils_androidKt.calculateBoundingRect(view0);
    }

    public static long k(int v, int v1) [...] // 潜在的解密器

    public final void l() {
        if(!this.R) {
            long v = AnimationUtils.currentAnimationTimeMillis();
            if(v != this.Q) {
                this.Q = v;
                this.x0.calculateMatrixToWindow-EL8BTi8(this, this.O);
                InvertMatrixKt.invertTo-JiSxe2E(this.O, this.P);
                ViewParent viewParent0 = this.getParent();
                View view0 = this;
                while(viewParent0 instanceof ViewGroup) {
                    view0 = (View)viewParent0;
                    viewParent0 = ((ViewGroup)view0).getParent();
                }
                view0.getLocationOnScreen(this.M);
                float f = (float)this.M[0];
                float f1 = (float)this.M[1];
                view0.getLocationInWindow(this.M);
                this.S = OffsetKt.Offset(f - ((float)this.M[0]), f1 - ((float)this.M[1]));
            }
        }
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public void localToScreen-58bKbWc(@NotNull float[] arr_f) {
        this.l();
        Matrix.timesAssign-58bKbWc(arr_f, this.O);
        AndroidComposeView_androidKt.access$preTranslate-cG2Xzmc(arr_f, Offset.getX-impl(this.S), Offset.getY-impl(this.S), this.N);
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public long localToScreen-MK-Hz9U(long v) {
        this.l();
        long v1 = Matrix.map-MK-Hz9U(this.O, v);
        return OffsetKt.Offset(Offset.getX-impl(this.S) + Offset.getX-impl(v1), Offset.getY-impl(this.S) + Offset.getY-impl(v1));
    }

    public final void m(LayoutNode layoutNode0) {
        if(!this.isLayoutRequested() && this.isAttachedToWindow()) {
            if(layoutNode0 != null) {
                while(layoutNode0 != null && layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock) {
                    if(!this.I) {
                        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                        if(layoutNode1 != null && !layoutNode1.getHasFixedInnerContentConstraints$ui_release()) {
                            goto label_6;
                        }
                        break;
                    }
                label_6:
                    layoutNode0 = layoutNode0.getParent$ui_release();
                }
                if(layoutNode0 == this.getRoot()) {
                    this.requestLayout();
                    return;
                }
            }
            if(this.getWidth() != 0 && this.getHeight() != 0) {
                this.invalidate();
                return;
            }
            this.requestLayout();
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate0 = this.J;
        if(measureAndLayoutDelegate0.getHasPendingMeasureOrLayout() || measureAndLayoutDelegate0.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if(measureAndLayoutDelegate0.measureAndLayout((z ? this.w0 : null))) {
                    this.requestLayout();
                }
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(measureAndLayoutDelegate0, false, 1, null);
                if(this.w) {
                    this.getViewTreeObserver().dispatchOnGlobalLayout();
                    this.w = false;
                }
            }
            finally {
                Trace.endSection();
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void measureAndLayout-0kLqBqw(@NotNull LayoutNode layoutNode0, long v) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate0 = this.J;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            measureAndLayoutDelegate0.measureAndLayout-0kLqBqw(layoutNode0, v);
            if(!measureAndLayoutDelegate0.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(measureAndLayoutDelegate0, false, 1, null);
                if(this.w) {
                    this.getViewTreeObserver().dispatchOnGlobalLayout();
                    this.w = false;
                }
            }
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    public final int n(MotionEvent motionEvent0) {
        Object object1;
        if(this.y0) {
            this.y0 = false;
            int v = PointerKeyboardModifiers.constructor-impl(motionEvent0.getMetaState());
            this.h.setKeyboardModifiers-5xRPYO0(v);
        }
        MotionEventAdapter motionEventAdapter0 = this.x;
        PointerInputEvent pointerInputEvent0 = motionEventAdapter0.convertToPointerInputEvent$ui_release(motionEvent0, this);
        PointerInputEventProcessor pointerInputEventProcessor0 = this.y;
        if(pointerInputEvent0 != null) {
            List list0 = pointerInputEvent0.getPointers();
            int v1 = list0.size() - 1;
            if(v1 >= 0) {
                while(true) {
                    Object object0 = list0.get(v1);
                    if(((PointerInputEventData)object0).getDown()) {
                        object1 = object0;
                        goto label_19;
                    }
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
            object1 = null;
        label_19:
            if(((PointerInputEventData)object1) != null) {
                this.a = ((PointerInputEventData)object1).getPosition-F1C5BW0();
            }
            int v2 = pointerInputEventProcessor0.process-BIzXfog(pointerInputEvent0, this, this.h(motionEvent0));
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 5: {
                    if(!ProcessResult.getDispatchedToAPointerInputModifier-impl(v2)) {
                        motionEventAdapter0.endStream(motionEvent0.getPointerId(motionEvent0.getActionIndex()));
                        return v2;
                    }
                    return v2;
                }
                default: {
                    return v2;
                }
            }
        }
        pointerInputEventProcessor0.processCancel();
        return 0;
    }

    public final void notifyLayerIsDirty$ui_release(@NotNull OwnedLayer ownedLayer0, boolean z) {
        ArrayList arrayList0 = this.t;
        if(z) {
            if(!this.v) {
                arrayList0.add(ownedLayer0);
                return;
            }
            ArrayList arrayList2 = this.u;
            if(arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.u = arrayList2;
            }
            arrayList2.add(ownedLayer0);
        }
        else if(!this.v) {
            arrayList0.remove(ownedLayer0);
            ArrayList arrayList1 = this.u;
            if(arrayList1 != null) {
                arrayList1.remove(ownedLayer0);
            }
        }
    }

    public final void o(MotionEvent motionEvent0, int v, long v1, boolean z) {
        int v2 = -1;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                if(v != 9 && v != 10) {
                    v2 = 0;
                }
                break;
            }
            case 6: {
                v2 = motionEvent0.getActionIndex();
            }
        }
        int v3 = motionEvent0.getPointerCount() - (v2 < 0 ? 0 : 1);
        if(v3 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] arr_motionEvent$PointerProperties = new MotionEvent.PointerProperties[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_motionEvent$PointerProperties[v4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] arr_motionEvent$PointerCoords = new MotionEvent.PointerCoords[v3];
        for(int v5 = 0; v5 < v3; ++v5) {
            arr_motionEvent$PointerCoords[v5] = new MotionEvent.PointerCoords();
        }
        for(int v6 = 0; v6 < v3; ++v6) {
            int v7 = (v2 < 0 || v6 < v2 ? 0 : 1) + v6;
            motionEvent0.getPointerProperties(v7, arr_motionEvent$PointerProperties[v6]);
            MotionEvent.PointerCoords motionEvent$PointerCoords0 = arr_motionEvent$PointerCoords[v6];
            motionEvent0.getPointerCoords(v7, motionEvent$PointerCoords0);
            long v8 = this.localToScreen-MK-Hz9U(OffsetKt.Offset(motionEvent$PointerCoords0.x, motionEvent$PointerCoords0.y));
            motionEvent$PointerCoords0.x = Offset.getX-impl(v8);
            motionEvent$PointerCoords0.y = Offset.getY-impl(v8);
        }
        int v9 = z ? 0 : motionEvent0.getButtonState();
        MotionEvent motionEvent1 = MotionEvent.obtain((motionEvent0.getDownTime() == motionEvent0.getEventTime() ? v1 : motionEvent0.getDownTime()), v1, v, v3, arr_motionEvent$PointerProperties, arr_motionEvent$PointerCoords, motionEvent0.getMetaState(), v9, motionEvent0.getXPrecision(), motionEvent0.getYPrecision(), motionEvent0.getDeviceId(), motionEvent0.getEdgeFlags(), motionEvent0.getSource(), motionEvent0.getFlags());
        PointerInputEvent pointerInputEvent0 = this.x.convertToPointerInputEvent$ui_release(motionEvent1, this);
        Intrinsics.checkNotNull(pointerInputEvent0);
        this.y.process-BIzXfog(pointerInputEvent0, this, true);
        motionEvent1.recycle();
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onAttach(@NotNull LayoutNode layoutNode0) {
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.hasWindowFocus();
        this.h.setWindowFocused(z);
        this.f(this.getRoot());
        AndroidComposeView.e(this.getRoot());
        this.getSnapshotObserver().startObserving$ui_release();
        AndroidAutofill androidAutofill0 = this.A;
        if(androidAutofill0 != null) {
            AutofillCallback.INSTANCE.register(androidAutofill0);
        }
        LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner0 = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        Lifecycle lifecycle0 = null;
        if(androidComposeView$ViewTreeOwners0 == null || lifecycleOwner0 != null && savedStateRegistryOwner0 != null && (lifecycleOwner0 != androidComposeView$ViewTreeOwners0.getLifecycleOwner() || savedStateRegistryOwner0 != androidComposeView$ViewTreeOwners0.getLifecycleOwner())) {
            if(lifecycleOwner0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!");
            }
            if(savedStateRegistryOwner0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!");
            }
            if(androidComposeView$ViewTreeOwners0 != null) {
                LifecycleOwner lifecycleOwner1 = androidComposeView$ViewTreeOwners0.getLifecycleOwner();
                if(lifecycleOwner1 != null) {
                    Lifecycle lifecycle1 = lifecycleOwner1.getLifecycle();
                    if(lifecycle1 != null) {
                        lifecycle1.removeObserver(this);
                    }
                }
            }
            lifecycleOwner0.getLifecycle().addObserver(this);
            ViewTreeOwners androidComposeView$ViewTreeOwners1 = new ViewTreeOwners(lifecycleOwner0, savedStateRegistryOwner0);
            this.set_viewTreeOwners(androidComposeView$ViewTreeOwners1);
            Function1 function10 = this.W;
            if(function10 != null) {
                function10.invoke(androidComposeView$ViewTreeOwners1);
            }
            this.W = null;
        }
        int v = this.isInTouchMode() ? 1 : 2;
        this.m0.setInputMode-iuPiT84(v);
        ViewTreeOwners androidComposeView$ViewTreeOwners2 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners2 != null) {
            LifecycleOwner lifecycleOwner2 = androidComposeView$ViewTreeOwners2.getLifecycleOwner();
            if(lifecycleOwner2 != null) {
                lifecycle0 = lifecycleOwner2.getLifecycle();
            }
        }
        if(lifecycle0 == null) {
            throw l1.a.b("No lifecycle owner exists");
        }
        lifecycle0.addObserver(this);
        lifecycle0.addObserver(this.p);
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.a0);
        this.getViewTreeObserver().addOnScrollChangedListener(this.b0);
        this.getViewTreeObserver().addOnTouchModeChangeListener(this.c0);
        if(Build.VERSION.SDK_INT >= 0x1F) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
    }

    @Override  // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession0 = (AndroidPlatformTextInputSession)SessionMutex.getCurrentSession-impl(this.f0);
        return androidPlatformTextInputSession0 == null ? this.d0.isEditorFocused() : androidPlatformTextInputSession0.isReadyForConnection();
    }

    @Override  // android.view.View
    public void onConfigurationChanged(@NotNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.setDensity(AndroidDensity_androidKt.Density(this.getContext()));
        int v = Build.VERSION.SDK_INT;
        int v1 = 0;
        if((v < 0x1F ? 0 : a.a(configuration0)) != this.j0) {
            if(v >= 0x1F) {
                v1 = a.a(configuration0);
            }
            this.j0 = v1;
            this.setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(this.getContext()));
        }
        this.z.invoke(configuration0);
    }

    @Override  // android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo editorInfo0) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession0 = (AndroidPlatformTextInputSession)SessionMutex.getCurrentSession-impl(this.f0);
        return androidPlatformTextInputSession0 == null ? this.d0.createInputConnection(editorInfo0) : androidPlatformTextInputSession0.createInputConnection(editorInfo0);
    }

    @Override  // android.view.View
    @RequiresApi(0x1F)
    public void onCreateVirtualViewTranslationRequests(@NotNull long[] arr_v, @NotNull int[] arr_v1, @NotNull Consumer consumer0) {
        this.p.onCreateVirtualViewTranslationRequests$ui_release(arr_v, arr_v1, consumer0);
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onDetach(@NotNull LayoutNode layoutNode0) {
        this.J.onNodeDetached(layoutNode0);
        this.requestClearInvalidObservations();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        Lifecycle lifecycle0;
        super.onDetachedFromWindow();
        this.getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 == null) {
            lifecycle0 = null;
        }
        else {
            LifecycleOwner lifecycleOwner0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner();
            lifecycle0 = lifecycleOwner0 == null ? null : lifecycleOwner0.getLifecycle();
        }
        if(lifecycle0 == null) {
            throw l1.a.b("No lifecycle owner exists");
        }
        lifecycle0.removeObserver(this.p);
        lifecycle0.removeObserver(this);
        AndroidAutofill androidAutofill0 = this.A;
        if(androidAutofill0 != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill0);
        }
        this.getViewTreeObserver().removeOnGlobalLayoutListener(this.a0);
        this.getViewTreeObserver().removeOnScrollChangedListener(this.b0);
        this.getViewTreeObserver().removeOnTouchModeChangeListener(this.c0);
        if(Build.VERSION.SDK_INT >= 0x1F) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
    }

    @Override  // android.view.View
    public void onDraw(@NotNull Canvas canvas0) {
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if(this.B) {
            this.getSnapshotObserver().clearInvalidObservations$ui_release();
            this.B = false;
        }
        AndroidViewsHandler androidViewsHandler0 = this.F;
        if(androidViewsHandler0 != null) {
            AndroidComposeView.a(androidViewsHandler0);
        }
        while(true) {
            MutableVector mutableVector0 = this.s0;
            if(!mutableVector0.isNotEmpty()) {
                break;
            }
            int v = mutableVector0.getSize();
            for(int v1 = 0; v1 < v; ++v1) {
                Function0 function00 = (Function0)mutableVector0.getContent()[v1];
                mutableVector0.set(v1, null);
                if(function00 != null) {
                    function00.invoke();
                }
            }
            mutableVector0.removeRange(0, v);
        }
    }

    @Override  // android.view.View
    public void onFocusChanged(boolean z, int v, @Nullable android.graphics.Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(!z && !this.hasFocus()) {
            this.getFocusOwner().releaseFocus();
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(@NotNull View view0) {
        this.w = true;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.J.measureAndLayout(this.w0);
        this.H = null;
        this.p();
        if(this.F != null) {
            this.getAndroidViewsHandler$ui_release().layout(0, 0, v2 - v, v3 - v1);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onLayoutChange(@NotNull LayoutNode layoutNode0) {
        this.o.onLayoutChange$ui_release(layoutNode0);
        this.p.onLayoutChange$ui_release(layoutNode0);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate0 = this.J;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if(!this.isAttachedToWindow()) {
                this.f(this.getRoot());
            }
            long v3 = AndroidComposeView.b(v);
            long v4 = AndroidComposeView.b(v1);
            long v5 = ConstraintsKt.Constraints(((int)(v3 >>> 0x20)), ((int)(v3 & 0xFFFFFFFFL)), ((int)(v4 >>> 0x20)), ((int)(0xFFFFFFFFL & v4)));
            Constraints constraints0 = this.H;
            if(constraints0 == null) {
                this.H = Constraints.box-impl(v5);
                this.I = false;
            }
            else if(!Constraints.equals-impl0(constraints0.unbox-impl(), v5)) {
                this.I = true;
            }
            measureAndLayoutDelegate0.updateRootConstraints-BRTryo0(v5);
            measureAndLayoutDelegate0.measureOnly();
            this.setMeasuredDimension(this.getRoot().getWidth(), this.getRoot().getHeight());
            if(this.F != null) {
                this.getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(this.getRoot().getWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getRoot().getHeight(), 0x40000000));
            }
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // android.view.View
    public void onProvideAutofillVirtualStructure(@Nullable ViewStructure viewStructure0, int v) {
        if(viewStructure0 != null) {
            AndroidAutofill androidAutofill0 = this.A;
            if(androidAutofill0 != null) {
                AndroidAutofill_androidKt.populateViewStructure(androidAutofill0, viewStructure0);
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@NotNull LayoutNode layoutNode0, boolean z, boolean z1, boolean z2) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate0 = this.J;
        if(z) {
            if(measureAndLayoutDelegate0.requestLookaheadRemeasure(layoutNode0, z1) && z2) {
                this.m(layoutNode0);
            }
        }
        else if(measureAndLayoutDelegate0.requestRemeasure(layoutNode0, z1) && z2) {
            this.m(layoutNode0);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@NotNull LayoutNode layoutNode0, boolean z, boolean z1) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate0 = this.J;
        if(z) {
            if(measureAndLayoutDelegate0.requestLookaheadRelayout(layoutNode0, z1)) {
                this.m(null);
            }
        }
        else if(measureAndLayoutDelegate0.requestRelayout(layoutNode0, z1)) {
            this.m(null);
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner lifecycleOwner0) {
        this.setShowLayoutBounds(Companion.access$getIsShowingLayoutBounds(AndroidComposeView.Companion));
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        if(this.b) {
            LayoutDirection layoutDirection0 = FocusInteropUtils_androidKt.toLayoutDirection(v);
            if(layoutDirection0 == null) {
                layoutDirection0 = LayoutDirection.Ltr;
            }
            this.setLayoutDirection(layoutDirection0);
        }
    }

    @Override  // android.view.View
    public void onScrollCaptureSearch(@NotNull android.graphics.Rect rect0, @NotNull Point point0, @NotNull Consumer consumer0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            ScrollCapture scrollCapture0 = this.z0;
            if(scrollCapture0 != null) {
                scrollCapture0.onScrollCaptureSearch(this, this.getSemanticsOwner(), this.getCoroutineContext(), consumer0);
            }
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.o.onSemanticsChange$ui_release();
        this.p.onSemanticsChange$ui_release();
    }

    @Override  // android.view.View
    @RequiresApi(0x1F)
    public void onVirtualViewTranslationResponses(@NotNull LongSparseArray longSparseArray0) {
        this.p.onVirtualViewTranslationResponses$ui_release(this.p, longSparseArray0);
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        this.h.setWindowFocused(z);
        this.y0 = true;
        super.onWindowFocusChanged(z);
        if(z) {
            boolean z1 = Companion.access$getIsShowingLayoutBounds(AndroidComposeView.Companion);
            if(this.getShowLayoutBounds() != z1) {
                this.setShowLayoutBounds(z1);
                this.invalidateDescendants();
            }
        }
    }

    public final void p() {
        int[] arr_v = this.M;
        this.getLocationOnScreen(arr_v);
        int v = IntOffset.getX-impl(this.L);
        int v1 = IntOffset.getY-impl(this.L);
        boolean z = false;
        int v2 = arr_v[0];
        if(v != v2 || v1 != arr_v[1]) {
            this.L = IntOffsetKt.IntOffset(v2, arr_v[1]);
            if(v != 0x7FFFFFFF && v1 != 0x7FFFFFFF) {
                this.getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z = true;
            }
        }
        this.J.dispatchOnPositionedCallbacks(z);
    }

    public final boolean recycle$ui_release(@NotNull OwnedLayer ownedLayer0) {
        this.r0.push(ownedLayer0);
        return true;
    }

    @Override  // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(@NotNull Function0 function00) {
        MutableVector mutableVector0 = this.s0;
        if(!mutableVector0.contains(function00)) {
            mutableVector0.add(function00);
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(@NotNull OnLayoutCompletedListener owner$OnLayoutCompletedListener0) {
        this.J.registerOnLayoutCompletedListener(owner$OnLayoutCompletedListener0);
        this.m(null);
    }

    public final void removeAndroidView(@NotNull AndroidViewHolder androidViewHolder0) {
        this.registerOnEndApplyChangesListener(new m(7, this, androidViewHolder0));
    }

    public final void requestClearInvalidObservations() {
        this.B = true;
    }

    @Override  // android.view.ViewGroup
    public boolean requestFocus(int v, @Nullable android.graphics.Rect rect0) {
        if(this.isFocused()) {
            return true;
        }
        if(this.getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(v, rect0);
        }
        if(this.isInTouchMode()) {
            return false;
        }
        FocusDirection focusDirection0 = FocusInteropUtils_androidKt.toFocusDirection(v);
        int v1 = focusDirection0 == null ? 7 : focusDirection0.unbox-impl();
        Boolean boolean0 = this.getFocusOwner().focusSearch-ULY8qGw(v1, (rect0 == null ? null : RectHelper_androidKt.toComposeRect(rect0)), new v6(v1, 4));
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override  // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(@NotNull LayoutNode layoutNode0) {
        this.J.requestOnPositionedCallback(layoutNode0);
        this.m(null);
    }

    @Override  // androidx.compose.ui.input.pointer.PositionCalculator
    public long screenToLocal-MK-Hz9U(long v) {
        this.l();
        return Matrix.map-MK-Hz9U(this.P, OffsetKt.Offset(Offset.getX-impl(v) - Offset.getX-impl(this.S), Offset.getY-impl(v) - Offset.getY-impl(this.S)));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.RootForTest
    public boolean sendKeyEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return this.getFocusOwner().dispatchInterceptedSoftKeyboardEvent-ZmokQxo(keyEvent0) || FocusOwner.dispatchKeyEvent-YhN2O0w$default(this.getFocusOwner(), keyEvent0, null, 2, null);
    }

    @Override  // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long v) {
        this.o.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(v);
    }

    public final void setConfigurationChangeObserver(@NotNull Function1 function10) {
        this.z = function10;
    }

    public final void setContentCaptureManager$ui_release(@NotNull AndroidContentCaptureManager androidContentCaptureManager0) {
        this.p = androidContentCaptureManager0;
    }

    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext0) {
        this.f = coroutineContext0;
        Node modifier$Node0 = this.getRoot().getNodes$ui_release().getHead$ui_release();
        if(modifier$Node0 instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode)modifier$Node0).resetPointerInputHandler();
        }
        if(!modifier$Node0.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Node modifier$Node1 = modifier$Node0.getNode().getChild$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(modifier$Node0);
        NestedVectorStack nestedVectorStack0 = new NestedVectorStack();
        while(layoutNode0 != null) {
            if(modifier$Node1 == null) {
                modifier$Node1 = layoutNode0.getNodes$ui_release().getHead$ui_release();
            }
            if((modifier$Node1.getAggregateChildKindSet$ui_release() & 16) != 0) {
                while(modifier$Node1 != null) {
                    if((modifier$Node1.getKindSet$ui_release() & 16) != 0) {
                        Node modifier$Node2 = modifier$Node1;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node2 != null) {
                            if(!(modifier$Node2 instanceof PointerInputModifierNode)) {
                                if((modifier$Node2.getKindSet$ui_release() & 16) != 0 && modifier$Node2 instanceof DelegatingNode) {
                                    Node modifier$Node3 = ((DelegatingNode)modifier$Node2).getDelegate$ui_release();
                                    int v = 0;
                                    while(modifier$Node3 != null) {
                                        if((modifier$Node3.getKindSet$ui_release() & 16) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                modifier$Node2 = modifier$Node3;
                                            }
                                            else {
                                                if(mutableVector0 == null) {
                                                    mutableVector0 = new MutableVector(new Node[16], 0);
                                                }
                                                if(modifier$Node2 != null) {
                                                    mutableVector0.add(modifier$Node2);
                                                    modifier$Node2 = null;
                                                }
                                                mutableVector0.add(modifier$Node3);
                                            }
                                        }
                                        modifier$Node3 = modifier$Node3.getChild$ui_release();
                                    }
                                    if(v != 1) {
                                        goto label_40;
                                    }
                                    continue;
                                }
                            }
                            else if(((PointerInputModifierNode)modifier$Node2) instanceof SuspendingPointerInputModifierNode) {
                                ((SuspendingPointerInputModifierNode)(((PointerInputModifierNode)modifier$Node2))).resetPointerInputHandler();
                            }
                        label_40:
                            modifier$Node2 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                    modifier$Node1 = modifier$Node1.getChild$ui_release();
                }
            }
            nestedVectorStack0.push(layoutNode0.get_children$ui_release());
            layoutNode0 = nestedVectorStack0.isNotEmpty() ? ((LayoutNode)nestedVectorStack0.pop()) : null;
            modifier$Node1 = null;
        }
    }

    private void setDensity(Density density0) {
        this.d.setValue(density0);
    }

    private void setFontFamilyResolver(Resolver fontFamily$Resolver0) {
        this.i0.setValue(fontFamily$Resolver0);
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long v) {
        this.Q = v;
    }

    private void setLayoutDirection(LayoutDirection layoutDirection0) {
        this.k0.setValue(layoutDirection0);
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1 function10) {
        ViewTreeOwners androidComposeView$ViewTreeOwners0 = this.getViewTreeOwners();
        if(androidComposeView$ViewTreeOwners0 != null) {
            function10.invoke(androidComposeView$ViewTreeOwners0);
        }
        if(!this.isAttachedToWindow()) {
            this.W = function10;
        }
    }

    @Override  // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.E = z;
    }

    private final void set_viewTreeOwners(ViewTreeOwners androidComposeView$ViewTreeOwners0) {
        this.U.setValue(androidComposeView$ViewTreeOwners0);
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override  // androidx.compose.ui.node.Owner
    @Nullable
    public Object textInputSession(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.q;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, continuation0);
            }
            else {
                o0.q = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, continuation0);
        }
        Object object0 = o0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(o0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                n n0 = new n(this, 1);
                o0.q = 1;
                if(SessionMutex.withSessionCancellingPrevious-impl(this.f0, n0, function20, o0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }
}


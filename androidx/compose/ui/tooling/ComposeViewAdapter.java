package androidx.compose.ui.tooling;

import aa.d;
import aa.x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.c0;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import m0.b0;
import ma.f;
import o2.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u0006\u0010\nJ7\u0010\u0012\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\bH\u0014\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0011H\u0014\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u0017\u001A\u00020\u0016H\u0014\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u009F\u0001\u0010-\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u001A2\u0016\b\u0002\u0010\u001F\u001A\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001E\u0018\u00010\u001D2\b\b\u0002\u0010 \u001A\u00020\b2\b\b\u0002\u0010!\u001A\u00020\u000B2\b\b\u0002\u0010\"\u001A\u00020\u000B2\b\b\u0002\u0010$\u001A\u00020#2\b\b\u0002\u0010%\u001A\u00020\u000B2\b\b\u0002\u0010&\u001A\u00020\u000B2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010\u001A2\u000E\b\u0002\u0010)\u001A\b\u0012\u0004\u0012\u00020\u00110(2\u000E\b\u0002\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00110(H\u0001\u00A2\u0006\u0004\b+\u0010,J\u000F\u0010/\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b.\u0010\u0015J\r\u00100\u001A\u00020\u000B\u00A2\u0006\u0004\b0\u00101R(\u0010:\u001A\b\u0012\u0004\u0012\u000203028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b4\u00105\u001A\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010>\u001A\b\u0012\u0004\u0012\u00020\u001A028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b;\u00105\u001A\u0004\b<\u00107\"\u0004\b=\u00109R+\u0010D\u001A\u0013\u0012\u000F\u0012\r\u0012\u0004\u0012\u00020\u00110(\u00A2\u0006\u0002\b@0?8\u0002X\u0082\u0004\u00A2\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010\u0015R\"\u0010J\u001A\u00020\u000B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bE\u0010F\u001A\u0004\bG\u00101\"\u0004\bH\u0010IR(\u0010L\u001A\u00020K8\u0000@\u0000X\u0081.\u00A2\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010\u0015\u001A\u0004\bN\u0010O\"\u0004\bP\u0010Q\u00A8\u0006S"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "onAttachedToWindow", "()V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "className", "methodName", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProvider", "parameterProviderIndex", "debugPaintBounds", "debugViewInfos", "", "animationClockStartTime", "forceCompositionInvalidation", "lookForDesignInfoProviders", "designInfoProvidersArgument", "Lkotlin/Function0;", "onCommit", "onDraw", "init$ui_tooling_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "init", "dispose$ui_tooling_release", "dispose", "hasAnimations", "()Z", "", "Landroidx/compose/ui/tooling/ViewInfo;", "e", "Ljava/util/List;", "getViewInfos$ui_tooling_release", "()Ljava/util/List;", "setViewInfos$ui_tooling_release", "(Ljava/util/List;)V", "viewInfos", "f", "getDesignInfoList$ui_tooling_release", "setDesignInfoList$ui_tooling_release", "designInfoList", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/Composable;", "l", "Landroidx/compose/runtime/MutableState;", "getContent$annotations", "content", "q", "Z", "getStitchTrees$ui_tooling_release", "setStitchTrees$ui_tooling_release", "(Z)V", "stitchTrees", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "clock", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "getClock$ui_tooling_release$annotations", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,668:1\n766#2:669\n857#2,2:670\n1549#2:672\n1620#2,3:673\n1549#2:676\n1620#2,3:677\n1549#2:680\n1620#2,3:681\n1549#2:684\n1620#2,3:685\n1360#2:688\n1446#2,2:689\n1603#2,9:691\n1855#2:700\n1856#2:703\n1612#2:704\n1448#2,3:705\n1747#2,3:708\n1360#2:711\n1446#2,5:712\n1855#2,2:717\n1#3:701\n1#3:702\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n*L\n257#1:669\n257#1:670,2\n258#1:672\n258#1:673,3\n277#1:676\n277#1:677,3\n316#1:680\n316#1:681,3\n331#1:684\n331#1:685,3\n333#1:688\n333#1:689,2\n338#1:691,9\n338#1:700\n338#1:703\n338#1:704\n333#1:705,3\n347#1:708,3\n407#1:711\n407#1:712,5\n408#1:717,2\n338#1:702\n*E\n"})
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;
    public final String a;
    public final ComposeView b;
    public boolean c;
    public PreviewAnimationClock clock;
    public boolean d;
    public List e;
    public List f;
    public final CompositionDataRecord g;
    public String h;
    public boolean i;
    public final ThreadSafeException j;
    public Function2 k;
    public final MutableState l;
    public boolean m;
    public boolean n;
    public String o;
    public Function0 p;
    public boolean q;
    public final Paint r;
    public final androidx.compose.ui.tooling.ComposeViewAdapter.FakeSavedStateRegistryOwner.1 s;
    public final androidx.compose.ui.tooling.ComposeViewAdapter.FakeViewModelStoreOwner.1 t;
    public final androidx.compose.ui.tooling.ComposeViewAdapter.FakeOnBackPressedDispatcherOwner.1 u;
    public final androidx.compose.ui.tooling.ComposeViewAdapter.FakeActivityResultRegistryOwner.1 v;

    public ComposeViewAdapter(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = "ComposeViewAdapter";
        this.b = new ComposeView(this.getContext(), null, 0, 6, null);
        this.e = CollectionsKt__CollectionsKt.emptyList();
        this.f = CollectionsKt__CollectionsKt.emptyList();
        this.g = CompositionDataRecord.Companion.create();
        this.h = "";
        this.j = new ThreadSafeException();
        this.k = ComposableSingletons.ComposeViewAdapter_androidKt.INSTANCE.getLambda-2$ui_tooling_release();
        this.l = SnapshotStateKt.mutableStateOf$default(ComposeViewAdapter_androidKt.a, null, 2, null);
        this.o = "";
        this.p = b.z;
        this.q = true;
        Paint paint0 = new Paint();
        paint0.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setColor(ColorKt.toArgb-8_81llA(Color.Companion.getRed-0d7_KjU()));
        this.r = paint0;
        this.s = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeSavedStateRegistryOwner.1();
        this.t = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeViewModelStoreOwner.1();
        this.u = new OnBackPressedDispatcherOwner() {
            public final OnBackPressedDispatcher a;
            public final ComposeViewAdapter b;

            {
                this.b = composeViewAdapter0;
                this.a = new OnBackPressedDispatcher(null, 1, null);
            }

            @Override  // androidx.lifecycle.LifecycleOwner
            public Lifecycle getLifecycle() {
                return this.getLifecycle();
            }

            @NotNull
            public LifecycleRegistry getLifecycle() {
                return ComposeViewAdapter.access$getFakeSavedStateRegistryOwner$p(this.b).getLifecycleRegistry();
            }

            @Override  // androidx.activity.OnBackPressedDispatcherOwner
            @NotNull
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.a;
            }
        };
        this.v = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeActivityResultRegistryOwner.1();
        this.d(attributeSet0);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\u0000\u0002\b\n\u0018\u00002\u00020\u0001R\u001A\u0010\u0007\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", "Landroidx/activity/result/ActivityResultRegistryOwner;", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1", "a", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1;", "getActivityResultRegistry", "()Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1;", "activityResultRegistry", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.tooling.ComposeViewAdapter.FakeActivityResultRegistryOwner.1 implements ActivityResultRegistryOwner {
            public final ComposeViewAdapter.FakeActivityResultRegistryOwner.1.activityResultRegistry.1 a;

            public androidx.compose.ui.tooling.ComposeViewAdapter.FakeActivityResultRegistryOwner.1() {
                this.a = new ComposeViewAdapter.FakeActivityResultRegistryOwner.1.activityResultRegistry.1();  // 初始化器: Landroidx/activity/result/ActivityResultRegistry;-><init>()V
            }

            @Override  // androidx.activity.result.ActivityResultRegistryOwner
            public ActivityResultRegistry getActivityResultRegistry() {
                return this.getActivityResultRegistry();
            }

            @NotNull
            public ComposeViewAdapter.FakeActivityResultRegistryOwner.1.activityResultRegistry.1 getActivityResultRegistry() {
                return this.a;
            }
        }


        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000B\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0014\u0010\r\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\u0006¨\u0006\u000E"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleRegistry;", "a", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "getLifecycle", "lifecycle", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.tooling.ComposeViewAdapter.FakeSavedStateRegistryOwner.1 implements SavedStateRegistryOwner {
            public final LifecycleRegistry a;
            public final SavedStateRegistryController b;

            public androidx.compose.ui.tooling.ComposeViewAdapter.FakeSavedStateRegistryOwner.1() {
                LifecycleRegistry lifecycleRegistry0 = LifecycleRegistry.Companion.createUnsafe(this);
                this.a = lifecycleRegistry0;
                SavedStateRegistryController savedStateRegistryController0 = SavedStateRegistryController.Companion.create(this);
                savedStateRegistryController0.performRestore(new Bundle());
                this.b = savedStateRegistryController0;
                lifecycleRegistry0.setCurrentState(State.RESUMED);
            }

            @Override  // androidx.lifecycle.LifecycleOwner
            public Lifecycle getLifecycle() {
                return this.getLifecycle();
            }

            @NotNull
            public LifecycleRegistry getLifecycle() {
                return this.a;
            }

            @NotNull
            public final LifecycleRegistry getLifecycleRegistry() {
                return this.a;
            }

            @Override  // androidx.savedstate.SavedStateRegistryOwner
            @NotNull
            public SavedStateRegistry getSavedStateRegistry() {
                return this.b.getSavedStateRegistry();
            }
        }


        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001A\u0010\u0007\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/ViewModelStore;", "a", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.ui.tooling.ComposeViewAdapter.FakeViewModelStoreOwner.1 implements ViewModelStoreOwner {
            public final ViewModelStore a;

            public androidx.compose.ui.tooling.ComposeViewAdapter.FakeViewModelStoreOwner.1() {
                this.a = new ViewModelStore();
            }

            @Override  // androidx.lifecycle.ViewModelStoreOwner
            @NotNull
            public ViewModelStore getViewModelStore() {
                return this.a;
            }
        }

    }

    public ComposeViewAdapter(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = "ComposeViewAdapter";
        this.b = new ComposeView(this.getContext(), null, 0, 6, null);
        this.e = CollectionsKt__CollectionsKt.emptyList();
        this.f = CollectionsKt__CollectionsKt.emptyList();
        this.g = CompositionDataRecord.Companion.create();
        this.h = "";
        this.j = new ThreadSafeException();
        this.k = ComposableSingletons.ComposeViewAdapter_androidKt.INSTANCE.getLambda-2$ui_tooling_release();
        this.l = SnapshotStateKt.mutableStateOf$default(ComposeViewAdapter_androidKt.a, null, 2, null);
        this.o = "";
        this.p = b.z;
        this.q = true;
        Paint paint0 = new Paint();
        paint0.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setColor(ColorKt.toArgb-8_81llA(0xFFFF000000000000L));
        this.r = paint0;
        this.s = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeSavedStateRegistryOwner.1();
        this.t = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeViewModelStoreOwner.1();
        this.u = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeOnBackPressedDispatcherOwner.1(this);
        this.v = new androidx.compose.ui.tooling.ComposeViewAdapter.FakeActivityResultRegistryOwner.1();
        this.d(attributeSet0);
    }

    public static Method a(Object object0) {
        try {
            return object0.getClass().getDeclaredMethod("getDesignInfo", Integer.TYPE, Integer.TYPE, String.class);
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
    }

    public static final void access$WrapPreview(ComposeViewAdapter composeViewAdapter0, Function2 function20, Composer composer0, int v) {
        composeViewAdapter0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x1F1F458C);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(composeViewAdapter0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1F1F458C, v1, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:432)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{CompositionLocalsKt.getLocalFontLoader().provides(new LayoutlibFontResourceLoader(composeViewAdapter0.getContext())), CompositionLocalsKt.getLocalFontFamilyResolver().provides(FontFamilyResolver_androidKt.createFontFamilyResolver(composeViewAdapter0.getContext())), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(composeViewAdapter0.u), LocalActivityResultRegistryOwner.INSTANCE.provides(composeViewAdapter0.v)}, ComposableLambdaKt.rememberComposableLambda(0xA80CE8CC, true, new x(17, composeViewAdapter0, function20), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(composeViewAdapter0, function20, v, 17));
        }
    }

    public static final ThreadSafeException access$getDelayedException$p(ComposeViewAdapter composeViewAdapter0) {
        return composeViewAdapter0.j;
    }

    public static final androidx.compose.ui.tooling.ComposeViewAdapter.FakeSavedStateRegistryOwner.1 access$getFakeSavedStateRegistryOwner$p(ComposeViewAdapter composeViewAdapter0) {
        return composeViewAdapter0.s;
    }

    public static final boolean access$hasDesignInfo(ComposeViewAdapter composeViewAdapter0, Group group0) {
        composeViewAdapter0.getClass();
        Iterable iterable0 = group0.getData();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if((object0 == null ? null : ComposeViewAdapter.a(object0)) != null) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final String b(Group group0, IntRect intRect0) {
        String s;
        Iterator iterator0 = group0.getData().iterator();
        do {
            s = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(object0 != null) {
                int v = intRect0.getLeft();
                int v1 = intRect0.getRight();
                Method method0 = ComposeViewAdapter.a(object0);
                if(method0 != null) {
                    try {
                        Object object1 = method0.invoke(object0, v, v1, this.o);
                        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.String");
                        String s1 = (String)object1;
                        if(s1.length() != 0) {
                            s = s1;
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }
        while(s == null);
        return s;
    }

    public static boolean c(Group group0) {
        String s;
        SourceLocation sourceLocation0 = group0.getLocation();
        if(sourceLocation0 == null) {
            s = "";
        }
        else {
            s = sourceLocation0.getSourceFile();
            if(s == null) {
                s = "";
            }
        }
        if(s.length() == 0) {
            SourceLocation sourceLocation1 = group0.getLocation();
            return (sourceLocation1 == null ? -1 : sourceLocation1.getLineNumber()) == -1;
        }
        return false;
    }

    public final void d(AttributeSet attributeSet0) {
        long v1;
        ViewTreeLifecycleOwner.set(this, this.s);
        ViewTreeSavedStateRegistryOwner.set(this, this.s);
        ViewTreeViewModelStoreOwner.set(this, this.t);
        this.addView(this.b);
        String s = attributeSet0.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if(s == null) {
            return;
        }
        Class class0 = null;
        String s1 = StringsKt__StringsKt.substringBeforeLast$default(s, '.', null, 2, null);
        String s2 = StringsKt__StringsKt.substringAfterLast$default(s, '.', null, 2, null);
        int v = attributeSet0.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String s3 = attributeSet0.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        if(s3 != null) {
            class0 = PreviewUtils_androidKt.asPreviewProviderClass(s3);
        }
        try {
            v1 = -1L;
            v1 = Long.parseLong(attributeSet0.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        }
        catch(Exception unused_ex) {
        }
        boolean z = attributeSet0.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false);
        ComposeViewAdapter.init$ui_tooling_release$default(this, s1, s2, class0, v, attributeSet0.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.d), attributeSet0.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.c), v1, z, attributeSet0.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.n), attributeSet0.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 0xC00, null);
    }

    @Override  // android.view.ViewGroup
    public void dispatchDraw(@NotNull Canvas canvas0) {
        super.dispatchDraw(canvas0);
        if(this.m) {
            this.l.setValue(ComposableSingletons.ComposeViewAdapter_androidKt.INSTANCE.getLambda-3$ui_tooling_release());
            this.l.setValue(this.k);
            this.invalidate();
        }
        this.p.invoke();
        if(!this.d) {
            return;
        }
        Iterable iterable0 = this.e;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            o.addAll(arrayList0, CollectionsKt___CollectionsKt.plus(k.listOf(((ViewInfo)object0)), ((ViewInfo)object0).allChildren()));
        }
        for(Object object1: arrayList0) {
            ViewInfo viewInfo0 = (ViewInfo)object1;
            if(viewInfo0.hasBounds()) {
                canvas0.drawRect(new Rect(viewInfo0.getBounds().getLeft(), viewInfo0.getBounds().getTop(), viewInfo0.getBounds().getRight(), viewInfo0.getBounds().getBottom()), this.r);
            }
        }
    }

    public final void dispose$ui_tooling_release() {
        this.b.disposeComposition();
        if(this.clock != null) {
            this.getClock$ui_tooling_release().dispose();
        }
        this.s.getLifecycleRegistry().setCurrentState(State.DESTROYED);
        this.t.getViewModelStore().clear();
    }

    public static ViewInfo e(Group group0) {
        String s;
        NodeGroup nodeGroup0 = group0 instanceof NodeGroup ? ((NodeGroup)group0) : null;
        Object object0 = nodeGroup0 == null ? null : nodeGroup0.getNode();
        LayoutInfo layoutInfo0 = object0 instanceof LayoutInfo ? ((LayoutInfo)object0) : null;
        if(group0.getChildren().size() == 1 && ComposeViewAdapter.c(group0) && layoutInfo0 == null) {
            return ComposeViewAdapter.e(((Group)CollectionsKt___CollectionsKt.single(group0.getChildren())));
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: group0.getChildren()) {
            Group group1 = (Group)object1;
            if(ComposeViewAdapter.c(group1) && group1.getChildren().isEmpty()) {
                NodeGroup nodeGroup1 = group1 instanceof NodeGroup ? ((NodeGroup)group1) : null;
                Object object2 = nodeGroup1 == null ? null : nodeGroup1.getNode();
                if((object2 instanceof LayoutInfo ? ((LayoutInfo)object2) : null) != null) {
                    arrayList0.add(object1);
                }
            }
            else {
                arrayList0.add(object1);
            }
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object3: arrayList0) {
            arrayList1.add(ComposeViewAdapter.e(((Group)object3)));
        }
        SourceLocation sourceLocation0 = group0.getLocation();
        if(sourceLocation0 == null) {
            s = "";
        }
        else {
            s = sourceLocation0.getSourceFile();
            if(s == null) {
                s = "";
            }
        }
        SourceLocation sourceLocation1 = group0.getLocation();
        return sourceLocation1 == null ? new ViewInfo(s, -1, group0.getBox(), group0.getLocation(), arrayList1, layoutInfo0) : new ViewInfo(s, sourceLocation1.getLineNumber(), group0.getBox(), group0.getLocation(), arrayList1, layoutInfo0);
    }

    @NotNull
    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock0 = this.clock;
        if(previewAnimationClock0 != null) {
            return previewAnimationClock0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clock");
        return null;
    }

    @VisibleForTesting
    public static void getClock$ui_tooling_release$annotations() {
    }

    private static void getContent$annotations() {
    }

    @NotNull
    public final List getDesignInfoList$ui_tooling_release() {
        return this.f;
    }

    public final boolean getStitchTrees$ui_tooling_release() {
        return this.q;
    }

    @NotNull
    public final List getViewInfos$ui_tooling_release() {
        return this.e;
    }

    public final boolean hasAnimations() {
        return this.i;
    }

    @VisibleForTesting
    public final void init$ui_tooling_release(@NotNull String s, @NotNull String s1, @Nullable Class class0, int v, boolean z, boolean z1, long v1, boolean z2, boolean z3, @Nullable String s2, @NotNull Function0 function00, @NotNull Function0 function01) {
        this.d = z;
        this.c = z1;
        this.h = s1;
        this.m = z2;
        this.n = z3;
        this.o = s2 == null ? "" : s2;
        this.p = function01;
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x8608C70E, true, new f(function00, this, s, s1, class0, v, v1));
        this.k = composableLambda0;
        this.b.setContent(composableLambda0);
        this.invalidate();
    }

    public static void init$ui_tooling_release$default(ComposeViewAdapter composeViewAdapter0, String s, String s1, Class class0, int v, boolean z, boolean z1, long v1, boolean z2, boolean z3, String s2, Function0 function00, Function0 function01, int v2, Object object0) {
        Function0 function02 = (v2 & 0x400) == 0 ? function00 : b.x;
        Function0 function03 = (v2 & 0x800) == 0 ? function01 : b.y;
        composeViewAdapter0.init$ui_tooling_release(s, s1, ((v2 & 4) == 0 ? class0 : null), ((v2 & 8) == 0 ? v : 0), ((v2 & 16) == 0 ? z : false), ((v2 & 0x20) == 0 ? z1 : false), ((v2 & 0x40) == 0 ? v1 : -1L), ((v2 & 0x80) == 0 ? z2 : false), ((v2 & 0x100) == 0 ? z3 : false), ((v2 & 0x200) == 0 ? s2 : null), function02, function03);
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this.b.getRootView(), this.s);
        super.onAttachedToWindow();
    }

    @Override  // android.widget.FrameLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.j.throwIfPresent();
        CompositionDataRecord compositionDataRecord0 = this.g;
        Iterable iterable0 = compositionDataRecord0.getStore();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(ComposeViewAdapter.e(SlotTreeKt.asTree(((CompositionData)object0))));
        }
        List list0 = CollectionsKt___CollectionsKt.toList(arrayList0);
        if(this.q) {
            list0 = ShadowViewInfo_androidKt.stitchTrees(list0);
        }
        this.e = list0;
        boolean z1 = false;
        if(this.c) {
            String s = ViewInfoUtil_androidKt.toDebugString$default(list0, 0, null, 3, null);
            Log.d(this.a, s);
        }
        if(this.h.length() > 0) {
            Iterable iterable1 = compositionDataRecord0.getStore();
            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
            for(Object object1: iterable1) {
                arrayList1.add(SlotTreeKt.asTree(((CompositionData)object1)));
            }
            if(this.clock != null) {
                z1 = true;
            }
            AnimationSearch animationSearch0 = new AnimationSearch(new j(0, this, ComposeViewAdapter.class, "clock", "getClock$ui_tooling_release()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", 1), new c0(0, this, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0, 12));
            boolean z2 = animationSearch0.searchAny(arrayList1);
            this.i = z2;
            if(z1 && z2) {
                animationSearch0.attachAllAnimations(arrayList1);
            }
            if(this.n) {
                Iterable iterable2 = compositionDataRecord0.getStore();
                ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(iterable2, 10));
                for(Object object2: iterable2) {
                    arrayList2.add(SlotTreeKt.asTree(((CompositionData)object2)));
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object3: arrayList2) {
                    Iterable iterable3 = PreviewUtils_androidKt.findAll(((Group)object3), new b0(this, 11));
                    ArrayList arrayList4 = new ArrayList();
                    for(Object object4: iterable3) {
                        Group group0 = (Group)object4;
                        String s1 = this.b(group0, group0.getBox());
                        if(s1 == null) {
                            s1 = null;
                            for(Object object5: group0.getChildren()) {
                                String s2 = this.b(((Group)object5), group0.getBox());
                                if(s2 != null) {
                                    s1 = s2;
                                    break;
                                }
                            }
                        }
                        if(s1 != null) {
                            arrayList4.add(s1);
                        }
                    }
                    o.addAll(arrayList3, arrayList4);
                }
                this.f = arrayList3;
            }
        }
    }

    public final void setClock$ui_tooling_release(@NotNull PreviewAnimationClock previewAnimationClock0) {
        this.clock = previewAnimationClock0;
    }

    public final void setDesignInfoList$ui_tooling_release(@NotNull List list0) {
        this.f = list0;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z) {
        this.q = z;
    }

    public final void setViewInfos$ui_tooling_release(@NotNull List list0) {
        this.e = list0;
    }
}


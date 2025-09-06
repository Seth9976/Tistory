package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings.Global;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R.id;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted.Companion;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001A\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A)\u0010\t\u001A\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\",\u0010\u000F\u001A\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u000B\u001A\u0004\u0018\u00010\u00018F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\f\u0010\u0003\"\u0004\b\r\u0010\u000E\"\u001E\u0010\u0014\u001A\u00020\b*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/CompositionContext;", "findViewTreeCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "createLifecycleAwareWindowRecomposer", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/Lifecycle;)Landroidx/compose/runtime/Recomposer;", "value", "getCompositionContext", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n36#2:445\n361#3,7:446\n42#4,7:453\n66#4,9:461\n1#5:460\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n100#1:445\n101#1:446,7\n297#1:453,7\n354#1:461,9\n*E\n"})
public final class WindowRecomposer_androidKt {
    public static final LinkedHashMap a;

    static {
        WindowRecomposer_androidKt.a = new LinkedHashMap();
    }

    public static final StateFlow access$getAnimationScaleFlowFor(Context context0) {
        LinkedHashMap linkedHashMap0 = WindowRecomposer_androidKt.a;
        synchronized(linkedHashMap0) {
            StateFlow stateFlow0 = linkedHashMap0.get(context0);
            if(stateFlow0 == null) {
                ContentResolver contentResolver0 = context0.getContentResolver();
                Uri uri0 = Settings.Global.getUriFor("animator_duration_scale");
                Channel channel0 = ChannelKt.Channel$default(-1, null, null, 6, null);
                stateFlow0 = FlowKt.stateIn(FlowKt.flow(new d2(contentResolver0, uri0, new WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1(channel0, HandlerCompat.createAsync(Looper.getMainLooper())), channel0, context0, null)), CoroutineScopeKt.MainScope(), Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Settings.Global.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f));
                linkedHashMap0.put(context0, stateFlow0);
            }
            return stateFlow0;
        }
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Recomposer createLifecycleAwareWindowRecomposer(@NotNull View view0, @NotNull CoroutineContext coroutineContext0, @Nullable Lifecycle lifecycle0) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock1;
        if(coroutineContext0.get(ContinuationInterceptor.Key) == null || coroutineContext0.get(MonotonicFrameClock.Key) == null) {
            coroutineContext0 = AndroidUiDispatcher.Companion.getCurrentThread().plus(coroutineContext0);
        }
        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)coroutineContext0.get(MonotonicFrameClock.Key);
        if(monotonicFrameClock0 == null) {
            pausableMonotonicFrameClock1 = null;
        }
        else {
            PausableMonotonicFrameClock pausableMonotonicFrameClock0 = new PausableMonotonicFrameClock(monotonicFrameClock0);
            pausableMonotonicFrameClock0.pause();
            pausableMonotonicFrameClock1 = pausableMonotonicFrameClock0;
        }
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        MotionDurationScale motionDurationScale0 = (MotionDurationScale)coroutineContext0.get(MotionDurationScale.Key);
        if(motionDurationScale0 == null) {
            motionDurationScale0 = new d1();
            ref$ObjectRef0.element = motionDurationScale0;
        }
        PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock1 == null ? EmptyCoroutineContext.INSTANCE : pausableMonotonicFrameClock1;
        CoroutineContext coroutineContext1 = coroutineContext0.plus(pausableMonotonicFrameClock2).plus(motionDurationScale0);
        Recomposer recomposer0 = new Recomposer(coroutineContext1);
        recomposer0.pauseCompositionFrameClock();
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(coroutineContext1);
        if(lifecycle0 == null) {
            LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(view0);
            lifecycle0 = lifecycleOwner0 == null ? null : lifecycleOwner0.getLifecycle();
        }
        if(lifecycle0 != null) {
            view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public final View a;
                public final Recomposer b;

                {
                    View view0 = view0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    Recomposer recomposer0 = recomposer0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = view0;
                    this.b = recomposer0;
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view0) {
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view0) {
                    this.a.removeOnAttachStateChangeListener(this);
                    this.b.cancel();
                }
            });
            lifecycle0.addObserver(new LifecycleEventObserver() {
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
                public final class WhenMappings {
                    public static final int[] $EnumSwitchMapping$0;

                    static {
                        int[] arr_v = new int[Event.values().length];
                        try {
                            arr_v[Event.ON_CREATE.ordinal()] = 1;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[Event.ON_START.ordinal()] = 2;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[Event.ON_STOP.ordinal()] = 3;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[Event.ON_DESTROY.ordinal()] = 4;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[Event.ON_PAUSE.ordinal()] = 5;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[Event.ON_RESUME.ordinal()] = 6;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[Event.ON_ANY.ordinal()] = 7;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        WhenMappings.$EnumSwitchMapping$0 = arr_v;
                    }
                }

                public final CoroutineScope a;
                public final PausableMonotonicFrameClock b;
                public final Recomposer c;
                public final ObjectRef d;
                public final View e;

                {
                    CoroutineScope coroutineScope0 = coroutineScope0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    PausableMonotonicFrameClock pausableMonotonicFrameClock0 = pausableMonotonicFrameClock1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    Recomposer recomposer0 = recomposer0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    ObjectRef ref$ObjectRef0 = ref$ObjectRef0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    View view0 = view0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = coroutineScope0;
                    this.b = pausableMonotonicFrameClock0;
                    this.c = recomposer0;
                    this.d = ref$ObjectRef0;
                    this.e = view0;
                }

                @Override  // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
                    int v = WhenMappings.$EnumSwitchMapping$0[lifecycle$Event0.ordinal()];
                    if(v != 1) {
                        Recomposer recomposer0 = this.c;
                        switch(v) {
                            case 2: {
                                PausableMonotonicFrameClock pausableMonotonicFrameClock0 = this.b;
                                if(pausableMonotonicFrameClock0 != null) {
                                    pausableMonotonicFrameClock0.resume();
                                }
                                recomposer0.resumeCompositionFrameClock();
                                return;
                            }
                            case 3: {
                                recomposer0.pauseCompositionFrameClock();
                                return;
                            }
                            case 4: {
                                recomposer0.cancel();
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    c2 c20 = new c2(this.d, this.c, lifecycleOwner0, this, this.e, null);
                    BuildersKt.launch$default(this.a, null, CoroutineStart.UNDISPATCHED, c20, 1, null);
                }
            });
            return recomposer0;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(("ViewTreeLifecycleOwner not found from " + view0));
        throw new KotlinNothingValueException();
    }

    public static Recomposer createLifecycleAwareWindowRecomposer$default(View view0, CoroutineContext coroutineContext0, Lifecycle lifecycle0, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v & 2) != 0) {
            lifecycle0 = null;
        }
        return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer(view0, coroutineContext0, lifecycle0);
    }

    @Nullable
    public static final CompositionContext findViewTreeCompositionContext(@NotNull View view0) {
        CompositionContext compositionContext0 = WindowRecomposer_androidKt.getCompositionContext(view0);
        if(compositionContext0 != null) {
            return compositionContext0;
        }
        for(ViewParent viewParent0 = view0.getParent(); compositionContext0 == null && viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            compositionContext0 = WindowRecomposer_androidKt.getCompositionContext(((View)viewParent0));
        }
        return compositionContext0;
    }

    @Nullable
    public static final CompositionContext getCompositionContext(@NotNull View view0) {
        Object object0 = view0.getTag(id.androidx_compose_ui_view_composition_context);
        return object0 instanceof CompositionContext ? ((CompositionContext)object0) : null;
    }

    @NotNull
    public static final Recomposer getWindowRecomposer(@NotNull View view0) {
        if(!view0.isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException(("Cannot locate windowRecomposer; View " + view0 + " is not attached to a window"));
        }
        ViewParent viewParent0 = view0.getParent();
        while(viewParent0 instanceof View && ((View)viewParent0).getId() != 0x1020002) {
            ViewParent viewParent1 = ((View)viewParent0).getParent();
            View view1 = (View)viewParent0;
            viewParent0 = viewParent1;
            view0 = view1;
        }
        CompositionContext compositionContext0 = WindowRecomposer_androidKt.getCompositionContext(view0);
        if(compositionContext0 == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(view0);
        }
        if(!(compositionContext0 instanceof Recomposer)) {
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        return (Recomposer)compositionContext0;
    }

    public static void getWindowRecomposer$annotations(View view0) {
    }

    public static final void setCompositionContext(@NotNull View view0, @Nullable CompositionContext compositionContext0) {
        view0.setTag(id.androidx_compose_ui_view_composition_context, compositionContext0);
    }
}


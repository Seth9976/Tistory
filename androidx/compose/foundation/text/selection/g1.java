package androidx.compose.foundation.text.selection;

import android.os.CancellationSignal;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.1.2.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt.LazyLayoutPinnableItem.1.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.ClockDialNode;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.ea;
import androidx.compose.material3.i4;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.2.1.invoke..inlined.onDispose.1;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry;
import androidx.compose.ui.platform.GlobalSnapshotManager;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.platform.c1;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.constraintlayout.compose.MotionMeasurer;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.kakao.kandinsky.designsystem.util.Transform;
import d0.v;
import ff.j;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.sync.SemaphoreImpl;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class g1 extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public g1(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = 0;
        List list0 = null;
        Object object1 = this.x;
        switch(this.w) {
            case 0: {
                ((d1)object1).invoke();
                return Unit.INSTANCE;
            }
            case 1: {
                BottomAppBarState bottomAppBarState0 = ((BottomAppBarScrollBehavior)object1).getState();
                bottomAppBarState0.setHeightOffset(bottomAppBarState0.getHeightOffset() - ((Number)object0).floatValue());
                return Unit.INSTANCE;
            }
            case 2: {
                ((TopAppBarState)object1).setHeightOffset(((Number)((AnimationScope)object0).getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 3: {
                ((BottomAppBarState)object1).setHeightOffset(((Number)((AnimationScope)object0).getValue()).floatValue());
                return Unit.INSTANCE;
            }
            case 4: {
                BuildersKt.launch$default(((ClockDialNode)object1).getCoroutineScope(), null, null, new i4(((ClockDialNode)object1), ((Offset)object0).unbox-impl(), null), 3, null);
                return Unit.INSTANCE;
            }
            case 5: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), ((String)((Pair)object1).getFirst()));
                return Unit.INSTANCE;
            }
            case 6: {
                return Boolean.valueOf(Intrinsics.areEqual(((ea)object0).a, ((SnackbarData)object1)));
            }
            case 7: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                return new AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.2.1.invoke..inlined.onDispose.1(((DisposableSaveableStateRegistry)object1));
            }
            case 8: {
                if(GlobalSnapshotManager.access$getSent$p().compareAndSet(false, true)) {
                    ((Channel)object1).trySend-JP2dKIU(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            case 9: {
                Canvas canvas0 = ((DrawScope)object0).getDrawContext().getCanvas();
                Function2 function20 = GraphicsLayerOwnerLayer.access$getDrawBlock$p(((GraphicsLayerOwnerLayer)object1));
                if(function20 != null) {
                    function20.invoke(canvas0, ((DrawScope)object0).getDrawContext().getGraphicsLayer());
                }
                return Unit.INSTANCE;
            }
            case 10: {
                ((NullableInputConnectionWrapper)object0).disposeDelegate();
                MutableVector mutableVector0 = ((c1)object1).d;
                int v1 = mutableVector0.getSize();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        if(Intrinsics.areEqual(((WeakReference)arr_object[v]), ((NullableInputConnectionWrapper)object0))) {
                            goto label_47;
                        }
                        ++v;
                        if(v >= v1) {
                            break;
                        }
                    }
                }
                v = -1;
            label_47:
                MutableVector mutableVector1 = ((c1)object1).d;
                if(v >= 0) {
                    mutableVector1.removeAt(v);
                }
                if(mutableVector1.isEmpty()) {
                    ((c1)object1).b.invoke();
                }
                return Unit.INSTANCE;
            }
            case 11: {
                float f = 0.5f;
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$null");
                WidgetFrame widgetFrame0 = (WidgetFrame)object1;
                if(!Float.isNaN(widgetFrame0.pivotX) || !Float.isNaN(widgetFrame0.pivotY)) {
                    float f1 = Float.isNaN(widgetFrame0.pivotX) ? 0.5f : widgetFrame0.pivotX;
                    if(!Float.isNaN(widgetFrame0.pivotY)) {
                        f = widgetFrame0.pivotY;
                    }
                    ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(TransformOriginKt.TransformOrigin(f1, f));
                }
                if(!Float.isNaN(widgetFrame0.rotationX)) {
                    ((GraphicsLayerScope)object0).setRotationX(widgetFrame0.rotationX);
                }
                if(!Float.isNaN(widgetFrame0.rotationY)) {
                    ((GraphicsLayerScope)object0).setRotationY(widgetFrame0.rotationY);
                }
                if(!Float.isNaN(widgetFrame0.rotationZ)) {
                    ((GraphicsLayerScope)object0).setRotationZ(widgetFrame0.rotationZ);
                }
                if(!Float.isNaN(widgetFrame0.translationX)) {
                    ((GraphicsLayerScope)object0).setTranslationX(widgetFrame0.translationX);
                }
                if(!Float.isNaN(widgetFrame0.translationY)) {
                    ((GraphicsLayerScope)object0).setTranslationY(widgetFrame0.translationY);
                }
                if(!Float.isNaN(widgetFrame0.translationZ)) {
                    ((GraphicsLayerScope)object0).setShadowElevation(widgetFrame0.translationZ);
                }
                float f2 = 1.0f;
                if(!Float.isNaN(widgetFrame0.scaleX) || !Float.isNaN(widgetFrame0.scaleY)) {
                    ((GraphicsLayerScope)object0).setScaleX((Float.isNaN(widgetFrame0.scaleX) ? 1.0f : widgetFrame0.scaleX));
                    if(!Float.isNaN(widgetFrame0.scaleY)) {
                        f2 = widgetFrame0.scaleY;
                    }
                    ((GraphicsLayerScope)object0).setScaleY(f2);
                }
                if(!Float.isNaN(widgetFrame0.alpha)) {
                    ((GraphicsLayerScope)object0).setAlpha(widgetFrame0.alpha);
                }
                return Unit.INSTANCE;
            }
            case 12: {
                Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
                PathEffect pathEffect0 = PathEffect.Companion.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
                for(Object object2: ((MotionMeasurer)object1).getRoot().getChildren()) {
                    WidgetFrame widgetFrame1 = ((MotionMeasurer)object1).getTransition().getStart(((ConstraintWidget)object2));
                    WidgetFrame widgetFrame2 = ((MotionMeasurer)object1).getTransition().getEnd(((ConstraintWidget)object2));
                    ((DrawScope)object0).getDrawContext().getTransform().translate(2.0f, 2.0f);
                    float f3 = Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc());
                    float f4 = Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc());
                    Intrinsics.checkNotNullExpressionValue(widgetFrame1, "startFrame");
                    Intrinsics.checkNotNullExpressionValue(widgetFrame2, "endFrame");
                    MotionMeasurer.access$drawFrameDebug-PE3pjmc(((MotionMeasurer)object1), ((DrawScope)object0), f3, f4, widgetFrame1, widgetFrame2, pathEffect0, 0xFFFFFFFF00000000L);
                    ((DrawScope)object0).getDrawContext().getTransform().translate(-2.0f, -2.0f);
                    MotionMeasurer.access$drawFrameDebug-PE3pjmc(((MotionMeasurer)object1), ((DrawScope)object0), Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), Size.getHeight-impl(((DrawScope)object0).getSize-NH-jbRc()), widgetFrame1, widgetFrame2, pathEffect0, 0xFF0000FF00000000L);
                }
                return Unit.INSTANCE;
            }
            case 13: {
                return (float)(-((LazyListState)object1).onScroll$foundation_release(-((Number)object0).floatValue()));
            }
            case 14: {
                Intrinsics.checkNotNullParameter(((ModuleDescriptor)object0), "it");
                SimpleType simpleType0 = ((ModuleDescriptor)object0).getBuiltIns().getPrimitiveArrayKotlinType(((PrimitiveType)object1));
                Intrinsics.checkNotNullExpressionValue(simpleType0, "it.builtIns.getPrimitive…KotlinType(componentType)");
                return simpleType0;
            }
            case 15: {
                Intrinsics.checkNotNullParameter(((ModuleDescriptor)object0), "it");
                return (KotlinType)object1;
            }
            case 16: {
                return (float)(-((LazyGridState)object1).onScroll$foundation_release(-((Number)object0).floatValue()));
            }
            case 17: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0L);
                ((GraphicsLayerScope)object0).setTranslationX(((Transform)object1).getTransitionX());
                ((GraphicsLayerScope)object0).setTranslationY(((Transform)object1).getTransitionY());
                ((GraphicsLayerScope)object0).setRotationZ(((Transform)object1).getRotateZ());
                ((GraphicsLayerScope)object0).setScaleX(((Transform)object1).getScaleX());
                ((GraphicsLayerScope)object0).setScaleY(((Transform)object1).getScaleY());
                return Unit.INSTANCE;
            }
            case 18: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                return new LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.1.2.1.invoke..inlined.onDispose.1(((v)object1));
            }
            case 19: {
                DisposableEffectScope disposableEffectScope2 = (DisposableEffectScope)object0;
                return new LazyLayoutPinnableItemKt.LazyLayoutPinnableItem.1.1.invoke..inlined.onDispose.1(((c)object1));
            }
            case 20: {
                return Boolean.valueOf(Intrinsics.areEqual(((KClass)object0), ((KClass)object1)));
            }
            case 21: {
                Throwable throwable0 = (Throwable)object0;
                ((SemaphoreImpl)object1).release();
                return Unit.INSTANCE;
            }
            case 22: {
                ((Number)object0).intValue();
                return (StaggeredGridItemSpan)object1;
            }
            case 23: {
                return (float)(-LazyStaggeredGridState.access$onScroll(((LazyStaggeredGridState)object1), -((Number)object0).floatValue()));
            }
            case 24: {
                Intrinsics.checkNotNullParameter(((KeyboardActionScope)object0), "$this$$receiver");
                FocusManager.clearFocus$default(((FocusManager)object1), false, 1, null);
                return Unit.INSTANCE;
            }
            case 25: {
                return PagerState.access$performScroll(((PagerState)object1), ((Number)object0).floatValue());
            }
            case 26: {
                if(((Throwable)object0) != null) {
                    ((CancellationSignal)object1).cancel();
                }
                return Unit.INSTANCE;
            }
            case 27: {
                Intrinsics.checkNotNullParameter(((KotlinTypeRefiner)object0), "kotlinTypeRefiner");
                return ((IntersectionTypeConstructor)object1).refine(((KotlinTypeRefiner)object0)).createType();
            }
            case 28: {
                return TypeParameterUpperBoundEraser.access$getErasedUpperBoundInternal(((TypeParameterUpperBoundEraser)object1), ((j)object0).a, ((j)object0).b);
            }
            default: {
                Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
                KSerializer kSerializer0 = ContextualSerializer.access$getFallbackSerializer$p(((ContextualSerializer)object1));
                if(kSerializer0 != null) {
                    SerialDescriptor serialDescriptor0 = kSerializer0.getDescriptor();
                    if(serialDescriptor0 != null) {
                        list0 = serialDescriptor0.getAnnotations();
                    }
                }
                if(list0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                ((ClassSerialDescriptorBuilder)object0).setAnnotations(list0);
                return Unit.INSTANCE;
            }
        }
    }
}


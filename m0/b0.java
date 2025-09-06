package m0;

import android.graphics.Matrix;
import androidx.collection.ObjectList;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.DismissState;
import androidx.compose.material.ResistanceConfig;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.navigation.NavDeepLink;
import com.kakao.editortracker.KeditorTracker;
import com.kakao.editortracker.data.EditorInfo;
import com.kakao.kandinsky.decoration.DecorationRect;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.preview.PreviewUiState;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt.PreviewTextureView.3.1.invoke..inlined.onDispose.1;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import o2.i;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import p0.j4;
import zd.c;

public final class b0 extends Lambda implements Function1 {
    public final int w;
    public final Object x;

    public b0(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = false;
        switch(this.w) {
            case 0: {
                ((RecordingInputConnection)this.x).a(((EditCommand)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((EditorInfo)object0), "$this$load");
                ((EditorInfo)object0).setVersion(KeditorTracker.access$getConfig$p(((KeditorTracker)this.x)).getEditorVersion());
                ((EditorInfo)object0).setPlugins(KeditorTracker.access$getConfig$p(((KeditorTracker)this.x)).getEditorPlugins());
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postScale(((DecorationRect)this.x).getScale(), ((DecorationRect)this.x).getScale());
                ((Matrix)object0).postScale(Offset.getX-impl(((DecorationRect)this.x).getFlip-F1C5BW0()), Offset.getY-impl(((DecorationRect)this.x).getFlip-F1C5BW0()));
                ((Matrix)object0).postRotate(((DecorationRect)this.x).getRotate());
                ((Matrix)object0).postTranslate(Offset.getX-impl(((DecorationRect)this.x).getTransition-F1C5BW0()), Offset.getY-impl(((DecorationRect)this.x).getTransition-F1C5BW0()));
                return Unit.INSTANCE;
            }
            case 3: {
                ((GraphicsLayerScope)object0).setShadowElevation(((GraphicsLayerScope)object0).toPx-0680j_4(((ShadowGraphicsLayerElement)this.x).getElevation-D9Ej5fM()));
                ((GraphicsLayerScope)object0).setShape(((ShadowGraphicsLayerElement)this.x).getShape());
                ((GraphicsLayerScope)object0).setClip(((ShadowGraphicsLayerElement)this.x).getClip());
                ((GraphicsLayerScope)object0).setAmbientShadowColor-8_81llA(((ShadowGraphicsLayerElement)this.x).getAmbientColor-0d7_KjU());
                ((GraphicsLayerScope)object0).setSpotShadowColor-8_81llA(((ShadowGraphicsLayerElement)this.x).getSpotColor-0d7_KjU());
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((String)object0), "key");
                return Boolean.valueOf(!((NavDeepLink)this.x).getArgumentsNames$navigation_common_release().contains(((String)object0)));
            }
            case 5: {
                ((PreviewGestureController)this.x).resetGesture();
                return Unit.INSTANCE;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(((PreviewUiState)this.x).getDisplayMatrix());
                return Unit.INSTANCE;
            }
            case 7: {
                if(!((Method)object0).isSynthetic()) {
                    ReflectJavaClass reflectJavaClass0 = (ReflectJavaClass)this.x;
                    if(reflectJavaClass0.isEnum()) {
                        Intrinsics.checkNotNullExpressionValue(((Method)object0), "method");
                        return ReflectJavaClass.access$isEnumValuesOrValueOf(reflectJavaClass0, ((Method)object0)) ? false : true;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            case 8: {
                Intrinsics.checkNotNullParameter(((IOException)object0), "it");
                DiskLruCache diskLruCache0 = (DiskLruCache)this.x;
                if(Util.assertionsEnabled && !Thread.holdsLock(diskLruCache0)) {
                    throw new AssertionError("Thread jeb-dexdec-sb-st-955 MUST hold lock on " + diskLruCache0);
                }
                DiskLruCache.access$setHasJournalErrors$p(diskLruCache0, true);
                return Unit.INSTANCE;
            }
            case 9: {
                TextAnnotatedStringNode.access$setSubstitution(((TextAnnotatedStringNode)this.x), ((AnnotatedString)object0));
                TextAnnotatedStringNode.access$invalidateForTranslate(((TextAnnotatedStringNode)this.x));
                return true;
            }
            case 10: {
                TextStringSimpleNode.access$setSubstitution(((TextStringSimpleNode)this.x), ((AnnotatedString)object0).getText());
                TextStringSimpleNode.access$invalidateForTranslate(((TextStringSimpleNode)this.x));
                return true;
            }
            case 11: {
                boolean z1 = Intrinsics.areEqual(((Group)object0).getName(), "remember");
                ComposeViewAdapter composeViewAdapter0 = (ComposeViewAdapter)this.x;
                if(z1 || !ComposeViewAdapter.access$hasDesignInfo(composeViewAdapter0, ((Group)object0))) {
                    Iterable iterable0 = ((Group)object0).getChildren();
                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                        for(Object object1: iterable0) {
                            if(!Intrinsics.areEqual(((Group)object1).getName(), "remember") || !ComposeViewAdapter.access$hasDesignInfo(composeViewAdapter0, ((Group)object1))) {
                                continue;
                            }
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            case 12: {
                Object object2 = ((i)object0).b.getLayoutInfo();
                LayoutInfo layoutInfo0 = null;
                LayoutInfo layoutInfo1 = object2 instanceof LayoutInfo ? ((LayoutInfo)object2) : null;
                if(layoutInfo1 != null) {
                    layoutInfo0 = layoutInfo1.getParentInfo();
                }
                List list0 = (List)((LinkedHashMap)this.x).get(layoutInfo0);
                return list0 == null ? CollectionsKt__CollectionsKt.emptyList() : list0;
            }
            case 13: {
                return Boolean.valueOf(!Intrinsics.areEqual(((i)((Pair)object0).getSecond()).a(), ((i)this.x)));
            }
            case 14: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0L);
                ((GraphicsLayerScope)object0).setScaleX(PreviewTextureViewKt.access$PreviewTextureView$lambda$1(((MutableFloatState)this.x)));
                ((GraphicsLayerScope)object0).setScaleY(PreviewTextureViewKt.access$PreviewTextureView$lambda$1(((MutableFloatState)this.x)));
                return Unit.INSTANCE;
            }
            case 15: {
                Intrinsics.checkNotNullParameter(((DisposableEffectScope)object0), "$this$DisposableEffect");
                return new PreviewTextureViewKt.PreviewTextureView.3.1.invoke..inlined.onDispose.1(((PreviewTextureLoader)this.x));
            }
            case 16: {
                Intrinsics.checkNotNullExpressionValue(((FqName)object0), "it");
                return FqNamesUtilKt.findValueForMostSpecificFqname(((FqName)object0), ((NullabilityAnnotationStatesImpl)this.x).getStates());
            }
            case 17: {
                Density density0 = (Density)object0;
                return IntOffset.box-impl(IntOffsetKt.IntOffset(0, c.roundToInt(((Number)((BackdropScaffoldState)this.x).getOffset().getValue()).floatValue())));
            }
            case 18: {
                ((Number)object0).floatValue();
                return BottomSheetState.access$requireDensity(((BottomSheetState)this.x)).toPx-0680j_4(56.0f);
            }
            case 19: {
                return Boolean.valueOf(Intrinsics.areEqual(((j4)object0).a, ((SnackbarData)this.x)));
            }
            case 20: {
                Density density1 = (Density)object0;
                return IntOffset.box-impl(IntOffsetKt.IntOffset(c.roundToInt(((Number)((DismissState)this.x).getOffset().getValue()).floatValue()), 0));
            }
            case 21: {
                SwipeableState swipeableState0 = (SwipeableState)this.x;
                float f = swipeableState0.g.getFloatValue() + ((Number)object0).floatValue();
                float f1 = kotlin.ranges.c.coerceIn(f, swipeableState0.getMinBound$material_release(), swipeableState0.getMaxBound$material_release());
                float f2 = f - f1;
                ResistanceConfig resistanceConfig0 = swipeableState0.getResistance$material_release();
                swipeableState0.e.setFloatValue(f1 + (resistanceConfig0 == null ? 0.0f : resistanceConfig0.computeResistance(f2)));
                swipeableState0.f.setFloatValue(f2);
                swipeableState0.g.setFloatValue(f);
                return Unit.INSTANCE;
            }
            case 22: {
                ((GraphicsLayerScope)object0).setScaleX(((b)this.x).n);
                ((GraphicsLayerScope)object0).setScaleY(((b)this.x).o);
                ((GraphicsLayerScope)object0).setAlpha(((b)this.x).p);
                ((GraphicsLayerScope)object0).setTranslationX(((b)this.x).q);
                ((GraphicsLayerScope)object0).setTranslationY(((b)this.x).r);
                ((GraphicsLayerScope)object0).setShadowElevation(((b)this.x).s);
                ((GraphicsLayerScope)object0).setRotationX(((b)this.x).t);
                ((GraphicsLayerScope)object0).setRotationY(((b)this.x).u);
                ((GraphicsLayerScope)object0).setRotationZ(((b)this.x).v);
                ((GraphicsLayerScope)object0).setCameraDistance(((b)this.x).w);
                ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(((b)this.x).x);
                ((GraphicsLayerScope)object0).setShape(((b)this.x).y);
                ((GraphicsLayerScope)object0).setClip(((b)this.x).z);
                ((GraphicsLayerScope)object0).setRenderEffect(((b)this.x).A);
                ((GraphicsLayerScope)object0).setAmbientShadowColor-8_81llA(((b)this.x).B);
                ((GraphicsLayerScope)object0).setSpotShadowColor-8_81llA(((b)this.x).C);
                ((GraphicsLayerScope)object0).setCompositingStrategy-aDBOjCE(((b)this.x).D);
                return Unit.INSTANCE;
            }
            case 23: {
                return object0 == ((ObjectList)this.x) ? "(this)" : String.valueOf(object0);
            }
            case 24: {
                return object0 == ((ScatterSet)this.x) ? "(this)" : String.valueOf(object0);
            }
            case 25: {
                IOException iOException0 = (IOException)object0;
                coil.disk.DiskLruCache.access$setHasJournalErrors$p(((coil.disk.DiskLruCache)this.x), true);
                return Unit.INSTANCE;
            }
            case 26: {
                Intrinsics.checkNotNullParameter(((JavaAnnotation)object0), "annotation");
                LazyJavaResolverContext lazyJavaResolverContext0 = LazyJavaAnnotations.access$getC$p(((LazyJavaAnnotations)this.x));
                boolean z2 = LazyJavaAnnotations.access$getAreAnnotationsFreshlySupported$p(((LazyJavaAnnotations)this.x));
                return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(((JavaAnnotation)object0), lazyJavaResolverContext0, z2);
            }
            case 27: {
                Intrinsics.checkNotNullParameter(((JavaTypeParameter)object0), "typeParameter");
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver0 = (LazyJavaTypeParameterResolver)this.x;
                Integer integer0 = (Integer)LazyJavaTypeParameterResolver.access$getTypeParameters$p(lazyJavaTypeParameterResolver0).get(((JavaTypeParameter)object0));
                return integer0 != null ? new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(ContextKt.child(LazyJavaTypeParameterResolver.access$getC$p(lazyJavaTypeParameterResolver0), lazyJavaTypeParameterResolver0), LazyJavaTypeParameterResolver.access$getContainingDeclaration$p(lazyJavaTypeParameterResolver0).getAnnotations()), ((JavaTypeParameter)object0), LazyJavaTypeParameterResolver.access$getTypeParametersIndexOffset$p(lazyJavaTypeParameterResolver0) + integer0.intValue(), LazyJavaTypeParameterResolver.access$getContainingDeclaration$p(lazyJavaTypeParameterResolver0)) : null;
            }
            case 28: {
                float f3 = ((AnimationVector4D)object0).getV2();
                float f4 = 0.0f;
                if(f3 < 0.0f) {
                    f3 = 0.0f;
                }
                float f5 = 1.0f;
                if(f3 > 1.0f) {
                    f3 = 1.0f;
                }
                float f6 = ((AnimationVector4D)object0).getV3();
                float f7 = -0.5f;
                if(f6 < -0.5f) {
                    f6 = -0.5f;
                }
                float f8 = 0.5f;
                if(f6 > 0.5f) {
                    f6 = 0.5f;
                }
                float f9 = ((AnimationVector4D)object0).getV4();
                if(f9 >= -0.5f) {
                    f7 = f9;
                }
                if(f7 <= 0.5f) {
                    f8 = f7;
                }
                float f10 = ((AnimationVector4D)object0).getV1();
                if(f10 >= 0.0f) {
                    f4 = f10;
                }
                if(f4 <= 1.0f) {
                    f5 = f4;
                }
                return Color.box-impl(Color.convert-vNxB06k(ColorKt.Color(f3, f6, f8, f5, ColorSpaces.INSTANCE.getOklab()), ((ColorSpace)this.x)));
            }
            default: {
                DrawScope drawScope0 = (DrawScope)object0;
                ((ContentDrawScope)this.x).drawContent();
                return Unit.INSTANCE;
            }
        }
    }
}


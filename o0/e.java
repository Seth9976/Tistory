package o0;

import android.graphics.BitmapFactory.Options;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedElement;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScopeImpl;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material.BottomDrawerState;
import androidx.compose.material.BottomSheetScaffoldState;
import androidx.compose.material.BottomSheetState;
import androidx.compose.material.DrawerState;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.PopupLayout;
import androidx.paging.PagingDataPresenter;
import coil.compose.AsyncImagePainter;
import coil.decode.BitmapFactoryDecoder;
import com.kakao.sdk.auth.AuthCodeHandlerActivity;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import dev.chrisbanes.snapper.LazyListSnapperLayoutInfo;
import dev.chrisbanes.snapper.SnapperLayoutItemInfo;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Handshake;
import okhttp3.internal.connection.RealConnection;
import s0.g;
import u.h1;

public final class e extends Lambda implements Function0 {
    public final int w;
    public final Object x;

    public e(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ConstantValue constantValue1;
        Long long1;
        switch(this.w) {
            case 0: {
                TextStringSimpleNode.access$clearSubstitution(((TextStringSimpleNode)this.x));
                TextStringSimpleNode.access$invalidateForTranslate(((TextStringSimpleNode)this.x));
                return true;
            }
            case 1: {
                List list0 = k.createListBuilder();
                Jsr305Settings jsr305Settings0 = (Jsr305Settings)this.x;
                list0.add(jsr305Settings0.getGlobalLevel().getDescription());
                ReportLevel reportLevel0 = jsr305Settings0.getMigrationLevel();
                if(reportLevel0 != null) {
                    list0.add("under-migration:" + reportLevel0.getDescription());
                }
                for(Object object2: jsr305Settings0.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
                    list0.add("@" + ((Map.Entry)object2).getKey() + ':' + ((ReportLevel)((Map.Entry)object2).getValue()).getDescription());
                }
                return (String[])k.build(list0).toArray(new String[0]);
            }
            case 2: {
                return BottomDrawerState.access$requireDensity(((BottomDrawerState)this.x)).toPx-0680j_4(400.0f);
            }
            case 3: {
                return ((BottomSheetScaffoldState)this.x).getBottomSheetState().requireOffset();
            }
            case 4: {
                return BottomSheetState.access$requireDensity(((BottomSheetState)this.x)).toPx-0680j_4(125.0f);
            }
            case 5: {
                return DrawerState.access$requireDensity(((DrawerState)this.x)).toPx-0680j_4(400.0f);
            }
            case 6: {
                return ((SwipeableState)this.x).getAnchors$material_release();
            }
            case 7: {
                PreviewAnimationClock previewAnimationClock0 = (PreviewAnimationClock)this.x;
                Iterator iterator2 = previewAnimationClock0.d().iterator();
                Long long0 = null;
                if(iterator2.hasNext()) {
                    Object object3 = iterator2.next();
                    long1 = ((ComposeAnimationClock)object3).getMaxDuration();
                    while(iterator2.hasNext()) {
                        Object object4 = iterator2.next();
                        Long long2 = ((ComposeAnimationClock)object4).getMaxDuration();
                        if(long1.compareTo(long2) < 0) {
                            long1 = long2;
                        }
                    }
                }
                else {
                    long1 = null;
                }
                long v = 0L;
                long v1 = long1 == null ? 0L : ((long)long1);
                Iterator iterator3 = previewAnimationClock0.getInfiniteTransitionClocks$ui_tooling_release().values().iterator();
                if(iterator3.hasNext()) {
                    Object object5 = iterator3.next();
                    long0 = ((InfiniteTransitionClock)object5).getMaxDurationPerIteration();
                    while(iterator3.hasNext()) {
                        Object object6 = iterator3.next();
                        Long long3 = ((InfiniteTransitionClock)object6).getMaxDurationPerIteration();
                        if(long0.compareTo(long3) < 0) {
                            long0 = long3;
                        }
                    }
                }
                if(long0 != null) {
                    v = (long)long0;
                }
                return Math.max(v1, v);
            }
            case 8: {
                return ((AsyncImagePainter)this.x).getRequest();
            }
            case 9: {
                ConstantValue constantValue0 = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(((JavaRetentionAnnotationDescriptor)this.x).getFirstArgument());
                if(constantValue0 != null) {
                    Map map0 = w.mapOf(TuplesKt.to(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), constantValue0));
                    return map0 == null ? x.emptyMap() : map0;
                }
                return x.emptyMap();
            }
            case 10: {
                JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor0 = (JavaTargetAnnotationDescriptor)this.x;
                JavaAnnotationArgument javaAnnotationArgument0 = javaTargetAnnotationDescriptor0.getFirstArgument();
                Map map1 = null;
                if(javaAnnotationArgument0 instanceof JavaArrayAnnotationArgument) {
                    List list1 = ((JavaArrayAnnotationArgument)javaTargetAnnotationDescriptor0.getFirstArgument()).getElements();
                    constantValue1 = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(list1);
                }
                else if(javaAnnotationArgument0 instanceof JavaEnumValueAnnotationArgument) {
                    List list2 = k.listOf(javaTargetAnnotationDescriptor0.getFirstArgument());
                    constantValue1 = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(list2);
                }
                else {
                    constantValue1 = null;
                }
                if(constantValue1 != null) {
                    map1 = w.mapOf(TuplesKt.to(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValue1));
                }
                return map1 == null ? x.emptyMap() : map1;
            }
            case 11: {
                Handshake handshake0 = RealConnection.access$getHandshake$p(((RealConnection)this.x));
                Intrinsics.checkNotNull(handshake0);
                Iterable iterable0 = handshake0.peerCertificates();
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                for(Object object7: iterable0) {
                    Intrinsics.checkNotNull(((Certificate)object7), "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList0.add(((X509Certificate)(((Certificate)object7))));
                }
                return arrayList0;
            }
            case 12: {
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                return BitmapFactoryDecoder.access$decode(((BitmapFactoryDecoder)this.x), bitmapFactory$Options0);
            }
            case 13: {
                return (File)this.x;
            }
            case 14: {
                ((SharedElement)this.x).a();
                return Unit.INSTANCE;
            }
            case 15: {
                return Boolean.valueOf(((SharedTransitionScope)this.x).isTransitionActive());
            }
            case 16: {
                MutableScatterMap mutableScatterMap0 = ((SharedTransitionScopeImpl)this.x).h;
                Object[] arr_object = mutableScatterMap0.keys;
                Object[] arr_object1 = mutableScatterMap0.values;
                long[] arr_v = mutableScatterMap0.metadata;
                int v2 = arr_v.length - 2;
                if(v2 >= 0) {
                    int v3 = 0;
                alab1:
                    while(true) {
                        long v4 = arr_v[v3];
                        if((~v4 << 7 & v4 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int v5 = 8 - (~(v3 - v2) >>> 0x1F);
                            int v6 = 0;
                            while(v6 < v5) {
                                if((0xFFL & v4) < 0x80L) {
                                    int v7 = (v3 << 3) + v6;
                                    Object object8 = arr_object[v7];
                                    if(!((SharedElement)arr_object1[v7]).isAnimating()) {
                                        goto label_113;
                                    }
                                    break alab1;
                                }
                            label_113:
                                v4 >>= 8;
                                ++v6;
                            }
                            if(v5 == 8) {
                                goto label_117;
                            }
                            break;
                        }
                    label_117:
                        if(v3 == v2) {
                            break;
                        }
                        ++v3;
                    }
                }
                return Unit.INSTANCE;
            }
            case 17: {
                g g0 = (g)this.x;
                return ((IntRect)g0.K.getValue()) == null || ((IntSize)g0.L.getValue()) == null ? false : true;
            }
            case 18: {
                PagingDataPresenter.access$get_onPagesUpdatedFlow$p(((PagingDataPresenter)this.x)).tryEmit(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            case 19: {
                ClientError clientError0 = new ClientError(ClientErrorCause.Cancelled, "/oauth/authorize cancelled.");
                AuthCodeHandlerActivity.access$sendError(((AuthCodeHandlerActivity)this.x), clientError0);
                return Unit.INSTANCE;
            }
            case 20: {
                JvmPackageScope jvmPackageScope0 = (JvmPackageScope)this.x;
                Iterable iterable1 = JvmPackageScope.access$getPackageFragment$p(jvmPackageScope0).getBinaryClasses$descriptors_jvm().values();
                ArrayList arrayList1 = new ArrayList();
                for(Object object9: iterable1) {
                    MemberScope memberScope0 = JvmPackageScope.access$getC$p(jvmPackageScope0).getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(JvmPackageScope.access$getPackageFragment$p(jvmPackageScope0), ((KotlinJvmBinaryClass)object9));
                    if(memberScope0 != null) {
                        arrayList1.add(memberScope0);
                    }
                }
                return (MemberScope[])ScopeUtilsKt.listOfNonEmptyScopes(arrayList1).toArray(new MemberScope[0]);
            }
            case 21: {
                return SuspendAnimationKt.getDurationScale(((CoroutineScope)this.x).getCoroutineContext());
            }
            case 22: {
                Transition transition0 = ((SeekableTransitionState)this.x).e;
                long v8 = transition0 == null ? 0L : transition0.getTotalDurationNanos();
                ((SeekableTransitionState)this.x).setTotalDurationNanos$animation_core_release(v8);
                return Unit.INSTANCE;
            }
            case 23: {
                ((AbstractClickableNode)this.x).getOnClick().invoke();
                return true;
            }
            case 24: {
                Function0 function00 = ((h1)this.x).H;
                if(function00 != null) {
                    function00.invoke();
                }
                return true;
            }
            case 25: {
                return Boolean.valueOf(FocusRequesterModifierNodeKt.requestFocus(((FocusableNode)this.x)));
            }
            case 26: {
                boolean z = AndroidRippleIndicationInstance.access$getInvalidateTick(((AndroidRippleIndicationInstance)this.x));
                AndroidRippleIndicationInstance.access$setInvalidateTick(((AndroidRippleIndicationInstance)this.x), !z);
                return Unit.INSTANCE;
            }
            case 27: {
                VectorPainter vectorPainter0 = (VectorPainter)this.x;
                if(vectorPainter0.m == VectorPainter.access$getInvalidateCount(vectorPainter0)) {
                    VectorPainter.access$setInvalidateCount(vectorPainter0, VectorPainter.access$getInvalidateCount(vectorPainter0) + 1);
                }
                return Unit.INSTANCE;
            }
            case 28: {
                PopupLayout popupLayout0 = (PopupLayout)this.x;
                LayoutCoordinates layoutCoordinates0 = popupLayout0.getParentLayoutCoordinates();
                if(layoutCoordinates0 == null || !layoutCoordinates0.isAttached()) {
                    layoutCoordinates0 = null;
                }
                return layoutCoordinates0 == null || popupLayout0.getPopupContentSize-bOM6tXw() == null ? false : true;
            }
            default: {
                LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo0 = (LazyListSnapperLayoutInfo)this.x;
                Object object0 = null;
                for(Object object1: lazyListSnapperLayoutInfo0.getVisibleItems()) {
                    if(((SnapperLayoutItemInfo)object1).getOffset() <= ((Number)LazyListSnapperLayoutInfo.access$getSnapOffsetForItem$p(lazyListSnapperLayoutInfo0).invoke(lazyListSnapperLayoutInfo0, ((SnapperLayoutItemInfo)object1))).intValue()) {
                        object0 = object1;
                    }
                }
                return (SnapperLayoutItemInfo)object0;
            }
        }
    }
}


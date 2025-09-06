package a2;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResultCallerLauncher.resultContract.2.1;
import androidx.activity.result.ActivityResultCallerLauncher;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.ClockDialNode;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.e4;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.AndroidTextToolbar;
import androidx.compose.ui.platform.PlatformTextInputInterceptor;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.platform.w0;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.State;
import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.room.SharedSQLiteStatement;
import com.kakao.android.base.observer.AutoLifecycleObserver;
import com.kakao.android.base.ui.BaseFragment;
import com.kakao.android.base.ui.LayoutLessBaseActivity;
import com.kakao.android.base.ui.bottomsheet.BaseBottomSheetDialogFragment;
import com.kakao.tistory.TistoryApplication;
import com.kakao.tistory.domain.usecase.GetCurrentBlogTitleUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final Object x;

    public b(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f1;
        switch(this.w) {
            case 0: {
                ((ModifierLocalManager)this.x).triggerUpdates();
                return Unit.INSTANCE;
            }
            case 1: {
                KotlinType kotlinType0 = ((TypeProjection)this.x).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "this@createCapturedIfNeeded.type");
                return kotlinType0;
            }
            case 2: {
                return new ActivityResultCallerLauncher.resultContract.2.1(((ActivityResultCallerLauncher)this.x));
            }
            case 3: {
                float f = 0.0f;
                TopAppBarScrollBehavior topAppBarScrollBehavior0 = (TopAppBarScrollBehavior)this.x;
                if(topAppBarScrollBehavior0 == null) {
                    f1 = 0.0f;
                }
                else {
                    TopAppBarState topAppBarState0 = topAppBarScrollBehavior0.getState();
                    f1 = topAppBarState0 == null ? 0.0f : topAppBarState0.getOverlappedFraction();
                }
                if(f1 > 0.01f) {
                    f = 1.0f;
                }
                return f;
            }
            case 4: {
                return ((BottomSheetScaffoldState)this.x).getBottomSheetState().requireOffset();
            }
            case 5: {
                BuildersKt.launch$default(((ClockDialNode)this.x).getCoroutineScope(), null, null, new e4(((ClockDialNode)this.x), null), 3, null);
                return Unit.INSTANCE;
            }
            case 6: {
                return ((DatePickerColors)this.x).getDateTextFieldColors();
            }
            case 7: {
                return ((LazyListState)this.x).getFirstVisibleItemIndex();
            }
            case 8: {
                return DrawerState.access$requireDensity(((DrawerState)this.x)).toPx-0680j_4(400.0f);
            }
            case 9: {
                return ((Density)this.x).toPx-0680j_4(125.0f);
            }
            case 10: {
                SliderState sliderState0 = (SliderState)this.x;
                if(!sliderState0.isDragging$material3_release()) {
                    Function0 function00 = sliderState0.getOnValueChangeFinished();
                    if(function00 != null) {
                        function00.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
            case 11: {
                return ((SwipeToDismissBoxState)this.x).getDensity$material3_release().toPx-0680j_4(125.0f);
            }
            case 12: {
                return ((TextFieldColors)this.x).getTextSelectionColors();
            }
            case 13: {
                AndroidComposeView androidComposeView0 = (AndroidComposeView)this.x;
                MotionEvent motionEvent0 = androidComposeView0.p0;
                if(motionEvent0 != null) {
                    switch(motionEvent0.getActionMasked()) {
                        case 7: 
                        case 9: {
                            androidComposeView0.q0 = SystemClock.uptimeMillis();
                            androidComposeView0.post(androidComposeView0.t0);
                            break;
                        }
                        default: {
                            return Unit.INSTANCE;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            case 14: {
                CoroutineScopeKt.cancel$default(((AndroidPlatformTextInputSession)this.x).c, null, 1, null);
                return Unit.INSTANCE;
            }
            case 15: {
                ((AndroidTextToolbar)this.x).b = null;
                return Unit.INSTANCE;
            }
            case 16: {
                return (PlatformTextInputInterceptor)((w0)this.x).b.getValue();
            }
            case 17: {
                return Boolean.valueOf(((WindowInfo)this.x).isWindowFocused());
            }
            case 18: {
                return new State(((Measurer)this.x).getDensity());
            }
            case 19: {
                ((CoroutineLiveData)this.x).p = null;
                return Unit.INSTANCE;
            }
            case 20: {
                return SavedStateHandleSupport.getSavedStateHandlesVM(((ViewModelStoreOwner)this.x));
            }
            case 21: {
                return SharedSQLiteStatement.access$createNewStatement(((SharedSQLiteStatement)this.x));
            }
            case 22: {
                ((BackwardsCompatNode)this.x).updateModifierLocalConsumer();
                return Unit.INSTANCE;
            }
            case 23: {
                ((LayoutNodeLayoutDelegate)this.x).getOuterCoordinator().measure-BRTryo0(((LayoutNodeLayoutDelegate)this.x).t);
                return Unit.INSTANCE;
            }
            case 24: {
                NodeCoordinator nodeCoordinator0 = ((NodeCoordinator)this.x).getWrappedBy$ui_release();
                if(nodeCoordinator0 != null) {
                    nodeCoordinator0.invalidateLayer();
                }
                return Unit.INSTANCE;
            }
            case 25: {
                IntegerLiteralTypeConstructor integerLiteralTypeConstructor0 = (IntegerLiteralTypeConstructor)this.x;
                SimpleType simpleType0 = integerLiteralTypeConstructor0.getBuiltIns().getComparable().getDefaultType();
                Intrinsics.checkNotNullExpressionValue(simpleType0, "builtIns.comparable.defaultType");
                List list0 = CollectionsKt__CollectionsKt.mutableListOf(new SimpleType[]{TypeSubstitutionKt.replace$default(simpleType0, k.listOf(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor0.d)), null, 2, null)});
                if(!IntegerLiteralTypeConstructor.access$isContainsOnlyUnsignedTypes(integerLiteralTypeConstructor0)) {
                    list0.add(integerLiteralTypeConstructor0.getBuiltIns().getNumberType());
                }
                return list0;
            }
            case 26: {
                Lifecycle lifecycle0 = ((BaseFragment)this.x).getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle0, "<get-lifecycle>(...)");
                return new AutoLifecycleObserver(lifecycle0);
            }
            case 27: {
                Lifecycle lifecycle1 = ((LayoutLessBaseActivity)this.x).getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle1, "<get-lifecycle>(...)");
                return new AutoLifecycleObserver(lifecycle1);
            }
            case 28: {
                Lifecycle lifecycle2 = ((BaseBottomSheetDialogFragment)this.x).getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
                return new AutoLifecycleObserver(lifecycle2);
            }
            default: {
                GetCurrentBlogTitleUseCase getCurrentBlogTitleUseCase0 = ((TistoryApplication)this.x).getGetCurrentBlogTitleUseCase();
                return getCurrentBlogTitleUseCase0 != null ? getCurrentBlogTitleUseCase0.invoke() : null;
            }
        }
    }
}


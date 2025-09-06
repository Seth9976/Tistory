package aa;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.z;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.material.FabPlacement;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TabRowKt.ScrollableTabRowImpl.1.scope.1.1;
import androidx.compose.material3.TabRowKt.TabRowImpl.1.scope.1.1;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TooltipScopeImpl;
import androidx.compose.material3.Typography;
import androidx.compose.material3.cg;
import androidx.compose.material3.e0;
import androidx.compose.material3.ni;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.i2;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.ComposableInvoker;
import androidx.compose.ui.tooling.ComposableSingletons.PreviewActivity_androidKt;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.InspectableKt;
import androidx.compose.ui.unit.Constraints;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.paging.LoadType;
import androidx.paging.ViewportHint;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.mosaic.BlurMenu;
import com.kakao.kandinsky.mosaic.MosaicMenu;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.ColorPanelKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import d0.f0;
import eb.j;
import j0.t1;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p0.e2;
import s4.d0;

public final class x extends Lambda implements Function2 {
    public final int w;
    public final Object x;
    public final Object y;

    public x(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((PointerInputChange)object0), "<anonymous parameter 0>");
                long v1 = Offset.plus-MK-Hz9U(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$1(((MutableState)this.x)), OffsetExtensionKt.mapVector-Uv8p0NA(MatrixExtensionKt.buildMatrix$default(null, new w(((State)this.y), 0), 1, null), ((Offset)object1).unbox-impl()));
                DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$2(((MutableState)this.x), v1);
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1945019079, v2, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                }
                ((Function3)this.x).invoke(((z)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                long v3 = ((Constraints)object1).unbox-impl();
                z z0 = new z(((SubcomposeMeasureScope)object0), v3);
                ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new x(1, ((Function3)this.y), z0));
                List list0 = ((SubcomposeMeasureScope)object0).subcompose(Unit.INSTANCE, composableLambda0);
                return ((MeasurePolicy)this.x).measure-3p2s80s(((SubcomposeMeasureScope)object0), list0, v3);
            }
            case 3: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(88659390, v4, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:132)");
                }
                SnackbarHostState snackbarHostState0 = ((BottomSheetScaffoldState)this.y).getSnackbarHostState();
                ((Function3)this.x).invoke(snackbarHostState0, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v5 = ((Number)object1).intValue();
                if((v5 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(784196780, v5, -1, "androidx.compose.material3.Label.<anonymous> (Label.kt:88)");
                }
                ((Function3)this.x).invoke(((TooltipScopeImpl)this.y), ((Composer)object0), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v6 = ((Number)object1).intValue();
                if((v6 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xC06D8942, v6, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
                }
                TextKt.ProvideTextStyle(((Typography)this.x).getBodyLarge(), ((Function2)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 6: {
                int v7 = ((Number)object1).intValue();
                if((v7 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x6D71F51B, v7, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                }
                BadgeKt.BadgedBox(ComposableLambdaKt.rememberComposableLambda(870803363, true, new cg(((Function2)this.x), 0), ((Composer)object0), 54), null, ComposableLambdaKt.rememberComposableLambda(0xAE9B3E61, true, new e0(((ComposableLambda)this.y), 1), ((Composer)object0), 54), ((Composer)object0), 390, 2);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 7: {
                int v8 = ((Number)object1).intValue();
                if((v8 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xBC53A981, v8, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
                }
                Intrinsics.checkNotNull(((SnackbarData)this.y));
                ((Function3)this.x).invoke(((SnackbarData)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 8: {
                int v9 = ((Number)object1).intValue();
                if((v9 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1530560661, v9, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:756)");
                }
                ((Function3)this.x).invoke(((TabRowKt.ScrollableTabRowImpl.1.scope.1.1)this.y), ((Composer)object0), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 9: {
                int v10 = ((Number)object1).intValue();
                if((v10 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1236693605, v10, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:617)");
                }
                ((Function3)this.x).invoke(((TabRowKt.TabRowImpl.1.scope.1.1)this.y), ((Composer)object0), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 10: {
                int v11 = ((Number)object1).intValue();
                if((v11 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-833003881, v11, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1830)");
                }
                Shape shape0 = ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), ((Composer)object0), 6);
                OutlinedTextFieldDefaults.INSTANCE.Container-4EFweAY(true, false, ((MutableInteractionSource)this.x), null, ((TextFieldColors)this.y), shape0, 0.0f, 0.0f, ((Composer)object0), 0x60001B6, 200);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 11: {
                int v12 = ((Number)object1).intValue();
                if((v12 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1193460702, v12, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                }
                AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(((i2)this.x).a, ((Function2)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 12: {
                LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl0 = new LazyLayoutMeasureScopeImpl(((LazyLayoutItemContentFactory)this.x), ((SubcomposeMeasureScope)object0));
                Constraints constraints0 = Constraints.box-impl(((Constraints)object1).unbox-impl());
                return (MeasureResult)((Function2)this.y).invoke(lazyLayoutMeasureScopeImpl0, constraints0);
            }
            case 13: {
                int v13 = ((Number)object1).intValue();
                if((v13 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x6F1942E8, v13, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
                }
                SaveableStateHolder saveableStateHolder0 = SaveableStateHolderKt.rememberSaveableStateHolder(((Composer)object0), 0);
                ((f0)this.x).b.setValue(saveableStateHolder0);
                ((Function3)this.y).invoke(((f0)this.x), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 14: {
                ((Boolean)object0).booleanValue();
                ((InputState)this.x).getOnChange().invoke(Color.box-impl(((j)ColorPanelKt.access$getPALETTE_COLOR_LIST$p().get(((Number)object1).intValue())).a));
                InputState inputState0 = (InputState)this.y;
                if(((Number)inputState0.getValue()).floatValue() == 0.0f) {
                    inputState0.getOnChange().invoke(100.0f);
                }
                return Unit.INSTANCE;
            }
            case 15: {
                int v14 = ((Number)object1).intValue();
                if((v14 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-430419613, v14, -1, "com.kakao.kandinsky.mosaic.ui.BlurMenu.<anonymous> (BlurMenu.kt:11)");
                }
                for(Object object2: BlurMenu.getEntries()) {
                    BlurMenu blurMenu0 = (BlurMenu)object2;
                    int v15 = blurMenu0.getIconResId();
                    boolean z1 = false;
                    String s = StringResources_androidKt.stringResource(blurMenu0.getTitleResId(), ((Composer)object0), 0);
                    if(((BlurMenu)this.x) == blurMenu0) {
                        z1 = true;
                    }
                    ((Composer)object0).startReplaceGroup(0x5E8709C);
                    Function1 function10 = (Function1)this.y;
                    boolean z2 = ((Composer)object0).changed(function10);
                    boolean z3 = ((Composer)object0).changed(blurMenu0);
                    t1 t10 = ((Composer)object0).rememberedValue();
                    if(z2 || z3 || t10 == Composer.Companion.getEmpty()) {
                        t10 = new t1(12, function10, blurMenu0);
                        ((Composer)object0).updateRememberedValue(t10);
                    }
                    ((Composer)object0).endReplaceGroup();
                    MenuButtonKt.MenuIconTextToggleButton(v15, s, z1, t10, ((Composer)object0), 0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 16: {
                int v16 = ((Number)object1).intValue();
                if((v16 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x74307000, v16, -1, "com.kakao.kandinsky.mosaic.ui.MosaicMenu.<anonymous> (MosaicMenu.kt:11)");
                }
                for(Object object3: MosaicMenu.getEntries()) {
                    MosaicMenu mosaicMenu0 = (MosaicMenu)object3;
                    int v17 = mosaicMenu0.getIconResId();
                    boolean z4 = false;
                    String s1 = StringResources_androidKt.stringResource(mosaicMenu0.getTitleResId(), ((Composer)object0), 0);
                    if(((MosaicMenu)this.x) == mosaicMenu0) {
                        z4 = true;
                    }
                    ((Composer)object0).startReplaceGroup(1183088227);
                    Function1 function11 = (Function1)this.y;
                    boolean z5 = ((Composer)object0).changed(function11);
                    boolean z6 = ((Composer)object0).changed(mosaicMenu0);
                    t1 t11 = ((Composer)object0).rememberedValue();
                    if(z5 || z6 || t11 == Composer.Companion.getEmpty()) {
                        t11 = new t1(13, function11, mosaicMenu0);
                        ((Composer)object0).updateRememberedValue(t11);
                    }
                    ((Composer)object0).endReplaceGroup();
                    MenuButtonKt.MenuIconTextToggleButton(v17, s1, z4, t11, ((Composer)object0), 0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 17: {
                int v18 = ((Number)object1).intValue();
                if((v18 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA80CE8CC, v18, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:443)");
                }
                InspectableKt.Inspectable(((ComposeViewAdapter)this.x).g, ((Function2)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 18: {
                int v19 = ((Number)object1).intValue();
                if((v19 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xCDE50CFC, v19, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
                }
                ComposableInvoker.INSTANCE.invokeComposable(((String)this.x), ((String)this.y), ((Composer)object0), new Object[0]);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 19: {
                int v20 = ((Number)object1).intValue();
                if((v20 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(958604965, v20, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)");
                }
                Function2 function20 = ComposableSingletons.PreviewActivity_androidKt.INSTANCE.getLambda-1$ui_tooling_release();
                Object[] arr_object = (Object[])this.x;
                boolean z7 = ((Composer)object0).changedInstance(arr_object);
                t1 t12 = ((Composer)object0).rememberedValue();
                if(z7 || t12 == Composer.Companion.getEmpty()) {
                    t12 = new t1(19, ((MutableIntState)this.y), arr_object);
                    ((Composer)object0).updateRememberedValue(t12);
                }
                FloatingActionButtonKt.ExtendedFloatingActionButton-wqdebIU(function20, t12, null, null, null, null, 0L, 0L, null, ((Composer)object0), 6, 508);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 20: {
                int v21 = ((Number)object1).intValue();
                if((v21 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xFCD860D0, v21, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
                }
                NavBackStackEntryProviderKt.access$SaveableStateProvider(((SaveableStateHolder)this.x), ((Function2)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 21: {
                int v22 = ((Number)object1).intValue();
                if((v22 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xC3AF4AD9, v22, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:505)");
                }
                androidx.compose.material.SnackbarHostState snackbarHostState1 = ((androidx.compose.material.BottomSheetScaffoldState)this.y).getSnackbarHostState();
                ((Function3)this.x).invoke(snackbarHostState1, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 22: {
                int v23 = ((Number)object1).intValue();
                if((v23 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1699085201, v23, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:117)");
                }
                androidx.compose.material.TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getButton(), ComposableLambdaKt.composableLambda(((Composer)object0), -630330208, true, new e2(((PaddingValues)this.x), ((Function3)this.y))), ((Composer)object0), 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 23: {
                int v24 = ((Number)object1).intValue();
                if((v24 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1740102967, v24, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:80)");
                }
                androidx.compose.material.TextKt.ProvideTextStyle(((androidx.compose.material.Typography)this.x).getBody1(), ComposableLambdaKt.composableLambda(((Composer)object0), 0xAD0597A, true, new ni(((Function2)this.y), 12)), ((Composer)object0), 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 24: {
                int v25 = ((Number)object1).intValue();
                if((v25 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(433906483, v25, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:225)");
                }
                androidx.compose.material.SnackbarHostState snackbarHostState2 = ((ScaffoldState)this.y).getSnackbarHostState();
                ((Function3)this.x).invoke(snackbarHostState2, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 25: {
                int v26 = ((Number)object1).intValue();
                if((v26 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x9F9721E1, v26, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:535)");
                }
                CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(((FabPlacement)this.x)), ((Function2)this.y), ((Composer)object0), ProvidedValue.$stable);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 26: {
                int v27 = ((Number)object1).intValue();
                if((v27 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2041982076, v27, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:327)");
                }
                Intrinsics.checkNotNull(((androidx.compose.material.SnackbarData)this.y));
                ((Function3)this.x).invoke(((androidx.compose.material.SnackbarData)this.y), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 27: {
                Intrinsics.checkNotNullParameter(((d0)object0), "prependHint");
                Intrinsics.checkNotNullParameter(((d0)object1), "appendHint");
                ViewportHint viewportHint0 = (ViewportHint)this.y;
                if(((LoadType)this.x) == LoadType.PREPEND) {
                    ((d0)object0).a = viewportHint0;
                    if(viewportHint0 != null) {
                        ((d0)object0).b.tryEmit(viewportHint0);
                        return Unit.INSTANCE;
                    }
                }
                else {
                    ((d0)object1).a = viewportHint0;
                    if(viewportHint0 != null) {
                        ((d0)object1).b.tryEmit(viewportHint0);
                    }
                }
                return Unit.INSTANCE;
            }
            case 28: {
                Intrinsics.checkNotNullParameter(((LoadType)object0), "loadType");
                Intrinsics.checkNotNullParameter(((LoadState)object1), "loadState");
                if(((LoadType)object0) == LoadType.PREPEND) {
                    ((LoadStateAdapter)this.x).setLoadState(((LoadState)object1));
                    return Unit.INSTANCE;
                }
                if(((LoadType)object0) == LoadType.APPEND) {
                    ((LoadStateAdapter)this.y).setLoadState(((LoadState)object1));
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1450046638, v, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:514)");
                }
                VectorPainterKt.RenderVectorGroup(((VectorGroup)this.x), ((Map)this.y), ((Composer)object0), 0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}


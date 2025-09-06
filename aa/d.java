package aa;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.FlowLineInfo;
import androidx.compose.foundation.layout.g2;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawer_androidKt;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaNImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.PlatformTextInputInterceptor;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.compose.ui.tooling.CompositionDataRecord;
import androidx.compose.ui.tooling.InspectableKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.constraintlayout.compose.MotionMeasurer;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import com.kakao.kandinsky.decoration.ControlKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.mosaic.BlurMenu;
import com.kakao.kandinsky.mosaic.MosaicMenu;
import com.kakao.kandinsky.mosaic.ui.BlurMenuKt;
import com.kakao.kandinsky.mosaic.ui.MosaicMenuKt;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import com.kakao.kandinsky.signature.ui.SignatureMenu;
import com.kakao.kandinsky.signature.ui.SignatureMenuKt;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import j0.d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

public final class d extends Lambda implements Function2 {
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public d(Object object0, int v, Object object1, int v1) {
        this.w = v1;
        this.y = object0;
        this.x = v;
        this.z = object1;
        super(2);
    }

    public d(Object object0, Object object1, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ControlKt.DeleteControl(((Function0)this.y), ((Function0)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xF45F9C00, v, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:452)");
                }
                ((g2)this.y).l.invoke(this.x, ((FlowLineInfo)this.z), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                DatePickerKt.WeekDays(((DatePickerColors)this.y), ((CalendarModel)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                NavigationDrawer_androidKt.DrawerPredictiveBackHandler(((DrawerState)this.y), ((Function3)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(((AndroidComposeView)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(((PlatformTextInputInterceptor)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                ((MotionMeasurer)this.y).drawDebug(((BoxScope)this.z), ((Composer)object0), this.x | 1);
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                ItemSliderKt.access$ToastMessage(((AnimatedVisibilityScope)this.y), ((String)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 8: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(980966366, v1, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:134)");
                }
                ((LazyLayoutItemProvider)this.y).Item(this.x, this.z, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 9: {
                ((Number)object1).intValue();
                TextStyleAndFontPanelKt.access$FontPanel(((List)this.y), ((InputState)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 10: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.y).invoke(this.z, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
                return Unit.INSTANCE;
            }
            case 11: {
                ((Number)object1).intValue();
                int v3 = this.x;
                IntRange intRange0 = c.until(0, v3);
                Object[] arr_object = (Object[])this.y;
                Object[] arr_object1 = ArraysKt___ArraysKt.slice(arr_object, intRange0).toArray(new Object[0]);
                Object object2 = arr_object[v3 + 1];
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Int");
                int v4 = RecomposeScopeImplKt.updateChangedFlags(((int)(((Integer)object2))));
                int v5 = arr_object.length - v3 - 2;
                Object[] arr_object2 = new Object[v5];
                for(int v2 = 0; v2 < v5; ++v2) {
                    Object object3 = arr_object[v3 + 2 + v2];
                    Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type kotlin.Int");
                    arr_object2[v2] = RecomposeScopeImplKt.updateChangedFlags(((int)(((Integer)object3))));
                }
                SpreadBuilder spreadBuilder0 = new SpreadBuilder(4);
                spreadBuilder0.addSpread(arr_object1);
                spreadBuilder0.add(((Composer)object0));
                spreadBuilder0.add(((int)(v4 | 1)));
                spreadBuilder0.addSpread(arr_object2);
                Object[] arr_object3 = spreadBuilder0.toArray(new Object[spreadBuilder0.size()]);
                ((ComposableLambdaNImpl)this.z).invoke(arr_object3);
                return Unit.INSTANCE;
            }
            case 12: {
                ((Number)object1).intValue();
                ((d0)this.y).Decoration(((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 13: {
                ((Number)object1).intValue();
                ContextMenu_androidKt.ContextMenuArea(((TextFieldSelectionManager)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 14: {
                ((Number)object1).intValue();
                ContextMenu_androidKt.ContextMenuArea(((SelectionManager)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 15: {
                ((Number)object1).intValue();
                BlurMenuKt.BlurMenu(((BlurMenu)this.y), ((Function1)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 16: {
                ((Number)object1).intValue();
                MosaicMenuKt.MosaicMenu(((MosaicMenu)this.y), ((Function1)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 17: {
                ((Number)object1).intValue();
                ComposeViewAdapter.access$WrapPreview(((ComposeViewAdapter)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 18: {
                ((Number)object1).intValue();
                InspectableKt.Inspectable(((CompositionDataRecord)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 19: {
                ((Number)object1).intValue();
                DialogHostKt.PopulateVisibleList(((List)this.y), ((Collection)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 20: {
                ((Number)object1).intValue();
                NavBackStackEntryProviderKt.access$SaveableStateProvider(((SaveableStateHolder)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 21: {
                ((Number)object1).intValue();
                ((Transition)this.y).animateTo$animation_core_release(this.z, ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 22: {
                ((Number)object1).intValue();
                CanvasKt.Canvas(((Modifier)this.y), ((Function1)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 23: {
                ((Number)object1).intValue();
                AndroidPopup_androidKt.PopupTestTag(((String)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 24: {
                ((Number)object1).intValue();
                SignatureDecorationKt.access$WatermarkContainer(((Rect)this.y), ((Function3)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 25: {
                ((Number)object1).intValue();
                SignatureMenuKt.SignatureMenu(((SignatureMenu)this.y), ((Function1)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 26: {
                ((Number)object1).intValue();
                ((ContextMenuScope)this.y).Content$foundation_release(((ContextMenuColors)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 27: {
                ((Number)object1).intValue();
                CompositionLocalKt.CompositionLocalProvider(((ProvidedValue[])Arrays.copyOf(((ProvidedValue[])this.y), ((ProvidedValue[])this.y).length)), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                CompositionLocalKt.CompositionLocalProvider(((ProvidedValue)this.y), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}


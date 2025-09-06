package androidx.compose.foundation.text.selection;

import android.view.View;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material.AlertDialogKt;
import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material.BackdropValue;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import com.kakao.kandinsky.base.ConsumeKDEventKt;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.ui.EffectMenuKt;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kandinsky.selector.SelectorGridKt;
import com.kakao.kandinsky.sticker.StickerScreenKt;
import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.contract.StickerSizeType;
import com.kakao.kandinsky.sticker.ui.StickerListKt;
import com.kakao.kandinsky.text.TextScreenKt;
import com.kakao.kandinsky.text.TextViewModel;
import d0.f0;
import h1.f;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.SharedFlow;

public final class a extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final int x;
    public final Object y;
    public final Object z;

    public a(int v, int v1, Object object0, Object object1, Object object2) {
        this.w = v1;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.x = v;
        super(2);
    }

    public a(Object object0, Function2 function20, Function2 function21, int v, int v1) {
        this.w = v1;
        this.y = object0;
        this.A = function20;
        this.z = function21;
        this.x = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                AndroidSelectionHandles_androidKt.HandlePopup(((OffsetProvider)this.y), ((Alignment)this.z), ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ExposedDropdownMenu_androidKt.access$SoftKeyboardListener(((View)this.y), ((Density)this.z), ((Function0)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                CompositionLocalsKt.ProvideCommonCompositionLocals(((Owner)this.y), ((UriHandler)this.z), ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ((f0)this.y).SaveableStateProvider(this.z, ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                ((ComposableLambdaImpl)this.y).invoke(this.z, this.A, ((Composer)object0), this.x & -920350135 | ((0x24924924 & this.x) >> 1 | 306783378 & this.x) | (306783378 & this.x) << 1 & (0x24924924 & this.x) | 1);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                EffectMenuKt.EffectMenu(((Effect)this.y), ((EffectMenu)this.z), ((Function1)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                ((f)this.y).SaveableStateProvider(this.z, ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                LifecycleEffectKt.access$LifecycleResumeEffectImpl(((LifecycleOwner)this.y), ((LifecycleResumePauseEffectScope)this.z), ((Function1)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 8: {
                ((Number)object1).intValue();
                LifecycleEffectKt.access$LifecycleStartEffectImpl(((LifecycleOwner)this.y), ((LifecycleStartStopEffectScope)this.z), ((Function1)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 9: {
                ((Number)object1).intValue();
                CoreTextFieldKt.a(((Modifier)this.y), ((TextFieldSelectionManager)this.z), ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 10: {
                ((Number)object1).intValue();
                Object[] arr_object = Arrays.copyOf(((Object[])this.z), ((Object[])this.z).length);
                ((TextLinkScope)this.y).a(arr_object, ((Function1)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 11: {
                ((Number)object1).intValue();
                MosaicScreenKt.MosaicScreen(((MosaicViewModel)this.y), ((Function1)this.z), ((Function0)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 12: {
                ((Number)object1).intValue();
                NavBackStackEntryProviderKt.LocalOwnersProvider(((NavBackStackEntry)this.y), ((SaveableStateHolder)this.z), ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 13: {
                ((Number)object1).intValue();
                AlertDialogKt.AlertDialogBaselineLayout(((ColumnScope)this.y), ((Function2)this.A), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 14: {
                ((Number)object1).intValue();
                BackdropScaffoldKt.access$BackLayerTransition(((BackdropValue)this.y), ((Function2)this.A), ((Function2)this.z), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 15: {
                ((Number)object1).intValue();
                ConsumeKDEventKt.ConsumeEvent(((SharedFlow)this.y), ((Function1)this.z), ((Function0)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 16: {
                ((Number)object1).intValue();
                ReSizeScreenKt.ConsumeEvent(((SharedFlow)this.y), ((Function0)this.z), ((Function2)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 17: {
                ((Number)object1).intValue();
                SelectorGridKt.SelectorGrid(((Modifier)this.y), ((List)this.z), ((Function4)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 18: {
                ((Number)object1).intValue();
                CanvasKt.Canvas(((Modifier)this.y), ((String)this.z), ((Function1)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 19: {
                ((Number)object1).intValue();
                StickerScreenKt.StickerScreen(((StickerViewModel)this.y), ((Function1)this.z), ((Function0)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 20: {
                ((Number)object1).intValue();
                StickerListKt.StickerList(((ImmutableList)this.y), ((StickerSizeType)this.z), ((Function1)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            case 21: {
                ((Number)object1).intValue();
                TextScreenKt.access$TextMenu(((Function0)this.y), ((Function0)this.z), ((Function0)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                TextScreenKt.TextScreen(((TextViewModel)this.y), ((Function1)this.z), ((Function0)this.A), ((Composer)object0), (this.x | 1) & -920350135 | ((0x24924924 & (this.x | 1)) >> 1 | 306783378 & (this.x | 1)) | (306783378 & (this.x | 1)) << 1 & (0x24924924 & (this.x | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}


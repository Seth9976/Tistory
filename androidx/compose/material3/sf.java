package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.material.ListItemKt;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.designsystem.common.MenuListKt;
import com.kakao.kandinsky.designsystem.common.PreviewSpacerKt;
import com.kakao.kandinsky.home.HomeScreenKt;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class sf extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int w;
    public final Object x;
    public final int y;
    public final int z;

    public sf(int v, Object object0, int v1, Object object1, int v2, Object object2) {
        this.w = v2;
        this.A = object0;
        this.B = object1;
        this.x = object2;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public sf(LazyLayoutItemProvider lazyLayoutItemProvider0, Object object0, int v, Object object1, int v1) {
        this.w = 7;
        this.A = lazyLayoutItemProvider0;
        this.B = object0;
        this.y = v;
        this.x = object1;
        this.z = v1;
        super(2);
    }

    public sf(Modifier modifier0, ScrollState scrollState0, Function2 function20, int v, int v1) {
        this.w = 4;
        this.x = modifier0;
        this.B = scrollState0;
        this.A = function20;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public sf(Modifier modifier0, Object object0, Object object1, int v, int v1, int v2) {
        this.w = v2;
        this.x = modifier0;
        this.A = object0;
        this.B = object1;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public sf(Object object0, int v, LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, Function2 function20, int v1) {
        this.w = 8;
        this.B = object0;
        this.y = v;
        this.x = lazyLayoutPinnedItemList0;
        this.A = function20;
        this.z = v1;
        super(2);
    }

    public sf(Object object0, Modifier modifier0, Object object1, int v, int v1, int v2) {
        this.w = v2;
        this.A = object0;
        this.x = modifier0;
        this.B = object1;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public sf(Object object0, Object object1, Function2 function20, int v, int v1, int v2) {
        this.w = v2;
        this.B = object0;
        this.x = object1;
        this.A = function20;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public sf(List list0, int v, Function1 function10, Function0 function00, int v1) {
        this.w = 16;
        this.A = list0;
        this.y = v;
        this.B = function10;
        this.x = function00;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                NavigationDrawerKt.PermanentNavigationDrawer(((Function2)this.A), ((Modifier)this.x), ((Function2)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                SnackbarHostKt.a(((SnackbarData)this.A), ((Modifier)this.x), ((Function3)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                SnackbarHostKt.SnackbarHost(((SnackbarHostState)this.A), ((Modifier)this.x), ((Function3)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                TimePickerKt.TimeInput(((TimePickerState)this.A), ((Modifier)this.x), ((TimePickerColors)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                MenuListKt.MenuList(((Modifier)this.x), ((ScrollState)this.B), ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                PreviewSpacerKt.PreviewSpacer(((ColumnScope)this.A), ((PaddingValues)this.B), ((Function1)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 6: {
                ((Number)object1).intValue();
                PreviewSpacerKt.PreviewSpacer(((RowScope)this.A), ((PaddingValues)this.B), ((Function1)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 7: {
                ((Number)object1).intValue();
                LazyLayoutItemContentFactoryKt.access$SkippableItem-JVlU9Rs(((LazyLayoutItemProvider)this.A), this.B, this.y, this.x, ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 8: {
                ((Number)object1).intValue();
                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(this.B, this.y, ((LazyLayoutPinnedItemList)this.x), ((Function2)this.A), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 9: {
                ((Number)object1).intValue();
                TextStyleAndFontPanelKt.access$AlignButton-aezQfng(((Modifier)this.x), ((TextAlign)this.A), ((Function1)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 10: {
                ((Number)object1).intValue();
                HomeScreenKt.access$BottomBar(((ScrollState)this.A), ((List)this.B), ((Function1)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 11: {
                ((Number)object1).intValue();
                NavHostKt.NavHost(((NavHostController)this.A), ((NavGraph)this.B), ((Modifier)this.x), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 12: {
                ((Number)object1).intValue();
                PreviewTextureViewKt.PreviewTextureView(((Modifier)this.x), ((PreviewTextureLoader)this.A), ((KDPhoto)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 13: {
                ((Number)object1).intValue();
                ListItemKt.access$BaselinesOffsetColumn(((List)this.B), ((Modifier)this.x), ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 14: {
                ((Number)object1).intValue();
                androidx.compose.material.SnackbarHostKt.a(((androidx.compose.material.SnackbarData)this.A), ((Modifier)this.x), ((Function3)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 15: {
                ((Number)object1).intValue();
                androidx.compose.material.SnackbarHostKt.SnackbarHost(((androidx.compose.material.SnackbarHostState)this.A), ((Modifier)this.x), ((Function3)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 16: {
                ((Number)object1).intValue();
                SingleImageSelectorKt.SingleImageSelector(((List)this.A), this.y, ((Function1)this.B), ((Function0)this.x), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
                return Unit.INSTANCE;
            }
            case 17: {
                ((Number)object1).intValue();
                ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(((Function0)this.B), ((PopupPositionProvider)this.x), ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 18: {
                ((Number)object1).intValue();
                AndroidView_androidKt.AndroidView(((Function1)this.A), ((Modifier)this.x), ((Function1)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 19: {
                ((Number)object1).intValue();
                AndroidDialog_androidKt.Dialog(((Function0)this.B), ((DialogProperties)this.x), ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 20: {
                ((Number)object1).intValue();
                ContextMenuUi_androidKt.ContextMenuColumn(((ContextMenuColors)this.A), ((Modifier)this.x), ((Function3)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            case 21: {
                ((Number)object1).intValue();
                LayoutKt.MultiMeasureLayout(((Modifier)this.x), ((Function2)this.A), ((MeasurePolicy)this.B), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                SubcomposeLayoutKt.SubcomposeLayout(((SubcomposeLayoutState)this.B), ((Modifier)this.x), ((Function2)this.A), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
                return Unit.INSTANCE;
            }
        }
    }
}


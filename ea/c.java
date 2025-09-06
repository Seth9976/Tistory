package ea;

import aa.w;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.FilterTracker;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.ViewTypeTrackerKt;
import com.kakao.kandinsky.sticker.StickerScreenKt;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import com.kakao.kandinsky.sticker.ui.StickerListKt;
import com.kakao.kandinsky.sticker.ui.StickerTabBarKt;
import com.kakao.kandinsky.text.ComposableSingletons.TextScreenKt;
import com.kakao.kandinsky.text.TextScreenKt;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import w0.i1;

public final class c extends Lambda implements Function2 {
    public final int w;
    public final State x;

    public c(State state0, int v) {
        this.w = v;
        this.x = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).floatValue();
                Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$EffectSlider");
                EffectMenu effectMenu0 = FilterScreenKt.access$FilterScreen$lambda$0(this.x).getEffectMenu();
                FilterTracker.INSTANCE.effectTrackerClickEvent(effectMenu0, true);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).floatValue();
                Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$FilterSlider");
                String s = FilterScreenKt.access$FilterScreen$lambda$0(this.x).getFilter().getFilterId();
                FilterTracker.INSTANCE.filterTrackerClickEvent(s, true);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).floatValue();
                Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$KDSlider");
                String s1 = ViewTypeTrackerKt.getMainTrackerLayer(MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getViewType());
                String s2 = ViewTypeTrackerKt.getSlideTrackerLayer(MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getViewType());
                KDTracker.clickEvent$default(KDTracker.INSTANCE, s1, s2, null, null, 12, null);
                return Unit.INSTANCE;
            }
            case 3: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1347607057, v1, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:112)");
                }
                ExposedDropdownMenuPopup_androidKt.access$ExposedDropdownMenuPopup$lambda$0(this.x).invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xE030C439, v2, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                }
                AndroidDialog_androidKt.access$Dialog$lambda$0(this.x).invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(606497925, v3, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                }
                AndroidPopup_androidKt.access$Popup$lambda$1(this.x).invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 6: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xEA170CC7, v4, -1, "com.kakao.kandinsky.sticker.StickerScreen.<anonymous> (StickerScreen.kt:28)");
                }
                State state1 = this.x;
                ImmutableList immutableList0 = StickerScreenKt.access$StickerScreen$lambda$0(state1).getGroupList();
                StickerGroup stickerGroup0 = StickerScreenKt.access$StickerScreen$lambda$0(state1).getSelectStickerGroup();
                ((Composer)object0).startReplaceGroup(0xE0D31454);
                boolean z5 = ((Composer)object0).changed(state1);
                w w0 = ((Composer)object0).rememberedValue();
                if(z5 || w0 == Composer.Companion.getEmpty()) {
                    w0 = new w(state1, 19);
                    ((Composer)object0).updateRememberedValue(w0);
                }
                ((Composer)object0).endReplaceGroup();
                ((Composer)object0).startReplaceGroup(0xE0D31567);
                boolean z6 = ((Composer)object0).changed(state1);
                i1 i15 = ((Composer)object0).rememberedValue();
                if(z6 || i15 == Composer.Companion.getEmpty()) {
                    i15 = new i1(state1, 2);
                    ((Composer)object0).updateRememberedValue(i15);
                }
                ((Composer)object0).endReplaceGroup();
                ((Composer)object0).startReplaceGroup(0xE0D31630);
                boolean z7 = ((Composer)object0).changed(state1);
                i1 i16 = ((Composer)object0).rememberedValue();
                if(z7 || i16 == Composer.Companion.getEmpty()) {
                    i16 = new i1(state1, 3);
                    ((Composer)object0).updateRememberedValue(i16);
                }
                ((Composer)object0).endReplaceGroup();
                StickerTabBarKt.StickerTabBar(immutableList0, stickerGroup0, w0, i15, i16, ((Composer)object0), 0);
                StickerListKt.StickerList(StickerScreenKt.access$StickerScreen$lambda$0(state1).getItemList(), StickerScreenKt.access$StickerScreen$lambda$0(state1).getSelectStickerGroup().getSizeType(), StickerScreenKt.access$StickerScreen$lambda$0(state1).getAddSticker(), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                Composer composer0 = (Composer)object0;
                int v = ((Number)object1).intValue();
                if((v & 11) == 2 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1906187539, v, -1, "com.kakao.kandinsky.text.TextScreen.<anonymous>.<anonymous> (TextScreen.kt:48)");
                }
                composer0.startReplaceGroup(1040272987);
                State state0 = this.x;
                boolean z = composer0.changed(state0);
                i1 i10 = composer0.rememberedValue();
                if(z || i10 == Composer.Companion.getEmpty()) {
                    i10 = new i1(state0, 10);
                    composer0.updateRememberedValue(i10);
                }
                composer0.endReplaceGroup();
                composer0.startReplaceGroup(1040273058);
                boolean z1 = composer0.changed(state0);
                i1 i11 = composer0.rememberedValue();
                if(z1 || i11 == Composer.Companion.getEmpty()) {
                    i11 = new i1(state0, 11);
                    composer0.updateRememberedValue(i11);
                }
                composer0.endReplaceGroup();
                composer0.startReplaceGroup(1040273134);
                boolean z2 = composer0.changed(state0);
                i1 i12 = composer0.rememberedValue();
                if(z2 || i12 == Composer.Companion.getEmpty()) {
                    i12 = new i1(state0, 12);
                    composer0.updateRememberedValue(i12);
                }
                composer0.endReplaceGroup();
                TextScreenKt.access$TextMenu(i10, i11, i12, composer0, 0);
                composer0.startReplaceGroup(1040273240);
                boolean z3 = composer0.changed(state0);
                i1 i13 = composer0.rememberedValue();
                if(z3 || i13 == Composer.Companion.getEmpty()) {
                    i13 = new i1(state0, 13);
                    composer0.updateRememberedValue(i13);
                }
                composer0.endReplaceGroup();
                composer0.startReplaceGroup(0x3E01507F);
                boolean z4 = composer0.changed(state0);
                i1 i14 = composer0.rememberedValue();
                if(z4 || i14 == Composer.Companion.getEmpty()) {
                    i14 = new i1(state0, 14);
                    composer0.updateRememberedValue(i14);
                }
                composer0.endReplaceGroup();
                FeatureBottomBarKt.CommonFeatureBottomBar(false, i13, i14, null, ComposableSingletons.TextScreenKt.INSTANCE.getLambda-1$text_release(), composer0, 0x6000, 9);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}


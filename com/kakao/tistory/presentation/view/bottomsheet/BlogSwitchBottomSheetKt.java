package com.kakao.tistory.presentation.view.bottomsheet;

import android.content.res.Configuration;
import android.view.Window;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetModalKt;
import com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\u001A3\u0010\u0000\u001A\u00020\u00012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000B\u001A\u00020\fX\u008A\u0084\u0002"}, d2 = {"BlogSwitchBottomSheetModal", "", "window", "Landroid/view/Window;", "section", "", "page", "blogSwitchViewModel", "Lcom/kakao/tistory/presentation/viewmodel/BlogSwitchViewModel;", "(Landroid/view/Window;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogSwitchViewModel;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease", "showBottomSheet", ""}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogSwitchBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/view/bottomsheet/BlogSwitchBottomSheetKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,85:1\n55#2,11:86\n77#3:97\n77#3:100\n148#4:98\n158#4:99\n56#5:101\n1223#6,6:102\n81#7:108\n*S KotlinDebug\n*F\n+ 1 BlogSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/view/bottomsheet/BlogSwitchBottomSheetKt\n*L\n32#1:86,11\n34#1:97\n39#1:100\n35#1:98\n36#1:99\n40#1:101\n46#1:102,6\n43#1:108\n*E\n"})
public final class BlogSwitchBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogSwitchBottomSheetModal(@Nullable Window window0, @NotNull String s, @NotNull String s1, @Nullable BlogSwitchViewModel blogSwitchViewModel0, @Nullable Composer composer0, int v, int v1) {
        BlogSwitchViewModel blogSwitchViewModel1;
        Window window1;
        int v4;
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        Composer composer1 = composer0.startRestartGroup(-1671730412);
        int v2 = (v1 & 1) == 0 ? v : v | 2;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x400;
        }
        int v3 = v2;
        if((v1 & 9) != 9 || (v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                window1 = (v1 & 1) == 0 ? window0 : null;
                if((v1 & 8) == 0) {
                    v4 = v3;
                    blogSwitchViewModel1 = blogSwitchViewModel0;
                }
                else {
                    composer1.startReplaceableGroup(0x671A9C9B);
                    ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, 6);
                    if(viewModelStoreOwner0 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
                    ViewModel viewModel0 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(BlogSwitchViewModel.class), viewModelStoreOwner0, null, null, creationExtras0, composer1, 0, 0);
                    composer1.endReplaceableGroup();
                    blogSwitchViewModel1 = (BlogSwitchViewModel)viewModel0;
                    v4 = v3 & 0xFFFFE3FF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                window1 = window0;
                v4 = v3;
                blogSwitchViewModel1 = blogSwitchViewModel0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671730412, v4, -1, "com.kakao.tistory.presentation.view.bottomsheet.BlogSwitchBottomSheetModal (BlogSwitchBottomSheet.kt:32)");
            }
            float f = Dp.constructor-impl(Dp.constructor-impl(((Configuration)composer1.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) - 286.5f);
            int v5 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(f);
            State state0 = LiveDataAdapterKt.observeAsState(blogSwitchViewModel1.getShowBlogSwitchBottomSheet(), Boolean.FALSE, composer1, 56);
            SwipeableState swipeableState0 = SwipeableKt.rememberSwipeableState(BottomSheetValue.Closed, null, null, composer1, 6, 6);
            Boolean boolean0 = (Boolean)state0.getValue();
            boolean0.getClass();
            composer1.startReplaceGroup(-833830546);
            boolean z = composer1.changed(state0);
            boolean z1 = composer1.changed(swipeableState0);
            j j0 = composer1.rememberedValue();
            if(z || z1 || j0 == Composer.Companion.getEmpty()) {
                j0 = new j(swipeableState0, state0, null);
                composer1.updateRememberedValue(j0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, j0, composer1, 0x40);
            BottomSheetModalKt.BottomSheetModal(window1, swipeableState0, v5, new k(blogSwitchViewModel1), ComposableLambdaKt.rememberComposableLambda(0xEC1E242A, true, new o(s, s1, blogSwitchViewModel1), composer1, 54), composer1, 0x6008, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            window1 = window0;
            blogSwitchViewModel1 = blogSwitchViewModel0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(window1, s, s1, blogSwitchViewModel1, v, v1));
        }
    }

    public static final boolean access$BlogSwitchBottomSheetModal$lambda$1(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }
}


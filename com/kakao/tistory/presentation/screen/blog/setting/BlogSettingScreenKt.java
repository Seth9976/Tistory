package com.kakao.tistory.presentation.screen.blog.setting;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.blog.BlogConsumeEventKt;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogUiState;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingUiState;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BottomSheetType.Image;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BottomSheetType;
import com.kakao.tistory.presentation.screen.blog.setting.contract.DialogType.Alert;
import com.kakao.tistory.presentation.screen.blog.setting.contract.DialogType.ImageMaxOver;
import com.kakao.tistory.presentation.screen.blog.setting.contract.DialogType;
import com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara;
import com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingImageKt;
import com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingTopAppBarKt;
import com.kakao.tistory.presentation.screen.blog.setting.ui.ImageBottomSheetKt;
import com.kakao.tistory.presentation.screen.blog.setting.util.GalleryPermissionLauncherKt;
import com.kakao.tistory.presentation.screen.blog.setting.util.ImagePickLauncherKt;
import com.kakao.tistory.presentation.screen.item.ViewState.Loading;
import com.kakao.tistory.presentation.screen.item.ViewState;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.common.CommonTextFieldKt;
import com.kakao.tistory.presentation.widget.dialog.AlertDialogData;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeDialogKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A)\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\f\u0010\n\u001A\u00020\t8\nX\u008A\u0084\u0002²\u0006\f\u0010\f\u001A\u00020\u000B8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "navActions", "Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;", "blogViewModel", "Lcom/kakao/tistory/presentation/screen/blog/setting/BlogSettingViewModel;", "blogSettingViewModel", "", "BlogSettingScreen", "(Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;Lcom/kakao/tistory/presentation/screen/blog/setting/BlogSettingViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "blogUiState", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingUiState;", "uiState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogSettingScreen.kt\ncom/kakao/tistory/presentation/screen/blog/setting/BlogSettingScreenKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n46#2,7:234\n86#3,6:241\n1223#4,6:247\n1223#4,6:289\n1223#4,6:346\n85#5:253\n82#5,6:254\n88#5:288\n85#5:295\n82#5,6:296\n88#5:330\n92#5:341\n92#5:345\n78#6,6:260\n85#6,4:275\n89#6,2:285\n78#6,6:302\n85#6,4:317\n89#6,2:327\n93#6:340\n93#6:344\n368#7,9:266\n377#7:287\n368#7,9:308\n377#7:329\n378#7,2:338\n378#7,2:342\n4032#8,6:279\n4032#8,6:321\n148#9:331\n148#9:332\n148#9:333\n148#9:334\n148#9:335\n148#9:336\n148#9:337\n77#10:352\n81#11:353\n81#11:354\n*S KotlinDebug\n*F\n+ 1 BlogSettingScreen.kt\ncom/kakao/tistory/presentation/screen/blog/setting/BlogSettingScreenKt\n*L\n59#1:234,7\n59#1:241,6\n66#1:247,6\n84#1:289,6\n190#1:346,6\n75#1:253\n75#1:254,6\n75#1:288\n88#1:295\n88#1:296,6\n88#1:330\n88#1:341\n75#1:345\n75#1:260,6\n75#1:275,4\n75#1:285,2\n88#1:302,6\n88#1:317,4\n88#1:327,2\n88#1:340\n75#1:344\n75#1:266,9\n75#1:287\n88#1:308,9\n88#1:329\n88#1:338,2\n75#1:342,2\n75#1:279,6\n88#1:321,6\n93#1:331\n105#1:332\n118#1:333\n121#1:334\n134#1:335\n137#1:336\n157#1:337\n203#1:352\n61#1:353\n62#1:354\n*E\n"})
public final class BlogSettingScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogSettingScreen(@NotNull NavActions navActions0, @NotNull BlogViewModel blogViewModel0, @Nullable BlogSettingViewModel blogSettingViewModel0, @Nullable Composer composer0, int v, int v1) {
        BlogSettingViewModel blogSettingViewModel1;
        int v2;
        Intrinsics.checkNotNullParameter(navActions0, "navActions");
        Intrinsics.checkNotNullParameter(blogViewModel0, "blogViewModel");
        Composer composer1 = composer0.startRestartGroup(0xA6076D70);
        if((v1 & 4) == 0) {
            blogSettingViewModel1 = blogSettingViewModel0;
            v2 = v;
        }
        else {
            composer1.startReplaceableGroup(0x70B323C8);
            ViewModelStoreOwner viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer1, LocalViewModelStoreOwner.$stable);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner0, composer1, 0);
            composer1.startReplaceableGroup(0x671A9C9B);
            CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
            ViewModel viewModel0 = ViewModelKt.viewModel(BlogSettingViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            v2 = v & -897;
            blogSettingViewModel1 = (BlogSettingViewModel)viewModel0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA6076D70, v2, -1, "com.kakao.tistory.presentation.screen.blog.setting.BlogSettingScreen (BlogSettingScreen.kt:59)");
        }
        State state0 = SnapshotStateKt.collectAsState(blogViewModel0.getUiState(), null, composer1, 8, 1);
        State state1 = SnapshotStateKt.collectAsState(blogSettingViewModel1.getUiState(), null, composer1, 8, 1);
        ViewState viewState0 = ((BlogUiState)state0.getValue()).getState();
        composer1.startReplaceGroup(0x90C72C60);
        boolean z = composer1.changed(viewState0);
        boolean z1 = (v & 14 ^ 6) > 4 && composer1.changed(navActions0) || (v & 6) == 4;
        boolean z2 = composer1.changed(state1);
        a a0 = composer1.rememberedValue();
        if((z | z1 | z2) != 0 || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(viewState0, navActions0, state1, null);
            composer1.updateRememberedValue(a0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(viewState0, a0, composer1, 0x40);
        TopAppBarScrollBehavior topAppBarScrollBehavior0 = TopAppBarDefaults.INSTANCE.pinnedScrollBehavior(null, null, composer1, TopAppBarDefaults.$stable << 6, 3);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), topAppBarScrollBehavior0.getNestedScrollConnection(), null, 2, null), 0L, null, 2, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        boolean z3 = ((BlogSettingUiState)state1.getValue()).getCompleteButtonEnabled();
        Function0 function01 = ((BlogSettingUiState)state1.getValue()).getOnClickComplete();
        composer1.startReplaceGroup(0xB74063CC);
        boolean z4 = composer1.changed(state0);
        b b0 = composer1.rememberedValue();
        if(z4 || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(state0);
            composer1.updateRememberedValue(b0);
        }
        composer1.endReplaceGroup();
        BlogSettingTopAppBarKt.BlogSettingTopAppBar(z3, function01, b0, topAppBarScrollBehavior0, composer1, 0);
        Modifier modifier2 = ScrollKt.verticalScroll$default(modifier$Companion0, ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
        Function0 function02 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function02);
        }
        else {
            composer1.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        BlogSettingImageKt.BlogSettingImage(((BlogSettingUiState)state1.getValue()).getImageUrl(), ((BlogSettingUiState)state1.getValue()).getOnClickImage(), composer1, 0);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 18.0f), composer1, 6);
        TextStyle textStyle0 = new TextStyle(0L, 0x141500000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0x1BDCCCCCDL, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 0xF7FF58, null);
        Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
        CommonTextFieldKt.CommonTextField(((BlogSettingUiState)state1.getValue()).getBlogTitle(), ((BlogSettingUiState)state1.getValue()).getOnChangeBlogTitle(), StringResources_androidKt.stringResource(string.label_blog_setting_name, composer1, 0), modifier4, textStyle0, null, 4, ((BlogSettingUiState)state1.getValue()).getBlogTitleMaxLength(), new KeyboardOptions(0, null, 1, 7, null, null, null, 0x73, null), null, null, null, null, false, false, null, false, null, composer1, 0x6180C00, 0, 0x3FE20);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 18.0f), composer1, 6);
        Modifier modifier5 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
        CommonTextFieldKt.CommonTextField(((BlogSettingUiState)state1.getValue()).getBlogDescription(), ((BlogSettingUiState)state1.getValue()).getOnChangeBlogDescription(), StringResources_androidKt.stringResource(string.label_blog_setting_description, composer1, 0), modifier5, textStyle0, null, 6, ((BlogSettingUiState)state1.getValue()).getBlogDescriptionMaxLength(), new KeyboardOptions(0, null, 1, 7, null, null, null, 0x73, null), null, null, null, null, false, false, null, false, null, composer1, 0x6180C00, 0, 0x3FE20);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 20.0f), composer1, 6);
        Modifier modifier6 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
        TextFieldValue textFieldValue0 = ((BlogSettingUiState)state1.getValue()).getNickname();
        Function1 function10 = ((BlogSettingUiState)state1.getValue()).getOnChangeNickName();
        String s = StringResources_androidKt.stringResource(string.label_blog_setting_nick_name, composer1, 0);
        int v5 = ((BlogSettingUiState)state1.getValue()).getNicknameMaxLength();
        int v6 = ((BlogSettingUiState)state1.getValue()).isValidNickname() ? drawable.ic_input_check_a_os : drawable.ic_input_setting_delete_a_os;
        boolean z5 = ((BlogSettingUiState)state1.getValue()).getNicknameErrorMessage() != null;
        String s1 = ((BlogSettingUiState)state1.getValue()).getNicknameErrorMessage();
        Function0 function03 = ((BlogSettingUiState)state1.getValue()).getOnClickNicknameClear();
        CommonTextFieldKt.CommonTextField(textFieldValue0, function10, s, modifier6, textStyle0, null, 1, v5, new KeyboardOptions(0, null, 1, 7, null, null, null, 0x73, null), null, null, v6, null, false, z5, s1, false, function03, composer1, 0x6180C00, 0, 0x13620);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 64.0f), composer1, 6);
        composer1.endNode();
        composer1.endNode();
        BottomSheetType bottomSheetType0 = ((BlogSettingUiState)state1.getValue()).getBottomSheet();
        composer1.startReplaceGroup(0x90C8F744);
        if(bottomSheetType0 != null) {
            composer1.startReplaceGroup(0x90C8F8F0);
            if(Intrinsics.areEqual(bottomSheetType0, Image.INSTANCE)) {
                ImageBottomSheetKt.ImageBottomSheet(((BlogSettingUiState)state1.getValue()).getOnClickImageDelete(), ((BlogSettingUiState)state1.getValue()).getOnClickShowGallery(), ((BlogSettingUiState)state1.getValue()).getOnDismissBottomSheet(), composer1, 0);
            }
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        DialogType dialogType0 = ((BlogSettingUiState)state1.getValue()).getDialog();
        composer1.startReplaceGroup(0x90C91E90);
        if(dialogType0 != null) {
            if(dialogType0 instanceof Alert) {
                composer1.startReplaceGroup(-1220407099);
                TistoryComposeDialogKt.TistoryAlertDialog(((AlertDialogData)dialogType0), ((BlogSettingUiState)state1.getValue()).getOnDismissDialog(), composer1, 0);
            }
            else if(Intrinsics.areEqual(dialogType0, ImageMaxOver.INSTANCE)) {
                composer1.startReplaceGroup(0x3101B84A);
                TistoryComposeDialogKt.TistoryAlertDialog(StringResources_androidKt.stringResource(string.label_dialog_image_size_MB, new Object[]{String.valueOf(((BlogSettingUiState)state1.getValue()).getImageMaxSize() / 0x400L / 0x400L)}, composer1, 0x40), null, false, ((BlogSettingUiState)state1.getValue()).getOnDismissDialog(), 0, 0, false, false, null, null, composer1, 0, 0x3F6);
            }
            else {
                composer1.startReplaceGroup(0x310576BF);
            }
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x90C95363);
        if(viewState0 instanceof Loading) {
            LoadingDialogKt.LoadingDialog(composer1, 0);
        }
        composer1.endReplaceGroup();
        BlogConsumeEventKt.BlogConsumeEvent(blogViewModel0, navActions0, composer1, v2 << 3 & 0x70 | 8);
        BlogSettingUiState blogSettingUiState0 = (BlogSettingUiState)state1.getValue();
        composer1.startReplaceGroup(0x90C971BD);
        boolean z6 = composer1.changed(state0);
        c c0 = composer1.rememberedValue();
        if(z6 || c0 == Composer.Companion.getEmpty()) {
            c0 = new c(state0);
            composer1.updateRememberedValue(c0);
        }
        composer1.endReplaceGroup();
        BlogSettingScreenKt.a(blogSettingViewModel1, blogSettingUiState0, navActions0, c0, composer1, v2 << 6 & 0x380 | 8);
        BlogSettingTiara.INSTANCE.TrackPage(composer1, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.blog.setting.d(navActions0, blogViewModel0, blogSettingViewModel1, v, v1));
        }
    }

    public static final void a(BlogSettingViewModel blogSettingViewModel0, BlogSettingUiState blogSettingUiState0, NavActions navActions0, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2AB1BF44);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2AB1BF44, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.ConsumeEvent (BlogSettingScreen.kt:201)");
        }
        Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        i i0 = new i(ImagePickLauncherKt.rememberImagePickLauncher(blogSettingUiState0.getChangeImageFileUrl(), null, composer1, 0, 2), context0);
        EffectsKt.LaunchedEffect(blogSettingViewModel0, new f(blogSettingViewModel0, function10, navActions0, context0, i0, new h(GalleryPermissionLauncherKt.rememberGalleryPermissionLauncher(context0, i0, blogSettingUiState0.getShowPermissionErrorDialog(), composer1, 8, 0)), null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(blogSettingViewModel0, blogSettingUiState0, navActions0, function10, v));
        }
    }

    public static final BlogUiState access$BlogSettingScreen$lambda$0(State state0) {
        return (BlogUiState)state0.getValue();
    }

    public static final BlogSettingUiState access$BlogSettingScreen$lambda$1(State state0) {
        return (BlogSettingUiState)state0.getValue();
    }
}


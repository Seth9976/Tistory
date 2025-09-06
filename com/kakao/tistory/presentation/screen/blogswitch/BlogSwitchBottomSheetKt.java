package com.kakao.tistory.presentation.screen.blogswitch;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import c;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A[\u0010\f\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000F\u001A\u00020\u000E8\nX\u008A\u0084\u0002"}, d2 = {"", "section", "page", "Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "type", "Lkotlin/Function0;", "", "onClickSetting", "onClickBlog", "onDismiss", "Lcom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchViewModel;", "blogSwitchViewModel", "BlogSwitchBottomSheet", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchViewModel;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchState;", "uiState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogSwitchBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchBottomSheetKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,576:1\n46#2,7:577\n86#3,6:584\n1223#4,6:590\n1223#4,6:596\n1223#4,6:603\n1223#4,6:611\n158#5:602\n148#5:609\n148#5:610\n148#5:617\n148#5:618\n148#5:619\n148#5:656\n148#5:657\n148#5:658\n148#5:659\n148#5:664\n158#5:666\n148#5:706\n148#5:707\n148#5:744\n148#5:745\n148#5:782\n148#5:783\n148#5:788\n148#5:789\n98#6:620\n95#6,6:621\n101#6:655\n105#6:663\n98#6:708\n95#6,6:709\n101#6:743\n98#6:746\n95#6,6:747\n101#6:781\n105#6:787\n105#6:833\n78#7,6:627\n85#7,4:642\n89#7,2:652\n93#7:662\n78#7,6:673\n85#7,4:688\n89#7,2:698\n93#7:704\n78#7,6:715\n85#7,4:730\n89#7,2:740\n78#7,6:753\n85#7,4:768\n89#7,2:778\n93#7:786\n78#7,6:797\n85#7,4:812\n89#7,2:822\n93#7:828\n93#7:832\n368#8,9:633\n377#8:654\n378#8,2:660\n368#8,9:679\n377#8:700\n378#8,2:702\n368#8,9:721\n377#8:742\n368#8,9:759\n377#8:780\n378#8,2:784\n368#8,9:803\n377#8:824\n378#8,2:826\n378#8,2:830\n4032#9,6:646\n4032#9,6:692\n4032#9,6:734\n4032#9,6:772\n4032#9,6:816\n77#10:665\n71#11:667\n69#11,5:668\n74#11:701\n78#11:705\n71#11:790\n68#11,6:791\n74#11:825\n78#11:829\n81#12:834\n*S KotlinDebug\n*F\n+ 1 BlogSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchBottomSheetKt\n*L\n48#1:577,7\n48#1:584,6\n52#1:590,6\n56#1:596,6\n133#1:603,6\n152#1:611,6\n126#1:602\n134#1:609\n135#1:610\n153#1:617\n154#1:618\n163#1:619\n168#1:656\n171#1:657\n182#1:658\n186#1:659\n209#1:664\n285#1:666\n309#1:706\n329#1:707\n335#1:744\n338#1:745\n355#1:782\n356#1:783\n363#1:788\n366#1:789\n160#1:620\n160#1:621,6\n160#1:655\n160#1:663\n325#1:708\n325#1:709,6\n325#1:743\n340#1:746\n340#1:747,6\n340#1:781\n340#1:787\n325#1:833\n160#1:627,6\n160#1:642,4\n160#1:652,2\n160#1:662\n282#1:673,6\n282#1:688,4\n282#1:698,2\n282#1:704\n325#1:715,6\n325#1:730,4\n325#1:740,2\n340#1:753,6\n340#1:768,4\n340#1:778,2\n340#1:786\n365#1:797,6\n365#1:812,4\n365#1:822,2\n365#1:828\n325#1:832\n160#1:633,9\n160#1:654\n160#1:660,2\n282#1:679,9\n282#1:700\n282#1:702,2\n325#1:721,9\n325#1:742\n340#1:759,9\n340#1:780\n340#1:784,2\n365#1:803,9\n365#1:824\n365#1:826,2\n325#1:830,2\n160#1:646,6\n282#1:692,6\n325#1:734,6\n340#1:772,6\n365#1:816,6\n219#1:665\n282#1:667\n282#1:668,5\n282#1:701\n282#1:705\n365#1:790\n365#1:791,6\n365#1:825\n365#1:829\n50#1:834\n*E\n"})
public final class BlogSwitchBottomSheetKt {
    public static final Blog a;
    public static final Blog b;
    public static final Blog c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        Blog blog0 = new Blog(1L, null, null, null, null, null, "Owner Blog 1 - Very Looooooooooooooooooooooong Title Example", null, null, null, null, null, null, false, null, "owner", null, null, false, false, null, null, false, false, 0, false, null, 0x7FE7FBE, null);
        BlogSwitchBottomSheetKt.a = blog0;
        Blog blog1 = new Blog(2L, null, null, null, null, null, "Owner Blog 2", null, null, null, null, null, null, false, null, "owner", "https://via.placeholder.com/150", null, false, false, null, null, false, false, 0, false, null, 0x7FE7FBE, null);
        Blog blog2 = new Blog(3L, null, null, null, null, null, "Joined Blog 1", null, null, null, null, null, null, false, null, "member", null, null, false, false, null, null, false, false, 0, false, null, 0x7FE7FBE, null);
        BlogSwitchBottomSheetKt.b = blog2;
        Blog blog3 = new Blog(4L, null, null, null, null, null, "Joined Blog 2", null, null, null, null, null, null, false, null, "member", "https://via.placeholder.com/150", null, false, false, null, null, false, false, 0, false, null, 0x7FE7FBE, null);
        BlogSwitchBottomSheetKt.c = blog3;
        BlogSwitchBottomSheetKt.d = CollectionsKt__CollectionsKt.listOf(new Blog[]{blog0, blog1});
        BlogSwitchBottomSheetKt.e = CollectionsKt__CollectionsKt.listOf(new Blog[]{blog2, blog3});
        BlogSwitchBottomSheetKt.f = k.listOf(blog0);
        BlogSwitchBottomSheetKt.g = k.listOf(blog2);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogSwitchBottomSheet(@NotNull String s, @NotNull String s1, @NotNull BlogSwitchType blogSwitchType0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @Nullable BlogSwitchViewModel blogSwitchViewModel0, @Nullable Composer composer0, int v, int v1) {
        BlogSwitchViewModel blogSwitchViewModel1;
        int v3;
        BlogSwitchViewModel blogSwitchViewModel2;
        int v2;
        Intrinsics.checkNotNullParameter(s, "section");
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(blogSwitchType0, "type");
        Intrinsics.checkNotNullParameter(function00, "onClickSetting");
        Intrinsics.checkNotNullParameter(function01, "onClickBlog");
        Intrinsics.checkNotNullParameter(function02, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0xEB570A96);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(blogSwitchType0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function02) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x80000;
        }
        if((v1 & 0x40) != 0x40 || (0x2DB6DB & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) == 0) {
                    v3 = 0;
                    blogSwitchViewModel2 = blogSwitchViewModel0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    blogSwitchViewModel2 = blogSwitchViewModel0;
                    v3 = 0;
                }
            }
            else if((v1 & 0x40) == 0) {
                v3 = 0;
                blogSwitchViewModel2 = blogSwitchViewModel0;
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
                v3 = 0;
                ViewModel viewModel0 = ViewModelKt.viewModel(BlogSwitchViewModel.class, viewModelStoreOwner0, null, viewModelProvider$Factory0, creationExtras0, composer1, 0x9048, 0);
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
                v2 &= 0xFFC7FFFF;
                blogSwitchViewModel2 = (BlogSwitchViewModel)viewModel0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEB570A96, v2, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheet (BlogSwitchBottomSheet.kt:48)");
            }
            State state0 = SnapshotStateKt.collectAsState(blogSwitchViewModel2.getUiState(), null, composer1, 8, 1);
            composer1.startReplaceGroup(1312519880);
            boolean z = composer1.changed(state0);
            com.kakao.tistory.presentation.screen.blogswitch.k k0 = composer1.rememberedValue();
            if((v2 & 0x380) == 0x100 || z || k0 == Composer.Companion.getEmpty()) {
                k0 = new com.kakao.tistory.presentation.screen.blogswitch.k(blogSwitchType0, state0, null);
                composer1.updateRememberedValue(k0);
            }
            composer1.endReplaceGroup();
            int v4 = v2 >> 6 & 14 | 0x40;
            EffectsKt.LaunchedEffect(blogSwitchType0, k0, composer1, v4);
            composer1.startReplaceGroup(0x4E3B82CF);
            if((v2 & 0x70) == 0x20) {
                v3 = 1;
            }
            l l0 = composer1.rememberedValue();
            if((((v2 & 14) == 4 ? 1 : 0) | v3) != 0 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(s, s1, null);
                composer1.updateRememberedValue(l0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(s, s1, l0, composer1, v2 & 0x70 | (v2 & 14 | 0x200));
            EffectsKt.LaunchedEffect(blogSwitchViewModel2.getEvent(), new n(blogSwitchViewModel2, function02, function00, function01, null), composer1, 72);
            BlogSwitchBottomSheetKt.a(blogSwitchType0, ((BlogSwitchState)state0.getValue()), composer1, v4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            blogSwitchViewModel1 = blogSwitchViewModel2;
        }
        else {
            composer1.skipToGroupEnd();
            blogSwitchViewModel1 = blogSwitchViewModel0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(s, s1, blogSwitchType0, function00, function01, function02, blogSwitchViewModel1, v, v1));
        }
    }

    public static BlogSwitchState a(Blog blog0, Blog blog1, List list0, List list1, int v) {
        if((v & 1) != 0) {
            blog0 = BlogSwitchBottomSheetKt.a;
        }
        if((v & 2) != 0) {
            blog1 = BlogSwitchBottomSheetKt.a;
        }
        if((v & 4) != 0) {
            list0 = BlogSwitchBottomSheetKt.d;
        }
        if((v & 8) != 0) {
            list1 = BlogSwitchBottomSheetKt.e;
        }
        return new BlogSwitchState(blog1, blog0, list0, list1, null, i0.a, j0.a, 16, null);
    }

    public static final void a(Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1222301224);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1222301224, v2, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogListEmpty (BlogSwitchBottomSheet.kt:280)");
            }
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, 29.5f, 1, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_blog_switch_empty, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0x180, 0x180030, 0xF7FA);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(modifier1, v, v1));
        }
    }

    public static final void a(Blog blog0, Function0 function00, Composer composer0, int v) {
        ThumbnailUiState thumbnailUiState0;
        Composer composer1 = composer0.startRestartGroup(0x4B5A8611);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4B5A8611, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.CurrentBlog (BlogSwitchBottomSheet.kt:158)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        String s = null;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 28.0f, 8.0f, 20.0f);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function01);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        if(blog0 == null) {
            thumbnailUiState0 = null;
        }
        else {
            String s1 = blog0.getLogoImageUrl();
            thumbnailUiState0 = s1 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s1);
        }
        BlogThumbnailKt.BlogThumbnail-EUb7tLY(thumbnailUiState0, 56.0f, null, false, null, composer1, 0x30, 28);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 15.0f), composer1, 6);
        if(blog0 != null) {
            s = blog0.getTitle();
        }
        TextKt.Text--4IGK_g((s == null ? "" : s), RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, TTextStyle.INSTANCE.getSize16Weight500(), composer1, 0x180, 0x180C30, 0xD7F8);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 8.0f), composer1, 6);
        IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(modifier$Companion0, 48.0f), false, null, null, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v >> 3 & 14 | 0x30030, 28);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(blog0, function00, v));
        }
    }

    public static final void a(BlogSwitchType blogSwitchType0, BlogSwitchState blogSwitchState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x3F52D846);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F52D846, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheetContent (BlogSwitchBottomSheet.kt:76)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-2026679012, true, new p(blogSwitchType0, blogSwitchState0), composer1, 54), composer1, 0xC00, 7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(blogSwitchType0, blogSwitchState0, v));
        }
    }

    public static final void a(List list0, List list1, Blog blog0, Blog blog1, Function2 function20, Modifier modifier0, PaddingValues paddingValues0, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(1854724370);
        Modifier modifier1 = (v1 & 0x20) == 0 ? modifier0 : Modifier.Companion;
        PaddingValues paddingValues1 = (v1 & 0x40) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1854724370, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogList (BlogSwitchBottomSheet.kt:209)");
        }
        composer1.startReplaceGroup(-992054722);
        if(list0.isEmpty() && list1.isEmpty()) {
            BlogSwitchBottomSheetKt.a(modifier1, composer1, v >> 15 & 14, 0);
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.blogswitch.a(list0, list1, blog0, blog1, function20, modifier1, paddingValues1, v, v1));
            }
            return;
        }
        composer1.endReplaceGroup();
        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
        PaddingValues paddingValues2 = PaddingKt.PaddingValues-a9UjIt4$default(PaddingKt.calculateStartPadding(paddingValues1, layoutDirection0), 0.0f, PaddingKt.calculateEndPadding(paddingValues1, layoutDirection0), 0.0f, 10, null);
        LazyDslKt.LazyColumn(modifier1, null, PaddingKt.PaddingValues-a9UjIt4$default(0.0f, paddingValues1.calculateTopPadding-D9Ej5fM(), 0.0f, paddingValues1.calculateBottomPadding-D9Ej5fM(), 5, null), false, null, null, null, false, new f(list0, list1, paddingValues2, blog1, (list1.size() + list0.size() == 1 ? null : blog0), function20), composer1, v >> 15 & 14, 0xFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new g(list0, list1, blog0, blog1, function20, modifier1, paddingValues1, v, v1));
        }
    }

    public static final void access$BlogListItem(Blog blog0, Blog blog1, Blog blog2, PaddingValues paddingValues0, Function0 function00, Composer composer0, int v) {
        String s1;
        Composer composer1 = composer0.startRestartGroup(0xD8CCD064);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD8CCD064, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogListItem (BlogSwitchBottomSheet.kt:320)");
        }
        boolean z = Intrinsics.areEqual((blog1 == null ? null : blog1.getId()), blog0.getId());
        boolean z1 = Intrinsics.areEqual((blog2 == null ? null : blog2.getId()), blog0.getId());
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding(PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), false, null, null, function00, 7, null), 0.0f, 12.0f, 1, null), paddingValues0);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function01);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        String s = blog0.getLogoImageUrl();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s)), 32.0f, null, false, null, composer1, 0x30, 28);
        c.a(15.0f, modifier$Companion0, composer1, 6);
        Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        if(!z) {
            s1 = blog0.getTitle();
        }
        else if(blog1 != null) {
            s1 = blog1.getTitle();
        }
        else {
            s1 = null;
        }
        if(s1 == null) {
            s1 = "";
        }
        TextKt.Text--4IGK_g(s1, rowScopeInstance0.weight(modifier$Companion0, 1.0f, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, TTextStyle.INSTANCE.getSize14Weight400(), composer1, 0x180, 0x180C30, 0xD7F8);
        composer1.startReplaceGroup(0x2017892C);
        if(z1) {
            Modifier modifier4 = SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 6.0f, 0.0f, 20.0f, 0.0f, 10, null), 28.0f, 16.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_blog_switch_default_blog, composer1, 0), null, modifier4, null, null, 0.0f, null, composer1, 440, 120);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 12.0f), composer1, 6);
        Modifier modifier5 = SizeKt.size-3ABfNKs(modifier$Companion0, 24.0f);
        MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
        Function0 function03 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function03);
        }
        else {
            composer1.useNode();
        }
        Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function22);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier6, composer1, 0x2017C91C);
        if(z) {
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_check, composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(blog0, blog1, blog2, paddingValues0, function00, v));
        }
    }

    public static final void access$BlogListTitle(int v, PaddingValues paddingValues0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xB05B28A0);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB05B28A0, v2, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogListTitle (BlogSwitchBottomSheet.kt:300)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(v, composer1, v2 & 14), PaddingKt.padding(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 20.0f, 0.0f, 2.0f, 5, null), paddingValues0), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, TTextStyle.INSTANCE.getSize12Weight500(), composer1, 0x180, 0x180C30, 0xD7F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(v, paddingValues0, v1));
        }
    }

    public static final BlogSwitchState access$BlogSwitchBottomSheet$lambda$0(State state0) {
        return (BlogSwitchState)state0.getValue();
    }

    public static final void access$BlogSwitchBottomSheetNormal(Blog blog0, Blog blog1, List list0, List list1, Function0 function00, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(286005085);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286005085, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheetNormal (BlogSwitchBottomSheet.kt:122)");
        }
        BlogSwitchBottomSheetKt.a(blog0, function00, composer1, v >> 9 & 0x70 | 8);
        DividerKt.HorizontalDivider-9IZ8Weo(null, 0.5f, 0L, composer1, 0x1B0, 1);
        composer1.startReplaceGroup(0x1FCD100C);
        boolean z = (0x70000 & v ^ 0x30000) > 0x20000 && composer1.changed(function20) || (v & 0x30000) == 0x20000;
        r r0 = composer1.rememberedValue();
        if(z || r0 == Composer.Companion.getEmpty()) {
            r0 = new r(function20);
            composer1.updateRememberedValue(r0);
        }
        composer1.endReplaceGroup();
        BlogSwitchBottomSheetKt.a(list0, list1, blog1, blog0, r0, SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 0.0f, 72.0f, 1, null), PaddingKt.PaddingValues-a9UjIt4(32.0f, 5.0f, 20.0f, 12.0f), composer1, 201288, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(blog0, blog1, list0, list1, function00, function20, v));
        }
    }

    public static final void access$BlogSwitchBottomSheetQuick(Blog blog0, Blog blog1, List list0, List list1, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x80C0D477);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x80C0D477, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheetQuick (BlogSwitchBottomSheet.kt:145)");
        }
        composer1.startReplaceGroup(0xDB01F95E);
        boolean z = (0xE000 & v ^ 0x6000) > 0x4000 && composer1.changed(function20) || (v & 0x6000) == 0x4000;
        t t0 = composer1.rememberedValue();
        if(z || t0 == Composer.Companion.getEmpty()) {
            t0 = new t(function20);
            composer1.updateRememberedValue(t0);
        }
        composer1.endReplaceGroup();
        BlogSwitchBottomSheetKt.a(list0, list1, blog1, blog0, t0, SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 0.0f, 80.0f, 1, null), PaddingKt.PaddingValues-YgX7TsA(20.0f, 12.0f), composer1, 201288, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(blog0, blog1, list0, list1, function20, v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Normal_Empty(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x89F2B991);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x89F2B991, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Normal_Empty (BlogSwitchBottomSheet.kt:475)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-7$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Normal_OnlyJoinedList(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xABB57CEF);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xABB57CEF, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Normal_OnlyJoinedList (BlogSwitchBottomSheet.kt:431)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-4$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Normal_OnlyOwnerList(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB7BE7C39);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB7BE7C39, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Normal_OnlyOwnerList (BlogSwitchBottomSheet.kt:418)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-3$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Normal_SingleBlogJoined(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2F5058CF);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2F5058CF, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Normal_SingleBlogJoined (BlogSwitchBottomSheet.kt:460)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-6$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Normal_SingleBlogOwner(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-702753771);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-702753771, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Normal_SingleBlogOwner (BlogSwitchBottomSheet.kt:446)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-5$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Normal_WithBothLists(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCBD98190);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCBD98190, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Normal_WithBothLists (BlogSwitchBottomSheet.kt:407)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-2$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Quick_Empty(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-592193057);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-592193057, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Quick_Empty (BlogSwitchBottomSheet.kt:563)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-13$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Quick_OnlyJoinedList(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2123945057);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123945057, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Quick_OnlyJoinedList (BlogSwitchBottomSheet.kt:515)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-10$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Quick_OnlyOwnerList(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1949920903);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949920903, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Quick_OnlyOwnerList (BlogSwitchBottomSheet.kt:502)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-9$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Quick_SingleBlogJoined(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD6BB9BC1);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD6BB9BC1, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Quick_SingleBlogJoined (BlogSwitchBottomSheet.kt:547)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-12$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Quick_SingleBlogOwner(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1604610787);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1604610787, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Quick_SingleBlogOwner (BlogSwitchBottomSheet.kt:531)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-11$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(v));
        }
    }

    public static final void access$PreviewBlogSwitchBottomSheetContent_Quick_WithBothLists(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2007731234);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2007731234, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.PreviewBlogSwitchBottomSheetContent_Quick_WithBothLists (BlogSwitchBottomSheet.kt:491)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogSwitchBottomSheetKt.INSTANCE.getLambda-8$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(v));
        }
    }

    public static final BlogSwitchState access$createMockState(Blog blog0, Blog blog1, List list0, List list1) {
        return new BlogSwitchState(blog1, blog0, list0, list1, null, i0.a, j0.a, 16, null);
    }
}


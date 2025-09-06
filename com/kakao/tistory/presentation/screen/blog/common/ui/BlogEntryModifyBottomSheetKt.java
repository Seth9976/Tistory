package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0081\u0001\u0010\r\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u0011²\u0006\u000E\u0010\u0010\u001A\u00020\u000F8\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibility", "", "showVisibilityType", "Lkotlin/Function0;", "", "onClickEdit", "onClickStatistics", "onClickDelete", "Lkotlin/Function1;", "onClickChangeVisibility", "onClickPassword", "onDismiss", "BlogEntryModifyBottomSheet", "(Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/tistory/presentation/screen/blog/common/ui/r;", "depth", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogEntryModifyBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogEntryModifyBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blog/common/ui/BlogEntryModifyBottomSheetKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n1223#2,6:193\n1223#2,6:199\n1223#2,6:205\n1223#2,6:211\n1223#2,6:217\n1223#2,6:224\n1223#2,6:230\n1223#2,6:237\n1855#3:223\n1856#3:236\n81#4:243\n107#4,2:244\n*S KotlinDebug\n*F\n+ 1 BlogEntryModifyBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blog/common/ui/BlogEntryModifyBottomSheetKt\n*L\n41#1:193,6\n101#1:199,6\n109#1:205,6\n117#1:211,6\n126#1:217,6\n147#1:224,6\n170#1:230,6\n180#1:237,6\n143#1:223\n143#1:236\n41#1:243\n41#1:244,2\n*E\n"})
public final class BlogEntryModifyBottomSheetKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class EntriesMappings {
        public static final EnumEntries entries$0;

        static {
            EntriesMappings.entries$0 = EnumEntriesKt.enumEntries(EntryVisibilityType.values());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EntryVisibilityType.values().length];
            try {
                arr_v[EntryVisibilityType.PUBLIC.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PROTECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PRIVATE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogEntryModifyBottomSheet(@NotNull EntryVisibilityType entryVisibilityType0, @Nullable List list0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function1 function10, @NotNull Function0 function03, @NotNull Function0 function04, @Nullable Composer composer0, int v, int v1) {
        List list1;
        int v3;
        List list2;
        int v2;
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(function00, "onClickEdit");
        Intrinsics.checkNotNullParameter(function01, "onClickStatistics");
        Intrinsics.checkNotNullParameter(function02, "onClickDelete");
        Intrinsics.checkNotNullParameter(function10, "onClickChangeVisibility");
        Intrinsics.checkNotNullParameter(function03, "onClickPassword");
        Intrinsics.checkNotNullParameter(function04, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0xEB019404);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(entryVisibilityType0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 16;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function02) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x380000 & v) == 0) {
            v2 |= (composer1.changedInstance(function03) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changedInstance(function04) ? 0x800000 : 0x400000);
        }
        if((v1 & 2) != 2 || (0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                list2 = list0;
                v3 = v2;
            }
            else if((v1 & 2) == 0) {
                list2 = list0;
                v3 = v2;
            }
            else {
                v3 = v2 & 0xFFFFFF8F;
                list2 = EntriesMappings.entries$0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEB019404, v3, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyBottomSheet (BlogEntryModifyBottomSheet.kt:39)");
            }
            composer1.startReplaceGroup(0xE5053E5F);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(r.a, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            TistoryComposeBottomSheetKt.TistoryComposeBottomSheet(false, function04, ComposableLambdaKt.rememberComposableLambda(0x3E2FB25F, true, new d(entryVisibilityType0, function00, function01, function02, function04, list2, function10, function03, mutableState0), composer1, 54), composer1, v3 >> 18 & 0x70 | 0x180, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list1 = list2;
        }
        else {
            composer1.skipToGroupEnd();
            list1 = list0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(entryVisibilityType0, list1, function00, function01, function02, function10, function03, function04, v, v1));
        }
    }

    public static final String a(EntryVisibilityType entryVisibilityType0, Composer composer0, int v) {
        String s;
        composer0.startReplaceGroup(0x4586F4E4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4586F4E4, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.label (BlogEntryModifyBottomSheet.kt:187)");
        }
        switch(WhenMappings.$EnumSwitchMapping$0[entryVisibilityType0.ordinal()]) {
            case 1: {
                composer0.startReplaceGroup(0x8F2C4E3B);
                s = StringResources_androidKt.stringResource(string.label_entry_visibility_public, composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(0x8F2C59BC);
                s = StringResources_androidKt.stringResource(string.label_entry_visibility_protect, composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            case 3: {
                composer0.startReplaceGroup(0x8F2C651C);
                s = StringResources_androidKt.stringResource(string.label_entry_visibility_private, composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(0x8F296AE5);
                composer0.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return s;
    }

    public static final r access$BlogEntryModifyBottomSheet$lambda$1(MutableState mutableState0) {
        return (r)mutableState0.getValue();
    }

    public static final void access$BlogEntryModifyBottomSheet$lambda$2(MutableState mutableState0, r r0) {
        mutableState0.setValue(r0);
    }

    public static final void access$BlogEntryModifyTop(EntryVisibilityType entryVisibilityType0, Function1 function10, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(610920733);
        int v1 = (v & 14) == 0 ? (composer1.changed(entryVisibilityType0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v & 0xE000) == 0) {
            v1 |= (composer1.changedInstance(function02) ? 0x4000 : 0x2000);
        }
        if((v & 0x70000) == 0) {
            v1 |= (composer1.changedInstance(function03) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610920733, v1, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyTop (BlogEntryModifyBottomSheet.kt:80)");
            }
            Integer integer0 = drawable.ic_menu_visibility;
            String s = StringResources_androidKt.stringResource(string.label_blog_entry_menu_visibility, composer1, 0);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xCF78CC2F, true, new f(entryVisibilityType0), composer1, 54);
            composer1.startReplaceGroup(0x3D34F950);
            g g0 = composer1.rememberedValue();
            if((v1 & 0x70) == 0x20 || g0 == Composer.Companion.getEmpty()) {
                g0 = new g(function10);
                composer1.updateRememberedValue(g0);
            }
            composer1.endReplaceGroup();
            int v2 = 1;
            TistoryComposeBottomSheetKt.BottomSheetItem(integer0, s, composableLambda0, false, g0, composer1, 0x180, 8);
            Integer integer1 = drawable.ic_menu_edit;
            String s1 = StringResources_androidKt.stringResource(string.label_blog_entry_menu_edit, composer1, 0);
            composer1.startReplaceGroup(1026888663);
            h h0 = composer1.rememberedValue();
            if((((v1 & 0x70000) == 0x20000 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0)) != 0 || h0 == Composer.Companion.getEmpty()) {
                h0 = new h(function00, function03);
                composer1.updateRememberedValue(h0);
            }
            composer1.endReplaceGroup();
            TistoryComposeBottomSheetKt.BottomSheetItem(integer1, s1, null, false, h0, composer1, 0, 12);
            Integer integer2 = drawable.ic_menu_statistics;
            String s2 = StringResources_androidKt.stringResource(string.label_blog_entry_menu_statistics, composer1, 0);
            composer1.startReplaceGroup(1026896029);
            i i0 = composer1.rememberedValue();
            if((((v1 & 0x70000) == 0x20000 ? 1 : 0) | ((v1 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || i0 == Composer.Companion.getEmpty()) {
                i0 = new i(function01, function03);
                composer1.updateRememberedValue(i0);
            }
            composer1.endReplaceGroup();
            TistoryComposeBottomSheetKt.BottomSheetItem(integer2, s2, null, false, i0, composer1, 0, 12);
            Integer integer3 = drawable.ic_menu_delete;
            String s3 = StringResources_androidKt.stringResource(string.label_blog_entry_menu_delete, composer1, 0);
            composer1.startReplaceGroup(1026904249);
            if((v1 & 0x70000) != 0x20000) {
                v2 = 0;
            }
            j j0 = composer1.rememberedValue();
            if((((v1 & 0xE000) == 0x4000 ? 1 : 0) | v2) != 0 || j0 == Composer.Companion.getEmpty()) {
                j0 = new j(function02, function03);
                composer1.updateRememberedValue(j0);
            }
            composer1.endReplaceGroup();
            TistoryComposeBottomSheetKt.BottomSheetItem(integer3, s3, null, false, j0, composer1, 0xC00, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(entryVisibilityType0, function10, function00, function01, function02, function03, v));
        }
    }

    public static final void access$BlogEntryModifyVisibility(EntryVisibilityType entryVisibilityType0, List list0, Function1 function10, Function1 function11, Function0 function00, Function0 function01, Composer composer0, int v) {
        int v6;
        int v5;
        int v1;
        Composer composer1 = composer0.startRestartGroup(-1701677039);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1701677039, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryModifyVisibility (BlogEntryModifyBottomSheet.kt:140)");
        }
        composer1.startReplaceGroup(0xAFD9B0E6);
        Iterator iterator0 = list0.iterator();
        while(true) {
            v1 = 1;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            EntryVisibilityType entryVisibilityType1 = (EntryVisibilityType)object0;
            String s = BlogEntryModifyBottomSheetKt.a(entryVisibilityType1, composer1, 0);
            composer1.startReplaceGroup(0x459C03C1);
            boolean z = (v & 14 ^ 6) > 4 && composer1.changed(entryVisibilityType0) || (v & 6) == 4;
            boolean z1 = composer1.changed(entryVisibilityType1);
            int v2 = ((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(function11)) && (v & 0xC00) != 0x800 ? 0 : 1;
            int v3 = 0x70000 & v ^ 0x30000;
            int v4 = (v3 <= 0x20000 || !composer1.changed(function01)) && (v & 0x30000) != 0x20000 ? 0 : 1;
            l l0 = composer1.rememberedValue();
            if((z | z1 | v2 | v4) != 0 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(entryVisibilityType0, entryVisibilityType1, function11, function01);
                composer1.updateRememberedValue(l0);
            }
            composer1.endReplaceGroup();
            TistoryComposeBottomSheetKt.BottomSheetItem(null, s, entryVisibilityType0 == entryVisibilityType1, false, false, l0, composer1, 0, 25);
            composer1.startReplaceGroup(0xAFD9D4F6);
            if(entryVisibilityType0 == EntryVisibilityType.PROTECTED && entryVisibilityType1 == EntryVisibilityType.PROTECTED) {
                Function3 function30 = ComposableSingletons.BlogEntryModifyBottomSheetKt.INSTANCE.getLambda-1$presentation_prodRelease();
                Function3 function31 = ComposableSingletons.BlogEntryModifyBottomSheetKt.INSTANCE.getLambda-2$presentation_prodRelease();
                composer1.startReplaceGroup(1167880101);
                if(((0xE000 & v ^ 0x6000) <= 0x4000 || !composer1.changed(function00)) && (v & 0x6000) != 0x4000) {
                    v6 = v3;
                    v5 = 0;
                }
                else {
                    v5 = 1;
                    v6 = v3;
                }
                if((v6 <= 0x20000 || !composer1.changed(function01)) && (v & 0x30000) != 0x20000) {
                    v1 = 0;
                }
                m m0 = composer1.rememberedValue();
                if((v5 | v1) != 0 || m0 == Composer.Companion.getEmpty()) {
                    m0 = new m(function00, function01);
                    composer1.updateRememberedValue(m0);
                }
                composer1.endReplaceGroup();
                TistoryComposeBottomSheetKt.BottomSheetItem(function30, function31, null, false, m0, composer1, 54, 12);
            }
            composer1.endReplaceGroup();
        }
        composer1.endReplaceGroup();
        String s1 = StringResources_androidKt.stringResource(string.label_dialog_cancel, composer1, 0);
        composer1.startReplaceGroup(-1344650084);
        if(((v & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(function10)) && (v & 0x180) != 0x100) {
            v1 = 0;
        }
        n n0 = composer1.rememberedValue();
        if(v1 != 0 || n0 == Composer.Companion.getEmpty()) {
            n0 = new n(function10);
            composer1.updateRememberedValue(n0);
        }
        composer1.endReplaceGroup();
        TistoryComposeBottomSheetKt.BottomSheetItem(null, s1, null, false, n0, composer1, 0xC00, 5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(entryVisibilityType0, list0, function10, function11, function00, function01, v));
        }
    }
}


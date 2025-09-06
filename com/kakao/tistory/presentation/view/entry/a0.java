package com.kakao.tistory.presentation.view.entry;

import a5.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.entry.widget.ChallengeSuccessDialogKt;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowCanNotFindPostDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowChallengeAuthDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowChallengeSuccessDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowDeleteEntryDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent.ShowModificationDialog;
import com.kakao.tistory.presentation.viewmodel.EntryViewModel.EntryDialogEvent;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function4 {
    public final EntryViewActivity a;

    public a0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(4);
    }

    public final void a(DialogFactory dialogFactory0, EntryDialogEvent entryViewModel$EntryDialogEvent0, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(dialogFactory0, "$this$DialogHandler");
        Intrinsics.checkNotNullParameter(entryViewModel$EntryDialogEvent0, "event");
        int v1 = (v & 14) == 0 ? v | (composer0.changed(dialogFactory0) ? 4 : 2) : v;
        if((v & 0x70) == 0) {
            v1 |= (composer0.changed(entryViewModel$EntryDialogEvent0) ? 0x20 : 16);
        }
        if((v1 & 731) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD44BF866, v1, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryDialogHandler.<anonymous> (EntryViewActivity.kt:250)");
        }
        boolean z = true;
        if(entryViewModel$EntryDialogEvent0 instanceof ShowCanNotFindPostDialog) {
            composer0.startReplaceGroup(1040845709);
            dialogFactory0.ShowOk(((ShowCanNotFindPostDialog)entryViewModel$EntryDialogEvent0).getErrorModel().getTitle(), null, 0, false, new r(dialogFactory0, this.a), null, composer0, v1 << 18 & 0x380000, 46);
        }
        else if(entryViewModel$EntryDialogEvent0 instanceof ShowDeleteEntryDialog) {
            composer0.startReplaceGroup(1041210920);
            if(((ShowDeleteEntryDialog)entryViewModel$EntryDialogEvent0).getHasPermission()) {
                composer0.startReplaceGroup(1041247097);
                String s = this.a.getString(string.label_dialog_entry_delete);
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                dialogFactory0.ShowOkCancel(s, null, string.label_dialog_cancel, string.label_dialog_delete, true, new s(dialogFactory0, this.a), null, composer0, v1 << 21 & 0x1C00000 | 0x6000, 66);
            }
            else {
                composer0.startReplaceGroup(1042025290);
                String s1 = this.a.getString(string.label_dialog_entry_delete_no_permission);
                Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                composer0.startReplaceGroup(0x44118037);
                if((v1 & 14) != 4) {
                    z = false;
                }
                t t0 = composer0.rememberedValue();
                if(z || t0 == Composer.Companion.getEmpty()) {
                    t0 = new t(dialogFactory0);
                    composer0.updateRememberedValue(t0);
                }
                composer0.endReplaceGroup();
                dialogFactory0.ShowOk(s1, null, 0, false, t0, null, composer0, v1 << 18 & 0x380000, 46);
            }
            composer0.endReplaceGroup();
        }
        else if(entryViewModel$EntryDialogEvent0 instanceof ShowModificationDialog) {
            composer0.startReplaceGroup(1042395802);
            String s2 = EntryViewActivity.access$getEntryViewModel(this.a).getBlogName();
            if(((ShowModificationDialog)entryViewModel$EntryDialogEvent0).getId() == null || s2 == null) {
                String s3 = this.a.getString(string.label_dialog_entry_delete_no_permission);
                Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
                composer0.startReplaceGroup(1142019415);
                if((v1 & 14) != 4) {
                    z = false;
                }
                v v2 = composer0.rememberedValue();
                if(z || v2 == Composer.Companion.getEmpty()) {
                    v2 = new v(dialogFactory0);
                    composer0.updateRememberedValue(v2);
                }
                composer0.endReplaceGroup();
                dialogFactory0.ShowOk(s3, null, 0, false, v2, null, composer0, v1 << 18 & 0x380000, 46);
            }
            else {
                dialogFactory0.withoutDialog(new u(this.a, s2, entryViewModel$EntryDialogEvent0));
            }
        }
        else if(entryViewModel$EntryDialogEvent0 instanceof ShowChallengeAuthDialog) {
            composer0.startReplaceGroup(1043097146);
            dialogFactory0.ShowOkCancel(StringResources_androidKt.stringResource(string.label_dialog_entry_challgne_auth_title, composer0, 0), StringResources_androidKt.stringResource(string.label_dialog_entry_challgne_auth_message, composer0, 0), string.label_dialog_entry_challgne_auth_left, string.label_dialog_entry_challgne_auth_right, true, new w(dialogFactory0, this.a, entryViewModel$EntryDialogEvent0), new x(this.a, entryViewModel$EntryDialogEvent0), composer0, v1 << 21 & 0x1C00000 | 0x6000, 0);
        }
        else if(entryViewModel$EntryDialogEvent0 instanceof ShowChallengeSuccessDialog) {
            composer0.startReplaceGroup(0x3E4282FF);
            String s4 = b.m(((ShowChallengeSuccessDialog)entryViewModel$EntryDialogEvent0).getChallengeResult().getTitle(), " ", ((ShowChallengeSuccessDialog)entryViewModel$EntryDialogEvent0).getChallengeResult().getDescription());
            ChallengeResult challengeResult0 = ((ShowChallengeSuccessDialog)entryViewModel$EntryDialogEvent0).getChallengeResult();
            y y0 = new y(s4, dialogFactory0, this.a);
            composer0.startReplaceGroup(1142088095);
            boolean z1 = composer0.changed(s4);
            if((v1 & 14) != 4) {
                z = false;
            }
            z z2 = composer0.rememberedValue();
            if(z1 || z || z2 == Composer.Companion.getEmpty()) {
                z2 = new z(s4, dialogFactory0);
                composer0.updateRememberedValue(z2);
            }
            composer0.endReplaceGroup();
            ChallengeSuccessDialogKt.ChallengeSuccessDialog(dialogFactory0, challengeResult0, y0, z2, composer0, v1 & 14 | 0x40, 0);
        }
        else {
            composer0.startReplaceGroup(1045164660);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.a(((DialogFactory)object0), ((EntryDialogEvent)object1), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }
}


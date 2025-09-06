package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.view.setting.notice.contract.SettingNoticeEntry;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((SettingNoticeEntry)object0), "notice");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((SettingNoticeEntry)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1262870883, v, -1, "com.kakao.tistory.presentation.view.setting.notice.ComposableSingletons$SettingNoticeListActivityKt.lambda-2.<anonymous> (SettingNoticeListActivity.kt:145)");
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(((SettingNoticeEntry)object0).getTitle());
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        Builder annotatedString$Builder1 = new Builder(0, 1, null);
        annotatedString$Builder1.append(((SettingNoticeEntry)object0).getSummary());
        EntryListKt.EntryListItem(((SettingNoticeEntry)object0).getOnClickEntry(), null, false, null, null, annotatedString0, annotatedString$Builder1.toAnnotatedString(), ((SettingNoticeEntry)object0).getThumbnail(), ((SettingNoticeEntry)object0).getLikeCount(), ((SettingNoticeEntry)object0).getCommentCount(), ((SettingNoticeEntry)object0).getPublishedDate(), ((SettingNoticeEntry)object0).getScheduled(), ((SettingNoticeEntry)object0).getVisibility(), ((Composer)object1), 0, 0, 30);
        ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, ((Composer)object1), 0, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}


package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"EntryStatusImageView", "", "modifier", "Landroidx/compose/ui/Modifier;", "entryItem", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/domain/entity/entry/EntryItem;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class EntryStatusImageViewKt {
    @Composable
    public static final void EntryStatusImageView(@Nullable Modifier modifier0, @NotNull EntryItem entryItem0, @Nullable Composer composer0, int v, int v1) {
        Integer integer0;
        int v2;
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        Composer composer1 = composer0.startRestartGroup(1855875028);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(entryItem0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1855875028, v2, -1, "com.kakao.tistory.presentation.widget.entry.EntryStatusImageView (EntryStatusImageView.kt:11)");
            }
            if(Intrinsics.areEqual(entryItem0.getScheduleStatus(), "scheduled")) {
                integer0 = drawable.ic_list_reservation;
            }
            else if(entryItem0.getVisibility() == null) {
                integer0 = null;
            }
            else {
                String s = entryItem0.getVisibility();
                if(Intrinsics.areEqual(s, "private")) {
                    integer0 = drawable.ic_list_nonpublic;
                }
                else if(Intrinsics.areEqual(s, "protected")) {
                    integer0 = drawable.ic_list_secret;
                }
                else {
                    integer0 = null;
                }
            }
            if(integer0 != null) {
                CommonImageKt.CommonImage(integer0, null, modifier0, null, null, null, composer1, v2 << 6 & 0x380 | 0x30, 56);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(modifier0, entryItem0, v, v1));
        }
    }
}


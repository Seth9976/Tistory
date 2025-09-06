package com.kakao.kandinsky.textedit.ui;

import androidx.compose.runtime.Immutable;
import com.kakao.kandinsky.textedit.R.drawable;
import com.kakao.kandinsky.textedit.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006j\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/kandinsky/textedit/ui/EditState;", "", "", "a", "I", "getDefaultIcon", "()I", "defaultIcon", "b", "getSelectedIcon", "selectedIcon", "c", "getContentDescription", "contentDescription", "KEYBOARD", "FONT", "TEXT_COLOR", "BACKGROUND_COLOR", "textedit_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum EditState {
    KEYBOARD(drawable.tab_keypad, drawable.tab_keypad_on, string.cd_menu_keyboard),
    FONT(drawable.tab_fontstyle, drawable.tab_fontstyle_on, string.cd_menu_text_style),
    TEXT_COLOR(drawable.tab_text_color, drawable.tab_text_color_on, string.cd_menu_text_color),
    BACKGROUND_COLOR(drawable.tab_backgound_color, drawable.tab_backgound_color, string.cd_menu_background_color);

    public final int a;
    public final int b;
    public final int c;
    public static final EditState[] d;
    public static final EnumEntries e;

    static {
        EditState.d = arr_editState;
        Intrinsics.checkNotNullParameter(arr_editState, "entries");
        EditState.e = new a(arr_editState);
    }

    public EditState(int v1, int v2, int v3) {
        this.a = v1;
        this.b = v2;
        this.c = v3;
    }

    public final int getContentDescription() {
        return this.c;
    }

    public final int getDefaultIcon() {
        return this.a;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return EditState.e;
    }

    public final int getSelectedIcon() {
        return this.b;
    }
}


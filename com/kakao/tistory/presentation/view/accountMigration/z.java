package com.kakao.tistory.presentation.view.accountMigration;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final MigrationFragment a;
    public final String b;
    public final TextStyle c;
    public final int d;

    public z(MigrationFragment migrationFragment0, String s, TextStyle textStyle0, int v) {
        this.a = migrationFragment0;
        this.b = s;
        this.c = textStyle0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.MigrationEmailText(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}


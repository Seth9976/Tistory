package com.kakao.tistory.presentation.view.accountMigration;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function2 {
    public final MigrationFragment a;
    public final int b;
    public final int c;

    public c0(MigrationFragment migrationFragment0, int v, int v1) {
        this.a = migrationFragment0;
        this.b = v;
        this.c = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.MigrationTitleText(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}


package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.Composer;

public abstract class b {
    public static Object a(Composer composer0, int v) {
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(v);
        return composer0.rememberedValue();
    }
}


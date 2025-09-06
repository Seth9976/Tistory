package com.kakao.sdk.common.json;

import com.google.gson.stream.JsonToken;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final class KakaoEnumTypeAdapter.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[JsonToken.values().length];
        KakaoEnumTypeAdapter.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[JsonToken.NUMBER.ordinal()] = 1;
        arr_v[JsonToken.STRING.ordinal()] = 2;
    }
}


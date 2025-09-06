package com.kakao.common.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/common/util/ContentUtil;", "", "Landroid/content/Context;", "context", "", "uri", "convertFilePath", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentUtil {
    @NotNull
    public static final ContentUtil INSTANCE;

    static {
        ContentUtil.INSTANCE = new ContentUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final String convertFilePath(@NotNull Context context0, @NotNull String s) {
        String s1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "uri");
        int v = 0;
        if(p.startsWith$default(s, "content", false, 2, null)) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                Cursor cursor0 = context0.getContentResolver().query(uri0, new String[]{"_data"}, null, null, null);
                if(cursor0 != null) {
                    try {
                        if(cursor0.moveToFirst()) {
                            try {
                                v = cursor0.getColumnIndexOrThrow("_data");
                                goto label_13;
                            }
                            catch(Exception unused_ex) {
                            }
                            goto label_11;
                        }
                        goto label_13;
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(cursor0, throwable0);
                        throw throwable0;
                    }
                label_11:
                    CloseableKt.closeFinally(cursor0, null);
                    return s;
                    try {
                    label_13:
                        s1 = cursor0.getString(v);
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(cursor0, throwable0);
                        throw throwable0;
                    }
                    CloseableKt.closeFinally(cursor0, null);
                    return s1 == null ? s : s1;
                }
            }
            return s;
        }
        return s;
    }
}


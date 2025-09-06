package com.kakao.kphotopicker.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kphotopicker/util/RealPathUtil;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "getPath", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealPathUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealPathUtil.kt\ncom/kakao/kphotopicker/util/RealPathUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
public final class RealPathUtil {
    @NotNull
    public static final RealPathUtil INSTANCE;

    static {
        RealPathUtil.INSTANCE = new RealPathUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static File a(Context context0, InputStream inputStream0, String s) {
        if(inputStream0 != null) {
            byte[] arr_b = new byte[0x2000];
            if(s == null || s.length() == 0) {
                s = "20250906_081146_602515228.jpg";
            }
            File file0 = new File(context0.getCacheDir(), s);
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            try {
                int v;
                while((v = inputStream0.read(arr_b)) != -1) {
                    fileOutputStream0.write(arr_b, 0, v);
                }
                fileOutputStream0.flush();
                goto label_17;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(fileOutputStream0, throwable0);
                throw throwable1;
            }
        label_17:
            CloseableKt.closeFinally(fileOutputStream0, null);
            return file0;
        }
        return null;
    }

    public static String b(Context context0, Uri uri0) {
        Cursor cursor0;
        String s = null;
        try {
            cursor0 = context0.getContentResolver().query(uri0, null, null, null, null);
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    s = cursor0.getString(cursor0.getColumnIndex("_display_name"));
                }
                goto label_14;
            }
            catch(Throwable throwable0) {
                s = cursor0;
            }
        label_11:
            if(s != null) {
                ((Cursor)s).close();
            }
            throw throwable0;
        }
    label_14:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(s == null || s.length() == 0) {
            String s1 = uri0.getPath();
            if(s1 != null && s1.length() != 0) {
                String s2 = uri0.getPath();
                int v = StringsKt__StringsKt.lastIndexOf$default(s2, '/', 0, false, 6, null);
                if(v != -1) {
                    s = s2.substring(v + 1);
                    Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
                    return s;
                }
                return s2;
            }
        }
        return s;
    }

    public static String c(Context context0, Uri uri0) {
        String s1;
        InputStream inputStream0;
        String s = null;
        if(uri0.getAuthority() != null) {
            try {
                inputStream0 = context0.getContentResolver().openInputStream(uri0);
                try {
                    RealPathUtil.INSTANCE.getClass();
                    File file0 = RealPathUtil.a(context0, inputStream0, RealPathUtil.b(context0, uri0));
                    s1 = file0 == null ? null : file0.getAbsolutePath();
                }
                catch(Throwable throwable0) {
                    CloseableKt.closeFinally(inputStream0, throwable0);
                    throw throwable0;
                }
            }
            catch(FileNotFoundException fileNotFoundException0) {
                fileNotFoundException0.printStackTrace();
                return s;
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
                return s;
            }
            try {
                CloseableKt.closeFinally(inputStream0, null);
                return s1;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                fileNotFoundException0.printStackTrace();
                return s1;
            }
            catch(IOException iOException0) {
                s = s1;
            }
            iOException0.printStackTrace();
            return s;
        }
        return null;
    }

    @Nullable
    public final String getPath(@NotNull Context context0, @NotNull Uri uri0) {
        String s1;
        Cursor cursor0;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(uri0, "uri");
        String s = null;
        if(p.equals("content", uri0.getScheme(), true)) {
            if(Intrinsics.areEqual("com.google.android.apps.photos.content", uri0.getAuthority())) {
                return uri0.getLastPathSegment();
            }
            try {
                cursor0 = context0.getContentResolver().query(uri0, new String[]{"_data"}, null, null, null);
                goto label_10;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                goto label_21;
            label_10:
                if(cursor0 != null) {
                    try {
                        if(cursor0.moveToFirst()) {
                            s = cursor0.getString(cursor0.getColumnIndexOrThrow("_data"));
                        }
                    label_13:
                        if(s == null || s.length() == 0) {
                            s = RealPathUtil.c(context0, uri0);
                        }
                        goto label_32;
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        s = cursor0;
                        goto label_21;
                    }
                    catch(Throwable throwable0) {
                        s = cursor0;
                        goto label_29;
                    }
                }
                goto label_13;
                try {
                label_21:
                    illegalArgumentException0.printStackTrace();
                    s1 = RealPathUtil.c(context0, uri0);
                    goto label_26;
                }
                catch(Throwable throwable0) {
                }
                goto label_29;
            }
            catch(Throwable throwable0) {
                goto label_29;
            }
        label_26:
            if(s != null) {
                ((Cursor)s).close();
            }
            return s1;
        label_29:
            if(s != null) {
                ((Cursor)s).close();
            }
            throw throwable0;
        label_32:
            if(cursor0 != null) {
                cursor0.close();
                return s;
            }
            return s;
        }
        return p.equals("file", uri0.getScheme(), true) ? uri0.getPath() : null;
    }
}


package com.kakao.kphotopicker;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001A\u00020\bH&J(\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000B2\u0006\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0003H&¨\u0006\u000F"}, d2 = {"Lcom/kakao/kphotopicker/PhotoEditor;", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "imagePaths", "", "", "outDirPath", "onActivityResult", "", "resultCode", "", "data", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PhotoEditor {
    @Nullable
    Intent newIntent(@NotNull Context arg1, @NotNull List arg2, @NotNull String arg3);

    @Nullable
    Map onActivityResult(int arg1, @Nullable Intent arg2);
}


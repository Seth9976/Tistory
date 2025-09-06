package com.kakao.keditor.plugin.pluginspec.poll.creator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\b\u0010\u0006\u001A\u00020\u0003H&J\u0010\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0005H&J\b\u0010\t\u001A\u00020\u0003H&J\b\u0010\n\u001A\u00020\u0003H&J\b\u0010\u000B\u001A\u00020\u0003H&J\u0018\u0010\f\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0018\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollItemListener;", "", "add", "", "viewHeight", "", "clickEndDate", "clickImage", "index", "clickStartDate", "countDown", "countUp", "remove", "updateText", "text", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PollItemListener {
    void add(int arg1);

    void clickEndDate();

    void clickImage(int arg1);

    void clickStartDate();

    void countDown();

    void countUp();

    void remove(int arg1, int arg2);

    void updateText(@NotNull String arg1, int arg2);
}


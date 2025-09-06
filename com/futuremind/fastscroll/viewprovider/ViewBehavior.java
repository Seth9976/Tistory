package com.futuremind.fastscroll.viewprovider;

public interface ViewBehavior {
    void onHandleGrabbed();

    void onHandleReleased();

    void onScrollFinished();

    void onScrollStarted();
}


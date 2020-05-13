package com.alan.rx.executor;

/**
 * @author Alan
 * 时 间：2020-01-02
 * 简 述：<功能简述>
 */
public abstract class SimpleSchedulerRunnable<T> implements RxScheduleRunnable<T> {

    @Override
    public void onCompleteOnMainThread() {

    }

    @Override
    public T onError(Throwable throwable) {
        scheduleOnMainThread(null, throwable);
        return null;
    }

    @Override
    public void scheduleOnMainThread(T t) {
        scheduleOnMainThread(t, null);
    }

    public abstract void scheduleOnMainThread(T t, Throwable e);
}

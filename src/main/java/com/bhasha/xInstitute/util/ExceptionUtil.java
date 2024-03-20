package com.bhasha.xInstitute.util;

import com.bhasha.xInstitute.exception.IgnoredException;
import com.bhasha.xInstitute.exception.UnhandledException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class ExceptionUtil {

    private ExceptionUtil() {
    }

    public interface UnhandledFunction<T> {
        T apply() throws Throwable;
    }

    public interface UnhandledRunnable {
        void run() throws Throwable;
    }

    public static <T> T unhandled(UnhandledFunction<T> function) {
        try {
            return function.apply();
        } catch (Throwable throwable) {
            throw new UnhandledException(throwable);
        }
    }

    public static void unhandled(UnhandledRunnable runnable) {
        try {
            runnable.run();
        } catch (Throwable throwable) {
            throw new UnhandledException(throwable);
        }
    }

    public static <T> T ignored(UnhandledFunction<T> function) {
        try {
            return function.apply();
        } catch (Throwable throwable) {
            log.error("ignored", new IgnoredException(throwable));
            return null;
        }
    }

    public static void ignored(UnhandledRunnable runnable) {
        try {
            runnable.run();
        } catch (Throwable throwable) {
            log.error("ignored", new IgnoredException(throwable));
        }
    }
}

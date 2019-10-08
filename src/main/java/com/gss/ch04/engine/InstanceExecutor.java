package com.gss.ch04.engine;

/**
 * The executor for source components. When the executor is started,
 * a new thread is created to call the getEvents() function of
 * the source component repeatedly.
 */
public abstract class InstanceExecutor implements IInstanceExecutor {
  private final Thread thread;

  public InstanceExecutor() {
    this.thread = new Thread() {
      public void run() {
        while (runOnce());
      }
    };
  }

  public void start() {
    thread.start();
  }

  /**
   * Run process once.
   * @return true if the thread should continue; false if the thread should exist.
   */
  abstract boolean runOnce();
}

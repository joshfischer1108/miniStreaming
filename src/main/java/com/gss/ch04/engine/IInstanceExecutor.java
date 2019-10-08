package com.gss.ch04.engine;

/**
 * This is the interface of all component executor.
 * Each component executor has an incoming event queue and an outgoing event queue.
 */
public interface IInstanceExecutor {
  /**
   * Start the executor.
   */
  void start();
}
